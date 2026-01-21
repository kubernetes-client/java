package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FlexPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String driver;
  private String fsType;
  private Map<String,String> options;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;

  public V1FlexPersistentVolumeSourceFluent() {
  }
  
  public V1FlexPersistentVolumeSourceFluent(V1FlexPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }

  public A addToOptions(Map<String,String> map) {
    if (this.options == null && map != null) {
      this.options = new LinkedHashMap();
    }
    if (map != null) {
      this.options.putAll(map);
    }
    return (A) this;
  }
  
  public A addToOptions(String key,String value) {
    if (this.options == null && key != null && value != null) {
      this.options = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.options.put(key, value);
    }
    return (A) this;
  }
  
  public V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  protected void copyInstance(V1FlexPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1FlexPersistentVolumeSource();
    if (instance != null) {
        this.withDriver(instance.getDriver());
        this.withFsType(instance.getFsType());
        this.withOptions(instance.getOptions());
        this.withReadOnly(instance.getReadOnly());
        this.withSecretRef(instance.getSecretRef());
    }
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
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
    V1FlexPersistentVolumeSourceFluent that = (V1FlexPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(options, that.options))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretRef, that.secretRef))) {
      return false;
    }
    return true;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public Map<String,String> getOptions() {
    return this.options;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasOptions() {
    return this.options != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(driver, fsType, options, readOnly, secretRef);
  }
  
  public A removeFromOptions(String key) {
    if (this.options == null) {
      return (A) this;
    }
    if (key != null && this.options != null) {
      this.options.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromOptions(Map<String,String> map) {
    if (this.options == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.options != null) {
          this.options.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(options == null) && !(options.isEmpty())) {
        sb.append("options:");
        sb.append(options);
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
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new SecretRefNested(item);
  }
  
  public <K,V>A withOptions(Map<String,String> options) {
    if (options == null) {
      this.options = null;
    } else {
      this.options = new LinkedHashMap(options);
    }
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
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
  public class SecretRefNested<N> extends V1SecretReferenceFluent<SecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    SecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1FlexPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  }
}