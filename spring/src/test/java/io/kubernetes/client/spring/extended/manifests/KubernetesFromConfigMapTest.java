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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest("kubernetes.manifests.refreshInterval=1s")
class KubernetesFromConfigMapTest {

  @BeforeEach void resetConfigMap() {
    mockAtomicConfigMapGetter.configMapAtomicReference.set(
        new V1ConfigMap().putDataItem("foo", "bar1"));
    await().until(() -> "bar1".equals(myBean.dynamicData.get("foo")));
  }

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
  void readOnce() {
    assertThat(myBean.staticData).isNotNull();
    assertThat(myBean.staticData).containsEntry("foo", "bar");
  }

  @Test
  void valueUpdate() {
    assertThat(manifestsProperties.getRefreshInterval()).isEqualTo(Duration.ofSeconds(1));
    assertThat(myBean.dynamicData).isNotNull();
    assertThat(myBean.dynamicData).containsEntry("foo", "bar1");
    mockAtomicConfigMapGetter.configMapAtomicReference.set(
        new V1ConfigMap().putDataItem("foo", "bar2"));
    await()
        .timeout(manifestsProperties.getRefreshInterval().multipliedBy(2))
        .until(() -> "bar2".equals(myBean.dynamicData.get("foo")));
  }

  @Test
  void keyUpdate() {
    assertThat(manifestsProperties.getRefreshInterval()).isEqualTo(Duration.ofSeconds(1));
    assertThat(myBean.dynamicData).isNotNull();
    assertThat(myBean.dynamicData).containsEntry("foo", "bar1");
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

  @Test
  void publishesCompleteSnapshotsThroughRetainedReference() throws Exception {
    Map<String, String> original = myBean.dynamicData;
    Map<String, String> oldData = Map.of("foo", "old", "related", "old", "obsolete", "old");
    mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap().data(oldData));
    await().until(() -> new HashMap<>(original).equals(oldData));

    Set<Map.Entry<String, String>> entries = original.entrySet();
    Set<String> keys = original.keySet();
    var values = original.values();
    Iterator<Map.Entry<String, String>> oldEntries = entries.iterator();
    Iterator<String> oldKeys = keys.iterator();
    Iterator<String> oldValues = values.iterator();
    Map<String, String> newData = Map.of("foo", "new", "related", "new", "added", "new");
    PausingMap source = new PausingMap(newData);
    mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap().data(source));
    try {
      assertThat(source.copyStarted.await(5, TimeUnit.SECONDS)).isTrue();
      assertThat(new HashMap<>(original)).isEqualTo(oldData);
      assertThat(Map.copyOf(original)).isEqualTo(oldData);
      Map<String, String> visited = new HashMap<>();
      original.forEach(visited::put);
      assertThat(visited).isEqualTo(oldData);
    } finally {
      source.continueCopy.countDown();
    }

    await().until(() -> new HashMap<>(original).equals(newData));
    assertThat(myBean.dynamicData).isSameAs(original);
    Map<String, String> retainedEntries = new HashMap<>();
    oldEntries.forEachRemaining(entry -> retainedEntries.put(entry.getKey(), entry.getValue()));
    assertThat(retainedEntries).isEqualTo(oldData);
    List<String> retainedKeys = new ArrayList<>();
    oldKeys.forEachRemaining(retainedKeys::add);
    assertThat(retainedKeys).containsExactlyInAnyOrderElementsOf(oldData.keySet());
    List<String> retainedValues = new ArrayList<>();
    oldValues.forEachRemaining(retainedValues::add);
    assertThat(retainedValues).containsExactlyInAnyOrderElementsOf(oldData.values());
    assertThat(entries).containsExactlyInAnyOrderElementsOf(newData.entrySet());
    assertThat(keys).containsExactlyInAnyOrderElementsOf(newData.keySet());
    assertThat(values).containsExactlyInAnyOrderElementsOf(newData.values());

    Map<String, String> laterData = Map.of("foo", "later");
    mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap().data(laterData));
    await().until(() -> Map.copyOf(original).equals(laterData));
  }

  @Test
  void forEachRetainsSnapshotWhenRefreshOccursDuringTraversal() {
    Map<String, String> oldData = Map.of("foo", "old", "related", "old", "obsolete", "old");
    Map<String, String> newData = Map.of("foo", "new", "related", "new");
    Map<String, String> original = myBean.dynamicData;
    mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap().data(oldData));
    await().until(() -> Map.copyOf(original).equals(oldData));

    Map<String, String> visited = new HashMap<>();
    original.forEach(
        (key, value) -> {
          if (visited.isEmpty()) {
            mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap().data(newData));
            await().until(() -> Map.copyOf(original).equals(newData));
          }
          visited.put(key, value);
        });
    assertThat(visited).isEqualTo(oldData);
    assertThat(Map.copyOf(original)).isEqualTo(newData);
  }

  @Test
  void deletionAndNullDataPublishEmptySnapshots() {
    Map<String, String> original = myBean.dynamicData;
    mockAtomicConfigMapGetter.configMapAtomicReference.set(null);
    await().until(original::isEmpty);
    mockAtomicConfigMapGetter.configMapAtomicReference.set(
        new V1ConfigMap().putDataItem("foo", "restored"));
    await().until(() -> "restored".equals(original.get("foo")));
    mockAtomicConfigMapGetter.configMapAtomicReference.set(new V1ConfigMap());
    await().until(original::isEmpty);
    assertThat(myBean.dynamicData).isSameAs(original);
  }

  @Test
  void publishedMapAndViewsAreReadOnly() {
    Map<String, String> data = myBean.dynamicData;
    assertThatThrownBy(() -> data.put("foo", "local"))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.remove("foo")).isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(data::clear).isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.putAll(Map.of("local", "value")))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.compute("foo", (key, value) -> "local"))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.replaceAll((key, value) -> "local"))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.entrySet().iterator().next().setValue("local"))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.keySet().remove("foo"))
        .isInstanceOf(UnsupportedOperationException.class);
    assertThatThrownBy(() -> data.values().remove("bar1"))
        .isInstanceOf(UnsupportedOperationException.class);
    Iterator<Map.Entry<String, String>> iterator = data.entrySet().iterator();
    iterator.next();
    assertThatThrownBy(iterator::remove).isInstanceOf(UnsupportedOperationException.class);
    assertThat(data).containsExactlyEntriesOf(Map.of("foo", "bar1"));
  }

  private static class PausingMap extends AbstractMap<String, String> {
    private final Map<String, String> data;
    private final CountDownLatch copyStarted = new CountDownLatch(1);
    private final CountDownLatch continueCopy = new CountDownLatch(1);

    private PausingMap(Map<String, String> data) {
      this.data = new LinkedHashMap<>(data);
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
      return new AbstractSet<>() {
        @Override
        public int size() {
          return data.size();
        }

        @Override
        public Iterator<Entry<String, String>> iterator() {
          Iterator<Entry<String, String>> delegate = data.entrySet().iterator();
          return new Iterator<>() {
            private int count;

            @Override
            public boolean hasNext() {
              return delegate.hasNext();
            }

            @Override
            public Entry<String, String> next() {
              if (++count == 2) {
                copyStarted.countDown();
                try {
                  if (!continueCopy.await(5, TimeUnit.SECONDS)) {
                    throw new AssertionError("Timed out waiting to finish copying ConfigMap data");
                  }
                } catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                  throw new AssertionError(e);
                }
              }
              return delegate.next();
            }
          };
        }
      };
    }
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
}
