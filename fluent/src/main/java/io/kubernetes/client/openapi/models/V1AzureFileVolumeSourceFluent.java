package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AzureFileVolumeSourceFluent<A extends V1AzureFileVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1AzureFileVolumeSourceFluent() {
  }
  
  public V1AzureFileVolumeSourceFluent(V1AzureFileVolumeSource instance) {
    this.copyInstance(instance);
  }
  private Boolean readOnly;
  private String secretName;
  private String shareName;
  
  protected void copyInstance(V1AzureFileVolumeSource instance) {
    instance = (instance != null ? instance : new V1AzureFileVolumeSource());
    if (instance != null) {
          this.withReadOnly(instance.getReadOnly());
          this.withSecretName(instance.getSecretName());
          this.withShareName(instance.getShareName());
        }
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public String getSecretName() {
    return this.secretName;
  }
  
  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }
  
  public boolean hasSecretName() {
    return this.secretName != null;
  }
  
  public String getShareName() {
    return this.shareName;
  }
  
  public A withShareName(String shareName) {
    this.shareName = shareName;
    return (A) this;
  }
  
  public boolean hasShareName() {
    return this.shareName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AzureFileVolumeSourceFluent that = (V1AzureFileVolumeSourceFluent) o;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(secretName, that.secretName)) return false;
    if (!java.util.Objects.equals(shareName, that.shareName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(readOnly,  secretName,  shareName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretName != null) { sb.append("secretName:"); sb.append(secretName + ","); }
    if (shareName != null) { sb.append("shareName:"); sb.append(shareName); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}