#!/bin/bash

# TODO: Incorporate this into the pom.xml

rm -r ../fluent/src/main/java/io
mvn clean
mvn compile
mv target/generated-sources/annotations/io ../fluent/src/main/java/io
