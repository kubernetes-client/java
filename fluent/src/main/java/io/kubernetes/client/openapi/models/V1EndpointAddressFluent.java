package io.kubernetes.client.openapi.models;

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
public class V1EndpointAddressFluent<A extends io.kubernetes.client.openapi.models.V1EndpointAddressFluent<A>> extends BaseFluent<A>{

  private String hostname;
  private String ip;
  private String nodeName;
  private V1ObjectReferenceBuilder targetRef;

  public V1EndpointAddressFluent() {
  }
  
  public V1EndpointAddressFluent(V1EndpointAddress instance) {
    this.copyInstance(instance);
  }

  public V1ObjectReference buildTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }
  
  protected void copyInstance(V1EndpointAddress instance) {
    instance = instance != null ? instance : new V1EndpointAddress();
    if (instance != null) {
        this.withHostname(instance.getHostname());
        this.withIp(instance.getIp());
        this.withNodeName(instance.getNodeName());
        this.withTargetRef(instance.getTargetRef());
    }
  }
  
  public TargetRefNested<A> editOrNewTargetRef() {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item) {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(item));
  }
  
  public TargetRefNested<A> editTargetRef() {
    return this.withNewTargetRefLike(Optional.ofNullable(this.buildTargetRef()).orElse(null));
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
    V1EndpointAddressFluent that = (V1EndpointAddressFluent) o;
    if (!(Objects.equals(hostname, that.hostname))) {
      return false;
    }
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(targetRef, that.targetRef))) {
      return false;
    }
    return true;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasTargetRef() {
    return this.targetRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(hostname, ip, nodeName, targetRef);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(hostname == null)) {
        sb.append("hostname:");
        sb.append(hostname);
        sb.append(",");
    }
    if (!(ip == null)) {
        sb.append("ip:");
        sb.append(ip);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(targetRef == null)) {
        sb.append("targetRef:");
        sb.append(targetRef);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public TargetRefNested<A> withNewTargetRef() {
    return new TargetRefNested(null);
  }
  
  public TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item) {
    return new TargetRefNested(item);
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
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
  public class TargetRefNested<N> extends V1ObjectReferenceFluent<TargetRefNested<N>> implements Nested<N>{
  
    V1ObjectReferenceBuilder builder;
  
    TargetRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EndpointAddressFluent.this.withTargetRef(builder.build());
    }
    
    public N endTargetRef() {
      return and();
    }
    
  }
}