package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PersistentVolumeClaimVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String claimName;
  private Boolean readOnly;

  public V1PersistentVolumeClaimVolumeSourceFluent() {
  }
  
  public V1PersistentVolumeClaimVolumeSourceFluent(V1PersistentVolumeClaimVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PersistentVolumeClaimVolumeSource instance) {
    instance = instance != null ? instance : new V1PersistentVolumeClaimVolumeSource();
    if (instance != null) {
        this.withClaimName(instance.getClaimName());
        this.withReadOnly(instance.getReadOnly());
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
    V1PersistentVolumeClaimVolumeSourceFluent that = (V1PersistentVolumeClaimVolumeSourceFluent) o;
    if (!(Objects.equals(claimName, that.claimName))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    return true;
  }
  
  public String getClaimName() {
    return this.claimName;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public boolean hasClaimName() {
    return this.claimName != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(claimName == null)) {
        sb.append("claimName:");
        sb.append(claimName);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withClaimName(String claimName) {
    this.claimName = claimName;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
}