package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetSpecFluent<A extends V1DaemonSetSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
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
  public V1DaemonSetSpecFluent.SelectorNested<A> withNewSelector();
  public V1DaemonSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1DaemonSetSpecFluent.SelectorNested<A> editSelector();
  public V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplate();
  public V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1DaemonSetSpecFluent.TemplateNested<A> editTemplate();
  public V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  
  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonSetUpdateStrategy getUpdateStrategy();
  public V1DaemonSetUpdateStrategy buildUpdateStrategy();
  public A withUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy);
  public Boolean hasUpdateStrategy();
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item);
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
  public V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1DaemonSetUpdateStrategy item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1DaemonSetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1DaemonSetSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  public interface UpdateStrategyNested<N> extends Nested<N>,V1DaemonSetUpdateStrategyFluent<V1DaemonSetSpecFluent.UpdateStrategyNested<N>>{
    public N and();
    public N endUpdateStrategy();
    
  }
  
}