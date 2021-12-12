package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1EventSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1EventSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1EventSourceFluent<A>{
  public V1EventSourceFluentImpl() {
  }
  public V1EventSourceFluentImpl(io.kubernetes.client.openapi.models.V1EventSource instance) {
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

  }
  private java.lang.String component;
  private java.lang.String host;
  public java.lang.String getComponent() {
    return this.component;
  }
  public A withComponent(java.lang.String component) {
    this.component=component; return (A) this;
  }
  public java.lang.Boolean hasComponent() {
    return this.component != null;
  }
  
  /**
   * Method is deprecated. use withComponent instead.
   */
  @java.lang.Deprecated
  public A withNewComponent(java.lang.String original) {
    return (A)withComponent(new String(original));
  }
  public java.lang.String getHost() {
    return this.host;
  }
  public A withHost(java.lang.String host) {
    this.host=host; return (A) this;
  }
  public java.lang.Boolean hasHost() {
    return this.host != null;
  }
  
  /**
   * Method is deprecated. use withHost instead.
   */
  @java.lang.Deprecated
  public A withNewHost(java.lang.String original) {
    return (A)withHost(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EventSourceFluentImpl that = (V1EventSourceFluentImpl) o;
    if (component != null ? !component.equals(that.component) :that.component != null) return false;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(component,  host,  super.hashCode());
  }
  
}