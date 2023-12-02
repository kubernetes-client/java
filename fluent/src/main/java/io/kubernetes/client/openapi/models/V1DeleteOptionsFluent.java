package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeleteOptionsFluent<A extends V1DeleteOptionsFluent<A>> extends BaseFluent<A>{
  public V1DeleteOptionsFluent() {
  }
  
  public V1DeleteOptionsFluent(V1DeleteOptions instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private List<String> dryRun;
  private Long gracePeriodSeconds;
  private String kind;
  private Boolean orphanDependents;
  private V1PreconditionsBuilder preconditions;
  private String propagationPolicy;
  
  protected void copyInstance(V1DeleteOptions instance) {
    instance = (instance != null ? instance : new V1DeleteOptions());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDryRun(instance.getDryRun());
          this.withGracePeriodSeconds(instance.getGracePeriodSeconds());
          this.withKind(instance.getKind());
          this.withOrphanDependents(instance.getOrphanDependents());
          this.withPreconditions(instance.getPreconditions());
          this.withPropagationPolicy(instance.getPropagationPolicy());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public A addToDryRun(int index,String item) {
    if (this.dryRun == null) {this.dryRun = new ArrayList<String>();}
    this.dryRun.add(index, item);
    return (A)this;
  }
  
  public A setToDryRun(int index,String item) {
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
    if (this.dryRun == null) return (A)this;
    for (String item : items) { this.dryRun.remove(item);} return (A)this;
  }
  
  public A removeAllFromDryRun(Collection<String> items) {
    if (this.dryRun == null) return (A)this;
    for (String item : items) { this.dryRun.remove(item);} return (A)this;
  }
  
  public List<String> getDryRun() {
    return this.dryRun;
  }
  
  public String getDryRun(int index) {
    return this.dryRun.get(index);
  }
  
  public String getFirstDryRun() {
    return this.dryRun.get(0);
  }
  
  public String getLastDryRun() {
    return this.dryRun.get(dryRun.size() - 1);
  }
  
  public String getMatchingDryRun(Predicate<String> predicate) {
      for (String item : dryRun) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingDryRun(Predicate<String> predicate) {
      for (String item : dryRun) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDryRun(List<String> dryRun) {
    if (dryRun != null) {
        this.dryRun = new ArrayList();
        for (String item : dryRun) {
          this.addToDryRun(item);
        }
    } else {
      this.dryRun = null;
    }
    return (A) this;
  }
  
  public A withDryRun(java.lang.String... dryRun) {
    if (this.dryRun != null) {
        this.dryRun.clear();
        _visitables.remove("dryRun");
    }
    if (dryRun != null) {
      for (String item : dryRun) {
        this.addToDryRun(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDryRun() {
    return this.dryRun != null && !this.dryRun.isEmpty();
  }
  
  public Long getGracePeriodSeconds() {
    return this.gracePeriodSeconds;
  }
  
  public A withGracePeriodSeconds(Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return (A) this;
  }
  
  public boolean hasGracePeriodSeconds() {
    return this.gracePeriodSeconds != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public Boolean getOrphanDependents() {
    return this.orphanDependents;
  }
  
  public A withOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
    return (A) this;
  }
  
  public boolean hasOrphanDependents() {
    return this.orphanDependents != null;
  }
  
  public V1Preconditions buildPreconditions() {
    return this.preconditions != null ? this.preconditions.build() : null;
  }
  
  public A withPreconditions(V1Preconditions preconditions) {
    this._visitables.remove("preconditions");
    if (preconditions != null) {
        this.preconditions = new V1PreconditionsBuilder(preconditions);
        this._visitables.get("preconditions").add(this.preconditions);
    } else {
        this.preconditions = null;
        this._visitables.get("preconditions").remove(this.preconditions);
    }
    return (A) this;
  }
  
  public boolean hasPreconditions() {
    return this.preconditions != null;
  }
  
  public PreconditionsNested<A> withNewPreconditions() {
    return new PreconditionsNested(null);
  }
  
  public PreconditionsNested<A> withNewPreconditionsLike(V1Preconditions item) {
    return new PreconditionsNested(item);
  }
  
  public PreconditionsNested<A> editPreconditions() {
    return withNewPreconditionsLike(java.util.Optional.ofNullable(buildPreconditions()).orElse(null));
  }
  
  public PreconditionsNested<A> editOrNewPreconditions() {
    return withNewPreconditionsLike(java.util.Optional.ofNullable(buildPreconditions()).orElse(new V1PreconditionsBuilder().build()));
  }
  
  public PreconditionsNested<A> editOrNewPreconditionsLike(V1Preconditions item) {
    return withNewPreconditionsLike(java.util.Optional.ofNullable(buildPreconditions()).orElse(item));
  }
  
  public String getPropagationPolicy() {
    return this.propagationPolicy;
  }
  
  public A withPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
    return (A) this;
  }
  
  public boolean hasPropagationPolicy() {
    return this.propagationPolicy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeleteOptionsFluent that = (V1DeleteOptionsFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(dryRun, that.dryRun)) return false;
    if (!java.util.Objects.equals(gracePeriodSeconds, that.gracePeriodSeconds)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(orphanDependents, that.orphanDependents)) return false;
    if (!java.util.Objects.equals(preconditions, that.preconditions)) return false;
    if (!java.util.Objects.equals(propagationPolicy, that.propagationPolicy)) return false;
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
  public class PreconditionsNested<N> extends V1PreconditionsFluent<PreconditionsNested<N>> implements Nested<N>{
    PreconditionsNested(V1Preconditions item) {
      this.builder = new V1PreconditionsBuilder(this, item);
    }
    V1PreconditionsBuilder builder;
    
    public N and() {
      return (N) V1DeleteOptionsFluent.this.withPreconditions(builder.build());
    }
    
    public N endPreconditions() {
      return and();
    }
    
  
  }

}