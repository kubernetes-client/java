package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1JobSpecFluentImpl<A extends V1JobSpecFluent<A>> extends BaseFluent<A> implements V1JobSpecFluent<A>{
  public V1JobSpecFluentImpl() {
  }
  public V1JobSpecFluentImpl(V1JobSpec instance) {
    if (instance != null) {
      this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
      this.withBackoffLimit(instance.getBackoffLimit());
      this.withCompletionMode(instance.getCompletionMode());
      this.withCompletions(instance.getCompletions());
      this.withManualSelector(instance.getManualSelector());
      this.withParallelism(instance.getParallelism());
      this.withPodFailurePolicy(instance.getPodFailurePolicy());
      this.withSelector(instance.getSelector());
      this.withSuspend(instance.getSuspend());
      this.withTemplate(instance.getTemplate());
      this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
    }
  }
  private Long activeDeadlineSeconds;
  private Integer backoffLimit;
  private String completionMode;
  private Integer completions;
  private Boolean manualSelector;
  private Integer parallelism;
  private V1PodFailurePolicyBuilder podFailurePolicy;
  private V1LabelSelectorBuilder selector;
  private Boolean suspend;
  private V1PodTemplateSpecBuilder template;
  private Integer ttlSecondsAfterFinished;
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
  }
  public Boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }
  public Integer getBackoffLimit() {
    return this.backoffLimit;
  }
  public A withBackoffLimit(Integer backoffLimit) {
    this.backoffLimit=backoffLimit; return (A) this;
  }
  public Boolean hasBackoffLimit() {
    return this.backoffLimit != null;
  }
  public String getCompletionMode() {
    return this.completionMode;
  }
  public A withCompletionMode(String completionMode) {
    this.completionMode=completionMode; return (A) this;
  }
  public Boolean hasCompletionMode() {
    return this.completionMode != null;
  }
  public Integer getCompletions() {
    return this.completions;
  }
  public A withCompletions(Integer completions) {
    this.completions=completions; return (A) this;
  }
  public Boolean hasCompletions() {
    return this.completions != null;
  }
  public Boolean getManualSelector() {
    return this.manualSelector;
  }
  public A withManualSelector(Boolean manualSelector) {
    this.manualSelector=manualSelector; return (A) this;
  }
  public Boolean hasManualSelector() {
    return this.manualSelector != null;
  }
  public Integer getParallelism() {
    return this.parallelism;
  }
  public A withParallelism(Integer parallelism) {
    this.parallelism=parallelism; return (A) this;
  }
  public Boolean hasParallelism() {
    return this.parallelism != null;
  }
  
  /**
   * This method has been deprecated, please use method buildPodFailurePolicy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodFailurePolicy getPodFailurePolicy() {
    return this.podFailurePolicy!=null ?this.podFailurePolicy.build():null;
  }
  public V1PodFailurePolicy buildPodFailurePolicy() {
    return this.podFailurePolicy!=null ?this.podFailurePolicy.build():null;
  }
  public A withPodFailurePolicy(V1PodFailurePolicy podFailurePolicy) {
    _visitables.get("podFailurePolicy").remove(this.podFailurePolicy);
    if (podFailurePolicy!=null){ this.podFailurePolicy= new V1PodFailurePolicyBuilder(podFailurePolicy); _visitables.get("podFailurePolicy").add(this.podFailurePolicy);} else { this.podFailurePolicy = null; _visitables.get("podFailurePolicy").remove(this.podFailurePolicy); } return (A) this;
  }
  public Boolean hasPodFailurePolicy() {
    return this.podFailurePolicy != null;
  }
  public V1JobSpecFluentImpl.PodFailurePolicyNested<A> withNewPodFailurePolicy() {
    return new V1JobSpecFluentImpl.PodFailurePolicyNestedImpl();
  }
  public V1JobSpecFluentImpl.PodFailurePolicyNested<A> withNewPodFailurePolicyLike(V1PodFailurePolicy item) {
    return new V1JobSpecFluentImpl.PodFailurePolicyNestedImpl(item);
  }
  public V1JobSpecFluentImpl.PodFailurePolicyNested<A> editPodFailurePolicy() {
    return withNewPodFailurePolicyLike(getPodFailurePolicy());
  }
  public V1JobSpecFluentImpl.PodFailurePolicyNested<A> editOrNewPodFailurePolicy() {
    return withNewPodFailurePolicyLike(getPodFailurePolicy() != null ? getPodFailurePolicy(): new V1PodFailurePolicyBuilder().build());
  }
  public V1JobSpecFluentImpl.PodFailurePolicyNested<A> editOrNewPodFailurePolicyLike(V1PodFailurePolicy item) {
    return withNewPodFailurePolicyLike(getPodFailurePolicy() != null ? getPodFailurePolicy(): item);
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
  public V1JobSpecFluentImpl.SelectorNested<A> withNewSelector() {
    return new V1JobSpecFluentImpl.SelectorNestedImpl();
  }
  public V1JobSpecFluentImpl.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1JobSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1JobSpecFluentImpl.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1JobSpecFluentImpl.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1JobSpecFluentImpl.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public Boolean getSuspend() {
    return this.suspend;
  }
  public A withSuspend(Boolean suspend) {
    this.suspend=suspend; return (A) this;
  }
  public Boolean hasSuspend() {
    return this.suspend != null;
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
  public V1JobSpecFluentImpl.TemplateNested<A> withNewTemplate() {
    return new V1JobSpecFluentImpl.TemplateNestedImpl();
  }
  public V1JobSpecFluentImpl.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1JobSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1JobSpecFluentImpl.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1JobSpecFluentImpl.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1JobSpecFluentImpl.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  public Integer getTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished;
  }
  public A withTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished=ttlSecondsAfterFinished; return (A) this;
  }
  public Boolean hasTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobSpecFluentImpl that = (V1JobSpecFluentImpl) o;
    if (!java.util.Objects.equals(activeDeadlineSeconds, that.activeDeadlineSeconds)) return false;

    if (!java.util.Objects.equals(backoffLimit, that.backoffLimit)) return false;

    if (!java.util.Objects.equals(completionMode, that.completionMode)) return false;

    if (!java.util.Objects.equals(completions, that.completions)) return false;

    if (!java.util.Objects.equals(manualSelector, that.manualSelector)) return false;

    if (!java.util.Objects.equals(parallelism, that.parallelism)) return false;

    if (!java.util.Objects.equals(podFailurePolicy, that.podFailurePolicy)) return false;

    if (!java.util.Objects.equals(selector, that.selector)) return false;

    if (!java.util.Objects.equals(suspend, that.suspend)) return false;

    if (!java.util.Objects.equals(template, that.template)) return false;

    if (!java.util.Objects.equals(ttlSecondsAfterFinished, that.ttlSecondsAfterFinished)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  backoffLimit,  completionMode,  completions,  manualSelector,  parallelism,  podFailurePolicy,  selector,  suspend,  template,  ttlSecondsAfterFinished,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) { sb.append("activeDeadlineSeconds:"); sb.append(activeDeadlineSeconds + ","); }
    if (backoffLimit != null) { sb.append("backoffLimit:"); sb.append(backoffLimit + ","); }
    if (completionMode != null) { sb.append("completionMode:"); sb.append(completionMode + ","); }
    if (completions != null) { sb.append("completions:"); sb.append(completions + ","); }
    if (manualSelector != null) { sb.append("manualSelector:"); sb.append(manualSelector + ","); }
    if (parallelism != null) { sb.append("parallelism:"); sb.append(parallelism + ","); }
    if (podFailurePolicy != null) { sb.append("podFailurePolicy:"); sb.append(podFailurePolicy + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (suspend != null) { sb.append("suspend:"); sb.append(suspend + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (ttlSecondsAfterFinished != null) { sb.append("ttlSecondsAfterFinished:"); sb.append(ttlSecondsAfterFinished); }
    sb.append("}");
    return sb.toString();
  }
  public A withManualSelector() {
    return withManualSelector(true);
  }
  public A withSuspend() {
    return withSuspend(true);
  }
  class PodFailurePolicyNestedImpl<N> extends V1PodFailurePolicyFluentImpl<V1JobSpecFluentImpl.PodFailurePolicyNested<N>> implements V1JobSpecFluentImpl.PodFailurePolicyNested<N>,Nested<N>{
    PodFailurePolicyNestedImpl(V1PodFailurePolicy item) {
      this.builder = new V1PodFailurePolicyBuilder(this, item);
    }
    PodFailurePolicyNestedImpl() {
      this.builder = new V1PodFailurePolicyBuilder(this);
    }
    V1PodFailurePolicyBuilder builder;
    public N and() {
      return (N) V1JobSpecFluentImpl.this.withPodFailurePolicy(builder.build());
    }
    public N endPodFailurePolicy() {
      return and();
    }
    
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1JobSpecFluentImpl.SelectorNested<N>> implements V1JobSpecFluentImpl.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1JobSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1JobSpecFluentImpl.TemplateNested<N>> implements V1JobSpecFluentImpl.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1JobSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  
}