package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FlexPersistentVolumeSourceFluent<A extends V1FlexPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1FlexPersistentVolumeSourceFluent() {
  }
  
  public V1FlexPersistentVolumeSourceFluent(V1FlexPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String driver;
  private String fsType;
  private Map<String,String> options;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  
  protected void copyInstance(V1FlexPersistentVolumeSource instance) {
    instance = (instance != null ? instance : new V1FlexPersistentVolumeSource());
    if (instance != null) {
          this.withDriver(instance.getDriver());
          this.withFsType(instance.getFsType());
          this.withOptions(instance.getOptions());
          this.withReadOnly(instance.getReadOnly());
          this.withSecretRef(instance.getSecretRef());
        }
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
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
  
  public A addToOptions(String key,String value) {
    if(this.options == null && key != null && value != null) { this.options = new LinkedHashMap(); }
    if(key != null && value != null) {this.options.put(key, value);} return (A)this;
  }
  
  public A addToOptions(Map<String,String> map) {
    if(this.options == null && map != null) { this.options = new LinkedHashMap(); }
    if(map != null) { this.options.putAll(map);} return (A)this;
  }
  
  public A removeFromOptions(String key) {
    if(this.options == null) { return (A) this; }
    if(key != null && this.options != null) {this.options.remove(key);} return (A)this;
  }
  
  public A removeFromOptions(Map<String,String> map) {
    if(this.options == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.options != null){this.options.remove(key);}}} return (A)this;
  }
  
  public Map<String,String> getOptions() {
    return this.options;
  }
  
  public <K,V>A withOptions(Map<String,String> options) {
    if (options == null) {
      this.options = null;
    } else {
      this.options = new LinkedHashMap(options);
    }
    return (A) this;
  }
  
  public boolean hasOptions() {
    return this.options != null;
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
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1FlexPersistentVolumeSourceFluent that = (V1FlexPersistentVolumeSourceFluent) o;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(options, that.options)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driver,  fsType,  options,  readOnly,  secretRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (options != null && !options.isEmpty()) { sb.append("options:"); sb.append(options + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class SecretRefNested<N> extends V1SecretReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    V1SecretReferenceBuilder builder;
    
    public N and() {
      return (N) V1FlexPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}