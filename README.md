# Kubernetes Java Client

[![Build Status](https://travis-ci.org/kubernetes-client/java.svg?branch=master)](https://travis-ci.org/kubernetes-client/java)
[![Client Capabilities](https://img.shields.io/badge/Kubernetes%20client-Bronze-blue.svg?style=plastic&colorB=cd7f32&colorA=306CE8)](https://github.com/kubernetes/community/blob/master/contributors/design-proposals/csi-new-client-library-procedure.md#client-capabilities)
[![Client Support Level](https://img.shields.io/badge/kubernetes%20client-alpha-green.svg?style=plastic&colorA=306CE8)](https://github.com/kubernetes/community/blob/master/contributors/design-proposals/csi-new-client-library-procedure.md#client-support-level)

Java client for the [kubernetes](http://kubernetes.io/) API.

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
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null);
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
import io.kubernetes.client.Watch;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.util.Config;

import java.io.IOException;

public class WatchExample {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();

        Watch<V1Namespace> watch = client.watch(
                api.listNamespaceCall(null, null, null, null, 5, Boolean.TRUE, null, null),
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

All APIs and Models' documentation can be found at the [Generated client's README file](kubernetes/README.md)

## Community, Support, Discussion

You can reach the maintainers of this project at [SIG API Machinery](https://github.com/kubernetes/community/tree/master/sig-api-machinery). If you have any problem with the package or any suggestions, please file an [issue](https://github.com/kubernetes-client/java/issues).

### Code of Conduct

Participation in the Kubernetes community is governed by the [CNCF Code of Conduct](https://github.com/cncf/foundation/blob/master/code-of-conduct.md).

# Development

## Update client

to update the client clone the `gen` repo and run this command at the root of the client repo:

```bash
${GEN_REPO_BASE}/openapi/java.sh kubernetes settings
```
