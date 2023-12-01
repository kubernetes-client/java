package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DownwardAPIVolumeFileFluent<A extends V1DownwardAPIVolumeFileFluent<A>> extends BaseFluent<A>{
  public V1DownwardAPIVolumeFileFluent() {
  }
  
  public V1DownwardAPIVolumeFileFluent(V1DownwardAPIVolumeFile instance) {
    this.copyInstance(instance);
  }
  private V1ObjectFieldSelectorBuilder fieldRef;
  private Integer mode;
  private String path;
  private V1ResourceFieldSelectorBuilder resourceFieldRef;
  
  protected void copyInstance(V1DownwardAPIVolumeFile instance) {
    instance = (instance != null ? instance : new V1DownwardAPIVolumeFile());
    if (instance != null) {
          this.withFieldRef(instance.getFieldRef());
          this.withMode(instance.getMode());
          this.withPath(instance.getPath());
          this.withResourceFieldRef(instance.getResourceFieldRef());
        }
  }
  
  public V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }
  
  public A withFieldRef(V1ObjectFieldSelector fieldRef) {
    this._visitables.remove("fieldRef");
    if (fieldRef != null) {
        this.fieldRef = new V1ObjectFieldSelectorBuilder(fieldRef);
        this._visitables.get("fieldRef").add(this.fieldRef);
    } else {
        this.fieldRef = null;
        this._visitables.get("fieldRef").remove(this.fieldRef);
    }
    return (A) this;
  }
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public FieldRefNested<A> withNewFieldRef() {
    return new FieldRefNested(null);
  }
  
  public FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item) {
    return new FieldRefNested(item);
  }
  
  public FieldRefNested<A> editFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(null));
  }
  
  public FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(new V1ObjectFieldSelectorBuilder().build()));
  }
  
  public FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item) {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(item));
  }
  
  public Integer getMode() {
    return this.mode;
  }
  
  public A withMode(Integer mode) {
    this.mode = mode;
    return (A) this;
  }
  
  public boolean hasMode() {
    return this.mode != null;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }
  
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this._visitables.remove("resourceFieldRef");
    if (resourceFieldRef != null) {
        this.resourceFieldRef = new V1ResourceFieldSelectorBuilder(resourceFieldRef);
        this._visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    } else {
        this.resourceFieldRef = null;
        this._visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    }
    return (A) this;
  }
  
  public boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new ResourceFieldRefNested(null);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return new ResourceFieldRefNested(item);
  }
  
  public ResourceFieldRefNested<A> editResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(null));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(new V1ResourceFieldSelectorBuilder().build()));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DownwardAPIVolumeFileFluent that = (V1DownwardAPIVolumeFileFluent) o;
    if (!java.util.Objects.equals(fieldRef, that.fieldRef)) return false;
    if (!java.util.Objects.equals(mode, that.mode)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(resourceFieldRef, that.resourceFieldRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fieldRef,  mode,  path,  resourceFieldRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fieldRef != null) { sb.append("fieldRef:"); sb.append(fieldRef + ","); }
    if (mode != null) { sb.append("mode:"); sb.append(mode + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (resourceFieldRef != null) { sb.append("resourceFieldRef:"); sb.append(resourceFieldRef); }
    sb.append("}");
    return sb.toString();
  }
  public class FieldRefNested<N> extends V1ObjectFieldSelectorFluent<FieldRefNested<N>> implements Nested<N>{
    FieldRefNested(V1ObjectFieldSelector item) {
      this.builder = new V1ObjectFieldSelectorBuilder(this, item);
    }
    V1ObjectFieldSelectorBuilder builder;
    
    public N and() {
      return (N) V1DownwardAPIVolumeFileFluent.this.withFieldRef(builder.build());
    }
    
    public N endFieldRef() {
      return and();
    }
    
  
  }
  public class ResourceFieldRefNested<N> extends V1ResourceFieldSelectorFluent<ResourceFieldRefNested<N>> implements Nested<N>{
    ResourceFieldRefNested(V1ResourceFieldSelector item) {
      this.builder = new V1ResourceFieldSelectorBuilder(this, item);
    }
    V1ResourceFieldSelectorBuilder builder;
    
    public N and() {
      return (N) V1DownwardAPIVolumeFileFluent.this.withResourceFieldRef(builder.build());
    }
    
    public N endResourceFieldRef() {
      return and();
    }
    
  
  }

}