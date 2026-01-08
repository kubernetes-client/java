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
public class V1alpha1ParamRefFluent<A extends io.kubernetes.client.openapi.models.V1alpha1ParamRefFluent<A>> extends BaseFluent<A>{

  private String name;
  private String namespace;
  private String parameterNotFoundAction;
  private V1LabelSelectorBuilder selector;

  public V1alpha1ParamRefFluent() {
  }
  
  public V1alpha1ParamRefFluent(V1alpha1ParamRef instance) {
    this.copyInstance(instance);
  }

  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  protected void copyInstance(V1alpha1ParamRef instance) {
    instance = instance != null ? instance : new V1alpha1ParamRef();
    if (instance != null) {
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
        this.withParameterNotFoundAction(instance.getParameterNotFoundAction());
        this.withSelector(instance.getSelector());
    }
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(item));
  }
  
  public SelectorNested<A> editSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(null));
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
    V1alpha1ParamRefFluent that = (V1alpha1ParamRefFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(parameterNotFoundAction, that.parameterNotFoundAction))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public String getParameterNotFoundAction() {
    return this.parameterNotFoundAction;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean hasParameterNotFoundAction() {
    return this.parameterNotFoundAction != null;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, namespace, parameterNotFoundAction, selector);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
        sb.append(",");
    }
    if (!(parameterNotFoundAction == null)) {
        sb.append("parameterNotFoundAction:");
        sb.append(parameterNotFoundAction);
        sb.append(",");
    }
    if (!(selector == null)) {
        sb.append("selector:");
        sb.append(selector);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new SelectorNested(item);
  }
  
  public A withParameterNotFoundAction(String parameterNotFoundAction) {
    this.parameterNotFoundAction = parameterNotFoundAction;
    return (A) this;
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
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1ParamRefFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  }
}