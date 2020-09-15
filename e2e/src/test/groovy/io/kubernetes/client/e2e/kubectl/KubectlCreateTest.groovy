package io.kubernetes.client.e2e.kubectl

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class KubectlCreateTest extends Specification {

    def "Kubectl create namespace should work"() {
        given:
        def apiClient = ClientBuilder.defaultClient();
        def createdNamespace = Kubectl.create(V1Namespace.class)
                .apiClient(apiClient)
                .resource(new V1Namespace()
                        .apiVersion("v1")
                        .metadata(new V1ObjectMeta().name("create-foo")))
                .execute()
        expect:
        Kubectl.get(V1Namespace.class)
                .apiClient(apiClient)
                .name("create-foo")
                .execute() != null
    }

}
