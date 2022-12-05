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
  public class V2beta2MetricIdentifierFluentImpl<A extends V2beta2MetricIdentifierFluent<A>> extends BaseFluent<A> implements V2beta2MetricIdentifierFluent<A>{
  public V2beta2MetricIdentifierFluentImpl() {
  }
  public V2beta2MetricIdentifierFluentImpl(V2beta2MetricIdentifier instance) {
    this.withName(instance.getName());

    this.withSelector(instance.getSelector());

  }
  private String name;
  private V1LabelSelectorBuilder selector;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} else { this.selector = null; _visitables.get("selector").remove(this.selector); } return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  public V2beta2MetricIdentifierFluent.SelectorNested<A> withNewSelector() {
    return new V2beta2MetricIdentifierFluentImpl.SelectorNestedImpl();
  }
  public V2beta2MetricIdentifierFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V2beta2MetricIdentifierFluentImpl.SelectorNestedImpl(item);
  }
  public V2beta2MetricIdentifierFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V2beta2MetricIdentifierFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V2beta2MetricIdentifierFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2MetricIdentifierFluentImpl that = (V2beta2MetricIdentifierFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  selector,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector); }
    sb.append("}");
    return sb.toString();
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V2beta2MetricIdentifierFluent.SelectorNested<N>> implements V2beta2MetricIdentifierFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V2beta2MetricIdentifierFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}