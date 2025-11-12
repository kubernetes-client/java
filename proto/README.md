# Generating proto files

## Automated Generation

Protocol buffer files are automatically generated as part of the regular code generation workflow when a new Kubernetes release is published. This happens through the GitHub Actions workflow defined in `.github/workflows/generate.yml`.

To trigger proto generation manually along with OpenAPI generation:

1. Go to the [Generate workflow](https://github.com/kubernetes-client/java/actions/workflows/generate.yml) in GitHub Actions
2. Click "Run workflow"
3. Specify the Kubernetes branch (e.g., "release-1.30" or "master")
4. The workflow will automatically:
   - Generate OpenAPI client code
   - Generate protocol buffer classes
   - Apply any necessary patches
   - Generate fluent API
   - Create a pull request with all changes

## Manual Generation

For local development or testing, you can generate proto files manually using the provided script:

```sh
cd /path/to/kubernetes-client-java
KUBERNETES_BRANCH=master bash scripts/update-proto.sh
```

You can specify a different Kubernetes branch/tag:

```sh
KUBERNETES_BRANCH=release-1.30 bash scripts/update-proto.sh
```

## Using the kubernetes-client/gen Repository Directly

Alternatively, you can use the kubernetes-client/gen repository directly:

```sh
git clone https://github.com/kubernetes-client/gen
cd gen/proto
bash dependencies.sh master  # or specify a different branch
bash generate.sh java ${PATH_TO_JAVA_CLIENT_ROOT}/proto/src/main/java/
`````````````````````````````````
