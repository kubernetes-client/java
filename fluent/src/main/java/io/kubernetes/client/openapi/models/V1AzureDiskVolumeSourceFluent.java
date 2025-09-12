package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AzureDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1AzureDiskVolumeSourceFluent() {
  }
  
  public V1AzureDiskVolumeSourceFluent(V1AzureDiskVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String cachingMode;
  private String diskName;
  private String diskURI;
  private String fsType;
  private String kind;
  private Boolean readOnly;
  
  protected void copyInstance(V1AzureDiskVolumeSource instance) {
    instance = instance != null ? instance : new V1AzureDiskVolumeSource();
    if (instance != null) {
        this.withCachingMode(instance.getCachingMode());
        this.withDiskName(instance.getDiskName());
        this.withDiskURI(instance.getDiskURI());
        this.withFsType(instance.getFsType());
        this.withKind(instance.getKind());
        this.withReadOnly(instance.getReadOnly());
    }
  }
  
  public String getCachingMode() {
    return this.cachingMode;
  }
  
  public A withCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return (A) this;
  }
  
  public boolean hasCachingMode() {
    return this.cachingMode != null;
  }
  
  public String getDiskName() {
    return this.diskName;
  }
  
  public A withDiskName(String diskName) {
    this.diskName = diskName;
    return (A) this;
  }
  
  public boolean hasDiskName() {
    return this.diskName != null;
  }
  
  public String getDiskURI() {
    return this.diskURI;
  }
  
  public A withDiskURI(String diskURI) {
    this.diskURI = diskURI;
    return (A) this;
  }
  
  public boolean hasDiskURI() {
    return this.diskURI != null;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
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
    V1AzureDiskVolumeSourceFluent that = (V1AzureDiskVolumeSourceFluent) o;
    if (!(Objects.equals(cachingMode, that.cachingMode))) {
      return false;
    }
    if (!(Objects.equals(diskName, that.diskName))) {
      return false;
    }
    if (!(Objects.equals(diskURI, that.diskURI))) {
      return false;
    }
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(cachingMode == null)) {
        sb.append("cachingMode:");
        sb.append(cachingMode);
        sb.append(",");
    }
    if (!(diskName == null)) {
        sb.append("diskName:");
        sb.append(diskName);
        sb.append(",");
    }
    if (!(diskURI == null)) {
        sb.append("diskURI:");
        sb.append(diskURI);
        sb.append(",");
    }
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}