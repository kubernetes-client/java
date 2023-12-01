package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StatefulSetSpecFluent<A extends V1StatefulSetSpecFluent<A>> extends BaseFluent<A>{
  public V1StatefulSetSpecFluent() {
  }
  
  public V1StatefulSetSpecFluent(V1StatefulSetSpec instance) {
    this.copyInstance(instance);
  }
  private Integer minReadySeconds;
  private V1StatefulSetOrdinalsBuilder ordinals;
  private V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder persistentVolumeClaimRetentionPolicy;
  private String podManagementPolicy;
  private Integer replicas;
  private Integer revisionHistoryLimit;
  private V1LabelSelectorBuilder selector;
  private String serviceName;
  private V1PodTemplateSpecBuilder template;
  private V1StatefulSetUpdateStrategyBuilder updateStrategy;
  private ArrayList<V1PersistentVolumeClaimBuilder> volumeClaimTemplates;
  
  protected void copyInstance(V1StatefulSetSpec instance) {
    instance = (instance != null ? instance : new V1StatefulSetSpec());
    if (instance != null) {
          this.withMinReadySeconds(instance.getMinReadySeconds());
          this.withOrdinals(instance.getOrdinals());
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
  }
  
  public Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }
  
  public A withMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return (A) this;
  }
  
  public boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }
  
  public V1StatefulSetOrdinals buildOrdinals() {
    return this.ordinals != null ? this.ordinals.build() : null;
  }
  
  public A withOrdinals(V1StatefulSetOrdinals ordinals) {
    this._visitables.remove("ordinals");
    if (ordinals != null) {
        this.ordinals = new V1StatefulSetOrdinalsBuilder(ordinals);
        this._visitables.get("ordinals").add(this.ordinals);
    } else {
        this.ordinals = null;
        this._visitables.get("ordinals").remove(this.ordinals);
    }
    return (A) this;
  }
  
  public boolean hasOrdinals() {
    return this.ordinals != null;
  }
  
  public OrdinalsNested<A> withNewOrdinals() {
    return new OrdinalsNested(null);
  }
  
  public OrdinalsNested<A> withNewOrdinalsLike(V1StatefulSetOrdinals item) {
    return new OrdinalsNested(item);
  }
  
  public OrdinalsNested<A> editOrdinals() {
    return withNewOrdinalsLike(java.util.Optional.ofNullable(buildOrdinals()).orElse(null));
  }
  
  public OrdinalsNested<A> editOrNewOrdinals() {
    return withNewOrdinalsLike(java.util.Optional.ofNullable(buildOrdinals()).orElse(new V1StatefulSetOrdinalsBuilder().build()));
  }
  
  public OrdinalsNested<A> editOrNewOrdinalsLike(V1StatefulSetOrdinals item) {
    return withNewOrdinalsLike(java.util.Optional.ofNullable(buildOrdinals()).orElse(item));
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy buildPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null ? this.persistentVolumeClaimRetentionPolicy.build() : null;
  }
  
  public A withPersistentVolumeClaimRetentionPolicy(V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
    this._visitables.remove("persistentVolumeClaimRetentionPolicy");
    if (persistentVolumeClaimRetentionPolicy != null) {
        this.persistentVolumeClaimRetentionPolicy = new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(persistentVolumeClaimRetentionPolicy);
        this._visitables.get("persistentVolumeClaimRetentionPolicy").add(this.persistentVolumeClaimRetentionPolicy);
    } else {
        this.persistentVolumeClaimRetentionPolicy = null;
        this._visitables.get("persistentVolumeClaimRetentionPolicy").remove(this.persistentVolumeClaimRetentionPolicy);
    }
    return (A) this;
  }
  
  public boolean hasPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null;
  }
  
  public PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicy() {
    return new PersistentVolumeClaimRetentionPolicyNested(null);
  }
  
  public PersistentVolumeClaimRetentionPolicyNested<A> withNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
    return new PersistentVolumeClaimRetentionPolicyNested(item);
  }
  
  public PersistentVolumeClaimRetentionPolicyNested<A> editPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(java.util.Optional.ofNullable(buildPersistentVolumeClaimRetentionPolicy()).orElse(null));
  }
  
  public PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(java.util.Optional.ofNullable(buildPersistentVolumeClaimRetentionPolicy()).orElse(new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder().build()));
  }
  
  public PersistentVolumeClaimRetentionPolicyNested<A> editOrNewPersistentVolumeClaimRetentionPolicyLike(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
    return withNewPersistentVolumeClaimRetentionPolicyLike(java.util.Optional.ofNullable(buildPersistentVolumeClaimRetentionPolicy()).orElse(item));
  }
  
  public String getPodManagementPolicy() {
    return this.podManagementPolicy;
  }
  
  public A withPodManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return (A) this;
  }
  
  public boolean hasPodManagementPolicy() {
    return this.podManagementPolicy != null;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }
  
  public A withRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return (A) this;
  }
  
  public boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
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
  
  public String getServiceName() {
    return this.serviceName;
  }
  
  public A withServiceName(String serviceName) {
    this.serviceName = serviceName;
    return (A) this;
  }
  
  public boolean hasServiceName() {
    return this.serviceName != null;
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
  
  public V1StatefulSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }
  
  public A withUpdateStrategy(V1StatefulSetUpdateStrategy updateStrategy) {
    this._visitables.remove("updateStrategy");
    if (updateStrategy != null) {
        this.updateStrategy = new V1StatefulSetUpdateStrategyBuilder(updateStrategy);
        this._visitables.get("updateStrategy").add(this.updateStrategy);
    } else {
        this.updateStrategy = null;
        this._visitables.get("updateStrategy").remove(this.updateStrategy);
    }
    return (A) this;
  }
  
  public boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }
  
  public UpdateStrategyNested<A> withNewUpdateStrategy() {
    return new UpdateStrategyNested(null);
  }
  
  public UpdateStrategyNested<A> withNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item) {
    return new UpdateStrategyNested(item);
  }
  
  public UpdateStrategyNested<A> editUpdateStrategy() {
    return withNewUpdateStrategyLike(java.util.Optional.ofNullable(buildUpdateStrategy()).orElse(null));
  }
  
  public UpdateStrategyNested<A> editOrNewUpdateStrategy() {
    return withNewUpdateStrategyLike(java.util.Optional.ofNullable(buildUpdateStrategy()).orElse(new V1StatefulSetUpdateStrategyBuilder().build()));
  }
  
  public UpdateStrategyNested<A> editOrNewUpdateStrategyLike(V1StatefulSetUpdateStrategy item) {
    return withNewUpdateStrategyLike(java.util.Optional.ofNullable(buildUpdateStrategy()).orElse(item));
  }
  
  public A addToVolumeClaimTemplates(int index,V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);
    if (index < 0 || index >= volumeClaimTemplates.size()) { _visitables.get("volumeClaimTemplates").add(builder); volumeClaimTemplates.add(builder); } else { _visitables.get("volumeClaimTemplates").add(index, builder); volumeClaimTemplates.add(index, builder);}
    return (A)this;
  }
  
  public A setToVolumeClaimTemplates(int index,V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaimBuilder>();}
    V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);
    if (index < 0 || index >= volumeClaimTemplates.size()) { _visitables.get("volumeClaimTemplates").add(builder); volumeClaimTemplates.add(builder); } else { _visitables.get("volumeClaimTemplates").set(index, builder); volumeClaimTemplates.set(index, builder);}
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
    if (this.volumeClaimTemplates == null) return (A)this;
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").remove(builder); this.volumeClaimTemplates.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVolumeClaimTemplates(Collection<V1PersistentVolumeClaim> items) {
    if (this.volumeClaimTemplates == null) return (A)this;
    for (V1PersistentVolumeClaim item : items) {V1PersistentVolumeClaimBuilder builder = new V1PersistentVolumeClaimBuilder(item);_visitables.get("volumeClaimTemplates").remove(builder); this.volumeClaimTemplates.remove(builder);} return (A)this;
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
  
  public List<V1PersistentVolumeClaim> buildVolumeClaimTemplates() {
    return this.volumeClaimTemplates != null ? build(volumeClaimTemplates) : null;
  }
  
  public V1PersistentVolumeClaim buildVolumeClaimTemplate(int index) {
    return this.volumeClaimTemplates.get(index).build();
  }
  
  public V1PersistentVolumeClaim buildFirstVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(0).build();
  }
  
  public V1PersistentVolumeClaim buildLastVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(volumeClaimTemplates.size() - 1).build();
  }
  
  public V1PersistentVolumeClaim buildMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
      for (V1PersistentVolumeClaimBuilder item : volumeClaimTemplates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
      for (V1PersistentVolumeClaimBuilder item : volumeClaimTemplates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) {
      this._visitables.get("volumeClaimTemplates").clear();
    }
    if (volumeClaimTemplates != null) {
        this.volumeClaimTemplates = new ArrayList();
        for (V1PersistentVolumeClaim item : volumeClaimTemplates) {
          this.addToVolumeClaimTemplates(item);
        }
    } else {
      this.volumeClaimTemplates = null;
    }
    return (A) this;
  }
  
  public A withVolumeClaimTemplates(io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) {
        this.volumeClaimTemplates.clear();
        _visitables.remove("volumeClaimTemplates");
    }
    if (volumeClaimTemplates != null) {
      for (V1PersistentVolumeClaim item : volumeClaimTemplates) {
        this.addToVolumeClaimTemplates(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumeClaimTemplates() {
    return this.volumeClaimTemplates != null && !this.volumeClaimTemplates.isEmpty();
  }
  
  public VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate() {
    return new VolumeClaimTemplatesNested(-1, null);
  }
  
  public VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(V1PersistentVolumeClaim item) {
    return new VolumeClaimTemplatesNested(-1, item);
  }
  
  public VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(int index,V1PersistentVolumeClaim item) {
    return new VolumeClaimTemplatesNested(index, item);
  }
  
  public VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(int index) {
    if (volumeClaimTemplates.size() <= index) throw new RuntimeException("Can't edit volumeClaimTemplates. Index exceeds size.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }
  
  public VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate() {
    if (volumeClaimTemplates.size() == 0) throw new RuntimeException("Can't edit first volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(0, buildVolumeClaimTemplate(0));
  }
  
  public VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate() {
    int index = volumeClaimTemplates.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }
  
  public VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(Predicate<V1PersistentVolumeClaimBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1StatefulSetSpecFluent that = (V1StatefulSetSpecFluent) o;
    if (!java.util.Objects.equals(minReadySeconds, that.minReadySeconds)) return false;
    if (!java.util.Objects.equals(ordinals, that.ordinals)) return false;
    if (!java.util.Objects.equals(persistentVolumeClaimRetentionPolicy, that.persistentVolumeClaimRetentionPolicy)) return false;
    if (!java.util.Objects.equals(podManagementPolicy, that.podManagementPolicy)) return false;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    if (!java.util.Objects.equals(revisionHistoryLimit, that.revisionHistoryLimit)) return false;
    if (!java.util.Objects.equals(selector, that.selector)) return false;
    if (!java.util.Objects.equals(serviceName, that.serviceName)) return false;
    if (!java.util.Objects.equals(template, that.template)) return false;
    if (!java.util.Objects.equals(updateStrategy, that.updateStrategy)) return false;
    if (!java.util.Objects.equals(volumeClaimTemplates, that.volumeClaimTemplates)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds,  ordinals,  persistentVolumeClaimRetentionPolicy,  podManagementPolicy,  replicas,  revisionHistoryLimit,  selector,  serviceName,  template,  updateStrategy,  volumeClaimTemplates,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (minReadySeconds != null) { sb.append("minReadySeconds:"); sb.append(minReadySeconds + ","); }
    if (ordinals != null) { sb.append("ordinals:"); sb.append(ordinals + ","); }
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
  public class OrdinalsNested<N> extends V1StatefulSetOrdinalsFluent<OrdinalsNested<N>> implements Nested<N>{
    OrdinalsNested(V1StatefulSetOrdinals item) {
      this.builder = new V1StatefulSetOrdinalsBuilder(this, item);
    }
    V1StatefulSetOrdinalsBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.withOrdinals(builder.build());
    }
    
    public N endOrdinals() {
      return and();
    }
    
  
  }
  public class PersistentVolumeClaimRetentionPolicyNested<N> extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<PersistentVolumeClaimRetentionPolicyNested<N>> implements Nested<N>{
    PersistentVolumeClaimRetentionPolicyNested(V1StatefulSetPersistentVolumeClaimRetentionPolicy item) {
      this.builder = new V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(this, item);
    }
    V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.withPersistentVolumeClaimRetentionPolicy(builder.build());
    }
    
    public N endPersistentVolumeClaimRetentionPolicy() {
      return and();
    }
    
  
  }
  public class SelectorNested<N> extends V1LabelSelectorFluent<SelectorNested<N>> implements Nested<N>{
    SelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.withSelector(builder.build());
    }
    
    public N endSelector() {
      return and();
    }
    
  
  }
  public class TemplateNested<N> extends V1PodTemplateSpecFluent<TemplateNested<N>> implements Nested<N>{
    TemplateNested(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    V1PodTemplateSpecBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.withTemplate(builder.build());
    }
    
    public N endTemplate() {
      return and();
    }
    
  
  }
  public class UpdateStrategyNested<N> extends V1StatefulSetUpdateStrategyFluent<UpdateStrategyNested<N>> implements Nested<N>{
    UpdateStrategyNested(V1StatefulSetUpdateStrategy item) {
      this.builder = new V1StatefulSetUpdateStrategyBuilder(this, item);
    }
    V1StatefulSetUpdateStrategyBuilder builder;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.withUpdateStrategy(builder.build());
    }
    
    public N endUpdateStrategy() {
      return and();
    }
    
  
  }
  public class VolumeClaimTemplatesNested<N> extends V1PersistentVolumeClaimFluent<VolumeClaimTemplatesNested<N>> implements Nested<N>{
    VolumeClaimTemplatesNested(int index,V1PersistentVolumeClaim item) {
      this.index = index;
      this.builder = new V1PersistentVolumeClaimBuilder(this, item);
    }
    V1PersistentVolumeClaimBuilder builder;
    int index;
    
    public N and() {
      return (N) V1StatefulSetSpecFluent.this.setToVolumeClaimTemplates(index,builder.build());
    }
    
    public N endVolumeClaimTemplate() {
      return and();
    }
    
  
  }

}