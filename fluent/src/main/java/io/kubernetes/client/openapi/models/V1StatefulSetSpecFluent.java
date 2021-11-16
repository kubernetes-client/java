package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
public interface V1StatefulSetSpecFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getMinReadySeconds();
  public A withMinReadySeconds(java.lang.Integer minReadySeconds);
  public java.lang.Boolean hasMinReadySeconds();
  public java.lang.String getPodManagementPolicy();
  public A withPodManagementPolicy(java.lang.String podManagementPolicy);
  public java.lang.Boolean hasPodManagementPolicy();
  
  /**
   * Method is deprecated. use withPodManagementPolicy instead.
   */
  @java.lang.Deprecated
  public A withNewPodManagementPolicy(java.lang.String arg0);
  public java.lang.Integer getReplicas();
  public A withReplicas(java.lang.Integer replicas);
  public java.lang.Boolean hasReplicas();
  public java.lang.Integer getRevisionHistoryLimit();
  public A withRevisionHistoryLimit(java.lang.Integer revisionHistoryLimit);
  public java.lang.Boolean hasRevisionHistoryLimit();
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
  public java.lang.Boolean hasSelector();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A> withNewSelector();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A> editSelector();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelector();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public java.lang.String getServiceName();
  public A withServiceName(java.lang.String serviceName);
  public java.lang.Boolean hasServiceName();
  
  /**
   * Method is deprecated. use withServiceName instead.
   */
  @java.lang.Deprecated
  public A withNewServiceName(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
  public java.lang.Boolean hasTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A> editTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
  
  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy getUpdateStrategy();
  public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy buildUpdateStrategy();
  public A withUpdateStrategy(io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy updateStrategy);
  public java.lang.Boolean hasUpdateStrategy();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy item);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy item);
  public A addToVolumeClaimTemplates(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item);
  public A setToVolumeClaimTemplates(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item);
  public A addToVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A addAllToVolumeClaimTemplates(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> items);
  public A removeFromVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items);
  public A removeAllFromVolumeClaimTemplates(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> items);
  public A removeMatchingFromVolumeClaimTemplates(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> getVolumeClaimTemplates();
  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> buildVolumeClaimTemplates();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim buildVolumeClaimTemplate(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim buildFirstVolumeClaimTemplate();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim buildLastVolumeClaimTemplate();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim buildMatchingVolumeClaimTemplate(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder> predicate);
  public java.lang.Boolean hasMatchingVolumeClaimTemplate(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder> predicate);
  public A withVolumeClaimTemplates(java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> volumeClaimTemplates);
  public A withVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... volumeClaimTemplates);
  public java.lang.Boolean hasVolumeClaimTemplates();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder> predicate);
  public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<N>>{
    public N and();
    public N endSelector();
    
  }
  public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  public interface UpdateStrategyNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent<io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<N>>{
    public N and();
    public N endUpdateStrategy();
    
  }
  public interface VolumeClaimTemplatesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimFluent<io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>>{
    public N and();
    public N endVolumeClaimTemplate();
    
  }
  
}