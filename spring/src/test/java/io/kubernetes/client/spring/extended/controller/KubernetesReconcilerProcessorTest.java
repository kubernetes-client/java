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

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.informer.SharedInformer;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.spring.extended.controller.annotation.GroupVersionResource;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatches;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest(classes = KubernetesReconcilerProcessorTest.App.class)
class KubernetesReconcilerProcessorTest {

  @SpringBootApplication
  static class App {

    @Bean
    KubernetesReconcilerProcessor reconcilerProcessorUnderTesting() {
      return new KubernetesReconcilerProcessor();
    }

    @Bean
    TestSharedInformerFactory testSharedInformerFactory() {
      return new TestSharedInformerFactory();
    }

    @KubernetesInformers({
      @KubernetesInformer(
          apiTypeClass = V1Pod.class,
          apiListTypeClass = V1PodList.class,
          groupVersionResource = @GroupVersionResource(resourcePlural = "pods"))
    })
    static class TestSharedInformerFactory {}

    @Bean("testReconciler1")
    TestReconciler testReconciler1ToBeInjected() {
      return new TestReconciler();
    }

    @Bean("testReconciler2")
    TestReconciler testReconciler2ToBeInjected() {
      return new TestReconciler();
    }
  }

  @KubernetesReconciler(watches = @KubernetesReconcilerWatches())
  static class TestReconciler implements Reconciler {

    @Autowired private SharedInformer<V1Pod> informerToBeInjected;

    @Override
    public Result reconcile(Request request) {
      return new Result(false);
    }
  }

  @Autowired
  @Qualifier("testReconciler1Controller")
  private Controller controller1CreatedByReconcilerProcessor;

  @Autowired
  @Qualifier("testReconciler2Controller")
  private Controller controller2CreatedByReconcilerProcessor;

  @Autowired
  @Qualifier("testReconciler1")
  private TestReconciler testReconciler1ToBeInjected;

  @Autowired
  @Qualifier("testReconciler2")
  private TestReconciler testReconciler2ToBeInjected;

  @Test
  void autowiredFieldsOfReconcilerBeansAreSet() {
    assertThat(testReconciler1ToBeInjected.informerToBeInjected).isNotNull();
    assertThat(testReconciler2ToBeInjected.informerToBeInjected).isNotNull();
  }
}
