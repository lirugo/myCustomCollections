#!/bin/bash

echo "Compiling"
echo "------------"

javac com/lirugo/collections/Main.java -d target/classes/

java -cp target/classes com.lirugo.collections.Main

echo "------------"
echo "Done"