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
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.apis.ExtensionsV1beta1Api;
import io.kubernetes.client.models.ExtensionsV1beta1Deployment;
import io.kubernetes.client.models.ExtensionsV1beta1DeploymentList;
import io.kubernetes.client.models.ExtensionsV1beta1DeploymentSpec;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.models.V1ServiceList;
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
      nameSpaces
          .stream()
          .forEach(
              namespace -> {
                try {
                  System.out.println("----- " + namespace + " -----");
                  getNamespacedPod(namespace).stream().forEach(System.out::println);
                } catch (ApiException ex) {
                  LOGGER.warn("Couldn't get the pods in namespace:" + namespace, ex);
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
        COREV1_API.listNamespace(
            "true", null, null, null, 0, null, Integer.MAX_VALUE, Boolean.FALSE);
    List<String> list =
        listNamespace
            .getItems()
            .stream()
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
        COREV1_API.listPodForAllNamespaces(null, null, null, null, null, null, null, null);
    List<String> podList =
        v1podList
            .getItems()
            .stream()
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
            namespace,
            null,
            null,
            null,
            label,
            Integer.MAX_VALUE,
            null,
            TIME_OUT_VALUE,
            Boolean.FALSE);
    List<String> listPods =
        listNamespacedPod
            .getItems()
            .stream()
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
        COREV1_API.listNamespacedService(
            DEFAULT_NAME_SPACE,
            null,
            null,
            null,
            null,
            Integer.MAX_VALUE,
            null,
            TIME_OUT_VALUE,
            Boolean.FALSE);
    return listNamespacedService
        .getItems()
        .stream()
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
    ExtensionsV1beta1Api extensionV1Api = new ExtensionsV1beta1Api();
    extensionV1Api.setApiClient(COREV1_API.getApiClient());
    ExtensionsV1beta1DeploymentList listNamespacedDeployment =
        extensionV1Api.listNamespacedDeployment(
            DEFAULT_NAME_SPACE, null, null, null, null, null, null, null, Boolean.FALSE);

    List<ExtensionsV1beta1Deployment> extensionsV1beta1DeploymentItems =
        listNamespacedDeployment.getItems();
    Optional<ExtensionsV1beta1Deployment> findedDeployment =
        extensionsV1beta1DeploymentItems
            .stream()
            .filter(
                (ExtensionsV1beta1Deployment deployment) ->
                    deployment.getMetadata().getName().equals(deploymentName))
            .findFirst();
    findedDeployment.ifPresent(
        (ExtensionsV1beta1Deployment deploy) -> {
          try {
            ExtensionsV1beta1DeploymentSpec newSpec = deploy.getSpec().replicas(numberOfReplicas);
            ExtensionsV1beta1Deployment newDeploy = deploy.spec(newSpec);
            extensionV1Api.replaceNamespacedDeployment(
                deploymentName, DEFAULT_NAME_SPACE, newDeploy, null, null, null);
          } catch (ApiException ex) {
            LOGGER.warn("Scale the pod failed for Deployment:" + deploymentName, ex);
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
        COREV1_API.readNamespacedPodLog(
            podName,
            namespace,
            null,
            Boolean.FALSE,
            Integer.MAX_VALUE,
            null,
            Boolean.FALSE,
            Integer.MAX_VALUE,
            40,
            Boolean.FALSE);
    System.out.println(readNamespacedPodLog);
  }
}
