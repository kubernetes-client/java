package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1APIResourceFluentImpl<A extends V1APIResourceFluent<A>> extends BaseFluent<A> implements V1APIResourceFluent<A>{
  public V1APIResourceFluentImpl() {
  }
  public V1APIResourceFluentImpl(V1APIResource instance) {
    this.withCategories(instance.getCategories());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespaced(instance.getNamespaced());

    this.withShortNames(instance.getShortNames());

    this.withSingularName(instance.getSingularName());

    this.withStorageVersionHash(instance.getStorageVersionHash());

    this.withVerbs(instance.getVerbs());

    this.withVersion(instance.getVersion());

  }
  private List<String> categories;
  private String group;
  private String kind;
  private String name;
  private Boolean namespaced;
  private List<String> shortNames;
  private String singularName;
  private String storageVersionHash;
  private List<String> verbs;
  private String version;
  public A addToCategories(Integer index,String item) {
    if (this.categories == null) {this.categories = new ArrayList<String>();}
    this.categories.add(index, item);
    return (A)this;
  }
  public A setToCategories(Integer index,String item) {
    if (this.categories == null) {this.categories = new ArrayList<String>();}
    this.categories.set(index, item); return (A)this;
  }
  public A addToCategories(java.lang.String... items) {
    if (this.categories == null) {this.categories = new ArrayList<String>();}
    for (String item : items) {this.categories.add(item);} return (A)this;
  }
  public A addAllToCategories(Collection<String> items) {
    if (this.categories == null) {this.categories = new ArrayList<String>();}
    for (String item : items) {this.categories.add(item);} return (A)this;
  }
  public A removeFromCategories(java.lang.String... items) {
    for (String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
  }
  public A removeAllFromCategories(Collection<String> items) {
    for (String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
  }
  public List<String> getCategories() {
    return this.categories;
  }
  public String getCategory(Integer index) {
    return this.categories.get(index);
  }
  public String getFirstCategory() {
    return this.categories.get(0);
  }
  public String getLastCategory() {
    return this.categories.get(categories.size() - 1);
  }
  public String getMatchingCategory(Predicate<String> predicate) {
    for (String item: categories) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingCategory(Predicate<String> predicate) {
    for (String item: categories) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCategories(List<String> categories) {
    if (categories != null) {this.categories = new ArrayList(); for (String item : categories){this.addToCategories(item);}} else { this.categories = null;} return (A) this;
  }
  public A withCategories(java.lang.String... categories) {
    if (this.categories != null) {this.categories.clear();}
    if (categories != null) {for (String item :categories){ this.addToCategories(item);}} return (A) this;
  }
  public Boolean hasCategories() {
    return categories != null && !categories.isEmpty();
  }
  public String getGroup() {
    return this.group;
  }
  public A withGroup(String group) {
    this.group=group; return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Boolean getNamespaced() {
    return this.namespaced;
  }
  public A withNamespaced(Boolean namespaced) {
    this.namespaced=namespaced; return (A) this;
  }
  public Boolean hasNamespaced() {
    return this.namespaced != null;
  }
  public A addToShortNames(Integer index,String item) {
    if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
    this.shortNames.add(index, item);
    return (A)this;
  }
  public A setToShortNames(Integer index,String item) {
    if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
    this.shortNames.set(index, item); return (A)this;
  }
  public A addToShortNames(java.lang.String... items) {
    if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
    for (String item : items) {this.shortNames.add(item);} return (A)this;
  }
  public A addAllToShortNames(Collection<String> items) {
    if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
    for (String item : items) {this.shortNames.add(item);} return (A)this;
  }
  public A removeFromShortNames(java.lang.String... items) {
    for (String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
  }
  public A removeAllFromShortNames(Collection<String> items) {
    for (String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
  }
  public List<String> getShortNames() {
    return this.shortNames;
  }
  public String getShortName(Integer index) {
    return this.shortNames.get(index);
  }
  public String getFirstShortName() {
    return this.shortNames.get(0);
  }
  public String getLastShortName() {
    return this.shortNames.get(shortNames.size() - 1);
  }
  public String getMatchingShortName(Predicate<String> predicate) {
    for (String item: shortNames) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingShortName(Predicate<String> predicate) {
    for (String item: shortNames) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withShortNames(List<String> shortNames) {
    if (shortNames != null) {this.shortNames = new ArrayList(); for (String item : shortNames){this.addToShortNames(item);}} else { this.shortNames = null;} return (A) this;
  }
  public A withShortNames(java.lang.String... shortNames) {
    if (this.shortNames != null) {this.shortNames.clear();}
    if (shortNames != null) {for (String item :shortNames){ this.addToShortNames(item);}} return (A) this;
  }
  public Boolean hasShortNames() {
    return shortNames != null && !shortNames.isEmpty();
  }
  public String getSingularName() {
    return this.singularName;
  }
  public A withSingularName(String singularName) {
    this.singularName=singularName; return (A) this;
  }
  public Boolean hasSingularName() {
    return this.singularName != null;
  }
  public String getStorageVersionHash() {
    return this.storageVersionHash;
  }
  public A withStorageVersionHash(String storageVersionHash) {
    this.storageVersionHash=storageVersionHash; return (A) this;
  }
  public Boolean hasStorageVersionHash() {
    return this.storageVersionHash != null;
  }
  public A addToVerbs(Integer index,String item) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    this.verbs.add(index, item);
    return (A)this;
  }
  public A setToVerbs(Integer index,String item) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    this.verbs.set(index, item); return (A)this;
  }
  public A addToVerbs(java.lang.String... items) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    for (String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    for (String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A removeFromVerbs(java.lang.String... items) {
    for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public A removeAllFromVerbs(Collection<String> items) {
    for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public List<String> getVerbs() {
    return this.verbs;
  }
  public String getVerb(Integer index) {
    return this.verbs.get(index);
  }
  public String getFirstVerb() {
    return this.verbs.get(0);
  }
  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  public String getMatchingVerb(Predicate<String> predicate) {
    for (String item: verbs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingVerb(Predicate<String> predicate) {
    for (String item: verbs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVerbs(List<String> verbs) {
    if (verbs != null) {this.verbs = new ArrayList(); for (String item : verbs){this.addToVerbs(item);}} else { this.verbs = null;} return (A) this;
  }
  public A withVerbs(java.lang.String... verbs) {
    if (this.verbs != null) {this.verbs.clear();}
    if (verbs != null) {for (String item :verbs){ this.addToVerbs(item);}} return (A) this;
  }
  public Boolean hasVerbs() {
    return verbs != null && !verbs.isEmpty();
  }
  public String getVersion() {
    return this.version;
  }
  public A withVersion(String version) {
    this.version=version; return (A) this;
  }
  public Boolean hasVersion() {
    return this.version != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIResourceFluentImpl that = (V1APIResourceFluentImpl) o;
    if (categories != null ? !categories.equals(that.categories) :that.categories != null) return false;
    if (group != null ? !group.equals(that.group) :that.group != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespaced != null ? !namespaced.equals(that.namespaced) :that.namespaced != null) return false;
    if (shortNames != null ? !shortNames.equals(that.shortNames) :that.shortNames != null) return false;
    if (singularName != null ? !singularName.equals(that.singularName) :that.singularName != null) return false;
    if (storageVersionHash != null ? !storageVersionHash.equals(that.storageVersionHash) :that.storageVersionHash != null) return false;
    if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
    if (version != null ? !version.equals(that.version) :that.version != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(categories,  group,  kind,  name,  namespaced,  shortNames,  singularName,  storageVersionHash,  verbs,  version,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (categories != null && !categories.isEmpty()) { sb.append("categories:"); sb.append(categories + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespaced != null) { sb.append("namespaced:"); sb.append(namespaced + ","); }
    if (shortNames != null && !shortNames.isEmpty()) { sb.append("shortNames:"); sb.append(shortNames + ","); }
    if (singularName != null) { sb.append("singularName:"); sb.append(singularName + ","); }
    if (storageVersionHash != null) { sb.append("storageVersionHash:"); sb.append(storageVersionHash + ","); }
    if (verbs != null && !verbs.isEmpty()) { sb.append("verbs:"); sb.append(verbs + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  public A withNamespaced() {
    return withNamespaced(true);
  }
  
}