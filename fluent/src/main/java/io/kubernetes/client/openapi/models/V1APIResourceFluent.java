package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1APIResourceFluent<A extends io.kubernetes.client.openapi.models.V1APIResourceFluent<A>> extends BaseFluent<A>{
  public V1APIResourceFluent() {
  }
  
  public V1APIResourceFluent(V1APIResource instance) {
    this.copyInstance(instance);
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
  
  protected void copyInstance(V1APIResource instance) {
    instance = instance != null ? instance : new V1APIResource();
    if (instance != null) {
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
  }
  
  public A addToCategories(int index,String item) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    this.categories.add(index, item);
    return (A) this;
  }
  
  public A setToCategories(int index,String item) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    this.categories.set(index, item);
    return (A) this;
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
  
  public A addAllToCategories(Collection<String> items) {
    if (this.categories == null) {
      this.categories = new ArrayList();
    }
    for (String item : items) {
      this.categories.add(item);
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
  
  public A removeAllFromCategories(Collection<String> items) {
    if (this.categories == null) {
      return (A) this;
    }
    for (String item : items) {
      this.categories.remove(item);
    }
    return (A) this;
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
  
  public String getLastCategory() {
    return this.categories.get(categories.size() - 1);
  }
  
  public String getMatchingCategory(Predicate<String> predicate) {
      for (String item : categories) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingCategory(Predicate<String> predicate) {
      for (String item : categories) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public boolean hasCategories() {
    return this.categories != null && !(this.categories.isEmpty());
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Boolean getNamespaced() {
    return this.namespaced;
  }
  
  public A withNamespaced(Boolean namespaced) {
    this.namespaced = namespaced;
    return (A) this;
  }
  
  public boolean hasNamespaced() {
    return this.namespaced != null;
  }
  
  public A addToShortNames(int index,String item) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    this.shortNames.add(index, item);
    return (A) this;
  }
  
  public A setToShortNames(int index,String item) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    this.shortNames.set(index, item);
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
  
  public A addAllToShortNames(Collection<String> items) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList();
    }
    for (String item : items) {
      this.shortNames.add(item);
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
  
  public A removeAllFromShortNames(Collection<String> items) {
    if (this.shortNames == null) {
      return (A) this;
    }
    for (String item : items) {
      this.shortNames.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getShortNames() {
    return this.shortNames;
  }
  
  public String getShortName(int index) {
    return this.shortNames.get(index);
  }
  
  public String getFirstShortName() {
    return this.shortNames.get(0);
  }
  
  public String getLastShortName() {
    return this.shortNames.get(shortNames.size() - 1);
  }
  
  public String getMatchingShortName(Predicate<String> predicate) {
      for (String item : shortNames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingShortName(Predicate<String> predicate) {
      for (String item : shortNames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public boolean hasShortNames() {
    return this.shortNames != null && !(this.shortNames.isEmpty());
  }
  
  public String getSingularName() {
    return this.singularName;
  }
  
  public A withSingularName(String singularName) {
    this.singularName = singularName;
    return (A) this;
  }
  
  public boolean hasSingularName() {
    return this.singularName != null;
  }
  
  public String getStorageVersionHash() {
    return this.storageVersionHash;
  }
  
  public A withStorageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
    return (A) this;
  }
  
  public boolean hasStorageVersionHash() {
    return this.storageVersionHash != null;
  }
  
  public A addToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.add(index, item);
    return (A) this;
  }
  
  public A setToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.set(index, item);
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
  
  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    for (String item : items) {
      this.verbs.add(item);
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
  
  public A removeAllFromVerbs(Collection<String> items) {
    if (this.verbs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.verbs.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getVerbs() {
    return this.verbs;
  }
  
  public String getVerb(int index) {
    return this.verbs.get(index);
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
  
  public boolean hasMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public boolean hasVerbs() {
    return this.verbs != null && !(this.verbs.isEmpty());
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
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
    V1APIResourceFluent that = (V1APIResourceFluent) o;
    if (!(Objects.equals(categories, that.categories))) {
      return false;
    }
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespaced, that.namespaced))) {
      return false;
    }
    if (!(Objects.equals(shortNames, that.shortNames))) {
      return false;
    }
    if (!(Objects.equals(singularName, that.singularName))) {
      return false;
    }
    if (!(Objects.equals(storageVersionHash, that.storageVersionHash))) {
      return false;
    }
    if (!(Objects.equals(verbs, that.verbs))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(categories, group, kind, name, namespaced, shortNames, singularName, storageVersionHash, verbs, version);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(categories == null) && !(categories.isEmpty())) {
        sb.append("categories:");
        sb.append(categories);
        sb.append(",");
    }
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespaced == null)) {
        sb.append("namespaced:");
        sb.append(namespaced);
        sb.append(",");
    }
    if (!(shortNames == null) && !(shortNames.isEmpty())) {
        sb.append("shortNames:");
        sb.append(shortNames);
        sb.append(",");
    }
    if (!(singularName == null)) {
        sb.append("singularName:");
        sb.append(singularName);
        sb.append(",");
    }
    if (!(storageVersionHash == null)) {
        sb.append("storageVersionHash:");
        sb.append(storageVersionHash);
        sb.append(",");
    }
    if (!(verbs == null) && !(verbs.isEmpty())) {
        sb.append("verbs:");
        sb.append(verbs);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNamespaced() {
    return withNamespaced(true);
  }
  

}