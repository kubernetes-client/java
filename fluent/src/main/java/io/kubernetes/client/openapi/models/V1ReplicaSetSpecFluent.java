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
public class V1ReplicaSetSpecFluent<A extends V1ReplicaSetSpecFluent<A>> extends BaseFluent<A>{
  public V1ReplicaSetSpecFluent() {
  }
  
  public V1ReplicaSetSpecFluent(V1ReplicaSetSpec instance) {
    this.copyInstance(instance);
  }
  private Integer minReadySeconds;
  private Integer replicas;
  private V1LabelSelectorBuilder selector;
  private V1PodTemplateSpecBuilder template;
  
  protected void copyInstance(V1ReplicaSetSpec instance) {
    instance = (instance != null ? instance : new V1ReplicaSetSpec());
    if (instance != null) {
          this.withMinReadySeconds(instance.getMinReadySeconds());
          this.withReplicas(instance.getReplicas());
          this.withSelector(instance.getSelector());
          this.withTemplate(instance.getTemplate());
        }
  }
  
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return (A) this;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
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
  
  public V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public A withTemplate(V1PodTemplateSpec template) {
    this._visitables.remove("template");
    if (template != null) {
        this.template = new V1PodTemplateSpecBuilder(template);
        this._visitables.get("template").add(this.template);
    } else {
        this.template = null;
        this._visitables.get("template").remove(this.template);
    }
    return (A) this;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new TemplateNested(item);
  }
  
  public TemplateNested<A> editTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(null));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(new V1PodTemplateSpecBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(java.util.Optional.ofNullable(buildTemplate()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicaSetSpecFluent that = (V1ReplicaSetSpecFluent) o;
    if (!java.util.Objects.equals(minReadySeconds, that.minReadySeconds)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  replicas,  selector,  template,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (template != null) { sb.append("template:"); sb.append(template); }
    sb.append("}");
    return sb.toString();
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1ReplicaSetSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    V1PodTemplateSpecBuilder builder;
    
    public N and() {
      return (N) V1ReplicaSetSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }

}