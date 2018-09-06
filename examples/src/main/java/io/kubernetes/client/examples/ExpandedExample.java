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

  private final CoreV1Api corev1Api;
  private static final String DEFAULT_NAME_SPACE = "default";
  private final static Integer TIME_OUT_VALUE = 180;
  /*
  For API_SERVER_NAME, you can get the server name as follows.
  $ kubectl cluster-info|grep master
  Kubernetes master is running at https://*****************.hcp.japaneast.azmk8s.io:443
   */
  private static final String API_SERVER_NAME = "https://*****************.hcp.japaneast.azmk8s.io";
  /*
  For ACCESS_TOKEN , you can get the token as follows
  $ kubectl describe secret $(kubectl get secrets | grep default | cut -f1 -d ' ') | grep -E '^token' | cut -f2 -d':' | tr -d '\t'
   */
  private static final String ACCESS_TOKEN = "********************************";

  private static final Logger LOGGER = LoggerFactory.getLogger(ExpandedExample.class);

  /**
   * Constructor
   *
   * @throws java.io.IOException
   */
  public ExpandedExample() throws IOException {
    // ApiClient client = Config.defaultClient();
    // If you want to use specific k8s cluster and access token, please use following?
    ApiClient client = Config.fromToken(API_SERVER_NAME, ACCESS_TOKEN, false);
    Configuration.setDefaultApiClient(client);
    corev1Api = new CoreV1Api(client);
  }

  /**
   * Main method
   *
   * @param args
   */
  public static void main(String[] args) {
    try {
      ExpandedExample example = new ExpandedExample();

      // ScaleUp/ScaleDown the Deployment pod
      // Please change the name of Deployment?
      System.out.println("----- Scale Deployment Start -----");
      example.scaleDeployment("account-service", 5);

      // List all of the namaspaces and pods
      List<String> nameSpaces = example.getAllNameSpaces();
      nameSpaces
          .stream()
          .forEach(
              namespace -> {
                try {
                  System.out.println("----- " + namespace + " -----");
                  example.getNamespacedPod(namespace).stream().forEach(System.out::println);
                } catch (ApiException ex) {
                  LOGGER.warn("Couldn't get the pods in namespace:" + namespace, ex);
                }
              });

      // Print all of the Services
      System.out.println("----- Print list all Services Start -----");
      List<String> services = example.getServices();
      services.stream().forEach(System.out::println);
      System.out.println("----- Print list all Services End -----");

      // Print log of specific pod. In this example show the first pod logs.
      System.out.println("----- Print Log of Specific Pod Start -----");
      String firstPodName = example.getPods().get(0);
      example.printLog(DEFAULT_NAME_SPACE, firstPodName);
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
  public List<String> getAllNameSpaces() throws ApiException {
    V1NamespaceList listNamespace =
        corev1Api.listNamespace(
            "true",
            null,
            null,
            Boolean.FALSE,
            null,
            0,
            null,
            Integer.MAX_VALUE,
            Boolean.FALSE);
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
  public List<String> getPods() throws ApiException {
    V1PodList v1podList =
        corev1Api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
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
  public List<String> getNamespacedPod() throws ApiException {
    return getNamespacedPod(DEFAULT_NAME_SPACE, null);
  }

  /**
   * List pod in specific namespace
   *
   * @param namespace
   * @return
   * @throws ApiException
   */
  public List<String> getNamespacedPod(String namespace) throws ApiException {
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
  public List<String> getNamespacedPod(String namespace, String label) throws ApiException {
    V1PodList listNamespacedPod =
        corev1Api.listNamespacedPod(
            namespace,
            null,
            null,
            null,
            Boolean.FALSE,
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
  public List<String> getServices() throws ApiException {
    V1ServiceList listNamespacedService =
        corev1Api.listNamespacedService(
            DEFAULT_NAME_SPACE,
            null,
            null,
            null,
            Boolean.FALSE,
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
  public void scaleDeployment(String deploymentName, int numberOfReplicas) throws ApiException {
    ExtensionsV1beta1Api extensionV1Api = new ExtensionsV1beta1Api();
    extensionV1Api.setApiClient(corev1Api.getApiClient());
    ExtensionsV1beta1DeploymentList listNamespacedDeployment =
        extensionV1Api.listNamespacedDeployment(
            DEFAULT_NAME_SPACE,
            null,
            null,
            null,
            Boolean.FALSE,
            null,
            null,
            null,
            null,
            Boolean.FALSE);

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
                deploymentName, DEFAULT_NAME_SPACE, newDeploy, null);
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
  public void printLog(String namespace, String podName) throws ApiException {
    // https://github.com/kubernetes-client/java/blob/master/kubernetes/docs/CoreV1Api.md#readNamespacedPodLog
    String readNamespacedPodLog =
        corev1Api.readNamespacedPodLog(
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
