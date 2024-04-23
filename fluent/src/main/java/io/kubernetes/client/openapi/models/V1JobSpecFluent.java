package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1JobSpecFluent<A extends V1JobSpecFluent<A>> extends BaseFluent<A>{
  public V1JobSpecFluent() {
  }
  
  public V1JobSpecFluent(V1JobSpec instance) {
    this.copyInstance(instance);
  }
  private Long activeDeadlineSeconds;
  private Integer backoffLimit;
  private Integer backoffLimitPerIndex;
  private String completionMode;
  private Integer completions;
  private String managedBy;
  private Boolean manualSelector;
  private Integer maxFailedIndexes;
  private Integer parallelism;
  private V1PodFailurePolicyBuilder podFailurePolicy;
  private String podReplacementPolicy;
  private V1LabelSelectorBuilder selector;
  private V1SuccessPolicyBuilder successPolicy;
  private Boolean suspend;
  private V1PodTemplateSpecBuilder template;
  private Integer ttlSecondsAfterFinished;
  
  protected void copyInstance(V1JobSpec instance) {
    instance = (instance != null ? instance : new V1JobSpec());
    if (instance != null) {
          this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
          this.withBackoffLimit(instance.getBackoffLimit());
          this.withBackoffLimitPerIndex(instance.getBackoffLimitPerIndex());
          this.withCompletionMode(instance.getCompletionMode());
          this.withCompletions(instance.getCompletions());
          this.withManagedBy(instance.getManagedBy());
          this.withManualSelector(instance.getManualSelector());
          this.withMaxFailedIndexes(instance.getMaxFailedIndexes());
          this.withParallelism(instance.getParallelism());
          this.withPodFailurePolicy(instance.getPodFailurePolicy());
          this.withPodReplacementPolicy(instance.getPodReplacementPolicy());
          this.withSelector(instance.getSelector());
          this.withSuccessPolicy(instance.getSuccessPolicy());
          this.withSuspend(instance.getSuspend());
          this.withTemplate(instance.getTemplate());
          this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
        }
  }
  
  public Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }
  
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }
  
  public boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }
  
  public Integer getBackoffLimit() {
    return this.backoffLimit;
  }
  
  public A withBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return (A) this;
  }
  
  public boolean hasBackoffLimit() {
    return this.backoffLimit != null;
  }
  
  public Integer getBackoffLimitPerIndex() {
    return this.backoffLimitPerIndex;
  }
  
  public A withBackoffLimitPerIndex(Integer backoffLimitPerIndex) {
    this.backoffLimitPerIndex = backoffLimitPerIndex;
    return (A) this;
  }
  
  public boolean hasBackoffLimitPerIndex() {
    return this.backoffLimitPerIndex != null;
  }
  
  public String getCompletionMode() {
    return this.completionMode;
  }
  
  public A withCompletionMode(String completionMode) {
    this.completionMode = completionMode;
    return (A) this;
  }
  
  public boolean hasCompletionMode() {
    return this.completionMode != null;
  }
  
  public Integer getCompletions() {
    return this.completions;
  }
  
  public A withCompletions(Integer completions) {
    this.completions = completions;
    return (A) this;
  }
  
  public boolean hasCompletions() {
    return this.completions != null;
  }
  
  public String getManagedBy() {
    return this.managedBy;
  }
  
  public A withManagedBy(String managedBy) {
    this.managedBy = managedBy;
    return (A) this;
  }
  
  public boolean hasManagedBy() {
    return this.managedBy != null;
  }
  
  public Boolean getManualSelector() {
    return this.manualSelector;
  }
  
  public A withManualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
    return (A) this;
  }
  
  public boolean hasManualSelector() {
    return this.manualSelector != null;
  }
  
  public Integer getMaxFailedIndexes() {
    return this.maxFailedIndexes;
  }
  
  public A withMaxFailedIndexes(Integer maxFailedIndexes) {
    this.maxFailedIndexes = maxFailedIndexes;
    return (A) this;
  }
  
  public boolean hasMaxFailedIndexes() {
    return this.maxFailedIndexes != null;
  }
  
  public Integer getParallelism() {
    return this.parallelism;
  }
  
  public A withParallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return (A) this;
  }
  
  public boolean hasParallelism() {
    return this.parallelism != null;
  }
  
  public V1PodFailurePolicy buildPodFailurePolicy() {
    return this.podFailurePolicy != null ? this.podFailurePolicy.build() : null;
  }
  
  public A withPodFailurePolicy(V1PodFailurePolicy podFailurePolicy) {
    this._visitables.remove("podFailurePolicy");
    if (podFailurePolicy != null) {
        this.podFailurePolicy = new V1PodFailurePolicyBuilder(podFailurePolicy);
        this._visitables.get("podFailurePolicy").add(this.podFailurePolicy);
    } else {
        this.podFailurePolicy = null;
        this._visitables.get("podFailurePolicy").remove(this.podFailurePolicy);
    }
    return (A) this;
  }
  
  public boolean hasPodFailurePolicy() {
    return this.podFailurePolicy != null;
  }
  
  public PodFailurePolicyNested<A> withNewPodFailurePolicy() {
    return new PodFailurePolicyNested(null);
  }
  
  public PodFailurePolicyNested<A> withNewPodFailurePolicyLike(V1PodFailurePolicy item) {
    return new PodFailurePolicyNested(item);
  }
  
  public PodFailurePolicyNested<A> editPodFailurePolicy() {
    return withNewPodFailurePolicyLike(java.util.Optional.ofNullable(buildPodFailurePolicy()).orElse(null));
  }
  
  public PodFailurePolicyNested<A> editOrNewPodFailurePolicy() {
    return withNewPodFailurePolicyLike(java.util.Optional.ofNullable(buildPodFailurePolicy()).orElse(new V1PodFailurePolicyBuilder().build()));
  }
  
  public PodFailurePolicyNested<A> editOrNewPodFailurePolicyLike(V1PodFailurePolicy item) {
    return withNewPodFailurePolicyLike(java.util.Optional.ofNullable(buildPodFailurePolicy()).orElse(item));
  }
  
  public String getPodReplacementPolicy() {
    return this.podReplacementPolicy;
  }
  
  public A withPodReplacementPolicy(String podReplacementPolicy) {
    this.podReplacementPolicy = podReplacementPolicy;
    return (A) this;
  }
  
  public boolean hasPodReplacementPolicy() {
    return this.podReplacementPolicy != null;
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
  
  public V1SuccessPolicy buildSuccessPolicy() {
    return this.successPolicy != null ? this.successPolicy.build() : null;
  }
  
  public A withSuccessPolicy(V1SuccessPolicy successPolicy) {
    this._visitables.remove("successPolicy");
    if (successPolicy != null) {
        this.successPolicy = new V1SuccessPolicyBuilder(successPolicy);
        this._visitables.get("successPolicy").add(this.successPolicy);
    } else {
        this.successPolicy = null;
        this._visitables.get("successPolicy").remove(this.successPolicy);
    }
    return (A) this;
  }
  
  public boolean hasSuccessPolicy() {
    return this.successPolicy != null;
  }
  
  public SuccessPolicyNested<A> withNewSuccessPolicy() {
    return new SuccessPolicyNested(null);
  }
  
  public SuccessPolicyNested<A> withNewSuccessPolicyLike(V1SuccessPolicy item) {
    return new SuccessPolicyNested(item);
  }
  
  public SuccessPolicyNested<A> editSuccessPolicy() {
    return withNewSuccessPolicyLike(java.util.Optional.ofNullable(buildSuccessPolicy()).orElse(null));
  }
  
  public SuccessPolicyNested<A> editOrNewSuccessPolicy() {
    return withNewSuccessPolicyLike(java.util.Optional.ofNullable(buildSuccessPolicy()).orElse(new V1SuccessPolicyBuilder().build()));
  }
  
  public SuccessPolicyNested<A> editOrNewSuccessPolicyLike(V1SuccessPolicy item) {
    return withNewSuccessPolicyLike(java.util.Optional.ofNullable(buildSuccessPolicy()).orElse(item));
  }
  
  public Boolean getSuspend() {
    return this.suspend;
  }
  
  public A withSuspend(Boolean suspend) {
    this.suspend = suspend;
    return (A) this;
  }
  
  public boolean hasSuspend() {
    return this.suspend != null;
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
  
  public Integer getTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished;
  }
  
  public A withTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return (A) this;
  }
  
  public boolean hasTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobSpecFluent that = (V1JobSpecFluent) o;
    if (!java.util.Objects.equals(activeDeadlineSeconds, that.activeDeadlineSeconds)) return false;
    if (!java.util.Objects.equals(backoffLimit, that.backoffLimit)) return false;
    if (!java.util.Objects.equals(backoffLimitPerIndex, that.backoffLimitPerIndex)) return false;
    if (!java.util.Objects.equals(completionMode, that.completionMode)) return false;
    if (!java.util.Objects.equals(completions, that.completions)) return false;
    if (!java.util.Objects.equals(managedBy, that.managedBy)) return false;
    if (!java.util.Objects.equals(manualSelector, that.manualSelector)) return false;
    if (!java.util.Objects.equals(maxFailedIndexes, that.maxFailedIndexes)) return false;
    if (!java.util.Objects.equals(parallelism, that.parallelism)) return false;
    if (!java.util.Objects.equals(podFailurePolicy, that.podFailurePolicy)) return false;
    if (!java.util.Objects.equals(podReplacementPolicy, that.podReplacementPolicy)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(successPolicy, that.successPolicy)) return false;
    if (!java.util.Objects.equals(suspend, that.suspend)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    if (!java.util.Objects.equals(ttlSecondsAfterFinished, that.ttlSecondsAfterFinished)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(activeDeadlineSeconds,  backoffLimit,  backoffLimitPerIndex,  completionMode,  completions,  managedBy,  manualSelector,  maxFailedIndexes,  parallelism,  podFailurePolicy,  podReplacementPolicy,  selector,  successPolicy,  suspend,  template,  ttlSecondsAfterFinished,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) { sb.append("activeDeadlineSeconds:"); sb.append(activeDeadlineSeconds + ","); }
    if (backoffLimit != null) { sb.append("backoffLimit:"); sb.append(backoffLimit + ","); }
    if (backoffLimitPerIndex != null) { sb.append("backoffLimitPerIndex:"); sb.append(backoffLimitPerIndex + ","); }
    if (completionMode != null) { sb.append("completionMode:"); sb.append(completionMode + ","); }
    if (completions != null) { sb.append("completions:"); sb.append(completions + ","); }
    if (managedBy != null) { sb.append("managedBy:"); sb.append(managedBy + ","); }
    if (manualSelector != null) { sb.append("manualSelector:"); sb.append(manualSelector + ","); }
    if (maxFailedIndexes != null) { sb.append("maxFailedIndexes:"); sb.append(maxFailedIndexes + ","); }
    if (parallelism != null) { sb.append("parallelism:"); sb.append(parallelism + ","); }
    if (podFailurePolicy != null) { sb.append("podFailurePolicy:"); sb.append(podFailurePolicy + ","); }
    if (podReplacementPolicy != null) { sb.append("podReplacementPolicy:"); sb.append(podReplacementPolicy + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (successPolicy != null) { sb.append("successPolicy:"); sb.append(successPolicy + ","); }
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
  public class PodFailurePolicyNested<N> extends V1PodFailurePolicyFluent<PodFailurePolicyNested<N>> implements Nested<N>{
    PodFailurePolicyNested(V1PodFailurePolicy item) {
      this.builder = new V1PodFailurePolicyBuilder(this, item);
    }
    V1PodFailurePolicyBuilder builder;
    
    public N and() {
      return (N) V1JobSpecFluent.this.withPodFailurePolicy(builder.build());
    }
    
    public N endPodFailurePolicy() {
      return and();
    }
    
  
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1JobSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class SuccessPolicyNested<N> extends V1SuccessPolicyFluent<SuccessPolicyNested<N>> implements Nested<N>{
    SuccessPolicyNested(V1SuccessPolicy item) {
      this.builder = new V1SuccessPolicyBuilder(this, item);
    }
    V1SuccessPolicyBuilder builder;
    
    public N and() {
      return (N) V1JobSpecFluent.this.withSuccessPolicy(builder.build());
    }
    
    public N endSuccessPolicy() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    V1PodTemplateSpecBuilder builder;
    
    public N and() {
      return (N) V1JobSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }

}