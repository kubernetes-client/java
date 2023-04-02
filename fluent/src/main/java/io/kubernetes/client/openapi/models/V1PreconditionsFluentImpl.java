package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PreconditionsFluentImpl<A extends V1PreconditionsFluent<A>> extends BaseFluent<A> implements V1PreconditionsFluent<A>{
  public V1PreconditionsFluentImpl() {
  }
  public V1PreconditionsFluentImpl(V1Preconditions instance) {
    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

  }
  private String resourceVersion;
  private String uid;
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion=resourceVersion; return (A) this;
  }
  public Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PreconditionsFluentImpl that = (V1PreconditionsFluentImpl) o;
    if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
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