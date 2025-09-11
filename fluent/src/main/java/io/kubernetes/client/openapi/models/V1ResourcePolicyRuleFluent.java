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
public class V1ResourcePolicyRuleFluent<A extends io.kubernetes.client.openapi.models.V1ResourcePolicyRuleFluent<A>> extends BaseFluent<A>{
  public V1ResourcePolicyRuleFluent() {
  }
  
  public V1ResourcePolicyRuleFluent(V1ResourcePolicyRule instance) {
    this.copyInstance(instance);
  }
  private List<String> apiGroups;
  private Boolean clusterScope;
  private List<String> namespaces;
  private List<String> resources;
  private List<String> verbs;
  
  protected void copyInstance(V1ResourcePolicyRule instance) {
    instance = instance != null ? instance : new V1ResourcePolicyRule();
    if (instance != null) {
        this.withApiGroups(instance.getApiGroups());
        this.withClusterScope(instance.getClusterScope());
        this.withNamespaces(instance.getNamespaces());
        this.withResources(instance.getResources());
        this.withVerbs(instance.getVerbs());
    }
  }
  
  public A addToApiGroups(int index,String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList();
    }
    this.apiGroups.add(index, item);
    return (A) this;
  }
  
  public A setToApiGroups(int index,String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList();
    }
    this.apiGroups.set(index, item);
    return (A) this;
  }
  
  public A addToApiGroups(String... items) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList();
    }
    for (String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }
  
  public A addAllToApiGroups(Collection<String> items) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList();
    }
    for (String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }
  
  public A removeFromApiGroups(String... items) {
    if (this.apiGroups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.apiGroups.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromApiGroups(Collection<String> items) {
    if (this.apiGroups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.apiGroups.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getApiGroups() {
    return this.apiGroups;
  }
  
  public String getApiGroup(int index) {
    return this.apiGroups.get(index);
  }
  
  public String getFirstApiGroup() {
    return this.apiGroups.get(0);
  }
  
  public String getLastApiGroup() {
    return this.apiGroups.get(apiGroups.size() - 1);
  }
  
  public String getMatchingApiGroup(Predicate<String> predicate) {
      for (String item : apiGroups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingApiGroup(Predicate<String> predicate) {
      for (String item : apiGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withApiGroups(List<String> apiGroups) {
    if (apiGroups != null) {
        this.apiGroups = new ArrayList();
        for (String item : apiGroups) {
          this.addToApiGroups(item);
        }
    } else {
      this.apiGroups = null;
    }
    return (A) this;
  }
  
  public A withApiGroups(String... apiGroups) {
    if (this.apiGroups != null) {
        this.apiGroups.clear();
        _visitables.remove("apiGroups");
    }
    if (apiGroups != null) {
      for (String item : apiGroups) {
        this.addToApiGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasApiGroups() {
    return this.apiGroups != null && !(this.apiGroups.isEmpty());
  }
  
  public Boolean getClusterScope() {
    return this.clusterScope;
  }
  
  public A withClusterScope(Boolean clusterScope) {
    this.clusterScope = clusterScope;
    return (A) this;
  }
  
  public boolean hasClusterScope() {
    return this.clusterScope != null;
  }
  
  public A addToNamespaces(int index,String item) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    this.namespaces.add(index, item);
    return (A) this;
  }
  
  public A setToNamespaces(int index,String item) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    this.namespaces.set(index, item);
    return (A) this;
  }
  
  public A addToNamespaces(String... items) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    for (String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }
  
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    for (String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }
  
  public A removeFromNamespaces(String... items) {
    if (this.namespaces == null) {
      return (A) this;
    }
    for (String item : items) {
      this.namespaces.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromNamespaces(Collection<String> items) {
    if (this.namespaces == null) {
      return (A) this;
    }
    for (String item : items) {
      this.namespaces.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  
  public String getNamespace(int index) {
    return this.namespaces.get(index);
  }
  
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }
  
  public String getMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {
        this.namespaces = new ArrayList();
        for (String item : namespaces) {
          this.addToNamespaces(item);
        }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }
  
  public A withNamespaces(String... namespaces) {
    if (this.namespaces != null) {
        this.namespaces.clear();
        _visitables.remove("namespaces");
    }
    if (namespaces != null) {
      for (String item : namespaces) {
        this.addToNamespaces(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNamespaces() {
    return this.namespaces != null && !(this.namespaces.isEmpty());
  }
  
  public A addToResources(int index,String item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    this.resources.add(index, item);
    return (A) this;
  }
  
  public A setToResources(int index,String item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    this.resources.set(index, item);
    return (A) this;
  }
  
  public A addToResources(String... items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }
  
  public A addAllToResources(Collection<String> items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }
  
  public A removeFromResources(String... items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (String item : items) {
      this.resources.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromResources(Collection<String> items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (String item : items) {
      this.resources.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getResources() {
    return this.resources;
  }
  
  public String getResource(int index) {
    return this.resources.get(index);
  }
  
  public String getFirstResource() {
    return this.resources.get(0);
  }
  
  public String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }
  
  public String getMatchingResource(Predicate<String> predicate) {
      for (String item : resources) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingResource(Predicate<String> predicate) {
      for (String item : resources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResources(List<String> resources) {
    if (resources != null) {
        this.resources = new ArrayList();
        for (String item : resources) {
          this.addToResources(item);
        }
    } else {
      this.resources = null;
    }
    return (A) this;
  }
  
  public A withResources(String... resources) {
    if (this.resources != null) {
        this.resources.clear();
        _visitables.remove("resources");
    }
    if (resources != null) {
      for (String item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null && !(this.resources.isEmpty());
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
    V1ResourcePolicyRuleFluent that = (V1ResourcePolicyRuleFluent) o;
    if (!(Objects.equals(apiGroups, that.apiGroups))) {
      return false;
    }
    if (!(Objects.equals(clusterScope, that.clusterScope))) {
      return false;
    }
    if (!(Objects.equals(namespaces, that.namespaces))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    if (!(Objects.equals(verbs, that.verbs))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(apiGroups, clusterScope, namespaces, resources, verbs);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiGroups == null) && !(apiGroups.isEmpty())) {
        sb.append("apiGroups:");
        sb.append(apiGroups);
        sb.append(",");
    }
    if (!(clusterScope == null)) {
        sb.append("clusterScope:");
        sb.append(clusterScope);
        sb.append(",");
    }
    if (!(namespaces == null) && !(namespaces.isEmpty())) {
        sb.append("namespaces:");
        sb.append(namespaces);
        sb.append(",");
    }
    if (!(resources == null) && !(resources.isEmpty())) {
        sb.append("resources:");
        sb.append(resources);
        sb.append(",");
    }
    if (!(verbs == null) && !(verbs.isEmpty())) {
        sb.append("verbs:");
        sb.append(verbs);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withClusterScope() {
    return withClusterScope(true);
  }
  

}