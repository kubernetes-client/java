package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StorageOSPersistentVolumeSourceFluent<A extends V1StorageOSPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1StorageOSPersistentVolumeSourceFluent() {
  }
  
  public V1StorageOSPersistentVolumeSourceFluent(V1StorageOSPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Boolean readOnly;
  private V1ObjectReferenceBuilder secretRef;
  private String volumeName;
  private String volumeNamespace;
  
  protected void copyInstance(V1StorageOSPersistentVolumeSource instance) {
    instance = (instance != null ? instance : new V1StorageOSPersistentVolumeSource());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withReadOnly(instance.getReadOnly());
          this.withSecretRef(instance.getSecretRef());
          this.withVolumeName(instance.getVolumeName());
          this.withVolumeNamespace(instance.getVolumeNamespace());
        }
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
  
  public V1ObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
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
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(V1ObjectReference item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1ObjectReference item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public String getVolumeNamespace() {
    return this.volumeNamespace;
  }
  
  public A withVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return (A) this;
  }
  
  public boolean hasVolumeNamespace() {
    return this.volumeNamespace != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StorageOSPersistentVolumeSourceFluent that = (V1StorageOSPersistentVolumeSourceFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    if (!java.util.Objects.equals(volumeName, that.volumeName)) return false;
    if (!java.util.Objects.equals(volumeNamespace, that.volumeNamespace)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  readOnly,  secretRef,  volumeName,  volumeNamespace,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName + ","); }
    if (volumeNamespace != null) { sb.append("volumeNamespace:"); sb.append(volumeNamespace); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class SecretRefNested<N> extends V1ObjectReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1StorageOSPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}