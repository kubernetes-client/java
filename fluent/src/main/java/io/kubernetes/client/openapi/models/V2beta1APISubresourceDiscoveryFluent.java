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
public class V2beta1APISubresourceDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V2beta1APISubresourceDiscoveryFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1GroupVersionKindBuilder> acceptedTypes;
  private V1GroupVersionKindBuilder responseKind;
  private String subresource;
  private List<String> verbs;

  public V2beta1APISubresourceDiscoveryFluent() {
  }
  
  public V2beta1APISubresourceDiscoveryFluent(V2beta1APISubresourceDiscovery instance) {
    this.copyInstance(instance);
  }

  public A addAllToAcceptedTypes(Collection<V1GroupVersionKind> items) {
    if (this.acceptedTypes == null) {
      this.acceptedTypes = new ArrayList();
    }
    for (V1GroupVersionKind item : items) {
        V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.add(builder);
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
  
  public AcceptedTypesNested<A> addNewAcceptedType() {
    return new AcceptedTypesNested(-1, null);
  }
  
  public AcceptedTypesNested<A> addNewAcceptedTypeLike(V1GroupVersionKind item) {
    return new AcceptedTypesNested(-1, item);
  }
  
  public A addToAcceptedTypes(V1GroupVersionKind... items) {
    if (this.acceptedTypes == null) {
      this.acceptedTypes = new ArrayList();
    }
    for (V1GroupVersionKind item : items) {
        V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.add(builder);
    }
    return (A) this;
  }
  
  public A addToAcceptedTypes(int index,V1GroupVersionKind item) {
    if (this.acceptedTypes == null) {
      this.acceptedTypes = new ArrayList();
    }
    V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
    if (index < 0 || index >= this.acceptedTypes.size()) {
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.add(builder);
    } else {
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.add(index, builder);
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
  
  public V1GroupVersionKind buildAcceptedType(int index) {
    return this.acceptedTypes.get(index).build();
  }
  
  public List<V1GroupVersionKind> buildAcceptedTypes() {
    return this.acceptedTypes != null ? build(acceptedTypes) : null;
  }
  
  public V1GroupVersionKind buildFirstAcceptedType() {
    return this.acceptedTypes.get(0).build();
  }
  
  public V1GroupVersionKind buildLastAcceptedType() {
    return this.acceptedTypes.get(acceptedTypes.size() - 1).build();
  }
  
  public V1GroupVersionKind buildMatchingAcceptedType(Predicate<V1GroupVersionKindBuilder> predicate) {
      for (V1GroupVersionKindBuilder item : acceptedTypes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1GroupVersionKind buildResponseKind() {
    return this.responseKind != null ? this.responseKind.build() : null;
  }
  
  protected void copyInstance(V2beta1APISubresourceDiscovery instance) {
    instance = instance != null ? instance : new V2beta1APISubresourceDiscovery();
    if (instance != null) {
        this.withSubresource(instance.getSubresource());
        this.withResponseKind(instance.getResponseKind());
        this.withVerbs(instance.getVerbs());
        this.withAcceptedTypes(instance.getAcceptedTypes());
    }
  }
  
  public AcceptedTypesNested<A> editAcceptedType(int index) {
    if (acceptedTypes.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "acceptedTypes"));
    }
    return this.setNewAcceptedTypeLike(index, this.buildAcceptedType(index));
  }
  
  public AcceptedTypesNested<A> editFirstAcceptedType() {
    if (acceptedTypes.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "acceptedTypes"));
    }
    return this.setNewAcceptedTypeLike(0, this.buildAcceptedType(0));
  }
  
  public AcceptedTypesNested<A> editLastAcceptedType() {
    int index = acceptedTypes.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "acceptedTypes"));
    }
    return this.setNewAcceptedTypeLike(index, this.buildAcceptedType(index));
  }
  
  public AcceptedTypesNested<A> editMatchingAcceptedType(Predicate<V1GroupVersionKindBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < acceptedTypes.size();i++) {
      if (predicate.test(acceptedTypes.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "acceptedTypes"));
    }
    return this.setNewAcceptedTypeLike(index, this.buildAcceptedType(index));
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
    V2beta1APISubresourceDiscoveryFluent that = (V2beta1APISubresourceDiscoveryFluent) o;
    if (!(Objects.equals(subresource, that.subresource))) {
      return false;
    }
    if (!(Objects.equals(responseKind, that.responseKind))) {
      return false;
    }
    if (!(Objects.equals(verbs, that.verbs))) {
      return false;
    }
    if (!(Objects.equals(acceptedTypes, that.acceptedTypes))) {
      return false;
    }
    return true;
  }
  
  public String getFirstVerb() {
    return this.verbs.get(0);
  }
  
  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  
  public String getMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getSubresource() {
    return this.subresource;
  }
  
  public String getVerb(int index) {
    return this.verbs.get(index);
  }
  
  public List<String> getVerbs() {
    return this.verbs;
  }
  
  public boolean hasAcceptedTypes() {
    return this.acceptedTypes != null && !(this.acceptedTypes.isEmpty());
  }
  
  public boolean hasMatchingAcceptedType(Predicate<V1GroupVersionKindBuilder> predicate) {
      for (V1GroupVersionKindBuilder item : acceptedTypes) {
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
  
  public boolean hasResponseKind() {
    return this.responseKind != null;
  }
  
  public boolean hasSubresource() {
    return this.subresource != null;
  }
  
  public boolean hasVerbs() {
    return this.verbs != null && !(this.verbs.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(subresource, responseKind, verbs, acceptedTypes);
  }
  
  public A removeAllFromAcceptedTypes(Collection<V1GroupVersionKind> items) {
    if (this.acceptedTypes == null) {
      return (A) this;
    }
    for (V1GroupVersionKind item : items) {
        V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
        _visitables.get("acceptedTypes").remove(builder);
        this.acceptedTypes.remove(builder);
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
  
  public A removeFromAcceptedTypes(V1GroupVersionKind... items) {
    if (this.acceptedTypes == null) {
      return (A) this;
    }
    for (V1GroupVersionKind item : items) {
        V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
        _visitables.get("acceptedTypes").remove(builder);
        this.acceptedTypes.remove(builder);
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
  
  public A removeMatchingFromAcceptedTypes(Predicate<V1GroupVersionKindBuilder> predicate) {
    if (acceptedTypes == null) {
      return (A) this;
    }
    Iterator<V1GroupVersionKindBuilder> each = acceptedTypes.iterator();
    List visitables = this._visitables.get("acceptedTypes");
    while (each.hasNext()) {
        V1GroupVersionKindBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public AcceptedTypesNested<A> setNewAcceptedTypeLike(int index,V1GroupVersionKind item) {
    return new AcceptedTypesNested(index, item);
  }
  
  public A setToAcceptedTypes(int index,V1GroupVersionKind item) {
    if (this.acceptedTypes == null) {
      this.acceptedTypes = new ArrayList();
    }
    V1GroupVersionKindBuilder builder = new V1GroupVersionKindBuilder(item);
    if (index < 0 || index >= this.acceptedTypes.size()) {
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.add(builder);
    } else {
        this._visitables.get("acceptedTypes").add(builder);
        this.acceptedTypes.set(index, builder);
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
    if (!(subresource == null)) {
        sb.append("subresource:");
        sb.append(subresource);
        sb.append(",");
    }
    if (!(responseKind == null)) {
        sb.append("responseKind:");
        sb.append(responseKind);
        sb.append(",");
    }
    if (!(verbs == null) && !(verbs.isEmpty())) {
        sb.append("verbs:");
        sb.append(verbs);
        sb.append(",");
    }
    if (!(acceptedTypes == null) && !(acceptedTypes.isEmpty())) {
        sb.append("acceptedTypes:");
        sb.append(acceptedTypes);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAcceptedTypes(List<V1GroupVersionKind> acceptedTypes) {
    if (this.acceptedTypes != null) {
      this._visitables.get("acceptedTypes").clear();
    }
    if (acceptedTypes != null) {
        this.acceptedTypes = new ArrayList();
        for (V1GroupVersionKind item : acceptedTypes) {
          this.addToAcceptedTypes(item);
        }
    } else {
      this.acceptedTypes = null;
    }
    return (A) this;
  }
  
  public A withAcceptedTypes(V1GroupVersionKind... acceptedTypes) {
    if (this.acceptedTypes != null) {
        this.acceptedTypes.clear();
        _visitables.remove("acceptedTypes");
    }
    if (acceptedTypes != null) {
      for (V1GroupVersionKind item : acceptedTypes) {
        this.addToAcceptedTypes(item);
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
  
  public A withSubresource(String subresource) {
    this.subresource = subresource;
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
  public class AcceptedTypesNested<N> extends V1GroupVersionKindFluent<AcceptedTypesNested<N>> implements Nested<N>{
  
    V1GroupVersionKindBuilder builder;
    int index;
  
    AcceptedTypesNested(int index,V1GroupVersionKind item) {
      this.index = index;
      this.builder = new V1GroupVersionKindBuilder(this, item);
    }
  
    public N and() {
      return (N) V2beta1APISubresourceDiscoveryFluent.this.setToAcceptedTypes(index, builder.build());
    }
    
    public N endAcceptedType() {
      return and();
    }
    
  }
  public class ResponseKindNested<N> extends V1GroupVersionKindFluent<ResponseKindNested<N>> implements Nested<N>{
  
    V1GroupVersionKindBuilder builder;
  
    ResponseKindNested(V1GroupVersionKind item) {
      this.builder = new V1GroupVersionKindBuilder(this, item);
    }
  
    public N and() {
      return (N) V2beta1APISubresourceDiscoveryFluent.this.withResponseKind(builder.build());
    }
    
    public N endResponseKind() {
      return and();
    }
    
  }
}