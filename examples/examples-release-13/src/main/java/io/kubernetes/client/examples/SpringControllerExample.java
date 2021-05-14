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

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1EndpointsList;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.time.Duration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringControllerExample {

  public static void main(String[] args) {
    SpringApplication.run(SpringControllerExample.class, args);
  }

  @Configuration
  public static class AppConfig {

    @Bean
    public CommandLineRunner commandLineRunner(
        SharedInformerFactory sharedInformerFactory, Controller nodePrintingController) {
      return args -> {
        System.out.println("starting informers..");
        sharedInformerFactory.startAllRegisteredInformers();

        System.out.println("running controller..");
        nodePrintingController.run();
      };
    }

    @Bean
    public Controller nodePrintingController(
        SharedInformerFactory sharedInformerFactory, NodePrintingReconciler reconciler) {
      DefaultControllerBuilder builder = ControllerBuilder.defaultBuilder(sharedInformerFactory);
      builder =
          builder.watch(
              (q) -> {
                return ControllerBuilder.controllerWatchBuilder(V1Node.class, q)
                    .withResyncPeriod(Duration.ofMinutes(1))
                    .build();
              });
      builder.withWorkerCount(2);
      builder.withReadyFunc(reconciler::informerReady);
      return builder.withReconciler(reconciler).withName("nodePrintingController").build();
    }

    @Bean
    public SharedIndexInformer<V1Endpoints> endpointsInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1Endpoints, V1EndpointsList> genericApi =
          new GenericKubernetesApi<>(
              V1Endpoints.class, V1EndpointsList.class, "", "v1", "endpoints", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(genericApi, V1Endpoints.class, 0);
    }

    @Bean
    public SharedIndexInformer<V1Node> nodeInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1Node, V1NodeList> genericApi =
          new GenericKubernetesApi<>(V1Node.class, V1NodeList.class, "", "v1", "nodes", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(genericApi, V1Node.class, 60 * 1000L);
    }

    @Bean
    public SharedIndexInformer<V1Pod> podInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1Pod, V1PodList> genericApi =
          new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(genericApi, V1Pod.class, 0);
    }
  }

  @Component
  public static class NodePrintingReconciler implements Reconciler {

    @Value("${namespace}")
    private String namespace;

    private SharedInformer<V1Node> nodeInformer;

    private SharedInformer<V1Pod> podInformer;

    private Lister<V1Node> nodeLister;

    private Lister<V1Pod> podLister;

    public NodePrintingReconciler(
        SharedIndexInformer<V1Node> nodeInformer, SharedIndexInformer<V1Pod> podInformer) {
      this.nodeInformer = nodeInformer;
      this.podInformer = podInformer;
      this.nodeLister = new Lister<>(nodeInformer.getIndexer(), namespace);
      this.podLister = new Lister<>(podInformer.getIndexer(), namespace);
    }

    // *OPTIONAL*
    // If you want to hold the controller from running util some condition..
    public boolean informerReady() {
      return podInformer.hasSynced() && nodeInformer.hasSynced();
    }

    @Override
    public Result reconcile(Request request) {
      V1Node node = nodeLister.get(request.getName());

      System.out.println("get all pods in namespace " + namespace);
      podLister.namespace(namespace).list().stream()
          .map(pod -> pod.getMetadata().getName())
          .forEach(System.out::println);

      System.out.println("triggered reconciling " + node.getMetadata().getName());
      return new Result(false);
    }
  }
}
