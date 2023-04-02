package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobSpecFluent<A extends V1JobSpecFluent<A>> extends Fluent<A>{
  public Long getActiveDeadlineSeconds();
  public A withActiveDeadlineSeconds(Long activeDeadlineSeconds);
  public Boolean hasActiveDeadlineSeconds();
  public Integer getBackoffLimit();
  public A withBackoffLimit(Integer backoffLimit);
  public Boolean hasBackoffLimit();
  public String getCompletionMode();
  public A withCompletionMode(String completionMode);
  public Boolean hasCompletionMode();
  public Integer getCompletions();
  public A withCompletions(Integer completions);
  public Boolean hasCompletions();
  public Boolean getManualSelector();
  public A withManualSelector(Boolean manualSelector);
  public Boolean hasManualSelector();
  public Integer getParallelism();
  public A withParallelism(Integer parallelism);
  public Boolean hasParallelism();
  
  /**
   * This method has been deprecated, please use method buildPodFailurePolicy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodFailurePolicy getPodFailurePolicy();
  public V1PodFailurePolicy buildPodFailurePolicy();
  public A withPodFailurePolicy(V1PodFailurePolicy podFailurePolicy);
  public Boolean hasPodFailurePolicy();
  public V1JobSpecFluent.PodFailurePolicyNested<A> withNewPodFailurePolicy();
  public V1JobSpecFluent.PodFailurePolicyNested<A> withNewPodFailurePolicyLike(V1PodFailurePolicy item);
  public V1JobSpecFluent.PodFailurePolicyNested<A> editPodFailurePolicy();
  public V1JobSpecFluent.PodFailurePolicyNested<A> editOrNewPodFailurePolicy();
  public V1JobSpecFluent.PodFailurePolicyNested<A> editOrNewPodFailurePolicyLike(V1PodFailurePolicy item);
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public V1LabelSelector buildSelector();
  public A withSelector(V1LabelSelector selector);
  public Boolean hasSelector();
  public V1JobSpecFluent.SelectorNested<A> withNewSelector();
  public V1JobSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1JobSpecFluent.SelectorNested<A> editSelector();
  public V1JobSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1JobSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  public Boolean getSuspend();
  public A withSuspend(Boolean suspend);
  public Boolean hasSuspend();
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1JobSpecFluent.TemplateNested<A> withNewTemplate();
  public V1JobSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1JobSpecFluent.TemplateNested<A> editTemplate();
  public V1JobSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1JobSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  public Integer getTtlSecondsAfterFinished();
  public A withTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished);
  public Boolean hasTtlSecondsAfterFinished();
  public A withManualSelector();
  public A withSuspend();
  public interface PodFailurePolicyNested<N> extends Nested<N>,V1PodFailurePolicyFluent<V1JobSpecFluent.PodFailurePolicyNested<N>>{
    public N and();
    public N endPodFailurePolicy();
    
  }
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1JobSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1JobSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}