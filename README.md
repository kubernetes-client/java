# Kubernetes Java Client

[![Build Status](https://travis-ci.org/kubernetes-client/java.svg?branch=master)](https://travis-ci.org/kubernetes-client/java)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Silver-blue.svg?style=flat&colorB=C0C0C0&colorA=306CE8)](http://bit.ly/kubernetes-client-capabilities-badge)
[![Client Support Level](https://img.shields.io/badge/kubernetes%20client-beta-green.svg?style=flat&colorA=306CE8)](http://bit.ly/kubernetes-client-support-badge)

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
    <version>5.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

```groovy
compile 'io.kubernetes:client-java:5.0.0'
```

### Others

At first generate the JAR by executing:

```
git clone --recursive https://github.com/kubernetes-client/java
cd java
cd kubernetes
mvn package
```

Then manually install the following JARs:

* target/client-java-api-7.0.0-SNAPSHOT.jar
* target/lib/*.jar

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
- __Advanced__:
  - ([5.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-5.0.0)) [InformerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/InformerExample.java): 
  Build an informer which list-watches resources and reflects the notifications to a local cache.
  - ([5.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-5.0.0)) [PagerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/PagerExample.java): 
  Support Pagination (only for the list request) to ease server-side loads/network congestion.
  - ([6.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-6.0.0)) [ControllerExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/ControllerExample.java): 
  Build a controller reconciling the state of world by list-watching one or multiple resources.
  - ([6.0.0+](https://github.com/kubernetes-client/java/tree/client-java-parent-6.0.0)) [LeaderElectionExample](https://github.com/kubernetes-client/java/blob/master/examples/src/main/java/io/kubernetes/client/examples/LeaderElectionExample.java): 
  Leader election utilities to help implement HA controllers.


__list all pods__:

```
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

```
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

More examples can be found in [examples](examples/) folder. To run examples, run this command:

```shell
mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.Example"
```

## Documentation

All APIs and Models' documentation can be found at the [Generated client's docs](https://github.com/kubernetes-client/java/tree/master/kubernetes/docs)

## Compatibility

|  client version  | 1.11      | 1.12     | 1.13     |  1.14     |  1.15    |
|------------------|-----------|----------|----------|-----------|----------|
|  3.0.0           |  ✓        |  -       |  -       | -         | -        |
|  4.0.0           |  +        |  ✓       |  -       | -         | -        |
|  5.0.0           |  +        |  +       |  ✓       | -         | -        |
|  6.0.1           |  +        |  +       |  +       | ✓         | -        |
|  7.0.0           |  +        |  +       |  +       | +         | ✓        |

Key: 

* `✓` Exactly the same features / API objects in both java-client and the Kubernetes
  version.
* `+` java-client has features or api objects that may not be present in the
  Kubernetes cluster, but everything they have in common will work.
* `-` The Kubernetes cluster has features the java-client library can't use
  (additional API objects, etc).

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

Then to update the client:

```sh
cd ${HOME}/src/java
${GEN_ROOT}/gen/openapi/java.sh kubernetes ./settings
```

This should run through a long-ish build process involving `docker` and eventually result in a new set of
generated code in the `kubernetes` directory.
