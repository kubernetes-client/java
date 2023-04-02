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
  public class V1EndpointAddressFluentImpl<A extends V1EndpointAddressFluent<A>> extends BaseFluent<A> implements V1EndpointAddressFluent<A>{
  public V1EndpointAddressFluentImpl() {
  }
  public V1EndpointAddressFluentImpl(V1EndpointAddress instance) {
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

  }
  private String hostname;
  private String ip;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;
  public String getHostname() {
    return this.hostname;
  }
  public A withHostname(String hostname) {
    this.hostname=hostname; return (A) this;
  }
  public Boolean hasHostname() {
    return this.hostname != null;
  }
  public String getIp() {
    return this.ip;
  }
  public A withIp(String ip) {
    this.ip=ip; return (A) this;
  }
  public Boolean hasIp() {
    return this.ip != null;
  }
  public String getNodeName() {
    return this.nodeName;
  }
  public A withNodeName(String nodeName) {
    this.nodeName=nodeName; return (A) this;
  }
  public Boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef() {
    return this.targetRef!=null ?this.targetRef.build():null;
  }
  public V1ObjectReference buildTargetRef() {
    return this.targetRef!=null ?this.targetRef.build():null;
  }
  public A withTargetRef(V1ObjectReference targetRef) {
    _visitables.get("targetRef").remove(this.targetRef);
    if (targetRef!=null){ this.targetRef= new V1ObjectReferenceBuilder(targetRef); _visitables.get("targetRef").add(this.targetRef);} else { this.targetRef = null; _visitables.get("targetRef").remove(this.targetRef); } return (A) this;
  }
  public Boolean hasTargetRef() {
    return this.targetRef != null;
  }
  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef() {
    return new V1EndpointAddressFluentImpl.TargetRefNestedImpl();
  }
  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new V1EndpointAddressFluentImpl.TargetRefNestedImpl(item);
  }
  public V1EndpointAddressFluent.TargetRefNested<A> editTargetRef() {
    return withNewTargetRefLike(getTargetRef());
  }
  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef() {
    return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): new V1ObjectReferenceBuilder().build());
  }
  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return withNewTargetRefLike(getTargetRef() != null ? getTargetRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EndpointAddressFluentImpl that = (V1EndpointAddressFluentImpl) o;
    if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
    if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
    if (targetRef != null ? !targetRef.equals(that.targetRef) :that.targetRef != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hostname,  ip,  nodeName,  targetRef,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hostname != null) { sb.append("hostname:"); sb.append(hostname + ","); }
    if (ip != null) { sb.append("ip:"); sb.append(ip + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (targetRef != null) { sb.append("targetRef:"); sb.append(targetRef); }
    sb.append("}");
    return sb.toString();
  }
  class TargetRefNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1EndpointAddressFluent.TargetRefNested<N>> implements V1EndpointAddressFluent.TargetRefNested<N>,Nested<N>{
    TargetRefNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    TargetRefNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) V1EndpointAddressFluentImpl.this.withTargetRef(builder.build());
    }
    public N endTargetRef() {
      return and();
    }
    
  }
  
}