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
package io.kubernetes.client.informer.cache;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CacheTest {

  private static String mockIndexName = "mock";

  private static List<String> mockIndexFunc(Object obj) {
    if (obj == null) {
      return Arrays.asList("null");
    }
    return Arrays.asList(obj.getClass().getName());
  }

  private static String mockKeyFunc(Object obj) {
    if (obj == null) {
      return "null";
    }
    return String.valueOf(System.identityHashCode(obj));
  }

  private static Cache cache =
      new Cache<>(mockIndexName, CacheTest::mockIndexFunc, CacheTest::mockKeyFunc);

  public void initCacheTest(KubernetesObject obj, String index) {
    this.obj = obj;
    this.index = index;
  }

  private KubernetesObject obj;
  private String index;

  public static Collection data() {

    V1Pod normalPod = new V1Pod();
    V1ObjectMeta normalPodMeta = new V1ObjectMeta();
    normalPodMeta.setName("foo");
    normalPodMeta.setNamespace("default");
    normalPod.setMetadata(normalPodMeta);

    V1Pod missingNamespacePod = new V1Pod();
    V1ObjectMeta missingNamespacePodMeta = new V1ObjectMeta();
    missingNamespacePodMeta.setName("foo");
    missingNamespacePodMeta.setNamespace(null);
    missingNamespacePod.setMetadata(missingNamespacePodMeta);

    V1Pod missingNamePod = new V1Pod();
    V1ObjectMeta missingNamePodMeta = new V1ObjectMeta();
    missingNamePodMeta.setName(null);
    missingNamePodMeta.setNamespace("default");
    missingNamePod.setMetadata(missingNamePodMeta);

    return Arrays.asList(
        new Object[][] {
          {normalPod, "io.kubernetes.client.openapi.models.V1Pod"},
          {missingNamespacePod, "io.kubernetes.client.openapi.models.V1Pod"},
          {missingNamePod, "io.kubernetes.client.openapi.models.V1Pod"},
          {null, "null"},
        });
  }

  @MethodSource("data")
  @ParameterizedTest
  void cacheIndex(KubernetesObject obj, String index) {
    initCacheTest(obj, index);
    cache.replace(Arrays.asList(this.obj), "0");

    String objectIndex = mockIndexFunc(this.obj).get(0);
    String key = mockKeyFunc(this.obj);
    assertThat(index).isEqualTo(this.index);

    List indexedObjectList = cache.byIndex(mockIndexName, objectIndex);
    assertThat(indexedObjectList).containsExactly(this.obj);

    List indexedObjectlist2 = cache.index(mockIndexName, this.obj);
    assertThat(indexedObjectlist2).containsExactly(this.obj);

    List<String> allExistingKeys = cache.listKeys();
    assertThat(allExistingKeys).containsExactly(key);
  }

  @MethodSource("data")
  @ParameterizedTest
  void cacheStore(KubernetesObject obj, String index) {
    initCacheTest(obj, index);
    if (this.obj == null) {
      // skip null object storing test b/c it should be checked before invoking cache
      return;
    }

    cache.replace(Arrays.asList(this.obj), "0");

    cache.delete(this.obj);

    V1Pod pod = ((V1Pod) this.obj);
    List indexedObjectList = cache.byIndex(mockIndexName, this.index);
    assertThat(indexedObjectList).isEmpty();
    assertThat(pod.getMetadata().getResourceVersion()).isEqualTo(null);

    cache.add(this.obj);

    // replace cached object w/ null value
    String newClusterName = "test_cluster";
    pod.getMetadata().setResourceVersion(newClusterName);
    cache.update(this.obj);

    assertThat(cache.list()).hasSize(1);
    assertThat(pod.getMetadata().getResourceVersion()).isEqualTo(newClusterName);
  }

  @MethodSource("data")
  @ParameterizedTest
  void multiIndexFuncCacheStore(KubernetesObject obj, String index) {
    initCacheTest(obj, index);
    String testIndexFuncName = "test-idx-func";
    Cache<V1Pod> podCache = new Cache<>();
    podCache.addIndexFunc(
        testIndexFuncName,
        (V1Pod pod) -> {
          return Arrays.asList(pod.getSpec().getNodeName());
        });

    V1Pod testPod =
        new V1Pod()
            .metadata(new V1ObjectMeta().namespace("ns").name("n"))
            .spec(new V1PodSpec().nodeName("node1"));
    podCache.add(testPod);

    List<V1Pod> namespaceIndexedPods = podCache.byIndex(Caches.NAMESPACE_INDEX, "ns");
    assertThat(namespaceIndexedPods).hasSize(1);

    List<V1Pod> nodeNameIndexedPods = podCache.byIndex(testIndexFuncName, "node1");
    assertThat(nodeNameIndexedPods).hasSize(1);
  }

  @MethodSource("data")
  @ParameterizedTest
  void addIndexers(KubernetesObject obj, String index) {
    initCacheTest(obj, index);
    Cache<V1Pod> podCache = new Cache<>();

    String nodeIndex = "node-index";

    Map<String, Function<V1Pod, List<String>>> indexers = new HashMap<>();

    indexers.put(
        nodeIndex,
        (V1Pod pod) -> {
          return Arrays.asList(pod.getSpec().getNodeName());
        });

    podCache.addIndexers(indexers);

    V1Pod testPod =
        new V1Pod()
            .metadata(new V1ObjectMeta().namespace("ns").name("n"))
            .spec(new V1PodSpec().nodeName("node1"));

    podCache.add(testPod);

    List<V1Pod> namespaceIndexedPods = podCache.byIndex(Caches.NAMESPACE_INDEX, "ns");
    assertThat(namespaceIndexedPods).hasSize(1);

    List<V1Pod> nodeNameIndexedPods = podCache.byIndex(nodeIndex, "node1");
    assertThat(nodeNameIndexedPods).hasSize(1);
  }
}
