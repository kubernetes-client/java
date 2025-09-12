package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceCapacityFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceCapacityFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceCapacityFluent() {
  }
  
  public V1beta2DeviceCapacityFluent(V1beta2DeviceCapacity instance) {
    this.copyInstance(instance);
  }
  private V1beta2CapacityRequestPolicyBuilder requestPolicy;
  private Quantity value;
  
  protected void copyInstance(V1beta2DeviceCapacity instance) {
    instance = instance != null ? instance : new V1beta2DeviceCapacity();
    if (instance != null) {
        this.withRequestPolicy(instance.getRequestPolicy());
        this.withValue(instance.getValue());
    }
  }
  
  public V1beta2CapacityRequestPolicy buildRequestPolicy() {
    return this.requestPolicy != null ? this.requestPolicy.build() : null;
  }
  
  public A withRequestPolicy(V1beta2CapacityRequestPolicy requestPolicy) {
    this._visitables.remove("requestPolicy");
    if (requestPolicy != null) {
        this.requestPolicy = new V1beta2CapacityRequestPolicyBuilder(requestPolicy);
        this._visitables.get("requestPolicy").add(this.requestPolicy);
    } else {
        this.requestPolicy = null;
        this._visitables.get("requestPolicy").remove(this.requestPolicy);
    }
    return (A) this;
  }
  
  public boolean hasRequestPolicy() {
    return this.requestPolicy != null;
  }
  
  public RequestPolicyNested<A> withNewRequestPolicy() {
    return new RequestPolicyNested(null);
  }
  
  public RequestPolicyNested<A> withNewRequestPolicyLike(V1beta2CapacityRequestPolicy item) {
    return new RequestPolicyNested(item);
  }
  
  public RequestPolicyNested<A> editRequestPolicy() {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(null));
  }
  
  public RequestPolicyNested<A> editOrNewRequestPolicy() {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(new V1beta2CapacityRequestPolicyBuilder().build()));
  }
  
  public RequestPolicyNested<A> editOrNewRequestPolicyLike(V1beta2CapacityRequestPolicy item) {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(item));
  }
  
  public Quantity getValue() {
    return this.value;
  }
  
  public A withValue(Quantity value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public A withNewValue(String value) {
    return (A) this.withValue(new Quantity(value));
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
    V1beta2DeviceCapacityFluent that = (V1beta2DeviceCapacityFluent) o;
    if (!(Objects.equals(requestPolicy, that.requestPolicy))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(requestPolicy, value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(requestPolicy == null)) {
        sb.append("requestPolicy:");
        sb.append(requestPolicy);
        sb.append(",");
    }
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  public class RequestPolicyNested<N> extends V1beta2CapacityRequestPolicyFluent<RequestPolicyNested<N>> implements Nested<N>{
    RequestPolicyNested(V1beta2CapacityRequestPolicy item) {
      this.builder = new V1beta2CapacityRequestPolicyBuilder(this, item);
    }
    V1beta2CapacityRequestPolicyBuilder builder;
    
    public N and() {
      return (N) V1beta2DeviceCapacityFluent.this.withRequestPolicy(builder.build());
    }
    
    public N endRequestPolicy() {
      return and();
    }
    
  
  }

}