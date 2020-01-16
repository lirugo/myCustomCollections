#!/bin/bash

echo "Compiling"
echo "------------"

javac com/lirugo/Main.java -d target/classes/

java -cp target/classes com.lirugo.Main

echo "------------"
echo "Done"