package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CSIPersistentVolumeSourceFluentImpl<A extends V1CSIPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1CSIPersistentVolumeSourceFluent<A>{
  public V1CSIPersistentVolumeSourceFluentImpl() {
  }
  public V1CSIPersistentVolumeSourceFluentImpl(V1CSIPersistentVolumeSource instance) {
    this.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodeExpandSecretRef(instance.getNodeExpandSecretRef());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.withVolumeHandle(instance.getVolumeHandle());

  }
  private V1SecretReferenceBuilder controllerExpandSecretRef;
  private V1SecretReferenceBuilder controllerPublishSecretRef;
  private String driver;
  private String fsType;
  private V1SecretReferenceBuilder nodeExpandSecretRef;
  private V1SecretReferenceBuilder nodePublishSecretRef;
  private V1SecretReferenceBuilder nodeStageSecretRef;
  private Boolean readOnly;
  private Map<String,String> volumeAttributes;
  private String volumeHandle;
  
  /**
   * This method has been deprecated, please use method buildControllerExpandSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getControllerExpandSecretRef() {
    return this.controllerExpandSecretRef!=null ?this.controllerExpandSecretRef.build():null;
  }
  public V1SecretReference buildControllerExpandSecretRef() {
    return this.controllerExpandSecretRef!=null ?this.controllerExpandSecretRef.build():null;
  }
  public A withControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    _visitables.get("controllerExpandSecretRef").remove(this.controllerExpandSecretRef);
    if (controllerExpandSecretRef!=null){ this.controllerExpandSecretRef= new V1SecretReferenceBuilder(controllerExpandSecretRef); _visitables.get("controllerExpandSecretRef").add(this.controllerExpandSecretRef);} else { this.controllerExpandSecretRef = null; _visitables.get("controllerExpandSecretRef").remove(this.controllerExpandSecretRef); } return (A) this;
  }
  public Boolean hasControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null;
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerExpandSecretRefNestedImpl();
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRefLike(V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerExpandSecretRefNestedImpl(item);
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editControllerExpandSecretRef() {
    return withNewControllerExpandSecretRefLike(getControllerExpandSecretRef());
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRef() {
    return withNewControllerExpandSecretRefLike(getControllerExpandSecretRef() != null ? getControllerExpandSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRefLike(V1SecretReference item) {
    return withNewControllerExpandSecretRefLike(getControllerExpandSecretRef() != null ? getControllerExpandSecretRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getControllerPublishSecretRef() {
    return this.controllerPublishSecretRef!=null ?this.controllerPublishSecretRef.build():null;
  }
  public V1SecretReference buildControllerPublishSecretRef() {
    return this.controllerPublishSecretRef!=null ?this.controllerPublishSecretRef.build():null;
  }
  public A withControllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {
    _visitables.get("controllerPublishSecretRef").remove(this.controllerPublishSecretRef);
    if (controllerPublishSecretRef!=null){ this.controllerPublishSecretRef= new V1SecretReferenceBuilder(controllerPublishSecretRef); _visitables.get("controllerPublishSecretRef").add(this.controllerPublishSecretRef);} else { this.controllerPublishSecretRef = null; _visitables.get("controllerPublishSecretRef").remove(this.controllerPublishSecretRef); } return (A) this;
  }
  public Boolean hasControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null;
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerPublishSecretRefNestedImpl();
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRefLike(V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.ControllerPublishSecretRefNestedImpl(item);
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editControllerPublishSecretRef() {
    return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef());
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRef() {
    return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef() != null ? getControllerPublishSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRefLike(V1SecretReference item) {
    return withNewControllerPublishSecretRefLike(getControllerPublishSecretRef() != null ? getControllerPublishSecretRef(): item);
  }
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
   * This method has been deprecated, please use method buildNodeExpandSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodeExpandSecretRef() {
    return this.nodeExpandSecretRef!=null ?this.nodeExpandSecretRef.build():null;
  }
  public V1SecretReference buildNodeExpandSecretRef() {
    return this.nodeExpandSecretRef!=null ?this.nodeExpandSecretRef.build():null;
  }
  public A withNodeExpandSecretRef(V1SecretReference nodeExpandSecretRef) {
    _visitables.get("nodeExpandSecretRef").remove(this.nodeExpandSecretRef);
    if (nodeExpandSecretRef!=null){ this.nodeExpandSecretRef= new V1SecretReferenceBuilder(nodeExpandSecretRef); _visitables.get("nodeExpandSecretRef").add(this.nodeExpandSecretRef);} else { this.nodeExpandSecretRef = null; _visitables.get("nodeExpandSecretRef").remove(this.nodeExpandSecretRef); } return (A) this;
  }
  public Boolean hasNodeExpandSecretRef() {
    return this.nodeExpandSecretRef != null;
  }
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> withNewNodeExpandSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodeExpandSecretRefNestedImpl();
  }
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> withNewNodeExpandSecretRefLike(V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodeExpandSecretRefNestedImpl(item);
  }
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editNodeExpandSecretRef() {
    return withNewNodeExpandSecretRefLike(getNodeExpandSecretRef());
  }
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRef() {
    return withNewNodeExpandSecretRefLike(getNodeExpandSecretRef() != null ? getNodeExpandSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRefLike(V1SecretReference item) {
    return withNewNodeExpandSecretRefLike(getNodeExpandSecretRef() != null ? getNodeExpandSecretRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodePublishSecretRef() {
    return this.nodePublishSecretRef!=null ?this.nodePublishSecretRef.build():null;
  }
  public V1SecretReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef!=null ?this.nodePublishSecretRef.build():null;
  }
  public A withNodePublishSecretRef(V1SecretReference nodePublishSecretRef) {
    _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    if (nodePublishSecretRef!=null){ this.nodePublishSecretRef= new V1SecretReferenceBuilder(nodePublishSecretRef); _visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);} else { this.nodePublishSecretRef = null; _visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef); } return (A) this;
  }
  public Boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl();
  }
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodePublishSecretRefNestedImpl(item);
  }
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef());
  }
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef() {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1SecretReference item) {
    return withNewNodePublishSecretRefLike(getNodePublishSecretRef() != null ? getNodePublishSecretRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildNodeStageSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodeStageSecretRef() {
    return this.nodeStageSecretRef!=null ?this.nodeStageSecretRef.build():null;
  }
  public V1SecretReference buildNodeStageSecretRef() {
    return this.nodeStageSecretRef!=null ?this.nodeStageSecretRef.build():null;
  }
  public A withNodeStageSecretRef(V1SecretReference nodeStageSecretRef) {
    _visitables.get("nodeStageSecretRef").remove(this.nodeStageSecretRef);
    if (nodeStageSecretRef!=null){ this.nodeStageSecretRef= new V1SecretReferenceBuilder(nodeStageSecretRef); _visitables.get("nodeStageSecretRef").add(this.nodeStageSecretRef);} else { this.nodeStageSecretRef = null; _visitables.get("nodeStageSecretRef").remove(this.nodeStageSecretRef); } return (A) this;
  }
  public Boolean hasNodeStageSecretRef() {
    return this.nodeStageSecretRef != null;
  }
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef() {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodeStageSecretRefNestedImpl();
  }
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRefLike(V1SecretReference item) {
    return new V1CSIPersistentVolumeSourceFluentImpl.NodeStageSecretRefNestedImpl(item);
  }
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editNodeStageSecretRef() {
    return withNewNodeStageSecretRefLike(getNodeStageSecretRef());
  }
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRef() {
    return withNewNodeStageSecretRefLike(getNodeStageSecretRef() != null ? getNodeStageSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRefLike(V1SecretReference item) {
    return withNewNodeStageSecretRefLike(getNodeStageSecretRef() != null ? getNodeStageSecretRef(): item);
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
  public String getVolumeHandle() {
    return this.volumeHandle;
  }
  public A withVolumeHandle(String volumeHandle) {
    this.volumeHandle=volumeHandle; return (A) this;
  }
  public Boolean hasVolumeHandle() {
    return this.volumeHandle != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIPersistentVolumeSourceFluentImpl that = (V1CSIPersistentVolumeSourceFluentImpl) o;
    if (controllerExpandSecretRef != null ? !controllerExpandSecretRef.equals(that.controllerExpandSecretRef) :that.controllerExpandSecretRef != null) return false;
    if (controllerPublishSecretRef != null ? !controllerPublishSecretRef.equals(that.controllerPublishSecretRef) :that.controllerPublishSecretRef != null) return false;
    if (driver != null ? !driver.equals(that.driver) :that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (nodeExpandSecretRef != null ? !nodeExpandSecretRef.equals(that.nodeExpandSecretRef) :that.nodeExpandSecretRef != null) return false;
    if (nodePublishSecretRef != null ? !nodePublishSecretRef.equals(that.nodePublishSecretRef) :that.nodePublishSecretRef != null) return false;
    if (nodeStageSecretRef != null ? !nodeStageSecretRef.equals(that.nodeStageSecretRef) :that.nodeStageSecretRef != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (volumeAttributes != null ? !volumeAttributes.equals(that.volumeAttributes) :that.volumeAttributes != null) return false;
    if (volumeHandle != null ? !volumeHandle.equals(that.volumeHandle) :that.volumeHandle != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(controllerExpandSecretRef,  controllerPublishSecretRef,  driver,  fsType,  nodeExpandSecretRef,  nodePublishSecretRef,  nodeStageSecretRef,  readOnly,  volumeAttributes,  volumeHandle,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (controllerExpandSecretRef != null) { sb.append("controllerExpandSecretRef:"); sb.append(controllerExpandSecretRef + ","); }
    if (controllerPublishSecretRef != null) { sb.append("controllerPublishSecretRef:"); sb.append(controllerPublishSecretRef + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (nodeExpandSecretRef != null) { sb.append("nodeExpandSecretRef:"); sb.append(nodeExpandSecretRef + ","); }
    if (nodePublishSecretRef != null) { sb.append("nodePublishSecretRef:"); sb.append(nodePublishSecretRef + ","); }
    if (nodeStageSecretRef != null) { sb.append("nodeStageSecretRef:"); sb.append(nodeStageSecretRef + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (volumeAttributes != null && !volumeAttributes.isEmpty()) { sb.append("volumeAttributes:"); sb.append(volumeAttributes + ","); }
    if (volumeHandle != null) { sb.append("volumeHandle:"); sb.append(volumeHandle); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class ControllerExpandSecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<N>> implements V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<N>,Nested<N>{
    ControllerExpandSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    ControllerExpandSecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withControllerExpandSecretRef(builder.build());
    }
    public N endControllerExpandSecretRef() {
      return and();
    }
    
  }
  class ControllerPublishSecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>> implements V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>,Nested<N>{
    ControllerPublishSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    ControllerPublishSecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withControllerPublishSecretRef(builder.build());
    }
    public N endControllerPublishSecretRef() {
      return and();
    }
    
  }
  class NodeExpandSecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<N>> implements V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<N>,Nested<N>{
    NodeExpandSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    NodeExpandSecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withNodeExpandSecretRef(builder.build());
    }
    public N endNodeExpandSecretRef() {
      return and();
    }
    
  }
  class NodePublishSecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>> implements V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>,Nested<N>{
    NodePublishSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    NodePublishSecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withNodePublishSecretRef(builder.build());
    }
    public N endNodePublishSecretRef() {
      return and();
    }
    
  }
  class NodeStageSecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>> implements V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>,Nested<N>{
    NodeStageSecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    NodeStageSecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluentImpl.this.withNodeStageSecretRef(builder.build());
    }
    public N endNodeStageSecretRef() {
      return and();
    }
    
  }
  
}