/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.manifests;

import static org.awaitility.Awaitility.await;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.model.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("kubernetes.manifests.refreshInterval=1s")
public class KubernetesFromConfigMapTest {

  @Rule public ConfigMapResetter configMapResetter = new ConfigMapResetter();

  @SpringBootApplication
  static class App {

    @Bean
    public KubernetesFromConfigMapProcessor kubernetesFromConfigMapProcessor() {
      return new KubernetesFromConfigMapProcessor();
    }

    @Bean
    public MockAtomicConfigMapGetter mockAtomicConfigMapGetter() {
      MockAtomicConfigMapGetter atomicConfigMapGetter = new MockAtomicConfigMapGetter();
      return atomicConfigMapGetter;
    }

    @Bean
    public KubernetesFromConfigMapTest.MyBean myBean() {
      return new KubernetesFromConfigMapTest.MyBean();
    }
  }

  static class MyBean {
    @FromConfigMap(namespace = "default", name = "foo", configMapGetter = MockConfigMapGetter.class)
    private Map<String, String> staticData;

    @FromConfigMap(
        namespace = "default",
        name = "foo",
        configMapGetter = MockAtomicConfigMapGetter.class)
    private Map<String, String> dynamicData;
  }

  @Autowired private KubernetesFromConfigMapTest.MyBean myBean;

  @Autowired private MockAtomicConfigMapGetter mockAtomicConfigMapGetter;

  @Autowired private KubernetesManifestsProperties manifestsProperties;

  @Test
  public void testReadOnce() {
    assertNotNull(myBean.staticData);
    assertEquals("bar", myBean.staticData.get("foo"));
  }

  @Test
  public void testValueUpdate() throws InterruptedException {
    assertEquals(Duration.ofSeconds(1), manifestsProperties.getRefreshInterval());
    assertNotNull(myBean.dynamicData);
    assertEquals("bar1", myBean.dynamicData.get("foo"));
    mockAtomicConfigMapGetter.configMapAtomicReference.set(
        new V1ConfigMap().putDataItem("foo", "bar2"));
    await()
        .timeout(manifestsProperties.getRefreshInterval().multipliedBy(2))
        .until(() -> "bar2".equals(myBean.dynamicData.get("foo")));
  }

  @Test
  public void testKeyUpdate() throws InterruptedException {
    assertEquals(Duration.ofSeconds(1), manifestsProperties.getRefreshInterval());
    assertNotNull(myBean.dynamicData);
    assertEquals("bar1", myBean.dynamicData.get("foo"));
    mockAtomicConfigMapGetter.configMapAtomicReference.set(
        new V1ConfigMap().putDataItem("foo1", "bar"));
    await()
        .timeout(manifestsProperties.getRefreshInterval().multipliedBy(2))
        .until(
            () -> {
              return myBean.dynamicData.get("foo") == null
                  && "bar".equals(myBean.dynamicData.get("foo1"));
            });
  }

  static class MockConfigMapGetter implements ConfigMapGetter {
    @Override
    public V1ConfigMap get(String namespace, String name) {
      return new V1ConfigMap().putDataItem("foo", "bar");
    }
  }

  static class MockAtomicConfigMapGetter implements ConfigMapGetter {

    private final AtomicReference<V1ConfigMap> configMapAtomicReference = new AtomicReference<>();

    @Override
    public V1ConfigMap get(String namespace, String name) {
      return configMapAtomicReference.get();
    }
  }

  class ConfigMapResetter implements TestRule {
    @Override
    public Statement apply(Statement statement, Description description) {
      return new Statement() {
        @Override
        public void evaluate() throws Throwable {
          mockAtomicConfigMapGetter.configMapAtomicReference.set(
              new V1ConfigMap().putDataItem("foo", "bar1"));
          await().until(() -> "bar1".equals(myBean.dynamicData.get("foo")));
          statement.evaluate();
        }
      };
    }
  }
}
