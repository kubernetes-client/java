package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2MetricStatusFluent<A extends V2MetricStatusFluent<A>> extends BaseFluent<A>{
  public V2MetricStatusFluent() {
  }
  
  public V2MetricStatusFluent(V2MetricStatus instance) {
    this.copyInstance(instance);
  }
  private V2ContainerResourceMetricStatusBuilder containerResource;
  private V2ExternalMetricStatusBuilder external;
  private V2ObjectMetricStatusBuilder _object;
  private V2PodsMetricStatusBuilder pods;
  private V2ResourceMetricStatusBuilder resource;
  private String type;
  
  protected void copyInstance(V2MetricStatus instance) {
    instance = (instance != null ? instance : new V2MetricStatus());
    if (instance != null) {
          this.withContainerResource(instance.getContainerResource());
          this.withExternal(instance.getExternal());
          this.withObject(instance.getObject());
          this.withPods(instance.getPods());
          this.withResource(instance.getResource());
          this.withType(instance.getType());
        }
  }
  
  public V2ContainerResourceMetricStatus buildContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }
  
  public A withContainerResource(V2ContainerResourceMetricStatus containerResource) {
    this._visitables.remove("containerResource");
    if (containerResource != null) {
        this.containerResource = new V2ContainerResourceMetricStatusBuilder(containerResource);
        this._visitables.get("containerResource").add(this.containerResource);
    } else {
        this.containerResource = null;
        this._visitables.get("containerResource").remove(this.containerResource);
    }
    return (A) this;
  }
  
  public boolean hasContainerResource() {
    return this.containerResource != null;
  }
  
  public ContainerResourceNested<A> withNewContainerResource() {
    return new ContainerResourceNested(null);
  }
  
  public ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return new ContainerResourceNested(item);
  }
  
  public ContainerResourceNested<A> editContainerResource() {
    return withNewContainerResourceLike(java.util.Optional.ofNullable(buildContainerResource()).orElse(null));
  }
  
  public ContainerResourceNested<A> editOrNewContainerResource() {
    return withNewContainerResourceLike(java.util.Optional.ofNullable(buildContainerResource()).orElse(new V2ContainerResourceMetricStatusBuilder().build()));
  }
  
  public ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return withNewContainerResourceLike(java.util.Optional.ofNullable(buildContainerResource()).orElse(item));
  }
  
  public V2ExternalMetricStatus buildExternal() {
    return this.external != null ? this.external.build() : null;
  }
  
  public A withExternal(V2ExternalMetricStatus external) {
    this._visitables.remove("external");
    if (external != null) {
        this.external = new V2ExternalMetricStatusBuilder(external);
        this._visitables.get("external").add(this.external);
    } else {
        this.external = null;
        this._visitables.get("external").remove(this.external);
    }
    return (A) this;
  }
  
  public boolean hasExternal() {
    return this.external != null;
  }
  
  public ExternalNested<A> withNewExternal() {
    return new ExternalNested(null);
  }
  
  public ExternalNested<A> withNewExternalLike(V2ExternalMetricStatus item) {
    return new ExternalNested(item);
  }
  
  public ExternalNested<A> editExternal() {
    return withNewExternalLike(java.util.Optional.ofNullable(buildExternal()).orElse(null));
  }
  
  public ExternalNested<A> editOrNewExternal() {
    return withNewExternalLike(java.util.Optional.ofNullable(buildExternal()).orElse(new V2ExternalMetricStatusBuilder().build()));
  }
  
  public ExternalNested<A> editOrNewExternalLike(V2ExternalMetricStatus item) {
    return withNewExternalLike(java.util.Optional.ofNullable(buildExternal()).orElse(item));
  }
  
  public V2ObjectMetricStatus buildObject() {
    return this._object != null ? this._object.build() : null;
  }
  
  public A withObject(V2ObjectMetricStatus _object) {
    this._visitables.remove("_object");
    if (_object != null) {
        this._object = new V2ObjectMetricStatusBuilder(_object);
        this._visitables.get("_object").add(this._object);
    } else {
        this._object = null;
        this._visitables.get("_object").remove(this._object);
    }
    return (A) this;
  }
  
  public boolean hasObject() {
    return this._object != null;
  }
  
  public ObjectNested<A> withNewObject() {
    return new ObjectNested(null);
  }
  
  public ObjectNested<A> withNewObjectLike(V2ObjectMetricStatus item) {
    return new ObjectNested(item);
  }
  
  public ObjectNested<A> editObject() {
    return withNewObjectLike(java.util.Optional.ofNullable(buildObject()).orElse(null));
  }
  
  public ObjectNested<A> editOrNewObject() {
    return withNewObjectLike(java.util.Optional.ofNullable(buildObject()).orElse(new V2ObjectMetricStatusBuilder().build()));
  }
  
  public ObjectNested<A> editOrNewObjectLike(V2ObjectMetricStatus item) {
    return withNewObjectLike(java.util.Optional.ofNullable(buildObject()).orElse(item));
  }
  
  public V2PodsMetricStatus buildPods() {
    return this.pods != null ? this.pods.build() : null;
  }
  
  public A withPods(V2PodsMetricStatus pods) {
    this._visitables.remove("pods");
    if (pods != null) {
        this.pods = new V2PodsMetricStatusBuilder(pods);
        this._visitables.get("pods").add(this.pods);
    } else {
        this.pods = null;
        this._visitables.get("pods").remove(this.pods);
    }
    return (A) this;
  }
  
  public boolean hasPods() {
    return this.pods != null;
  }
  
  public PodsNested<A> withNewPods() {
    return new PodsNested(null);
  }
  
  public PodsNested<A> withNewPodsLike(V2PodsMetricStatus item) {
    return new PodsNested(item);
  }
  
  public PodsNested<A> editPods() {
    return withNewPodsLike(java.util.Optional.ofNullable(buildPods()).orElse(null));
  }
  
  public PodsNested<A> editOrNewPods() {
    return withNewPodsLike(java.util.Optional.ofNullable(buildPods()).orElse(new V2PodsMetricStatusBuilder().build()));
  }
  
  public PodsNested<A> editOrNewPodsLike(V2PodsMetricStatus item) {
    return withNewPodsLike(java.util.Optional.ofNullable(buildPods()).orElse(item));
  }
  
  public V2ResourceMetricStatus buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  public A withResource(V2ResourceMetricStatus resource) {
    this._visitables.remove("resource");
    if (resource != null) {
        this.resource = new V2ResourceMetricStatusBuilder(resource);
        this._visitables.get("resource").add(this.resource);
    } else {
        this.resource = null;
        this._visitables.get("resource").remove(this.resource);
    }
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public ResourceNested<A> withNewResource() {
    return new ResourceNested(null);
  }
  
  public ResourceNested<A> withNewResourceLike(V2ResourceMetricStatus item) {
    return new ResourceNested(item);
  }
  
  public ResourceNested<A> editResource() {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(null));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(new V2ResourceMetricStatusBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V2ResourceMetricStatus item) {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(item));
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricStatusFluent that = (V2MetricStatusFluent) o;
    if (!java.util.Objects.equals(containerResource, that.containerResource)) return false;
    if (!java.util.Objects.equals(external, that.external)) return false;
    if (!java.util.Objects.equals(_object, that._object)) return false;
    if (!java.util.Objects.equals(pods, that.pods)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
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
  public class ContainerResourceNested<N> extends V2ContainerResourceMetricStatusFluent<ContainerResourceNested<N>> implements Nested<N>{
    ContainerResourceNested(V2ContainerResourceMetricStatus item) {
      this.builder = new V2ContainerResourceMetricStatusBuilder(this, item);
    }
    V2ContainerResourceMetricStatusBuilder builder;
    
    public N and() {
      return (N) V2MetricStatusFluent.this.withContainerResource(builder.build());
    }
    
    public N endContainerResource() {
      return and();
    }
    
  
  }
  public class ExternalNested<N> extends V2ExternalMetricStatusFluent<ExternalNested<N>> implements Nested<N>{
    ExternalNested(V2ExternalMetricStatus item) {
      this.builder = new V2ExternalMetricStatusBuilder(this, item);
    }
    V2ExternalMetricStatusBuilder builder;
    
    public N and() {
      return (N) V2MetricStatusFluent.this.withExternal(builder.build());
    }
    
    public N endExternal() {
      return and();
    }
    
  
  }
  public class ObjectNested<N> extends V2ObjectMetricStatusFluent<ObjectNested<N>> implements Nested<N>{
    ObjectNested(V2ObjectMetricStatus item) {
      this.builder = new V2ObjectMetricStatusBuilder(this, item);
    }
    V2ObjectMetricStatusBuilder builder;
    
    public N and() {
      return (N) V2MetricStatusFluent.this.withObject(builder.build());
    }
    
    public N endObject() {
      return and();
    }
    
  
  }
  public class PodsNested<N> extends V2PodsMetricStatusFluent<PodsNested<N>> implements Nested<N>{
    PodsNested(V2PodsMetricStatus item) {
      this.builder = new V2PodsMetricStatusBuilder(this, item);
    }
    V2PodsMetricStatusBuilder builder;
    
    public N and() {
      return (N) V2MetricStatusFluent.this.withPods(builder.build());
    }
    
    public N endPods() {
      return and();
    }
    
  
  }
  public class ResourceNested<N> extends V2ResourceMetricStatusFluent<ResourceNested<N>> implements Nested<N>{
    ResourceNested(V2ResourceMetricStatus item) {
      this.builder = new V2ResourceMetricStatusBuilder(this, item);
    }
    V2ResourceMetricStatusBuilder builder;
    
    public N and() {
      return (N) V2MetricStatusFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  
  }

}