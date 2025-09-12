package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceTaintRuleSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha3DeviceTaintRuleSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceTaintRuleSpecFluent() {
  }
  
  public V1alpha3DeviceTaintRuleSpecFluent(V1alpha3DeviceTaintRuleSpec instance) {
    this.copyInstance(instance);
  }
  private V1alpha3DeviceTaintSelectorBuilder deviceSelector;
  private V1alpha3DeviceTaintBuilder taint;
  
  protected void copyInstance(V1alpha3DeviceTaintRuleSpec instance) {
    instance = instance != null ? instance : new V1alpha3DeviceTaintRuleSpec();
    if (instance != null) {
        this.withDeviceSelector(instance.getDeviceSelector());
        this.withTaint(instance.getTaint());
    }
  }
  
  public V1alpha3DeviceTaintSelector buildDeviceSelector() {
    return this.deviceSelector != null ? this.deviceSelector.build() : null;
  }
  
  public A withDeviceSelector(V1alpha3DeviceTaintSelector deviceSelector) {
    this._visitables.remove("deviceSelector");
    if (deviceSelector != null) {
        this.deviceSelector = new V1alpha3DeviceTaintSelectorBuilder(deviceSelector);
        this._visitables.get("deviceSelector").add(this.deviceSelector);
    } else {
        this.deviceSelector = null;
        this._visitables.get("deviceSelector").remove(this.deviceSelector);
    }
    return (A) this;
  }
  
  public boolean hasDeviceSelector() {
    return this.deviceSelector != null;
  }
  
  public DeviceSelectorNested<A> withNewDeviceSelector() {
    return new DeviceSelectorNested(null);
  }
  
  public DeviceSelectorNested<A> withNewDeviceSelectorLike(V1alpha3DeviceTaintSelector item) {
    return new DeviceSelectorNested(item);
  }
  
  public DeviceSelectorNested<A> editDeviceSelector() {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(null));
  }
  
  public DeviceSelectorNested<A> editOrNewDeviceSelector() {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(new V1alpha3DeviceTaintSelectorBuilder().build()));
  }
  
  public DeviceSelectorNested<A> editOrNewDeviceSelectorLike(V1alpha3DeviceTaintSelector item) {
    return this.withNewDeviceSelectorLike(Optional.ofNullable(this.buildDeviceSelector()).orElse(item));
  }
  
  public V1alpha3DeviceTaint buildTaint() {
    return this.taint != null ? this.taint.build() : null;
  }
  
  public A withTaint(V1alpha3DeviceTaint taint) {
    this._visitables.remove("taint");
    if (taint != null) {
        this.taint = new V1alpha3DeviceTaintBuilder(taint);
        this._visitables.get("taint").add(this.taint);
    } else {
        this.taint = null;
        this._visitables.get("taint").remove(this.taint);
    }
    return (A) this;
  }
  
  public boolean hasTaint() {
    return this.taint != null;
  }
  
  public TaintNested<A> withNewTaint() {
    return new TaintNested(null);
  }
  
  public TaintNested<A> withNewTaintLike(V1alpha3DeviceTaint item) {
    return new TaintNested(item);
  }
  
  public TaintNested<A> editTaint() {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(null));
  }
  
  public TaintNested<A> editOrNewTaint() {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(new V1alpha3DeviceTaintBuilder().build()));
  }
  
  public TaintNested<A> editOrNewTaintLike(V1alpha3DeviceTaint item) {
    return this.withNewTaintLike(Optional.ofNullable(this.buildTaint()).orElse(item));
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
    V1alpha3DeviceTaintRuleSpecFluent that = (V1alpha3DeviceTaintRuleSpecFluent) o;
    if (!(Objects.equals(deviceSelector, that.deviceSelector))) {
      return false;
    }
    if (!(Objects.equals(taint, that.taint))) {
      return false;
    }
    return true;
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
  public class DeviceSelectorNested<N> extends V1alpha3DeviceTaintSelectorFluent<DeviceSelectorNested<N>> implements Nested<N>{
    DeviceSelectorNested(V1alpha3DeviceTaintSelector item) {
      this.builder = new V1alpha3DeviceTaintSelectorBuilder(this, item);
    }
    V1alpha3DeviceTaintSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceTaintRuleSpecFluent.this.withDeviceSelector(builder.build());
    }
    
    public N endDeviceSelector() {
      return and();
    }
    
  
  }
  public class TaintNested<N> extends V1alpha3DeviceTaintFluent<TaintNested<N>> implements Nested<N>{
    TaintNested(V1alpha3DeviceTaint item) {
      this.builder = new V1alpha3DeviceTaintBuilder(this, item);
    }
    V1alpha3DeviceTaintBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceTaintRuleSpecFluent.this.withTaint(builder.build());
    }
    
    public N endTaint() {
      return and();
    }
    
  
  }

}