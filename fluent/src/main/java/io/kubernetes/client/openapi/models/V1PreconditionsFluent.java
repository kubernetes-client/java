package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PreconditionsFluent<A extends V1PreconditionsFluent<A>> extends BaseFluent<A>{
  public V1PreconditionsFluent() {
  }
  
  public V1PreconditionsFluent(V1Preconditions instance) {
    this.copyInstance(instance);
  }
  private String resourceVersion;
  private String uid;
  
  protected void copyInstance(V1Preconditions instance) {
    instance = (instance != null ? instance : new V1Preconditions());
    if (instance != null) {
          this.withResourceVersion(instance.getResourceVersion());
          this.withUid(instance.getUid());
        }
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PreconditionsFluent that = (V1PreconditionsFluent) o;
    if (!java.util.Objects.equals(resourceVersion, that.resourceVersion)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(resourceVersion,  uid,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  

}