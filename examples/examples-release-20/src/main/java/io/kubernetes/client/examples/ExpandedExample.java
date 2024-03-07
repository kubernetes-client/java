/*
Copyright 2020 The Kubernetes Authors.
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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentList;
import io.kubernetes.client.openapi.models.V1DeploymentSpec;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1ServiceList;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.ExpandedExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class ExpandedExample {

  private static CoreV1Api COREV1_API;
  private static final String DEFAULT_NAME_SPACE = "default";
  private static final Integer TIME_OUT_VALUE = 180;
  private static final Logger LOGGER = LoggerFactory.getLogger(ExpandedExample.class);

  /**
   * Main method
   *
   * @param args
   */
  public static void main(String[] args) {
    try {
      ApiClient client = Config.defaultClient();
      // To change the context of k8s cluster, you can use
      // io.kubernetes.client.util.KubeConfig
      Configuration.setDefaultApiClient(client);
      COREV1_API = new CoreV1Api(client);

      // ScaleUp/ScaleDown the Deployment pod
      // Please change the name of Deployment?
      System.out.println("----- Scale Deployment Start -----");
      scaleDeployment("account-service", 5);

      // List all of the namaspaces and pods
      List<String> nameSpaces = getAllNameSpaces();
      nameSpaces.stream()
          .forEach(
              namespace -> {
                try {
                  System.out.println("----- " + namespace + " -----");
                  getNamespacedPod(namespace).stream().forEach(System.out::println);
                } catch (ApiException ex) {
                  LOGGER.warn("Couldn't get the pods in namespace:{}", namespace, ex);
                }
              });

      // Print all of the Services
      System.out.println("----- Print list all Services Start -----");
      List<String> services = getServices();
      services.stream().forEach(System.out::println);
      System.out.println("----- Print list all Services End -----");

      // Print log of specific pod. In this example show the first pod logs.
      System.out.println("----- Print Log of Specific Pod Start -----");
      String firstPodName = getPods().get(0);
      printLog(DEFAULT_NAME_SPACE, firstPodName);
      System.out.println("----- Print Log of Specific Pod End -----");
    } catch (ApiException | IOException ex) {
      LOGGER.warn("Exception had occured ", ex);
    }
  }

  /**
   * Get all namespaces in k8s cluster
   *
   * @return
   * @throws ApiException
   */
  public static List<String> getAllNameSpaces() throws ApiException {
    V1NamespaceList listNamespace =
        COREV1_API.listNamespace().execute();
    List<String> list =
        listNamespace.getItems().stream()
            .map(v1Namespace -> v1Namespace.getMetadata().getName())
            .collect(Collectors.toList());
    return list;
  }

  /**
   * List all pod names in all namespaces in k8s cluster
   *
   * @return
   * @throws ApiException
   */
  public static List<String> getPods() throws ApiException {
    V1PodList v1podList =
        COREV1_API.listPodForAllNamespaces().execute();
    List<String> podList =
        v1podList.getItems().stream()
            .map(v1Pod -> v1Pod.getMetadata().getName())
            .collect(Collectors.toList());
    return podList;
  }

  /**
   * List all pod in the default namespace
   *
   * @return
   * @throws ApiException
   */
  public static List<String> getNamespacedPod() throws ApiException {
    return getNamespacedPod(DEFAULT_NAME_SPACE, null);
  }

  /**
   * List pod in specific namespace
   *
   * @param namespace
   * @return
   * @throws ApiException
   */
  public static List<String> getNamespacedPod(String namespace) throws ApiException {
    return getNamespacedPod(namespace, null);
  }

  /**
   * List pod in specific namespace with label
   *
   * @param namespace
   * @param label
   * @return
   * @throws ApiException
   */
  public static List<String> getNamespacedPod(String namespace, String label) throws ApiException {
    V1PodList listNamespacedPod =
        COREV1_API.listNamespacedPod(
            namespace)
                .labelSelector(label)
                .timeoutSeconds(TIME_OUT_VALUE)
                .watch(false)
                .execute();
    List<String> listPods =
        listNamespacedPod.getItems().stream()
            .map(v1pod -> v1pod.getMetadata().getName())
            .collect(Collectors.toList());
    return listPods;
  }

  /**
   * List all Services in default namespace
   *
   * @return
   * @throws ApiException
   */
  public static List<String> getServices() throws ApiException {
    V1ServiceList listNamespacedService =
        COREV1_API.listNamespacedService(DEFAULT_NAME_SPACE)
                .timeoutSeconds(TIME_OUT_VALUE)
                .watch(false)
                .execute();
    return listNamespacedService.getItems().stream()
        .map(v1service -> v1service.getMetadata().getName())
        .collect(Collectors.toList());
  }

  /**
   * Scale up/down the number of pod in Deployment
   *
   * @param deploymentName
   * @param numberOfReplicas
   * @throws ApiException
   */
  public static void scaleDeployment(String deploymentName, int numberOfReplicas)
      throws ApiException {
    AppsV1Api appsV1Api = new AppsV1Api();
    appsV1Api.setApiClient(COREV1_API.getApiClient());
    V1DeploymentList listNamespacedDeployment =
        appsV1Api.listNamespacedDeployment(
            DEFAULT_NAME_SPACE)
                .watch(false)
                .execute();

    List<V1Deployment> appsV1DeploymentItems = listNamespacedDeployment.getItems();
    Optional<V1Deployment> findedDeployment =
        appsV1DeploymentItems.stream()
            .filter(
                (V1Deployment deployment) ->
                    deployment.getMetadata().getName().equals(deploymentName))
            .findFirst();
    findedDeployment.ifPresent(
        (V1Deployment deploy) -> {
          try {
            V1DeploymentSpec newSpec = deploy.getSpec().replicas(numberOfReplicas);
            V1Deployment newDeploy = deploy.spec(newSpec);
            appsV1Api.replaceNamespacedDeployment(
                deploymentName, DEFAULT_NAME_SPACE, newDeploy).execute();
          } catch (ApiException ex) {
            LOGGER.warn("Scale the pod failed for Deployment:{}", deploymentName, ex);
          }
        });
  }

  /**
   * Print out the Log for specific Pods
   *
   * @param namespace
   * @param podName
   * @throws ApiException
   */
  public static void printLog(String namespace, String podName) throws ApiException {
    // https://github.com/kubernetes-client/java/blob/master/kubernetes/docs/CoreV1Api.md#readNamespacedPodLog
    String readNamespacedPodLog =
        COREV1_API.readNamespacedPodLog(podName, namespace)
                .follow(false)
                .limitBytes(Integer.MAX_VALUE)
                .sinceSeconds(Integer.MAX_VALUE)
                .tailLines(40)
                .execute();
    System.out.println(readNamespacedPodLog);
  }
}
