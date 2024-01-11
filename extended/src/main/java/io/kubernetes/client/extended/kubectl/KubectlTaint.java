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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.util.taints.Taints;
import io.kubernetes.client.util.taints.Taints.TaintsBuilder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class KubectlTaint extends Kubectl.ResourceBuilder<V1Node, KubectlTaint>
    implements Kubectl.Executable<V1Node> {

  private final Map<String, Pair<String, String>> addingTaints;
  private final Map<String, String> removeTaints;

  KubectlTaint() {
    super(V1Node.class);
    this.addingTaints = new HashMap<>();
    this.removeTaints = new HashMap<>();
  }

  public KubectlTaint addTaint(String key, String effect) {
    return addTaint(key, null, effect);
  }

  public KubectlTaint addTaint(String key, String value, String effect) {
    addingTaints.put(key, new ImmutablePair<>(value, effect));
    return this;
  }

  public KubectlTaint removeTaint(String key) {
    removeTaints.put(key, null);
    return this;
  }

  public KubectlTaint removeTaint(String key, String effect) {
    removeTaints.put(key, effect);
    return this;
  }

  @Override
  public V1Node execute() throws KubectlException {
    verifyArguments();
    try {
      return executeInternal();
    } catch (ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
  }

  private V1Node executeInternal() throws KubectlException, ApiException, IOException {
    CoreV1Api v1 = new CoreV1Api(apiClient);
    V1Node node = v1.readNode(name).execute();

    TaintsBuilder builder = Taints.taints(node);
    for (Map.Entry<String, Pair<String, String>> taint : addingTaints.entrySet()) {
      builder.addTaint(
          taint.getKey(), taint.getValue().getLeft(), makeEffect(taint.getValue().getRight()));
    }
    for (Map.Entry<String, String> taint : removeTaints.entrySet()) {
      if (taint.getValue() == null) {
        builder.removeTaint(taint.getKey());
      } else {
        builder.removeTaint(taint.getKey(), makeEffect(taint.getValue()));
      }
    }
    return v1.replaceNode(name, node).execute();
  }

  private Taints.Effect makeEffect(String effect) throws KubectlException {
    if (effect.equals(Taints.Effect.NO_SCHEDULE.toString())) {
      return Taints.Effect.NO_SCHEDULE;
    }
    if (effect.equals(Taints.Effect.PREFER_NO_SCHEDULE.toString())) {
      return Taints.Effect.PREFER_NO_SCHEDULE;
    }
    if (effect.equals(Taints.Effect.NO_EXECUTE.toString())) {
      return Taints.Effect.NO_EXECUTE;
    }
    throw new KubectlException("Unknown effect: " + effect);
  }

  private void verifyArguments() throws KubectlException {
    if (null == name) {
      throw new KubectlException("missing name argument");
    }
  }
}
