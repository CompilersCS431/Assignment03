package Project3;

public class Parser {
	public static String token;
	public static int index;
	public static String[] sArray;
	public static String temp;

	public Parser(String s) {
		index = 0;
		temp = s.replaceAll("<", "");
		sArray = temp.split(">");
		token = sArray[index];
	}

	public void getToken() {
		index++;
		if(index >= sArray.length) {
			token = "EOF";
		}
		else {
			token = sArray[index];
		}
	}

	public void match(String matchMe) {
		if(matchMe.equals(token)) {
			getToken();
		}
		else {
			error();
		}
	}

	public void stmts() {
		stmt();
		while(!token.equals("EOF")) {
			match("TSemicolon");
			stmts();
		}

		System.out.println("Stmts");
	}

	public void stmt() {
		switch(token) {
			case("TId"): match("TAssignment"); expression(); break;
			case("TEcho"): match("TLparen"); explist(); match("TRparen"); break;
		}

		System.out.println("Stmt");
	}

	public void explist() {
		expression();
		while(!token.equals("TRparen")) {
			match("TComma");
			explist();
		}

		System.out.println("explist");
	}

	public void unary() {
		value(); 
		while(!token.equals("TAddsub") | !token.equals("TMuldivmod") | !token.equals("TComma")
				|!token.equals("TSemicolon") | 
				!token.equals("EOF")) {
			match("TUnaryop");
		}

		System.out.println("unary");
	}

	public void value() {
		switch(token) {
			case("TId"): getToken();break;
			case("TNumber"): getToken(); break;
		}

		System.out.println("value");
	}

	public void term() {
		unary();
		while(!token.equals("TAddsub") | !token.equals("TMuldivmod") | !token.equals("TComma")
				| !token.equals("TUnaryop") | !token.equals("TSemicolon") | 
				!token.equals("EOF")) {
			match("TMuldivmod");
			unary();
		}

		System.out.println("term");
	}

	public void expression() {
		term();
		while(!token.equals("TAddsub") | !token.equals("TMuldivmod") | !token.equals("TComma")
				| !token.equals("TUnaryop") | !token.equals("TSemicolon") | 
				!token.equals("EOF")) {
			match("TAddsub");
			term();
		}

		System.out.println("expression");
	}

	public void error() {
		System.out.println("Unexpected token " + token);
	}
}
