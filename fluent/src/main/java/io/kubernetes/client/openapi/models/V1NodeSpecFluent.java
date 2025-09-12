package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeSpecFluent<A extends io.kubernetes.client.openapi.models.V1NodeSpecFluent<A>> extends BaseFluent<A>{
  public V1NodeSpecFluent() {
  }
  
  public V1NodeSpecFluent(V1NodeSpec instance) {
    this.copyInstance(instance);
  }
  private V1NodeConfigSourceBuilder configSource;
  private String externalID;
  private String podCIDR;
  private List<String> podCIDRs;
  private String providerID;
  private ArrayList<V1TaintBuilder> taints;
  private Boolean unschedulable;
  
  protected void copyInstance(V1NodeSpec instance) {
    instance = instance != null ? instance : new V1NodeSpec();
    if (instance != null) {
        this.withConfigSource(instance.getConfigSource());
        this.withExternalID(instance.getExternalID());
        this.withPodCIDR(instance.getPodCIDR());
        this.withPodCIDRs(instance.getPodCIDRs());
        this.withProviderID(instance.getProviderID());
        this.withTaints(instance.getTaints());
        this.withUnschedulable(instance.getUnschedulable());
    }
  }
  
  public V1NodeConfigSource buildConfigSource() {
    return this.configSource != null ? this.configSource.build() : null;
  }
  
  public A withConfigSource(V1NodeConfigSource configSource) {
    this._visitables.remove("configSource");
    if (configSource != null) {
        this.configSource = new V1NodeConfigSourceBuilder(configSource);
        this._visitables.get("configSource").add(this.configSource);
    } else {
        this.configSource = null;
        this._visitables.get("configSource").remove(this.configSource);
    }
    return (A) this;
  }
  
  public boolean hasConfigSource() {
    return this.configSource != null;
  }
  
  public ConfigSourceNested<A> withNewConfigSource() {
    return new ConfigSourceNested(null);
  }
  
  public ConfigSourceNested<A> withNewConfigSourceLike(V1NodeConfigSource item) {
    return new ConfigSourceNested(item);
  }
  
  public ConfigSourceNested<A> editConfigSource() {
    return this.withNewConfigSourceLike(Optional.ofNullable(this.buildConfigSource()).orElse(null));
  }
  
  public ConfigSourceNested<A> editOrNewConfigSource() {
    return this.withNewConfigSourceLike(Optional.ofNullable(this.buildConfigSource()).orElse(new V1NodeConfigSourceBuilder().build()));
  }
  
  public ConfigSourceNested<A> editOrNewConfigSourceLike(V1NodeConfigSource item) {
    return this.withNewConfigSourceLike(Optional.ofNullable(this.buildConfigSource()).orElse(item));
  }
  
  public String getExternalID() {
    return this.externalID;
  }
  
  public A withExternalID(String externalID) {
    this.externalID = externalID;
    return (A) this;
  }
  
  public boolean hasExternalID() {
    return this.externalID != null;
  }
  
  public String getPodCIDR() {
    return this.podCIDR;
  }
  
  public A withPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
    return (A) this;
  }
  
  public boolean hasPodCIDR() {
    return this.podCIDR != null;
  }
  
  public A addToPodCIDRs(int index,String item) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList();
    }
    this.podCIDRs.add(index, item);
    return (A) this;
  }
  
  public A setToPodCIDRs(int index,String item) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList();
    }
    this.podCIDRs.set(index, item);
    return (A) this;
  }
  
  public A addToPodCIDRs(String... items) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList();
    }
    for (String item : items) {
      this.podCIDRs.add(item);
    }
    return (A) this;
  }
  
  public A addAllToPodCIDRs(Collection<String> items) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList();
    }
    for (String item : items) {
      this.podCIDRs.add(item);
    }
    return (A) this;
  }
  
  public A removeFromPodCIDRs(String... items) {
    if (this.podCIDRs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.podCIDRs.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromPodCIDRs(Collection<String> items) {
    if (this.podCIDRs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.podCIDRs.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getPodCIDRs() {
    return this.podCIDRs;
  }
  
  public String getPodCIDR(int index) {
    return this.podCIDRs.get(index);
  }
  
  public String getFirstPodCIDR() {
    return this.podCIDRs.get(0);
  }
  
  public String getLastPodCIDR() {
    return this.podCIDRs.get(podCIDRs.size() - 1);
  }
  
  public String getMatchingPodCIDR(Predicate<String> predicate) {
      for (String item : podCIDRs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPodCIDR(Predicate<String> predicate) {
      for (String item : podCIDRs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPodCIDRs(List<String> podCIDRs) {
    if (podCIDRs != null) {
        this.podCIDRs = new ArrayList();
        for (String item : podCIDRs) {
          this.addToPodCIDRs(item);
        }
    } else {
      this.podCIDRs = null;
    }
    return (A) this;
  }
  
  public A withPodCIDRs(String... podCIDRs) {
    if (this.podCIDRs != null) {
        this.podCIDRs.clear();
        _visitables.remove("podCIDRs");
    }
    if (podCIDRs != null) {
      for (String item : podCIDRs) {
        this.addToPodCIDRs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPodCIDRs() {
    return this.podCIDRs != null && !(this.podCIDRs.isEmpty());
  }
  
  public String getProviderID() {
    return this.providerID;
  }
  
  public A withProviderID(String providerID) {
    this.providerID = providerID;
    return (A) this;
  }
  
  public boolean hasProviderID() {
    return this.providerID != null;
  }
  
  public A addToTaints(int index,V1Taint item) {
    if (this.taints == null) {
      this.taints = new ArrayList();
    }
    V1TaintBuilder builder = new V1TaintBuilder(item);
    if (index < 0 || index >= taints.size()) {
        _visitables.get("taints").add(builder);
        taints.add(builder);
    } else {
        _visitables.get("taints").add(builder);
        taints.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToTaints(int index,V1Taint item) {
    if (this.taints == null) {
      this.taints = new ArrayList();
    }
    V1TaintBuilder builder = new V1TaintBuilder(item);
    if (index < 0 || index >= taints.size()) {
        _visitables.get("taints").add(builder);
        taints.add(builder);
    } else {
        _visitables.get("taints").add(builder);
        taints.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToTaints(V1Taint... items) {
    if (this.taints == null) {
      this.taints = new ArrayList();
    }
    for (V1Taint item : items) {
        V1TaintBuilder builder = new V1TaintBuilder(item);
        _visitables.get("taints").add(builder);
        this.taints.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToTaints(Collection<V1Taint> items) {
    if (this.taints == null) {
      this.taints = new ArrayList();
    }
    for (V1Taint item : items) {
        V1TaintBuilder builder = new V1TaintBuilder(item);
        _visitables.get("taints").add(builder);
        this.taints.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromTaints(V1Taint... items) {
    if (this.taints == null) {
      return (A) this;
    }
    for (V1Taint item : items) {
        V1TaintBuilder builder = new V1TaintBuilder(item);
        _visitables.get("taints").remove(builder);
        this.taints.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromTaints(Collection<V1Taint> items) {
    if (this.taints == null) {
      return (A) this;
    }
    for (V1Taint item : items) {
        V1TaintBuilder builder = new V1TaintBuilder(item);
        _visitables.get("taints").remove(builder);
        this.taints.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromTaints(Predicate<V1TaintBuilder> predicate) {
    if (taints == null) {
      return (A) this;
    }
    Iterator<V1TaintBuilder> each = taints.iterator();
    List visitables = _visitables.get("taints");
    while (each.hasNext()) {
        V1TaintBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1Taint> buildTaints() {
    return this.taints != null ? build(taints) : null;
  }
  
  public V1Taint buildTaint(int index) {
    return this.taints.get(index).build();
  }
  
  public V1Taint buildFirstTaint() {
    return this.taints.get(0).build();
  }
  
  public V1Taint buildLastTaint() {
    return this.taints.get(taints.size() - 1).build();
  }
  
  public V1Taint buildMatchingTaint(Predicate<V1TaintBuilder> predicate) {
      for (V1TaintBuilder item : taints) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTaint(Predicate<V1TaintBuilder> predicate) {
      for (V1TaintBuilder item : taints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTaints(List<V1Taint> taints) {
    if (this.taints != null) {
      this._visitables.get("taints").clear();
    }
    if (taints != null) {
        this.taints = new ArrayList();
        for (V1Taint item : taints) {
          this.addToTaints(item);
        }
    } else {
      this.taints = null;
    }
    return (A) this;
  }
  
  public A withTaints(V1Taint... taints) {
    if (this.taints != null) {
        this.taints.clear();
        _visitables.remove("taints");
    }
    if (taints != null) {
      for (V1Taint item : taints) {
        this.addToTaints(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTaints() {
    return this.taints != null && !(this.taints.isEmpty());
  }
  
  public TaintsNested<A> addNewTaint() {
    return new TaintsNested(-1, null);
  }
  
  public TaintsNested<A> addNewTaintLike(V1Taint item) {
    return new TaintsNested(-1, item);
  }
  
  public TaintsNested<A> setNewTaintLike(int index,V1Taint item) {
    return new TaintsNested(index, item);
  }
  
  public TaintsNested<A> editTaint(int index) {
    if (index <= taints.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "taints"));
    }
    return this.setNewTaintLike(index, this.buildTaint(index));
  }
  
  public TaintsNested<A> editFirstTaint() {
    if (taints.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "taints"));
    }
    return this.setNewTaintLike(0, this.buildTaint(0));
  }
  
  public TaintsNested<A> editLastTaint() {
    int index = taints.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "taints"));
    }
    return this.setNewTaintLike(index, this.buildTaint(index));
  }
  
  public TaintsNested<A> editMatchingTaint(Predicate<V1TaintBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < taints.size();i++) {
      if (predicate.test(taints.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "taints"));
    }
    return this.setNewTaintLike(index, this.buildTaint(index));
  }
  
  public Boolean getUnschedulable() {
    return this.unschedulable;
  }
  
  public A withUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return (A) this;
  }
  
  public boolean hasUnschedulable() {
    return this.unschedulable != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1NodeSpecFluent that = (V1NodeSpecFluent) o;
    if (!(Objects.equals(configSource, that.configSource))) {
      return false;
    }
    if (!(Objects.equals(externalID, that.externalID))) {
      return false;
    }
    if (!(Objects.equals(podCIDR, that.podCIDR))) {
      return false;
    }
    if (!(Objects.equals(podCIDRs, that.podCIDRs))) {
      return false;
    }
    if (!(Objects.equals(providerID, that.providerID))) {
      return false;
    }
    if (!(Objects.equals(taints, that.taints))) {
      return false;
    }
    if (!(Objects.equals(unschedulable, that.unschedulable))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(configSource == null)) {
        sb.append("configSource:");
        sb.append(configSource);
        sb.append(",");
    }
    if (!(externalID == null)) {
        sb.append("externalID:");
        sb.append(externalID);
        sb.append(",");
    }
    if (!(podCIDR == null)) {
        sb.append("podCIDR:");
        sb.append(podCIDR);
        sb.append(",");
    }
    if (!(podCIDRs == null) && !(podCIDRs.isEmpty())) {
        sb.append("podCIDRs:");
        sb.append(podCIDRs);
        sb.append(",");
    }
    if (!(providerID == null)) {
        sb.append("providerID:");
        sb.append(providerID);
        sb.append(",");
    }
    if (!(taints == null) && !(taints.isEmpty())) {
        sb.append("taints:");
        sb.append(taints);
        sb.append(",");
    }
    if (!(unschedulable == null)) {
        sb.append("unschedulable:");
        sb.append(unschedulable);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withUnschedulable() {
    return withUnschedulable(true);
  }
  public class ConfigSourceNested<N> extends V1NodeConfigSourceFluent<ConfigSourceNested<N>> implements Nested<N>{
    ConfigSourceNested(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    V1NodeConfigSourceBuilder builder;
    
    public N and() {
      return (N) V1NodeSpecFluent.this.withConfigSource(builder.build());
    }
    
    public N endConfigSource() {
      return and();
    }
    
  
  }
  public class TaintsNested<N> extends V1TaintFluent<TaintsNested<N>> implements Nested<N>{
    TaintsNested(int index,V1Taint item) {
      this.index = index;
      this.builder = new V1TaintBuilder(this, item);
    }
    V1TaintBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeSpecFluent.this.setToTaints(index, builder.build());
    }
    
    public N endTaint() {
      return and();
    }
    
  
  }

}