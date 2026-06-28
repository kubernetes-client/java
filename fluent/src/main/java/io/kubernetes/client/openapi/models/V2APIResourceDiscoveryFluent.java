/*
Copyright 2026 The Kubernetes Authors.
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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2APIResourceDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V2APIResourceDiscoveryFluent<A>> extends BaseFluent<A>{

  private List<String> categories;
  private String resource;
  private V1GroupVersionKindBuilder responseKind;
  private String scope;
  private List<String> shortNames;
  private String singularResource;
  private ArrayList<V2APISubresourceDiscoveryBuilder> subresources;
  private List<String> verbs;

  public V2APIResourceDiscoveryFluent() {
  }
  
  public V2APIResourceDiscoveryFluent(V2APIResourceDiscovery instance) {
    this.copyInstance(instance);
  }

  public A addAllToCategories(Collection<String> items) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    for (String item : items) {
      this.categories.add(item);
    }
    return (A) this;
  }
  
  public A addAllToShortNames(Collection<String> items) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    for (String item : items) {
      this.shortNames.add(item);
    }
    return (A) this;
  }
  
  public A addAllToSubresources(Collection<V2APISubresourceDiscovery> items) {
    if (this.subresources == null) {
      this.subresources = new ArrayList();
    }
    for (V2APISubresourceDiscovery item : items) {
        V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
        this._visitables.get("subresources").add(builder);
        this.subresources.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }
  
  public SubresourcesNested<A> addNewSubresource() {
    return new SubresourcesNested(-1, null);
  }
  
  public SubresourcesNested<A> addNewSubresourceLike(V2APISubresourceDiscovery item) {
    return new SubresourcesNested(-1, item);
  }
  
  public A addToCategories(String... items) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    for (String item : items) {
      this.categories.add(item);
    }
    return (A) this;
  }
  
  public A addToCategories(int index,String item) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    this.categories.add(index, item);
    return (A) this;
  }
  
  public A addToShortNames(String... items) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    for (String item : items) {
      this.shortNames.add(item);
    }
    return (A) this;
  }
  
  public A addToShortNames(int index,String item) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    this.shortNames.add(index, item);
    return (A) this;
  }
  
  public A addToSubresources(V2APISubresourceDiscovery... items) {
    if (this.subresources == null) {
      this.subresources = new ArrayList();
    }
    for (V2APISubresourceDiscovery item : items) {
        V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
        this._visitables.get("subresources").add(builder);
        this.subresources.add(builder);
    }
    return (A) this;
  }
  
  public A addToSubresources(int index,V2APISubresourceDiscovery item) {
    if (this.subresources == null) {
      this.subresources = new ArrayList();
    }
    V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
    if (index < 0 || index >= this.subresources.size()) {
        this._visitables.get("subresources").add(builder);
        this.subresources.add(builder);
    } else {
        this._visitables.get("subresources").add(builder);
        this.subresources.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToVerbs(String... items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }
  
  public A addToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.add(index, item);
    return (A) this;
  }
  
  public V2APISubresourceDiscovery buildFirstSubresource() {
    return this.subresources.get(0).build();
  }
  
  public V2APISubresourceDiscovery buildLastSubresource() {
    return this.subresources.get(subresources.size() - 1).build();
  }
  
  public V2APISubresourceDiscovery buildMatchingSubresource(Predicate<V2APISubresourceDiscoveryBuilder> predicate) {
      for (V2APISubresourceDiscoveryBuilder item : subresources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1GroupVersionKind buildResponseKind() {
    return this.responseKind != null ? this.responseKind.build() : null;
  }
  
  public V2APISubresourceDiscovery buildSubresource(int index) {
    return this.subresources.get(index).build();
  }
  
  public List<V2APISubresourceDiscovery> buildSubresources() {
    return this.subresources != null ? build(subresources) : null;
  }
  
  protected void copyInstance(V2APIResourceDiscovery instance) {
    instance = instance != null ? instance : new V2APIResourceDiscovery();
    if (instance != null) {
        this.withResource(instance.getResource());
        this.withResponseKind(instance.getResponseKind());
        this.withScope(instance.getScope());
        this.withSingularResource(instance.getSingularResource());
        this.withVerbs(instance.getVerbs());
        this.withShortNames(instance.getShortNames());
        this.withCategories(instance.getCategories());
        this.withSubresources(instance.getSubresources());
    }
  }
  
  public SubresourcesNested<A> editFirstSubresource() {
    if (subresources.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "subresources"));
    }
    return this.setNewSubresourceLike(0, this.buildSubresource(0));
  }
  
  public SubresourcesNested<A> editLastSubresource() {
    int index = subresources.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "subresources"));
    }
    return this.setNewSubresourceLike(index, this.buildSubresource(index));
  }
  
  public SubresourcesNested<A> editMatchingSubresource(Predicate<V2APISubresourceDiscoveryBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < subresources.size();i++) {
      if (predicate.test(subresources.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "subresources"));
    }
    return this.setNewSubresourceLike(index, this.buildSubresource(index));
  }
  
  public ResponseKindNested<A> editOrNewResponseKind() {
    return this.withNewResponseKindLike(Optional.ofNullable(this.buildResponseKind()).orElse(new V1GroupVersionKindBuilder().build()));
  }
  
  public ResponseKindNested<A> editOrNewResponseKindLike(V1GroupVersionKind item) {
    return this.withNewResponseKindLike(Optional.ofNullable(this.buildResponseKind()).orElse(item));
  }
  
  public ResponseKindNested<A> editResponseKind() {
    return this.withNewResponseKindLike(Optional.ofNullable(this.buildResponseKind()).orElse(null));
  }
  
  public SubresourcesNested<A> editSubresource(int index) {
    if (subresources.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "subresources"));
    }
    return this.setNewSubresourceLike(index, this.buildSubresource(index));
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
    V2APIResourceDiscoveryFluent that = (V2APIResourceDiscoveryFluent) o;
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(responseKind, that.responseKind))) {
      return false;
    }
    if (!(Objects.equals(scope, that.scope))) {
      return false;
    }
    if (!(Objects.equals(singularResource, that.singularResource))) {
      return false;
    }
    if (!(Objects.equals(verbs, that.verbs))) {
      return false;
    }
    if (!(Objects.equals(shortNames, that.shortNames))) {
      return false;
    }
    if (!(Objects.equals(categories, that.categories))) {
      return false;
    }
    if (!(Objects.equals(subresources, that.subresources))) {
      return false;
    }
    return true;
  }
  
  public List<String> getCategories() {
    return this.categories;
  }
  
  public String getCategory(int index) {
    return this.categories.get(index);
  }
  
  public String getFirstCategory() {
    return this.categories.get(0);
  }
  
  public String getFirstShortName() {
    return this.shortNames.get(0);
  }
  
  public String getFirstVerb() {
    return this.verbs.get(0);
  }
  
  public String getLastCategory() {
    return this.categories.get(categories.size() - 1);
  }
  
  public String getLastShortName() {
    return this.shortNames.get(shortNames.size() - 1);
  }
  
  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  
  public String getMatchingCategory(Predicate<String> predicate) {
      for (String item : categories) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingShortName(Predicate<String> predicate) {
      for (String item : shortNames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public String getScope() {
    return this.scope;
  }
  
  public String getShortName(int index) {
    return this.shortNames.get(index);
  }
  
  public List<String> getShortNames() {
    return this.shortNames;
  }
  
  public String getSingularResource() {
    return this.singularResource;
  }
  
  public String getVerb(int index) {
    return this.verbs.get(index);
  }
  
  public List<String> getVerbs() {
    return this.verbs;
  }
  
  public boolean hasCategories() {
    return this.categories != null && !(this.categories.isEmpty());
  }
  
  public boolean hasMatchingCategory(Predicate<String> predicate) {
      for (String item : categories) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingShortName(Predicate<String> predicate) {
      for (String item : shortNames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingSubresource(Predicate<V2APISubresourceDiscoveryBuilder> predicate) {
      for (V2APISubresourceDiscoveryBuilder item : subresources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean hasResponseKind() {
    return this.responseKind != null;
  }
  
  public boolean hasScope() {
    return this.scope != null;
  }
  
  public boolean hasShortNames() {
    return this.shortNames != null && !(this.shortNames.isEmpty());
  }
  
  public boolean hasSingularResource() {
    return this.singularResource != null;
  }
  
  public boolean hasSubresources() {
    return this.subresources != null && !(this.subresources.isEmpty());
  }
  
  public boolean hasVerbs() {
    return this.verbs != null && !(this.verbs.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(resource, responseKind, scope, singularResource, verbs, shortNames, categories, subresources);
  }
  
  public A removeAllFromCategories(Collection<String> items) {
    if (this.categories == null) {
      return (A) this;
    }
    for (String item : items) {
      this.categories.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromShortNames(Collection<String> items) {
    if (this.shortNames == null) {
      return (A) this;
    }
    for (String item : items) {
      this.shortNames.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromSubresources(Collection<V2APISubresourceDiscovery> items) {
    if (this.subresources == null) {
      return (A) this;
    }
    for (V2APISubresourceDiscovery item : items) {
        V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
        _visitables.get("subresources").remove(builder);
        this.subresources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVerbs(Collection<String> items) {
    if (this.verbs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.verbs.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromCategories(String... items) {
    if (this.categories == null) {
      return (A) this;
    }
    for (String item : items) {
      this.categories.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromShortNames(String... items) {
    if (this.shortNames == null) {
      return (A) this;
    }
    for (String item : items) {
      this.shortNames.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromSubresources(V2APISubresourceDiscovery... items) {
    if (this.subresources == null) {
      return (A) this;
    }
    for (V2APISubresourceDiscovery item : items) {
        V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
        _visitables.get("subresources").remove(builder);
        this.subresources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromVerbs(String... items) {
    if (this.verbs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.verbs.remove(item);
    }
    return (A) this;
  }
  
  public A removeMatchingFromSubresources(Predicate<V2APISubresourceDiscoveryBuilder> predicate) {
    if (subresources == null) {
      return (A) this;
    }
    Iterator<V2APISubresourceDiscoveryBuilder> each = subresources.iterator();
    List visitables = this._visitables.get("subresources");
    while (each.hasNext()) {
        V2APISubresourceDiscoveryBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public SubresourcesNested<A> setNewSubresourceLike(int index,V2APISubresourceDiscovery item) {
    return new SubresourcesNested(index, item);
  }
  
  public A setToCategories(int index,String item) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    this.categories.set(index, item);
    return (A) this;
  }
  
  public A setToShortNames(int index,String item) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    this.shortNames.set(index, item);
    return (A) this;
  }
  
  public A setToSubresources(int index,V2APISubresourceDiscovery item) {
    if (this.subresources == null) {
      this.subresources = new ArrayList();
    }
    V2APISubresourceDiscoveryBuilder builder = new V2APISubresourceDiscoveryBuilder(item);
    if (index < 0 || index >= this.subresources.size()) {
        this._visitables.get("subresources").add(builder);
        this.subresources.add(builder);
    } else {
        this._visitables.get("subresources").add(builder);
        this.subresources.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
        sb.append(",");
    }
    if (!(responseKind == null)) {
        sb.append("responseKind:");
        sb.append(responseKind);
        sb.append(",");
    }
    if (!(scope == null)) {
        sb.append("scope:");
        sb.append(scope);
        sb.append(",");
    }
    if (!(singularResource == null)) {
        sb.append("singularResource:");
        sb.append(singularResource);
        sb.append(",");
    }
    if (!(verbs == null) && !(verbs.isEmpty())) {
        sb.append("verbs:");
        sb.append(verbs);
        sb.append(",");
    }
    if (!(shortNames == null) && !(shortNames.isEmpty())) {
        sb.append("shortNames:");
        sb.append(shortNames);
        sb.append(",");
    }
    if (!(categories == null) && !(categories.isEmpty())) {
        sb.append("categories:");
        sb.append(categories);
        sb.append(",");
    }
    if (!(subresources == null) && !(subresources.isEmpty())) {
        sb.append("subresources:");
        sb.append(subresources);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCategories(List<String> categories) {
    if (categories != null) {
        this.categories = new ArrayList();
        for (String item : categories) {
          this.addToCategories(item);
        }
    } else {
      this.categories = null;
    }
    return (A) this;
  }
  
  public A withCategories(String... categories) {
    if (this.categories != null) {
        this.categories.clear();
        _visitables.remove("categories");
    }
    if (categories != null) {
      for (String item : categories) {
        this.addToCategories(item);
      }
    }
    return (A) this;
  }
  
  public ResponseKindNested<A> withNewResponseKind() {
    return new ResponseKindNested(null);
  }
  
  public ResponseKindNested<A> withNewResponseKindLike(V1GroupVersionKind item) {
    return new ResponseKindNested(item);
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public A withResponseKind(V1GroupVersionKind responseKind) {
    this._visitables.remove("responseKind");
    if (responseKind != null) {
        this.responseKind = new V1GroupVersionKindBuilder(responseKind);
        this._visitables.get("responseKind").add(this.responseKind);
    } else {
        this.responseKind = null;
        this._visitables.get("responseKind").remove(this.responseKind);
    }
    return (A) this;
  }
  
  public A withScope(String scope) {
    this.scope = scope;
    return (A) this;
  }
  
  public A withShortNames(List<String> shortNames) {
    if (shortNames != null) {
        this.shortNames = new ArrayList();
        for (String item : shortNames) {
          this.addToShortNames(item);
        }
    } else {
      this.shortNames = null;
    }
    return (A) this;
  }
  
  public A withShortNames(String... shortNames) {
    if (this.shortNames != null) {
        this.shortNames.clear();
        _visitables.remove("shortNames");
    }
    if (shortNames != null) {
      for (String item : shortNames) {
        this.addToShortNames(item);
      }
    }
    return (A) this;
  }
  
  public A withSingularResource(String singularResource) {
    this.singularResource = singularResource;
    return (A) this;
  }
  
  public A withSubresources(List<V2APISubresourceDiscovery> subresources) {
    if (this.subresources != null) {
      this._visitables.get("subresources").clear();
    }
    if (subresources != null) {
        this.subresources = new ArrayList();
        for (V2APISubresourceDiscovery item : subresources) {
          this.addToSubresources(item);
        }
    } else {
      this.subresources = null;
    }
    return (A) this;
  }
  
  public A withSubresources(V2APISubresourceDiscovery... subresources) {
    if (this.subresources != null) {
        this.subresources.clear();
        _visitables.remove("subresources");
    }
    if (subresources != null) {
      for (V2APISubresourceDiscovery item : subresources) {
        this.addToSubresources(item);
      }
    }
    return (A) this;
  }
  
  public A withVerbs(List<String> verbs) {
    if (verbs != null) {
        this.verbs = new ArrayList();
        for (String item : verbs) {
          this.addToVerbs(item);
        }
    } else {
      this.verbs = null;
    }
    return (A) this;
  }
  
  public A withVerbs(String... verbs) {
    if (this.verbs != null) {
        this.verbs.clear();
        _visitables.remove("verbs");
    }
    if (verbs != null) {
      for (String item : verbs) {
        this.addToVerbs(item);
      }
    }
    return (A) this;
  }
  public class ResponseKindNested<N> extends V1GroupVersionKindFluent<ResponseKindNested<N>> implements Nested<N>{
  
    V1GroupVersionKindBuilder builder;
  
    ResponseKindNested(V1GroupVersionKind item) {
      this.builder = new V1GroupVersionKindBuilder(this, item);
    }
  
    public N and() {
      return (N) V2APIResourceDiscoveryFluent.this.withResponseKind(builder.build());
    }
    
    public N endResponseKind() {
      return and();
    }
    
  }
  public class SubresourcesNested<N> extends V2APISubresourceDiscoveryFluent<SubresourcesNested<N>> implements Nested<N>{
  
    V2APISubresourceDiscoveryBuilder builder;
    int index;
  
    SubresourcesNested(int index,V2APISubresourceDiscovery item) {
      this.index = index;
      this.builder = new V2APISubresourceDiscoveryBuilder(this, item);
    }
  
    public N and() {
      return (N) V2APIResourceDiscoveryFluent.this.setToSubresources(index, builder.build());
    }
    
    public N endSubresource() {
      return and();
    }
    
  }
}