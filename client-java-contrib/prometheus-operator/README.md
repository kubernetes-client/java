# Prometheus Operator Model Classes
This module contains the Java model classes generated from the release version of [prometheus operator](https://github.com/prometheus-operator/prometheus-operator) CRDs.

It makes it possible to CRUD custom resources defined by `prometheus operator` in a strong-typed manner in your Java application, such as create a prometheus instance, write a prometheus rule, etc.
## Usage
To use this library, include the following maven dependency
```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client-java-prometheus-operator-models</artifactId>
    <version>0.38.1-SNAPSHOT</version>
</dependency>
```
Please refer to the [PromOpExample](../../examples/src/main/java/io/kubernetes/client/examples/PromOpExample.java), which demonstrates how to create a minimal prometheus instance with the model class and Kubernetes Java client generic API.
## Compatibility
Artifact Version|Prometheus Operator Release Version|CRD Source
----------------|----------------------------|----------
0.38.1-SNAPSHOT|0.38.1|[Here](https://github.com/prometheus-operator/prometheus-operator/tree/master/example/prometheus-operator-crd)
## Code Generation
There is a utility script [update.sh](update.sh) to help with the code generation.

* The only prerequisites required is Docker installed on the host

Under the `prometheus-operator` directory, execute:
```shell script
./update.sh
```
It will generate the model classes from the CRDs hosted at the URL specified via the `-u` options in the [update.sh](update.sh) script. If newer version of CRDs becomes available, just update the `-u` options accordingly.