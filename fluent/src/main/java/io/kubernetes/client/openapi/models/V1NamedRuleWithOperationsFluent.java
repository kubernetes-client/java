package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NamedRuleWithOperationsFluent<A extends V1NamedRuleWithOperationsFluent<A>> extends BaseFluent<A>{
  public V1NamedRuleWithOperationsFluent() {
  }
  
  public V1NamedRuleWithOperationsFluent(V1NamedRuleWithOperations instance) {
    this.copyInstance(instance);
  }
  private List<String> apiGroups;
  private List<String> apiVersions;
  private List<String> operations;
  private List<String> resourceNames;
  private List<String> resources;
  private String scope;
  
  protected void copyInstance(V1NamedRuleWithOperations instance) {
    instance = (instance != null ? instance : new V1NamedRuleWithOperations());
    if (instance != null) {
          this.withApiGroups(instance.getApiGroups());
          this.withApiVersions(instance.getApiVersions());
          this.withOperations(instance.getOperations());
          this.withResourceNames(instance.getResourceNames());
          this.withResources(instance.getResources());
          this.withScope(instance.getScope());
        }
  }
  
  public A addToApiGroups(int index,String item) {
    if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
    this.apiGroups.add(index, item);
    return (A)this;
  }
  
  public A setToApiGroups(int index,String item) {
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
    if (this.apiGroups == null) return (A)this;
    for (String item : items) { this.apiGroups.remove(item);} return (A)this;
  }
  
  public A removeAllFromApiGroups(Collection<String> items) {
    if (this.apiGroups == null) return (A)this;
    for (String item : items) { this.apiGroups.remove(item);} return (A)this;
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
  
  public A withApiGroups(java.lang.String... apiGroups) {
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
    return this.apiGroups != null && !this.apiGroups.isEmpty();
  }
  
  public A addToApiVersions(int index,String item) {
    if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
    this.apiVersions.add(index, item);
    return (A)this;
  }
  
  public A setToApiVersions(int index,String item) {
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
    if (this.apiVersions == null) return (A)this;
    for (String item : items) { this.apiVersions.remove(item);} return (A)this;
  }
  
  public A removeAllFromApiVersions(Collection<String> items) {
    if (this.apiVersions == null) return (A)this;
    for (String item : items) { this.apiVersions.remove(item);} return (A)this;
  }
  
  public List<String> getApiVersions() {
    return this.apiVersions;
  }
  
  public String getApiVersion(int index) {
    return this.apiVersions.get(index);
  }
  
  public String getFirstApiVersion() {
    return this.apiVersions.get(0);
  }
  
  public String getLastApiVersion() {
    return this.apiVersions.get(apiVersions.size() - 1);
  }
  
  public String getMatchingApiVersion(Predicate<String> predicate) {
      for (String item : apiVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingApiVersion(Predicate<String> predicate) {
      for (String item : apiVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withApiVersions(List<String> apiVersions) {
    if (apiVersions != null) {
        this.apiVersions = new ArrayList();
        for (String item : apiVersions) {
          this.addToApiVersions(item);
        }
    } else {
      this.apiVersions = null;
    }
    return (A) this;
  }
  
  public A withApiVersions(java.lang.String... apiVersions) {
    if (this.apiVersions != null) {
        this.apiVersions.clear();
        _visitables.remove("apiVersions");
    }
    if (apiVersions != null) {
      for (String item : apiVersions) {
        this.addToApiVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasApiVersions() {
    return this.apiVersions != null && !this.apiVersions.isEmpty();
  }
  
  public A addToOperations(int index,String item) {
    if (this.operations == null) {this.operations = new ArrayList<String>();}
    this.operations.add(index, item);
    return (A)this;
  }
  
  public A setToOperations(int index,String item) {
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
    if (this.operations == null) return (A)this;
    for (String item : items) { this.operations.remove(item);} return (A)this;
  }
  
  public A removeAllFromOperations(Collection<String> items) {
    if (this.operations == null) return (A)this;
    for (String item : items) { this.operations.remove(item);} return (A)this;
  }
  
  public List<String> getOperations() {
    return this.operations;
  }
  
  public String getOperation(int index) {
    return this.operations.get(index);
  }
  
  public String getFirstOperation() {
    return this.operations.get(0);
  }
  
  public String getLastOperation() {
    return this.operations.get(operations.size() - 1);
  }
  
  public String getMatchingOperation(Predicate<String> predicate) {
      for (String item : operations) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingOperation(Predicate<String> predicate) {
      for (String item : operations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withOperations(List<String> operations) {
    if (operations != null) {
        this.operations = new ArrayList();
        for (String item : operations) {
          this.addToOperations(item);
        }
    } else {
      this.operations = null;
    }
    return (A) this;
  }
  
  public A withOperations(java.lang.String... operations) {
    if (this.operations != null) {
        this.operations.clear();
        _visitables.remove("operations");
    }
    if (operations != null) {
      for (String item : operations) {
        this.addToOperations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasOperations() {
    return this.operations != null && !this.operations.isEmpty();
  }
  
  public A addToResourceNames(int index,String item) {
    if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
    this.resourceNames.add(index, item);
    return (A)this;
  }
  
  public A setToResourceNames(int index,String item) {
    if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
    this.resourceNames.set(index, item); return (A)this;
  }
  
  public A addToResourceNames(java.lang.String... items) {
    if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
    for (String item : items) {this.resourceNames.add(item);} return (A)this;
  }
  
  public A addAllToResourceNames(Collection<String> items) {
    if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
    for (String item : items) {this.resourceNames.add(item);} return (A)this;
  }
  
  public A removeFromResourceNames(java.lang.String... items) {
    if (this.resourceNames == null) return (A)this;
    for (String item : items) { this.resourceNames.remove(item);} return (A)this;
  }
  
  public A removeAllFromResourceNames(Collection<String> items) {
    if (this.resourceNames == null) return (A)this;
    for (String item : items) { this.resourceNames.remove(item);} return (A)this;
  }
  
  public List<String> getResourceNames() {
    return this.resourceNames;
  }
  
  public String getResourceName(int index) {
    return this.resourceNames.get(index);
  }
  
  public String getFirstResourceName() {
    return this.resourceNames.get(0);
  }
  
  public String getLastResourceName() {
    return this.resourceNames.get(resourceNames.size() - 1);
  }
  
  public String getMatchingResourceName(Predicate<String> predicate) {
      for (String item : resourceNames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceName(Predicate<String> predicate) {
      for (String item : resourceNames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceNames(List<String> resourceNames) {
    if (resourceNames != null) {
        this.resourceNames = new ArrayList();
        for (String item : resourceNames) {
          this.addToResourceNames(item);
        }
    } else {
      this.resourceNames = null;
    }
    return (A) this;
  }
  
  public A withResourceNames(java.lang.String... resourceNames) {
    if (this.resourceNames != null) {
        this.resourceNames.clear();
        _visitables.remove("resourceNames");
    }
    if (resourceNames != null) {
      for (String item : resourceNames) {
        this.addToResourceNames(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceNames() {
    return this.resourceNames != null && !this.resourceNames.isEmpty();
  }
  
  public A addToResources(int index,String item) {
    if (this.resources == null) {this.resources = new ArrayList<String>();}
    this.resources.add(index, item);
    return (A)this;
  }
  
  public A setToResources(int index,String item) {
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
    if (this.resources == null) return (A)this;
    for (String item : items) { this.resources.remove(item);} return (A)this;
  }
  
  public A removeAllFromResources(Collection<String> items) {
    if (this.resources == null) return (A)this;
    for (String item : items) { this.resources.remove(item);} return (A)this;
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
  
  public A withResources(java.lang.String... resources) {
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
    return this.resources != null && !this.resources.isEmpty();
  }
  
  public String getScope() {
    return this.scope;
  }
  
  public A withScope(String scope) {
    this.scope = scope;
    return (A) this;
  }
  
  public boolean hasScope() {
    return this.scope != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamedRuleWithOperationsFluent that = (V1NamedRuleWithOperationsFluent) o;
    if (!java.util.Objects.equals(apiGroups, that.apiGroups)) return false;
    if (!java.util.Objects.equals(apiVersions, that.apiVersions)) return false;
    if (!java.util.Objects.equals(operations, that.operations)) return false;
    if (!java.util.Objects.equals(resourceNames, that.resourceNames)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(scope, that.scope)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiGroups,  apiVersions,  operations,  resourceNames,  resources,  scope,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroups != null && !apiGroups.isEmpty()) { sb.append("apiGroups:"); sb.append(apiGroups + ","); }
    if (apiVersions != null && !apiVersions.isEmpty()) { sb.append("apiVersions:"); sb.append(apiVersions + ","); }
    if (operations != null && !operations.isEmpty()) { sb.append("operations:"); sb.append(operations + ","); }
    if (resourceNames != null && !resourceNames.isEmpty()) { sb.append("resourceNames:"); sb.append(resourceNames + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources + ","); }
    if (scope != null) { sb.append("scope:"); sb.append(scope); }
    sb.append("}");
    return sb.toString();
  }
  

}