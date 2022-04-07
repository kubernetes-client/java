#!/bin/bash

# TODO: Incorporate this into the pom.xml

rm -r ../fluent/src/main/java/io
mvn -Pfluent-gen clean compile
mv target/generated-sources/annotations/io ../fluent/src/main/java/io
