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
package io.kubernetes.client.e2e.util

import io.kubernetes.client.Discovery
import io.kubernetes.client.apimachinery.GroupVersionKind
import io.kubernetes.client.apimachinery.GroupVersionResource
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition
import io.kubernetes.client.openapi.models.V1Deployment
import io.kubernetes.client.openapi.models.V1Pod
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.ModelMapper
import spock.lang.Specification

class ModelMapperTest extends Specification {

	def "api-discovery should work"() {
		given:
		def apiClient = ClientBuilder.defaultClient();
		def discovery = new Discovery(apiClient)
		ModelMapper.refresh(discovery);

		expect:
		new GroupVersionKind("", "v1", "Pod") == ModelMapper.getGroupVersionKindByClass(V1Pod.class)
		new GroupVersionResource("", "v1", "pods") == ModelMapper.getGroupVersionResourceByClass(V1Pod.class)
		ModelMapper.isNamespaced(V1Pod.class)

		new GroupVersionKind("apps", "v1", "Deployment") == ModelMapper.getGroupVersionKindByClass(V1Deployment.class)
		new GroupVersionResource("apps", "v1", "deployments") == ModelMapper.getGroupVersionResourceByClass(V1Deployment.class)
		ModelMapper.isNamespaced(V1Deployment.class)

		new GroupVersionKind("apiextensions.k8s.io", "v1", "CustomResourceDefinition") == ModelMapper.getGroupVersionKindByClass(V1CustomResourceDefinition.class)
		new GroupVersionResource("apiextensions.k8s.io", "v1", "customresourcedefinitions") == ModelMapper.getGroupVersionResourceByClass(V1CustomResourceDefinition.class)
		!ModelMapper.isNamespaced(V1CustomResourceDefinition.class)
	}
}
