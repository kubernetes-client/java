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
public class V1AzureFileVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<A>> extends BaseFluent<A>{

  private Boolean readOnly;
  private String secretName;
  private String shareName;

  public V1AzureFileVolumeSourceFluent() {
  }
  
  public V1AzureFileVolumeSourceFluent(V1AzureFileVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1AzureFileVolumeSource instance) {
    instance = instance != null ? instance : new V1AzureFileVolumeSource();
    if (instance != null) {
        this.withReadOnly(instance.getReadOnly());
        this.withSecretName(instance.getSecretName());
        this.withShareName(instance.getShareName());
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
    V1AzureFileVolumeSourceFluent that = (V1AzureFileVolumeSourceFluent) o;
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretName, that.secretName))) {
      return false;
    }
    if (!(Objects.equals(shareName, that.shareName))) {
      return false;
    }
    return true;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getSecretName() {
    return this.secretName;
  }
  
  public String getShareName() {
    return this.shareName;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasSecretName() {
    return this.secretName != null;
  }
  
  public boolean hasShareName() {
    return this.shareName != null;
  }
  
  public int hashCode() {
    return Objects.hash(readOnly, secretName, shareName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(secretName == null)) {
        sb.append("secretName:");
        sb.append(secretName);
        sb.append(",");
    }
    if (!(shareName == null)) {
        sb.append("shareName:");
        sb.append(shareName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }
  
  public A withShareName(String shareName) {
    this.shareName = shareName;
    return (A) this;
  }
  
}