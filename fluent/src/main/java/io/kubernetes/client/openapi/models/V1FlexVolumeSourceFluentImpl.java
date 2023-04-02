package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1FlexVolumeSourceFluentImpl<A extends V1FlexVolumeSourceFluent<A>> extends BaseFluent<A> implements V1FlexVolumeSourceFluent<A>{
  public V1FlexVolumeSourceFluentImpl() {
  }
  public V1FlexVolumeSourceFluentImpl(V1FlexVolumeSource instance) {
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

  }
  private String driver;
  private String fsType;
  private Map<String,String> options;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
  public String getDriver() {
    return this.driver;
  }
  public A withDriver(String driver) {
    this.driver=driver; return (A) this;
  }
  public Boolean hasDriver() {
    return this.driver != null;
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
    if (options == null) { this.options =  null;} else {this.options = new LinkedHashMap(options);} return (A) this;
  }
  public Boolean hasOptions() {
    return this.options != null;
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
  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1FlexVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item) {
    return new V1FlexVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1LocalObjectReferenceBuilder().build());
  }
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FlexVolumeSourceFluentImpl that = (V1FlexVolumeSourceFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (options != null ? !options.equals(that.options) :that.options != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
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
  class SecretRefNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1FlexVolumeSourceFluent.SecretRefNested<N>> implements V1FlexVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1FlexVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}