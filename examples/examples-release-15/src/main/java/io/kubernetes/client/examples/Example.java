package io.kubernetes.client.examples;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Config;
import org.apache.commons.collections.CollectionUtils;

import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.Example"
 *
 * <p>From inside $REPO_DIR/examples
 * <p> https://github.com/kubernetes-client/java/wiki/3.-Code-Examples
 * <p>list all pods
 */
public class Example {
    public static void main(String[] args) throws IOException, ApiException {
        ApiClient apiClient = Config.defaultClient();
        Configuration.setDefaultApiClient(apiClient);

        CoreV1Api coreV1Api = new CoreV1Api();
        V1PodList pods =
                coreV1Api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null, null);
        if (CollectionUtils.isNotEmpty(pods) && CollectionUtils.isNotEmpty(pods.getItems())) {
            pods.getItems().forEach((pod) -> System.out.println(pod.getMetadata().getName()));
        }
    }
}
