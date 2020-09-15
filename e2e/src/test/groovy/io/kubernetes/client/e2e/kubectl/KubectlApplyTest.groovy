package io.kubernetes.client.e2e.kubectl

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification

class KubectlApplyTest extends Specification {

    def "Kubectl apply namespace should work"() {
        given:
        def apiClient = ClientBuilder.defaultClient();
        apiClient.setDebugging(true)
        def appliedNamespace = Kubectl.apply(V1Namespace.class)
                .apiClient(apiClient)
                .resource(new V1Namespace()
                        .apiVersion("v1")
                        .kind("Namespace")
                        .metadata(new V1ObjectMeta().name("apply-foo")))
                .execute()
        expect:
        Kubectl.get(V1Namespace.class)
                .apiClient(apiClient)
                .name("apply-foo")
                .execute() != null
    }

}
