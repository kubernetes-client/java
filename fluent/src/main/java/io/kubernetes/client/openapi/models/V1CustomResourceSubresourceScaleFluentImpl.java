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
  public class V1CustomResourceSubresourceScaleFluentImpl<A extends V1CustomResourceSubresourceScaleFluent<A>> extends BaseFluent<A> implements V1CustomResourceSubresourceScaleFluent<A>{
  public V1CustomResourceSubresourceScaleFluentImpl() {
  }
  public V1CustomResourceSubresourceScaleFluentImpl(V1CustomResourceSubresourceScale instance) {
    this.withLabelSelectorPath(instance.getLabelSelectorPath());

    this.withSpecReplicasPath(instance.getSpecReplicasPath());

    this.withStatusReplicasPath(instance.getStatusReplicasPath());

  }
  private String labelSelectorPath;
  private String specReplicasPath;
  private String statusReplicasPath;
  public String getLabelSelectorPath() {
    return this.labelSelectorPath;
  }
  public A withLabelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath=labelSelectorPath; return (A) this;
  }
  public Boolean hasLabelSelectorPath() {
    return this.labelSelectorPath != null;
  }
  public String getSpecReplicasPath() {
    return this.specReplicasPath;
  }
  public A withSpecReplicasPath(String specReplicasPath) {
    this.specReplicasPath=specReplicasPath; return (A) this;
  }
  public Boolean hasSpecReplicasPath() {
    return this.specReplicasPath != null;
  }
  public String getStatusReplicasPath() {
    return this.statusReplicasPath;
  }
  public A withStatusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath=statusReplicasPath; return (A) this;
  }
  public Boolean hasStatusReplicasPath() {
    return this.statusReplicasPath != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceSubresourceScaleFluentImpl that = (V1CustomResourceSubresourceScaleFluentImpl) o;
    if (labelSelectorPath != null ? !labelSelectorPath.equals(that.labelSelectorPath) :that.labelSelectorPath != null) return false;
    if (specReplicasPath != null ? !specReplicasPath.equals(that.specReplicasPath) :that.specReplicasPath != null) return false;
    if (statusReplicasPath != null ? !statusReplicasPath.equals(that.statusReplicasPath) :that.statusReplicasPath != null) return false;
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