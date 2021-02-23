package io.kubernetes.client.e2e.dynamic


import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi
import io.kubernetes.client.util.generic.dynamic.Dynamics
import spock.lang.Specification

class DynamicApiTest extends Specification {
    def "Create Namespace then Delete should work"() {
        given:
        def apiClient = ClientBuilder.defaultClient()
        def dynamicApi = new DynamicKubernetesApi("", "v1", "namespaces", apiClient)
        def namespaceFoo = new V1Namespace().metadata(new V1ObjectMeta().name("e2e-dynamic"))
        when:
        def createdNamespace = dynamicApi.create(Dynamics.newFromJson(apiClient.getJSON().serialize(namespaceFoo)))
        then:
        createdNamespace != null
        when:
        def deleted = dynamicApi.delete("e2e-dynamic").throwsApiException().getObject()
        then:
        deleted != null
    }
}
