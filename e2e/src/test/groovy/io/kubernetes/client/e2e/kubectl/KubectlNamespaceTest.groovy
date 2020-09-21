package io.kubernetes.client.e2e.kubectl

import io.kubernetes.client.extended.kubectl.Kubectl
import io.kubernetes.client.extended.kubectl.exception.KubectlException
import io.kubernetes.client.openapi.ApiException
import io.kubernetes.client.openapi.models.V1Namespace
import io.kubernetes.client.openapi.models.V1ObjectMeta
import io.kubernetes.client.util.ClientBuilder
import spock.lang.Specification
import spock.util.concurrent.PollingConditions

class KubectlNamespaceTest extends Specification {

    def "Kubectl manipulating namespace should work"() {
        given:
        def apiClient = ClientBuilder.defaultClient();

        when:
        def createdNamespace = Kubectl.create(V1Namespace.class)
                .apiClient(apiClient)
                .resource(new V1Namespace()
                        .apiVersion("v1")
                        .metadata(
                                new V1ObjectMeta()
                                        .name("foo")))
                .execute()
        then:
        createdNamespace != null
        Kubectl.get(V1Namespace.class)
                .apiClient(apiClient)
                .name("foo")
                .execute() != null

        when:
        def appliedNamespace = Kubectl.apply(V1Namespace.class)
                .apiClient(apiClient)
                .resource(new V1Namespace()
                        .apiVersion("v1")
                        .kind("Namespace")
                        .metadata(new V1ObjectMeta()
                                .name("foo")
                                .putAnnotationsItem("k", "v")))
                .execute()
        then:
        appliedNamespace != null
        Kubectl.get(V1Namespace.class)
                .apiClient(apiClient)
                .name("foo")
                .execute().metadata.getAnnotations().get("k") == "v"

        when:
        def replacedNamespace = Kubectl.replace(V1Namespace.class)
                .apiClient(apiClient)
                .resource(new V1Namespace()
                        .apiVersion("v1")
                        .kind("Namespace")
                        .metadata(new V1ObjectMeta()
                                .name("foo")
                                .putAnnotationsItem("k", "v2")))
                .execute()
        then:
        replacedNamespace != null
        Kubectl.get(V1Namespace.class)
                .apiClient(apiClient)
                .name("foo")
                .execute().metadata.getAnnotations().get("k") == "v2"

        when:
        def deletedNamespace = Kubectl.delete(V1Namespace.class)
                .apiClient(apiClient)
                .name("foo")
                .execute()
        then:
        deletedNamespace != null

    }

}
