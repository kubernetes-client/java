package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2MetricSpecFluentImpl<A extends V2MetricSpecFluent<A>> extends BaseFluent<A> implements V2MetricSpecFluent<A>{
  public V2MetricSpecFluentImpl() {
  }
  public V2MetricSpecFluentImpl(V2MetricSpec instance) {
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

  }
  private V2ContainerResourceMetricSourceBuilder containerResource;
  private V2ExternalMetricSourceBuilder external;
  private V2ObjectMetricSourceBuilder _object;
  private V2PodsMetricSourceBuilder pods;
  private V2ResourceMetricSourceBuilder resource;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ContainerResourceMetricSource getContainerResource() {
    return this.containerResource!=null ?this.containerResource.build():null;
  }
  public V2ContainerResourceMetricSource buildContainerResource() {
    return this.containerResource!=null ?this.containerResource.build():null;
  }
  public A withContainerResource(V2ContainerResourceMetricSource containerResource) {
    _visitables.get("containerResource").remove(this.containerResource);
    if (containerResource!=null){ this.containerResource= new V2ContainerResourceMetricSourceBuilder(containerResource); _visitables.get("containerResource").add(this.containerResource);} else { this.containerResource = null; _visitables.get("containerResource").remove(this.containerResource); } return (A) this;
  }
  public Boolean hasContainerResource() {
    return this.containerResource != null;
  }
  public V2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource() {
    return new V2MetricSpecFluentImpl.ContainerResourceNestedImpl();
  }
  public V2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricSource item) {
    return new V2MetricSpecFluentImpl.ContainerResourceNestedImpl(item);
  }
  public V2MetricSpecFluent.ContainerResourceNested<A> editContainerResource() {
    return withNewContainerResourceLike(getContainerResource());
  }
  public V2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResource() {
    return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): new V2ContainerResourceMetricSourceBuilder().build());
  }
  public V2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricSource item) {
    return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ExternalMetricSource getExternal() {
    return this.external!=null ?this.external.build():null;
  }
  public V2ExternalMetricSource buildExternal() {
    return this.external!=null ?this.external.build():null;
  }
  public A withExternal(V2ExternalMetricSource external) {
    _visitables.get("external").remove(this.external);
    if (external!=null){ this.external= new V2ExternalMetricSourceBuilder(external); _visitables.get("external").add(this.external);} else { this.external = null; _visitables.get("external").remove(this.external); } return (A) this;
  }
  public Boolean hasExternal() {
    return this.external != null;
  }
  public V2MetricSpecFluent.ExternalNested<A> withNewExternal() {
    return new V2MetricSpecFluentImpl.ExternalNestedImpl();
  }
  public V2MetricSpecFluent.ExternalNested<A> withNewExternalLike(V2ExternalMetricSource item) {
    return new V2MetricSpecFluentImpl.ExternalNestedImpl(item);
  }
  public V2MetricSpecFluent.ExternalNested<A> editExternal() {
    return withNewExternalLike(getExternal());
  }
  public V2MetricSpecFluent.ExternalNested<A> editOrNewExternal() {
    return withNewExternalLike(getExternal() != null ? getExternal(): new V2ExternalMetricSourceBuilder().build());
  }
  public V2MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(V2ExternalMetricSource item) {
    return withNewExternalLike(getExternal() != null ? getExternal(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ObjectMetricSource getObject() {
    return this._object!=null ?this._object.build():null;
  }
  public V2ObjectMetricSource buildObject() {
    return this._object!=null ?this._object.build():null;
  }
  public A withObject(V2ObjectMetricSource _object) {
    _visitables.get("_object").remove(this._object);
    if (_object!=null){ this._object= new V2ObjectMetricSourceBuilder(_object); _visitables.get("_object").add(this._object);} else { this._object = null; _visitables.get("_object").remove(this._object); } return (A) this;
  }
  public Boolean hasObject() {
    return this._object != null;
  }
  public V2MetricSpecFluent.ObjectNested<A> withNewObject() {
    return new V2MetricSpecFluentImpl.ObjectNestedImpl();
  }
  public V2MetricSpecFluent.ObjectNested<A> withNewObjectLike(V2ObjectMetricSource item) {
    return new V2MetricSpecFluentImpl.ObjectNestedImpl(item);
  }
  public V2MetricSpecFluent.ObjectNested<A> editObject() {
    return withNewObjectLike(getObject());
  }
  public V2MetricSpecFluent.ObjectNested<A> editOrNewObject() {
    return withNewObjectLike(getObject() != null ? getObject(): new V2ObjectMetricSourceBuilder().build());
  }
  public V2MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(V2ObjectMetricSource item) {
    return withNewObjectLike(getObject() != null ? getObject(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2PodsMetricSource getPods() {
    return this.pods!=null ?this.pods.build():null;
  }
  public V2PodsMetricSource buildPods() {
    return this.pods!=null ?this.pods.build():null;
  }
  public A withPods(V2PodsMetricSource pods) {
    _visitables.get("pods").remove(this.pods);
    if (pods!=null){ this.pods= new V2PodsMetricSourceBuilder(pods); _visitables.get("pods").add(this.pods);} else { this.pods = null; _visitables.get("pods").remove(this.pods); } return (A) this;
  }
  public Boolean hasPods() {
    return this.pods != null;
  }
  public V2MetricSpecFluent.PodsNested<A> withNewPods() {
    return new V2MetricSpecFluentImpl.PodsNestedImpl();
  }
  public V2MetricSpecFluent.PodsNested<A> withNewPodsLike(V2PodsMetricSource item) {
    return new V2MetricSpecFluentImpl.PodsNestedImpl(item);
  }
  public V2MetricSpecFluent.PodsNested<A> editPods() {
    return withNewPodsLike(getPods());
  }
  public V2MetricSpecFluent.PodsNested<A> editOrNewPods() {
    return withNewPodsLike(getPods() != null ? getPods(): new V2PodsMetricSourceBuilder().build());
  }
  public V2MetricSpecFluent.PodsNested<A> editOrNewPodsLike(V2PodsMetricSource item) {
    return withNewPodsLike(getPods() != null ? getPods(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ResourceMetricSource getResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public V2ResourceMetricSource buildResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public A withResource(V2ResourceMetricSource resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource!=null){ this.resource= new V2ResourceMetricSourceBuilder(resource); _visitables.get("resource").add(this.resource);} else { this.resource = null; _visitables.get("resource").remove(this.resource); } return (A) this;
  }
  public Boolean hasResource() {
    return this.resource != null;
  }
  public V2MetricSpecFluent.ResourceNested<A> withNewResource() {
    return new V2MetricSpecFluentImpl.ResourceNestedImpl();
  }
  public V2MetricSpecFluent.ResourceNested<A> withNewResourceLike(V2ResourceMetricSource item) {
    return new V2MetricSpecFluentImpl.ResourceNestedImpl(item);
  }
  public V2MetricSpecFluent.ResourceNested<A> editResource() {
    return withNewResourceLike(getResource());
  }
  public V2MetricSpecFluent.ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(getResource() != null ? getResource(): new V2ResourceMetricSourceBuilder().build());
  }
  public V2MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(V2ResourceMetricSource item) {
    return withNewResourceLike(getResource() != null ? getResource(): item);
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2MetricSpecFluentImpl that = (V2MetricSpecFluentImpl) o;
    if (containerResource != null ? !containerResource.equals(that.containerResource) :that.containerResource != null) return false;
    if (external != null ? !external.equals(that.external) :that.external != null) return false;
    if (_object != null ? !_object.equals(that._object) :that._object != null) return false;
    if (pods != null ? !pods.equals(that.pods) :that.pods != null) return false;
    if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(containerResource,  external,  _object,  pods,  resource,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerResource != null) { sb.append("containerResource:"); sb.append(containerResource + ","); }
    if (external != null) { sb.append("external:"); sb.append(external + ","); }
    if (_object != null) { sb.append("_object:"); sb.append(_object + ","); }
    if (pods != null) { sb.append("pods:"); sb.append(pods + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  class ContainerResourceNestedImpl<N> extends V2ContainerResourceMetricSourceFluentImpl<V2MetricSpecFluent.ContainerResourceNested<N>> implements V2MetricSpecFluent.ContainerResourceNested<N>,Nested<N>{
    ContainerResourceNestedImpl(V2ContainerResourceMetricSource item) {
      this.builder = new V2ContainerResourceMetricSourceBuilder(this, item);
    }
    ContainerResourceNestedImpl() {
      this.builder = new V2ContainerResourceMetricSourceBuilder(this);
    }
    V2ContainerResourceMetricSourceBuilder builder;
    public N and() {
      return (N) V2MetricSpecFluentImpl.this.withContainerResource(builder.build());
    }
    public N endContainerResource() {
      return and();
    }
    
  }
  class ExternalNestedImpl<N> extends V2ExternalMetricSourceFluentImpl<V2MetricSpecFluent.ExternalNested<N>> implements V2MetricSpecFluent.ExternalNested<N>,Nested<N>{
    ExternalNestedImpl(V2ExternalMetricSource item) {
      this.builder = new V2ExternalMetricSourceBuilder(this, item);
    }
    ExternalNestedImpl() {
      this.builder = new V2ExternalMetricSourceBuilder(this);
    }
    V2ExternalMetricSourceBuilder builder;
    public N and() {
      return (N) V2MetricSpecFluentImpl.this.withExternal(builder.build());
    }
    public N endExternal() {
      return and();
    }
    
  }
  class ObjectNestedImpl<N> extends V2ObjectMetricSourceFluentImpl<V2MetricSpecFluent.ObjectNested<N>> implements V2MetricSpecFluent.ObjectNested<N>,Nested<N>{
    ObjectNestedImpl(V2ObjectMetricSource item) {
      this.builder = new V2ObjectMetricSourceBuilder(this, item);
    }
    ObjectNestedImpl() {
      this.builder = new V2ObjectMetricSourceBuilder(this);
    }
    V2ObjectMetricSourceBuilder builder;
    public N and() {
      return (N) V2MetricSpecFluentImpl.this.withObject(builder.build());
    }
    public N endObject() {
      return and();
    }
    
  }
  class PodsNestedImpl<N> extends V2PodsMetricSourceFluentImpl<V2MetricSpecFluent.PodsNested<N>> implements V2MetricSpecFluent.PodsNested<N>,Nested<N>{
    PodsNestedImpl(V2PodsMetricSource item) {
      this.builder = new V2PodsMetricSourceBuilder(this, item);
    }
    PodsNestedImpl() {
      this.builder = new V2PodsMetricSourceBuilder(this);
    }
    V2PodsMetricSourceBuilder builder;
    public N and() {
      return (N) V2MetricSpecFluentImpl.this.withPods(builder.build());
    }
    public N endPods() {
      return and();
    }
    
  }
  class ResourceNestedImpl<N> extends V2ResourceMetricSourceFluentImpl<V2MetricSpecFluent.ResourceNested<N>> implements V2MetricSpecFluent.ResourceNested<N>,Nested<N>{
    ResourceNestedImpl(V2ResourceMetricSource item) {
      this.builder = new V2ResourceMetricSourceBuilder(this, item);
    }
    ResourceNestedImpl() {
      this.builder = new V2ResourceMetricSourceBuilder(this);
    }
    V2ResourceMetricSourceBuilder builder;
    public N and() {
      return (N) V2MetricSpecFluentImpl.this.withResource(builder.build());
    }
    public N endResource() {
      return and();
    }
    
  }
  
}