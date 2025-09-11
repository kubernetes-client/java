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
public class V1NodeDaemonEndpointsFluent<A extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<A>> extends BaseFluent<A>{
  public V1NodeDaemonEndpointsFluent() {
  }
  
  public V1NodeDaemonEndpointsFluent(V1NodeDaemonEndpoints instance) {
    this.copyInstance(instance);
  }
  private V1DaemonEndpointBuilder kubeletEndpoint;
  
  protected void copyInstance(V1NodeDaemonEndpoints instance) {
    instance = instance != null ? instance : new V1NodeDaemonEndpoints();
    if (instance != null) {
      this.withKubeletEndpoint(instance.getKubeletEndpoint());
    }
  }
  
  public V1DaemonEndpoint buildKubeletEndpoint() {
    return this.kubeletEndpoint != null ? this.kubeletEndpoint.build() : null;
  }
  
  public A withKubeletEndpoint(V1DaemonEndpoint kubeletEndpoint) {
    this._visitables.remove("kubeletEndpoint");
    if (kubeletEndpoint != null) {
        this.kubeletEndpoint = new V1DaemonEndpointBuilder(kubeletEndpoint);
        this._visitables.get("kubeletEndpoint").add(this.kubeletEndpoint);
    } else {
        this.kubeletEndpoint = null;
        this._visitables.get("kubeletEndpoint").remove(this.kubeletEndpoint);
    }
    return (A) this;
  }
  
  public boolean hasKubeletEndpoint() {
    return this.kubeletEndpoint != null;
  }
  
  public KubeletEndpointNested<A> withNewKubeletEndpoint() {
    return new KubeletEndpointNested(null);
  }
  
  public KubeletEndpointNested<A> withNewKubeletEndpointLike(V1DaemonEndpoint item) {
    return new KubeletEndpointNested(item);
  }
  
  public KubeletEndpointNested<A> editKubeletEndpoint() {
    return this.withNewKubeletEndpointLike(Optional.ofNullable(this.buildKubeletEndpoint()).orElse(null));
  }
  
  public KubeletEndpointNested<A> editOrNewKubeletEndpoint() {
    return this.withNewKubeletEndpointLike(Optional.ofNullable(this.buildKubeletEndpoint()).orElse(new V1DaemonEndpointBuilder().build()));
  }
  
  public KubeletEndpointNested<A> editOrNewKubeletEndpointLike(V1DaemonEndpoint item) {
    return this.withNewKubeletEndpointLike(Optional.ofNullable(this.buildKubeletEndpoint()).orElse(item));
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
    V1NodeDaemonEndpointsFluent that = (V1NodeDaemonEndpointsFluent) o;
    if (!(Objects.equals(kubeletEndpoint, that.kubeletEndpoint))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(kubeletEndpoint);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(kubeletEndpoint == null)) {
        sb.append("kubeletEndpoint:");
        sb.append(kubeletEndpoint);
    }
    sb.append("}");
    return sb.toString();
  }
  public class KubeletEndpointNested<N> extends V1DaemonEndpointFluent<KubeletEndpointNested<N>> implements Nested<N>{
    KubeletEndpointNested(V1DaemonEndpoint item) {
      this.builder = new V1DaemonEndpointBuilder(this, item);
    }
    V1DaemonEndpointBuilder builder;
    
    public N and() {
      return (N) V1NodeDaemonEndpointsFluent.this.withKubeletEndpoint(builder.build());
    }
    
    public N endKubeletEndpoint() {
      return and();
    }
    
  
  }

}