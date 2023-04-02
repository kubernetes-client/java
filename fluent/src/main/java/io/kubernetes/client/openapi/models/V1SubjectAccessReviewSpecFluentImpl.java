package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SubjectAccessReviewSpecFluentImpl<A extends V1SubjectAccessReviewSpecFluent<A>> extends BaseFluent<A> implements V1SubjectAccessReviewSpecFluent<A>{
  public V1SubjectAccessReviewSpecFluentImpl() {
  }
  public V1SubjectAccessReviewSpecFluentImpl(V1SubjectAccessReviewSpec instance) {
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.withUid(instance.getUid());

    this.withUser(instance.getUser());

  }
  private Map<String,List<String>> extra;
  private List<String> groups;
  private V1NonResourceAttributesBuilder nonResourceAttributes;
  private V1ResourceAttributesBuilder resourceAttributes;
  private String uid;
  private String user;
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
    if (extra == null) { this.extra =  null;} else {this.extra = new LinkedHashMap(extra);} return (A) this;
  }
  public Boolean hasExtra() {
    return this.extra != null;
  }
  public A addToGroups(Integer index,String item) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    this.groups.add(index, item);
    return (A)this;
  }
  public A setToGroups(Integer index,String item) {
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
    for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
  }
  public A removeAllFromGroups(Collection<String> items) {
    for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
  }
  public List<String> getGroups() {
    return this.groups;
  }
  public String getGroup(Integer index) {
    return this.groups.get(index);
  }
  public String getFirstGroup() {
    return this.groups.get(0);
  }
  public String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }
  public String getMatchingGroup(Predicate<String> predicate) {
    for (String item: groups) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingGroup(Predicate<String> predicate) {
    for (String item: groups) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withGroups(List<String> groups) {
    if (groups != null) {this.groups = new ArrayList(); for (String item : groups){this.addToGroups(item);}} else { this.groups = null;} return (A) this;
  }
  public A withGroups(java.lang.String... groups) {
    if (this.groups != null) {this.groups.clear();}
    if (groups != null) {for (String item :groups){ this.addToGroups(item);}} return (A) this;
  }
  public Boolean hasGroups() {
    return groups != null && !groups.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NonResourceAttributes getNonResourceAttributes() {
    return this.nonResourceAttributes!=null ?this.nonResourceAttributes.build():null;
  }
  public V1NonResourceAttributes buildNonResourceAttributes() {
    return this.nonResourceAttributes!=null ?this.nonResourceAttributes.build():null;
  }
  public A withNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
    if (nonResourceAttributes!=null){ this.nonResourceAttributes= new V1NonResourceAttributesBuilder(nonResourceAttributes); _visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);} else { this.nonResourceAttributes = null; _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes); } return (A) this;
  }
  public Boolean hasNonResourceAttributes() {
    return this.nonResourceAttributes != null;
  }
  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes() {
    return new V1SubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl();
  }
  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return new V1SubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl(item);
  }
  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes());
  }
  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
    return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): new V1NonResourceAttributesBuilder().build());
  }
  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(V1NonResourceAttributes item) {
    return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResourceAttributes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceAttributes getResourceAttributes() {
    return this.resourceAttributes!=null ?this.resourceAttributes.build():null;
  }
  public V1ResourceAttributes buildResourceAttributes() {
    return this.resourceAttributes!=null ?this.resourceAttributes.build():null;
  }
  public A withResourceAttributes(V1ResourceAttributes resourceAttributes) {
    _visitables.get("resourceAttributes").remove(this.resourceAttributes);
    if (resourceAttributes!=null){ this.resourceAttributes= new V1ResourceAttributesBuilder(resourceAttributes); _visitables.get("resourceAttributes").add(this.resourceAttributes);} else { this.resourceAttributes = null; _visitables.get("resourceAttributes").remove(this.resourceAttributes); } return (A) this;
  }
  public Boolean hasResourceAttributes() {
    return this.resourceAttributes != null;
  }
  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes() {
    return new V1SubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl();
  }
  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(V1ResourceAttributes item) {
    return new V1SubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl(item);
  }
  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes());
  }
  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes() {
    return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): new V1ResourceAttributesBuilder().build());
  }
  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(V1ResourceAttributes item) {
    return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): item);
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public String getUser() {
    return this.user;
  }
  public A withUser(String user) {
    this.user=user; return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectAccessReviewSpecFluentImpl that = (V1SubjectAccessReviewSpecFluentImpl) o;
    if (extra != null ? !extra.equals(that.extra) :that.extra != null) return false;
    if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
    if (nonResourceAttributes != null ? !nonResourceAttributes.equals(that.nonResourceAttributes) :that.nonResourceAttributes != null) return false;
    if (resourceAttributes != null ? !resourceAttributes.equals(that.resourceAttributes) :that.resourceAttributes != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
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
  class NonResourceAttributesNestedImpl<N> extends V1NonResourceAttributesFluentImpl<V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> implements V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>,Nested<N>{
    NonResourceAttributesNestedImpl(V1NonResourceAttributes item) {
      this.builder = new V1NonResourceAttributesBuilder(this, item);
    }
    NonResourceAttributesNestedImpl() {
      this.builder = new V1NonResourceAttributesBuilder(this);
    }
    V1NonResourceAttributesBuilder builder;
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
    }
    public N endNonResourceAttributes() {
      return and();
    }
    
  }
  class ResourceAttributesNestedImpl<N> extends V1ResourceAttributesFluentImpl<V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> implements V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>,Nested<N>{
    ResourceAttributesNestedImpl(V1ResourceAttributes item) {
      this.builder = new V1ResourceAttributesBuilder(this, item);
    }
    ResourceAttributesNestedImpl() {
      this.builder = new V1ResourceAttributesBuilder(this);
    }
    V1ResourceAttributesBuilder builder;
    public N and() {
      return (N) V1SubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
    }
    public N endResourceAttributes() {
      return and();
    }
    
  }
  
}