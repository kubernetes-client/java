# Guide to generate Java codes from CustomResourceDefinition

__TL;DR__: This document shows you how to generate java class models from your CRD YAML manifests.
Alternatively, without this automatic code-generation process, you can always manually write your 
models for CRDs by implementing [KubernetesObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesObject.java) 
and [KubernetesListObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesListObject.java) interfaces.

### Setup Environment

__Note__: You can skip this section by replacing image prefix `docker.pkg.github.com/kubernetes-client/java/..`
to `ghcr.io/yue9944882/..` which is a mirror repository allows anonymous access. `docker.pkg.github.com/kubernetes-client/java/..`
will require docker-login due to `kubernetes-client` permission limit.

1. Make there's an active docker daemon service working on your host, run `docker ps` to check it if
it's correctly setup.

2. Generating your access token in [https://github.com/settings/tokens](https://github.com/settings/tokens) 
and grants it package-read privilege. And save your token into a local file `~/TOKEN.txt`.

3. Login to github docker registry by running:

```bash
# TODO: replace USERNAME w/ your github alias
cat ~/TOKEN.txt | docker login https://docker.pkg.github.com -u USERNAME --password-stdin 
```

### Code-generator Image

##### Usage

Basically the code-generator container works by automatically provisioning a kubernetes cluster on
your local docker daemon and applies your CRDs onto the cluster. After verifying all the CRDs are
correctly installed, we will download the OpenAPI schemas and generate a minimal java project which 
contains the generated class models for your CRDs.

To make code-generator container work, you're required to mount both the `docker.sock` and corresponding 
host path to the container so that it can connect to the docker service and save the generated project
to your host path. There're also a few configuration items to adjust the code-generation behavior: 

```bash
-u: <CRD's download URL or file path, use it multiple times to read multiple CRDs>
-n: <the target CRD group name, which is in the reverse order of ".spec.group">
-p: <output package name for the generated java classes>
-o: <output path of the generated project>
```

##### Example Commands For remote CRD manifests

Run the following commands and it will download and generate the java models for you. Note that 
a docker daemon service is required on the host.

```bash
mkdir -p /tmp/java && cd /tmp/java
docker run \
  --rm \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  docker.pkg.github.com/kubernetes-client/java/crd-model-gen:v1.0.3 \
  /generate.sh \
  -u https://gist.githubusercontent.com/yue9944882/266fee8e95c2f15a93778263633e72ed/raw/be12c13379eeed13d2532cb65da61fffb19ee3e7/crontab-crd.yaml \
  -n com.example.stable \
  -p com.example.stable \
  -o "$(pwd)"
```


##### Example Commands For local CRD manifests

First of all, make sure the CRD manifest present on your local host paths. In the following example, 
we're manually downloading the manifests to directory `/tmp/crds/`. And similar to code-generation 
from the remote manifests, we need to mount the crd file/directory into the code-generation container 
to make it work.

```bash
# Downloading 
mkdir -p /tmp/crds && cd /tmp/crds
wget https://gist.githubusercontent.com/yue9944882/266fee8e95c2f15a93778263633e72ed/raw/be12c13379eeed13d2532cb65da61fffb19ee3e7/crontab-crd.yaml

# Local generation
LOCAL_MANIFEST_FILE=/tmp/crds/crontab-crd.yaml
mkdir -p /tmp/java && cd /tmp/java
docker run \
  --rm \
  -v "$LOCAL_MANIFEST_FILE":"$LOCAL_MANIFEST_FILE" \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  docker.pkg.github.com/kubernetes-client/java/crd-model-gen:v1.0.3 \
  /generate.sh \
  -u $LOCAL_MANIFEST_FILE \
  -n com.example.stable \
  -p com.example.stable \
  -o "$(pwd)"
```


### Manipulate the generated models

After generation you will see bunch of generated model sources under the `/tmp/java`: 

```bash
ls -R /tmp/java/ | grep V1CronTab
V1CronTab.java
V1CronTabList.java
V1CronTabSpec.java
```

you're now free to request the models from master apiserver now:

```java
// request extended models
V1CronTab crontab = new V1CronTab();
CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
customObjectsApi.createNamespacedCustomObject(
        "com.example.stable",
        "v1",
        namespace,
        "crontabs",
        crontab,
        "true"
);

// alternatively use generic kubernetes api, the generic api is aimed to address the drawbacks
// from the CustomObjectsApi.
GenericKubernetesApi<V1CronTab, V1CronTabList> crontabClient =
    new GenericKubernetesApi<>(V1CronTab.class, V1CronTabList.class, "com.example.stable", "v1", "crontabs", apiClient)
        .create(crontab)
        .throwsApiException();
```



 
