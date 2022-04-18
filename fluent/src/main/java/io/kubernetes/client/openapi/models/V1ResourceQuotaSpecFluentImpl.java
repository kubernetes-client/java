/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ResourceQuotaSpecFluentImpl<A extends V1ResourceQuotaSpecFluent<A>>
    extends BaseFluent<A> implements V1ResourceQuotaSpecFluent<A> {
  public V1ResourceQuotaSpecFluentImpl() {}

  public V1ResourceQuotaSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance) {
    this.withHard(instance.getHard());

    this.withScopeSelector(instance.getScopeSelector());

    this.withScopes(instance.getScopes());
  }

  private Map<String, Quantity> hard;
  private V1ScopeSelectorBuilder scopeSelector;
  private List<java.lang.String> scopes;

  public A addToHard(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.hard == null && key != null && value != null) {
      this.hard = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.hard.put(key, value);
    }
    return (A) this;
  }

  public A addToHard(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.hard == null && map != null) {
      this.hard = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.hard.putAll(map);
    }
    return (A) this;
  }

  public A removeFromHard(java.lang.String key) {
    if (this.hard == null) {
      return (A) this;
    }
    if (key != null && this.hard != null) {
      this.hard.remove(key);
    }
    return (A) this;
  }

  public A removeFromHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
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

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getHard() {
    return this.hard;
  }

  public <K, V> A withHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> hard) {
    if (hard == null) {
      this.hard = null;
    } else {
      this.hard = new java.util.LinkedHashMap(hard);
    }
    return (A) this;
  }

  public Boolean hasHard() {
    return this.hard != null;
  }

  /**
   * This method has been deprecated, please use method buildScopeSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ScopeSelector getScopeSelector() {
    return this.scopeSelector != null ? this.scopeSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelector buildScopeSelector() {
    return this.scopeSelector != null ? this.scopeSelector.build() : null;
  }

  public A withScopeSelector(io.kubernetes.client.openapi.models.V1ScopeSelector scopeSelector) {
    _visitables.get("scopeSelector").remove(this.scopeSelector);
    if (scopeSelector != null) {
      this.scopeSelector =
          new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder(scopeSelector);
      _visitables.get("scopeSelector").add(this.scopeSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScopeSelector() {
    return this.scopeSelector != null;
  }

  public V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector() {
    return new V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      withNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item) {
    return new V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editScopeSelector() {
    return withNewScopeSelectorLike(getScopeSelector());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editOrNewScopeSelector() {
    return withNewScopeSelectorLike(
        getScopeSelector() != null
            ? getScopeSelector()
            : new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A>
      editOrNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item) {
    return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector() : item);
  }

  public A addToScopes(Integer index, java.lang.String item) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<java.lang.String>();
    }
    this.scopes.add(index, item);
    return (A) this;
  }

  public A setToScopes(java.lang.Integer index, java.lang.String item) {
    if (this.scopes == null) {
      this.scopes = new java.util.ArrayList<java.lang.String>();
    }
    this.scopes.set(index, item);
    return (A) this;
  }

  public A addToScopes(java.lang.String... items) {
    if (this.scopes == null) {
      this.scopes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.scopes.add(item);
    }
    return (A) this;
  }

  public A addAllToScopes(Collection<java.lang.String> items) {
    if (this.scopes == null) {
      this.scopes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.scopes.add(item);
    }
    return (A) this;
  }

  public A removeFromScopes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.scopes != null) {
        this.scopes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromScopes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.scopes != null) {
        this.scopes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getScopes() {
    return this.scopes;
  }

  public java.lang.String getScope(java.lang.Integer index) {
    return this.scopes.get(index);
  }

  public java.lang.String getFirstScope() {
    return this.scopes.get(0);
  }

  public java.lang.String getLastScope() {
    return this.scopes.get(scopes.size() - 1);
  }

  public java.lang.String getMatchingScope(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : scopes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingScope(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : scopes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withScopes(java.util.List<java.lang.String> scopes) {
    if (scopes != null) {
      this.scopes = new java.util.ArrayList();
      for (java.lang.String item : scopes) {
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
    }
    if (scopes != null) {
      for (java.lang.String item : scopes) {
        this.addToScopes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasScopes() {
    return scopes != null && !scopes.isEmpty();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceQuotaSpecFluentImpl that = (V1ResourceQuotaSpecFluentImpl) o;
    if (hard != null ? !hard.equals(that.hard) : that.hard != null) return false;
    if (scopeSelector != null
        ? !scopeSelector.equals(that.scopeSelector)
        : that.scopeSelector != null) return false;
    if (scopes != null ? !scopes.equals(that.scopes) : that.scopes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(hard, scopeSelector, scopes, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hard != null && !hard.isEmpty()) {
      sb.append("hard:");
      sb.append(hard + ",");
    }
    if (scopeSelector != null) {
      sb.append("scopeSelector:");
      sb.append(scopeSelector + ",");
    }
    if (scopes != null && !scopes.isEmpty()) {
      sb.append("scopes:");
      sb.append(scopes);
    }
    sb.append("}");
    return sb.toString();
  }

  class ScopeSelectorNestedImpl<N>
      extends V1ScopeSelectorFluentImpl<V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<
              N>,
          Nested<N> {
    ScopeSelectorNestedImpl(V1ScopeSelector item) {
      this.builder = new V1ScopeSelectorBuilder(this, item);
    }

    ScopeSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder builder;

    public N and() {
      return (N) V1ResourceQuotaSpecFluentImpl.this.withScopeSelector(builder.build());
    }

    public N endScopeSelector() {
      return and();
    }
  }
}
