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
public interface V1RuleWithOperationsFluent<A extends V1RuleWithOperationsFluent<A>> extends Fluent<A>{
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
  public A addToApiVersions(Integer index,String item);
  public A setToApiVersions(Integer index,String item);
  public A addToApiVersions(java.lang.String... items);
  public A addAllToApiVersions(Collection<String> items);
  public A removeFromApiVersions(java.lang.String... items);
  public A removeAllFromApiVersions(Collection<String> items);
  public List<String> getApiVersions();
  public String getApiVersion(Integer index);
  public String getFirstApiVersion();
  public String getLastApiVersion();
  public String getMatchingApiVersion(Predicate<String> predicate);
  public Boolean hasMatchingApiVersion(Predicate<String> predicate);
  public A withApiVersions(List<String> apiVersions);
  public A withApiVersions(java.lang.String... apiVersions);
  public Boolean hasApiVersions();
  public A addToOperations(Integer index,String item);
  public A setToOperations(Integer index,String item);
  public A addToOperations(java.lang.String... items);
  public A addAllToOperations(Collection<String> items);
  public A removeFromOperations(java.lang.String... items);
  public A removeAllFromOperations(Collection<String> items);
  public List<String> getOperations();
  public String getOperation(Integer index);
  public String getFirstOperation();
  public String getLastOperation();
  public String getMatchingOperation(Predicate<String> predicate);
  public Boolean hasMatchingOperation(Predicate<String> predicate);
  public A withOperations(List<String> operations);
  public A withOperations(java.lang.String... operations);
  public Boolean hasOperations();
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
  public String getScope();
  public A withScope(String scope);
  public Boolean hasScope();
  
}