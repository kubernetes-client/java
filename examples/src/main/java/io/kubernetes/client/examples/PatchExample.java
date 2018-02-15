/*
Copyright 2017 The Kubernetes Authors.
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
package io.kubernetes.client.examples;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.ExtensionsV1beta1Api;
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of deployment using Json Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>.
 *
 * <ul>
 *   <li>Creates deployment hello-node with <b>terminationGracePeriodSeconds</b> value as 30.
 *   <li>Patches deployment hello-node with <b>terminationGracePeriodSeconds</b> value as 27.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr =
      "{\"op\":\"replace\",\"path\":\"/spec/template/spec/terminationGracePeriodSeconds\",\"value\":27}";
  static String jsonDepStr =
      "{\"kind\":\"Deployment\",\"apiVersion\":\"extensions/v1beta1\",\"metadata\":{\"name\":\"hello-node\",\"creationTimestamp\":null,\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"replicas\":1,\"selector\":{\"matchLabels\":{\"run\":\"hello-node\"}},\"template\":{\"metadata\":{\"creationTimestamp\":null,\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"terminationGracePeriodSeconds\":30,\"containers\":[{\"name\":\"hello-node\",\"image\":\"hello-node:v1\",\"ports\":[{\"containerPort\":8080}],\"resources\":{}}]}},\"strategy\":{}},\"status\":{}}";

  public static void main(String[] args) throws IOException, ApiException {
    PatchExample example = new PatchExample();
    ApiClient client = ClientBuilder.defaultClient();
    Configuration.setDefaultApiClient(client);

    ExtensionsV1beta1Deployment body =
        (ExtensionsV1beta1Deployment)
            example.deserialize(jsonDepStr, ExtensionsV1beta1Deployment.class);
    ExtensionsV1beta1Deployment deploy1 = example.createDeployment("default", body, "false");
    System.out.println("original deployment" + deploy1);

    ArrayList<JsonObject> arr = new ArrayList<>();
    arr.add(((JsonElement) example.deserialize(jsonPatchStr, JsonElement.class)).getAsJsonObject());
    ExtensionsV1beta1Deployment deploy2 =
        example.PatchDeployment("hello-node", "default", arr, "false");
    System.out.println("patched deployment" + deploy2);
  }

  public ExtensionsV1beta1Deployment createDeployment(
      String namespace, ExtensionsV1beta1Deployment body, String pretty) throws ApiException {
    ExtensionsV1beta1Api api = new ExtensionsV1beta1Api();
    ExtensionsV1beta1Deployment deploy = api.createNamespacedDeployment(namespace, body, pretty);
    return deploy;
  }

  public ExtensionsV1beta1Deployment PatchDeployment(
      String deployName, String namespace, Object body, String pretty) throws ApiException {
    ExtensionsV1beta1Api api = new ExtensionsV1beta1Api();
    ExtensionsV1beta1Deployment deploy =
        api.patchNamespacedDeployment(deployName, namespace, body, pretty);
    return deploy;
  }

  public Object deserialize(String jsonStr, Class<?> targetClass) {
    Object obj = (new Gson()).fromJson(jsonStr, targetClass);
    return obj;
  }
}
