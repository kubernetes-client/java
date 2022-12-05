package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DeleteOptionsFluent<A extends V1DeleteOptionsFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToDryRun(Integer index,String item);
  public A setToDryRun(Integer index,String item);
  public A addToDryRun(java.lang.String... items);
  public A addAllToDryRun(Collection<String> items);
  public A removeFromDryRun(java.lang.String... items);
  public A removeAllFromDryRun(Collection<String> items);
  public List<String> getDryRun();
  public String getDryRun(Integer index);
  public String getFirstDryRun();
  public String getLastDryRun();
  public String getMatchingDryRun(Predicate<String> predicate);
  public Boolean hasMatchingDryRun(Predicate<String> predicate);
  public A withDryRun(List<String> dryRun);
  public A withDryRun(java.lang.String... dryRun);
  public Boolean hasDryRun();
  public Long getGracePeriodSeconds();
  public A withGracePeriodSeconds(Long gracePeriodSeconds);
  public Boolean hasGracePeriodSeconds();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public Boolean getOrphanDependents();
  public A withOrphanDependents(Boolean orphanDependents);
  public Boolean hasOrphanDependents();
  
  /**
   * This method has been deprecated, please use method buildPreconditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Preconditions getPreconditions();
  public V1Preconditions buildPreconditions();
  public A withPreconditions(V1Preconditions preconditions);
  public Boolean hasPreconditions();
  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditions();
  public V1DeleteOptionsFluent.PreconditionsNested<A> withNewPreconditionsLike(V1Preconditions item);
  public V1DeleteOptionsFluent.PreconditionsNested<A> editPreconditions();
  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditions();
  public V1DeleteOptionsFluent.PreconditionsNested<A> editOrNewPreconditionsLike(V1Preconditions item);
  public String getPropagationPolicy();
  public A withPropagationPolicy(String propagationPolicy);
  public Boolean hasPropagationPolicy();
  public A withOrphanDependents();
  public interface PreconditionsNested<N> extends Nested<N>,V1PreconditionsFluent<V1DeleteOptionsFluent.PreconditionsNested<N>>{
    public N and();
    public N endPreconditions();
    
  }
  
}