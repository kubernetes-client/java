package io.kubernetes.client.examples;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;

import java.io.IOException;

/**
 * A simple example of how to use the Java API
 * 
 * Requires kubectl proxy running
 * 
 * Easiest way to run this:
 *   mvn exec:java -Dex.mainClass="io.kubernetes.client.examples.Example"
 * 
 * From inside $REPO_DIR/kubernetes
 */
public class Example {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client;
        if (args.length == 0) {
            client = new ApiClient();
            client.setBasePath("http://localhost:8001");
        } else {
            client = Config.fromConfig(args[0]);
        }
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }
    }
}