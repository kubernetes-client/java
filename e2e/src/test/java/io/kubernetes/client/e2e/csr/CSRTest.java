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
package io.kubernetes.client.e2e.csr;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CertificatesV1Api;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.VersionInfo;
import io.kubernetes.client.util.CSRUtils;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.version.Version;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class CSRTest {

	@Test
	void buildClientWithCSR() throws Exception {
		// initialize test environment
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048, new SecureRandom());
		ApiClient apiClient = ClientBuilder.defaultClient();

		// generate key-pair
		KeyPair keyPair = keyGen.generateKeyPair();
		assertThat(keyPair).isNotNull();

		// sign new CSR
		byte[] csrBytes = CSRUtils.sign(keyPair, "foo");
		assertThat(csrBytes).isNotNull();

		// create CSR object for a cluster
		V1CertificateSigningRequest newCsr = CSRUtils.newV1CertificateSigningRequest("foo", csrBytes);
		boolean created = CSRUtils.createIfAbsent(apiClient, newCsr);
		assertThat(created).isTrue();

		// reload certificate from CSR
		CSRUtils.approve(apiClient, "foo");
		ApiClient signedApiClient = ClientBuilder.fromCertificateSigningRequest(apiClient, keyPair.getPrivate(), newCsr);
		assertThat(signedApiClient).isNotNull();

		// use the new client to get "/version"
		VersionInfo v = new Version(signedApiClient).getVersion();
		assertThat(v).isNotNull();

		// clean up
		CertificatesV1Api c = new CertificatesV1Api(apiClient);
    V1Status deleted = c.deleteCertificateSigningRequest("foo").execute();
		assertThat(deleted).isNotNull();
	}
}
