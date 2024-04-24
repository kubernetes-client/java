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
public class V1ParamRefFluent<A extends V1ParamRefFluent<A>> extends BaseFluent<A>{
  public V1ParamRefFluent() {
  }
  
  public V1ParamRefFluent(V1ParamRef instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String namespace;
  private String parameterNotFoundAction;
  private V1LabelSelectorBuilder selector;
  
  protected void copyInstance(V1ParamRef instance) {
    instance = (instance != null ? instance : new V1ParamRef());
    if (instance != null) {
          this.withName(instance.getName());
          this.withNamespace(instance.getNamespace());
          this.withParameterNotFoundAction(instance.getParameterNotFoundAction());
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
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public String getParameterNotFoundAction() {
    return this.parameterNotFoundAction;
  }
  
  public A withParameterNotFoundAction(String parameterNotFoundAction) {
    this.parameterNotFoundAction = parameterNotFoundAction;
    return (A) this;
  }
  
  public boolean hasParameterNotFoundAction() {
    return this.parameterNotFoundAction != null;
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
    V1ParamRefFluent that = (V1ParamRefFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
    if (!java.util.Objects.equals(parameterNotFoundAction, that.parameterNotFoundAction)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  namespace,  parameterNotFoundAction,  selector,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (parameterNotFoundAction != null) { sb.append("parameterNotFoundAction:"); sb.append(parameterNotFoundAction + ","); }
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
      return (N) V1ParamRefFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }

}