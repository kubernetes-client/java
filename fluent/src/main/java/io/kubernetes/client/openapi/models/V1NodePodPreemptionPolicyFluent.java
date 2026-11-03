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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1NodePodPreemptionPolicyFluent<A extends V1NodePodPreemptionPolicyFluent<A>> extends BaseFluent<A>{

  private List<String> disableResizePreemption;

  public V1NodePodPreemptionPolicyFluent() {
  }
  
  public V1NodePodPreemptionPolicyFluent(V1NodePodPreemptionPolicy instance) {
    this.copyInstance(instance);
  }

  public A addAllToDisableResizePreemption(Collection<String> items) {
    if (this.disableResizePreemption == null) {
      this.disableResizePreemption = new ArrayList<>();
    }
    for (String item : items) {
      this.disableResizePreemption.add(item);
    }
    return (A) this;
  }
  
  public A addToDisableResizePreemption(String... items) {
    if (this.disableResizePreemption == null) {
      this.disableResizePreemption = new ArrayList<>();
    }
    for (String item : items) {
      this.disableResizePreemption.add(item);
    }
    return (A) this;
  }
  
  public A addToDisableResizePreemption(int index,String item) {
    if (this.disableResizePreemption == null) {
      this.disableResizePreemption = new ArrayList<>();
    }
    this.disableResizePreemption.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1NodePodPreemptionPolicy instance) {
    instance = instance != null ? instance : new V1NodePodPreemptionPolicy();
    if (instance != null) {
      this.withDisableResizePreemption(instance.getDisableResizePreemption());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1NodePodPreemptionPolicyFluent<?> that = (V1NodePodPreemptionPolicyFluent<?>) o;
    if (!(Objects.equals(disableResizePreemption, that.disableResizePreemption))) {
      return false;
    }
    return true;
  }
  
  public List<String> getDisableResizePreemption() {
    return this.disableResizePreemption;
  }
  
  public String getDisableResizePreemption(int index) {
    return this.disableResizePreemption.get(index);
  }
  
  public String getFirstDisableResizePreemption() {
    return this.disableResizePreemption.get(0);
  }
  
  public String getLastDisableResizePreemption() {
    return this.disableResizePreemption.get(disableResizePreemption.size() - 1);
  }
  
  public String getMatchingDisableResizePreemption(Predicate<String> predicate) {
      for (String item : disableResizePreemption) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasDisableResizePreemption() {
    return this.disableResizePreemption != null && !(this.disableResizePreemption.isEmpty());
  }
  
  public boolean hasMatchingDisableResizePreemption(Predicate<String> predicate) {
      for (String item : disableResizePreemption) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(disableResizePreemption);
  }
  
  public A removeAllFromDisableResizePreemption(Collection<String> items) {
    if (this.disableResizePreemption == null) {
      return (A) this;
    }
    for (String item : items) {
      this.disableResizePreemption.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromDisableResizePreemption(String... items) {
    if (this.disableResizePreemption == null) {
      return (A) this;
    }
    for (String item : items) {
      this.disableResizePreemption.remove(item);
    }
    return (A) this;
  }
  
  public A setToDisableResizePreemption(int index,String item) {
    if (this.disableResizePreemption == null) {
      this.disableResizePreemption = new ArrayList<>();
    }
    this.disableResizePreemption.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(disableResizePreemption == null) && !(disableResizePreemption.isEmpty())) {
        sb.append("disableResizePreemption:");
        sb.append(disableResizePreemption);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDisableResizePreemption(List<String> disableResizePreemption) {
    if (disableResizePreemption != null) {
        this.disableResizePreemption = new ArrayList<>();
        for (String item : disableResizePreemption) {
          this.addToDisableResizePreemption(item);
        }
    } else {
      this.disableResizePreemption = null;
    }
    return (A) this;
  }
  
  public A withDisableResizePreemption(String... disableResizePreemption) {
    if (this.disableResizePreemption != null) {
        this.disableResizePreemption.clear();
        _visitables.remove("disableResizePreemption");
    }
    if (disableResizePreemption != null) {
      for (String item : disableResizePreemption) {
        this.addToDisableResizePreemption(item);
      }
    }
    return (A) this;
  }
  
}