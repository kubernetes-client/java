package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceClaimConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceClaimConfigurationFluent<A>> extends BaseFluent<A>{

  private V1beta2OpaqueDeviceConfigurationBuilder opaque;
  private List<String> requests;

  public V1beta2DeviceClaimConfigurationFluent() {
  }
  
  public V1beta2DeviceClaimConfigurationFluent(V1beta2DeviceClaimConfiguration instance) {
    this.copyInstance(instance);
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
  
  public A addToRequests(String... items) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    for (String item : items) {
      this.requests.add(item);
    }
    return (A) this;
  }
  
  public A addToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.add(index, item);
    return (A) this;
  }
  
  public V1beta2OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  protected void copyInstance(V1beta2DeviceClaimConfiguration instance) {
    instance = instance != null ? instance : new V1beta2DeviceClaimConfiguration();
    if (instance != null) {
        this.withOpaque(instance.getOpaque());
        this.withRequests(instance.getRequests());
    }
  }
  
  public OpaqueNested<A> editOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(new V1beta2OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(item));
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
    V1beta2DeviceClaimConfigurationFluent that = (V1beta2DeviceClaimConfigurationFluent) o;
    if (!(Objects.equals(opaque, that.opaque))) {
      return false;
    }
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
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
  
  public String getRequest(int index) {
    return this.requests.get(index);
  }
  
  public List<String> getRequests() {
    return this.requests;
  }
  
  public boolean hasMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasOpaque() {
    return this.opaque != null;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !(this.requests.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(opaque, requests);
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
  
  public A removeFromRequests(String... items) {
    if (this.requests == null) {
      return (A) this;
    }
    for (String item : items) {
      this.requests.remove(item);
    }
    return (A) this;
  }
  
  public A setToRequests(int index,String item) {
    if (this.requests == null) {
      this.requests = new ArrayList();
    }
    this.requests.set(index, item);
    return (A) this;
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
  
  public OpaqueNested<A> withNewOpaque() {
    return new OpaqueNested(null);
  }
  
  public OpaqueNested<A> withNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public A withOpaque(V1beta2OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1beta2OpaqueDeviceConfigurationBuilder(opaque);
        this._visitables.get("opaque").add(this.opaque);
    } else {
        this.opaque = null;
        this._visitables.get("opaque").remove(this.opaque);
    }
    return (A) this;
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
  public class OpaqueNested<N> extends V1beta2OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
  
    V1beta2OpaqueDeviceConfigurationBuilder builder;
  
    OpaqueNested(V1beta2OpaqueDeviceConfiguration item) {
      this.builder = new V1beta2OpaqueDeviceConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2DeviceClaimConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  }
}