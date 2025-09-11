package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceClaimConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfigurationFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceClaimConfigurationFluent() {
  }
  
  public V1beta1DeviceClaimConfigurationFluent(V1beta1DeviceClaimConfiguration instance) {
    this.copyInstance(instance);
  }
  private V1beta1OpaqueDeviceConfigurationBuilder opaque;
  private List<String> requests;
  
  protected void copyInstance(V1beta1DeviceClaimConfiguration instance) {
    instance = instance != null ? instance : new V1beta1DeviceClaimConfiguration();
    if (instance != null) {
        this.withOpaque(instance.getOpaque());
        this.withRequests(instance.getRequests());
    }
  }
  
  public V1beta1OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  public A withOpaque(V1beta1OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1beta1OpaqueDeviceConfigurationBuilder(opaque);
        this._visitables.get("opaque").add(this.opaque);
    } else {
        this.opaque = null;
        this._visitables.get("opaque").remove(this.opaque);
    }
    return (A) this;
  }
  
  public boolean hasOpaque() {
    return this.opaque != null;
  }
  
  public OpaqueNested<A> withNewOpaque() {
    return new OpaqueNested(null);
  }
  
  public OpaqueNested<A> withNewOpaqueLike(V1beta1OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public OpaqueNested<A> editOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(new V1beta1OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1beta1OpaqueDeviceConfiguration item) {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(item));
  }
  
  public A addToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.add(index, item);
    return (A) this;
  }
  
  public A setToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.set(index, item);
    return (A) this;
  }
  
  public A addToRequests(String... items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (String item : items) {
      this.requests.add(item);
    }
    return (A) this;
  }
  
  public A addAllToRequests(Collection<String> items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (String item : items) {
      this.requests.add(item);
    }
    return (A) this;
  }
  
  public A removeFromRequests(String... items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (String item : items) {
      this.requests.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromRequests(Collection<String> items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (String item : items) {
      this.requests.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getRequests() {
    return this.requests;
  }
  
  public String getRequest(int index) {
    return this.requests.get(index);
  }
  
  public String getFirstRequest() {
    return this.requests.get(0);
  }
  
  public String getLastRequest() {
    return this.requests.get(requests.size() - 1);
  }
  
  public String getMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<String> requests) {
    if (requests != null) {
        this.requests = new ArrayList();
        for (String item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(String... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (String item : requests) {
        this.addToRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !(this.requests.isEmpty());
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
    V1beta1DeviceClaimConfigurationFluent that = (V1beta1DeviceClaimConfigurationFluent) o;
    if (!(Objects.equals(opaque, that.opaque))) {
      return false;
    }
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(opaque, requests);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(opaque == null)) {
        sb.append("opaque:");
        sb.append(opaque);
        sb.append(",");
    }
    if (!(requests == null) && !(requests.isEmpty())) {
        sb.append("requests:");
        sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
  public class OpaqueNested<N> extends V1beta1OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
    OpaqueNested(V1beta1OpaqueDeviceConfiguration item) {
      this.builder = new V1beta1OpaqueDeviceConfigurationBuilder(this, item);
    }
    V1beta1OpaqueDeviceConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta1DeviceClaimConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  
  }

}