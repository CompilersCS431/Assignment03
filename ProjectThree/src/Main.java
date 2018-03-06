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
					BufferedWriter write = new BufferedWriter(new FileWriter(args[i+1]));
			
			String tempString = "package Project3; public class ProgExpr { private static Stmt program =";
			write.write(tempString);

            // Create a lexer instance.
            Lexer l = new Lexer(new PushbackReader
                    (new InputStreamReader(new FileInputStream(args[i])), 1024));

          Token t = l.next();
          while (!t.getText().equals("")){
						String temp = t.getClass().getSimpleName();
						if(!temp.equals("TBlank") && !temp.equals("TEol")){
							sb.append(temp+":"+t.getText() + " ");
						}
         	  t = l.next();
          }

					Parser parse = new Parser(sb.toString());
					write.write(parse.stmts().toString());

			tempString = ";public static void main(String[] args){ Interpreter interpreter = new Interpreter(); interpreter.interpret(program);}}";
			write.write(tempString);

				write.close();

		      }
		        catch(Exception e){ System.out.println(e.getMessage()); }
			}
    }
}
