Package Project3;

Helpers
            digit = ['0'..'9'];
            letter = [['a' .. 'z'] + ['A' .. 'Z']];
            tab = 9 ;
            cr = 12 ;
            lf = 10;
            sp = ' ';
            period = '.' ;
            left = '<<' ;
            right = '>>' ;
            add = '+' ;
            sub = '-' ;
            mul = '*' ;
            div = '/' ;
            mod = '%' ;
            eol = cr lf | cr | lf;
Tokens
				echo = 'echo' ;
            lparen = '(' ;
            rparen = ')' ;
            assignment = '<--' ;
            comma = ',' ;
            semicolon = ';' ;
            id = letter+ ;
            number = digit+ ;
            
            unaryop = left
            | right
            ;
            addsub = add
            | sub
            ;
            muldivmod = mul
            | div
            | mod
            ;
            eol = eol;
            blank = sp+ | tab;
Ignored Tokens
            ;
