export CLASSPATH=".:`pwd`/lib/antlr-4.9-complete.jar:$CLASSPATH"
echo $CLASSPATH
antlr4='java org.antlr.v4.Tool'
prj='SyntaxSat'
pkg='syntaxSat'
$antlr4 -visitor -package $pkg.generated $prj.g4
rm src/$pkg/generated/*
mv *.java src/$pkg/generated
rm *.interp *.tokens 
