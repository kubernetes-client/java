package io.kubernetes.client.examples;

import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.Response;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.util.Config;


/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.CopyExample"
 *
 * <p>From inside $REPO_DIR/examples
 *
 * mock "kubectl get configamp configmap-name -o json"
 */

public class KubectlJsonExample {

    public static void main(String[] args) throws ApiException, IOException {

        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        com.squareup.okhttp.Call call = api.readNamespacedConfigMapCall("configmap-name","default",null,null,null,null,
                null);

        Response response = call.execute();

        if(!response.isSuccessful()) {
            return;
        }

        String body = response.body().string();

        JsonObject returnData = new JsonParser().parse(body).getAsJsonObject();

        System.out.println(returnData);
    }

}
