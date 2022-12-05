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
  public class V1RuleWithOperationsFluentImpl<A extends V1RuleWithOperationsFluent<A>> extends BaseFluent<A> implements V1RuleWithOperationsFluent<A>{
  public V1RuleWithOperationsFluentImpl() {
  }
  public V1RuleWithOperationsFluentImpl(V1RuleWithOperations instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withApiVersions(instance.getApiVersions());

    this.withOperations(instance.getOperations());

    this.withResources(instance.getResources());

    this.withScope(instance.getScope());

  }
  private List<String> apiGroups;
  private List<String> apiVersions;
  private List<String> operations;
  private List<String> resources;
  private String scope;
  public A addToApiGroups(Integer index,String item) {
    if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
    this.apiGroups.add(index, item);
    return (A)this;
  }
  public A setToApiGroups(Integer index,String item) {
    if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
    this.apiGroups.set(index, item); return (A)this;
  }
  public A addToApiGroups(java.lang.String... items) {
    if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
    for (String item : items) {this.apiGroups.add(item);} return (A)this;
  }
  public A addAllToApiGroups(Collection<String> items) {
    if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
    for (String item : items) {this.apiGroups.add(item);} return (A)this;
  }
  public A removeFromApiGroups(java.lang.String... items) {
    for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
  }
  public A removeAllFromApiGroups(Collection<String> items) {
    for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
  }
  public List<String> getApiGroups() {
    return this.apiGroups;
  }
  public String getApiGroup(Integer index) {
    return this.apiGroups.get(index);
  }
  public String getFirstApiGroup() {
    return this.apiGroups.get(0);
  }
  public String getLastApiGroup() {
    return this.apiGroups.get(apiGroups.size() - 1);
  }
  public String getMatchingApiGroup(Predicate<String> predicate) {
    for (String item: apiGroups) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingApiGroup(Predicate<String> predicate) {
    for (String item: apiGroups) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withApiGroups(List<String> apiGroups) {
    if (apiGroups != null) {this.apiGroups = new ArrayList(); for (String item : apiGroups){this.addToApiGroups(item);}} else { this.apiGroups = null;} return (A) this;
  }
  public A withApiGroups(java.lang.String... apiGroups) {
    if (this.apiGroups != null) {this.apiGroups.clear();}
    if (apiGroups != null) {for (String item :apiGroups){ this.addToApiGroups(item);}} return (A) this;
  }
  public Boolean hasApiGroups() {
    return apiGroups != null && !apiGroups.isEmpty();
  }
  public A addToApiVersions(Integer index,String item) {
    if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
    this.apiVersions.add(index, item);
    return (A)this;
  }
  public A setToApiVersions(Integer index,String item) {
    if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
    this.apiVersions.set(index, item); return (A)this;
  }
  public A addToApiVersions(java.lang.String... items) {
    if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
    for (String item : items) {this.apiVersions.add(item);} return (A)this;
  }
  public A addAllToApiVersions(Collection<String> items) {
    if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
    for (String item : items) {this.apiVersions.add(item);} return (A)this;
  }
  public A removeFromApiVersions(java.lang.String... items) {
    for (String item : items) {if (this.apiVersions!= null){ this.apiVersions.remove(item);}} return (A)this;
  }
  public A removeAllFromApiVersions(Collection<String> items) {
    for (String item : items) {if (this.apiVersions!= null){ this.apiVersions.remove(item);}} return (A)this;
  }
  public List<String> getApiVersions() {
    return this.apiVersions;
  }
  public String getApiVersion(Integer index) {
    return this.apiVersions.get(index);
  }
  public String getFirstApiVersion() {
    return this.apiVersions.get(0);
  }
  public String getLastApiVersion() {
    return this.apiVersions.get(apiVersions.size() - 1);
  }
  public String getMatchingApiVersion(Predicate<String> predicate) {
    for (String item: apiVersions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingApiVersion(Predicate<String> predicate) {
    for (String item: apiVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withApiVersions(List<String> apiVersions) {
    if (apiVersions != null) {this.apiVersions = new ArrayList(); for (String item : apiVersions){this.addToApiVersions(item);}} else { this.apiVersions = null;} return (A) this;
  }
  public A withApiVersions(java.lang.String... apiVersions) {
    if (this.apiVersions != null) {this.apiVersions.clear();}
    if (apiVersions != null) {for (String item :apiVersions){ this.addToApiVersions(item);}} return (A) this;
  }
  public Boolean hasApiVersions() {
    return apiVersions != null && !apiVersions.isEmpty();
  }
  public A addToOperations(Integer index,String item) {
    if (this.operations == null) {this.operations = new ArrayList<String>();}
    this.operations.add(index, item);
    return (A)this;
  }
  public A setToOperations(Integer index,String item) {
    if (this.operations == null) {this.operations = new ArrayList<String>();}
    this.operations.set(index, item); return (A)this;
  }
  public A addToOperations(java.lang.String... items) {
    if (this.operations == null) {this.operations = new ArrayList<String>();}
    for (String item : items) {this.operations.add(item);} return (A)this;
  }
  public A addAllToOperations(Collection<String> items) {
    if (this.operations == null) {this.operations = new ArrayList<String>();}
    for (String item : items) {this.operations.add(item);} return (A)this;
  }
  public A removeFromOperations(java.lang.String... items) {
    for (String item : items) {if (this.operations!= null){ this.operations.remove(item);}} return (A)this;
  }
  public A removeAllFromOperations(Collection<String> items) {
    for (String item : items) {if (this.operations!= null){ this.operations.remove(item);}} return (A)this;
  }
  public List<String> getOperations() {
    return this.operations;
  }
  public String getOperation(Integer index) {
    return this.operations.get(index);
  }
  public String getFirstOperation() {
    return this.operations.get(0);
  }
  public String getLastOperation() {
    return this.operations.get(operations.size() - 1);
  }
  public String getMatchingOperation(Predicate<String> predicate) {
    for (String item: operations) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingOperation(Predicate<String> predicate) {
    for (String item: operations) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withOperations(List<String> operations) {
    if (operations != null) {this.operations = new ArrayList(); for (String item : operations){this.addToOperations(item);}} else { this.operations = null;} return (A) this;
  }
  public A withOperations(java.lang.String... operations) {
    if (this.operations != null) {this.operations.clear();}
    if (operations != null) {for (String item :operations){ this.addToOperations(item);}} return (A) this;
  }
  public Boolean hasOperations() {
    return operations != null && !operations.isEmpty();
  }
  public A addToResources(Integer index,String item) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    this.resources.add(index, item);
    return (A)this;
  }
  public A setToResources(Integer index,String item) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    this.resources.set(index, item); return (A)this;
  }
  public A addToResources(java.lang.String... items) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    for (String item : items) {this.resources.add(item);} return (A)this;
  }
  public A addAllToResources(Collection<String> items) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    for (String item : items) {this.resources.add(item);} return (A)this;
  }
  public A removeFromResources(java.lang.String... items) {
    for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
  }
  public A removeAllFromResources(Collection<String> items) {
    for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
  }
  public List<String> getResources() {
    return this.resources;
  }
  public String getResource(Integer index) {
    return this.resources.get(index);
  }
  public String getFirstResource() {
    return this.resources.get(0);
  }
  public String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }
  public String getMatchingResource(Predicate<String> predicate) {
    for (String item: resources) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingResource(Predicate<String> predicate) {
    for (String item: resources) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResources(List<String> resources) {
    if (resources != null) {this.resources = new ArrayList(); for (String item : resources){this.addToResources(item);}} else { this.resources = null;} return (A) this;
  }
  public A withResources(java.lang.String... resources) {
    if (this.resources != null) {this.resources.clear();}
    if (resources != null) {for (String item :resources){ this.addToResources(item);}} return (A) this;
  }
  public Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }
  public String getScope() {
    return this.scope;
  }
  public A withScope(String scope) {
    this.scope=scope; return (A) this;
  }
  public Boolean hasScope() {
    return this.scope != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RuleWithOperationsFluentImpl that = (V1RuleWithOperationsFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
    if (apiVersions != null ? !apiVersions.equals(that.apiVersions) :that.apiVersions != null) return false;
    if (operations != null ? !operations.equals(that.operations) :that.operations != null) return false;
    if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
    if (scope != null ? !scope.equals(that.scope) :that.scope != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroups,  apiVersions,  operations,  resources,  scope,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroups != null && !apiGroups.isEmpty()) { sb.append("apiGroups:"); sb.append(apiGroups + ","); }
    if (apiVersions != null && !apiVersions.isEmpty()) { sb.append("apiVersions:"); sb.append(apiVersions + ","); }
    if (operations != null && !operations.isEmpty()) { sb.append("operations:"); sb.append(operations + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources + ","); }
    if (scope != null) { sb.append("scope:"); sb.append(scope); }
    sb.append("}");
    return sb.toString();
  }
  
}