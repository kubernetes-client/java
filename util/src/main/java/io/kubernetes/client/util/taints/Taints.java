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

import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeSpec;
import io.kubernetes.client.openapi.models.V1Taint;
import java.util.Iterator;

public class Taints {

  public enum Effect {
    NO_SCHEDULE {
      public String toString() {
        return "NoSchedule";
      }
    },
    PREFER_NO_SCHEDULE {
      public String toString() {
        return "PreferNoSchedule";
      }
    },
    NO_EXECUTE {
      public String toString() {
        return "NoExecute";
      }
    }
  }

  public static V1Taint findTaint(V1Node node, String key, Effect effect) {
    for (V1Taint taint : node.getSpec().getTaints()) {
      if (taint.getKey().equals(key) && taint.getEffect().equals(effect.toString())) {
        return taint;
      }
    }
    return null;
  }

  public static TaintsBuilder taints(V1Node node) {
    return new TaintsBuilder(node);
  }

  public static class TaintsBuilder {
    private V1Node node;

    TaintsBuilder(V1Node node) {
      this.node = node;
    }

    /**
     * Add a taint to a node
     *
     * @param key The key for the taint
     * @param effect The effect
     */
    public TaintsBuilder addTaint(String key, Effect effect) {
      return addTaint(key, null, effect);
    }

    /**
     * Add a taint to a node
     *
     * @param key The key for the taint
     * @param effect The effect
     */
    public TaintsBuilder addTaint(String key, String value, Effect effect) {
      V1Taint taint = new V1Taint();
      taint.setKey(key);
      taint.setValue(value);
      taint.setEffect(effect.toString());
      if (node.getSpec() == null) {
        node.setSpec(new V1NodeSpec());
      }
      node.getSpec().addTaintsItem(taint);
      return this;
    }

    /**
     * Add a taint to a node
     *
     * @param key The key for the taint
     * @param effect The effect
     */
    public TaintsBuilder updateTaint(String key, String value, Effect effect) {
      V1Taint taint = findTaint(node, key, effect);
      taint.setValue(value);
      return this;
    }

    /**
     * Remove all taints matching a specified key
     *
     * @param key: The key for the taint(s) to remove
     */
    public TaintsBuilder removeTaint(String key) {
      if (node.getSpec() == null) {
        return this;
      }
      Iterator<V1Taint> taints = node.getSpec().getTaints().iterator();
      while (taints.hasNext()) {
        V1Taint taint = taints.next();
        if (taint.getKey().equals(key)) {
          taints.remove();
        }
      }
      return this;
    }

    /**
     * Remove a taint matching a key and an effect
     *
     * @param key They key to match
     * @param effect The effect to match
     */
    public TaintsBuilder removeTaint(String key, Effect effect) {
      if (node.getSpec() == null) {
        return this;
      }
      Iterator<V1Taint> taints = node.getSpec().getTaints().iterator();
      while (taints.hasNext()) {
        V1Taint taint = taints.next();
        if (taint.getKey().equals(key) && taint.getEffect().equals(effect.toString())) {
          taints.remove();
        }
      }
      return this;
    }
  }
}
