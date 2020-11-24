package io.kubernetes.client.e2e.csr

import io.kubernetes.client.openapi.ApiClient
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest
import io.kubernetes.client.util.CSRUtils
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.version.Version
import spock.lang.Specification
import spock.util.concurrent.PollingConditions

import java.security.KeyPairGenerator
import java.security.SecureRandom

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
