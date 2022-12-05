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
  public class V1NodeConfigSourceFluentImpl<A extends V1NodeConfigSourceFluent<A>> extends BaseFluent<A> implements V1NodeConfigSourceFluent<A>{
  public V1NodeConfigSourceFluentImpl() {
  }
  public V1NodeConfigSourceFluentImpl(V1NodeConfigSource instance) {
    this.withConfigMap(instance.getConfigMap());

  }
  private V1ConfigMapNodeConfigSourceBuilder configMap;
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapNodeConfigSource getConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public V1ConfigMapNodeConfigSource buildConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public A withConfigMap(V1ConfigMapNodeConfigSource configMap) {
    _visitables.get("configMap").remove(this.configMap);
    if (configMap!=null){ this.configMap= new V1ConfigMapNodeConfigSourceBuilder(configMap); _visitables.get("configMap").add(this.configMap);} else { this.configMap = null; _visitables.get("configMap").remove(this.configMap); } return (A) this;
  }
  public Boolean hasConfigMap() {
    return this.configMap != null;
  }
  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap() {
    return new V1NodeConfigSourceFluentImpl.ConfigMapNestedImpl();
  }
  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapNodeConfigSource item) {
    return new V1NodeConfigSourceFluentImpl.ConfigMapNestedImpl(item);
  }
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(getConfigMap());
  }
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new V1ConfigMapNodeConfigSourceBuilder().build());
  }
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapNodeConfigSource item) {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeConfigSourceFluentImpl that = (V1NodeConfigSourceFluentImpl) o;
    if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(configMap,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap); }
    sb.append("}");
    return sb.toString();
  }
  class ConfigMapNestedImpl<N> extends V1ConfigMapNodeConfigSourceFluentImpl<V1NodeConfigSourceFluent.ConfigMapNested<N>> implements V1NodeConfigSourceFluent.ConfigMapNested<N>,Nested<N>{
    ConfigMapNestedImpl(V1ConfigMapNodeConfigSource item) {
      this.builder = new V1ConfigMapNodeConfigSourceBuilder(this, item);
    }
    ConfigMapNestedImpl() {
      this.builder = new V1ConfigMapNodeConfigSourceBuilder(this);
    }
    V1ConfigMapNodeConfigSourceBuilder builder;
    public N and() {
      return (N) V1NodeConfigSourceFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap() {
      return and();
    }
    
  }
  
}