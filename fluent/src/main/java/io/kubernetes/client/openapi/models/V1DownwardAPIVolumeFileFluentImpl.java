package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1DownwardAPIVolumeFileFluentImpl<A extends V1DownwardAPIVolumeFileFluent<A>> extends BaseFluent<A> implements V1DownwardAPIVolumeFileFluent<A>{
  public V1DownwardAPIVolumeFileFluentImpl() {
  }
  public V1DownwardAPIVolumeFileFluentImpl(V1DownwardAPIVolumeFile instance) {
    this.withFieldRef(instance.getFieldRef());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

    this.withResourceFieldRef(instance.getResourceFieldRef());

  }
  private V1ObjectFieldSelectorBuilder fieldRef;
  private Integer mode;
  private String path;
  private V1ResourceFieldSelectorBuilder resourceFieldRef;
  
  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef() {
    return this.fieldRef!=null ?this.fieldRef.build():null;
  }
  public V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef!=null ?this.fieldRef.build():null;
  }
  public A withFieldRef(V1ObjectFieldSelector fieldRef) {
    _visitables.get("fieldRef").remove(this.fieldRef);
    if (fieldRef!=null){ this.fieldRef= new V1ObjectFieldSelectorBuilder(fieldRef); _visitables.get("fieldRef").add(this.fieldRef);} else { this.fieldRef = null; _visitables.get("fieldRef").remove(this.fieldRef); } return (A) this;
  }
  public Boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef() {
    return new V1DownwardAPIVolumeFileFluentImpl.FieldRefNestedImpl();
  }
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item) {
    return new V1DownwardAPIVolumeFileFluentImpl.FieldRefNestedImpl(item);
  }
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef() {
    return withNewFieldRefLike(getFieldRef());
  }
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): new V1ObjectFieldSelectorBuilder().build());
  }
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item) {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): item);
  }
  public Integer getMode() {
    return this.mode;
  }
  public A withMode(Integer mode) {
    this.mode=mode; return (A) this;
  }
  public Boolean hasMode() {
    return this.mode != null;
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  
  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceFieldSelector getResourceFieldRef() {
    return this.resourceFieldRef!=null ?this.resourceFieldRef.build():null;
  }
  public V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef!=null ?this.resourceFieldRef.build():null;
  }
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    _visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    if (resourceFieldRef!=null){ this.resourceFieldRef= new V1ResourceFieldSelectorBuilder(resourceFieldRef); _visitables.get("resourceFieldRef").add(this.resourceFieldRef);} else { this.resourceFieldRef = null; _visitables.get("resourceFieldRef").remove(this.resourceFieldRef); } return (A) this;
  }
  public Boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new V1DownwardAPIVolumeFileFluentImpl.ResourceFieldRefNestedImpl();
  }
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return new V1DownwardAPIVolumeFileFluentImpl.ResourceFieldRefNestedImpl(item);
  }
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef());
  }
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): new V1ResourceFieldSelectorBuilder().build());
  }
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DownwardAPIVolumeFileFluentImpl that = (V1DownwardAPIVolumeFileFluentImpl) o;
    if (fieldRef != null ? !fieldRef.equals(that.fieldRef) :that.fieldRef != null) return false;
    if (mode != null ? !mode.equals(that.mode) :that.mode != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (resourceFieldRef != null ? !resourceFieldRef.equals(that.resourceFieldRef) :that.resourceFieldRef != null) return false;
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
  class FieldRefNestedImpl<N> extends V1ObjectFieldSelectorFluentImpl<V1DownwardAPIVolumeFileFluent.FieldRefNested<N>> implements V1DownwardAPIVolumeFileFluent.FieldRefNested<N>,Nested<N>{
    FieldRefNestedImpl(V1ObjectFieldSelector item) {
      this.builder = new V1ObjectFieldSelectorBuilder(this, item);
    }
    FieldRefNestedImpl() {
      this.builder = new V1ObjectFieldSelectorBuilder(this);
    }
    V1ObjectFieldSelectorBuilder builder;
    public N and() {
      return (N) V1DownwardAPIVolumeFileFluentImpl.this.withFieldRef(builder.build());
    }
    public N endFieldRef() {
      return and();
    }
    
  }
  class ResourceFieldRefNestedImpl<N> extends V1ResourceFieldSelectorFluentImpl<V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>> implements V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>,Nested<N>{
    ResourceFieldRefNestedImpl(V1ResourceFieldSelector item) {
      this.builder = new V1ResourceFieldSelectorBuilder(this, item);
    }
    ResourceFieldRefNestedImpl() {
      this.builder = new V1ResourceFieldSelectorBuilder(this);
    }
    V1ResourceFieldSelectorBuilder builder;
    public N and() {
      return (N) V1DownwardAPIVolumeFileFluentImpl.this.withResourceFieldRef(builder.build());
    }
    public N endResourceFieldRef() {
      return and();
    }
    
  }
  
}