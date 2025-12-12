package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StorageOSPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String fsType;
  private Boolean readOnly;
  private V1ObjectReferenceBuilder secretRef;
  private String volumeName;
  private String volumeNamespace;

  public V1StorageOSPersistentVolumeSourceFluent() {
  }
  
  public V1StorageOSPersistentVolumeSourceFluent(V1StorageOSPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }

  public V1ObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  protected void copyInstance(V1StorageOSPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1StorageOSPersistentVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withReadOnly(instance.getReadOnly());
        this.withSecretRef(instance.getSecretRef());
        this.withVolumeName(instance.getVolumeName());
        this.withVolumeNamespace(instance.getVolumeNamespace());
    }
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1ObjectReference item) {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(item));
  }
  
  public SecretRefNested<A> editSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(null));
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
    V1StorageOSPersistentVolumeSourceFluent that = (V1StorageOSPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretRef, that.secretRef))) {
      return false;
    }
    if (!(Objects.equals(volumeName, that.volumeName))) {
      return false;
    }
    if (!(Objects.equals(volumeNamespace, that.volumeNamespace))) {
      return false;
    }
    return true;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public String getVolumeNamespace() {
    return this.volumeNamespace;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public boolean hasVolumeNamespace() {
    return this.volumeNamespace != null;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(secretRef == null)) {
        sb.append("secretRef:");
        sb.append(secretRef);
        sb.append(",");
    }
    if (!(volumeName == null)) {
        sb.append("volumeName:");
        sb.append(volumeName);
        sb.append(",");
    }
    if (!(volumeNamespace == null)) {
        sb.append("volumeNamespace:");
        sb.append(volumeNamespace);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(V1ObjectReference item) {
    return new SecretRefNested(item);
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withSecretRef(V1ObjectReference secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new V1ObjectReferenceBuilder(secretRef);
        this._visitables.get("secretRef").add(this.secretRef);
    } else {
        this.secretRef = null;
        this._visitables.get("secretRef").remove(this.secretRef);
    }
    return (A) this;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public A withVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return (A) this;
  }
  public class SecretRefNested<N> extends V1ObjectReferenceFluent<SecretRefNested<N>> implements Nested<N>{
  
    V1ObjectReferenceBuilder builder;
  
    SecretRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1StorageOSPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  }
}