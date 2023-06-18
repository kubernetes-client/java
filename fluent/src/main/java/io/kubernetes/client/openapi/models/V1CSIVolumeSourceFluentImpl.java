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
  public class V1CSIVolumeSourceFluentImpl<A extends V1CSIVolumeSourceFluent<A>> extends BaseFluent<A> implements V1CSIVolumeSourceFluent<A>{
  public V1CSIVolumeSourceFluentImpl() {
  }
  public V1CSIVolumeSourceFluentImpl(V1CSIVolumeSource instance) {
    if (instance != null) {
      this.withDriver(instance.getDriver());
      this.withFsType(instance.getFsType());
      this.withNodePublishSecretRef(instance.getNodePublishSecretRef());
      this.withReadOnly(instance.getReadOnly());
      this.withVolumeAttributes(instance.getVolumeAttributes());
    }
  }
  private String driver;
  private String fsType;
  private V1LocalObjectReferenceBuilder nodePublishSecretRef;
  private Boolean readOnly;
  private Map<String,String> volumeAttributes;
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
  
  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getNodePublishSecretRef() {
    return this.nodePublishSecretRef!=null ?this.nodePublishSecretRef.build():null;
  }
  public V1LocalObjectReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef!=null ?this.nodePublishSecretRef.build():null;
  }
  public A withNodePublishSecretRef(V1LocalObjectReference nodePublishSecretRef) {
    _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    if (nodePublishSecretRef!=null){ this.nodePublishSecretRef= new V1LocalObjectReferenceBuilder(nodePublishSecretRef); _visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);} else { this.nodePublishSecretRef = null; _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef); } return (A) this;
  }
  public Boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }
  public V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl();
  }
  public V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1LocalObjectReference item) {
    return new V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl(item);
  }
  public V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<A> editNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef());
  }
  public V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): new V1LocalObjectReferenceBuilder().build());
  }
  public V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1LocalObjectReference item) {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): item);
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
  public A addToVolumeAttributes(String key,String value) {
    if(this.volumeAttributes == null && key != null && value != null) { this.volumeAttributes = new LinkedHashMap(); }
    if(key != null && value != null) {this.volumeAttributes.put(key, value);} return (A)this;
  }
  public A addToVolumeAttributes(Map<String,String> map) {
    if(this.volumeAttributes == null && map != null) { this.volumeAttributes = new LinkedHashMap(); }
    if(map != null) { this.volumeAttributes.putAll(map);} return (A)this;
  }
  public A removeFromVolumeAttributes(String key) {
    if(this.volumeAttributes == null) { return (A) this; }
    if(key != null && this.volumeAttributes != null) {this.volumeAttributes.remove(key);} return (A)this;
  }
  public A removeFromVolumeAttributes(Map<String,String> map) {
    if(this.volumeAttributes == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.volumeAttributes != null){this.volumeAttributes.remove(key);}}} return (A)this;
  }
  public Map<String,String> getVolumeAttributes() {
    return this.volumeAttributes;
  }
  public <K,V>A withVolumeAttributes(Map<String,String> volumeAttributes) {
    if (volumeAttributes == null) { this.volumeAttributes =  null;} else {this.volumeAttributes = new LinkedHashMap(volumeAttributes);} return (A) this;
  }
  public Boolean hasVolumeAttributes() {
    return this.volumeAttributes != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIVolumeSourceFluentImpl that = (V1CSIVolumeSourceFluentImpl) o;
    if (!java.util.Objects.equals(driver, that.driver)) return false;

    if (!java.util.Objects.equals(fsType, that.fsType)) return false;

    if (!java.util.Objects.equals(nodePublishSecretRef, that.nodePublishSecretRef)) return false;

    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;

    if (!java.util.Objects.equals(volumeAttributes, that.volumeAttributes)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(driver,  fsType,  nodePublishSecretRef,  readOnly,  volumeAttributes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (nodePublishSecretRef != null) { sb.append("nodePublishSecretRef:"); sb.append(nodePublishSecretRef + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (volumeAttributes != null && !volumeAttributes.isEmpty()) { sb.append("volumeAttributes:"); sb.append(volumeAttributes); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class NodePublishSecretRefNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<N>> implements V1CSIVolumeSourceFluentImpl.NodePublishSecretRefNested<N>,Nested<N>{
    NodePublishSecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    NodePublishSecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1CSIVolumeSourceFluentImpl.this.withNodePublishSecretRef(builder.build());
    }
    public N endNodePublishSecretRef() {
      return and();
    }
    
  }
  
}