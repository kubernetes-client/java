package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PreconditionsFluent<A extends io.kubernetes.client.openapi.models.V1PreconditionsFluent<A>> extends BaseFluent<A>{

  private String resourceVersion;
  private String uid;

  public V1PreconditionsFluent() {
  }
  
  public V1PreconditionsFluent(V1Preconditions instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1Preconditions instance) {
    instance = instance != null ? instance : new V1Preconditions();
    if (instance != null) {
        this.withResourceVersion(instance.getResourceVersion());
        this.withUid(instance.getUid());
    }
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
    V1PreconditionsFluent that = (V1PreconditionsFluent) o;
    if (!(Objects.equals(resourceVersion, that.resourceVersion))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public int hashCode() {
    return Objects.hash(resourceVersion, uid);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(resourceVersion == null)) {
        sb.append("resourceVersion:");
        sb.append(resourceVersion);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
}