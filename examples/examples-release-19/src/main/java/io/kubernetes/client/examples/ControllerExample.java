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
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.extended.controller.LeaderElectingController;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.extended.event.EventType;
import io.kubernetes.client.extended.event.legacy.EventBroadcaster;
import io.kubernetes.client.extended.event.legacy.EventRecorder;
import io.kubernetes.client.extended.event.legacy.LegacyEventBroadcaster;
import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.util.CallGeneratorParams;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class ControllerExample {
  public static void main(String[] args) throws IOException {

    CoreV1Api coreV1Api = new CoreV1Api();
    ApiClient apiClient = coreV1Api.getApiClient();
    OkHttpClient httpClient =
        apiClient.getHttpClient().newBuilder().readTimeout(0, TimeUnit.SECONDS).build();
    apiClient.setHttpClient(httpClient);

    // instantiating an informer-factory, and there should be only one informer-factory
    // globally.
    SharedInformerFactory informerFactory = new SharedInformerFactory();
    // registering node-informer into the informer-factory.
    SharedIndexInformer<V1Node> nodeInformer =
        informerFactory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              return coreV1Api.listNodeCall(
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  params.resourceVersion,
                      null,
                      null,
                  params.timeoutSeconds,
                  params.watch,
                  null);
            },
            V1Node.class,
            V1NodeList.class);
    informerFactory.startAllRegisteredInformers();

    EventBroadcaster eventBroadcaster = new LegacyEventBroadcaster(coreV1Api);

    // nodeReconciler prints node information on events
    NodePrintingReconciler nodeReconciler =
        new NodePrintingReconciler(
            nodeInformer,
            eventBroadcaster.newRecorder(
                new V1EventSource().host("localhost").component("node-printer")));

    // Use builder library to construct a default controller.
    Controller controller =
        ControllerBuilder.defaultBuilder(informerFactory)
            .watch(
                (workQueue) ->
                    ControllerBuilder.controllerWatchBuilder(V1Node.class, workQueue)
                        .withWorkQueueKeyFunc(
                            (V1Node node) ->
                                new Request(node.getMetadata().getName())) // optional, default to
                        .withOnAddFilter(
                            (V1Node createdNode) ->
                                createdNode
                                    .getMetadata()
                                    .getName()
                                    .startsWith("docker-")) // optional, set onAdd filter
                        .withOnUpdateFilter(
                            (V1Node oldNode, V1Node newNode) ->
                                newNode
                                    .getMetadata()
                                    .getName()
                                    .startsWith("docker-")) // optional, set onUpdate filter
                        .withOnDeleteFilter(
                            (V1Node deletedNode, Boolean stateUnknown) ->
                                deletedNode
                                    .getMetadata()
                                    .getName()
                                    .startsWith("docker-")) // optional, set onDelete filter
                        .build())
            .withReconciler(nodeReconciler) // required, set the actual reconciler
            .withName("node-printing-controller") // optional, set name for controller
            .withWorkerCount(4) // optional, set worker thread count
            .withReadyFunc(nodeInformer::hasSynced) // optional, only starts controller when the
            // cache has synced up
            .build();

    // Use builder library to manage one or multiple controllers.
    ControllerManager controllerManager =
        ControllerBuilder.controllerManagerBuilder(informerFactory)
            .addController(controller)
            .build();

    LeaderElectingController leaderElectingController =
        new LeaderElectingController(
            new LeaderElector(
                new LeaderElectionConfig(
                    new EndpointsLock("kube-system", "leader-election", "foo"),
                    Duration.ofMillis(10000),
                    Duration.ofMillis(8000),
                    Duration.ofMillis(5000))),
            controllerManager);

    leaderElectingController.run();
  }

  static class NodePrintingReconciler implements Reconciler {

    private Lister<V1Node> nodeLister;
    private EventRecorder eventRecorder;

    public NodePrintingReconciler(
        SharedIndexInformer<V1Node> nodeInformer, EventRecorder recorder) {
      this.nodeLister = new Lister<>(nodeInformer.getIndexer());
      this.eventRecorder = recorder;
    }

    @Override
    public Result reconcile(Request request) {
      V1Node node = this.nodeLister.get(request.getName());
      System.out.println("triggered reconciling " + node.getMetadata().getName());
      this.eventRecorder.event(
          node,
          EventType.Normal,
          "Print Node",
          "Successfully printed %s",
          node.getMetadata().getName());
      return new Result(false);
    }
  }
}
