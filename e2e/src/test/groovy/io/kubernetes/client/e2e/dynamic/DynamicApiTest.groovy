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
package io.kubernetes.client.e2e.dynamic


import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi
import io.kubernetes.client.util.generic.dynamic.Dynamics
import spock.lang.Specification

class DynamicApiTest extends Specification {
	def "Create Namespace then Delete should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		def dynamicApi = new DynamicKubernetesApi("", "v1", "namespaces", apiClient)
		def namespaceFoo = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-dynamic"))
		when:
		def createdNamespace = dynamicApi.create(Dynamics.newFromJson(apiClient.getJSON().serialize(namespaceFoo)))
		then:
		createdNamespace != null
		when:
		def deleted = dynamicApi.delete("e2e-dynamic").throwsApiException().getObject()
		then:
		deleted != null
	}
}
