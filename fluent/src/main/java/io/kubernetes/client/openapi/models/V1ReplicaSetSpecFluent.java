package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
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
public class V1ReplicaSetSpecFluent<A extends io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<A>> extends BaseFluent<A>{

  private Integer minReadySeconds;
  private Integer replicas;
  private V1LabelSelectorBuilder selector;
  private V1PodTemplateSpecBuilder template;

  public V1ReplicaSetSpecFluent() {
  }
  
  public V1ReplicaSetSpecFluent(V1ReplicaSetSpec instance) {
    this.copyInstance(instance);
  }

  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  protected void copyInstance(V1ReplicaSetSpec instance) {
    instance = instance != null ? instance : new V1ReplicaSetSpec();
    if (instance != null) {
        this.withMinReadySeconds(instance.getMinReadySeconds());
        this.withReplicas(instance.getReplicas());
        this.withSelector(instance.getSelector());
        this.withTemplate(instance.getTemplate());
    }
  }
  
  public SelectorNested<A> editOrNewSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(item));
  }
  
  public TemplateNested<A> editOrNewTemplate() {
    return this.withNewTemplateLike(Optional.ofNullable(this.buildTemplate()).orElse(new V1PodTemplateSpecBuilder().build()));
  }
  
  public TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return this.withNewTemplateLike(Optional.ofNullable(this.buildTemplate()).orElse(item));
  }
  
  public SelectorNested<A> editSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(null));
  }
  
  public TemplateNested<A> editTemplate() {
    return this.withNewTemplateLike(Optional.ofNullable(this.buildTemplate()).orElse(null));
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
    V1ReplicaSetSpecFluent that = (V1ReplicaSetSpecFluent) o;
    if (!(Objects.equals(minReadySeconds, that.minReadySeconds))) {
      return false;
    }
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    if (!(Objects.equals(template, that.template))) {
      return false;
    }
    return true;
  }
  
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public int hashCode() {
    return Objects.hash(minReadySeconds, replicas, selector, template);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minReadySeconds == null)) {
        sb.append("minReadySeconds:");
        sb.append(minReadySeconds);
        sb.append(",");
    }
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
        sb.append(",");
    }
    if (!(selector == null)) {
        sb.append("selector:");
        sb.append(selector);
        sb.append(",");
    }
    if (!(template == null)) {
        sb.append("template:");
        sb.append(template);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return (A) this;
  }
  
  public SelectorNested<A> withNewSelector() {
    return new SelectorNested(null);
  }
  
  public SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new SelectorNested(item);
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new TemplateNested(item);
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
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
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ReplicaSetSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
  
    V1PodTemplateSpecBuilder builder;
  
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ReplicaSetSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  }
}