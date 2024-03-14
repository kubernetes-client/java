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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.Test;

class CoreV1ApiTest {

	@Test
	void createAndDeleteNamespace() throws Exception {
		ApiClient client = ClientBuilder.defaultClient();
		CoreV1Api coreV1Api = new CoreV1Api(client);
		V1Namespace namespaceFoo = new V1Namespace()
						.metadata(new V1ObjectMeta().name("e2e-basic"))
						.spec(new V1NamespaceSpec());

		V1Namespace created = coreV1Api.createNamespace(namespaceFoo).execute();
		assertThat(created).isNotNull();

		V1Status deleted = coreV1Api.deleteNamespace("e2e-basic").execute();
		assertThat(deleted).isNotNull();
	}
}
