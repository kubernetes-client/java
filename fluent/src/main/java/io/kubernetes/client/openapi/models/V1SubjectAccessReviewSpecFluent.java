package io.kubernetes.client.openapi.models;

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
public class V1SubjectAccessReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<A>> extends BaseFluent<A>{

  private Map<String,List<String>> extra;
  private List<String> groups;
  private V1NonResourceAttributesBuilder nonResourceAttributes;
  private V1ResourceAttributesBuilder resourceAttributes;
  private String uid;
  private String user;

  public V1SubjectAccessReviewSpecFluent() {
  }
  
  public V1SubjectAccessReviewSpecFluent(V1SubjectAccessReviewSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToGroups(Collection<String> items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }
  
  public A addToExtra(Map<String,List<String>> map) {
    if (this.extra == null && map != null) {
      this.extra = new LinkedHashMap();
    }
    if (map != null) {
      this.extra.putAll(map);
    }
    return (A) this;
  }
  
  public A addToExtra(String key,List<String> value) {
    if (this.extra == null && key != null && value != null) {
      this.extra = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.extra.put(key, value);
    }
    return (A) this;
  }
  
  public A addToGroups(String... items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }
  
  public A addToGroups(int index,String item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    this.groups.add(index, item);
    return (A) this;
  }
  
  public V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes != null ? this.nonResourceAttributes.build() : null;
  }
  
  public V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes != null ? this.resourceAttributes.build() : null;
  }
  
  protected void copyInstance(V1SubjectAccessReviewSpec instance) {
    instance = instance != null ? instance : new V1SubjectAccessReviewSpec();
    if (instance != null) {
        this.withExtra(instance.getExtra());
        this.withGroups(instance.getGroups());
        this.withNonResourceAttributes(instance.getNonResourceAttributes());
        this.withResourceAttributes(instance.getResourceAttributes());
        this.withUid(instance.getUid());
        this.withUser(instance.getUser());
    }
  }
  
  public NonResourceAttributesNested<A> editNonResourceAttributes() {
    return this.withNewNonResourceAttributesLike(Optional.ofNullable(this.buildNonResourceAttributes()).orElse(null));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
    return this.withNewNonResourceAttributesLike(Optional.ofNullable(this.buildNonResourceAttributes()).orElse(new V1NonResourceAttributesBuilder().build()));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return this.withNewNonResourceAttributesLike(Optional.ofNullable(this.buildNonResourceAttributes()).orElse(item));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributes() {
    return this.withNewResourceAttributesLike(Optional.ofNullable(this.buildResourceAttributes()).orElse(new V1ResourceAttributesBuilder().build()));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item) {
    return this.withNewResourceAttributesLike(Optional.ofNullable(this.buildResourceAttributes()).orElse(item));
  }
  
  public ResourceAttributesNested<A> editResourceAttributes() {
    return this.withNewResourceAttributesLike(Optional.ofNullable(this.buildResourceAttributes()).orElse(null));
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
    V1SubjectAccessReviewSpecFluent that = (V1SubjectAccessReviewSpecFluent) o;
    if (!(Objects.equals(extra, that.extra))) {
      return false;
    }
    if (!(Objects.equals(groups, that.groups))) {
      return false;
    }
    if (!(Objects.equals(nonResourceAttributes, that.nonResourceAttributes))) {
      return false;
    }
    if (!(Objects.equals(resourceAttributes, that.resourceAttributes))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    return true;
  }
  
  public Map<String,List<String>> getExtra() {
    return this.extra;
  }
  
  public String getFirstGroup() {
    return this.groups.get(0);
  }
  
  public String getGroup(int index) {
    return this.groups.get(index);
  }
  
  public List<String> getGroups() {
    return this.groups;
  }
  
  public String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }
  
  public String getMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public boolean hasExtra() {
    return this.extra != null;
  }
  
  public boolean hasGroups() {
    return this.groups != null && !(this.groups.isEmpty());
  }
  
  public boolean hasMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }
  
  public boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public int hashCode() {
    return Objects.hash(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
  }
  
  public A removeAllFromGroups(Collection<String> items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.groups.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromExtra(String key) {
    if (this.extra == null) {
      return (A) this;
    }
    if (key != null && this.extra != null) {
      this.extra.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromExtra(Map<String,List<String>> map) {
    if (this.extra == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.extra != null) {
          this.extra.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A removeFromGroups(String... items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.groups.remove(item);
    }
    return (A) this;
  }
  
  public A setToGroups(int index,String item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    this.groups.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(extra == null) && !(extra.isEmpty())) {
        sb.append("extra:");
        sb.append(extra);
        sb.append(",");
    }
    if (!(groups == null) && !(groups.isEmpty())) {
        sb.append("groups:");
        sb.append(groups);
        sb.append(",");
    }
    if (!(nonResourceAttributes == null)) {
        sb.append("nonResourceAttributes:");
        sb.append(nonResourceAttributes);
        sb.append(",");
    }
    if (!(resourceAttributes == null)) {
        sb.append("resourceAttributes:");
        sb.append(resourceAttributes);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
        sb.append(",");
    }
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public <K,V>A withExtra(Map<String,List<String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new LinkedHashMap(extra);
    }
    return (A) this;
  }
  
  public A withGroups(List<String> groups) {
    if (groups != null) {
        this.groups = new ArrayList();
        for (String item : groups) {
          this.addToGroups(item);
        }
    } else {
      this.groups = null;
    }
    return (A) this;
  }
  
  public A withGroups(String... groups) {
    if (this.groups != null) {
        this.groups.clear();
        _visitables.remove("groups");
    }
    if (groups != null) {
      for (String item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributes() {
    return new NonResourceAttributesNested(null);
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return new NonResourceAttributesNested(item);
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributes() {
    return new ResourceAttributesNested(null);
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item) {
    return new ResourceAttributesNested(item);
  }
  
  public A withNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this._visitables.remove("nonResourceAttributes");
    if (nonResourceAttributes != null) {
        this.nonResourceAttributes = new V1NonResourceAttributesBuilder(nonResourceAttributes);
        this._visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);
    } else {
        this.nonResourceAttributes = null;
        this._visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
    }
    return (A) this;
  }
  
  public A withResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this._visitables.remove("resourceAttributes");
    if (resourceAttributes != null) {
        this.resourceAttributes = new V1ResourceAttributesBuilder(resourceAttributes);
        this._visitables.get("resourceAttributes").add(this.resourceAttributes);
    } else {
        this.resourceAttributes = null;
        this._visitables.get("resourceAttributes").remove(this.resourceAttributes);
    }
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  public class NonResourceAttributesNested<N> extends V1NonResourceAttributesFluent<NonResourceAttributesNested<N>> implements Nested<N>{
  
    V1NonResourceAttributesBuilder builder;
  
    NonResourceAttributesNested(V1NonResourceAttributes item) {
      this.builder = new V1NonResourceAttributesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluent.this.withNonResourceAttributes(builder.build());
    }
    
    public N endNonResourceAttributes() {
      return and();
    }
    
  }
  public class ResourceAttributesNested<N> extends V1ResourceAttributesFluent<ResourceAttributesNested<N>> implements Nested<N>{
  
    V1ResourceAttributesBuilder builder;
  
    ResourceAttributesNested(V1ResourceAttributes item) {
      this.builder = new V1ResourceAttributesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluent.this.withResourceAttributes(builder.build());
    }
    
    public N endResourceAttributes() {
      return and();
    }
    
  }
}