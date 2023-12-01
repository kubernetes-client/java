package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceQuotaSpecFluent<A extends V1ResourceQuotaSpecFluent<A>> extends BaseFluent<A>{
  public V1ResourceQuotaSpecFluent() {
  }
  
  public V1ResourceQuotaSpecFluent(V1ResourceQuotaSpec instance) {
    this.copyInstance(instance);
  }
  private Map<String,Quantity> hard;
  private V1ScopeSelectorBuilder scopeSelector;
  private List<String> scopes;
  
  protected void copyInstance(V1ResourceQuotaSpec instance) {
    instance = (instance != null ? instance : new V1ResourceQuotaSpec());
    if (instance != null) {
          this.withHard(instance.getHard());
          this.withScopeSelector(instance.getScopeSelector());
          this.withScopes(instance.getScopes());
        }
  }
  
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
    if (hard == null) {
      this.hard = null;
    } else {
      this.hard = new LinkedHashMap(hard);
    }
    return (A) this;
  }
  
  public boolean hasHard() {
    return this.hard != null;
  }
  
  public V1ScopeSelector buildScopeSelector() {
    return this.scopeSelector != null ? this.scopeSelector.build() : null;
  }
  
  public A withScopeSelector(V1ScopeSelector scopeSelector) {
    this._visitables.remove("scopeSelector");
    if (scopeSelector != null) {
        this.scopeSelector = new V1ScopeSelectorBuilder(scopeSelector);
        this._visitables.get("scopeSelector").add(this.scopeSelector);
    } else {
        this.scopeSelector = null;
        this._visitables.get("scopeSelector").remove(this.scopeSelector);
    }
    return (A) this;
  }
  
  public boolean hasScopeSelector() {
    return this.scopeSelector != null;
  }
  
  public ScopeSelectorNested<A> withNewScopeSelector() {
    return new ScopeSelectorNested(null);
  }
  
  public ScopeSelectorNested<A> withNewScopeSelectorLike(V1ScopeSelector item) {
    return new ScopeSelectorNested(item);
  }
  
  public ScopeSelectorNested<A> editScopeSelector() {
    return withNewScopeSelectorLike(java.util.Optional.ofNullable(buildScopeSelector()).orElse(null));
  }
  
  public ScopeSelectorNested<A> editOrNewScopeSelector() {
    return withNewScopeSelectorLike(java.util.Optional.ofNullable(buildScopeSelector()).orElse(new V1ScopeSelectorBuilder().build()));
  }
  
  public ScopeSelectorNested<A> editOrNewScopeSelectorLike(V1ScopeSelector item) {
    return withNewScopeSelectorLike(java.util.Optional.ofNullable(buildScopeSelector()).orElse(item));
  }
  
  public A addToScopes(int index,String item) {
    if (this.scopes == null) {this.scopes = new ArrayList<String>();}
    this.scopes.add(index, item);
    return (A)this;
  }
  
  public A setToScopes(int index,String item) {
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
    if (this.scopes == null) return (A)this;
    for (String item : items) { this.scopes.remove(item);} return (A)this;
  }
  
  public A removeAllFromScopes(Collection<String> items) {
    if (this.scopes == null) return (A)this;
    for (String item : items) { this.scopes.remove(item);} return (A)this;
  }
  
  public List<String> getScopes() {
    return this.scopes;
  }
  
  public String getScope(int index) {
    return this.scopes.get(index);
  }
  
  public String getFirstScope() {
    return this.scopes.get(0);
  }
  
  public String getLastScope() {
    return this.scopes.get(scopes.size() - 1);
  }
  
  public String getMatchingScope(Predicate<String> predicate) {
      for (String item : scopes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingScope(Predicate<String> predicate) {
      for (String item : scopes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withScopes(List<String> scopes) {
    if (scopes != null) {
        this.scopes = new ArrayList();
        for (String item : scopes) {
          this.addToScopes(item);
        }
    } else {
      this.scopes = null;
    }
    return (A) this;
  }
  
  public A withScopes(java.lang.String... scopes) {
    if (this.scopes != null) {
        this.scopes.clear();
        _visitables.remove("scopes");
    }
    if (scopes != null) {
      for (String item : scopes) {
        this.addToScopes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasScopes() {
    return this.scopes != null && !this.scopes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ResourceQuotaSpecFluent that = (V1ResourceQuotaSpecFluent) o;
    if (!java.util.Objects.equals(hard, that.hard)) return false;
    if (!java.util.Objects.equals(scopeSelector, that.scopeSelector)) return false;
    if (!java.util.Objects.equals(scopes, that.scopes)) return false;
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
  public class ScopeSelectorNested<N> extends V1ScopeSelectorFluent<ScopeSelectorNested<N>> implements Nested<N>{
    ScopeSelectorNested(V1ScopeSelector item) {
      this.builder = new V1ScopeSelectorBuilder(this, item);
    }
    V1ScopeSelectorBuilder builder;
    
    public N and() {
      return (N) V1ResourceQuotaSpecFluent.this.withScopeSelector(builder.build());
    }
    
    public N endScopeSelector() {
      return and();
    }
    
  
  }

}