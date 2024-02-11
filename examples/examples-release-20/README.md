# Running examples

```sh
export REPO_ROOT=/path/to/client-java/repo

cd ${REPO_ROOT}/
mvn install

cd ${REPO_ROOT}/examples/examples-15
mvn compile
mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.Example"
```

