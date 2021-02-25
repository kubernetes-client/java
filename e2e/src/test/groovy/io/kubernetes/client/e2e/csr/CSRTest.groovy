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
package io.kubernetes.client.e2e.csr

import java.security.KeyPairGenerator
import java.security.SecureRandom

import io.kubernetes.client.openapi.ApiClient
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest
import io.kubernetes.client.util.CSRUtils
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.version.Version
import spock.lang.Specification
import spock.util.concurrent.PollingConditions

class CSRTest extends Specification {
	def "Build client instance via CSR should work"() {
		// initialize test environment
		given:
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA")
		keyGen.initialize(2048, new SecureRandom())
		ApiClient bootstrapApiClient = ClientBuilder.defaultClient()

		// generating key-pair
		when:
		def keyPair = keyGen.generateKeyPair()
		then:
		keyPair != null

		// sign new CSR
		when:
		def csrBytes = CSRUtils.sign(keyPair, "foo")
		then:
		csrBytes != null

		// creates CSR object against cluster
		when:
		def newCsr = CSRUtils.newV1CertificateSigningRequest("foo", csrBytes)
		def created = CSRUtils.createIfAbsent(bootstrapApiClient, newCsr)
		then:
		created

		// reload certificates from CSR
		when:
		CSRUtils.approve(bootstrapApiClient, "foo")
		def signedApiClient = ClientBuilder.fromCertificateSigningRequest(bootstrapApiClient, keyPair.getPrivate(), newCsr)
		then:
		signedApiClient != null

		// use the new client to get "/version"
		when:
		def v = new Version(signedApiClient).getVersion()
		then:
		v != null
	}
}
