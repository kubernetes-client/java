package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ReplicaSetSpecFluent<A extends V1ReplicaSetSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();
  public V1LabelSelector buildSelector();
  public A withSelector(V1LabelSelector selector);
  public Boolean hasSelector();
  public V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelector();
  public V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1ReplicaSetSpecFluent.SelectorNested<A> editSelector();
  public V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate();
  public V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1ReplicaSetSpecFluent.TemplateNested<A> editTemplate();
  public V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1ReplicaSetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1ReplicaSetSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}