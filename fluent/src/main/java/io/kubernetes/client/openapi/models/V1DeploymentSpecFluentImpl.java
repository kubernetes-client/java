package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1DeploymentSpecFluentImpl<A extends V1DeploymentSpecFluent<A>> extends BaseFluent<A> implements V1DeploymentSpecFluent<A>{
  public V1DeploymentSpecFluentImpl() {
  }
  public V1DeploymentSpecFluentImpl(V1DeploymentSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPaused(instance.getPaused());

    this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withStrategy(instance.getStrategy());

    this.withTemplate(instance.getTemplate());

  }
  private Integer minReadySeconds;
  private Boolean paused;
  private Integer progressDeadlineSeconds;
  private Integer replicas;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private V1DeploymentStrategyBuilder strategy;
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
  public Boolean getPaused() {
    return this.paused;
  }
  public A withPaused(Boolean paused) {
    this.paused=paused; return (A) this;
  }
  public Boolean hasPaused() {
    return this.paused != null;
  }
  public Integer getProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds;
  }
  public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds=progressDeadlineSeconds; return (A) this;
  }
  public Boolean hasProgressDeadlineSeconds() {
    return this.progressDeadlineSeconds != null;
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
  public Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }
  public A withRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit=revisionHistoryLimit; return (A) this;
  }
  public Boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
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
  public V1DeploymentSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1DeploymentSpecFluentImpl.SelectorNestedImpl();
  }
  public V1DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1DeploymentSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1DeploymentSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeploymentStrategy getStrategy() {
    return this.strategy!=null ?this.strategy.build():null;
  }
  public V1DeploymentStrategy buildStrategy() {
    return this.strategy!=null ?this.strategy.build():null;
  }
  public A withStrategy(V1DeploymentStrategy strategy) {
    _visitables.get("strategy").remove(this.strategy);
    if (strategy!=null){ this.strategy= new V1DeploymentStrategyBuilder(strategy); _visitables.get("strategy").add(this.strategy);} else { this.strategy = null; _visitables.get("strategy").remove(this.strategy); } return (A) this;
  }
  public Boolean hasStrategy() {
    return this.strategy != null;
  }
  public V1DeploymentSpecFluent.StrategyNested<A> withNewStrategy() {
    return new V1DeploymentSpecFluentImpl.StrategyNestedImpl();
  }
  public V1DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(V1DeploymentStrategy item) {
    return new V1DeploymentSpecFluentImpl.StrategyNestedImpl(item);
  }
  public V1DeploymentSpecFluent.StrategyNested<A> editStrategy() {
    return withNewStrategyLike(getStrategy());
  }
  public V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy() {
    return withNewStrategyLike(getStrategy() != null ? getStrategy(): new V1DeploymentStrategyBuilder().build());
  }
  public V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(V1DeploymentStrategy item) {
    return withNewStrategyLike(getStrategy() != null ? getStrategy(): item);
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
  public V1DeploymentSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1DeploymentSpecFluentImpl.TemplateNestedImpl();
  }
  public V1DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1DeploymentSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1DeploymentSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DeploymentSpecFluentImpl that = (V1DeploymentSpecFluentImpl) o;
    if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
    if (paused != null ? !paused.equals(that.paused) :that.paused != null) return false;
    if (progressDeadlineSeconds != null ? !progressDeadlineSeconds.equals(that.progressDeadlineSeconds) :that.progressDeadlineSeconds != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
    if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
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
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1DeploymentSpecFluent.SelectorNested<N>> implements V1DeploymentSpecFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1DeploymentSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  class StrategyNestedImpl<N> extends V1DeploymentStrategyFluentImpl<V1DeploymentSpecFluent.StrategyNested<N>> implements V1DeploymentSpecFluent.StrategyNested<N>,Nested<N>{
    StrategyNestedImpl(V1DeploymentStrategy item) {
      this.builder = new V1DeploymentStrategyBuilder(this, item);
    }
    StrategyNestedImpl() {
      this.builder = new V1DeploymentStrategyBuilder(this);
    }
    V1DeploymentStrategyBuilder builder;
    public N and() {
      return (N) V1DeploymentSpecFluentImpl.this.withStrategy(builder.build());
    }
    public N endStrategy() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1DeploymentSpecFluent.TemplateNested<N>> implements V1DeploymentSpecFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1DeploymentSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  
}