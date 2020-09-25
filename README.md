# Kubernetes Java Client

![build](https://github.com/kubernetes-client/java/workflows/build/badge.svg)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Silver-blue.svg?style=flat&colorB=C0C0C0&colorA=306CE8)](http://bit.ly/kubernetes-client-capabilities-badge)
[![Client Support Level](https://img.shields.io/badge/kubernetes%20client-beta-green.svg?style=flat&colorA=306CE8)](http://bit.ly/kubernetes-client-support-badge)
[![Maven Central](https://img.shields.io/maven-central/v/io.kubernetes/client-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.kubernetes%22%20AND%20a:%22client-java%22)

Java client for the [kubernetes](http://kubernetes.io/) API.

## Client versioning
The Java client uses Semantic Versioning. We increment the major version number whenever we
regenerate the client for a new Kubernetes release version (see table below). Whenever we do
this there are new APIs added and possibly breaking changes in the generated Kubernetes API
Stubs. Whenever you upgrade a major version, be prepared for potential breaking changes.

## Installation

To install the Java client library to your local Maven repository, simply execute:

```shell
git clone --recursive https://github.com/kubernetes-client/java
cd java
mvn install
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client-java</artifactId>
    <version>10.0.0</version>
</dependency>
```

### Gradle users

```groovy
compile 'io.kubernetes:client-java:10.0.0'
```

### Others

At first generate the JAR by executing:

```
git clone --recursive https://github.com/kubernetes-client/java
cd java/kubernetes
mvn package
```

Then manually install the following JARs:

* target/client-java-api-10.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Known Issues

##### 1. Exception on deleting resources: "java.lang.IllegalStateException: Expected a string but was BEGIN_OBJECT..."

This is happening because openapi schema from kubernetes upstream doesn't match its implementation due to 
the limitation of openapi v2 schema expression [#86](https://github.com/kubernetes-client/java/issues/86). 
Consider either catch and ignore the JsonSyntaxException or do the deletion in the following form:

- Use Kubectl equivalence, see examples [here](https://github.com/kubernetes-client/java/blob/6fa3525189d9e50d9b07016155642ddf59990905/e2e/src/test/groovy/io/kubernetes/client/e2e/kubectl/KubectlNamespaceTest.groovy#L69-L72)
- Use generic kubernetes api, see examples [here](https://github.com/kubernetes-client/java/blob/6fa3525189d9e50d9b07016155642ddf59990905/examples/src/main/java/io/kubernetes/client/examples/GenericClientExample.java#L56)

## Example

We prepared a few examples for common use-cases which are shown below:
- __Configuration__:
  - [InClusterClientExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/InClusterClientExample.java): 
  Configure a client while running inside the Kubernetes cluster.
  - [KubeConfigFileClientExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/KubeConfigFileClientExample.java): 
  Configure a client to access a Kubernetes cluster from outside.
- __Basics__:
  - [SimpleExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/Example.java):
  Simple minimum example of how to use the client.
  - [ProtoExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/ProtoExample.java): 
  Request/receive payloads in protobuf serialization protocol.
  - ([5.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-5.0.0)) [PatchExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/PatchExample.java): 
  Patch resource objects in various supported patch formats, equal to `kubectl patch`.
  - [FluentExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/FluentExample.java): 
  Construct arbitrary resource in a fluent builder style.
  - [YamlExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/YamlExample.java): 
  Suggested way to load or dump resource in Yaml.
- __Streaming__:
  - [WatchExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/WatchExample.java): 
  Subscribe watch events from certain resources, equal to `kubectl get <resource> -w`.
  - [LogsExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/LogsExample.java): 
  Fetch logs from running containers, equal to `kubectl logs`.
  - [ExecExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/ExecExample.java): 
  Establish an "exec" session with running containers, equal to `kubectl exec`.
  - [PortForwardExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/PortForwardExample.java): 
  Maps local port to a port on the pod, equal to `kubectl port-forward`.
  - [AttachExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/AttachExample.java): 
  Attach to a process that is already running inside an existing container, equal to `kubectl attach`.
  - [CopyExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/CopyExample.java): 
  Copy files and directories to and from containers, equal to `kubectl cp`.
  - [WebSocketsExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/WebSocketsExample.java): 
  Establish an arbitrary web-socket session to certain resources.
- __Advanced__: (NOTE: The following example requires `client-java-extended` module）
  - ([5.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-5.0.0)) [InformerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/InformerExample.java): 
  Build an informer which list-watches resources and reflects the notifications to a local cache.
  - ([5.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-5.0.0)) [PagerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/PagerExample.java): 
  Support Pagination (only for the list request) to ease server-side loads/network congestion.
  - ([6.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-6.0.0)) [ControllerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/ControllerExample.java): 
  Build a controller reconciling the state of world by list-watching one or multiple resources.
  - ([6.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-6.0.0)) [LeaderElectionExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/LeaderElectionExample.java): 
  Leader election utilities to help implement HA controllers.
  - ([9.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-9.0.0)) [SpringIntegrationControllerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/SpringControllerExample.java): 
  Building a kubernetes controller based on spring framework's bean injection.
  - ([9.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-9.0.0)) [GenericKubernetesClientExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/GenericClientExample.java): 
  Construct a generic client interface for any kubernetes types, including CRDs.


__list all pods__:

```java
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Config;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }
    }
}
```

__watch on namespace object__:

```java
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Watch;

import java.io.IOException;

public class WatchExample {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();

        Watch<V1Namespace> watch = Watch.createWatch(
                client,
                api.listNamespaceCall(null, null, null, null, null, 5, null, null, Boolean.TRUE, null, null),
                new TypeToken<Watch.Response<V1Namespace>>(){}.getType());

        for (Watch.Response<V1Namespace> item : watch) {
            System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
        }
    }
}
```

More examples can be found in [examples](examples) folder. To run examples, run this command:

```shell
mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.Example"
```
## Model Classes from Popular CRDs
The project also provides model classes generated from some frequently used open source projects as separate maven dependencies. Please refer to the following to see their respective documentation.
* [cert-manager](client-java-contrib/cert-manager)
* [prometheus operator](client-java-contrib/prometheus-operator)

## Documentation

All APIs and Models' documentation can be found at the [Generated client's docs](https://github.com/kubernetes-client/java/tree/master/kubernetes/docs)

## Compatibility

|  client version  | 1.13      | 1.14     | 1.15     |  1.16     |  1.17    |  1.18    |
|------------------|-----------|----------|----------|-----------|----------|----------|
|  5.0.0           |  ✓        |  -       |  -       | x         | x        | x        |
|  6.0.1           |  +        |  ✓       |  -       | -         | x        | x        |
|  7.0.0           |  +        |  +       |  ✓       | -         | -        | x        |
|  8.0.2           |  +        |  +       |  +       | ✓         | -        | -        |
|  9.0.2           |  +        |  +       |  +       | +         | ✓        | -        |
|  10.0.0          |  +        |  +       |  +       | +         | +        | ✓        |

Key: 

* `✓` Exactly the same features / API objects in both java-client and the Kubernetes
  version.
* `+` java-client has features or api objects that may not be present in the
  Kubernetes cluster, but everything they have in common will work.
* `-` The Kubernetes cluster has features the java-client library can't use
  (additional API objects, etc).
* `x` The Kubernetes cluster has no guarantees to support the API client of
  this version, as it only promises _n_-2 version support. It is not tested,
  and operations using API versions that have been deprecated and removed in
  later server versions won't function correctly.

See the [CHANGELOG](./CHANGELOG.md) for a detailed description of changes
between java-client versions.

## Contributing

Please see [CONTRIBUTING.md](CONTRIBUTING.md) for instructions on how to contribute.

### Code of Conduct

Participation in the Kubernetes community is governed by the [CNCF Code of Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

# Development

## Update the generated code.

The code is generated by the [openapi-generator project](https://github.com/OpenAPITools/openapi-generator).

We have built general purpose cross-language tools for generating code, it is hosted in the
[kubernetes-client/gen](https://github.com/kubernetes-client/gen) repository.

To get started, in a root directory that is _not_ your `java` client directory, for example your
directory layout could be:
```
${HOME}/
        src/
             gen/
             java/
...
```

Then to clone the `gen` repository, you would run:

```sh
cd ${HOME}/src
git clone https://github.com/kubernetes-client/gen
export GEN_ROOT=${PWD}
```

Then to update the client and run the formatter:

```sh
cd ${HOME}/src/java
${GEN_ROOT}/gen/openapi/java.sh kubernetes ./settings
./mvnw spotless:apply
```

This should run through a long-ish build process involving `docker` and eventually result in a new set of
generated code in the `kubernetes` directory.
