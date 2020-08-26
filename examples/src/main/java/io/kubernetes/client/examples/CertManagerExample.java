/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.examples;

import io.cert.manager.models.V1alpha2IssuerSpecSelfSigned;
import io.cert.manager.models.V1beta1Issuer;
import io.cert.manager.models.V1beta1IssuerList;
import io.cert.manager.models.V1beta1IssuerSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.io.IOException;

/**
 * This sample creates a self signed issuer "self-signed-issuer" in default namespace on a
 * Kubernetes cluster where cert-manager is installed
 */
public class CertManagerExample {
  public static void main(String[] args) throws IOException {
    GenericKubernetesApi<V1beta1Issuer, V1beta1IssuerList> issuerApi =
        new GenericKubernetesApi<>(
            V1beta1Issuer.class,
            V1beta1IssuerList.class,
            "cert-manager.io",
            "v1beta1",
            "issuers",
            ClientBuilder.defaultClient());
    issuerApi.create(
        new V1beta1Issuer()
            .metadata(new V1ObjectMeta().namespace("default").name("self-signed-issuer"))
            .kind("Issuer")
            .apiVersion("cert-manager.io/v1beta1")
            .spec(new V1beta1IssuerSpec().selfSigned(new V1alpha2IssuerSpecSelfSigned())));
  }
}
