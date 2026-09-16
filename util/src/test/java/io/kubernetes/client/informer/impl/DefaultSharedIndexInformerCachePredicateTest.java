/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.informer.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.cache.Cache;
import io.kubernetes.client.informer.cache.DeltaFIFO;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.jupiter.api.Test;

class DefaultSharedIndexInformerCachePredicateTest {

  private static V1Pod pod(String name, String scope) {
    return new V1Pod()
        .metadata(
            new V1ObjectMeta().namespace("default").name(name).labels(Map.of("scope", scope)));
  }

  @Test
  void handleDeltasShouldRespectCachePredicateForAddAndUpdate() {
    Cache<V1Pod> cache =
        new Cache<>(p -> "keep".equals(p.getMetadata().getLabels().get("scope")));
    DefaultSharedIndexInformer<V1Pod, V1PodList> informer =
        new DefaultSharedIndexInformer<>(
            V1Pod.class,
            mock(ListerWatcher.class),
            0,
            cache);

    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> deltas = new ArrayDeque<>();
    deltas.add(MutablePair.of(DeltaFIFO.DeltaType.Added, pod("dropped", "drop")));
    deltas.add(MutablePair.of(DeltaFIFO.DeltaType.Added, pod("kept", "keep")));
    informer.handleDeltas(deltas);

    assertThat(cache.list()).extracting(p -> p.getMetadata().getName()).containsExactly("kept");

    V1Pod becomesDropped = pod("kept", "drop");
    Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>> update = new ArrayDeque<>();
    update.add(MutablePair.of(DeltaFIFO.DeltaType.Updated, becomesDropped));
    informer.handleDeltas(update);

    assertThat(cache.list()).isEmpty();
  }
}
