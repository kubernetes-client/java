#!/bin/bash

# TODO: Incorporate this into the pom.xml

rm -r ../fluent/src/main/java/io
mvn -Pfluent-gen clean compile
mv target/generated-sources/annotations/io ../fluent/src/main/java/io

# Apply license headers to all generated files
cd ../fluent && mvn spotless:apply
