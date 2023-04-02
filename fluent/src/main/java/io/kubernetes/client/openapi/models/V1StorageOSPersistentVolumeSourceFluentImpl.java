package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1StorageOSPersistentVolumeSourceFluentImpl<A extends V1StorageOSPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1StorageOSPersistentVolumeSourceFluent<A>{
  public V1StorageOSPersistentVolumeSourceFluentImpl() {
  }
  public V1StorageOSPersistentVolumeSourceFluentImpl(V1StorageOSPersistentVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeName(instance.getVolumeName());

    this.withVolumeNamespace(instance.getVolumeNamespace());

  }
  private String fsType;
  private Boolean readOnly;
  private V1ObjectReferenceBuilder secretRef;
  private String volumeName;
  private String volumeNamespace;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
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
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1ObjectReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1ObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1ObjectReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1StorageOSPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1ObjectReference item) {
    return new V1StorageOSPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1ObjectReferenceBuilder().build());
  }
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1ObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getVolumeName() {
    return this.volumeName;
  }
  public A withVolumeName(String volumeName) {
    this.volumeName=volumeName; return (A) this;
  }
  public Boolean hasVolumeName() {
    return this.volumeName != null;
  }
  public String getVolumeNamespace() {
    return this.volumeNamespace;
  }
  public A withVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace=volumeNamespace; return (A) this;
  }
  public Boolean hasVolumeNamespace() {
    return this.volumeNamespace != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StorageOSPersistentVolumeSourceFluentImpl that = (V1StorageOSPersistentVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
    if (volumeNamespace != null ? !volumeNamespace.equals(that.volumeNamespace) :that.volumeNamespace != null) return false;
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
  class SecretRefNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>> implements V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) V1StorageOSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}