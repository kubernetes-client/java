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
  public class V1AzureDiskVolumeSourceFluentImpl<A extends V1AzureDiskVolumeSourceFluent<A>> extends BaseFluent<A> implements V1AzureDiskVolumeSourceFluent<A>{
  public V1AzureDiskVolumeSourceFluentImpl() {
  }
  public V1AzureDiskVolumeSourceFluentImpl(V1AzureDiskVolumeSource instance) {
    this.withCachingMode(instance.getCachingMode());

    this.withDiskName(instance.getDiskName());

    this.withDiskURI(instance.getDiskURI());

    this.withFsType(instance.getFsType());

    this.withKind(instance.getKind());

    this.withReadOnly(instance.getReadOnly());

  }
  private String cachingMode;
  private String diskName;
  private String diskURI;
  private String fsType;
  private String kind;
  private Boolean readOnly;
  public String getCachingMode() {
    return this.cachingMode;
  }
  public A withCachingMode(String cachingMode) {
    this.cachingMode=cachingMode; return (A) this;
  }
  public Boolean hasCachingMode() {
    return this.cachingMode != null;
  }
  public String getDiskName() {
    return this.diskName;
  }
  public A withDiskName(String diskName) {
    this.diskName=diskName; return (A) this;
  }
  public Boolean hasDiskName() {
    return this.diskName != null;
  }
  public String getDiskURI() {
    return this.diskURI;
  }
  public A withDiskURI(String diskURI) {
    this.diskURI=diskURI; return (A) this;
  }
  public Boolean hasDiskURI() {
    return this.diskURI != null;
  }
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AzureDiskVolumeSourceFluentImpl that = (V1AzureDiskVolumeSourceFluentImpl) o;
    if (cachingMode != null ? !cachingMode.equals(that.cachingMode) :that.cachingMode != null) return false;
    if (diskName != null ? !diskName.equals(that.diskName) :that.diskName != null) return false;
    if (diskURI != null ? !diskURI.equals(that.diskURI) :that.diskURI != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(cachingMode,  diskName,  diskURI,  fsType,  kind,  readOnly,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cachingMode != null) { sb.append("cachingMode:"); sb.append(cachingMode + ","); }
    if (diskName != null) { sb.append("diskName:"); sb.append(diskName + ","); }
    if (diskURI != null) { sb.append("diskURI:"); sb.append(diskURI + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}