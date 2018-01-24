#!/bin/bash
#
# Author : fcbruce <fcbruce8964@gmail.com>
#
# Time : Wed 24 Jan 2018 22:33:33
#
#
JAR_PATH=lib
BIN_PATH=bin
SRC_PATH=src
RES_PATH=$SRC_PATH/main/resources/

find $SRC_PATH -name *.java > $SRC_PATH/sources.list

rm -rf $BIN_PATH
mkdir $BIN_PATH

javac -d $BIN_PATH @$SRC_PATH/sources.list

cp -r META-INF bin/
cp -r $RES_PATH bin/
cd bin/
jar cvfm this-is-a.jar META-INF/MANIFEST.MF *
mv this-is-a.jar ../
