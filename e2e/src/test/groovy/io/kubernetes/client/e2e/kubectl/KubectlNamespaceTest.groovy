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
package io.kubernetes.client.e2e.kubectl

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class KubectlNamespaceTest extends Specification {

	def "Kubectl manipulating namespace should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient();

		when:
		def createdNamespace = Kubectl.create(V1Namespace.class)
				.apiClient(apiClient)
				.resource(new V1Namespace()
				.apiVersion("v1")
				.metadata(
				new V1ObjectMeta()
				.name("foo")))
				.execute()
		then:
		createdNamespace != null
		Kubectl.get(V1Namespace.class)
				.apiClient(apiClient)
				.name("foo")
				.execute() != null

		when:
		def appliedNamespace = Kubectl.apply(V1Namespace.class)
				.apiClient(apiClient)
				.resource(new V1Namespace()
				.apiVersion("v1")
				.kind("Namespace")
				.metadata(new V1ObjectMeta()
				.name("foo")
				.putAnnotationsItem("k", "v")))
				.execute()
		then:
		appliedNamespace != null
		Kubectl.get(V1Namespace.class)
				.apiClient(apiClient)
				.name("foo")
				.execute().metadata.getAnnotations().get("k") == "v"

		when:
		def replacedNamespace = Kubectl.replace(V1Namespace.class)
				.apiClient(apiClient)
				.resource(new V1Namespace()
				.apiVersion("v1")
				.kind("Namespace")
				.metadata(new V1ObjectMeta()
				.name("foo")
				.putAnnotationsItem("k", "v2")))
				.execute()
		then:
		replacedNamespace != null
		Kubectl.get(V1Namespace.class)
				.apiClient(apiClient)
				.name("foo")
				.execute().metadata.getAnnotations().get("k") == "v2"

		when:
		def deletedNamespace = Kubectl.delete(V1Namespace.class)
				.apiClient(apiClient)
				.name("foo")
				.execute()
		then:
		deletedNamespace != null
	}
}
