package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public class V1SubjectAccessReviewSpecFluent<A extends V1SubjectAccessReviewSpecFluent<A>> extends BaseFluent<A>{
  public V1SubjectAccessReviewSpecFluent() {
  }
  
  public V1SubjectAccessReviewSpecFluent(V1SubjectAccessReviewSpec instance) {
    this.copyInstance(instance);
  }
  private Map<String,List<String>> extra;
  private List<String> groups;
  private V1NonResourceAttributesBuilder nonResourceAttributes;
  private V1ResourceAttributesBuilder resourceAttributes;
  private String uid;
  private String user;
  
  protected void copyInstance(V1SubjectAccessReviewSpec instance) {
    instance = (instance != null ? instance : new V1SubjectAccessReviewSpec());
    if (instance != null) {
          this.withExtra(instance.getExtra());
          this.withGroups(instance.getGroups());
          this.withNonResourceAttributes(instance.getNonResourceAttributes());
          this.withResourceAttributes(instance.getResourceAttributes());
          this.withUid(instance.getUid());
          this.withUser(instance.getUser());
        }
  }
  
  public A addToExtra(String key,List<String> value) {
    if(this.extra == null && key != null && value != null) { this.extra = new LinkedHashMap(); }
    if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
  }
  
  public A addToExtra(Map<String,List<String>> map) {
    if(this.extra == null && map != null) { this.extra = new LinkedHashMap(); }
    if(map != null) { this.extra.putAll(map);} return (A)this;
  }
  
  public A removeFromExtra(String key) {
    if(this.extra == null) { return (A) this; }
    if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
  }
  
  public A removeFromExtra(Map<String,List<String>> map) {
    if(this.extra == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
  }
  
  public Map<String,List<String>> getExtra() {
    return this.extra;
  }
  
  public <K,V>A withExtra(Map<String,List<String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new LinkedHashMap(extra);
    }
    return (A) this;
  }
  
  public boolean hasExtra() {
    return this.extra != null;
  }
  
  public A addToGroups(int index,String item) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    this.groups.add(index, item);
    return (A)this;
  }
  
  public A setToGroups(int index,String item) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    this.groups.set(index, item); return (A)this;
  }
  
  public A addToGroups(java.lang.String... items) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    for (String item : items) {this.groups.add(item);} return (A)this;
  }
  
  public A addAllToGroups(Collection<String> items) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    for (String item : items) {this.groups.add(item);} return (A)this;
  }
  
  public A removeFromGroups(java.lang.String... items) {
    if (this.groups == null) return (A)this;
    for (String item : items) { this.groups.remove(item);} return (A)this;
  }
  
  public A removeAllFromGroups(Collection<String> items) {
    if (this.groups == null) return (A)this;
    for (String item : items) { this.groups.remove(item);} return (A)this;
  }
  
  public List<String> getGroups() {
    return this.groups;
  }
  
  public String getGroup(int index) {
    return this.groups.get(index);
  }
  
  public String getFirstGroup() {
    return this.groups.get(0);
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
  
  public boolean hasMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withGroups(java.lang.String... groups) {
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
  
  public boolean hasGroups() {
    return this.groups != null && !this.groups.isEmpty();
  }
  
  public V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes != null ? this.nonResourceAttributes.build() : null;
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
  
  public boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributes() {
    return new NonResourceAttributesNested(null);
  }
  
  public NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return new NonResourceAttributesNested(item);
  }
  
  public NonResourceAttributesNested<A> editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(null));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(new V1NonResourceAttributesBuilder().build()));
  }
  
  public NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return withNewNonResourceAttributesLike(java.util.Optional.ofNullable(buildNonResourceAttributes()).orElse(item));
  }
  
  public V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes != null ? this.resourceAttributes.build() : null;
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
  
  public boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributes() {
    return new ResourceAttributesNested(null);
  }
  
  public ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item) {
    return new ResourceAttributesNested(item);
  }
  
  public ResourceAttributesNested<A> editResourceAttributes() {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(null));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(new V1ResourceAttributesBuilder().build()));
  }
  
  public ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item) {
    return withNewResourceAttributesLike(java.util.Optional.ofNullable(buildResourceAttributes()).orElse(item));
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SubjectAccessReviewSpecFluent that = (V1SubjectAccessReviewSpecFluent) o;
    if (!java.util.Objects.equals(extra, that.extra)) return false;
    if (!java.util.Objects.equals(groups, that.groups)) return false;
    if (!java.util.Objects.equals(nonResourceAttributes, that.nonResourceAttributes)) return false;
    if (!java.util.Objects.equals(resourceAttributes, that.resourceAttributes)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
    if (!java.util.Objects.equals(user, that.user)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(extra,  groups,  nonResourceAttributes,  resourceAttributes,  uid,  user,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (extra != null && !extra.isEmpty()) { sb.append("extra:"); sb.append(extra + ","); }
    if (groups != null && !groups.isEmpty()) { sb.append("groups:"); sb.append(groups + ","); }
    if (nonResourceAttributes != null) { sb.append("nonResourceAttributes:"); sb.append(nonResourceAttributes + ","); }
    if (resourceAttributes != null) { sb.append("resourceAttributes:"); sb.append(resourceAttributes + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  public class NonResourceAttributesNested<N> extends V1NonResourceAttributesFluent<NonResourceAttributesNested<N>> implements Nested<N>{
    NonResourceAttributesNested(V1NonResourceAttributes item) {
      this.builder = new V1NonResourceAttributesBuilder(this, item);
    }
    V1NonResourceAttributesBuilder builder;
    
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluent.this.withNonResourceAttributes(builder.build());
    }
    
    public N endNonResourceAttributes() {
      return and();
    }
    
  
  }
  public class ResourceAttributesNested<N> extends V1ResourceAttributesFluent<ResourceAttributesNested<N>> implements Nested<N>{
    ResourceAttributesNested(V1ResourceAttributes item) {
      this.builder = new V1ResourceAttributesBuilder(this, item);
    }
    V1ResourceAttributesBuilder builder;
    
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluent.this.withResourceAttributes(builder.build());
    }
    
    public N endResourceAttributes() {
      return and();
    }
    
  
  }

}