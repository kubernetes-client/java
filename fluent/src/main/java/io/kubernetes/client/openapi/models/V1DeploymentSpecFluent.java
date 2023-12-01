package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeploymentSpecFluent<A extends V1DeploymentSpecFluent<A>> extends BaseFluent<A>{
  public V1DeploymentSpecFluent() {
  }
  
  public V1DeploymentSpecFluent(V1DeploymentSpec instance) {
    this.copyInstance(instance);
  }
  private Integer minReadySeconds;
  private Boolean paused;
  private Integer progressDeadlineSeconds;
  private Integer replicas;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private V1DeploymentStrategyBuilder strategy;
  private V1PodTemplateSpecBuilder template;
  
  protected void copyInstance(V1DeploymentSpec instance) {
    instance = (instance != null ? instance : new V1DeploymentSpec());
    if (instance != null) {
          this.withMinReadySeconds(instance.getMinReadySeconds());
          this.withPaused(instance.getPaused());
          this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());
          this.withReplicas(instance.getReplicas());
          this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
          this.withSelector(instance.getSelector());
          this.withStrategy(instance.getStrategy());
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
  
  public Boolean getPaused() {
    return this.paused;
  }
  
  public A withPaused(Boolean paused) {
    this.paused = paused;
    return (A) this;
  }
  
  public boolean hasPaused() {
    return this.paused != null;
  }
  
  public Integer getProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds;
  }
  
  public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds != null;
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
  
  public Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }
  
  public A withRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return (A) this;
  }
  
  public boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
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
  
  public V1DeploymentStrategy buildStrategy() {
    return this.strategy != null ? this.strategy.build() : null;
  }
  
  public A withStrategy(V1DeploymentStrategy strategy) {
    this._visitables.remove("strategy");
    if (strategy != null) {
        this.strategy = new V1DeploymentStrategyBuilder(strategy);
        this._visitables.get("strategy").add(this.strategy);
    } else {
        this.strategy = null;
        this._visitables.get("strategy").remove(this.strategy);
    }
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public StrategyNested<A> withNewStrategy() {
    return new StrategyNested(null);
  }
  
  public StrategyNested<A> withNewStrategyLike(V1DeploymentStrategy item) {
    return new StrategyNested(item);
  }
  
  public StrategyNested<A> editStrategy() {
    return withNewStrategyLike(java.util.Optional.ofNullable(buildStrategy()).orElse(null));
  }
  
  public StrategyNested<A> editOrNewStrategy() {
    return withNewStrategyLike(java.util.Optional.ofNullable(buildStrategy()).orElse(new V1DeploymentStrategyBuilder().build()));
  }
  
  public StrategyNested<A> editOrNewStrategyLike(V1DeploymentStrategy item) {
    return withNewStrategyLike(java.util.Optional.ofNullable(buildStrategy()).orElse(item));
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
    V1DeploymentSpecFluent that = (V1DeploymentSpecFluent) o;
    if (!java.util.Objects.equals(minReadySeconds, that.minReadySeconds)) return false;
    if (!java.util.Objects.equals(paused, that.paused)) return false;
    if (!java.util.Objects.equals(progressDeadlineSeconds, that.progressDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(revisionHistoryLimit, that.revisionHistoryLimit)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  paused,  progressDeadlineSeconds,  replicas,  revisionHistoryLimit,  selector,  strategy,  template,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (paused != null) { sb.append("paused:"); sb.append(paused + ","); }
    if (progressDeadlineSeconds != null) { sb.append("progressDeadlineSeconds:"); sb.append(progressDeadlineSeconds + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (revisionHistoryLimit != null) { sb.append("revisionHistoryLimit:"); sb.append(revisionHistoryLimit + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy + ","); }
    if (template != null) { sb.append("template:"); sb.append(template); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPaused() {
    return withPaused(true);
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1DeploymentSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class StrategyNested<N> extends V1DeploymentStrategyFluent<StrategyNested<N>> implements Nested<N>{
    StrategyNested(V1DeploymentStrategy item) {
      this.builder = new V1DeploymentStrategyBuilder(this, item);
    }
    V1DeploymentStrategyBuilder builder;
    
    public N and() {
      return (N) V1DeploymentSpecFluent.this.withStrategy(builder.build());
    }
    
    public N endStrategy() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    V1PodTemplateSpecBuilder builder;
    
    public N and() {
      return (N) V1DeploymentSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }

}