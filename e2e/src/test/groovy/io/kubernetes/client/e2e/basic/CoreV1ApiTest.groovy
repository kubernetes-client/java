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
package io.kubernetes.client.e2e.basic

import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.apis.CoreV1Api
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.openapi.models.V1Status
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class CoreV1ApiTest extends Specification {
	def "Create Namespace then Delete should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		def corev1api = new CoreV1Api(apiClient)
		Configuration.setDefaultApiClient(apiClient)
		def namespaceFoo = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-basic"))
		when:
		V1Namespace created = corev1api.createNamespace(namespaceFoo, null, null, null, null)
		then:
		created != null
		when:
		V1Status deleted = corev1api.deleteNamespace("e2e-basic", null, null, null, null, null, null)
		then:
		deleted != null
	}
}
