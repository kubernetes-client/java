package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1MatchResourcesFluent<A extends V1MatchResourcesFluent<A>> extends BaseFluent<A>{
  public V1MatchResourcesFluent() {
  }
  
  public V1MatchResourcesFluent(V1MatchResources instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1NamedRuleWithOperationsBuilder> excludeResourceRules;
  private String matchPolicy;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private ArrayList<V1NamedRuleWithOperationsBuilder> resourceRules;
  
  protected void copyInstance(V1MatchResources instance) {
    instance = (instance != null ? instance : new V1MatchResources());
    if (instance != null) {
          this.withExcludeResourceRules(instance.getExcludeResourceRules());
          this.withMatchPolicy(instance.getMatchPolicy());
          this.withNamespaceSelector(instance.getNamespaceSelector());
          this.withObjectSelector(instance.getObjectSelector());
          this.withResourceRules(instance.getResourceRules());
        }
  }
  
  public A addToExcludeResourceRules(int index,V1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) { _visitables.get("excludeResourceRules").add(builder); excludeResourceRules.add(builder); } else { _visitables.get("excludeResourceRules").add(index, builder); excludeResourceRules.add(index, builder);}
    return (A)this;
  }
  
  public A setToExcludeResourceRules(int index,V1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) { _visitables.get("excludeResourceRules").add(builder); excludeResourceRules.add(builder); } else { _visitables.get("excludeResourceRules").set(index, builder); excludeResourceRules.set(index, builder);}
    return (A)this;
  }
  
  public A addToExcludeResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... items) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").add(builder);this.excludeResourceRules.add(builder);} return (A)this;
  }
  
  public A addAllToExcludeResourceRules(Collection<V1NamedRuleWithOperations> items) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").add(builder);this.excludeResourceRules.add(builder);} return (A)this;
  }
  
  public A removeFromExcludeResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... items) {
    if (this.excludeResourceRules == null) return (A)this;
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").remove(builder); this.excludeResourceRules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromExcludeResourceRules(Collection<V1NamedRuleWithOperations> items) {
    if (this.excludeResourceRules == null) return (A)this;
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").remove(builder); this.excludeResourceRules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromExcludeResourceRules(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
    if (excludeResourceRules == null) return (A) this;
    final Iterator<V1NamedRuleWithOperationsBuilder> each = excludeResourceRules.iterator();
    final List visitables = _visitables.get("excludeResourceRules");
    while (each.hasNext()) {
      V1NamedRuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1NamedRuleWithOperations> buildExcludeResourceRules() {
    return this.excludeResourceRules != null ? build(excludeResourceRules) : null;
  }
  
  public V1NamedRuleWithOperations buildExcludeResourceRule(int index) {
    return this.excludeResourceRules.get(index).build();
  }
  
  public V1NamedRuleWithOperations buildFirstExcludeResourceRule() {
    return this.excludeResourceRules.get(0).build();
  }
  
  public V1NamedRuleWithOperations buildLastExcludeResourceRule() {
    return this.excludeResourceRules.get(excludeResourceRules.size() - 1).build();
  }
  
  public V1NamedRuleWithOperations buildMatchingExcludeResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
      for (V1NamedRuleWithOperationsBuilder item : excludeResourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExcludeResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
      for (V1NamedRuleWithOperationsBuilder item : excludeResourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExcludeResourceRules(List<V1NamedRuleWithOperations> excludeResourceRules) {
    if (this.excludeResourceRules != null) {
      this._visitables.get("excludeResourceRules").clear();
    }
    if (excludeResourceRules != null) {
        this.excludeResourceRules = new ArrayList();
        for (V1NamedRuleWithOperations item : excludeResourceRules) {
          this.addToExcludeResourceRules(item);
        }
    } else {
      this.excludeResourceRules = null;
    }
    return (A) this;
  }
  
  public A withExcludeResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... excludeResourceRules) {
    if (this.excludeResourceRules != null) {
        this.excludeResourceRules.clear();
        _visitables.remove("excludeResourceRules");
    }
    if (excludeResourceRules != null) {
      for (V1NamedRuleWithOperations item : excludeResourceRules) {
        this.addToExcludeResourceRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExcludeResourceRules() {
    return this.excludeResourceRules != null && !this.excludeResourceRules.isEmpty();
  }
  
  public ExcludeResourceRulesNested<A> addNewExcludeResourceRule() {
    return new ExcludeResourceRulesNested(-1, null);
  }
  
  public ExcludeResourceRulesNested<A> addNewExcludeResourceRuleLike(V1NamedRuleWithOperations item) {
    return new ExcludeResourceRulesNested(-1, item);
  }
  
  public ExcludeResourceRulesNested<A> setNewExcludeResourceRuleLike(int index,V1NamedRuleWithOperations item) {
    return new ExcludeResourceRulesNested(index, item);
  }
  
  public ExcludeResourceRulesNested<A> editExcludeResourceRule(int index) {
    if (excludeResourceRules.size() <= index) throw new RuntimeException("Can't edit excludeResourceRules. Index exceeds size.");
    return setNewExcludeResourceRuleLike(index, buildExcludeResourceRule(index));
  }
  
  public ExcludeResourceRulesNested<A> editFirstExcludeResourceRule() {
    if (excludeResourceRules.size() == 0) throw new RuntimeException("Can't edit first excludeResourceRules. The list is empty.");
    return setNewExcludeResourceRuleLike(0, buildExcludeResourceRule(0));
  }
  
  public ExcludeResourceRulesNested<A> editLastExcludeResourceRule() {
    int index = excludeResourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last excludeResourceRules. The list is empty.");
    return setNewExcludeResourceRuleLike(index, buildExcludeResourceRule(index));
  }
  
  public ExcludeResourceRulesNested<A> editMatchingExcludeResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<excludeResourceRules.size();i++) { 
    if (predicate.test(excludeResourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching excludeResourceRules. No match found.");
    return setNewExcludeResourceRuleLike(index, buildExcludeResourceRule(index));
  }
  
  public String getMatchPolicy() {
    return this.matchPolicy;
  }
  
  public A withMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return (A) this;
  }
  
  public boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    this._visitables.remove("namespaceSelector");
    if (namespaceSelector != null) {
        this.namespaceSelector = new V1LabelSelectorBuilder(namespaceSelector);
        this._visitables.get("namespaceSelector").add(this.namespaceSelector);
    } else {
        this.namespaceSelector = null;
        this._visitables.get("namespaceSelector").remove(this.namespaceSelector);
    }
    return (A) this;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(item));
  }
  
  public V1LabelSelector buildObjectSelector() {
    return this.objectSelector != null ? this.objectSelector.build() : null;
  }
  
  public A withObjectSelector(V1LabelSelector objectSelector) {
    this._visitables.remove("objectSelector");
    if (objectSelector != null) {
        this.objectSelector = new V1LabelSelectorBuilder(objectSelector);
        this._visitables.get("objectSelector").add(this.objectSelector);
    } else {
        this.objectSelector = null;
        this._visitables.get("objectSelector").remove(this.objectSelector);
    }
    return (A) this;
  }
  
  public boolean hasObjectSelector() {
    return this.objectSelector != null;
  }
  
  public ObjectSelectorNested<A> withNewObjectSelector() {
    return new ObjectSelectorNested(null);
  }
  
  public ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item) {
    return new ObjectSelectorNested(item);
  }
  
  public ObjectSelectorNested<A> editObjectSelector() {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(null));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelector() {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(item));
  }
  
  public A addToResourceRules(int index,V1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) { _visitables.get("resourceRules").add(builder); resourceRules.add(builder); } else { _visitables.get("resourceRules").add(index, builder); resourceRules.add(index, builder);}
    return (A)this;
  }
  
  public A setToResourceRules(int index,V1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) { _visitables.get("resourceRules").add(builder); resourceRules.add(builder); } else { _visitables.get("resourceRules").set(index, builder); resourceRules.set(index, builder);}
    return (A)this;
  }
  
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  
  public A addAllToResourceRules(Collection<V1NamedRuleWithOperations> items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1NamedRuleWithOperationsBuilder>();}
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... items) {
    if (this.resourceRules == null) return (A)this;
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").remove(builder); this.resourceRules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResourceRules(Collection<V1NamedRuleWithOperations> items) {
    if (this.resourceRules == null) return (A)this;
    for (V1NamedRuleWithOperations item : items) {V1NamedRuleWithOperationsBuilder builder = new V1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").remove(builder); this.resourceRules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResourceRules(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<V1NamedRuleWithOperationsBuilder> each = resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      V1NamedRuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1NamedRuleWithOperations> buildResourceRules() {
    return this.resourceRules != null ? build(resourceRules) : null;
  }
  
  public V1NamedRuleWithOperations buildResourceRule(int index) {
    return this.resourceRules.get(index).build();
  }
  
  public V1NamedRuleWithOperations buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  
  public V1NamedRuleWithOperations buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  
  public V1NamedRuleWithOperations buildMatchingResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
      for (V1NamedRuleWithOperationsBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
      for (V1NamedRuleWithOperationsBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceRules(List<V1NamedRuleWithOperations> resourceRules) {
    if (this.resourceRules != null) {
      this._visitables.get("resourceRules").clear();
    }
    if (resourceRules != null) {
        this.resourceRules = new ArrayList();
        for (V1NamedRuleWithOperations item : resourceRules) {
          this.addToResourceRules(item);
        }
    } else {
      this.resourceRules = null;
    }
    return (A) this;
  }
  
  public A withResourceRules(io.kubernetes.client.openapi.models.V1NamedRuleWithOperations... resourceRules) {
    if (this.resourceRules != null) {
        this.resourceRules.clear();
        _visitables.remove("resourceRules");
    }
    if (resourceRules != null) {
      for (V1NamedRuleWithOperations item : resourceRules) {
        this.addToResourceRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceRules() {
    return this.resourceRules != null && !this.resourceRules.isEmpty();
  }
  
  public ResourceRulesNested<A> addNewResourceRule() {
    return new ResourceRulesNested(-1, null);
  }
  
  public ResourceRulesNested<A> addNewResourceRuleLike(V1NamedRuleWithOperations item) {
    return new ResourceRulesNested(-1, item);
  }
  
  public ResourceRulesNested<A> setNewResourceRuleLike(int index,V1NamedRuleWithOperations item) {
    return new ResourceRulesNested(index, item);
  }
  
  public ResourceRulesNested<A> editResourceRule(int index) {
    if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  
  public ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }
  
  public ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  
  public ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1NamedRuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceRules.size();i++) { 
    if (predicate.test(resourceRules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1MatchResourcesFluent that = (V1MatchResourcesFluent) o;
    if (!java.util.Objects.equals(excludeResourceRules, that.excludeResourceRules)) return false;
    if (!java.util.Objects.equals(matchPolicy, that.matchPolicy)) return false;
    if (!java.util.Objects.equals(namespaceSelector, that.namespaceSelector)) return false;
    if (!java.util.Objects.equals(objectSelector, that.objectSelector)) return false;
    if (!java.util.Objects.equals(resourceRules, that.resourceRules)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(excludeResourceRules,  matchPolicy,  namespaceSelector,  objectSelector,  resourceRules,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (excludeResourceRules != null && !excludeResourceRules.isEmpty()) { sb.append("excludeResourceRules:"); sb.append(excludeResourceRules + ","); }
    if (matchPolicy != null) { sb.append("matchPolicy:"); sb.append(matchPolicy + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (objectSelector != null) { sb.append("objectSelector:"); sb.append(objectSelector + ","); }
    if (resourceRules != null && !resourceRules.isEmpty()) { sb.append("resourceRules:"); sb.append(resourceRules); }
    sb.append("}");
    return sb.toString();
  }
  public class ExcludeResourceRulesNested<N> extends V1NamedRuleWithOperationsFluent<ExcludeResourceRulesNested<N>> implements Nested<N>{
    ExcludeResourceRulesNested(int index,V1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1NamedRuleWithOperationsBuilder(this, item);
    }
    V1NamedRuleWithOperationsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1MatchResourcesFluent.this.setToExcludeResourceRules(index,builder.build());
    }
    
    public N endExcludeResourceRule() {
      return and();
    }
    
  
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1MatchResourcesFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  
  }
  public class ObjectSelectorNested<N> extends V1LabelSelectorFluent<ObjectSelectorNested<N>> implements Nested<N>{
    ObjectSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1MatchResourcesFluent.this.withObjectSelector(builder.build());
    }
    
    public N endObjectSelector() {
      return and();
    }
    
  
  }
  public class ResourceRulesNested<N> extends V1NamedRuleWithOperationsFluent<ResourceRulesNested<N>> implements Nested<N>{
    ResourceRulesNested(int index,V1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1NamedRuleWithOperationsBuilder(this, item);
    }
    V1NamedRuleWithOperationsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1MatchResourcesFluent.this.setToResourceRules(index,builder.build());
    }
    
    public N endResourceRule() {
      return and();
    }
    
  
  }

}