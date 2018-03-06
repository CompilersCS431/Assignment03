package Project3;

public class Parser {
	public static String[] token;
	public static int index;
	public static String[] sArray;
	public static StringBuilder output;

	public Parser(String s) {
		index = 0;
		sArray = s.split(" ");
		token = sArray[index].split(":");
		output = new StringBuilder();
	}

	public void getToken() {
		index++;
		if(index >= sArray.length) {
			token[0] = "EOF";
		}
		else {
			token = sArray[index].split(":");
		}
	}

	public void match(String matchMe) {
		if(matchMe.equals(token[0])) {
			//System.out.println(matchMe + " Matched " + token[0]) ;
			getToken();
		}
		else {
			error();
		}
	}

	public StringBuilder stmts() {
    //System.out.println("Stmts");
		output.append("new Stmts(");
		stmt();

		while(!token[0].equals("EOF")) {
			match("TSemicolon");
			output.append(",");
			stmts();
		}
		output.append(")");

		return output;
	}

	public void stmt() {
    //System.out.println("Stmt");
	
		switch(token[0]) {
			case("TId"): 
				output.append("new AssignStmt(\"" + token[1] +"\","); 
				match("TId"); 
				match("TAssignment"); 
				expression(); 
				output.append(")");
				break;
			case("TEcho"): 
				output.append("new PrintStmt(" );				
				match("TEcho"); 
				match("TLparen"); 
				explist(); 
				output.append(")");
				match("TRparen"); 
				break;
      		default: error();
		}
	}

	public void explist() {
		output.append("new LongExpList(" ); 
		expression();
		while(!token[0].equals("TRparen")) {
			output.append(",");
			match("TComma");
			explist();
		}
		output.append(")");
	}

	public StringBuilder unary() {
		StringBuilder temp = new StringBuilder();
		temp.append(value());
		while(!token[0].equals("TAddsub") && !token[0].equals("TMuldivmod") 
				&& !token[0].equals("TComma")
				&&!token[0].equals("TSemicolon") &&!token[0].equals("TRparen")  && 
				!token[0].equals("EOF")) {
			temp.append(", \""+ token[1] + "\")");
			match("TUnaryop");
			temp.insert(0, "new UnaryOpExp(");		
		}
		return temp;

		
	}

	public StringBuilder value() {
		StringBuilder sb = new StringBuilder();

		switch(token[0]) {
			case("TId"): 
				//System.out.print("new IdExp(\"" + token[1] + "\")"); 
				sb.append("new IdExp(\"" + token[1] + "\")");
				match("TId"); 
				break;
			case("TNumber"): 
				//System.out.print("new NumExp(" + token[1] + ")"); 
				sb.append("new NumExp(" + token[1] + ")");
				match("TNumber"); 
				break;
      		default: error();
		}

		return sb;
	}

	public StringBuilder term() {
		StringBuilder temp = new StringBuilder();
		temp.append(unary());;
		while(!token[0].equals("TAddsub") && !token[0].equals("TComma")
				&& !token[0].equals("TUnaryop") && !token[0].equals("TSemicolon") &&
				!token[0].equals("EOF") &&!token[0].equals("TRparen")) {
			//System.out.print(",\"" + token[1] + "\","); 
			temp.append(",\"" + token[1] + "\",");
			match("TMuldivmod");
			temp.append(unary());
			temp.insert(0, "new BinaryOpExp(");
			temp.append(")");
		}

		return temp;
		
	}

	public void expression() {
		StringBuilder temp = new StringBuilder();
		temp.append(term());
		while( !token[0].equals("TMuldivmod") && !token[0].equals("TComma")
				&& !token[0].equals("TUnaryop") && !token[0].equals("TSemicolon") &&
				!token[0].equals("EOF")&&!token[0].equals("TRparen")) {
			//System.out.print(",\"" + token[1] + "\","); 
			temp.append(",\"" + token[1] + "\",");
			match("TAddsub");
			temp.append(term());
			temp.insert(0, "new BinaryOpExp(");
			temp.append(")");
		}
			output.append(temp.toString());
	}

	public void error() {
		System.out.println("Unexpected token " + token[0]);
    	System.exit(0);
	}
}
