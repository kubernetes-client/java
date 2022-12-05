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
  public class V1DaemonSetSpecFluentImpl<A extends V1DaemonSetSpecFluent<A>> extends BaseFluent<A> implements V1DaemonSetSpecFluent<A>{
  public V1DaemonSetSpecFluentImpl() {
  }
  public V1DaemonSetSpecFluentImpl(V1DaemonSetSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

  }
  private Integer minReadySeconds;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private V1PodTemplateSpecBuilder template;
  private V1DaemonSetUpdateStrategyBuilder updateStrategy;
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds=minReadySeconds; return (A) this;
  }
  public Boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
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
  public V1DaemonSetSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1DaemonSetSpecFluentImpl.SelectorNestedImpl();
  }
  public V1DaemonSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1DaemonSetSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1DaemonSetSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
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
  public V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1DaemonSetSpecFluentImpl.TemplateNestedImpl();
  }
  public V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1DaemonSetSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1DaemonSetSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return this.updateStrategy!=null ?this.updateStrategy.build():null;
  }
  public V1DaemonSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy!=null ?this.updateStrategy.build():null;
  }
  public A withUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    _visitables.get("updateStrategy").remove(this.updateStrategy);
    if (updateStrategy!=null){ this.updateStrategy= new V1DaemonSetUpdateStrategyBuilder(updateStrategy); _visitables.get("updateStrategy").add(this.updateStrategy);} else { this.updateStrategy = null; _visitables.get("updateStrategy").remove(this.updateStrategy); } return (A) this;
  }
  public Boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy() {
    return new V1DaemonSetSpecFluentImpl.UpdateStrategyNestedImpl();
  }
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item) {
    return new V1DaemonSetSpecFluentImpl.UpdateStrategyNestedImpl(item);
  }
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy());
  }
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): new V1DaemonSetUpdateStrategyBuilder().build());
  }
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item) {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetSpecFluentImpl that = (V1DaemonSetSpecFluentImpl) o;
    if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
    if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
    if (updateStrategy != null ? !updateStrategy.equals(that.updateStrategy) :that.updateStrategy != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  revisionHistoryLimit,  selector,  template,  updateStrategy,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (revisionHistoryLimit != null) { sb.append("revisionHistoryLimit:"); sb.append(revisionHistoryLimit + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (updateStrategy != null) { sb.append("updateStrategy:"); sb.append(updateStrategy); }
    sb.append("}");
    return sb.toString();
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1DaemonSetSpecFluent.SelectorNested<N>> implements V1DaemonSetSpecFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1DaemonSetSpecFluent.TemplateNested<N>> implements V1DaemonSetSpecFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  class UpdateStrategyNestedImpl<N> extends V1DaemonSetUpdateStrategyFluentImpl<V1DaemonSetSpecFluent.UpdateStrategyNested<N>> implements V1DaemonSetSpecFluent.UpdateStrategyNested<N>,Nested<N>{
    UpdateStrategyNestedImpl(V1DaemonSetUpdateStrategy item) {
      this.builder = new V1DaemonSetUpdateStrategyBuilder(this, item);
    }
    UpdateStrategyNestedImpl() {
      this.builder = new V1DaemonSetUpdateStrategyBuilder(this);
    }
    V1DaemonSetUpdateStrategyBuilder builder;
    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }
    public N endUpdateStrategy() {
      return and();
    }
    
  }
  
}