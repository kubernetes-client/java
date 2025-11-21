package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2MetricSpecFluent<A extends io.kubernetes.client.openapi.models.V2MetricSpecFluent<A>> extends BaseFluent<A>{

  private V2ObjectMetricSourceBuilder _object;
  private V2ContainerResourceMetricSourceBuilder containerResource;
  private V2ExternalMetricSourceBuilder external;
  private V2PodsMetricSourceBuilder pods;
  private V2ResourceMetricSourceBuilder resource;
  private String type;

  public V2MetricSpecFluent() {
  }
  
  public V2MetricSpecFluent(V2MetricSpec instance) {
    this.copyInstance(instance);
  }

  public V2ContainerResourceMetricSource buildContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }
  
  public V2ExternalMetricSource buildExternal() {
    return this.external != null ? this.external.build() : null;
  }
  
  public V2ObjectMetricSource buildObject() {
    return this._object != null ? this._object.build() : null;
  }
  
  public V2PodsMetricSource buildPods() {
    return this.pods != null ? this.pods.build() : null;
  }
  
  public V2ResourceMetricSource buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  protected void copyInstance(V2MetricSpec instance) {
    instance = instance != null ? instance : new V2MetricSpec();
    if (instance != null) {
        this.withContainerResource(instance.getContainerResource());
        this.withExternal(instance.getExternal());
        this.withObject(instance.getObject());
        this.withPods(instance.getPods());
        this.withResource(instance.getResource());
        this.withType(instance.getType());
    }
  }
  
  public ContainerResourceNested<A> editContainerResource() {
    return this.withNewContainerResourceLike(Optional.ofNullable(this.buildContainerResource()).orElse(null));
  }
  
  public ExternalNested<A> editExternal() {
    return this.withNewExternalLike(Optional.ofNullable(this.buildExternal()).orElse(null));
  }
  
  public ObjectNested<A> editObject() {
    return this.withNewObjectLike(Optional.ofNullable(this.buildObject()).orElse(null));
  }
  
  public ContainerResourceNested<A> editOrNewContainerResource() {
    return this.withNewContainerResourceLike(Optional.ofNullable(this.buildContainerResource()).orElse(new V2ContainerResourceMetricSourceBuilder().build()));
  }
  
  public ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricSource item) {
    return this.withNewContainerResourceLike(Optional.ofNullable(this.buildContainerResource()).orElse(item));
  }
  
  public ExternalNested<A> editOrNewExternal() {
    return this.withNewExternalLike(Optional.ofNullable(this.buildExternal()).orElse(new V2ExternalMetricSourceBuilder().build()));
  }
  
  public ExternalNested<A> editOrNewExternalLike(V2ExternalMetricSource item) {
    return this.withNewExternalLike(Optional.ofNullable(this.buildExternal()).orElse(item));
  }
  
  public ObjectNested<A> editOrNewObject() {
    return this.withNewObjectLike(Optional.ofNullable(this.buildObject()).orElse(new V2ObjectMetricSourceBuilder().build()));
  }
  
  public ObjectNested<A> editOrNewObjectLike(V2ObjectMetricSource item) {
    return this.withNewObjectLike(Optional.ofNullable(this.buildObject()).orElse(item));
  }
  
  public PodsNested<A> editOrNewPods() {
    return this.withNewPodsLike(Optional.ofNullable(this.buildPods()).orElse(new V2PodsMetricSourceBuilder().build()));
  }
  
  public PodsNested<A> editOrNewPodsLike(V2PodsMetricSource item) {
    return this.withNewPodsLike(Optional.ofNullable(this.buildPods()).orElse(item));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(new V2ResourceMetricSourceBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V2ResourceMetricSource item) {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(item));
  }
  
  public PodsNested<A> editPods() {
    return this.withNewPodsLike(Optional.ofNullable(this.buildPods()).orElse(null));
  }
  
  public ResourceNested<A> editResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(null));
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
    V2MetricSpecFluent that = (V2MetricSpecFluent) o;
    if (!(Objects.equals(containerResource, that.containerResource))) {
      return false;
    }
    if (!(Objects.equals(external, that.external))) {
      return false;
    }
    if (!(Objects.equals(_object, that._object))) {
      return false;
    }
    if (!(Objects.equals(pods, that.pods))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasContainerResource() {
    return this.containerResource != null;
  }
  
  public boolean hasExternal() {
    return this.external != null;
  }
  
  public boolean hasObject() {
    return this._object != null;
  }
  
  public boolean hasPods() {
    return this.pods != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(containerResource, external, _object, pods, resource, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerResource == null)) {
        sb.append("containerResource:");
        sb.append(containerResource);
        sb.append(",");
    }
    if (!(external == null)) {
        sb.append("external:");
        sb.append(external);
        sb.append(",");
    }
    if (!(_object == null)) {
        sb.append("_object:");
        sb.append(_object);
        sb.append(",");
    }
    if (!(pods == null)) {
        sb.append("pods:");
        sb.append(pods);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerResource(V2ContainerResourceMetricSource containerResource) {
    this._visitables.remove("containerResource");
    if (containerResource != null) {
        this.containerResource = new V2ContainerResourceMetricSourceBuilder(containerResource);
        this._visitables.get("containerResource").add(this.containerResource);
    } else {
        this.containerResource = null;
        this._visitables.get("containerResource").remove(this.containerResource);
    }
    return (A) this;
  }
  
  public A withExternal(V2ExternalMetricSource external) {
    this._visitables.remove("external");
    if (external != null) {
        this.external = new V2ExternalMetricSourceBuilder(external);
        this._visitables.get("external").add(this.external);
    } else {
        this.external = null;
        this._visitables.get("external").remove(this.external);
    }
    return (A) this;
  }
  
  public ContainerResourceNested<A> withNewContainerResource() {
    return new ContainerResourceNested(null);
  }
  
  public ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricSource item) {
    return new ContainerResourceNested(item);
  }
  
  public ExternalNested<A> withNewExternal() {
    return new ExternalNested(null);
  }
  
  public ExternalNested<A> withNewExternalLike(V2ExternalMetricSource item) {
    return new ExternalNested(item);
  }
  
  public ObjectNested<A> withNewObject() {
    return new ObjectNested(null);
  }
  
  public ObjectNested<A> withNewObjectLike(V2ObjectMetricSource item) {
    return new ObjectNested(item);
  }
  
  public PodsNested<A> withNewPods() {
    return new PodsNested(null);
  }
  
  public PodsNested<A> withNewPodsLike(V2PodsMetricSource item) {
    return new PodsNested(item);
  }
  
  public ResourceNested<A> withNewResource() {
    return new ResourceNested(null);
  }
  
  public ResourceNested<A> withNewResourceLike(V2ResourceMetricSource item) {
    return new ResourceNested(item);
  }
  
  public A withObject(V2ObjectMetricSource _object) {
    this._visitables.remove("_object");
    if (_object != null) {
        this._object = new V2ObjectMetricSourceBuilder(_object);
        this._visitables.get("_object").add(this._object);
    } else {
        this._object = null;
        this._visitables.get("_object").remove(this._object);
    }
    return (A) this;
  }
  
  public A withPods(V2PodsMetricSource pods) {
    this._visitables.remove("pods");
    if (pods != null) {
        this.pods = new V2PodsMetricSourceBuilder(pods);
        this._visitables.get("pods").add(this.pods);
    } else {
        this.pods = null;
        this._visitables.get("pods").remove(this.pods);
    }
    return (A) this;
  }
  
  public A withResource(V2ResourceMetricSource resource) {
    this._visitables.remove("resource");
    if (resource != null) {
        this.resource = new V2ResourceMetricSourceBuilder(resource);
        this._visitables.get("resource").add(this.resource);
    } else {
        this.resource = null;
        this._visitables.get("resource").remove(this.resource);
    }
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class ContainerResourceNested<N> extends V2ContainerResourceMetricSourceFluent<ContainerResourceNested<N>> implements Nested<N>{
  
    V2ContainerResourceMetricSourceBuilder builder;
  
    ContainerResourceNested(V2ContainerResourceMetricSource item) {
      this.builder = new V2ContainerResourceMetricSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricSpecFluent.this.withContainerResource(builder.build());
    }
    
    public N endContainerResource() {
      return and();
    }
    
  }
  public class ExternalNested<N> extends V2ExternalMetricSourceFluent<ExternalNested<N>> implements Nested<N>{
  
    V2ExternalMetricSourceBuilder builder;
  
    ExternalNested(V2ExternalMetricSource item) {
      this.builder = new V2ExternalMetricSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricSpecFluent.this.withExternal(builder.build());
    }
    
    public N endExternal() {
      return and();
    }
    
  }
  public class ObjectNested<N> extends V2ObjectMetricSourceFluent<ObjectNested<N>> implements Nested<N>{
  
    V2ObjectMetricSourceBuilder builder;
  
    ObjectNested(V2ObjectMetricSource item) {
      this.builder = new V2ObjectMetricSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricSpecFluent.this.withObject(builder.build());
    }
    
    public N endObject() {
      return and();
    }
    
  }
  public class PodsNested<N> extends V2PodsMetricSourceFluent<PodsNested<N>> implements Nested<N>{
  
    V2PodsMetricSourceBuilder builder;
  
    PodsNested(V2PodsMetricSource item) {
      this.builder = new V2PodsMetricSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricSpecFluent.this.withPods(builder.build());
    }
    
    public N endPods() {
      return and();
    }
    
  }
  public class ResourceNested<N> extends V2ResourceMetricSourceFluent<ResourceNested<N>> implements Nested<N>{
  
    V2ResourceMetricSourceBuilder builder;
  
    ResourceNested(V2ResourceMetricSource item) {
      this.builder = new V2ResourceMetricSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricSpecFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  }
}