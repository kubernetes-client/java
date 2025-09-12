package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ScaleIOPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1ScaleIOPersistentVolumeSourceFluent() {
  }
  
  public V1ScaleIOPersistentVolumeSourceFluent(V1ScaleIOPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String gateway;
  private String protectionDomain;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  private Boolean sslEnabled;
  private String storageMode;
  private String storagePool;
  private String system;
  private String volumeName;
  
  protected void copyInstance(V1ScaleIOPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1ScaleIOPersistentVolumeSource();
    if (instance != null) {
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
  
  public String getGateway() {
    return this.gateway;
  }
  
  public A withGateway(String gateway) {
    this.gateway = gateway;
    return (A) this;
  }
  
  public boolean hasGateway() {
    return this.gateway != null;
  }
  
  public String getProtectionDomain() {
    return this.protectionDomain;
  }
  
  public A withProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return (A) this;
  }
  
  public boolean hasProtectionDomain() {
    return this.protectionDomain != null;
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
  
  public V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(V1SecretReference secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new V1SecretReferenceBuilder(secretRef);
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
  
  public SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(item));
  }
  
  public Boolean getSslEnabled() {
    return this.sslEnabled;
  }
  
  public A withSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return (A) this;
  }
  
  public boolean hasSslEnabled() {
    return this.sslEnabled != null;
  }
  
  public String getStorageMode() {
    return this.storageMode;
  }
  
  public A withStorageMode(String storageMode) {
    this.storageMode = storageMode;
    return (A) this;
  }
  
  public boolean hasStorageMode() {
    return this.storageMode != null;
  }
  
  public String getStoragePool() {
    return this.storagePool;
  }
  
  public A withStoragePool(String storagePool) {
    this.storagePool = storagePool;
    return (A) this;
  }
  
  public boolean hasStoragePool() {
    return this.storagePool != null;
  }
  
  public String getSystem() {
    return this.system;
  }
  
  public A withSystem(String system) {
    this.system = system;
    return (A) this;
  }
  
  public boolean hasSystem() {
    return this.system != null;
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
    V1ScaleIOPersistentVolumeSourceFluent that = (V1ScaleIOPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(gateway, that.gateway))) {
      return false;
    }
    if (!(Objects.equals(protectionDomain, that.protectionDomain))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretRef, that.secretRef))) {
      return false;
    }
    if (!(Objects.equals(sslEnabled, that.sslEnabled))) {
      return false;
    }
    if (!(Objects.equals(storageMode, that.storageMode))) {
      return false;
    }
    if (!(Objects.equals(storagePool, that.storagePool))) {
      return false;
    }
    if (!(Objects.equals(system, that.system))) {
      return false;
    }
    if (!(Objects.equals(volumeName, that.volumeName))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(gateway == null)) {
        sb.append("gateway:");
        sb.append(gateway);
        sb.append(",");
    }
    if (!(protectionDomain == null)) {
        sb.append("protectionDomain:");
        sb.append(protectionDomain);
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
    if (!(sslEnabled == null)) {
        sb.append("sslEnabled:");
        sb.append(sslEnabled);
        sb.append(",");
    }
    if (!(storageMode == null)) {
        sb.append("storageMode:");
        sb.append(storageMode);
        sb.append(",");
    }
    if (!(storagePool == null)) {
        sb.append("storagePool:");
        sb.append(storagePool);
        sb.append(",");
    }
    if (!(system == null)) {
        sb.append("system:");
        sb.append(system);
        sb.append(",");
    }
    if (!(volumeName == null)) {
        sb.append("volumeName:");
        sb.append(volumeName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withSslEnabled() {
    return withSslEnabled(true);
  }
  public class SecretRefNested<N> extends V1SecretReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    V1SecretReferenceBuilder builder;
    
    public N and() {
      return (N) V1ScaleIOPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}