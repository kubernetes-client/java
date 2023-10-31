package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceSubresourceScaleFluent<A extends V1CustomResourceSubresourceScaleFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceSubresourceScaleFluent() {
  }
  
  public V1CustomResourceSubresourceScaleFluent(V1CustomResourceSubresourceScale instance) {
    this.copyInstance(instance);
  }
  private String labelSelectorPath;
  private String specReplicasPath;
  private String statusReplicasPath;
  
  protected void copyInstance(V1CustomResourceSubresourceScale instance) {
    instance = (instance != null ? instance : new V1CustomResourceSubresourceScale());
    if (instance != null) {
          this.withLabelSelectorPath(instance.getLabelSelectorPath());
          this.withSpecReplicasPath(instance.getSpecReplicasPath());
          this.withStatusReplicasPath(instance.getStatusReplicasPath());
        }
  }
  
  public String getLabelSelectorPath() {
    return this.labelSelectorPath;
  }
  
  public A withLabelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
    return (A) this;
  }
  
  public boolean hasLabelSelectorPath() {
    return this.labelSelectorPath != null;
  }
  
  public String getSpecReplicasPath() {
    return this.specReplicasPath;
  }
  
  public A withSpecReplicasPath(String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
    return (A) this;
  }
  
  public boolean hasSpecReplicasPath() {
    return this.specReplicasPath != null;
  }
  
  public String getStatusReplicasPath() {
    return this.statusReplicasPath;
  }
  
  public A withStatusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
    return (A) this;
  }
  
  public boolean hasStatusReplicasPath() {
    return this.statusReplicasPath != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceSubresourceScaleFluent that = (V1CustomResourceSubresourceScaleFluent) o;
    if (!java.util.Objects.equals(labelSelectorPath, that.labelSelectorPath)) return false;
    if (!java.util.Objects.equals(specReplicasPath, that.specReplicasPath)) return false;
    if (!java.util.Objects.equals(statusReplicasPath, that.statusReplicasPath)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(labelSelectorPath,  specReplicasPath,  statusReplicasPath,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelectorPath != null) { sb.append("labelSelectorPath:"); sb.append(labelSelectorPath + ","); }
    if (specReplicasPath != null) { sb.append("specReplicasPath:"); sb.append(specReplicasPath + ","); }
    if (statusReplicasPath != null) { sb.append("statusReplicasPath:"); sb.append(statusReplicasPath); }
    sb.append("}");
    return sb.toString();
  }
  

}