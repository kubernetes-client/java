/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.e2e.basic;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.ProtoClient;
import io.kubernetes.client.ProtoClient.ObjectOrStatus;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.proto.Meta.ObjectMeta;
import io.kubernetes.client.proto.V1.Namespace;
import io.kubernetes.client.proto.V1.NamespaceList;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.Test;

class ProtoClientTest {

	@Test
	void createListGetAndDeleteNamespace() throws Exception {
		ApiClient client = ClientBuilder.defaultClient();
		ProtoClient protoClient = new ProtoClient(client);

		// Create a namespace using protocol buffers
		Namespace namespace = Namespace.newBuilder()
				.setMetadata(ObjectMeta.newBuilder().setName("e2e-proto-test").build())
				.build();

		ObjectOrStatus<Namespace> createResult = protoClient.create(
				namespace,
				"/api/v1/namespaces",
				"v1",
				"Namespace");

		assertThat(createResult.object).isNotNull();
		assertThat(createResult.object.getMetadata().getName()).isEqualTo("e2e-proto-test");
		assertThat(createResult.status).isNull();

		// List namespaces using protocol buffers
		ObjectOrStatus<NamespaceList> listResult = protoClient.list(
				NamespaceList.newBuilder(),
				"/api/v1/namespaces");

		assertThat(listResult.object).isNotNull();
		assertThat(listResult.object.getItemsCount()).isGreaterThan(0);
		assertThat(listResult.status).isNull();

		// Verify our namespace is in the list
		boolean found = listResult.object.getItemsList().stream()
				.anyMatch(ns -> ns.getMetadata().getName().equals("e2e-proto-test"));
		assertThat(found).isTrue();

		// Get the specific namespace using protocol buffers
		ObjectOrStatus<Namespace> getResult = protoClient.get(
				Namespace.newBuilder(),
				"/api/v1/namespaces/e2e-proto-test");

		assertThat(getResult.object).isNotNull();
		assertThat(getResult.object.getMetadata().getName()).isEqualTo("e2e-proto-test");
		assertThat(getResult.status).isNull();

		// Delete the namespace using protocol buffers
		ObjectOrStatus<Namespace> deleteResult = protoClient.delete(
				Namespace.newBuilder(),
				"/api/v1/namespaces/e2e-proto-test");

		assertThat(deleteResult).isNotNull();
		// Either we get the namespace object back or a status
		assertThat(deleteResult.object != null || deleteResult.status != null).isTrue();
	}
}
