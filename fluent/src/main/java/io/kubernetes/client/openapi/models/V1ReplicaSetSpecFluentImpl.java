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
  public class V1ReplicaSetSpecFluentImpl<A extends V1ReplicaSetSpecFluent<A>> extends BaseFluent<A> implements V1ReplicaSetSpecFluent<A>{
  public V1ReplicaSetSpecFluentImpl() {
  }
  public V1ReplicaSetSpecFluentImpl(V1ReplicaSetSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

  }
  private Integer minReadySeconds;
  private Integer replicas;
  private V1LabelSelectorBuilder selector;
  private V1PodTemplateSpecBuilder template;
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds=minReadySeconds; return (A) this;
  }
  public Boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  public Integer getReplicas() {
    return this.replicas;
  }
  public A withReplicas(Integer replicas) {
    this.replicas=replicas; return (A) this;
  }
  public Boolean hasReplicas() {
    return this.replicas != null;
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
  public V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1ReplicaSetSpecFluentImpl.SelectorNestedImpl();
  }
  public V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1ReplicaSetSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1ReplicaSetSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public V1PodTemplateSpec buildTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public A withTemplate(V1PodTemplateSpec template) {
    _visitables.get("template").remove(this.template);
    if (template!=null){ this.template= new V1PodTemplateSpecBuilder(template); _visitables.get("template").add(this.template);} else { this.template = null; _visitables.get("template").remove(this.template); } return (A) this;
  }
  public Boolean hasTemplate() {
    return this.template != null;
  }
  public V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1ReplicaSetSpecFluentImpl.TemplateNestedImpl();
  }
  public V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1ReplicaSetSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1ReplicaSetSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ReplicaSetSpecFluentImpl that = (V1ReplicaSetSpecFluentImpl) o;
    if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
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
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1ReplicaSetSpecFluent.SelectorNested<N>> implements V1ReplicaSetSpecFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1ReplicaSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1ReplicaSetSpecFluent.TemplateNested<N>> implements V1ReplicaSetSpecFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1ReplicaSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  
}