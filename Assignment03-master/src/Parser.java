package Project3;

public class Parser {
	public static String[] token;
	public static int index;
	public static String[] sArray;

	public Parser(String s) {
		index = 0;
		sArray = s.split(" ");
		token = sArray[index].split(":");
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

	public void stmts() {
    //System.out.println("Stmts");
		System.out.print("new Stmts(");
		stmt();

		while(!token[0].equals("EOF")) {
			match("TSemicolon");
			System.out.print(",");
			stmts();
		}
		System.out.print(")");
	}

	public void stmt() {
    //System.out.println("Stmt");
	
		switch(token[0]) {
			case("TId"): 
				System.out.print("new AssignStmt(\"" + token[1] +"\","); 
				match("TId"); 
				match("TAssignment"); 
				expression(); 
				System.out.print(")");
				break;
			case("TEcho"): 
				System.out.print("new PrintStmt(" );				
				match("TEcho"); 
				match("TLparen"); 
				explist(); 
				System.out.print(")");
				match("TRparen"); 
				break;
      		default: error();
		}
	}

	public void explist() {
   // System.out.println("explist");
		System.out.print("new LongExpList(" ); 
		expression();
		while(!token[0].equals("TRparen")) {
			System.out.print(",");
			match("TComma");
			explist();
		}
		System.out.print(")");
	}

	public StringBuilder unary() {
		StringBuilder temp = new StringBuilder();
		//System.out.println("unary");
		//System.out.print("new UnaryExp(");
		temp.append(value());
		//System.out.println("In Unary, Value processing Done.") ;
		while(!token[0].equals("TAddsub") && !token[0].equals("TMuldivmod") 
				&& !token[0].equals("TComma")
				&&!token[0].equals("TSemicolon") &&!token[0].equals("TRparen")  && 
				!token[0].equals("EOF")) {
			//System.out.print(token[1]);
			temp.append(", \""+ token[1] + "\")");
			match("TUnaryop");
			temp.insert(0, "new UnaryOpExp(");		
		}
		//System.out.print(temp.toString());
		return temp;

		
	}

	public StringBuilder value() {
 //   System.out.println("value");
  //  System.out.println("TOKEN: " + token[0]);

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
//		System.out.println("term");
		StringBuilder temp = new StringBuilder();
		temp.append(unary());;
		while(!token[0].equals("TAddsub") && !token[0].equals("TComma")
				&& !token[0].equals("TUnaryop") && !token[0].equals("TSemicolon") &&
				!token[0].equals("EOF") &&!token[0].equals("TRparen")) {
			//System.out.print(",\"" + token[1] + "\","); 
			temp.append(",\"" + token[1] + "\",");
			match("TMuldivmod");
			temp.append(unary());
			temp.insert(0, "new BinaryOp(");
			temp.append(")");
		}

		return temp;
		
	}

	public void expression() {
		//System.out.print("new BinaryOpExp(" );
		StringBuilder temp = new StringBuilder();
		temp.append(term());
		//term();
		while( !token[0].equals("TMuldivmod") && !token[0].equals("TComma")
				&& !token[0].equals("TUnaryop") && !token[0].equals("TSemicolon") &&
				!token[0].equals("EOF")&&!token[0].equals("TRparen")) {
			//System.out.print(",\"" + token[1] + "\","); 
			temp.append(",\"" + token[1] + "\",");
			match("TAddsub");
			temp.append(term());
			temp.insert(0, "new BinaryOp(");
			temp.append(")");
		}
		//System.out.print(")");
			System.out.print(temp.toString());
	//	System.out.println("expression");
	}

	public void error() {
		System.out.println("Unexpected token " + token[0]);
    	System.exit(0);
	}
}
