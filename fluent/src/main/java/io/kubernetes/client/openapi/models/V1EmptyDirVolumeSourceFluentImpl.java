package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EmptyDirVolumeSourceFluentImpl<A extends V1EmptyDirVolumeSourceFluent<A>> extends BaseFluent<A> implements V1EmptyDirVolumeSourceFluent<A>{
  public V1EmptyDirVolumeSourceFluentImpl() {
  }
  public V1EmptyDirVolumeSourceFluentImpl(V1EmptyDirVolumeSource instance) {
    this.withMedium(instance.getMedium());

    this.withSizeLimit(instance.getSizeLimit());

  }
  private String medium;
  private Quantity sizeLimit;
  public String getMedium() {
    return this.medium;
  }
  public A withMedium(String medium) {
    this.medium=medium; return (A) this;
  }
  public Boolean hasMedium() {
    return this.medium != null;
  }
  public Quantity getSizeLimit() {
    return this.sizeLimit;
  }
  public A withSizeLimit(Quantity sizeLimit) {
    this.sizeLimit=sizeLimit; return (A) this;
  }
  public Boolean hasSizeLimit() {
    return this.sizeLimit != null;
  }
  public A withNewSizeLimit(String value) {
    return (A)withSizeLimit(new Quantity(value));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EmptyDirVolumeSourceFluentImpl that = (V1EmptyDirVolumeSourceFluentImpl) o;
    if (medium != null ? !medium.equals(that.medium) :that.medium != null) return false;
    if (sizeLimit != null ? !sizeLimit.equals(that.sizeLimit) :that.sizeLimit != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(medium,  sizeLimit,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (medium != null) { sb.append("medium:"); sb.append(medium + ","); }
    if (sizeLimit != null) { sb.append("sizeLimit:"); sb.append(sizeLimit); }
    sb.append("}");
    return sb.toString();
  }
  
}