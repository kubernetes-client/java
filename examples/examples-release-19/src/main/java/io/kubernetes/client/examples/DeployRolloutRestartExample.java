/*
Copyright 2022 The Kubernetes Authors.
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

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentBuilder;
import io.kubernetes.client.openapi.models.V1DeploymentSpec;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.PatchUtils;
import io.kubernetes.client.util.wait.Wait;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;

public class DeployRolloutRestartExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);
    AppsV1Api appsV1Api = new AppsV1Api(client);

    String deploymentName = "example-nginx";
    String imageName = "nginx:1.21.6";
    String namespace = "default";

    // Create an example deployment
    V1DeploymentBuilder deploymentBuilder =
        new V1DeploymentBuilder()
            .withApiVersion("apps/v1")
            .withKind("Deployment")
            .withMetadata(new V1ObjectMeta().name(deploymentName).namespace(namespace))
            .withSpec(
                new V1DeploymentSpec()
                    .replicas(1)
                    .selector(new V1LabelSelector().putMatchLabelsItem("name", deploymentName))
                    .template(
                        new V1PodTemplateSpec()
                            .metadata(new V1ObjectMeta().putLabelsItem("name", deploymentName))
                            .spec(
                                new V1PodSpec()
                                    .containers(
                                        Collections.singletonList(
                                            new V1Container()
                                                .name(deploymentName)
                                                .image(imageName))))));
    appsV1Api.createNamespacedDeployment(
        namespace, deploymentBuilder.build()).execute();

    // Wait until example deployment is ready
    Wait.poll(
        Duration.ofSeconds(3),
        Duration.ofSeconds(60),
        () -> {
          try {
            System.out.println("Waiting until example deployment is ready...");
            return appsV1Api
                    .readNamespacedDeployment(deploymentName, namespace)
                    .execute()
                    .getStatus()
                    .getReadyReplicas()
                > 0;
          } catch (ApiException e) {
            e.printStackTrace();
            return false;
          }
        });
    System.out.println("Created example deployment!");

    // Trigger a rollout restart of the example deployment
    V1Deployment runningDeployment =
        appsV1Api.readNamespacedDeployment(deploymentName, namespace).execute();

    // Explicitly set "restartedAt" annotation with current date/time to trigger rollout when patch
    // is applied
    runningDeployment
        .getSpec()
        .getTemplate()
        .getMetadata()
        .putAnnotationsItem("kubectl.kubernetes.io/restartedAt", LocalDateTime.now().toString());
    try {
      String deploymentJson = client.getJSON().serialize(runningDeployment);

      PatchUtils.patch(
          V1Deployment.class,
          () ->
              appsV1Api.patchNamespacedDeployment(
                  deploymentName,
                  namespace,
                  new V1Patch(deploymentJson))
                      .fieldManager("kubectl-rollout")
                      .buildCall(null),
          V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
          client);

      // Wait until deployment has stabilized after rollout restart
      Wait.poll(
          Duration.ofSeconds(3),
          Duration.ofSeconds(60),
          () -> {
            try {
              System.out.println("Waiting until example deployment restarted successfully...");
              return appsV1Api
                      .readNamespacedDeployment(deploymentName, namespace)
                      .execute()
                      .getStatus()
                      .getReadyReplicas()
                  > 0;
            } catch (ApiException e) {
              e.printStackTrace();
              return false;
            }
          });
      System.out.println("Example deployment restarted successfully!");
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
