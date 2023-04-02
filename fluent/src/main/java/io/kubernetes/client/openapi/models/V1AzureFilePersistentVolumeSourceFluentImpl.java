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
  public class V1AzureFilePersistentVolumeSourceFluentImpl<A extends V1AzureFilePersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1AzureFilePersistentVolumeSourceFluent<A>{
  public V1AzureFilePersistentVolumeSourceFluentImpl() {
  }
  public V1AzureFilePersistentVolumeSourceFluentImpl(V1AzureFilePersistentVolumeSource instance) {
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withSecretNamespace(instance.getSecretNamespace());

    this.withShareName(instance.getShareName());

  }
  private Boolean readOnly;
  private String secretName;
  private String secretNamespace;
  private String shareName;
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public String getSecretName() {
    return this.secretName;
  }
  public A withSecretName(String secretName) {
    this.secretName=secretName; return (A) this;
  }
  public Boolean hasSecretName() {
    return this.secretName != null;
  }
  public String getSecretNamespace() {
    return this.secretNamespace;
  }
  public A withSecretNamespace(String secretNamespace) {
    this.secretNamespace=secretNamespace; return (A) this;
  }
  public Boolean hasSecretNamespace() {
    return this.secretNamespace != null;
  }
  public String getShareName() {
    return this.shareName;
  }
  public A withShareName(String shareName) {
    this.shareName=shareName; return (A) this;
  }
  public Boolean hasShareName() {
    return this.shareName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AzureFilePersistentVolumeSourceFluentImpl that = (V1AzureFilePersistentVolumeSourceFluentImpl) o;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) :that.secretName != null) return false;
    if (secretNamespace != null ? !secretNamespace.equals(that.secretNamespace) :that.secretNamespace != null) return false;
    if (shareName != null ? !shareName.equals(that.shareName) :that.shareName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(readOnly,  secretName,  secretNamespace,  shareName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretName != null) { sb.append("secretName:"); sb.append(secretName + ","); }
    if (secretNamespace != null) { sb.append("secretNamespace:"); sb.append(secretNamespace + ","); }
    if (shareName != null) { sb.append("shareName:"); sb.append(shareName); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}