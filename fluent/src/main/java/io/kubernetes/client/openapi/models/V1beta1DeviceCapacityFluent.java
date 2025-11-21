package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceCapacityFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceCapacityFluent<A>> extends BaseFluent<A>{

  private V1beta1CapacityRequestPolicyBuilder requestPolicy;
  private Quantity value;

  public V1beta1DeviceCapacityFluent() {
  }
  
  public V1beta1DeviceCapacityFluent(V1beta1DeviceCapacity instance) {
    this.copyInstance(instance);
  }

  public V1beta1CapacityRequestPolicy buildRequestPolicy() {
    return this.requestPolicy != null ? this.requestPolicy.build() : null;
  }
  
  protected void copyInstance(V1beta1DeviceCapacity instance) {
    instance = instance != null ? instance : new V1beta1DeviceCapacity();
    if (instance != null) {
        this.withRequestPolicy(instance.getRequestPolicy());
        this.withValue(instance.getValue());
    }
  }
  
  public RequestPolicyNested<A> editOrNewRequestPolicy() {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(new V1beta1CapacityRequestPolicyBuilder().build()));
  }
  
  public RequestPolicyNested<A> editOrNewRequestPolicyLike(V1beta1CapacityRequestPolicy item) {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(item));
  }
  
  public RequestPolicyNested<A> editRequestPolicy() {
    return this.withNewRequestPolicyLike(Optional.ofNullable(this.buildRequestPolicy()).orElse(null));
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
    V1beta1DeviceCapacityFluent that = (V1beta1DeviceCapacityFluent) o;
    if (!(Objects.equals(requestPolicy, that.requestPolicy))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public Quantity getValue() {
    return this.value;
  }
  
  public boolean hasRequestPolicy() {
    return this.requestPolicy != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
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
  
  public RequestPolicyNested<A> withNewRequestPolicy() {
    return new RequestPolicyNested(null);
  }
  
  public RequestPolicyNested<A> withNewRequestPolicyLike(V1beta1CapacityRequestPolicy item) {
    return new RequestPolicyNested(item);
  }
  
  public A withNewValue(String value) {
    return (A) this.withValue(new Quantity(value));
  }
  
  public A withRequestPolicy(V1beta1CapacityRequestPolicy requestPolicy) {
    this._visitables.remove("requestPolicy");
    if (requestPolicy != null) {
        this.requestPolicy = new V1beta1CapacityRequestPolicyBuilder(requestPolicy);
        this._visitables.get("requestPolicy").add(this.requestPolicy);
    } else {
        this.requestPolicy = null;
        this._visitables.get("requestPolicy").remove(this.requestPolicy);
    }
    return (A) this;
  }
  
  public A withValue(Quantity value) {
    this.value = value;
    return (A) this;
  }
  public class RequestPolicyNested<N> extends V1beta1CapacityRequestPolicyFluent<RequestPolicyNested<N>> implements Nested<N>{
  
    V1beta1CapacityRequestPolicyBuilder builder;
  
    RequestPolicyNested(V1beta1CapacityRequestPolicy item) {
      this.builder = new V1beta1CapacityRequestPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1DeviceCapacityFluent.this.withRequestPolicy(builder.build());
    }
    
    public N endRequestPolicy() {
      return and();
    }
    
  }
}