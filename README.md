# Kubernetes Java Client

[![Build Status](https://travis-ci.org/kubernetes-client/java.svg?branch=master)](https://travis-ci.org/kubernetes-client/java)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Silver-blue.svg?style=flat&colorB=C0C0C0&colorA=306CE8)](http://bit.ly/kubernetes-client-capabilities-badge)
[![Client Support Level](https://img.shields.io/badge/kubernetes%20client-beta-green.svg?style=flat&colorA=306CE8)](http://bit.ly/kubernetes-client-support-badge)

Java client for the [kubernetes](http://kubernetes.io/) API.

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
    <version>3.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

```groovy
compile 'io.kubernetes:client-java:3.0.0'
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

* target/client-java-api-4.0.0-beta1-SNAPSHOT.jar
* target/lib/*.jar

## Example

list all pods:

```java
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
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

watch on namespace object:

```java
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
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

|  client version  | 1.8              | 1.9         | 1.10       | 1.11       | 1.12        |   
|------------------|------------------|-------------|------------|------------|-------------|
|  1.0.0           |  ✓               |  -          |  -         |  -         | -           |
|  2.0.0           |  +               |  -          |  ✓         |  -         | -           |
|  3.0.0           |  +               |  +          |  +         |  ✓         | -           |
|  4.0.0-beta1     |  +               |  +          |  +         |  +         | ✓           |

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

The code is generated by the [swagger-codegen project](https://github.com/swagger-api/swagger-codegen).

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
