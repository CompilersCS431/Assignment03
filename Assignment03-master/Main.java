package Project3;

import Project3.lexer.*;
import Project3.node.*;
import Project3.Parser.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
			for(int i=0; i < args.length; i+=2){
		        try{
					StringBuilder sb = new StringBuilder();
		            // Create a lexer instance.
		            Lexer l = new Lexer(new PushbackReader
		                    (new InputStreamReader(new FileInputStream("expression.txt")), 1024));

		            Token t = l.next();
		            while (!t.getText().equals("")){
							String temp = t.getClass().getSimpleName();
							if(!temp.equals("TBlank") && !temp.equals("TEol")){
								sb.append("<"+temp+">");
							}
		
		                   	 t = l.next();
		            }

					//send sb to parser
					Parser parse = new Parser(sb.toString());
					parse.stmts();

		        }
		        catch(Exception e){ System.out.println(e.getMessage()); }
			}
    }
}
