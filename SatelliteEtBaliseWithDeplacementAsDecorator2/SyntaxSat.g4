// define a grammar called syntaxSat
grammar SyntaxSat;


@header {
// antlr exo3
}

commandes : commande*;

commande : instruction ;

instruction : ( assignement | methode );

declaration : 'new' objet'('parametres');';

methode : Variable'.start();' # start | Variable'.stop();' # stop;

parametres : (( parametre',')* parametre | );

parametre : ( Variable | valeur | declaration ); 

assignement : pG '=' pD ;  

pG :  Variable ;

pD : (Variable | declaration | valeur);

Variable :[a-zA-Z]+ ; 

objet : 'Satellite' # satellite | 'Balise' # balise ;

valeur :  Entier # valeurEntier | Chaine # valeurChaine ;

Entier : [0-9]+;

Chaine : '"' [a-zA-Z]* '"' ;

WS  : [ \t\r\n]+ -> skip ;