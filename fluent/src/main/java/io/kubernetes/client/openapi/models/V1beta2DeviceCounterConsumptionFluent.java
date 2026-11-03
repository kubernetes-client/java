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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1beta2DeviceCounterConsumptionFluent<A extends V1beta2DeviceCounterConsumptionFluent<A>> extends BaseFluent<A>{

  private List<String> compatibilityGroups;
  private String counterSet;
  private Map<String,V1beta2Counter> counters;

  public V1beta2DeviceCounterConsumptionFluent() {
  }
  
  public V1beta2DeviceCounterConsumptionFluent(V1beta2DeviceCounterConsumption instance) {
    this.copyInstance(instance);
  }

  public A addAllToCompatibilityGroups(Collection<String> items) {
    if (this.compatibilityGroups == null) {
      this.compatibilityGroups = new ArrayList<>();
    }
    for (String item : items) {
      this.compatibilityGroups.add(item);
    }
    return (A) this;
  }
  
  public A addToCompatibilityGroups(String... items) {
    if (this.compatibilityGroups == null) {
      this.compatibilityGroups = new ArrayList<>();
    }
    for (String item : items) {
      this.compatibilityGroups.add(item);
    }
    return (A) this;
  }
  
  public A addToCompatibilityGroups(int index,String item) {
    if (this.compatibilityGroups == null) {
      this.compatibilityGroups = new ArrayList<>();
    }
    this.compatibilityGroups.add(index, item);
    return (A) this;
  }
  
  public A addToCounters(Map<String,V1beta2Counter> map) {
    if (this.counters == null && map != null) {
      this.counters = new LinkedHashMap<>();
    }
    if (map != null) {
      this.counters.putAll(map);
    }
    return (A) this;
  }
  
  public A addToCounters(String key,V1beta2Counter value) {
    if (this.counters == null && key != null && value != null) {
      this.counters = new LinkedHashMap<>();
    }
    if (key != null && value != null) {
      this.counters.put(key, value);
    }
    return (A) this;
  }
  
  protected void copyInstance(V1beta2DeviceCounterConsumption instance) {
    instance = instance != null ? instance : new V1beta2DeviceCounterConsumption();
    if (instance != null) {
        this.withCompatibilityGroups(instance.getCompatibilityGroups());
        this.withCounterSet(instance.getCounterSet());
        this.withCounters(instance.getCounters());
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
    V1beta2DeviceCounterConsumptionFluent<?> that = (V1beta2DeviceCounterConsumptionFluent<?>) o;
    if (!(Objects.equals(compatibilityGroups, that.compatibilityGroups))) {
      return false;
    }
    if (!(Objects.equals(counterSet, that.counterSet))) {
      return false;
    }
    if (!(Objects.equals(counters, that.counters))) {
      return false;
    }
    return true;
  }
  
  public String getCompatibilityGroup(int index) {
    return this.compatibilityGroups.get(index);
  }
  
  public List<String> getCompatibilityGroups() {
    return this.compatibilityGroups;
  }
  
  public String getCounterSet() {
    return this.counterSet;
  }
  
  public Map<String,V1beta2Counter> getCounters() {
    return this.counters;
  }
  
  public String getFirstCompatibilityGroup() {
    return this.compatibilityGroups.get(0);
  }
  
  public String getLastCompatibilityGroup() {
    return this.compatibilityGroups.get(compatibilityGroups.size() - 1);
  }
  
  public String getMatchingCompatibilityGroup(Predicate<String> predicate) {
      for (String item : compatibilityGroups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasCompatibilityGroups() {
    return this.compatibilityGroups != null && !(this.compatibilityGroups.isEmpty());
  }
  
  public boolean hasCounterSet() {
    return this.counterSet != null;
  }
  
  public boolean hasCounters() {
    return this.counters != null;
  }
  
  public boolean hasMatchingCompatibilityGroup(Predicate<String> predicate) {
      for (String item : compatibilityGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(compatibilityGroups, counterSet, counters);
  }
  
  public A removeAllFromCompatibilityGroups(Collection<String> items) {
    if (this.compatibilityGroups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.compatibilityGroups.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromCompatibilityGroups(String... items) {
    if (this.compatibilityGroups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.compatibilityGroups.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromCounters(String key) {
    if (this.counters == null) {
      return (A) this;
    }
    if (key != null && this.counters != null) {
      this.counters.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromCounters(Map<String,V1beta2Counter> map) {
    if (this.counters == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.counters != null) {
          this.counters.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A setToCompatibilityGroups(int index,String item) {
    if (this.compatibilityGroups == null) {
      this.compatibilityGroups = new ArrayList<>();
    }
    this.compatibilityGroups.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(compatibilityGroups == null) && !(compatibilityGroups.isEmpty())) {
        sb.append("compatibilityGroups:");
        sb.append(compatibilityGroups);
        sb.append(",");
    }
    if (!(counterSet == null)) {
        sb.append("counterSet:");
        sb.append(counterSet);
        sb.append(",");
    }
    if (!(counters == null) && !(counters.isEmpty())) {
        sb.append("counters:");
        sb.append(counters);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCompatibilityGroups(List<String> compatibilityGroups) {
    if (compatibilityGroups != null) {
        this.compatibilityGroups = new ArrayList<>();
        for (String item : compatibilityGroups) {
          this.addToCompatibilityGroups(item);
        }
    } else {
      this.compatibilityGroups = null;
    }
    return (A) this;
  }
  
  public A withCompatibilityGroups(String... compatibilityGroups) {
    if (this.compatibilityGroups != null) {
        this.compatibilityGroups.clear();
        _visitables.remove("compatibilityGroups");
    }
    if (compatibilityGroups != null) {
      for (String item : compatibilityGroups) {
        this.addToCompatibilityGroups(item);
      }
    }
    return (A) this;
  }
  
  public A withCounterSet(String counterSet) {
    this.counterSet = counterSet;
    return (A) this;
  }
  
  public <K,V>A withCounters(Map<String,V1beta2Counter> counters) {
    if (counters == null) {
      this.counters = null;
    } else {
      this.counters = new LinkedHashMap<>(counters);
    }
    return (A) this;
  }
  
}