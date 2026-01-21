package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
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
public class V1DeploymentSpecFluent<A extends io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<A>> extends BaseFluent<A>{

  private Integer minReadySeconds;
  private Boolean paused;
  private Integer progressDeadlineSeconds;
  private Integer replicas;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private V1DeploymentStrategyBuilder strategy;
  private V1PodTemplateSpecBuilder template;

  public V1DeploymentSpecFluent() {
  }
  
  public V1DeploymentSpecFluent(V1DeploymentSpec instance) {
    this.copyInstance(instance);
  }

  public V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }
  
  public V1DeploymentStrategy buildStrategy() {
    return this.strategy != null ? this.strategy.build() : null;
  }
  
  public V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }
  
  protected void copyInstance(V1DeploymentSpec instance) {
    instance = instance != null ? instance : new V1DeploymentSpec();
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
  
  public SelectorNested<A> editOrNewSelector() {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return this.withNewSelectorLike(Optional.ofNullable(this.buildSelector()).orElse(item));
  }
  
  public StrategyNested<A> editOrNewStrategy() {
    return this.withNewStrategyLike(Optional.ofNullable(this.buildStrategy()).orElse(new V1DeploymentStrategyBuilder().build()));
  }
  
  public StrategyNested<A> editOrNewStrategyLike(V1DeploymentStrategy item) {
    return this.withNewStrategyLike(Optional.ofNullable(this.buildStrategy()).orElse(item));
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
  
  public StrategyNested<A> editStrategy() {
    return this.withNewStrategyLike(Optional.ofNullable(this.buildStrategy()).orElse(null));
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
    V1DeploymentSpecFluent that = (V1DeploymentSpecFluent) o;
    if (!(Objects.equals(minReadySeconds, that.minReadySeconds))) {
      return false;
    }
    if (!(Objects.equals(paused, that.paused))) {
      return false;
    }
    if (!(Objects.equals(progressDeadlineSeconds, that.progressDeadlineSeconds))) {
      return false;
    }
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    if (!(Objects.equals(revisionHistoryLimit, that.revisionHistoryLimit))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    if (!(Objects.equals(strategy, that.strategy))) {
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
  
  public Boolean getPaused() {
    return this.paused;
  }
  
  public Integer getProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public boolean hasPaused() {
    return this.paused != null;
  }
  
  public boolean hasProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds != null;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public boolean hasTemplate() {
    return this.template != null;
  }
  
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minReadySeconds == null)) {
        sb.append("minReadySeconds:");
        sb.append(minReadySeconds);
        sb.append(",");
    }
    if (!(paused == null)) {
        sb.append("paused:");
        sb.append(paused);
        sb.append(",");
    }
    if (!(progressDeadlineSeconds == null)) {
        sb.append("progressDeadlineSeconds:");
        sb.append(progressDeadlineSeconds);
        sb.append(",");
    }
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
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
    if (!(strategy == null)) {
        sb.append("strategy:");
        sb.append(strategy);
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
  
  public StrategyNested<A> withNewStrategy() {
    return new StrategyNested(null);
  }
  
  public StrategyNested<A> withNewStrategyLike(V1DeploymentStrategy item) {
    return new StrategyNested(item);
  }
  
  public TemplateNested<A> withNewTemplate() {
    return new TemplateNested(null);
  }
  
  public TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new TemplateNested(item);
  }
  
  public A withPaused() {
    return withPaused(true);
  }
  
  public A withPaused(Boolean paused) {
    this.paused = paused;
    return (A) this;
  }
  
  public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return (A) this;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
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
      return (N) V1DeploymentSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  }
  public class StrategyNested<N> extends V1DeploymentStrategyFluent<StrategyNested<N>> implements Nested<N>{
  
    V1DeploymentStrategyBuilder builder;
  
    StrategyNested(V1DeploymentStrategy item) {
      this.builder = new V1DeploymentStrategyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeploymentSpecFluent.this.withStrategy(builder.build());
    }
    
    public N endStrategy() {
      return and();
    }
    
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
  
    V1PodTemplateSpecBuilder builder;
  
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeploymentSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  }
}