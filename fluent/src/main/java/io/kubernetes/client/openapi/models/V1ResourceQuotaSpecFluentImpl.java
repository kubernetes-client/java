package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ResourceQuotaSpecFluentImpl<A extends V1ResourceQuotaSpecFluent<A>> extends BaseFluent<A> implements V1ResourceQuotaSpecFluent<A>{
  public V1ResourceQuotaSpecFluentImpl() {
  }
  public V1ResourceQuotaSpecFluentImpl(V1ResourceQuotaSpec instance) {
    this.withHard(instance.getHard());

    this.withScopeSelector(instance.getScopeSelector());

    this.withScopes(instance.getScopes());

  }
  private Map<String,Quantity> hard;
  private V1ScopeSelectorBuilder scopeSelector;
  private List<String> scopes;
  public A addToHard(String key,Quantity value) {
    if(this.hard == null && key != null && value != null) { this.hard = new LinkedHashMap(); }
    if(key != null && value != null) {this.hard.put(key, value);} return (A)this;
  }
  public A addToHard(Map<String,Quantity> map) {
    if(this.hard == null && map != null) { this.hard = new LinkedHashMap(); }
    if(map != null) { this.hard.putAll(map);} return (A)this;
  }
  public A removeFromHard(String key) {
    if(this.hard == null) { return (A) this; }
    if(key != null && this.hard != null) {this.hard.remove(key);} return (A)this;
  }
  public A removeFromHard(Map<String,Quantity> map) {
    if(this.hard == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.hard != null){this.hard.remove(key);}}} return (A)this;
  }
  public Map<String,Quantity> getHard() {
    return this.hard;
  }
  public <K,V>A withHard(Map<String,Quantity> hard) {
    if (hard == null) { this.hard =  null;} else {this.hard = new LinkedHashMap(hard);} return (A) this;
  }
  public Boolean hasHard() {
    return this.hard != null;
  }
  
  /**
   * This method has been deprecated, please use method buildScopeSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScopeSelector getScopeSelector() {
    return this.scopeSelector!=null ?this.scopeSelector.build():null;
  }
  public V1ScopeSelector buildScopeSelector() {
    return this.scopeSelector!=null ?this.scopeSelector.build():null;
  }
  public A withScopeSelector(V1ScopeSelector scopeSelector) {
    _visitables.get("scopeSelector").remove(this.scopeSelector);
    if (scopeSelector!=null){ this.scopeSelector= new V1ScopeSelectorBuilder(scopeSelector); _visitables.get("scopeSelector").add(this.scopeSelector);} else { this.scopeSelector = null; _visitables.get("scopeSelector").remove(this.scopeSelector); } return (A) this;
  }
  public Boolean hasScopeSelector() {
    return this.scopeSelector != null;
  }
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector() {
    return new V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl();
  }
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(V1ScopeSelector item) {
    return new V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl(item);
  }
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector() {
    return withNewScopeSelectorLike(getScopeSelector());
  }
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector() {
    return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): new V1ScopeSelectorBuilder().build());
  }
  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(V1ScopeSelector item) {
    return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): item);
  }
  public A addToScopes(Integer index,String item) {
    if (this.scopes == null) {this.scopes = new ArrayList<String>();}
    this.scopes.add(index, item);
    return (A)this;
  }
  public A setToScopes(Integer index,String item) {
    if (this.scopes == null) {this.scopes = new ArrayList<String>();}
    this.scopes.set(index, item); return (A)this;
  }
  public A addToScopes(java.lang.String... items) {
    if (this.scopes == null) {this.scopes = new ArrayList<String>();}
    for (String item : items) {this.scopes.add(item);} return (A)this;
  }
  public A addAllToScopes(Collection<String> items) {
    if (this.scopes == null) {this.scopes = new ArrayList<String>();}
    for (String item : items) {this.scopes.add(item);} return (A)this;
  }
  public A removeFromScopes(java.lang.String... items) {
    for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
  }
  public A removeAllFromScopes(Collection<String> items) {
    for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
  }
  public List<String> getScopes() {
    return this.scopes;
  }
  public String getScope(Integer index) {
    return this.scopes.get(index);
  }
  public String getFirstScope() {
    return this.scopes.get(0);
  }
  public String getLastScope() {
    return this.scopes.get(scopes.size() - 1);
  }
  public String getMatchingScope(Predicate<String> predicate) {
    for (String item: scopes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingScope(Predicate<String> predicate) {
    for (String item: scopes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withScopes(List<String> scopes) {
    if (scopes != null) {this.scopes = new ArrayList(); for (String item : scopes){this.addToScopes(item);}} else { this.scopes = null;} return (A) this;
  }
  public A withScopes(java.lang.String... scopes) {
    if (this.scopes != null) {this.scopes.clear();}
    if (scopes != null) {for (String item :scopes){ this.addToScopes(item);}} return (A) this;
  }
  public Boolean hasScopes() {
    return scopes != null && !scopes.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceQuotaSpecFluentImpl that = (V1ResourceQuotaSpecFluentImpl) o;
    if (hard != null ? !hard.equals(that.hard) :that.hard != null) return false;
    if (scopeSelector != null ? !scopeSelector.equals(that.scopeSelector) :that.scopeSelector != null) return false;
    if (scopes != null ? !scopes.equals(that.scopes) :that.scopes != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hard,  scopeSelector,  scopes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hard != null && !hard.isEmpty()) { sb.append("hard:"); sb.append(hard + ","); }
    if (scopeSelector != null) { sb.append("scopeSelector:"); sb.append(scopeSelector + ","); }
    if (scopes != null && !scopes.isEmpty()) { sb.append("scopes:"); sb.append(scopes); }
    sb.append("}");
    return sb.toString();
  }
  class ScopeSelectorNestedImpl<N> extends V1ScopeSelectorFluentImpl<V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>> implements V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>,Nested<N>{
    ScopeSelectorNestedImpl(V1ScopeSelector item) {
      this.builder = new V1ScopeSelectorBuilder(this, item);
    }
    ScopeSelectorNestedImpl() {
      this.builder = new V1ScopeSelectorBuilder(this);
    }
    V1ScopeSelectorBuilder builder;
    public N and() {
      return (N) V1ResourceQuotaSpecFluentImpl.this.withScopeSelector(builder.build());
    }
    public N endScopeSelector() {
      return and();
    }
    
  }
  
}