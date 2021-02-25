/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.e2e.kubectl

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.models.NetworkingV1beta1Ingress
import io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule
import io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpec
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import okhttp3.Protocol
import spock.lang.Specification

class KubectlApiResourcesTest extends Specification {
	def "Kubectl apply v1beta1.networking.k8s.io/ingress should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().protocols(Arrays.asList(Protocol.HTTP_1_1)).build())
		Configuration.setDefaultApiClient(apiClient)
		when:
		def created = Kubectl.apply(NetworkingV1beta1Ingress.class)
				.apiClient(apiClient)
				.resource(new NetworkingV1beta1Ingress()
				.apiVersion("networking.k8s.io/v1beta1")
				.kind("Ingress")
				.metadata(new V1ObjectMeta().namespace("default").name("foo"))
				.spec(new NetworkingV1beta1IngressSpec()
				.addRulesItem(new NetworkingV1beta1IngressRule().host("test.canary.com")))
				)
				.execute()
		then:
		created != null
	}
}
