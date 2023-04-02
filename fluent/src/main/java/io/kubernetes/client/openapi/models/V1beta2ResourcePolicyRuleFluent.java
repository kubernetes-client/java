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
public interface V1beta2ResourcePolicyRuleFluent<A extends V1beta2ResourcePolicyRuleFluent<A>> extends Fluent<A>{
  public A addToApiGroups(Integer index,String item);
  public A setToApiGroups(Integer index,String item);
  public A addToApiGroups(java.lang.String... items);
  public A addAllToApiGroups(Collection<String> items);
  public A removeFromApiGroups(java.lang.String... items);
  public A removeAllFromApiGroups(Collection<String> items);
  public List<String> getApiGroups();
  public String getApiGroup(Integer index);
  public String getFirstApiGroup();
  public String getLastApiGroup();
  public String getMatchingApiGroup(Predicate<String> predicate);
  public Boolean hasMatchingApiGroup(Predicate<String> predicate);
  public A withApiGroups(List<String> apiGroups);
  public A withApiGroups(java.lang.String... apiGroups);
  public Boolean hasApiGroups();
  public Boolean getClusterScope();
  public A withClusterScope(Boolean clusterScope);
  public Boolean hasClusterScope();
  public A addToNamespaces(Integer index,String item);
  public A setToNamespaces(Integer index,String item);
  public A addToNamespaces(java.lang.String... items);
  public A addAllToNamespaces(Collection<String> items);
  public A removeFromNamespaces(java.lang.String... items);
  public A removeAllFromNamespaces(Collection<String> items);
  public List<String> getNamespaces();
  public String getNamespace(Integer index);
  public String getFirstNamespace();
  public String getLastNamespace();
  public String getMatchingNamespace(Predicate<String> predicate);
  public Boolean hasMatchingNamespace(Predicate<String> predicate);
  public A withNamespaces(List<String> namespaces);
  public A withNamespaces(java.lang.String... namespaces);
  public Boolean hasNamespaces();
  public A addToResources(Integer index,String item);
  public A setToResources(Integer index,String item);
  public A addToResources(java.lang.String... items);
  public A addAllToResources(Collection<String> items);
  public A removeFromResources(java.lang.String... items);
  public A removeAllFromResources(Collection<String> items);
  public List<String> getResources();
  public String getResource(Integer index);
  public String getFirstResource();
  public String getLastResource();
  public String getMatchingResource(Predicate<String> predicate);
  public Boolean hasMatchingResource(Predicate<String> predicate);
  public A withResources(List<String> resources);
  public A withResources(java.lang.String... resources);
  public Boolean hasResources();
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
  public A withClusterScope();
  
}