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
  public class V1beta1ResourcePolicyRuleFluentImpl<A extends V1beta1ResourcePolicyRuleFluent<A>> extends BaseFluent<A> implements V1beta1ResourcePolicyRuleFluent<A>{
  public V1beta1ResourcePolicyRuleFluentImpl() {
  }
  public V1beta1ResourcePolicyRuleFluentImpl(V1beta1ResourcePolicyRule instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withClusterScope(instance.getClusterScope());

    this.withNamespaces(instance.getNamespaces());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

  }
  private List<String> apiGroups;
  private Boolean clusterScope;
  private List<String> namespaces;
  private List<String> resources;
  private List<String> verbs;
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
  public Boolean getClusterScope() {
    return this.clusterScope;
  }
  public A withClusterScope(Boolean clusterScope) {
    this.clusterScope=clusterScope; return (A) this;
  }
  public Boolean hasClusterScope() {
    return this.clusterScope != null;
  }
  public A addToNamespaces(Integer index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.add(index, item);
    return (A)this;
  }
  public A setToNamespaces(Integer index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.set(index, item); return (A)this;
  }
  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  public A removeFromNamespaces(java.lang.String... items) {
    for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
  }
  public A removeAllFromNamespaces(Collection<String> items) {
    for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
  }
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  public String getNamespace(Integer index) {
    return this.namespaces.get(index);
  }
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }
  public String getMatchingNamespace(Predicate<String> predicate) {
    for (String item: namespaces) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingNamespace(Predicate<String> predicate) {
    for (String item: namespaces) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {this.namespaces = new ArrayList(); for (String item : namespaces){this.addToNamespaces(item);}} else { this.namespaces = null;} return (A) this;
  }
  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {this.namespaces.clear();}
    if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
  }
  public Boolean hasNamespaces() {
    return namespaces != null && !namespaces.isEmpty();
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1ResourcePolicyRuleFluentImpl that = (V1beta1ResourcePolicyRuleFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
    if (clusterScope != null ? !clusterScope.equals(that.clusterScope) :that.clusterScope != null) return false;
    if (namespaces != null ? !namespaces.equals(that.namespaces) :that.namespaces != null) return false;
    if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
    if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroups,  clusterScope,  namespaces,  resources,  verbs,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroups != null && !apiGroups.isEmpty()) { sb.append("apiGroups:"); sb.append(apiGroups + ","); }
    if (clusterScope != null) { sb.append("clusterScope:"); sb.append(clusterScope + ","); }
    if (namespaces != null && !namespaces.isEmpty()) { sb.append("namespaces:"); sb.append(namespaces + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources + ","); }
    if (verbs != null && !verbs.isEmpty()) { sb.append("verbs:"); sb.append(verbs); }
    sb.append("}");
    return sb.toString();
  }
  public A withClusterScope() {
    return withClusterScope(true);
  }
  
}