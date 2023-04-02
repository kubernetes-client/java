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

import static org.junit.Assert.*;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ListerTest {
  @Test
  public void testListerBasic() {
    Cache<V1Pod> podCache = new Cache<>();

    Lister<V1Pod> namespacedPodLister = new Lister<>(podCache, "default");
    List<V1Pod> emptyPodList = namespacedPodLister.list();
    assertEquals(0, emptyPodList.size());

    podCache.replace(
        Arrays.asList(
            new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default")),
            new V1Pod().metadata(new V1ObjectMeta().name("foo2").namespace("default")),
            new V1Pod().metadata(new V1ObjectMeta().name("foo3").namespace("default"))),
        "0");
    List<V1Pod> namespacedPodList = namespacedPodLister.list();
    assertEquals(3, namespacedPodList.size());

    Lister<V1Pod> allNamespacedPodLister = new Lister<>(podCache);
    List<V1Pod> allPodList = allNamespacedPodLister.list();
    assertEquals(3, allPodList.size());

    namespacedPodList = allNamespacedPodLister.namespace("default").list();
    assertEquals(3, namespacedPodList.size());
  }
}
