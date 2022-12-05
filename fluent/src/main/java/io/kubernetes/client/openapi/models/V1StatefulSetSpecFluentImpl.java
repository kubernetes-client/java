package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1StatefulSetSpecFluentImpl<A extends V1StatefulSetSpecFluent<A>> extends BaseFluent<A> implements V1StatefulSetSpecFluent<A>{
  public V1StatefulSetSpecFluentImpl() {
  }
  public V1StatefulSetSpecFluentImpl(V1StatefulSetSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPersistentVolumeClaimRetentionPolicy(instance.getPersistentVolumeClaimRetentionPolicy());

    this.withPodManagementPolicy(instance.getPodManagementPolicy());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withServiceName(instance.getServiceName());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

    this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());

  }
  private Integer minReadySeconds;
  private V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder persistentVolumeClaimRetentionPolicy;
  private String podManagementPolicy;
  private Integer replicas;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private String serviceName;
  private V1PodTemplateSpecBuilder template;
  private V1StatefulSetUpdateStrategyBuilder updateStrategy;
  private ArrayList<V1PersistentVolumeClaimBuilder> volumeClaimTemplates;
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds=minReadySeconds; return (A) this;
  }
  public Boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaimRetentionPolicy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy!=null ?this.persistentVolumeClaimRetentionPolicy.build():null;
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy buildPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy!=null ?this.persistentVolumeClaimRetentionPolicy.build():null;
  }
  public A withPersistentVolumeClaimRetentionPolicy(V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
    _visitables.get("persistentVolumeClaimRetentionPolicy").remove(this.persistentVolumeClaimRetentionPolicy);
    if (persistentVolumeClaimRetentionPolicy!=null){ this.persistentVolumeClaimRetentionPolicy= new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(persistentVolumeClaimRetentionPolicy); _visitables.get("persistentVolumeClaimRetentionPolicy").add(this.persistentVolumeClaimRetentionPolicy);} else { this.persistentVolumeClaimRetentionPolicy = null; _visitables.get("persistentVolumeClaimRetentionPolicy").remove(this.persistentVolumeClaimRetentionPolicy); } return (A) this;
  }
  public Boolean hasPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null;
  }
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicy() {
    return new V1StatefulSetSpecFluentImpl.PersistentVolumeClaimRetentionPolicyNestedImpl();
  }
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
    return new V1StatefulSetSpecFluentImpl.PersistentVolumeClaimRetentionPolicyNestedImpl(item);
  }
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(getPersistentVolumeClaimRetentionPolicy());
  }
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(getPersistentVolumeClaimRetentionPolicy() != null ? getPersistentVolumeClaimRetentionPolicy(): new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder().build());
  }
  public V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
    return withNewPersistentVolumeClaimRetentionPolicyLike(getPersistentVolumeClaimRetentionPolicy() != null ? getPersistentVolumeClaimRetentionPolicy(): item);
  }
  public String getPodManagementPolicy() {
    return this.podManagementPolicy;
  }
  public A withPodManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy=podManagementPolicy; return (A) this;
  }
  public Boolean hasPodManagementPolicy() {
    return this.podManagementPolicy != null;
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
  public V1StatefulSetSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1StatefulSetSpecFluentImpl.SelectorNestedImpl();
  }
  public V1StatefulSetSpecFluent.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1StatefulSetSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1StatefulSetSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1StatefulSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public String getServiceName() {
    return this.serviceName;
  }
  public A withServiceName(String serviceName) {
    this.serviceName=serviceName; return (A) this;
  }
  public Boolean hasServiceName() {
    return this.serviceName != null;
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
  public V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1StatefulSetSpecFluentImpl.TemplateNestedImpl();
  }
  public V1StatefulSetSpecFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1StatefulSetSpecFluentImpl.TemplateNestedImpl(item);
  }
  public V1StatefulSetSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatefulSetUpdateStrategy getUpdateStrategy() {
    return this.updateStrategy!=null ?this.updateStrategy.build():null;
  }
  public V1StatefulSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy!=null ?this.updateStrategy.build():null;
  }
  public A withUpdateStrategy(V1StatefulSetUpdateStrategy updateStrategy) {
    _visitables.get("updateStrategy").remove(this.updateStrategy);
    if (updateStrategy!=null){ this.updateStrategy= new V1StatefulSetUpdateStrategyBuilder(updateStrategy); _visitables.get("updateStrategy").add(this.updateStrategy);} else { this.updateStrategy = null; _visitables.get("updateStrategy").remove(this.updateStrategy); } return (A) this;
  }
  public Boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy() {
    return new V1StatefulSetSpecFluentImpl.UpdateStrategyNestedImpl();
  }
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item) {
    return new V1StatefulSetSpecFluentImpl.UpdateStrategyNestedImpl(item);
  }
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy());
  }
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): new V1StatefulSetUpdateStrategyBuilder().build());
  }
  public V1StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item) {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): item);
  }
  public A addToVolumeClaimTemplates(Integer index,V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").add(index >= 0 ? index : _visitables.get("volumeClaimTemplates").size(), builder);this.volumeClaimTemplates.add(index >= 0 ? index : volumeClaimTemplates.size(), builder); return (A)this;
  }
  public A setToVolumeClaimTemplates(Integer index,V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);
    if (index < 0 || index >= _visitables.get("volumeClaimTemplates").size()) { _visitables.get("volumeClaimTemplates").add(builder); } else { _visitables.get("volumeClaimTemplates").set(index, builder);}
    if (index < 0 || index >= volumeClaimTemplates.size()) { volumeClaimTemplates.add(builder); } else { volumeClaimTemplates.set(index, builder);}
     return (A)this;
  }
  public A addToVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").add(builder);this.volumeClaimTemplates.add(builder);} return (A)this;
  }
  public A addAllToVolumeClaimTemplates(Collection<V1PersistentVolumeClaim> items) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").add(builder);this.volumeClaimTemplates.add(builder);} return (A)this;
  }
  public A removeFromVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items) {
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").remove(builder);if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.remove(builder);}} return (A)this;
  }
  public A removeAllFromVolumeClaimTemplates(Collection<V1PersistentVolumeClaim> items) {
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").remove(builder);if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromVolumeClaimTemplates(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
    if (volumeClaimTemplates == null) return (A) this;
    final Iterator<V1PersistentVolumeClaimBuilder> each = volumeClaimTemplates.iterator();
    final List visitables = _visitables.get("volumeClaimTemplates");
    while (each.hasNext()) {
      V1PersistentVolumeClaimBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates != null ? build(volumeClaimTemplates) : null;
  }
  public List<V1PersistentVolumeClaim> buildVolumeClaimTemplates() {
    return volumeClaimTemplates != null ? build(volumeClaimTemplates) : null;
  }
  public V1PersistentVolumeClaim buildVolumeClaimTemplate(Integer index) {
    return this.volumeClaimTemplates.get(index).build();
  }
  public V1PersistentVolumeClaim buildFirstVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(0).build();
  }
  public V1PersistentVolumeClaim buildLastVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(volumeClaimTemplates.size() - 1).build();
  }
  public V1PersistentVolumeClaim buildMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
    for (V1PersistentVolumeClaimBuilder item: volumeClaimTemplates) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
    for (V1PersistentVolumeClaimBuilder item: volumeClaimTemplates) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) { _visitables.get("volumeClaimTemplates").removeAll(this.volumeClaimTemplates);}
    if (volumeClaimTemplates != null) {this.volumeClaimTemplates = new ArrayList(); for (V1PersistentVolumeClaim item : volumeClaimTemplates){this.addToVolumeClaimTemplates(item);}} else { this.volumeClaimTemplates = null;} return (A) this;
  }
  public A withVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.clear();}
    if (volumeClaimTemplates != null) {for (V1PersistentVolumeClaim item :volumeClaimTemplates){ this.addToVolumeClaimTemplates(item);}} return (A) this;
  }
  public Boolean hasVolumeClaimTemplates() {
    return volumeClaimTemplates != null && !volumeClaimTemplates.isEmpty();
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate() {
    return new V1StatefulSetSpecFluentImpl.VolumeClaimTemplatesNestedImpl();
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(V1PersistentVolumeClaim item) {
    return new V1StatefulSetSpecFluentImpl.VolumeClaimTemplatesNestedImpl(-1, item);
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(Integer index,V1PersistentVolumeClaim item) {
    return new V1StatefulSetSpecFluentImpl.VolumeClaimTemplatesNestedImpl(index, item);
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(Integer index) {
    if (volumeClaimTemplates.size() <= index) throw new RuntimeException("Can't edit volumeClaimTemplates. Index exceeds size.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate() {
    if (volumeClaimTemplates.size() == 0) throw new RuntimeException("Can't edit first volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(0, buildVolumeClaimTemplate(0));
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate() {
    int index = volumeClaimTemplates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }
  public V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
    int index = -1;
    for (int i=0;i<volumeClaimTemplates.size();i++) { 
    if (predicate.test(volumeClaimTemplates.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching volumeClaimTemplates. No match found.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatefulSetSpecFluentImpl that = (V1StatefulSetSpecFluentImpl) o;
    if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
    if (persistentVolumeClaimRetentionPolicy != null ? !persistentVolumeClaimRetentionPolicy.equals(that.persistentVolumeClaimRetentionPolicy) :that.persistentVolumeClaimRetentionPolicy != null) return false;
    if (podManagementPolicy != null ? !podManagementPolicy.equals(that.podManagementPolicy) :that.podManagementPolicy != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
    if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    if (serviceName != null ? !serviceName.equals(that.serviceName) :that.serviceName != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
    if (updateStrategy != null ? !updateStrategy.equals(that.updateStrategy) :that.updateStrategy != null) return false;
    if (volumeClaimTemplates != null ? !volumeClaimTemplates.equals(that.volumeClaimTemplates) :that.volumeClaimTemplates != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  persistentVolumeClaimRetentionPolicy,  podManagementPolicy,  replicas,  revisionHistoryLimit,  selector,  serviceName,  template,  updateStrategy,  volumeClaimTemplates,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (persistentVolumeClaimRetentionPolicy != null) { sb.append("persistentVolumeClaimRetentionPolicy:"); sb.append(persistentVolumeClaimRetentionPolicy + ","); }
    if (podManagementPolicy != null) { sb.append("podManagementPolicy:"); sb.append(podManagementPolicy + ","); }
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (revisionHistoryLimit != null) { sb.append("revisionHistoryLimit:"); sb.append(revisionHistoryLimit + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (serviceName != null) { sb.append("serviceName:"); sb.append(serviceName + ","); }
    if (template != null) { sb.append("template:"); sb.append(template + ","); }
    if (updateStrategy != null) { sb.append("updateStrategy:"); sb.append(updateStrategy + ","); }
    if (volumeClaimTemplates != null && !volumeClaimTemplates.isEmpty()) { sb.append("volumeClaimTemplates:"); sb.append(volumeClaimTemplates); }
    sb.append("}");
    return sb.toString();
  }
  class PersistentVolumeClaimRetentionPolicyNestedImpl<N> extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<N>> implements V1StatefulSetSpecFluent.PersistentVolumeClaimRetentionPolicyNested<N>,Nested<N>{
    PersistentVolumeClaimRetentionPolicyNestedImpl(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
      this.builder = new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(this, item);
    }
    PersistentVolumeClaimRetentionPolicyNestedImpl() {
      this.builder = new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(this);
    }
    V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder builder;
    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withPersistentVolumeClaimRetentionPolicy(builder.build());
    }
    public N endPersistentVolumeClaimRetentionPolicy() {
      return and();
    }
    
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1StatefulSetSpecFluent.SelectorNested<N>> implements V1StatefulSetSpecFluent.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1StatefulSetSpecFluent.TemplateNested<N>> implements V1StatefulSetSpecFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  class UpdateStrategyNestedImpl<N> extends V1StatefulSetUpdateStrategyFluentImpl<V1StatefulSetSpecFluent.UpdateStrategyNested<N>> implements V1StatefulSetSpecFluent.UpdateStrategyNested<N>,Nested<N>{
    UpdateStrategyNestedImpl(V1StatefulSetUpdateStrategy item) {
      this.builder = new V1StatefulSetUpdateStrategyBuilder(this, item);
    }
    UpdateStrategyNestedImpl() {
      this.builder = new V1StatefulSetUpdateStrategyBuilder(this);
    }
    V1StatefulSetUpdateStrategyBuilder builder;
    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }
    public N endUpdateStrategy() {
      return and();
    }
    
  }
  class VolumeClaimTemplatesNestedImpl<N> extends V1PersistentVolumeClaimFluentImpl<V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>> implements V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>,Nested<N>{
    VolumeClaimTemplatesNestedImpl(Integer index,V1PersistentVolumeClaim item) {
      this.index = index;
      this.builder = new V1PersistentVolumeClaimBuilder(this, item);
    }
    VolumeClaimTemplatesNestedImpl() {
      this.index = -1;
      this.builder = new V1PersistentVolumeClaimBuilder(this);
    }
    V1PersistentVolumeClaimBuilder builder;
    Integer index;
    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.setToVolumeClaimTemplates(index,builder.build());
    }
    public N endVolumeClaimTemplate() {
      return and();
    }
    
  }
  
}