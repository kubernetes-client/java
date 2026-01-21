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
public class V2MetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2MetricStatusFluent<A>> extends BaseFluent<A>{

  private V2ObjectMetricStatusBuilder _object;
  private V2ContainerResourceMetricStatusBuilder containerResource;
  private V2ExternalMetricStatusBuilder external;
  private V2PodsMetricStatusBuilder pods;
  private V2ResourceMetricStatusBuilder resource;
  private String type;

  public V2MetricStatusFluent() {
  }
  
  public V2MetricStatusFluent(V2MetricStatus instance) {
    this.copyInstance(instance);
  }

  public V2ContainerResourceMetricStatus buildContainerResource() {
    return this.containerResource != null ? this.containerResource.build() : null;
  }
  
  public V2ExternalMetricStatus buildExternal() {
    return this.external != null ? this.external.build() : null;
  }
  
  public V2ObjectMetricStatus buildObject() {
    return this._object != null ? this._object.build() : null;
  }
  
  public V2PodsMetricStatus buildPods() {
    return this.pods != null ? this.pods.build() : null;
  }
  
  public V2ResourceMetricStatus buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  protected void copyInstance(V2MetricStatus instance) {
    instance = instance != null ? instance : new V2MetricStatus();
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
    return this.withNewContainerResourceLike(Optional.ofNullable(this.buildContainerResource()).orElse(new V2ContainerResourceMetricStatusBuilder().build()));
  }
  
  public ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return this.withNewContainerResourceLike(Optional.ofNullable(this.buildContainerResource()).orElse(item));
  }
  
  public ExternalNested<A> editOrNewExternal() {
    return this.withNewExternalLike(Optional.ofNullable(this.buildExternal()).orElse(new V2ExternalMetricStatusBuilder().build()));
  }
  
  public ExternalNested<A> editOrNewExternalLike(V2ExternalMetricStatus item) {
    return this.withNewExternalLike(Optional.ofNullable(this.buildExternal()).orElse(item));
  }
  
  public ObjectNested<A> editOrNewObject() {
    return this.withNewObjectLike(Optional.ofNullable(this.buildObject()).orElse(new V2ObjectMetricStatusBuilder().build()));
  }
  
  public ObjectNested<A> editOrNewObjectLike(V2ObjectMetricStatus item) {
    return this.withNewObjectLike(Optional.ofNullable(this.buildObject()).orElse(item));
  }
  
  public PodsNested<A> editOrNewPods() {
    return this.withNewPodsLike(Optional.ofNullable(this.buildPods()).orElse(new V2PodsMetricStatusBuilder().build()));
  }
  
  public PodsNested<A> editOrNewPodsLike(V2PodsMetricStatus item) {
    return this.withNewPodsLike(Optional.ofNullable(this.buildPods()).orElse(item));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(new V2ResourceMetricStatusBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V2ResourceMetricStatus item) {
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
    V2MetricStatusFluent that = (V2MetricStatusFluent) o;
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
  
  public ContainerResourceNested<A> withNewContainerResource() {
    return new ContainerResourceNested(null);
  }
  
  public ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricStatus item) {
    return new ContainerResourceNested(item);
  }
  
  public ExternalNested<A> withNewExternal() {
    return new ExternalNested(null);
  }
  
  public ExternalNested<A> withNewExternalLike(V2ExternalMetricStatus item) {
    return new ExternalNested(item);
  }
  
  public ObjectNested<A> withNewObject() {
    return new ObjectNested(null);
  }
  
  public ObjectNested<A> withNewObjectLike(V2ObjectMetricStatus item) {
    return new ObjectNested(item);
  }
  
  public PodsNested<A> withNewPods() {
    return new PodsNested(null);
  }
  
  public PodsNested<A> withNewPodsLike(V2PodsMetricStatus item) {
    return new PodsNested(item);
  }
  
  public ResourceNested<A> withNewResource() {
    return new ResourceNested(null);
  }
  
  public ResourceNested<A> withNewResourceLike(V2ResourceMetricStatus item) {
    return new ResourceNested(item);
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
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class ContainerResourceNested<N> extends V2ContainerResourceMetricStatusFluent<ContainerResourceNested<N>> implements Nested<N>{
  
    V2ContainerResourceMetricStatusBuilder builder;
  
    ContainerResourceNested(V2ContainerResourceMetricStatus item) {
      this.builder = new V2ContainerResourceMetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricStatusFluent.this.withContainerResource(builder.build());
    }
    
    public N endContainerResource() {
      return and();
    }
    
  }
  public class ExternalNested<N> extends V2ExternalMetricStatusFluent<ExternalNested<N>> implements Nested<N>{
  
    V2ExternalMetricStatusBuilder builder;
  
    ExternalNested(V2ExternalMetricStatus item) {
      this.builder = new V2ExternalMetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricStatusFluent.this.withExternal(builder.build());
    }
    
    public N endExternal() {
      return and();
    }
    
  }
  public class ObjectNested<N> extends V2ObjectMetricStatusFluent<ObjectNested<N>> implements Nested<N>{
  
    V2ObjectMetricStatusBuilder builder;
  
    ObjectNested(V2ObjectMetricStatus item) {
      this.builder = new V2ObjectMetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricStatusFluent.this.withObject(builder.build());
    }
    
    public N endObject() {
      return and();
    }
    
  }
  public class PodsNested<N> extends V2PodsMetricStatusFluent<PodsNested<N>> implements Nested<N>{
  
    V2PodsMetricStatusBuilder builder;
  
    PodsNested(V2PodsMetricStatus item) {
      this.builder = new V2PodsMetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricStatusFluent.this.withPods(builder.build());
    }
    
    public N endPods() {
      return and();
    }
    
  }
  public class ResourceNested<N> extends V2ResourceMetricStatusFluent<ResourceNested<N>> implements Nested<N>{
  
    V2ResourceMetricStatusBuilder builder;
  
    ResourceNested(V2ResourceMetricStatus item) {
      this.builder = new V2ResourceMetricStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2MetricStatusFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  }
}