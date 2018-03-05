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

Tokens
            lparen = '(' ;
            rparen = ')' ;
            assignment = '<--' ;
            comma = ',' ;
            semicolon = ';' ;
            id = letter+ ;
            number = digit+ ;
            echo = 'echo' ;
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
Ignored Tokens
            ;