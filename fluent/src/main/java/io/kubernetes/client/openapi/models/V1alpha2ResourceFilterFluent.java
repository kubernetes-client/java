package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceFilterFluent<A extends V1alpha2ResourceFilterFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceFilterFluent() {
  }
  
  public V1alpha2ResourceFilterFluent(V1alpha2ResourceFilter instance) {
    this.copyInstance(instance);
  }
  private String driverName;
  private V1alpha2NamedResourcesFilterBuilder namedResources;
  
  protected void copyInstance(V1alpha2ResourceFilter instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceFilter());
    if (instance != null) {
          this.withDriverName(instance.getDriverName());
          this.withNamedResources(instance.getNamedResources());
        }
  }
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
  }
  
  public V1alpha2NamedResourcesFilter buildNamedResources() {
    return this.namedResources != null ? this.namedResources.build() : null;
  }
  
  public A withNamedResources(V1alpha2NamedResourcesFilter namedResources) {
    this._visitables.remove("namedResources");
    if (namedResources != null) {
        this.namedResources = new V1alpha2NamedResourcesFilterBuilder(namedResources);
        this._visitables.get("namedResources").add(this.namedResources);
    } else {
        this.namedResources = null;
        this._visitables.get("namedResources").remove(this.namedResources);
    }
    return (A) this;
  }
  
  public boolean hasNamedResources() {
    return this.namedResources != null;
  }
  
  public NamedResourcesNested<A> withNewNamedResources() {
    return new NamedResourcesNested(null);
  }
  
  public NamedResourcesNested<A> withNewNamedResourcesLike(V1alpha2NamedResourcesFilter item) {
    return new NamedResourcesNested(item);
  }
  
  public NamedResourcesNested<A> editNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(null));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(new V1alpha2NamedResourcesFilterBuilder().build()));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResourcesLike(V1alpha2NamedResourcesFilter item) {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceFilterFluent that = (V1alpha2ResourceFilterFluent) o;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(namedResources, that.namedResources)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driverName,  namedResources,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (namedResources != null) { sb.append("namedResources:"); sb.append(namedResources); }
    sb.append("}");
    return sb.toString();
  }
  public class NamedResourcesNested<N> extends V1alpha2NamedResourcesFilterFluent<NamedResourcesNested<N>> implements Nested<N>{
    NamedResourcesNested(V1alpha2NamedResourcesFilter item) {
      this.builder = new V1alpha2NamedResourcesFilterBuilder(this, item);
    }
    V1alpha2NamedResourcesFilterBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceFilterFluent.this.withNamedResources(builder.build());
    }
    
    public N endNamedResources() {
      return and();
    }
    
  
  }

}