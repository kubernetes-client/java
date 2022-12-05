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
  public class V2MetricStatusFluentImpl<A extends V2MetricStatusFluent<A>> extends BaseFluent<A> implements V2MetricStatusFluent<A>{
  public V2MetricStatusFluentImpl() {
  }
  public V2MetricStatusFluentImpl(V2MetricStatus instance) {
    this.withContainerResource(instance.getContainerResource());

    this.withExternal(instance.getExternal());

    this.withObject(instance.getObject());

    this.withPods(instance.getPods());

    this.withResource(instance.getResource());

    this.withType(instance.getType());

  }
  private V2ContainerResourceMetricStatusBuilder containerResource;
  private V2ExternalMetricStatusBuilder external;
  private V2ObjectMetricStatusBuilder _object;
  private V2PodsMetricStatusBuilder pods;
  private V2ResourceMetricStatusBuilder resource;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ContainerResourceMetricStatus getContainerResource() {
    return this.containerResource!=null ?this.containerResource.build():null;
  }
  public V2ContainerResourceMetricStatus buildContainerResource() {
    return this.containerResource!=null ?this.containerResource.build():null;
  }
  public A withContainerResource(V2ContainerResourceMetricStatus containerResource) {
    _visitables.get("containerResource").remove(this.containerResource);
    if (containerResource!=null){ this.containerResource= new V2ContainerResourceMetricStatusBuilder(containerResource); _visitables.get("containerResource").add(this.containerResource);} else { this.containerResource = null; _visitables.get("containerResource").remove(this.containerResource); } return (A) this;
  }
  public Boolean hasContainerResource() {
    return this.containerResource != null;
  }
  public V2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource() {
    return new V2MetricStatusFluentImpl.ContainerResourceNestedImpl();
  }
  public V2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return new V2MetricStatusFluentImpl.ContainerResourceNestedImpl(item);
  }
  public V2MetricStatusFluent.ContainerResourceNested<A> editContainerResource() {
    return withNewContainerResourceLike(getContainerResource());
  }
  public V2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResource() {
    return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): new V2ContainerResourceMetricStatusBuilder().build());
  }
  public V2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ExternalMetricStatus getExternal() {
    return this.external!=null ?this.external.build():null;
  }
  public V2ExternalMetricStatus buildExternal() {
    return this.external!=null ?this.external.build():null;
  }
  public A withExternal(V2ExternalMetricStatus external) {
    _visitables.get("external").remove(this.external);
    if (external!=null){ this.external= new V2ExternalMetricStatusBuilder(external); _visitables.get("external").add(this.external);} else { this.external = null; _visitables.get("external").remove(this.external); } return (A) this;
  }
  public Boolean hasExternal() {
    return this.external != null;
  }
  public V2MetricStatusFluent.ExternalNested<A> withNewExternal() {
    return new V2MetricStatusFluentImpl.ExternalNestedImpl();
  }
  public V2MetricStatusFluent.ExternalNested<A> withNewExternalLike(V2ExternalMetricStatus item) {
    return new V2MetricStatusFluentImpl.ExternalNestedImpl(item);
  }
  public V2MetricStatusFluent.ExternalNested<A> editExternal() {
    return withNewExternalLike(getExternal());
  }
  public V2MetricStatusFluent.ExternalNested<A> editOrNewExternal() {
    return withNewExternalLike(getExternal() != null ? getExternal(): new V2ExternalMetricStatusBuilder().build());
  }
  public V2MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(V2ExternalMetricStatus item) {
    return withNewExternalLike(getExternal() != null ? getExternal(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ObjectMetricStatus getObject() {
    return this._object!=null ?this._object.build():null;
  }
  public V2ObjectMetricStatus buildObject() {
    return this._object!=null ?this._object.build():null;
  }
  public A withObject(V2ObjectMetricStatus _object) {
    _visitables.get("_object").remove(this._object);
    if (_object!=null){ this._object= new V2ObjectMetricStatusBuilder(_object); _visitables.get("_object").add(this._object);} else { this._object = null; _visitables.get("_object").remove(this._object); } return (A) this;
  }
  public Boolean hasObject() {
    return this._object != null;
  }
  public V2MetricStatusFluent.ObjectNested<A> withNewObject() {
    return new V2MetricStatusFluentImpl.ObjectNestedImpl();
  }
  public V2MetricStatusFluent.ObjectNested<A> withNewObjectLike(V2ObjectMetricStatus item) {
    return new V2MetricStatusFluentImpl.ObjectNestedImpl(item);
  }
  public V2MetricStatusFluent.ObjectNested<A> editObject() {
    return withNewObjectLike(getObject());
  }
  public V2MetricStatusFluent.ObjectNested<A> editOrNewObject() {
    return withNewObjectLike(getObject() != null ? getObject(): new V2ObjectMetricStatusBuilder().build());
  }
  public V2MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(V2ObjectMetricStatus item) {
    return withNewObjectLike(getObject() != null ? getObject(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2PodsMetricStatus getPods() {
    return this.pods!=null ?this.pods.build():null;
  }
  public V2PodsMetricStatus buildPods() {
    return this.pods!=null ?this.pods.build():null;
  }
  public A withPods(V2PodsMetricStatus pods) {
    _visitables.get("pods").remove(this.pods);
    if (pods!=null){ this.pods= new V2PodsMetricStatusBuilder(pods); _visitables.get("pods").add(this.pods);} else { this.pods = null; _visitables.get("pods").remove(this.pods); } return (A) this;
  }
  public Boolean hasPods() {
    return this.pods != null;
  }
  public V2MetricStatusFluent.PodsNested<A> withNewPods() {
    return new V2MetricStatusFluentImpl.PodsNestedImpl();
  }
  public V2MetricStatusFluent.PodsNested<A> withNewPodsLike(V2PodsMetricStatus item) {
    return new V2MetricStatusFluentImpl.PodsNestedImpl(item);
  }
  public V2MetricStatusFluent.PodsNested<A> editPods() {
    return withNewPodsLike(getPods());
  }
  public V2MetricStatusFluent.PodsNested<A> editOrNewPods() {
    return withNewPodsLike(getPods() != null ? getPods(): new V2PodsMetricStatusBuilder().build());
  }
  public V2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(V2PodsMetricStatus item) {
    return withNewPodsLike(getPods() != null ? getPods(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ResourceMetricStatus getResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public V2ResourceMetricStatus buildResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public A withResource(V2ResourceMetricStatus resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource!=null){ this.resource= new V2ResourceMetricStatusBuilder(resource); _visitables.get("resource").add(this.resource);} else { this.resource = null; _visitables.get("resource").remove(this.resource); } return (A) this;
  }
  public Boolean hasResource() {
    return this.resource != null;
  }
  public V2MetricStatusFluent.ResourceNested<A> withNewResource() {
    return new V2MetricStatusFluentImpl.ResourceNestedImpl();
  }
  public V2MetricStatusFluent.ResourceNested<A> withNewResourceLike(V2ResourceMetricStatus item) {
    return new V2MetricStatusFluentImpl.ResourceNestedImpl(item);
  }
  public V2MetricStatusFluent.ResourceNested<A> editResource() {
    return withNewResourceLike(getResource());
  }
  public V2MetricStatusFluent.ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(getResource() != null ? getResource(): new V2ResourceMetricStatusBuilder().build());
  }
  public V2MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(V2ResourceMetricStatus item) {
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
    V2MetricStatusFluentImpl that = (V2MetricStatusFluentImpl) o;
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
  class ContainerResourceNestedImpl<N> extends V2ContainerResourceMetricStatusFluentImpl<V2MetricStatusFluent.ContainerResourceNested<N>> implements V2MetricStatusFluent.ContainerResourceNested<N>,Nested<N>{
    ContainerResourceNestedImpl(V2ContainerResourceMetricStatus item) {
      this.builder = new V2ContainerResourceMetricStatusBuilder(this, item);
    }
    ContainerResourceNestedImpl() {
      this.builder = new V2ContainerResourceMetricStatusBuilder(this);
    }
    V2ContainerResourceMetricStatusBuilder builder;
    public N and() {
      return (N) V2MetricStatusFluentImpl.this.withContainerResource(builder.build());
    }
    public N endContainerResource() {
      return and();
    }
    
  }
  class ExternalNestedImpl<N> extends V2ExternalMetricStatusFluentImpl<V2MetricStatusFluent.ExternalNested<N>> implements V2MetricStatusFluent.ExternalNested<N>,Nested<N>{
    ExternalNestedImpl(V2ExternalMetricStatus item) {
      this.builder = new V2ExternalMetricStatusBuilder(this, item);
    }
    ExternalNestedImpl() {
      this.builder = new V2ExternalMetricStatusBuilder(this);
    }
    V2ExternalMetricStatusBuilder builder;
    public N and() {
      return (N) V2MetricStatusFluentImpl.this.withExternal(builder.build());
    }
    public N endExternal() {
      return and();
    }
    
  }
  class ObjectNestedImpl<N> extends V2ObjectMetricStatusFluentImpl<V2MetricStatusFluent.ObjectNested<N>> implements V2MetricStatusFluent.ObjectNested<N>,Nested<N>{
    ObjectNestedImpl(V2ObjectMetricStatus item) {
      this.builder = new V2ObjectMetricStatusBuilder(this, item);
    }
    ObjectNestedImpl() {
      this.builder = new V2ObjectMetricStatusBuilder(this);
    }
    V2ObjectMetricStatusBuilder builder;
    public N and() {
      return (N) V2MetricStatusFluentImpl.this.withObject(builder.build());
    }
    public N endObject() {
      return and();
    }
    
  }
  class PodsNestedImpl<N> extends V2PodsMetricStatusFluentImpl<V2MetricStatusFluent.PodsNested<N>> implements V2MetricStatusFluent.PodsNested<N>,Nested<N>{
    PodsNestedImpl(V2PodsMetricStatus item) {
      this.builder = new V2PodsMetricStatusBuilder(this, item);
    }
    PodsNestedImpl() {
      this.builder = new V2PodsMetricStatusBuilder(this);
    }
    V2PodsMetricStatusBuilder builder;
    public N and() {
      return (N) V2MetricStatusFluentImpl.this.withPods(builder.build());
    }
    public N endPods() {
      return and();
    }
    
  }
  class ResourceNestedImpl<N> extends V2ResourceMetricStatusFluentImpl<V2MetricStatusFluent.ResourceNested<N>> implements V2MetricStatusFluent.ResourceNested<N>,Nested<N>{
    ResourceNestedImpl(V2ResourceMetricStatus item) {
      this.builder = new V2ResourceMetricStatusBuilder(this, item);
    }
    ResourceNestedImpl() {
      this.builder = new V2ResourceMetricStatusBuilder(this);
    }
    V2ResourceMetricStatusBuilder builder;
    public N and() {
      return (N) V2MetricStatusFluentImpl.this.withResource(builder.build());
    }
    public N endResource() {
      return and();
    }
    
  }
  
}