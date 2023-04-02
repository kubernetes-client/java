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
import io.kubernetes.client.extended.kubectl.exception.KubectlException
import io.kubernetes.client.openapi.ApiException
import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.models.V1Container
import io.kubernetes.client.openapi.models.V1Node
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.openapi.models.V1Pod
import io.kubernetes.client.openapi.models.V1PodSpec
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class KubectlDrainTest extends Specification {
	def "Kubectl drain should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		Configuration.setDefaultApiClient(apiClient)
		def testNode = new V1Node()
				.metadata(new V1ObjectMeta().name("foo"))
		def testPod = new V1Pod()
				.metadata(new V1ObjectMeta()
				.namespace("default")
				.name("bar"))
				.spec(new V1PodSpec()
				.nodeName("foo")
				.containers(Arrays.asList(
				new V1Container().name("c1").image("nginx")
				)))
		when:
		V1Node createdNode = Kubectl.create(V1Node.class).resource(testNode).execute()
		V1Pod createdPod = Kubectl.create(V1Pod.class).resource(testPod).execute()
		then:
		createdNode != null
		createdPod != null
		when:
		V1Node drainedNode = Kubectl.drain().gracePeriod(0).name("foo").execute()
		then:
		drainedNode != null
		when:
		Kubectl.get(V1Pod.class).namespace("default").name("bar").execute()
		then:
		def e = thrown KubectlException
		e.getCause().class == ApiException.class
		cleanup:
		Kubectl.delete(V1Node.class).name("foo").execute()
	}
}
