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
public class V1PolicyRuleFluent<A extends V1PolicyRuleFluent<A>> extends BaseFluent<A>{
  public V1PolicyRuleFluent() {
  }
  
  public V1PolicyRuleFluent(V1PolicyRule instance) {
    this.copyInstance(instance);
  }
  private List<String> apiGroups;
  private List<String> nonResourceURLs;
  private List<String> resourceNames;
  private List<String> resources;
  private List<String> verbs;
  
  protected void copyInstance(V1PolicyRule instance) {
    instance = (instance != null ? instance : new V1PolicyRule());
    if (instance != null) {
          this.withApiGroups(instance.getApiGroups());
          this.withNonResourceURLs(instance.getNonResourceURLs());
          this.withResourceNames(instance.getResourceNames());
          this.withResources(instance.getResources());
          this.withVerbs(instance.getVerbs());
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
  
  public A addToNonResourceURLs(int index,String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    this.nonResourceURLs.add(index, item);
    return (A)this;
  }
  
  public A setToNonResourceURLs(int index,String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    this.nonResourceURLs.set(index, item); return (A)this;
  }
  
  public A addToNonResourceURLs(java.lang.String... items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  
  public A addAllToNonResourceURLs(Collection<String> items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  
  public A removeFromNonResourceURLs(java.lang.String... items) {
    if (this.nonResourceURLs == null) return (A)this;
    for (String item : items) { this.nonResourceURLs.remove(item);} return (A)this;
  }
  
  public A removeAllFromNonResourceURLs(Collection<String> items) {
    if (this.nonResourceURLs == null) return (A)this;
    for (String item : items) { this.nonResourceURLs.remove(item);} return (A)this;
  }
  
  public List<String> getNonResourceURLs() {
    return this.nonResourceURLs;
  }
  
  public String getNonResourceURL(int index) {
    return this.nonResourceURLs.get(index);
  }
  
  public String getFirstNonResourceURL() {
    return this.nonResourceURLs.get(0);
  }
  
  public String getLastNonResourceURL() {
    return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
  }
  
  public String getMatchingNonResourceURL(Predicate<String> predicate) {
      for (String item : nonResourceURLs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingNonResourceURL(Predicate<String> predicate) {
      for (String item : nonResourceURLs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNonResourceURLs(List<String> nonResourceURLs) {
    if (nonResourceURLs != null) {
        this.nonResourceURLs = new ArrayList();
        for (String item : nonResourceURLs) {
          this.addToNonResourceURLs(item);
        }
    } else {
      this.nonResourceURLs = null;
    }
    return (A) this;
  }
  
  public A withNonResourceURLs(java.lang.String... nonResourceURLs) {
    if (this.nonResourceURLs != null) {
        this.nonResourceURLs.clear();
        _visitables.remove("nonResourceURLs");
    }
    if (nonResourceURLs != null) {
      for (String item : nonResourceURLs) {
        this.addToNonResourceURLs(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNonResourceURLs() {
    return this.nonResourceURLs != null && !this.nonResourceURLs.isEmpty();
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
  
  public A addToVerbs(int index,String item) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    this.verbs.add(index, item);
    return (A)this;
  }
  
  public A setToVerbs(int index,String item) {
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
    if (this.verbs == null) return (A)this;
    for (String item : items) { this.verbs.remove(item);} return (A)this;
  }
  
  public A removeAllFromVerbs(Collection<String> items) {
    if (this.verbs == null) return (A)this;
    for (String item : items) { this.verbs.remove(item);} return (A)this;
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
  
  public A withVerbs(java.lang.String... verbs) {
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
    return this.verbs != null && !this.verbs.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PolicyRuleFluent that = (V1PolicyRuleFluent) o;
    if (!java.util.Objects.equals(apiGroups, that.apiGroups)) return false;
    if (!java.util.Objects.equals(nonResourceURLs, that.nonResourceURLs)) return false;
    if (!java.util.Objects.equals(resourceNames, that.resourceNames)) return false;
    if (!java.util.Objects.equals(resources, that.resources)) return false;
    if (!java.util.Objects.equals(verbs, that.verbs)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiGroups,  nonResourceURLs,  resourceNames,  resources,  verbs,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroups != null && !apiGroups.isEmpty()) { sb.append("apiGroups:"); sb.append(apiGroups + ","); }
    if (nonResourceURLs != null && !nonResourceURLs.isEmpty()) { sb.append("nonResourceURLs:"); sb.append(nonResourceURLs + ","); }
    if (resourceNames != null && !resourceNames.isEmpty()) { sb.append("resourceNames:"); sb.append(resourceNames + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources + ","); }
    if (verbs != null && !verbs.isEmpty()) { sb.append("verbs:"); sb.append(verbs); }
    sb.append("}");
    return sb.toString();
  }
  

}