# Guide to generate Java codes from CustomResourceDefinition

__TL;DR__: This document will be useful when you extend third-party resources into your kubernetes cluster e.g. 
[CustomResourceDefinition](https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/)
and try to program java to operate the extended APIs. The generation process requires your CRD to be defined with 
[structral-schema](https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#specifying-a-structural-schema).
Alternatively, you can manually write your models for CRDs by implementing [KubernetesObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesObject.java) 
and [KubernetesListObject](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/common/KubernetesListObject.java) interfaces.


### Steps

##### Download and checkout generator scripts

Download the scripts for code generation then checkout to the correct directory:

```
git clone https://github.com/kubernetes-client/gen
cd gen/openapi/
```

And also the code generation requires accessing docker service on the host:

```
docker ps
```

##### Fetch openapi spec from the cluster

Run the following command to fetch openapi spec from your existing cluster above 1.15+ version (with CRD already deployed):

```bash
kubectl get --raw="/openapi/v2" > /tmp/swagger # or any other file-path
```

Note that if you can't find a 1.15+ cluster anywhere, consider run one locally by [kind](https://github.com/bsycorp/kind) then
don't forget to deploy your CRDs into the local-run kubernetes cluster.


##### Generate Java model from the downloaded openapi spec

Run the following commands and there will be a java sources generated under `/tmp/java`. 

```
bash java-crd-cmd.sh -o /tmp/java  < /tmp/swagger 
```

By default, the package name of generated java classes will be `io.kubernetes.client`. If you want to override the package name, consider 
use `-p <package_name>` flag. Additionally, you can use `-l <length>` option to make the generator to trim the length of generated 
class name, the lower number generates shorter names. e.g. for a CRD named `crontabs.v1.example.io`, with `-l 1` the generated 
name will be `CronTab`, otherwise with `-l3` it will be `ExampleV1Crontab`. And also if you feel like only generating classes for a few CRDs
instead of the whole lump of downloaded openapi specs, please use `-n` to filter out your target CRDs. For all supported flags, use `-h` 
for help info as is shown in the following:

```
Usage: generate a java project using input openapi spec from stdin
 -n: the prefix of the target CRD's api group to generate.
 -p: the base package name of the generated java project. 
 -o: output directory of the generated java project. 
 -l: keep the n last segments for the generated class name. 
```

##### Best practice to manipulate Java models?

It's recommended to use [CustomObjectApi](https://github.com/kubernetes-client/java/blob/master/kubernetes/src/main/java/io/kubernetes/client/apis/CustomObjectsApi.java)
or [GenericKubernetesApi](https://github.com/kubernetes-client/java/blob/master/extended/src/main/java/io/kubernetes/client/extended/generic/GenericKubernetesApi.java) to read/write the extended resources from/to the cluster.

### Hand-on exercise


Now we make use of the example CRD provided by offical documents to generate a piece of java models:

1. Deploy CRD into the cluster

```bash
# Create the example CRD
kubectl create -f -
apiVersion: apiextensions.k8s.io/v1beta1
kind: CustomResourceDefinition
metadata:
  # name must match the spec fields below, and be in the form: <plural>.<group>
  name: crontabs.stable.example.com
spec:
  # group name to use for REST API: /apis/<group>/<version>
  group: stable.example.com
  # list of versions supported by this CustomResourceDefinition
  versions:
    - name: v1
      # Each version can be enabled/disabled by Served flag.
      served: true
      # One and only one version must be marked as the storage version.
      storage: true
  # either Namespaced or Cluster
  scope: Namespaced
  names:
    # plural name to be used in the URL: /apis/<group>/<version>/<plural>
    plural: crontabs
    # singular name to be used as an alias on the CLI and for display
    singular: crontab
    # kind is normally the CamelCased singular type. Your resource manifests use this.
    kind: CronTab
    # shortNames allow shorter string to match your resource on the CLI
    shortNames:
    - ct
  preserveUnknownFields: false
  validation:
    openAPIV3Schema:
      type: object
      properties:
        spec:
          type: object
          properties:
            cronSpec:
              type: string
            image:
              type: string
            replicas:
              type: integer
```

2. Fetch openapi spec from server and dump it to /tmp/swagger

```bash
kubectl get --raw="/openapi/v2" > /tmp/swagger
```

3. Generate models under `/tmp/java` directory

```bash
bash java-crd-cmd.sh -n com.example -p com.example -l 2 -o /tmp/java < /tmp/swagger
```

after generation you will see bunch of generated model sources under the `/tmp/java`: 

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

// alternatively use generic kubernetes api 
GenericKubernetesApi<V1CronTab, V1CronTabList> crontabClient =
    new GenericKubernetesApi<>(V1CronTab.class, V1CronTabList.class, "com.example.stable", "v1", "crontabs", apiClient);
KubernetesApiResponse<V1CronTab> createResponse = crontabClient.create(crontab);
```



 
