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
  public class V1CinderPersistentVolumeSourceFluentImpl<A extends V1CinderPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1CinderPersistentVolumeSourceFluent<A>{
  public V1CinderPersistentVolumeSourceFluentImpl() {
  }
  public V1CinderPersistentVolumeSourceFluentImpl(V1CinderPersistentVolumeSource instance) {
    if (instance != null) {
      this.withFsType(instance.getFsType());
      this.withReadOnly(instance.getReadOnly());
      this.withSecretRef(instance.getSecretRef());
      this.withVolumeID(instance.getVolumeID());
    }
  }
  private String fsType;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  private String volumeID;
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
  public V1SecretReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1SecretReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1SecretReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRef() {
    return new V1CinderPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new V1CinderPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getVolumeID() {
    return this.volumeID;
  }
  public A withVolumeID(String volumeID) {
    this.volumeID=volumeID; return (A) this;
  }
  public Boolean hasVolumeID() {
    return this.volumeID != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CinderPersistentVolumeSourceFluentImpl that = (V1CinderPersistentVolumeSourceFluentImpl) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;

    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;

    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;

    if (!java.util.Objects.equals(volumeID, that.volumeID)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  readOnly,  secretRef,  volumeID,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (volumeID != null) { sb.append("volumeID:"); sb.append(volumeID); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class SecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<N>> implements V1CinderPersistentVolumeSourceFluentImpl.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CinderPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}