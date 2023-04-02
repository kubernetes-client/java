package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1DeleteOptionsFluentImpl<A extends V1DeleteOptionsFluent<A>> extends BaseFluent<A> implements V1DeleteOptionsFluent<A>{
  public V1DeleteOptionsFluentImpl() {
  }
  public V1DeleteOptionsFluentImpl(V1DeleteOptions instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withDryRun(instance.getDryRun());

    this.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    this.withKind(instance.getKind());

    this.withOrphanDependents(instance.getOrphanDependents());

    this.withPreconditions(instance.getPreconditions());

    this.withPropagationPolicy(instance.getPropagationPolicy());

  }
  private String apiVersion;
  private List<String> dryRun;
  private Long gracePeriodSeconds;
  private String kind;
  private Boolean orphanDependents;
  private V1PreconditionsBuilder preconditions;
  private String propagationPolicy;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToDryRun(Integer index,String item) {
    if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
    this.dryRun.add(index, item);
    return (A)this;
  }
  public A setToDryRun(Integer index,String item) {
    if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
    this.dryRun.set(index, item); return (A)this;
  }
  public A addToDryRun(java.lang.String... items) {
    if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
    for (String item : items) {this.dryRun.add(item);} return (A)this;
  }
  public A addAllToDryRun(Collection<String> items) {
    if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
    for (String item : items) {this.dryRun.add(item);} return (A)this;
  }
  public A removeFromDryRun(java.lang.String... items) {
    for (String item : items) {if (this.dryRun!= null){ this.dryRun.remove(item);}} return (A)this;
  }
  public A removeAllFromDryRun(Collection<String> items) {
    for (String item : items) {if (this.dryRun!= null){ this.dryRun.remove(item);}} return (A)this;
  }
  public List<String> getDryRun() {
    return this.dryRun;
  }
  public String getDryRun(Integer index) {
    return this.dryRun.get(index);
  }
  public String getFirstDryRun() {
    return this.dryRun.get(0);
  }
  public String getLastDryRun() {
    return this.dryRun.get(dryRun.size() - 1);
  }
  public String getMatchingDryRun(Predicate<String> predicate) {
    for (String item: dryRun) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingDryRun(Predicate<String> predicate) {
    for (String item: dryRun) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDryRun(List<String> dryRun) {
    if (dryRun != null) {this.dryRun = new ArrayList(); for (String item : dryRun){this.addToDryRun(item);}} else { this.dryRun = null;} return (A) this;
  }
  public A withDryRun(java.lang.String... dryRun) {
    if (this.dryRun != null) {this.dryRun.clear();}
    if (dryRun != null) {for (String item :dryRun){ this.addToDryRun(item);}} return (A) this;
  }
  public Boolean hasDryRun() {
    return dryRun != null && !dryRun.isEmpty();
  }
  public Long getGracePeriodSeconds() {
    return this.gracePeriodSeconds;
  }
  public A withGracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds=gracePeriodSeconds; return (A) this;
  }
  public Boolean hasGracePeriodSeconds() {
    return this.gracePeriodSeconds != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public Boolean getOrphanDependents() {
    return this.orphanDependents;
  }
  public A withOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents=orphanDependents; return (A) this;
  }
  public Boolean hasOrphanDependents() {
    return this.orphanDependents != null;
  }
  
  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Preconditions getPreconditions() {
    return this.preconditions!=null ?this.preconditions.build():null;
  }
  public V1Preconditions buildPreconditions() {
    return this.preconditions!=null ?this.preconditions.build():null;
  }
  public A withPreconditions(V1Preconditions preconditions) {
    _visitables.get("preconditions").remove(this.preconditions);
    if (preconditions!=null){ this.preconditions= new V1PreconditionsBuilder(preconditions); _visitables.get("preconditions").add(this.preconditions);} else { this.preconditions = null; _visitables.get("preconditions").remove(this.preconditions); } return (A) this;
  }
  public Boolean hasPreconditions() {
    return this.preconditions != null;
  }
  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions() {
    return new V1DeleteOptionsFluentImpl.PreconditionsNestedImpl();
  }
  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(V1Preconditions item) {
    return new V1DeleteOptionsFluentImpl.PreconditionsNestedImpl(item);
  }
  public V1DeleteOptionsFluent.PreconditionsNested<A> editPreconditions() {
    return withNewPreconditionsLike(getPreconditions());
  }
  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions() {
    return withNewPreconditionsLike(getPreconditions() != null ? getPreconditions(): new V1PreconditionsBuilder().build());
  }
  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(V1Preconditions item) {
    return withNewPreconditionsLike(getPreconditions() != null ? getPreconditions(): item);
  }
  public String getPropagationPolicy() {
    return this.propagationPolicy;
  }
  public A withPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy=propagationPolicy; return (A) this;
  }
  public Boolean hasPropagationPolicy() {
    return this.propagationPolicy != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DeleteOptionsFluentImpl that = (V1DeleteOptionsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (dryRun != null ? !dryRun.equals(that.dryRun) :that.dryRun != null) return false;
    if (gracePeriodSeconds != null ? !gracePeriodSeconds.equals(that.gracePeriodSeconds) :that.gracePeriodSeconds != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (orphanDependents != null ? !orphanDependents.equals(that.orphanDependents) :that.orphanDependents != null) return false;
    if (preconditions != null ? !preconditions.equals(that.preconditions) :that.preconditions != null) return false;
    if (propagationPolicy != null ? !propagationPolicy.equals(that.propagationPolicy) :that.propagationPolicy != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  dryRun,  gracePeriodSeconds,  kind,  orphanDependents,  preconditions,  propagationPolicy,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (dryRun != null && !dryRun.isEmpty()) { sb.append("dryRun:"); sb.append(dryRun + ","); }
    if (gracePeriodSeconds != null) { sb.append("gracePeriodSeconds:"); sb.append(gracePeriodSeconds + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (orphanDependents != null) { sb.append("orphanDependents:"); sb.append(orphanDependents + ","); }
    if (preconditions != null) { sb.append("preconditions:"); sb.append(preconditions + ","); }
    if (propagationPolicy != null) { sb.append("propagationPolicy:"); sb.append(propagationPolicy); }
    sb.append("}");
    return sb.toString();
  }
  public A withOrphanDependents() {
    return withOrphanDependents(true);
  }
  class PreconditionsNestedImpl<N> extends V1PreconditionsFluentImpl<V1DeleteOptionsFluent.PreconditionsNested<N>> implements V1DeleteOptionsFluent.PreconditionsNested<N>,Nested<N>{
    PreconditionsNestedImpl(V1Preconditions item) {
      this.builder = new V1PreconditionsBuilder(this, item);
    }
    PreconditionsNestedImpl() {
      this.builder = new V1PreconditionsBuilder(this);
    }
    V1PreconditionsBuilder builder;
    public N and() {
      return (N) V1DeleteOptionsFluentImpl.this.withPreconditions(builder.build());
    }
    public N endPreconditions() {
      return and();
    }
    
  }
  
}