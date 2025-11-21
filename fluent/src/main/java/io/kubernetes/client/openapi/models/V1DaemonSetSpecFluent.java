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
public class V1DaemonSetSpecFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<A>> extends BaseFluent<A>{

  private Integer minReadySeconds;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private V1PodTemplateSpecBuilder template;
  private V1DaemonSetUpdateStrategyBuilder updateStrategy;

  public V1DaemonSetSpecFluent() {
  }
  
  public V1DaemonSetSpecFluent(V1DaemonSetSpec instance) {
    this.copyInstance(instance);
  }

  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  public V1DaemonSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }
  
  protected void copyInstance(V1DaemonSetSpec instance) {
    instance = instance != null ? instance : new V1DaemonSetSpec();
    if (instance != null) {
        this.withMinReadySeconds(instance.getMinReadySeconds());
        this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        this.withSelector(instance.getSelector());
        this.withTemplate(instance.getTemplate());
        this.withUpdateStrategy(instance.getUpdateStrategy());
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
  
  public UpdateStrategyNested<A> editOrNewUpdateStrategy() {
    return this.withNewUpdateStrategyLike(Optional.ofNullable(this.buildUpdateStrategy()).orElse(new V1DaemonSetUpdateStrategyBuilder().build()));
  }
  
  public UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item) {
    return this.withNewUpdateStrategyLike(Optional.ofNullable(this.buildUpdateStrategy()).orElse(item));
  }
  
  public SelectorNested<A> editSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(null));
  }
  
  public TemplateNested<A> editTemplate() {
    return this.withNewTemplateLike(Optional.ofNullable(this.buildTemplate()).orElse(null));
  }
  
  public UpdateStrategyNested<A> editUpdateStrategy() {
    return this.withNewUpdateStrategyLike(Optional.ofNullable(this.buildUpdateStrategy()).orElse(null));
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
    V1DaemonSetSpecFluent that = (V1DaemonSetSpecFluent) o;
    if (!(Objects.equals(minReadySeconds, that.minReadySeconds))) {
      return false;
    }
    if (!(Objects.equals(revisionHistoryLimit, that.revisionHistoryLimit))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    if (!(Objects.equals(template, that.template))) {
      return false;
    }
    if (!(Objects.equals(updateStrategy, that.updateStrategy))) {
      return false;
    }
    return true;
  }
  
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  
  public Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }
  
  public int hashCode() {
    return Objects.hash(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minReadySeconds == null)) {
        sb.append("minReadySeconds:");
        sb.append(minReadySeconds);
        sb.append(",");
    }
    if (!(revisionHistoryLimit == null)) {
        sb.append("revisionHistoryLimit:");
        sb.append(revisionHistoryLimit);
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
        sb.append(",");
    }
    if (!(updateStrategy == null)) {
        sb.append("updateStrategy:");
        sb.append(updateStrategy);
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
  
  public UpdateStrategyNested<A> withNewUpdateStrategy() {
    return new UpdateStrategyNested(null);
  }
  
  public UpdateStrategyNested<A> withNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item) {
    return new UpdateStrategyNested(item);
  }
  
  public A withRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
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
  
  public A withUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this._visitables.remove("updateStrategy");
    if (updateStrategy != null) {
        this.updateStrategy = new V1DaemonSetUpdateStrategyBuilder(updateStrategy);
        this._visitables.get("updateStrategy").add(this.updateStrategy);
    } else {
        this.updateStrategy = null;
        this._visitables.get("updateStrategy").remove(this.updateStrategy);
    }
    return (A) this;
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DaemonSetSpecFluent.this.withSelector(builder.build());
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
      return (N) V1DaemonSetSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  }
  public class UpdateStrategyNested<N> extends V1DaemonSetUpdateStrategyFluent<UpdateStrategyNested<N>> implements Nested<N>{
  
    V1DaemonSetUpdateStrategyBuilder builder;
  
    UpdateStrategyNested(V1DaemonSetUpdateStrategy item) {
      this.builder = new V1DaemonSetUpdateStrategyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DaemonSetSpecFluent.this.withUpdateStrategy(builder.build());
    }
    
    public N endUpdateStrategy() {
      return and();
    }
    
  }
}