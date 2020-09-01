# Guide to generate Java codes from CustomResourceDefinition

__TL;DR__: This document shows you how to generate java class models from your CRD YAML manifests.
Alternatively, without this automatic code-generation process, you can always manually write your 
models for CRDs by implementing [KubernetesObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesObject.java) 
and [KubernetesListObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesListObject.java) interfaces.

### Example Commands For remote CRD manifests

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
  docker.pkg.github.com/kubernetes-client/java/crd-model-gen:v1.0.0 \
  /generate.sh \
  -u https://gist.githubusercontent.com/yue9944882/266fee8e95c2f15a93778263633e72ed/raw/be12c13379eeed13d2532cb65da61fffb19ee3e7/crontab-crd.yaml \
  -n com.example.stable \
  -p com.example.stable \
  -o "$(pwd)"
```


### Example Commands For local CRD manifests

First of all, you're required to download/place your CRD manifests into a single YAML file or under 
one directory. In the following example, we're manually downloading the manifests to directory 
`/tmp/crds/`. And similar to code-generation from the remote manifests, we need to mount the crd 
file/directory into the code-generation container to make it work.

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
  docker.pkg.github.com/kubernetes-client/java/crd-model-gen:v1.0.0 \
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
    new GenericKubernetesApi<>(V1CronTab.class, V1CronTabList.class, "com.example.stable", "v1", "crontabs", apiClient);
KubernetesApiResponse<V1CronTab> createResponse = crontabClient.create(crontab);
```



 
