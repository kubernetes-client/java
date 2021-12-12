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
package io.kubernetes.client.util.taints;

import static io.kubernetes.client.openapi.models.V1Taint.EffectEnum.NOEXECUTE;
import static io.kubernetes.client.openapi.models.V1Taint.EffectEnum.NOSCHEDULE;
import static io.kubernetes.client.openapi.models.V1Taint.EffectEnum.PREFERNOSCHEDULE;
import static io.kubernetes.client.util.taints.Taints.taints;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import io.kubernetes.client.openapi.models.V1Node;
import org.junit.Test;

public class TaintsTest {
  @Test
  public void testAddTaints() {
    V1Node node = new V1Node();
    taints(node).addTaint("key1", NOSCHEDULE).addTaint("key2", PREFERNOSCHEDULE);

    assertNotNull(Taints.findTaint(node, "key1", NOSCHEDULE));
    assertNotNull(Taints.findTaint(node, "key2", PREFERNOSCHEDULE));
  }

  @Test
  public void testRemoveTaints() {
    V1Node node = new V1Node();
    taints(node)
        .addTaint("key1", NOSCHEDULE)
        .addTaint("key1", PREFERNOSCHEDULE)
        .addTaint("key1", NOEXECUTE)
        .addTaint("key2", PREFERNOSCHEDULE)
        .addTaint("key3", NOSCHEDULE)
        .addTaint("key3", NOEXECUTE);

    taints(node)
        // Remove all
        .removeTaint("key1")
        // Shouldn't remove, 'effect' is different.
        .removeTaint("key2", NOSCHEDULE)
        // Remove matching
        .removeTaint("key3", NOEXECUTE);

    assertNull(Taints.findTaint(node, "key1", NOSCHEDULE));
    assertNull(Taints.findTaint(node, "key1", PREFERNOSCHEDULE));
    assertNull(Taints.findTaint(node, "key1", NOEXECUTE));
    assertNull(Taints.findTaint(node, "key3", NOEXECUTE));
    assertNotNull(Taints.findTaint(node, "key2", PREFERNOSCHEDULE));
    assertNotNull(Taints.findTaint(node, "key3", NOSCHEDULE));
  }
}
