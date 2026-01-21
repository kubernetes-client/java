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
public class V1AzureFilePersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<A>> extends BaseFluent<A>{

  private Boolean readOnly;
  private String secretName;
  private String secretNamespace;
  private String shareName;

  public V1AzureFilePersistentVolumeSourceFluent() {
  }
  
  public V1AzureFilePersistentVolumeSourceFluent(V1AzureFilePersistentVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1AzureFilePersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1AzureFilePersistentVolumeSource();
    if (instance != null) {
        this.withReadOnly(instance.getReadOnly());
        this.withSecretName(instance.getSecretName());
        this.withSecretNamespace(instance.getSecretNamespace());
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
    V1AzureFilePersistentVolumeSourceFluent that = (V1AzureFilePersistentVolumeSourceFluent) o;
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretName, that.secretName))) {
      return false;
    }
    if (!(Objects.equals(secretNamespace, that.secretNamespace))) {
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
  
  public String getSecretNamespace() {
    return this.secretNamespace;
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
  
  public boolean hasSecretNamespace() {
    return this.secretNamespace != null;
  }
  
  public boolean hasShareName() {
    return this.shareName != null;
  }
  
  public int hashCode() {
    return Objects.hash(readOnly, secretName, secretNamespace, shareName);
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
    if (!(secretNamespace == null)) {
        sb.append("secretNamespace:");
        sb.append(secretNamespace);
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
  
  public A withSecretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
    return (A) this;
  }
  
  public A withShareName(String shareName) {
    this.shareName = shareName;
    return (A) this;
  }
  
}