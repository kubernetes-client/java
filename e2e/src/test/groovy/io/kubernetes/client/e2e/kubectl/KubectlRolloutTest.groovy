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

import java.nio.charset.StandardCharsets
import java.time.Duration

import org.awaitility.Awaitility

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.openapi.Configuration
import io.kubernetes.client.openapi.models.V1DaemonSet
import io.kubernetes.client.openapi.models.V1Deployment
import io.kubernetes.client.openapi.models.V1StatefulSet
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.Streams
import io.kubernetes.client.util.Yaml
import spock.lang.Specification

class KubectlRolloutTest extends Specification {

	def "Kubectl rollout daemonset should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		Configuration.setDefaultApiClient(apiClient)
		// initial daemonset has only one container
		def daemonSet = Yaml.load(getResourceFileAsString("test-daemonset.yaml"))
		// updating daemonset has two containers
		def updatingDaemonSet = Yaml.load(getResourceFileAsString("test-daemonset-updated.yaml"))

		when:
		def createdDaemonSet = Kubectl.create(V1DaemonSet.class)
				.resource(daemonSet)
				.execute()
		then:
		createdDaemonSet != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1DaemonSet.class)
					.history()
					.namespace(daemonSet.metadata.namespace)
					.name(daemonSet.metadata.name)
					.execute()
					.size() == 1
				}

		when:
		def updatedDaemonSet = Kubectl.replace(V1DaemonSet.class)
				.resource(updatingDaemonSet)
				.execute()
		then:
		updatedDaemonSet != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1DaemonSet.class)
					.history()
					.namespace(daemonSet.metadata.namespace)
					.name(daemonSet.metadata.name)
					.execute()
					.size() == 2
				}
		Kubectl.rollout(V1DaemonSet.class)
				.history()
				.revision(2)
				.namespace(daemonSet.metadata.namespace)
				.name(daemonSet.metadata.name)
				.execute()
				.spec.containers.size() == 2

		cleanup:
		Kubectl.delete(V1DaemonSet.class)
				.namespace(daemonSet.metadata.namespace)
				.name(daemonSet.metadata.name)
				.execute()
	}


	def "Kubectl rollout deployment should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		Configuration.setDefaultApiClient(apiClient)
		// initial deployment has only one container
		def deployment = Yaml.load(getResourceFileAsString("test-deployment.yaml"))
		// updating deployment has two containers
		def updatingDeployment = Yaml.load(getResourceFileAsString("test-deployment-updated.yaml"))

		when:
		def createdDeployment = Kubectl.create(V1Deployment.class)
				.resource(deployment)
				.execute()
		then:
		createdDeployment != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1Deployment.class)
					.history()
					.namespace(deployment.metadata.namespace)
					.name(deployment.metadata.name)
					.execute()
					.size() == 1
				}

		when:
		def updatedDaemonSet = Kubectl.replace(V1Deployment.class)
				.resource(updatingDeployment)
				.execute()
		then:
		updatedDaemonSet != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1Deployment.class)
					.history()
					.namespace(deployment.metadata.namespace)
					.name(deployment.metadata.name)
					.execute()
					.size() == 2
				}
		Kubectl.rollout(V1Deployment.class)
				.history()
				.revision(2)
				.namespace(deployment.metadata.namespace)
				.name(deployment.metadata.name)
				.execute()
				.spec.containers.size() == 2

		cleanup:
		Kubectl.delete(V1Deployment.class)
				.namespace(deployment.metadata.namespace)
				.name(deployment.metadata.name)
				.execute()
	}


	def "Kubectl rollout statefulset should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient()
		Configuration.setDefaultApiClient(apiClient)
		// initial deployment has only one container
		def statefulset = Yaml.load(getResourceFileAsString("test-statefulset.yaml"))
		// updating deployment has two containers
		def updatingStatefulSet = Yaml.load(getResourceFileAsString("test-statefulset-updated.yaml"))

		when:
		def createdStatefulSet = Kubectl.create(V1StatefulSet.class)
				.resource(statefulset)
				.execute()
		then:
		createdStatefulSet != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1StatefulSet.class)
					.history()
					.namespace(statefulset.metadata.namespace)
					.name(statefulset.metadata.name)
					.execute()
					.size() == 1
				}

		when:
		def updatedDaemonSet = Kubectl.replace(V1StatefulSet.class)
				.resource(updatingStatefulSet)
				.execute()
		then:
		updatedDaemonSet != null
		Awaitility.await()
				.pollInterval(Duration.ofSeconds(1))
				.atMost(Duration.ofSeconds(3))
				.until{
					-> Kubectl.rollout(V1StatefulSet.class)
					.history()
					.namespace(statefulset.metadata.namespace)
					.name(statefulset.metadata.name)
					.execute()
					.size() == 2
				}
		Kubectl.rollout(V1StatefulSet.class)
				.history()
				.revision(2)
				.namespace(statefulset.metadata.namespace)
				.name(statefulset.metadata.name)
				.execute()
				.spec.containers.size() == 2

		cleanup:
		Kubectl.delete(V1StatefulSet.class)
				.namespace(statefulset.metadata.namespace)
				.name(statefulset.metadata.name)
				.execute()
	}


	private String getResourceFileAsString(String filename) {
		def url = this.getClass().getClassLoader().getResource(filename)
		return Streams.toString(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
	}
}
