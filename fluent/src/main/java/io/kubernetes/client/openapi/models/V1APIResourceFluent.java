package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1APIResourceFluent<A extends V1APIResourceFluent<A>> extends Fluent<A>{
  public A addToCategories(Integer index,String item);
  public A setToCategories(Integer index,String item);
  public A addToCategories(java.lang.String... items);
  public A addAllToCategories(Collection<String> items);
  public A removeFromCategories(java.lang.String... items);
  public A removeAllFromCategories(Collection<String> items);
  public List<String> getCategories();
  public String getCategory(Integer index);
  public String getFirstCategory();
  public String getLastCategory();
  public String getMatchingCategory(Predicate<String> predicate);
  public Boolean hasMatchingCategory(Predicate<String> predicate);
  public A withCategories(List<String> categories);
  public A withCategories(java.lang.String... categories);
  public Boolean hasCategories();
  public String getGroup();
  public A withGroup(String group);
  public Boolean hasGroup();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Boolean getNamespaced();
  public A withNamespaced(Boolean namespaced);
  public Boolean hasNamespaced();
  public A addToShortNames(Integer index,String item);
  public A setToShortNames(Integer index,String item);
  public A addToShortNames(java.lang.String... items);
  public A addAllToShortNames(Collection<String> items);
  public A removeFromShortNames(java.lang.String... items);
  public A removeAllFromShortNames(Collection<String> items);
  public List<String> getShortNames();
  public String getShortName(Integer index);
  public String getFirstShortName();
  public String getLastShortName();
  public String getMatchingShortName(Predicate<String> predicate);
  public Boolean hasMatchingShortName(Predicate<String> predicate);
  public A withShortNames(List<String> shortNames);
  public A withShortNames(java.lang.String... shortNames);
  public Boolean hasShortNames();
  public String getSingularName();
  public A withSingularName(String singularName);
  public Boolean hasSingularName();
  public String getStorageVersionHash();
  public A withStorageVersionHash(String storageVersionHash);
  public Boolean hasStorageVersionHash();
  public A addToVerbs(Integer index,String item);
  public A setToVerbs(Integer index,String item);
  public A addToVerbs(java.lang.String... items);
  public A addAllToVerbs(Collection<String> items);
  public A removeFromVerbs(java.lang.String... items);
  public A removeAllFromVerbs(Collection<String> items);
  public List<String> getVerbs();
  public String getVerb(Integer index);
  public String getFirstVerb();
  public String getLastVerb();
  public String getMatchingVerb(Predicate<String> predicate);
  public Boolean hasMatchingVerb(Predicate<String> predicate);
  public A withVerbs(List<String> verbs);
  public A withVerbs(java.lang.String... verbs);
  public Boolean hasVerbs();
  public String getVersion();
  public A withVersion(String version);
  public Boolean hasVersion();
  public A withNamespaced();
  
}