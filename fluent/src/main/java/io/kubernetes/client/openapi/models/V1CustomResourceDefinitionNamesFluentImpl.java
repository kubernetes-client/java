package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceDefinitionNamesFluentImpl<A extends V1CustomResourceDefinitionNamesFluent<A>> extends BaseFluent<A> implements V1CustomResourceDefinitionNamesFluent<A>{
  public V1CustomResourceDefinitionNamesFluentImpl() {
  }
  public V1CustomResourceDefinitionNamesFluentImpl(V1CustomResourceDefinitionNames instance) {
    if (instance != null) {
      this.withCategories(instance.getCategories());
      this.withKind(instance.getKind());
      this.withListKind(instance.getListKind());
      this.withPlural(instance.getPlural());
      this.withShortNames(instance.getShortNames());
      this.withSingular(instance.getSingular());
    }
  }
  private List<String> categories;
  private String kind;
  private String listKind;
  private String plural;
  private List<String> shortNames;
  private String singular;
  public A addToCategories(int index,String item) {
    if (this.categories == null) {this.categories = new ArrayList<String>();}
    this.categories.add(index, item);
    return (A)this;
  }
  public A setToCategories(int index,String item) {
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
    for (String item: categories) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingCategory(Predicate<String> predicate) {
    for (String item: categories) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCategories(List<String> categories) {
    if (categories != null) {this.categories = new ArrayList(); for (String item : categories){this.addToCategories(item);}} else { this.categories = null;} return (A) this;
  }
  public A withCategories(java.lang.String... categories) {
    if (this.categories != null) {this.categories.clear(); _visitables.remove("categories"); }
    if (categories != null) {for (String item :categories){ this.addToCategories(item);}} return (A) this;
  }
  public Boolean hasCategories() {
    return categories != null && !categories.isEmpty();
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
  public String getListKind() {
    return this.listKind;
  }
  public A withListKind(String listKind) {
    this.listKind=listKind; return (A) this;
  }
  public Boolean hasListKind() {
    return this.listKind != null;
  }
  public String getPlural() {
    return this.plural;
  }
  public A withPlural(String plural) {
    this.plural=plural; return (A) this;
  }
  public Boolean hasPlural() {
    return this.plural != null;
  }
  public A addToShortNames(int index,String item) {
    if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
    this.shortNames.add(index, item);
    return (A)this;
  }
  public A setToShortNames(int index,String item) {
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
    for (String item: shortNames) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingShortName(Predicate<String> predicate) {
    for (String item: shortNames) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withShortNames(List<String> shortNames) {
    if (shortNames != null) {this.shortNames = new ArrayList(); for (String item : shortNames){this.addToShortNames(item);}} else { this.shortNames = null;} return (A) this;
  }
  public A withShortNames(java.lang.String... shortNames) {
    if (this.shortNames != null) {this.shortNames.clear(); _visitables.remove("shortNames"); }
    if (shortNames != null) {for (String item :shortNames){ this.addToShortNames(item);}} return (A) this;
  }
  public Boolean hasShortNames() {
    return shortNames != null && !shortNames.isEmpty();
  }
  public String getSingular() {
    return this.singular;
  }
  public A withSingular(String singular) {
    this.singular=singular; return (A) this;
  }
  public Boolean hasSingular() {
    return this.singular != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceDefinitionNamesFluentImpl that = (V1CustomResourceDefinitionNamesFluentImpl) o;
    if (!java.util.Objects.equals(categories, that.categories)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(listKind, that.listKind)) return false;

    if (!java.util.Objects.equals(plural, that.plural)) return false;

    if (!java.util.Objects.equals(shortNames, that.shortNames)) return false;

    if (!java.util.Objects.equals(singular, that.singular)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(categories,  kind,  listKind,  plural,  shortNames,  singular,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (categories != null && !categories.isEmpty()) { sb.append("categories:"); sb.append(categories + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (listKind != null) { sb.append("listKind:"); sb.append(listKind + ","); }
    if (plural != null) { sb.append("plural:"); sb.append(plural + ","); }
    if (shortNames != null && !shortNames.isEmpty()) { sb.append("shortNames:"); sb.append(shortNames + ","); }
    if (singular != null) { sb.append("singular:"); sb.append(singular); }
    sb.append("}");
    return sb.toString();
  }
  
}