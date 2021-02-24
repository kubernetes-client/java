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
package io.kubernetes.client.e2e.informer

import io.kubernetes.client.informer.SharedInformerFactory
import io.kubernetes.client.informer.cache.Lister
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1NamespaceList
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.generic.GenericKubernetesApi
import spock.lang.Specification
import spock.util.concurrent.PollingConditions

class NamespaceInformerTest extends Specification {

	def "list-watching namespaces should work"() {
		given:
		def conditions = new PollingConditions()
		def apiClient = ClientBuilder.defaultClient()
		def api = new GenericKubernetesApi(
				V1Namespace.class,
				V1NamespaceList.class,
				"",
				"v1",
				"namespaces",
				apiClient)
		def informerFactory = new SharedInformerFactory()
		def nsInformer = informerFactory.sharedIndexInformerFor(
				api,
				V1Namespace.class,
				0)
		def nsLister = new Lister(nsInformer.getIndexer())
		when:
		informerFactory.startAllRegisteredInformers()
		then:
		conditions.eventually {
			nsInformer.hasSynced()
			nsLister.list().size() > 0
		}
	}
}
