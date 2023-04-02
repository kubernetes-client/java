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
  public class V1ScaleIOVolumeSourceFluentImpl<A extends V1ScaleIOVolumeSourceFluent<A>> extends BaseFluent<A> implements V1ScaleIOVolumeSourceFluent<A>{
  public V1ScaleIOVolumeSourceFluentImpl() {
  }
  public V1ScaleIOVolumeSourceFluentImpl(V1ScaleIOVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withGateway(instance.getGateway());

    this.withProtectionDomain(instance.getProtectionDomain());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withSslEnabled(instance.getSslEnabled());

    this.withStorageMode(instance.getStorageMode());

    this.withStoragePool(instance.getStoragePool());

    this.withSystem(instance.getSystem());

    this.withVolumeName(instance.getVolumeName());

  }
  private String fsType;
  private String gateway;
  private String protectionDomain;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
  private Boolean sslEnabled;
  private String storageMode;
  private String storagePool;
  private String system;
  private String volumeName;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getGateway() {
    return this.gateway;
  }
  public A withGateway(String gateway) {
    this.gateway=gateway; return (A) this;
  }
  public Boolean hasGateway() {
    return this.gateway != null;
  }
  public String getProtectionDomain() {
    return this.protectionDomain;
  }
  public A withProtectionDomain(String protectionDomain) {
    this.protectionDomain=protectionDomain; return (A) this;
  }
  public Boolean hasProtectionDomain() {
    return this.protectionDomain != null;
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
  public V1LocalObjectReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1LocalObjectReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1LocalObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1LocalObjectReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1ScaleIOVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item) {
    return new V1ScaleIOVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1LocalObjectReferenceBuilder().build());
  }
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public Boolean getSslEnabled() {
    return this.sslEnabled;
  }
  public A withSslEnabled(Boolean sslEnabled) {
    this.sslEnabled=sslEnabled; return (A) this;
  }
  public Boolean hasSslEnabled() {
    return this.sslEnabled != null;
  }
  public String getStorageMode() {
    return this.storageMode;
  }
  public A withStorageMode(String storageMode) {
    this.storageMode=storageMode; return (A) this;
  }
  public Boolean hasStorageMode() {
    return this.storageMode != null;
  }
  public String getStoragePool() {
    return this.storagePool;
  }
  public A withStoragePool(String storagePool) {
    this.storagePool=storagePool; return (A) this;
  }
  public Boolean hasStoragePool() {
    return this.storagePool != null;
  }
  public String getSystem() {
    return this.system;
  }
  public A withSystem(String system) {
    this.system=system; return (A) this;
  }
  public Boolean hasSystem() {
    return this.system != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleIOVolumeSourceFluentImpl that = (V1ScaleIOVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (gateway != null ? !gateway.equals(that.gateway) :that.gateway != null) return false;
    if (protectionDomain != null ? !protectionDomain.equals(that.protectionDomain) :that.protectionDomain != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    if (sslEnabled != null ? !sslEnabled.equals(that.sslEnabled) :that.sslEnabled != null) return false;
    if (storageMode != null ? !storageMode.equals(that.storageMode) :that.storageMode != null) return false;
    if (storagePool != null ? !storagePool.equals(that.storagePool) :that.storagePool != null) return false;
    if (system != null ? !system.equals(that.system) :that.system != null) return false;
    if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  gateway,  protectionDomain,  readOnly,  secretRef,  sslEnabled,  storageMode,  storagePool,  system,  volumeName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (gateway != null) { sb.append("gateway:"); sb.append(gateway + ","); }
    if (protectionDomain != null) { sb.append("protectionDomain:"); sb.append(protectionDomain + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (sslEnabled != null) { sb.append("sslEnabled:"); sb.append(sslEnabled + ","); }
    if (storageMode != null) { sb.append("storageMode:"); sb.append(storageMode + ","); }
    if (storagePool != null) { sb.append("storagePool:"); sb.append(storagePool + ","); }
    if (system != null) { sb.append("system:"); sb.append(system + ","); }
    if (volumeName != null) { sb.append("volumeName:"); sb.append(volumeName); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public A withSslEnabled() {
    return withSslEnabled(true);
  }
  class SecretRefNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1ScaleIOVolumeSourceFluent.SecretRefNested<N>> implements V1ScaleIOVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1ScaleIOVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}