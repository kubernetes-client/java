/*
Copyright 2018 The Kubernetes Authors.
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

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.ExtensionsV1beta1Api;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of deployment using Json Patch and Strategic Merge Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>. For
 * generating Strategic Merge Patches, refer <a
 * href="https://github.com/kubernetes/community/blob/master/contributors/devel/sig-api-machinery/strategic-merge-patch.md">strategic-merge-patch.md</a>.
 *
 * <ul>
 *   <li>Creates deployment hello-node with <b>terminationGracePeriodSeconds</b> value as 30 and a
 *       finalizer.
 *   <li>Json-Patches deployment hello-node with <b>terminationGracePeriodSeconds</b> value as 27.
 *   <li>Strategic-Merge-Patches deployment hello-node removing the finalizer.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr =
      "[{\"op\":\"replace\",\"path\":\"/spec/template/spec/terminationGracePeriodSeconds\",\"value\":27}]";
  static String strategicMergePatchStr =
      "{\"metadata\":{\"$deleteFromPrimitiveList/finalizers\":[\"example.com/test\"]}}";
  static String jsonDeploymentStr =
      "{\"kind\":\"Deployment\",\"apiVersion\":\"extensions/v1beta1\",\"metadata\":{\"name\":\"hello-node\",\"finalizers\":[\"example.com/test\"],\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"replicas\":1,\"selector\":{\"matchLabels\":{\"run\":\"hello-node\"}},\"template\":{\"metadata\":{\"creationTimestamp\":null,\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"terminationGracePeriodSeconds\":30,\"containers\":[{\"name\":\"hello-node\",\"image\":\"hello-node:v1\",\"ports\":[{\"containerPort\":8080}],\"resources\":{}}]}},\"strategy\":{}},\"status\":{}}";
  static String applyYamlStr =
      "{\"kind\":\"Deployment\",\"apiVersion\":\"extensions/v1beta1\",\"metadata\":{\"name\":\"hello-node\",\"finalizers\":[\"example.com/test\"],\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"replicas\":1,\"selector\":{\"matchLabels\":{\"run\":\"hello-node\"}},\"template\":{\"metadata\":{\"creationTimestamp\":null,\"labels\":{\"run\":\"hello-node\"}},\"spec\":{\"terminationGracePeriodSeconds\":30,\"containers\":[{\"name\":\"hello-node\",\"image\":\"hello-node:v2\",\"ports\":[{\"containerPort\":8080}],\"resources\":{}}]}},\"strategy\":{}},\"status\":{}}";

  public static void main(String[] args) throws IOException {
    try {
      ExtensionsV1beta1Api api = new ExtensionsV1beta1Api(ClientBuilder.standard().build());
      ExtensionsV1beta1Deployment body =
          Configuration.getDefaultApiClient()
              .getJSON()
              .deserialize(jsonDeploymentStr, ExtensionsV1beta1Deployment.class);

      // create a deployment
      ExtensionsV1beta1Deployment deploy1 =
          api.createNamespacedDeployment("default", body, null, null, null);
      System.out.println("original deployment" + deploy1);

      // json-patch a deployment
      ApiClient jsonPatchClient =
          ClientBuilder.standard().setOverridePatchFormat(V1Patch.PATCH_FORMAT_JSON_PATCH).build();
      ExtensionsV1beta1Deployment deploy2 =
          new ExtensionsV1beta1Api(jsonPatchClient)
              .patchNamespacedDeployment(
                  "hello-node", "default", new V1Patch(jsonPatchStr), null, null, null, null);
      System.out.println("json-patched deployment" + deploy2);

      // strategic-merge-patch a deployment
      ApiClient strategicMergePatchClient =
          ClientBuilder.standard()
              .setOverridePatchFormat(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH)
              .build();
      strategicMergePatchClient.setDebugging(true);
      ExtensionsV1beta1Deployment deploy3 =
          new ExtensionsV1beta1Api(strategicMergePatchClient)
              .patchNamespacedDeployment(
                  "hello-node",
                  "default",
                  new V1Patch(strategicMergePatchStr),
                  null,
                  null,
                  null,
                  null);
      System.out.println("strategic-merge-patched deployment" + deploy3);

      // apply-yaml a deployment, server side apply is alpha in kubernetes v1.14,
      // You need to actively enable the Server Side Apply alpha feature
      // https://kubernetes.io/docs/reference/using-api/api-concepts/#server-side-apply
      ApiClient applyYamlClient =
          ClientBuilder.standard().setOverridePatchFormat(V1Patch.PATCH_FORMAT_APPLY_YAML).build();
      applyYamlClient.setDebugging(true);
      ExtensionsV1beta1Deployment deploy4 =
          new ExtensionsV1beta1Api(applyYamlClient)
              .patchNamespacedDeployment(
                  "hello-node", "default", new V1Patch(applyYamlStr), null, null, null, null);
      System.out.println("application/apply-patch+yaml deployment" + deploy4);

    } catch (ApiException e) {
      System.out.println(e.getResponseBody());
      e.printStackTrace();
    }
  }
}
