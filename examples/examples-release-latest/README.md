# Running examples

```sh
export REPO_ROOT=/path/to/client-java/repo

cd ${REPO_ROOT}/
mvn install

cd ${REPO_ROOT}/examples/examples-15
mvn compile
mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.Example"
```

## Patching custom objects

Kubernetes PATCH requests require a patch-specific content type. Use `PatchUtils` rather than
calling a generated custom-object patch request's `execute()` method directly.

The
[`PatchCustomObjectExample`](src/main/java/io/kubernetes/client/examples/PatchCustomObjectExample.java)
shows how to patch a namespaced custom object with JSON Patch:

```sh
cat > /tmp/widget-patch.json <<'EOF'
[
  {"op": "replace", "path": "/spec/size", "value": 3}
]
EOF

mvn exec:java \
  -Dexec.mainClass="io.kubernetes.client.examples.PatchCustomObjectExample" \
  -Dexec.args="example.com v1 default widgets my-widget /tmp/widget-patch.json"
```
