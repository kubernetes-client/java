package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1StatefulSetSpecFluent<A extends V1StatefulSetSpecFluent<A>> extends Fluent<A>{
  public Integer getMinReadySeconds();
  public A withMinReadySeconds(Integer minReadySeconds);
  public Boolean hasMinReadySeconds();
  
  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaimRetentionPolicy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy();
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy buildPersistentVolumeClaimRetentionPolicy();
  public A withPersistentVolumeClaimRetentionPolicy(V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy);
  public Boolean hasPersistentVolumeClaimRetentionPolicy();
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicy();
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item);
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editPersistentVolumeClaimRetentionPolicy();
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicy();
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item);
  public String getPodManagementPolicy();
  public A withPodManagementPolicy(String podManagementPolicy);
  public Boolean hasPodManagementPolicy();
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
  public V1StatefulSetSpecFluent.SelectorNested<A> withNewSelector();
  public V1StatefulSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item);
  public V1StatefulSetSpecFluent.SelectorNested<A> editSelector();
  public V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelector();
  public V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item);
  public String getServiceName();
  public A withServiceName(String serviceName);
  public Boolean hasServiceName();
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplate();
  public V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1StatefulSetSpecFluent.TemplateNested<A> editTemplate();
  public V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplate();
  public V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  
  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetUpdateStrategy getUpdateStrategy();
  public V1StatefulSetUpdateStrategy buildUpdateStrategy();
  public A withUpdateStrategy(V1StatefulSetUpdateStrategy updateStrategy);
  public Boolean hasUpdateStrategy();
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item);
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item);
  public A addToVolumeClaimTemplates(Integer index,V1PersistentVolumeClaim item);
  public A setToVolumeClaimTemplates(Integer index,V1PersistentVolumeClaim item);
  public A addToVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A addAllToVolumeClaimTemplates(Collection<V1PersistentVolumeClaim> items);
  public A removeFromVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A removeAllFromVolumeClaimTemplates(Collection<V1PersistentVolumeClaim> items);
  public A removeMatchingFromVolumeClaimTemplates(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates();
  public List<V1PersistentVolumeClaim> buildVolumeClaimTemplates();
  public V1PersistentVolumeClaim buildVolumeClaimTemplate(Integer index);
  public V1PersistentVolumeClaim buildFirstVolumeClaimTemplate();
  public V1PersistentVolumeClaim buildLastVolumeClaimTemplate();
  public V1PersistentVolumeClaim buildMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  public Boolean hasMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  public A withVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates);
  public A withVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... volumeClaimTemplates);
  public Boolean hasVolumeClaimTemplates();
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate();
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(V1PersistentVolumeClaim item);
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(Integer index,V1PersistentVolumeClaim item);
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(Integer index);
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate();
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate();
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate);
  public interface PersistentVolumeClaimRetentionPolicyNested<N> extends Nested<N>,V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<N>>{
    public N and();
    public N endPersistentVolumeClaimRetentionPolicy();
    
  }
  public interface SelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1StatefulSetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1StatefulSetSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  public interface UpdateStrategyNested<N> extends Nested<N>,V1StatefulSetUpdateStrategyFluent<V1StatefulSetSpecFluent.UpdateStrategyNested<N>>{
    public N and();
    public N endUpdateStrategy();
    
  }
  public interface VolumeClaimTemplatesNested<N> extends Nested<N>,V1PersistentVolumeClaimFluent<V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>>{
    public N and();
    public N endVolumeClaimTemplate();
    
  }
  
}