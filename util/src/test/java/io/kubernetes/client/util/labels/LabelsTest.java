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
package io.kubernetes.client.util.labels;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class LabelsTest {

  @Test
  void addLabels() {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta());
    Labels.addLabels(pod, "foo", "bar");
    assertThat("bar").isEqualTo(pod.getMetadata().getLabels().get("foo"));
  }

  @Test
  void addMultipleLabels() {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta());
    Map<String, String> newLabels = new HashMap<>();
    newLabels.put("foo1", "bar1");
    newLabels.put("foo2", "bar2");
    Labels.addLabels(pod, newLabels);
    assertThat("bar1").isEqualTo(pod.getMetadata().getLabels().get("foo1"));
    assertThat("bar2").isEqualTo(pod.getMetadata().getLabels().get("foo2"));
  }
}
