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
Productions
            expression = 
            {term} term
            | {binopexp} expression addsub term
            | {unaryopexp} expression unaryop
            ;
            term = 
            {single} value
            | {multiple} term muldivmod value
            ;
            value = 
            {id} id
            | {number} number
            ;
            explist = 
            {multiple} expression comma explist
            | {single} expression
            ;
            stmt = 
            {assignval} id assignment expression
            | {printstmt} echo lparen explist rparen
            ;
            stmts = 
            {multiple} stmt semicolon stmts
            | {single} stmt
            ;