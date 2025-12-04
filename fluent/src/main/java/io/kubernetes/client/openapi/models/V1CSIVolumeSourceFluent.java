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
public class V1CSIVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String driver;
  private String fsType;
  private V1LocalObjectReferenceBuilder nodePublishSecretRef;
  private Boolean readOnly;
  private Map<String,String> volumeAttributes;

  public V1CSIVolumeSourceFluent() {
  }
  
  public V1CSIVolumeSourceFluent(V1CSIVolumeSource instance) {
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
  
  public V1LocalObjectReference buildNodePublishSecretRef() {
    return this.nodePublishSecretRef != null ? this.nodePublishSecretRef.build() : null;
  }
  
  protected void copyInstance(V1CSIVolumeSource instance) {
    instance = instance != null ? instance : new V1CSIVolumeSource();
    if (instance != null) {
        this.withDriver(instance.getDriver());
        this.withFsType(instance.getFsType());
        this.withNodePublishSecretRef(instance.getNodePublishSecretRef());
        this.withReadOnly(instance.getReadOnly());
        this.withVolumeAttributes(instance.getVolumeAttributes());
    }
  }
  
  public NodePublishSecretRefNested<A> editNodePublishSecretRef() {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(null));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef() {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(new V1LocalObjectReferenceBuilder().build()));
  }
  
  public NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1LocalObjectReference item) {
    return this.withNewNodePublishSecretRefLike(Optional.ofNullable(this.buildNodePublishSecretRef()).orElse(item));
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
    V1CSIVolumeSourceFluent that = (V1CSIVolumeSourceFluent) o;
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(nodePublishSecretRef, that.nodePublishSecretRef))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(volumeAttributes, that.volumeAttributes))) {
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
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasNodePublishSecretRef() {
    return this.nodePublishSecretRef != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasVolumeAttributes() {
    return this.volumeAttributes != null;
  }
  
  public int hashCode() {
    return Objects.hash(driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes);
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
    if (!(nodePublishSecretRef == null)) {
        sb.append("nodePublishSecretRef:");
        sb.append(nodePublishSecretRef);
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
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRef() {
    return new NodePublishSecretRefNested(null);
  }
  
  public NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1LocalObjectReference item) {
    return new NodePublishSecretRefNested(item);
  }
  
  public A withNodePublishSecretRef(V1LocalObjectReference nodePublishSecretRef) {
    this._visitables.remove("nodePublishSecretRef");
    if (nodePublishSecretRef != null) {
        this.nodePublishSecretRef = new V1LocalObjectReferenceBuilder(nodePublishSecretRef);
        this._visitables.get("nodePublishSecretRef").add(this.nodePublishSecretRef);
    } else {
        this.nodePublishSecretRef = null;
        this._visitables.get("nodePublishSecretRef").remove(this.nodePublishSecretRef);
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
  public class NodePublishSecretRefNested<N> extends V1LocalObjectReferenceFluent<NodePublishSecretRefNested<N>> implements Nested<N>{
  
    V1LocalObjectReferenceBuilder builder;
  
    NodePublishSecretRefNested(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CSIVolumeSourceFluent.this.withNodePublishSecretRef(builder.build());
    }
    
    public N endNodePublishSecretRef() {
      return and();
    }
    
  }
}