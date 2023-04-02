package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NodeDaemonEndpointsFluentImpl<A extends V1NodeDaemonEndpointsFluent<A>> extends BaseFluent<A> implements V1NodeDaemonEndpointsFluent<A>{
  public V1NodeDaemonEndpointsFluentImpl() {
  }
  public V1NodeDaemonEndpointsFluentImpl(V1NodeDaemonEndpoints instance) {
    this.withKubeletEndpoint(instance.getKubeletEndpoint());

  }
  private V1DaemonEndpointBuilder kubeletEndpoint;
  
  /**
   * This method has been deprecated, please use method buildKubeletEndpoint instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonEndpoint getKubeletEndpoint() {
    return this.kubeletEndpoint!=null ?this.kubeletEndpoint.build():null;
  }
  public V1DaemonEndpoint buildKubeletEndpoint() {
    return this.kubeletEndpoint!=null ?this.kubeletEndpoint.build():null;
  }
  public A withKubeletEndpoint(V1DaemonEndpoint kubeletEndpoint) {
    _visitables.get("kubeletEndpoint").remove(this.kubeletEndpoint);
    if (kubeletEndpoint!=null){ this.kubeletEndpoint= new V1DaemonEndpointBuilder(kubeletEndpoint); _visitables.get("kubeletEndpoint").add(this.kubeletEndpoint);} else { this.kubeletEndpoint = null; _visitables.get("kubeletEndpoint").remove(this.kubeletEndpoint); } return (A) this;
  }
  public Boolean hasKubeletEndpoint() {
    return this.kubeletEndpoint != null;
  }
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint() {
    return new V1NodeDaemonEndpointsFluentImpl.KubeletEndpointNestedImpl();
  }
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(V1DaemonEndpoint item) {
    return new V1NodeDaemonEndpointsFluentImpl.KubeletEndpointNestedImpl(item);
  }
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint() {
    return withNewKubeletEndpointLike(getKubeletEndpoint());
  }
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint() {
    return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): new V1DaemonEndpointBuilder().build());
  }
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(V1DaemonEndpoint item) {
    return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeDaemonEndpointsFluentImpl that = (V1NodeDaemonEndpointsFluentImpl) o;
    if (kubeletEndpoint != null ? !kubeletEndpoint.equals(that.kubeletEndpoint) :that.kubeletEndpoint != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(kubeletEndpoint,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (kubeletEndpoint != null) { sb.append("kubeletEndpoint:"); sb.append(kubeletEndpoint); }
    sb.append("}");
    return sb.toString();
  }
  class KubeletEndpointNestedImpl<N> extends V1DaemonEndpointFluentImpl<V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>> implements V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>,Nested<N>{
    KubeletEndpointNestedImpl(V1DaemonEndpoint item) {
      this.builder = new V1DaemonEndpointBuilder(this, item);
    }
    KubeletEndpointNestedImpl() {
      this.builder = new V1DaemonEndpointBuilder(this);
    }
    V1DaemonEndpointBuilder builder;
    public N and() {
      return (N) V1NodeDaemonEndpointsFluentImpl.this.withKubeletEndpoint(builder.build());
    }
    public N endKubeletEndpoint() {
      return and();
    }
    
  }
  
}