package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeConfigSourceFluent<A extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<A>> extends BaseFluent<A>{
  public V1NodeConfigSourceFluent() {
  }
  
  public V1NodeConfigSourceFluent(V1NodeConfigSource instance) {
    this.copyInstance(instance);
  }
  private V1ConfigMapNodeConfigSourceBuilder configMap;
  
  protected void copyInstance(V1NodeConfigSource instance) {
    instance = instance != null ? instance : new V1NodeConfigSource();
    if (instance != null) {
      this.withConfigMap(instance.getConfigMap());
    }
  }
  
  public V1ConfigMapNodeConfigSource buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(V1ConfigMapNodeConfigSource configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new V1ConfigMapNodeConfigSourceBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapNodeConfigSource item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editConfigMap() {
    return this.withNewConfigMapLike(Optional.ofNullable(this.buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return this.withNewConfigMapLike(Optional.ofNullable(this.buildConfigMap()).orElse(new V1ConfigMapNodeConfigSourceBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapNodeConfigSource item) {
    return this.withNewConfigMapLike(Optional.ofNullable(this.buildConfigMap()).orElse(item));
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
    V1NodeConfigSourceFluent that = (V1NodeConfigSourceFluent) o;
    if (!(Objects.equals(configMap, that.configMap))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(configMap);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(configMap == null)) {
        sb.append("configMap:");
        sb.append(configMap);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapNested<N> extends V1ConfigMapNodeConfigSourceFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(V1ConfigMapNodeConfigSource item) {
      this.builder = new V1ConfigMapNodeConfigSourceBuilder(this, item);
    }
    V1ConfigMapNodeConfigSourceBuilder builder;
    
    public N and() {
      return (N) V1NodeConfigSourceFluent.this.withConfigMap(builder.build());
    }
    
    public N endConfigMap() {
      return and();
    }
    
  
  }

}