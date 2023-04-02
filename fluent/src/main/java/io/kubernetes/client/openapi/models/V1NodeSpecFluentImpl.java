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
  public class V1NodeSpecFluentImpl<A extends V1NodeSpecFluent<A>> extends BaseFluent<A> implements V1NodeSpecFluent<A>{
  public V1NodeSpecFluentImpl() {
  }
  public V1NodeSpecFluentImpl(V1NodeSpec instance) {
    this.withConfigSource(instance.getConfigSource());

    this.withExternalID(instance.getExternalID());

    this.withPodCIDR(instance.getPodCIDR());

    this.withPodCIDRs(instance.getPodCIDRs());

    this.withProviderID(instance.getProviderID());

    this.withTaints(instance.getTaints());

    this.withUnschedulable(instance.getUnschedulable());

  }
  private V1NodeConfigSourceBuilder configSource;
  private String externalID;
  private String podCIDR;
  private List<String> podCIDRs;
  private String providerID;
  private ArrayList<V1TaintBuilder> taints;
  private Boolean unschedulable;
  
  /**
   * This method has been deprecated, please use method buildConfigSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getConfigSource() {
    return this.configSource!=null ?this.configSource.build():null;
  }
  public V1NodeConfigSource buildConfigSource() {
    return this.configSource!=null ?this.configSource.build():null;
  }
  public A withConfigSource(V1NodeConfigSource configSource) {
    _visitables.get("configSource").remove(this.configSource);
    if (configSource!=null){ this.configSource= new V1NodeConfigSourceBuilder(configSource); _visitables.get("configSource").add(this.configSource);} else { this.configSource = null; _visitables.get("configSource").remove(this.configSource); } return (A) this;
  }
  public Boolean hasConfigSource() {
    return this.configSource != null;
  }
  public V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSource() {
    return new V1NodeSpecFluentImpl.ConfigSourceNestedImpl();
  }
  public V1NodeSpecFluent.ConfigSourceNested<A> withNewConfigSourceLike(V1NodeConfigSource item) {
    return new V1NodeSpecFluentImpl.ConfigSourceNestedImpl(item);
  }
  public V1NodeSpecFluent.ConfigSourceNested<A> editConfigSource() {
    return withNewConfigSourceLike(getConfigSource());
  }
  public V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSource() {
    return withNewConfigSourceLike(getConfigSource() != null ? getConfigSource(): new V1NodeConfigSourceBuilder().build());
  }
  public V1NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSourceLike(V1NodeConfigSource item) {
    return withNewConfigSourceLike(getConfigSource() != null ? getConfigSource(): item);
  }
  public String getExternalID() {
    return this.externalID;
  }
  public A withExternalID(String externalID) {
    this.externalID=externalID; return (A) this;
  }
  public Boolean hasExternalID() {
    return this.externalID != null;
  }
  public String getPodCIDR() {
    return this.podCIDR;
  }
  public A withPodCIDR(String podCIDR) {
    this.podCIDR=podCIDR; return (A) this;
  }
  public Boolean hasPodCIDR() {
    return this.podCIDR != null;
  }
  public A addToPodCIDRs(Integer index,String item) {
    if (this.podCIDRs == null) {this.podCIDRs = new ArrayList<String>();}
    this.podCIDRs.add(index, item);
    return (A)this;
  }
  public A setToPodCIDRs(Integer index,String item) {
    if (this.podCIDRs == null) {this.podCIDRs = new ArrayList<String>();}
    this.podCIDRs.set(index, item); return (A)this;
  }
  public A addToPodCIDRs(java.lang.String... items) {
    if (this.podCIDRs == null) {this.podCIDRs = new ArrayList<String>();}
    for (String item : items) {this.podCIDRs.add(item);} return (A)this;
  }
  public A addAllToPodCIDRs(Collection<String> items) {
    if (this.podCIDRs == null) {this.podCIDRs = new ArrayList<String>();}
    for (String item : items) {this.podCIDRs.add(item);} return (A)this;
  }
  public A removeFromPodCIDRs(java.lang.String... items) {
    for (String item : items) {if (this.podCIDRs!= null){ this.podCIDRs.remove(item);}} return (A)this;
  }
  public A removeAllFromPodCIDRs(Collection<String> items) {
    for (String item : items) {if (this.podCIDRs!= null){ this.podCIDRs.remove(item);}} return (A)this;
  }
  public List<String> getPodCIDRs() {
    return this.podCIDRs;
  }
  public String getPodCIDR(Integer index) {
    return this.podCIDRs.get(index);
  }
  public String getFirstPodCIDR() {
    return this.podCIDRs.get(0);
  }
  public String getLastPodCIDR() {
    return this.podCIDRs.get(podCIDRs.size() - 1);
  }
  public String getMatchingPodCIDR(Predicate<String> predicate) {
    for (String item: podCIDRs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingPodCIDR(Predicate<String> predicate) {
    for (String item: podCIDRs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPodCIDRs(List<String> podCIDRs) {
    if (podCIDRs != null) {this.podCIDRs = new ArrayList(); for (String item : podCIDRs){this.addToPodCIDRs(item);}} else { this.podCIDRs = null;} return (A) this;
  }
  public A withPodCIDRs(java.lang.String... podCIDRs) {
    if (this.podCIDRs != null) {this.podCIDRs.clear();}
    if (podCIDRs != null) {for (String item :podCIDRs){ this.addToPodCIDRs(item);}} return (A) this;
  }
  public Boolean hasPodCIDRs() {
    return podCIDRs != null && !podCIDRs.isEmpty();
  }
  public String getProviderID() {
    return this.providerID;
  }
  public A withProviderID(String providerID) {
    this.providerID=providerID; return (A) this;
  }
  public Boolean hasProviderID() {
    return this.providerID != null;
  }
  public A addToTaints(Integer index,V1Taint item) {
    if (this.taints == null) {this.taints = new ArrayList<V1TaintBuilder>();}
    V1TaintBuilder builder = new V1TaintBuilder(item);_visitables.get("taints").add(index >= 0 ? index : _visitables.get("taints").size(), builder);this.taints.add(index >= 0 ? index : taints.size(), builder); return (A)this;
  }
  public A setToTaints(Integer index,V1Taint item) {
    if (this.taints == null) {this.taints = new ArrayList<V1TaintBuilder>();}
    V1TaintBuilder builder = new V1TaintBuilder(item);
    if (index < 0 || index >= _visitables.get("taints").size()) { _visitables.get("taints").add(builder); } else { _visitables.get("taints").set(index, builder);}
    if (index < 0 || index >= taints.size()) { taints.add(builder); } else { taints.set(index, builder);}
     return (A)this;
  }
  public A addToTaints(io.kubernetes.client.openapi.models.V1Taint... items) {
    if (this.taints == null) {this.taints = new ArrayList<V1TaintBuilder>();}
    for (V1Taint item : items) {V1TaintBuilder builder = new V1TaintBuilder(item);_visitables.get("taints").add(builder);this.taints.add(builder);} return (A)this;
  }
  public A addAllToTaints(Collection<V1Taint> items) {
    if (this.taints == null) {this.taints = new ArrayList<V1TaintBuilder>();}
    for (V1Taint item : items) {V1TaintBuilder builder = new V1TaintBuilder(item);_visitables.get("taints").add(builder);this.taints.add(builder);} return (A)this;
  }
  public A removeFromTaints(io.kubernetes.client.openapi.models.V1Taint... items) {
    for (V1Taint item : items) {V1TaintBuilder builder = new V1TaintBuilder(item);_visitables.get("taints").remove(builder);if (this.taints != null) {this.taints.remove(builder);}} return (A)this;
  }
  public A removeAllFromTaints(Collection<V1Taint> items) {
    for (V1Taint item : items) {V1TaintBuilder builder = new V1TaintBuilder(item);_visitables.get("taints").remove(builder);if (this.taints != null) {this.taints.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTaints(Predicate<V1TaintBuilder> predicate) {
    if (taints == null) return (A) this;
    final Iterator<V1TaintBuilder> each = taints.iterator();
    final List visitables = _visitables.get("taints");
    while (each.hasNext()) {
      V1TaintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTaints instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Taint> getTaints() {
    return taints != null ? build(taints) : null;
  }
  public List<V1Taint> buildTaints() {
    return taints != null ? build(taints) : null;
  }
  public V1Taint buildTaint(Integer index) {
    return this.taints.get(index).build();
  }
  public V1Taint buildFirstTaint() {
    return this.taints.get(0).build();
  }
  public V1Taint buildLastTaint() {
    return this.taints.get(taints.size() - 1).build();
  }
  public V1Taint buildMatchingTaint(Predicate<V1TaintBuilder> predicate) {
    for (V1TaintBuilder item: taints) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingTaint(Predicate<V1TaintBuilder> predicate) {
    for (V1TaintBuilder item: taints) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTaints(List<V1Taint> taints) {
    if (this.taints != null) { _visitables.get("taints").removeAll(this.taints);}
    if (taints != null) {this.taints = new ArrayList(); for (V1Taint item : taints){this.addToTaints(item);}} else { this.taints = null;} return (A) this;
  }
  public A withTaints(io.kubernetes.client.openapi.models.V1Taint... taints) {
    if (this.taints != null) {this.taints.clear();}
    if (taints != null) {for (V1Taint item :taints){ this.addToTaints(item);}} return (A) this;
  }
  public Boolean hasTaints() {
    return taints != null && !taints.isEmpty();
  }
  public V1NodeSpecFluent.TaintsNested<A> addNewTaint() {
    return new V1NodeSpecFluentImpl.TaintsNestedImpl();
  }
  public V1NodeSpecFluent.TaintsNested<A> addNewTaintLike(V1Taint item) {
    return new V1NodeSpecFluentImpl.TaintsNestedImpl(-1, item);
  }
  public V1NodeSpecFluent.TaintsNested<A> setNewTaintLike(Integer index,V1Taint item) {
    return new V1NodeSpecFluentImpl.TaintsNestedImpl(index, item);
  }
  public V1NodeSpecFluent.TaintsNested<A> editTaint(Integer index) {
    if (taints.size() <= index) throw new RuntimeException("Can't edit taints. Index exceeds size.");
    return setNewTaintLike(index, buildTaint(index));
  }
  public V1NodeSpecFluent.TaintsNested<A> editFirstTaint() {
    if (taints.size() == 0) throw new RuntimeException("Can't edit first taints. The list is empty.");
    return setNewTaintLike(0, buildTaint(0));
  }
  public V1NodeSpecFluent.TaintsNested<A> editLastTaint() {
    int index = taints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last taints. The list is empty.");
    return setNewTaintLike(index, buildTaint(index));
  }
  public V1NodeSpecFluent.TaintsNested<A> editMatchingTaint(Predicate<V1TaintBuilder> predicate) {
    int index = -1;
    for (int i=0;i<taints.size();i++) { 
    if (predicate.test(taints.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching taints. No match found.");
    return setNewTaintLike(index, buildTaint(index));
  }
  public Boolean getUnschedulable() {
    return this.unschedulable;
  }
  public A withUnschedulable(Boolean unschedulable) {
    this.unschedulable=unschedulable; return (A) this;
  }
  public Boolean hasUnschedulable() {
    return this.unschedulable != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSpecFluentImpl that = (V1NodeSpecFluentImpl) o;
    if (configSource != null ? !configSource.equals(that.configSource) :that.configSource != null) return false;
    if (externalID != null ? !externalID.equals(that.externalID) :that.externalID != null) return false;
    if (podCIDR != null ? !podCIDR.equals(that.podCIDR) :that.podCIDR != null) return false;
    if (podCIDRs != null ? !podCIDRs.equals(that.podCIDRs) :that.podCIDRs != null) return false;
    if (providerID != null ? !providerID.equals(that.providerID) :that.providerID != null) return false;
    if (taints != null ? !taints.equals(that.taints) :that.taints != null) return false;
    if (unschedulable != null ? !unschedulable.equals(that.unschedulable) :that.unschedulable != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(configSource,  externalID,  podCIDR,  podCIDRs,  providerID,  taints,  unschedulable,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configSource != null) { sb.append("configSource:"); sb.append(configSource + ","); }
    if (externalID != null) { sb.append("externalID:"); sb.append(externalID + ","); }
    if (podCIDR != null) { sb.append("podCIDR:"); sb.append(podCIDR + ","); }
    if (podCIDRs != null && !podCIDRs.isEmpty()) { sb.append("podCIDRs:"); sb.append(podCIDRs + ","); }
    if (providerID != null) { sb.append("providerID:"); sb.append(providerID + ","); }
    if (taints != null && !taints.isEmpty()) { sb.append("taints:"); sb.append(taints + ","); }
    if (unschedulable != null) { sb.append("unschedulable:"); sb.append(unschedulable); }
    sb.append("}");
    return sb.toString();
  }
  public A withUnschedulable() {
    return withUnschedulable(true);
  }
  class ConfigSourceNestedImpl<N> extends V1NodeConfigSourceFluentImpl<V1NodeSpecFluent.ConfigSourceNested<N>> implements V1NodeSpecFluent.ConfigSourceNested<N>,Nested<N>{
    ConfigSourceNestedImpl(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    ConfigSourceNestedImpl() {
      this.builder = new V1NodeConfigSourceBuilder(this);
    }
    V1NodeConfigSourceBuilder builder;
    public N and() {
      return (N) V1NodeSpecFluentImpl.this.withConfigSource(builder.build());
    }
    public N endConfigSource() {
      return and();
    }
    
  }
  class TaintsNestedImpl<N> extends V1TaintFluentImpl<V1NodeSpecFluent.TaintsNested<N>> implements V1NodeSpecFluent.TaintsNested<N>,Nested<N>{
    TaintsNestedImpl(Integer index,V1Taint item) {
      this.index = index;
      this.builder = new V1TaintBuilder(this, item);
    }
    TaintsNestedImpl() {
      this.index = -1;
      this.builder = new V1TaintBuilder(this);
    }
    V1TaintBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeSpecFluentImpl.this.setToTaints(index,builder.build());
    }
    public N endTaint() {
      return and();
    }
    
  }
  
}