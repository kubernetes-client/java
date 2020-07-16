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

import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.spring.extended.controller.annotation.*;
import io.kubernetes.client.spring.extended.controller.annotation.AddWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.DeleteWatchEventFilter;
import io.kubernetes.client.spring.extended.controller.annotation.UpdateWatchEventFilter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    public TestReconciler podReconciler() {
      return new TestReconciler();
    }
  }

  @KubernetesReconciler(
      value = "test-reconcile",
      watches =
          @KubernetesReconcilerWatches({
            @KubernetesReconcilerWatch(
                apiTypeClass = V1Pod.class,
                resyncPeriodMillis = 60 * 1000L // resync every 60s
                )
          }))
  static class TestReconciler implements Reconciler {

    private int observedPodCount;

    @Autowired private SharedInformer<V1Pod> podInformer;

    @Autowired private Lister<V1Pod> podLister;

    @Override
    public Result reconcile(Request request) {
      observedPodCount = podLister.list().size();
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

  @Autowired private Controller testController;

  @Test
  public void testSimplePodController() {
    assertNotNull(testController);
  }
}
