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
public class V2MetricIdentifierFluent<A extends V2MetricIdentifierFluent<A>> extends BaseFluent<A>{
  public V2MetricIdentifierFluent() {
  }
  
  public V2MetricIdentifierFluent(V2MetricIdentifier instance) {
    this.copyInstance(instance);
  }
  private String name;
  private V1LabelSelectorBuilder selector;
  
  protected void copyInstance(V2MetricIdentifier instance) {
    instance = (instance != null ? instance : new V2MetricIdentifier());
    if (instance != null) {
          this.withName(instance.getName());
          this.withSelector(instance.getSelector());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public A withSelector(V1LabelSelector selector) {
    this._visitables.remove("selector");
    if (selector != null) {
        this.selector = new V1LabelSelectorBuilder(selector);
        this._visitables.get("selector").add(this.selector);
    } else {
        this.selector = null;
        this._visitables.get("selector").remove(this.selector);
    }
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new SelectorNested(item);
  }
  
  public SelectorNested<A> editSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(null));
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(java.util.Optional.ofNullable(buildSelector()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricIdentifierFluent that = (V2MetricIdentifierFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
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
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V2MetricIdentifierFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}