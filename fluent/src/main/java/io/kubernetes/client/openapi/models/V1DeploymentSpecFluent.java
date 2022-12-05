package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DeploymentSpecFluent<A extends V1DeploymentSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  public Boolean getPaused();
  public A withPaused(Boolean paused);
  public Boolean hasPaused();
  public Integer getProgressDeadlineSeconds();
  public A withProgressDeadlineSeconds(Integer progressDeadlineSeconds);
  public Boolean hasProgressDeadlineSeconds();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public Integer getRevisionHistoryLimit();
  public A withRevisionHistoryLimit(Integer revisionHistoryLimit);
  public Boolean hasRevisionHistoryLimit();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public V1LabelSelector buildSelector();
  public A withSelector(V1LabelSelector selector);
  public Boolean hasSelector();
  public V1DeploymentSpecFluent.SelectorNested<A> withNewSelector();
  public V1DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1DeploymentSpecFluent.SelectorNested<A> editSelector();
  public V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeploymentStrategy getStrategy();
  public V1DeploymentStrategy buildStrategy();
  public A withStrategy(V1DeploymentStrategy strategy);
  public Boolean hasStrategy();
  public V1DeploymentSpecFluent.StrategyNested<A> withNewStrategy();
  public V1DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(V1DeploymentStrategy item);
  public V1DeploymentSpecFluent.StrategyNested<A> editStrategy();
  public V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy();
  public V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(V1DeploymentStrategy item);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1DeploymentSpecFluent.TemplateNested<A> withNewTemplate();
  public V1DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1DeploymentSpecFluent.TemplateNested<A> editTemplate();
  public V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  public A withPaused();
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1DeploymentSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface StrategyNested<N> extends Nested<N>,V1DeploymentStrategyFluent<V1DeploymentSpecFluent.StrategyNested<N>>{
    public N and();
    public N endStrategy();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1DeploymentSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}