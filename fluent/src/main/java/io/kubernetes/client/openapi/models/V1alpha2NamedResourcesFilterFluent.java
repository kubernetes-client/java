package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2NamedResourcesFilterFluent<A extends V1alpha2NamedResourcesFilterFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesFilterFluent() {
  }
  
  public V1alpha2NamedResourcesFilterFluent(V1alpha2NamedResourcesFilter instance) {
    this.copyInstance(instance);
  }
  private String selector;
  
  protected void copyInstance(V1alpha2NamedResourcesFilter instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesFilter());
    if (instance != null) {
          this.withSelector(instance.getSelector());
        }
  }
  
  public String getSelector() {
    return this.selector;
  }
  
  public A withSelector(String selector) {
    this.selector = selector;
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesFilterFluent that = (V1alpha2NamedResourcesFilterFluent) o;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(selector,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (selector != null) { sb.append("selector:"); sb.append(selector); }
    sb.append("}");
    return sb.toString();
  }
  

}