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
public class V1CSIPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{

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

  public V1CSIPersistentVolumeSourceFluent() {
  }
  
  public V1CSIPersistentVolumeSourceFluent(V1CSIPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }

  public A addToVolumeAttributes(Map<String,String> map) {
    if (this.volumeAttributes == null && map != null) {
      this.volumeAttributes = new LinkedHashMap();
    }
    if (map != null) {
      this.volumeAttributes.putAll(map);
    }
    return (A) this;
  }
  
  public A addToVolumeAttributes(String key,String value) {
    if (this.volumeAttributes == null && key != null && value != null) {
      this.volumeAttributes = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.volumeAttributes.put(key, value);
    }
    return (A) this;
  }
  
  public V1SecretReference buildControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null ? this.controllerExpandSecretRef.build() : null;
  }
  
  public V1SecretReference buildControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null ? this.controllerPublishSecretRef.build() : null;
  }
  
  public V1SecretReference buildNodeExpandSecretRef() {
    return this.nodeExpandSecretRef != null ? this.nodeExpandSecretRef.build() : null;
  }
  
  public V1SecretReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }
  
  public V1SecretReference buildNodeStageSecretRef() {
    return this.nodeStageSecretRef != null ? this.nodeStageSecretRef.build() : null;
  }
  
  protected void copyInstance(V1CSIPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1CSIPersistentVolumeSource();
    if (instance != null) {
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
  }
  
  public ControllerExpandSecretRefNested<A> editControllerExpandSecretRef() {
    return this.withNewControllerExpandSecretRefLike(Optional.ofNullable(this.buildControllerExpandSecretRef()).orElse(null));
  }
  
  public ControllerPublishSecretRefNested<A> editControllerPublishSecretRef() {
    return this.withNewControllerPublishSecretRefLike(Optional.ofNullable(this.buildControllerPublishSecretRef()).orElse(null));
  }
  
  public NodeExpandSecretRefNested<A> editNodeExpandSecretRef() {
    return this.withNewNodeExpandSecretRefLike(Optional.ofNullable(this.buildNodeExpandSecretRef()).orElse(null));
  }
  
  public NodePublishSecretRefNested<A> editNodePublishSecretRef() {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(null));
  }
  
  public NodeStageSecretRefNested<A> editNodeStageSecretRef() {
    return this.withNewNodeStageSecretRefLike(Optional.ofNullable(this.buildNodeStageSecretRef()).orElse(null));
  }
  
  public ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRef() {
    return this.withNewControllerExpandSecretRefLike(Optional.ofNullable(this.buildControllerExpandSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRefLike(V1SecretReference item) {
    return this.withNewControllerExpandSecretRefLike(Optional.ofNullable(this.buildControllerExpandSecretRef()).orElse(item));
  }
  
  public ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRef() {
    return this.withNewControllerPublishSecretRefLike(Optional.ofNullable(this.buildControllerPublishSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRefLike(V1SecretReference item) {
    return this.withNewControllerPublishSecretRefLike(Optional.ofNullable(this.buildControllerPublishSecretRef()).orElse(item));
  }
  
  public NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRef() {
    return this.withNewNodeExpandSecretRefLike(Optional.ofNullable(this.buildNodeExpandSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRefLike(V1SecretReference item) {
    return this.withNewNodeExpandSecretRefLike(Optional.ofNullable(this.buildNodeExpandSecretRef()).orElse(item));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef() {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1SecretReference item) {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(item));
  }
  
  public NodeStageSecretRefNested<A> editOrNewNodeStageSecretRef() {
    return this.withNewNodeStageSecretRefLike(Optional.ofNullable(this.buildNodeStageSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public NodeStageSecretRefNested<A> editOrNewNodeStageSecretRefLike(V1SecretReference item) {
    return this.withNewNodeStageSecretRefLike(Optional.ofNullable(this.buildNodeStageSecretRef()).orElse(item));
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
    V1CSIPersistentVolumeSourceFluent that = (V1CSIPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(controllerExpandSecretRef, that.controllerExpandSecretRef))) {
      return false;
    }
    if (!(Objects.equals(controllerPublishSecretRef, that.controllerPublishSecretRef))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(nodeExpandSecretRef, that.nodeExpandSecretRef))) {
      return false;
    }
    if (!(Objects.equals(nodePublishSecretRef, that.nodePublishSecretRef))) {
      return false;
    }
    if (!(Objects.equals(nodeStageSecretRef, that.nodeStageSecretRef))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(volumeAttributes, that.volumeAttributes))) {
      return false;
    }
    if (!(Objects.equals(volumeHandle, that.volumeHandle))) {
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
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public Map<String,String> getVolumeAttributes() {
    return this.volumeAttributes;
  }
  
  public String getVolumeHandle() {
    return this.volumeHandle;
  }
  
  public boolean hasControllerExpandSecretRef() {
    return this.controllerExpandSecretRef != null;
  }
  
  public boolean hasControllerPublishSecretRef() {
    return this.controllerPublishSecretRef != null;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasNodeExpandSecretRef() {
    return this.nodeExpandSecretRef != null;
  }
  
  public boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }
  
  public boolean hasNodeStageSecretRef() {
    return this.nodeStageSecretRef != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasVolumeAttributes() {
    return this.volumeAttributes != null;
  }
  
  public boolean hasVolumeHandle() {
    return this.volumeHandle != null;
  }
  
  public int hashCode() {
    return Objects.hash(controllerExpandSecretRef, controllerPublishSecretRef, driver, fsType, nodeExpandSecretRef, nodePublishSecretRef, nodeStageSecretRef, readOnly, volumeAttributes, volumeHandle);
  }
  
  public A removeFromVolumeAttributes(String key) {
    if (this.volumeAttributes == null) {
      return (A) this;
    }
    if (key != null && this.volumeAttributes != null) {
      this.volumeAttributes.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromVolumeAttributes(Map<String,String> map) {
    if (this.volumeAttributes == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.volumeAttributes != null) {
          this.volumeAttributes.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(controllerExpandSecretRef == null)) {
        sb.append("controllerExpandSecretRef:");
        sb.append(controllerExpandSecretRef);
        sb.append(",");
    }
    if (!(controllerPublishSecretRef == null)) {
        sb.append("controllerPublishSecretRef:");
        sb.append(controllerPublishSecretRef);
        sb.append(",");
    }
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
    if (!(nodeExpandSecretRef == null)) {
        sb.append("nodeExpandSecretRef:");
        sb.append(nodeExpandSecretRef);
        sb.append(",");
    }
    if (!(nodePublishSecretRef == null)) {
        sb.append("nodePublishSecretRef:");
        sb.append(nodePublishSecretRef);
        sb.append(",");
    }
    if (!(nodeStageSecretRef == null)) {
        sb.append("nodeStageSecretRef:");
        sb.append(nodeStageSecretRef);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(volumeAttributes == null) && !(volumeAttributes.isEmpty())) {
        sb.append("volumeAttributes:");
        sb.append(volumeAttributes);
        sb.append(",");
    }
    if (!(volumeHandle == null)) {
        sb.append("volumeHandle:");
        sb.append(volumeHandle);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    this._visitables.remove("controllerExpandSecretRef");
    if (controllerExpandSecretRef != null) {
        this.controllerExpandSecretRef = new V1SecretReferenceBuilder(controllerExpandSecretRef);
        this._visitables.get("controllerExpandSecretRef").add(this.controllerExpandSecretRef);
    } else {
        this.controllerExpandSecretRef = null;
        this._visitables.get("controllerExpandSecretRef").remove(this.controllerExpandSecretRef);
    }
    return (A) this;
  }
  
  public A withControllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {
    this._visitables.remove("controllerPublishSecretRef");
    if (controllerPublishSecretRef != null) {
        this.controllerPublishSecretRef = new V1SecretReferenceBuilder(controllerPublishSecretRef);
        this._visitables.get("controllerPublishSecretRef").add(this.controllerPublishSecretRef);
    } else {
        this.controllerPublishSecretRef = null;
        this._visitables.get("controllerPublishSecretRef").remove(this.controllerPublishSecretRef);
    }
    return (A) this;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRef() {
    return new ControllerExpandSecretRefNested(null);
  }
  
  public ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRefLike(V1SecretReference item) {
    return new ControllerExpandSecretRefNested(item);
  }
  
  public ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRef() {
    return new ControllerPublishSecretRefNested(null);
  }
  
  public ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRefLike(V1SecretReference item) {
    return new ControllerPublishSecretRefNested(item);
  }
  
  public NodeExpandSecretRefNested<A> withNewNodeExpandSecretRef() {
    return new NodeExpandSecretRefNested(null);
  }
  
  public NodeExpandSecretRefNested<A> withNewNodeExpandSecretRefLike(V1SecretReference item) {
    return new NodeExpandSecretRefNested(item);
  }
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new NodePublishSecretRefNested(null);
  }
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1SecretReference item) {
    return new NodePublishSecretRefNested(item);
  }
  
  public NodeStageSecretRefNested<A> withNewNodeStageSecretRef() {
    return new NodeStageSecretRefNested(null);
  }
  
  public NodeStageSecretRefNested<A> withNewNodeStageSecretRefLike(V1SecretReference item) {
    return new NodeStageSecretRefNested(item);
  }
  
  public A withNodeExpandSecretRef(V1SecretReference nodeExpandSecretRef) {
    this._visitables.remove("nodeExpandSecretRef");
    if (nodeExpandSecretRef != null) {
        this.nodeExpandSecretRef = new V1SecretReferenceBuilder(nodeExpandSecretRef);
        this._visitables.get("nodeExpandSecretRef").add(this.nodeExpandSecretRef);
    } else {
        this.nodeExpandSecretRef = null;
        this._visitables.get("nodeExpandSecretRef").remove(this.nodeExpandSecretRef);
    }
    return (A) this;
  }
  
  public A withNodePublishSecretRef(V1SecretReference nodePublishSecretRef) {
    this._visitables.remove("nodePublishSecretRef");
    if (nodePublishSecretRef != null) {
        this.nodePublishSecretRef = new V1SecretReferenceBuilder(nodePublishSecretRef);
        this._visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);
    } else {
        this.nodePublishSecretRef = null;
        this._visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
    }
    return (A) this;
  }
  
  public A withNodeStageSecretRef(V1SecretReference nodeStageSecretRef) {
    this._visitables.remove("nodeStageSecretRef");
    if (nodeStageSecretRef != null) {
        this.nodeStageSecretRef = new V1SecretReferenceBuilder(nodeStageSecretRef);
        this._visitables.get("nodeStageSecretRef").add(this.nodeStageSecretRef);
    } else {
        this.nodeStageSecretRef = null;
        this._visitables.get("nodeStageSecretRef").remove(this.nodeStageSecretRef);
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
  
  public <K,V>A withVolumeAttributes(Map<String,String> volumeAttributes) {
    if (volumeAttributes == null) {
      this.volumeAttributes = null;
    } else {
      this.volumeAttributes = new LinkedHashMap(volumeAttributes);
    }
    return (A) this;
  }
  
  public A withVolumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
    return (A) this;
  }
  public class ControllerExpandSecretRefNested<N> extends V1SecretReferenceFluent<ControllerExpandSecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    ControllerExpandSecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluent.this.withControllerExpandSecretRef(builder.build());
    }
    
    public N endControllerExpandSecretRef() {
      return and();
    }
    
  }
  public class ControllerPublishSecretRefNested<N> extends V1SecretReferenceFluent<ControllerPublishSecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    ControllerPublishSecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluent.this.withControllerPublishSecretRef(builder.build());
    }
    
    public N endControllerPublishSecretRef() {
      return and();
    }
    
  }
  public class NodeExpandSecretRefNested<N> extends V1SecretReferenceFluent<NodeExpandSecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    NodeExpandSecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluent.this.withNodeExpandSecretRef(builder.build());
    }
    
    public N endNodeExpandSecretRef() {
      return and();
    }
    
  }
  public class NodePublishSecretRefNested<N> extends V1SecretReferenceFluent<NodePublishSecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    NodePublishSecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluent.this.withNodePublishSecretRef(builder.build());
    }
    
    public N endNodePublishSecretRef() {
      return and();
    }
    
  }
  public class NodeStageSecretRefNested<N> extends V1SecretReferenceFluent<NodeStageSecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    NodeStageSecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIPersistentVolumeSourceFluent.this.withNodeStageSecretRef(builder.build());
    }
    
    public N endNodeStageSecretRef() {
      return and();
    }
    
  }
}