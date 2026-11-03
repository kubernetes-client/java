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
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1DeviceTaintRuleSpecFluent<A extends V1DeviceTaintRuleSpecFluent<A>> extends BaseFluent<A>{

  private V1DeviceTaintSelectorBuilder deviceSelector;
  private V1DeviceTaintBuilder taint;

  public V1DeviceTaintRuleSpecFluent() {
  }
  
  public V1DeviceTaintRuleSpecFluent(V1DeviceTaintRuleSpec instance) {
    this.copyInstance(instance);
  }

  public V1DeviceTaintSelector buildDeviceSelector() {
    return this.deviceSelector != null ? this.deviceSelector.build() : null;
  }
  
  public V1DeviceTaint buildTaint() {
    return this.taint != null ? this.taint.build() : null;
  }
  
  protected void copyInstance(V1DeviceTaintRuleSpec instance) {
    instance = instance != null ? instance : new V1DeviceTaintRuleSpec();
    if (instance != null) {
        this.withDeviceSelector(instance.getDeviceSelector());
        this.withTaint(instance.getTaint());
    }
  }
  
  public DeviceSelectorNested<A> editDeviceSelector() {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(null));
  }
  
  public DeviceSelectorNested<A> editOrNewDeviceSelector() {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(new V1DeviceTaintSelectorBuilder().build()));
  }
  
  public DeviceSelectorNested<A> editOrNewDeviceSelectorLike(V1DeviceTaintSelector item) {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(item));
  }
  
  public TaintNested<A> editOrNewTaint() {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(new V1DeviceTaintBuilder().build()));
  }
  
  public TaintNested<A> editOrNewTaintLike(V1DeviceTaint item) {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(item));
  }
  
  public TaintNested<A> editTaint() {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(null));
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
    V1DeviceTaintRuleSpecFluent<?> that = (V1DeviceTaintRuleSpecFluent<?>) o;
    if (!(Objects.equals(deviceSelector, that.deviceSelector))) {
      return false;
    }
    if (!(Objects.equals(taint, that.taint))) {
      return false;
    }
    return true;
  }
  
  public boolean hasDeviceSelector() {
    return this.deviceSelector != null;
  }
  
  public boolean hasTaint() {
    return this.taint != null;
  }
  
  public int hashCode() {
    return Objects.hash(deviceSelector, taint);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(deviceSelector == null)) {
        sb.append("deviceSelector:");
        sb.append(deviceSelector);
        sb.append(",");
    }
    if (!(taint == null)) {
        sb.append("taint:");
        sb.append(taint);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDeviceSelector(V1DeviceTaintSelector deviceSelector) {
    this._visitables.remove("deviceSelector");
    if (deviceSelector != null) {
        this.deviceSelector = new V1DeviceTaintSelectorBuilder(deviceSelector);
        this._visitables.get("deviceSelector").add(this.deviceSelector);
    } else {
        this._visitables.get("deviceSelector").remove(this.deviceSelector);
        this.deviceSelector = null;
    }
    return (A) this;
  }
  
  public DeviceSelectorNested<A> withNewDeviceSelector() {
    return new DeviceSelectorNested<>(null);
  }
  
  public DeviceSelectorNested<A> withNewDeviceSelectorLike(V1DeviceTaintSelector item) {
    return new DeviceSelectorNested<>(item);
  }
  
  public TaintNested<A> withNewTaint() {
    return new TaintNested<>(null);
  }
  
  public TaintNested<A> withNewTaintLike(V1DeviceTaint item) {
    return new TaintNested<>(item);
  }
  
  public A withTaint(V1DeviceTaint taint) {
    this._visitables.remove("taint");
    if (taint != null) {
        this.taint = new V1DeviceTaintBuilder(taint);
        this._visitables.get("taint").add(this.taint);
    } else {
        this._visitables.get("taint").remove(this.taint);
        this.taint = null;
    }
    return (A) this;
  }
  public class DeviceSelectorNested<N> extends V1DeviceTaintSelectorFluent<DeviceSelectorNested<N>> implements Nested<N>{
  
    V1DeviceTaintSelectorBuilder builder;
  
    DeviceSelectorNested(V1DeviceTaintSelector item) {
      this.builder = new V1DeviceTaintSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceTaintRuleSpecFluent.this.withDeviceSelector(builder.build());
    }
    
    public N endDeviceSelector() {
      return and();
    }
    
  }
  public class TaintNested<N> extends V1DeviceTaintFluent<TaintNested<N>> implements Nested<N>{
  
    V1DeviceTaintBuilder builder;
  
    TaintNested(V1DeviceTaint item) {
      this.builder = new V1DeviceTaintBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceTaintRuleSpecFluent.this.withTaint(builder.build());
    }
    
    public N endTaint() {
      return and();
    }
    
  }
}