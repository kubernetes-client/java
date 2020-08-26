# Cert-Manager Model Classes
This module contains the Java model classes generated from the release version of [cert-manager](https://cert-manager.io) CRDs.

It makes it possible to CRUD custom resources defined by `cert-manager` in a strong-typed manner in your Java application, such as create an issuer, request a certificate, etc.
## Usage
To use this library, include the following maven dependency
```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client-java-cert-manager-models</artifactId>
    <version>0.16.1-SNAPSHOT</version>
</dependency>
```
Please refer to the [CertManagerExample](../../examples/src/main/java/io/kubernetes/client/examples/CertManagerExample.java), which demonstrates how to create a self signed issuer using the model class and Kubernetes Java client generic API.
## Compatibility
Artifact Version|Cert-Manager Release Version|CRD Source
----------------|----------------------------|----------
0.16.1-SNAPSHOT|0.16.1|[Here](https://github.com/jetstack/cert-manager/releases/download/v0.16.1/cert-manager.crds.yaml)
## Code Generation
There is a utility script [update.sh](update.sh) to help with the code generation.

* The only prerequisites required is Docker installed on the host

Under the `cert-manager` directory, execute:
```shell script
./update.sh
```
It will generate the model classes from the CRDs hosted at the URL specified via the `-u` option in the [update.sh](update.sh) script. If newer version of CRDs becomes available, just update the `-u` option accordingly.