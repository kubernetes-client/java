package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceQuotaSpecFluent<A extends io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<A>> extends BaseFluent<A>{

  private Map<String,Quantity> hard;
  private V1ScopeSelectorBuilder scopeSelector;
  private List<String> scopes;

  public V1ResourceQuotaSpecFluent() {
  }
  
  public V1ResourceQuotaSpecFluent(V1ResourceQuotaSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToScopes(Collection<String> items) {
    if (this.scopes == null) {
      this.scopes = new ArrayList();
    }
    for (String item : items) {
      this.scopes.add(item);
    }
    return (A) this;
  }
  
  public A addToHard(Map<String,Quantity> map) {
    if (this.hard == null && map != null) {
      this.hard = new LinkedHashMap();
    }
    if (map != null) {
      this.hard.putAll(map);
    }
    return (A) this;
  }
  
  public A addToHard(String key,Quantity value) {
    if (this.hard == null && key != null && value != null) {
      this.hard = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.hard.put(key, value);
    }
    return (A) this;
  }
  
  public A addToScopes(String... items) {
    if (this.scopes == null) {
      this.scopes = new ArrayList();
    }
    for (String item : items) {
      this.scopes.add(item);
    }
    return (A) this;
  }
  
  public A addToScopes(int index,String item) {
    if (this.scopes == null) {
      this.scopes = new ArrayList();
    }
    this.scopes.add(index, item);
    return (A) this;
  }
  
  public V1ScopeSelector buildScopeSelector() {
    return this.scopeSelector != null ? this.scopeSelector.build() : null;
  }
  
  protected void copyInstance(V1ResourceQuotaSpec instance) {
    instance = instance != null ? instance : new V1ResourceQuotaSpec();
    if (instance != null) {
        this.withHard(instance.getHard());
        this.withScopeSelector(instance.getScopeSelector());
        this.withScopes(instance.getScopes());
    }
  }
  
  public ScopeSelectorNested<A> editOrNewScopeSelector() {
    return this.withNewScopeSelectorLike(Optional.ofNullable(this.buildScopeSelector()).orElse(new V1ScopeSelectorBuilder().build()));
  }
  
  public ScopeSelectorNested<A> editOrNewScopeSelectorLike(V1ScopeSelector item) {
    return this.withNewScopeSelectorLike(Optional.ofNullable(this.buildScopeSelector()).orElse(item));
  }
  
  public ScopeSelectorNested<A> editScopeSelector() {
    return this.withNewScopeSelectorLike(Optional.ofNullable(this.buildScopeSelector()).orElse(null));
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
    V1ResourceQuotaSpecFluent that = (V1ResourceQuotaSpecFluent) o;
    if (!(Objects.equals(hard, that.hard))) {
      return false;
    }
    if (!(Objects.equals(scopeSelector, that.scopeSelector))) {
      return false;
    }
    if (!(Objects.equals(scopes, that.scopes))) {
      return false;
    }
    return true;
  }
  
  public String getFirstScope() {
    return this.scopes.get(0);
  }
  
  public Map<String,Quantity> getHard() {
    return this.hard;
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
  
  public String getScope(int index) {
    return this.scopes.get(index);
  }
  
  public List<String> getScopes() {
    return this.scopes;
  }
  
  public boolean hasHard() {
    return this.hard != null;
  }
  
  public boolean hasMatchingScope(Predicate<String> predicate) {
      for (String item : scopes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasScopeSelector() {
    return this.scopeSelector != null;
  }
  
  public boolean hasScopes() {
    return this.scopes != null && !(this.scopes.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(hard, scopeSelector, scopes);
  }
  
  public A removeAllFromScopes(Collection<String> items) {
    if (this.scopes == null) {
      return (A) this;
    }
    for (String item : items) {
      this.scopes.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromHard(String key) {
    if (this.hard == null) {
      return (A) this;
    }
    if (key != null && this.hard != null) {
      this.hard.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromHard(Map<String,Quantity> map) {
    if (this.hard == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.hard != null) {
          this.hard.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A removeFromScopes(String... items) {
    if (this.scopes == null) {
      return (A) this;
    }
    for (String item : items) {
      this.scopes.remove(item);
    }
    return (A) this;
  }
  
  public A setToScopes(int index,String item) {
    if (this.scopes == null) {
      this.scopes = new ArrayList();
    }
    this.scopes.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(hard == null) && !(hard.isEmpty())) {
        sb.append("hard:");
        sb.append(hard);
        sb.append(",");
    }
    if (!(scopeSelector == null)) {
        sb.append("scopeSelector:");
        sb.append(scopeSelector);
        sb.append(",");
    }
    if (!(scopes == null) && !(scopes.isEmpty())) {
        sb.append("scopes:");
        sb.append(scopes);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public <K,V>A withHard(Map<String,Quantity> hard) {
    if (hard == null) {
      this.hard = null;
    } else {
      this.hard = new LinkedHashMap(hard);
    }
    return (A) this;
  }
  
  public ScopeSelectorNested<A> withNewScopeSelector() {
    return new ScopeSelectorNested(null);
  }
  
  public ScopeSelectorNested<A> withNewScopeSelectorLike(V1ScopeSelector item) {
    return new ScopeSelectorNested(item);
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
  
  public A withScopes(String... scopes) {
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
  public class ScopeSelectorNested<N> extends V1ScopeSelectorFluent<ScopeSelectorNested<N>> implements Nested<N>{
  
    V1ScopeSelectorBuilder builder;
  
    ScopeSelectorNested(V1ScopeSelector item) {
      this.builder = new V1ScopeSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceQuotaSpecFluent.this.withScopeSelector(builder.build());
    }
    
    public N endScopeSelector() {
      return and();
    }
    
  }
}