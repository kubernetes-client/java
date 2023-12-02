package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EndpointAddressFluent<A extends V1EndpointAddressFluent<A>> extends BaseFluent<A>{
  public V1EndpointAddressFluent() {
  }
  
  public V1EndpointAddressFluent(V1EndpointAddress instance) {
    this.copyInstance(instance);
  }
  private String hostname;
  private String ip;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;
  
  protected void copyInstance(V1EndpointAddress instance) {
    instance = (instance != null ? instance : new V1EndpointAddress());
    if (instance != null) {
          this.withHostname(instance.getHostname());
          this.withIp(instance.getIp());
          this.withNodeName(instance.getNodeName());
          this.withTargetRef(instance.getTargetRef());
        }
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public V1ObjectReference buildTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }
  
  public A withTargetRef(V1ObjectReference targetRef) {
    this._visitables.remove("targetRef");
    if (targetRef != null) {
        this.targetRef = new V1ObjectReferenceBuilder(targetRef);
        this._visitables.get("targetRef").add(this.targetRef);
    } else {
        this.targetRef = null;
        this._visitables.get("targetRef").remove(this.targetRef);
    }
    return (A) this;
  }
  
  public boolean hasTargetRef() {
    return this.targetRef != null;
  }
  
  public TargetRefNested<A> withNewTargetRef() {
    return new TargetRefNested(null);
  }
  
  public TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new TargetRefNested(item);
  }
  
  public TargetRefNested<A> editTargetRef() {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(null));
  }
  
  public TargetRefNested<A> editOrNewTargetRef() {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return withNewTargetRefLike(java.util.Optional.ofNullable(buildTargetRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointAddressFluent that = (V1EndpointAddressFluent) o;
    if (!java.util.Objects.equals(hostname, that.hostname)) return false;
    if (!java.util.Objects.equals(ip, that.ip)) return false;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    if (!java.util.Objects.equals(targetRef, that.targetRef)) return false;
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
  public class TargetRefNested<N> extends V1ObjectReferenceFluent<TargetRefNested<N>> implements Nested<N>{
    TargetRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1EndpointAddressFluent.this.withTargetRef(builder.build());
    }
    
    public N endTargetRef() {
      return and();
    }
    
  
  }

}