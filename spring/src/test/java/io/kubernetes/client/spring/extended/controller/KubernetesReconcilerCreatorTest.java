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
package io.kubernetes.client.spring.extended.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.DefaultController;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.DeltaFIFO;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.informer.impl.DefaultSharedIndexInformer;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.spring.extended.controller.annotation.AddWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.DeleteWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerReadyFunc;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatch;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatches;
import io.kubernetes.client.spring.extended.controller.annotation.UpdateWatchEventFilter;
import java.util.LinkedList;
import java.util.function.Function;
import javax.annotation.Resource;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(KubernetesInformerCreatorTest.TestConfig.class)
public class KubernetesReconcilerCreatorTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8189);

  @TestConfiguration
  static class TestConfig {

    @Bean
    public TestReconciler podReconciler(
        SharedInformer<V1Pod> podInformer,
        Lister<V1Pod> podLister,
        SharedInformer<V1ConfigMap> configMapInformer,
        Lister<V1ConfigMap> configMapLister) {
      return new TestReconciler(podInformer, podLister, configMapLister);
    }

    @Bean
    public KubernetesReconcilerConfigurer kubernetesReconcilerConfigurer(
        SharedInformerFactory sharedInformerFactory) {
      return new KubernetesReconcilerConfigurer(sharedInformerFactory);
    }
  }

  @KubernetesReconciler(
      value = "test-reconcile",
      watches =
          @KubernetesReconcilerWatches({
            @KubernetesReconcilerWatch(
                apiTypeClass = V1Pod.class,
                workQueueKeyFunc = CustomWorkQueueKeyFunc.class,
                resyncPeriodMillis = 60 * 1000L // resync every 60s
                )
          }))
  static class TestReconciler implements Reconciler {

    private Request receivedRequest;

    public TestReconciler(
        SharedInformer<V1Pod> podInformer,
        Lister<V1Pod> podLister,
        Lister<V1ConfigMap> configMapLister) {
      this.podInformer = podInformer;
      this.podLister = podLister;
      this.configMapLister = configMapLister;
    }

    private final SharedInformer<V1Pod> podInformer;

    private final Lister<V1Pod> podLister;

    private final Lister<V1ConfigMap> configMapLister;

    @Override
    public Result reconcile(Request request) {
      receivedRequest = request;
      return new Result(false);
    }

    @AddWatchEventFilter(apiTypeClass = V1Pod.class)
    private boolean onAddFilter(V1Pod pod) {
      return true;
    }

    @UpdateWatchEventFilter(apiTypeClass = V1Pod.class)
    private boolean onUpdateFilter(V1Pod oldPod, V1Pod newPod) {
      return true;
    }

    @DeleteWatchEventFilter(apiTypeClass = V1Pod.class)
    private boolean onDeleteFilter(V1Pod pod) {
      return true;
    }

    @KubernetesReconcilerReadyFunc
    private boolean podInformerCacheReady() {
      return podInformer.hasSynced();
    }
  }

  @Resource(name = "test-reconcile")
  private Controller testController;

  @Resource private TestReconciler testReconciler;

  @Resource private SharedInformerFactory sharedInformerFactory;

  public static class CustomWorkQueueKeyFunc implements Function<KubernetesObject, Request> {

    public CustomWorkQueueKeyFunc(WorkQueue<Request> workQueue) {
      this.workQueue = workQueue;
    }

    private final WorkQueue<Request> workQueue;

    @Override
    public Request apply(KubernetesObject item) {
      workQueue.add(new Request("foo"));
      return null;
    }
  }

  @Test
  public void testSimplePodController() throws InterruptedException {
    assertNotNull(testController);
    assertNotNull(testReconciler);

    sharedInformerFactory.startAllRegisteredInformers();

    ((DefaultSharedIndexInformer<V1Pod, V1PodList>) testReconciler.podInformer)
        .handleDeltas(
            new LinkedList<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>() {
              {
                add(
                    new MutablePair<>(
                        DeltaFIFO.DeltaType.Added,
                        new V1Pod().metadata(new V1ObjectMeta().namespace("a").name("b"))));
              }
            });

    Thread.sleep(500);

    WorkQueue<Request> workQueue = ((DefaultController) testController).getWorkQueue();
    assertEquals(1, workQueue.length());
    if (workQueue.length() != 1) {
      fail();
    }
    assertEquals("foo", workQueue.get().getName());
  }
}
