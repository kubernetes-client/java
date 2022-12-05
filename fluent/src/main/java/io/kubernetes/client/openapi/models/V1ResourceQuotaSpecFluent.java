package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1ResourceQuotaSpecFluent<A extends V1ResourceQuotaSpecFluent<A>> extends Fluent<A>{
  public A addToHard(String key,Quantity value);
  public A addToHard(Map<String,Quantity> map);
  public A removeFromHard(String key);
  public A removeFromHard(Map<String,Quantity> map);
  public Map<String,Quantity> getHard();
  public <K,V>A withHard(Map<String,Quantity> hard);
  public Boolean hasHard();
  
  /**
   * This method has been deprecated, please use method buildScopeSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScopeSelector getScopeSelector();
  public V1ScopeSelector buildScopeSelector();
  public A withScopeSelector(V1ScopeSelector scopeSelector);
  public Boolean hasScopeSelector();
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector();
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(V1ScopeSelector item);
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector();
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector();
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(V1ScopeSelector item);
  public A addToScopes(Integer index,String item);
  public A setToScopes(Integer index,String item);
  public A addToScopes(java.lang.String... items);
  public A addAllToScopes(Collection<String> items);
  public A removeFromScopes(java.lang.String... items);
  public A removeAllFromScopes(Collection<String> items);
  public List<String> getScopes();
  public String getScope(Integer index);
  public String getFirstScope();
  public String getLastScope();
  public String getMatchingScope(Predicate<String> predicate);
  public Boolean hasMatchingScope(Predicate<String> predicate);
  public A withScopes(List<String> scopes);
  public A withScopes(java.lang.String... scopes);
  public Boolean hasScopes();
  public interface ScopeSelectorNested<N> extends Nested<N>,V1ScopeSelectorFluent<V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>>{
    public N and();
    public N endScopeSelector();
    
  }
  
}