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
public class V1CustomResourceSubresourceScaleFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A>> extends BaseFluent<A>{

  private String labelSelectorPath;
  private String specReplicasPath;
  private String statusReplicasPath;

  public V1CustomResourceSubresourceScaleFluent() {
  }
  
  public V1CustomResourceSubresourceScaleFluent(V1CustomResourceSubresourceScale instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1CustomResourceSubresourceScale instance) {
    instance = instance != null ? instance : new V1CustomResourceSubresourceScale();
    if (instance != null) {
        this.withLabelSelectorPath(instance.getLabelSelectorPath());
        this.withSpecReplicasPath(instance.getSpecReplicasPath());
        this.withStatusReplicasPath(instance.getStatusReplicasPath());
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
    V1CustomResourceSubresourceScaleFluent that = (V1CustomResourceSubresourceScaleFluent) o;
    if (!(Objects.equals(labelSelectorPath, that.labelSelectorPath))) {
      return false;
    }
    if (!(Objects.equals(specReplicasPath, that.specReplicasPath))) {
      return false;
    }
    if (!(Objects.equals(statusReplicasPath, that.statusReplicasPath))) {
      return false;
    }
    return true;
  }
  
  public String getLabelSelectorPath() {
    return this.labelSelectorPath;
  }
  
  public String getSpecReplicasPath() {
    return this.specReplicasPath;
  }
  
  public String getStatusReplicasPath() {
    return this.statusReplicasPath;
  }
  
  public boolean hasLabelSelectorPath() {
    return this.labelSelectorPath != null;
  }
  
  public boolean hasSpecReplicasPath() {
    return this.specReplicasPath != null;
  }
  
  public boolean hasStatusReplicasPath() {
    return this.statusReplicasPath != null;
  }
  
  public int hashCode() {
    return Objects.hash(labelSelectorPath, specReplicasPath, statusReplicasPath);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(labelSelectorPath == null)) {
        sb.append("labelSelectorPath:");
        sb.append(labelSelectorPath);
        sb.append(",");
    }
    if (!(specReplicasPath == null)) {
        sb.append("specReplicasPath:");
        sb.append(specReplicasPath);
        sb.append(",");
    }
    if (!(statusReplicasPath == null)) {
        sb.append("statusReplicasPath:");
        sb.append(statusReplicasPath);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLabelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
    return (A) this;
  }
  
  public A withSpecReplicasPath(String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
    return (A) this;
  }
  
  public A withStatusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
    return (A) this;
  }
  
}