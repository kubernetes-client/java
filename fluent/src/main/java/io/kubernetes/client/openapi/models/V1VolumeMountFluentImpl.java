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
  public class V1VolumeMountFluentImpl<A extends V1VolumeMountFluent<A>> extends BaseFluent<A> implements V1VolumeMountFluent<A>{
  public V1VolumeMountFluentImpl() {
  }
  public V1VolumeMountFluentImpl(V1VolumeMount instance) {
    this.withMountPath(instance.getMountPath());

    this.withMountPropagation(instance.getMountPropagation());

    this.withName(instance.getName());

    this.withReadOnly(instance.getReadOnly());

    this.withSubPath(instance.getSubPath());

    this.withSubPathExpr(instance.getSubPathExpr());

  }
  private String mountPath;
  private String mountPropagation;
  private String name;
  private Boolean readOnly;
  private String subPath;
  private String subPathExpr;
  public String getMountPath() {
    return this.mountPath;
  }
  public A withMountPath(String mountPath) {
    this.mountPath=mountPath; return (A) this;
  }
  public Boolean hasMountPath() {
    return this.mountPath != null;
  }
  public String getMountPropagation() {
    return this.mountPropagation;
  }
  public A withMountPropagation(String mountPropagation) {
    this.mountPropagation=mountPropagation; return (A) this;
  }
  public Boolean hasMountPropagation() {
    return this.mountPropagation != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public String getSubPath() {
    return this.subPath;
  }
  public A withSubPath(String subPath) {
    this.subPath=subPath; return (A) this;
  }
  public Boolean hasSubPath() {
    return this.subPath != null;
  }
  public String getSubPathExpr() {
    return this.subPathExpr;
  }
  public A withSubPathExpr(String subPathExpr) {
    this.subPathExpr=subPathExpr; return (A) this;
  }
  public Boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeMountFluentImpl that = (V1VolumeMountFluentImpl) o;
    if (mountPath != null ? !mountPath.equals(that.mountPath) :that.mountPath != null) return false;
    if (mountPropagation != null ? !mountPropagation.equals(that.mountPropagation) :that.mountPropagation != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (subPath != null ? !subPath.equals(that.subPath) :that.subPath != null) return false;
    if (subPathExpr != null ? !subPathExpr.equals(that.subPathExpr) :that.subPathExpr != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(mountPath,  mountPropagation,  name,  readOnly,  subPath,  subPathExpr,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (mountPath != null) { sb.append("mountPath:"); sb.append(mountPath + ","); }
    if (mountPropagation != null) { sb.append("mountPropagation:"); sb.append(mountPropagation + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (subPath != null) { sb.append("subPath:"); sb.append(subPath + ","); }
    if (subPathExpr != null) { sb.append("subPathExpr:"); sb.append(subPathExpr); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}