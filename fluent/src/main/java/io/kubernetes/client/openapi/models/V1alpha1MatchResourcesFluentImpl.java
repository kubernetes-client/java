package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1MatchResourcesFluentImpl<A extends V1alpha1MatchResourcesFluent<A>> extends BaseFluent<A> implements V1alpha1MatchResourcesFluent<A>{
  public V1alpha1MatchResourcesFluentImpl() {
  }
  public V1alpha1MatchResourcesFluentImpl(V1alpha1MatchResources instance) {
    if (instance != null) {
      this.withExcludeResourceRules(instance.getExcludeResourceRules());
      this.withMatchPolicy(instance.getMatchPolicy());
      this.withNamespaceSelector(instance.getNamespaceSelector());
      this.withObjectSelector(instance.getObjectSelector());
      this.withResourceRules(instance.getResourceRules());
    }
  }
  private ArrayList<V1alpha1NamedRuleWithOperationsBuilder> excludeResourceRules;
  private String matchPolicy;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private ArrayList<V1alpha1NamedRuleWithOperationsBuilder> resourceRules;
  public A addToExcludeResourceRules(int index,V1alpha1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) { _visitables.get("excludeResourceRules").add(builder); excludeResourceRules.add(builder); } else { _visitables.get("excludeResourceRules").add(index, builder); excludeResourceRules.add(index, builder);}
    return (A)this;
  }
  public A setToExcludeResourceRules(int index,V1alpha1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) { _visitables.get("excludeResourceRules").add(builder); excludeResourceRules.add(builder); } else { _visitables.get("excludeResourceRules").set(index, builder); excludeResourceRules.set(index, builder);}
    return (A)this;
  }
  public A addToExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").add(builder);this.excludeResourceRules.add(builder);} return (A)this;
  }
  public A addAllToExcludeResourceRules(Collection<V1alpha1NamedRuleWithOperations> items) {
    if (this.excludeResourceRules == null) {this.excludeResourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").add(builder);this.excludeResourceRules.add(builder);} return (A)this;
  }
  public A removeFromExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items) {
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").remove(builder);if (this.excludeResourceRules != null) {this.excludeResourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromExcludeResourceRules(Collection<V1alpha1NamedRuleWithOperations> items) {
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("excludeResourceRules").remove(builder);if (this.excludeResourceRules != null) {this.excludeResourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromExcludeResourceRules(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    if (excludeResourceRules == null) return (A) this;
    final Iterator<V1alpha1NamedRuleWithOperationsBuilder> each = excludeResourceRules.iterator();
    final List visitables = _visitables.get("excludeResourceRules");
    while (each.hasNext()) {
      V1alpha1NamedRuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildExcludeResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1NamedRuleWithOperations> getExcludeResourceRules() {
    return excludeResourceRules != null ? build(excludeResourceRules) : null;
  }
  public List<V1alpha1NamedRuleWithOperations> buildExcludeResourceRules() {
    return excludeResourceRules != null ? build(excludeResourceRules) : null;
  }
  public V1alpha1NamedRuleWithOperations buildExcludeResourceRule(int index) {
    return this.excludeResourceRules.get(index).build();
  }
  public V1alpha1NamedRuleWithOperations buildFirstExcludeResourceRule() {
    return this.excludeResourceRules.get(0).build();
  }
  public V1alpha1NamedRuleWithOperations buildLastExcludeResourceRule() {
    return this.excludeResourceRules.get(excludeResourceRules.size() - 1).build();
  }
  public V1alpha1NamedRuleWithOperations buildMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    for (V1alpha1NamedRuleWithOperationsBuilder item: excludeResourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    for (V1alpha1NamedRuleWithOperationsBuilder item: excludeResourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withExcludeResourceRules(List<V1alpha1NamedRuleWithOperations> excludeResourceRules) {
    if (this.excludeResourceRules != null) { _visitables.get("excludeResourceRules").clear();}
    if (excludeResourceRules != null) {this.excludeResourceRules = new ArrayList(); for (V1alpha1NamedRuleWithOperations item : excludeResourceRules){this.addToExcludeResourceRules(item);}} else { this.excludeResourceRules = null;} return (A) this;
  }
  public A withExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... excludeResourceRules) {
    if (this.excludeResourceRules != null) {this.excludeResourceRules.clear(); _visitables.remove("excludeResourceRules"); }
    if (excludeResourceRules != null) {for (V1alpha1NamedRuleWithOperations item :excludeResourceRules){ this.addToExcludeResourceRules(item);}} return (A) this;
  }
  public Boolean hasExcludeResourceRules() {
    return excludeResourceRules != null && !excludeResourceRules.isEmpty();
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> addNewExcludeResourceRule() {
    return new V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNestedImpl();
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> addNewExcludeResourceRuleLike(V1alpha1NamedRuleWithOperations item) {
    return new V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNestedImpl(-1, item);
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> setNewExcludeResourceRuleLike(int index,V1alpha1NamedRuleWithOperations item) {
    return new V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNestedImpl(index, item);
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> editExcludeResourceRule(int index) {
    if (excludeResourceRules.size() <= index) throw new RuntimeException("Can't edit excludeResourceRules. Index exceeds size.");
    return setNewExcludeResourceRuleLike(index, buildExcludeResourceRule(index));
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> editFirstExcludeResourceRule() {
    if (excludeResourceRules.size() == 0) throw new RuntimeException("Can't edit first excludeResourceRules. The list is empty.");
    return setNewExcludeResourceRuleLike(0, buildExcludeResourceRule(0));
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> editLastExcludeResourceRule() {
    int index = excludeResourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last excludeResourceRules. The list is empty.");
    return setNewExcludeResourceRuleLike(index, buildExcludeResourceRule(index));
  }
  public V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<A> editMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
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
    this.matchPolicy=matchPolicy; return (A) this;
  }
  public Boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    _visitables.get("namespaceSelector").remove(this.namespaceSelector);
    if (namespaceSelector!=null){ this.namespaceSelector= new V1LabelSelectorBuilder(namespaceSelector); _visitables.get("namespaceSelector").add(this.namespaceSelector);} else { this.namespaceSelector = null; _visitables.get("namespaceSelector").remove(this.namespaceSelector); } return (A) this;
  }
  public Boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  public V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNestedImpl();
  }
  public V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNestedImpl(item);
  }
  public V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }
  public V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getObjectSelector() {
    return this.objectSelector!=null ?this.objectSelector.build():null;
  }
  public V1LabelSelector buildObjectSelector() {
    return this.objectSelector!=null ?this.objectSelector.build():null;
  }
  public A withObjectSelector(V1LabelSelector objectSelector) {
    _visitables.get("objectSelector").remove(this.objectSelector);
    if (objectSelector!=null){ this.objectSelector= new V1LabelSelectorBuilder(objectSelector); _visitables.get("objectSelector").add(this.objectSelector);} else { this.objectSelector = null; _visitables.get("objectSelector").remove(this.objectSelector); } return (A) this;
  }
  public Boolean hasObjectSelector() {
    return this.objectSelector != null;
  }
  public V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<A> withNewObjectSelector() {
    return new V1alpha1MatchResourcesFluentImpl.ObjectSelectorNestedImpl();
  }
  public V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item) {
    return new V1alpha1MatchResourcesFluentImpl.ObjectSelectorNestedImpl(item);
  }
  public V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<A> editObjectSelector() {
    return withNewObjectSelectorLike(getObjectSelector());
  }
  public V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<A> editOrNewObjectSelector() {
    return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): item);
  }
  public A addToResourceRules(int index,V1alpha1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) { _visitables.get("resourceRules").add(builder); resourceRules.add(builder); } else { _visitables.get("resourceRules").add(index, builder); resourceRules.add(index, builder);}
    return (A)this;
  }
  public A setToResourceRules(int index,V1alpha1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) { _visitables.get("resourceRules").add(builder); resourceRules.add(builder); } else { _visitables.get("resourceRules").set(index, builder); resourceRules.set(index, builder);}
    return (A)this;
  }
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A addAllToResourceRules(Collection<V1alpha1NamedRuleWithOperations> items) {
    if (this.resourceRules == null) {this.resourceRules = new ArrayList<V1alpha1NamedRuleWithOperationsBuilder>();}
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
  }
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items) {
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeAllFromResourceRules(Collection<V1alpha1NamedRuleWithOperations> items) {
    for (V1alpha1NamedRuleWithOperations item : items) {V1alpha1NamedRuleWithOperationsBuilder builder = new V1alpha1NamedRuleWithOperationsBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResourceRules(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    if (resourceRules == null) return (A) this;
    final Iterator<V1alpha1NamedRuleWithOperationsBuilder> each = resourceRules.iterator();
    final List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
      V1alpha1NamedRuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1NamedRuleWithOperations> getResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public List<V1alpha1NamedRuleWithOperations> buildResourceRules() {
    return resourceRules != null ? build(resourceRules) : null;
  }
  public V1alpha1NamedRuleWithOperations buildResourceRule(int index) {
    return this.resourceRules.get(index).build();
  }
  public V1alpha1NamedRuleWithOperations buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  public V1alpha1NamedRuleWithOperations buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  public V1alpha1NamedRuleWithOperations buildMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    for (V1alpha1NamedRuleWithOperationsBuilder item: resourceRules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
    for (V1alpha1NamedRuleWithOperationsBuilder item: resourceRules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResourceRules(List<V1alpha1NamedRuleWithOperations> resourceRules) {
    if (this.resourceRules != null) { _visitables.get("resourceRules").clear();}
    if (resourceRules != null) {this.resourceRules = new ArrayList(); for (V1alpha1NamedRuleWithOperations item : resourceRules){this.addToResourceRules(item);}} else { this.resourceRules = null;} return (A) this;
  }
  public A withResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... resourceRules) {
    if (this.resourceRules != null) {this.resourceRules.clear(); _visitables.remove("resourceRules"); }
    if (resourceRules != null) {for (V1alpha1NamedRuleWithOperations item :resourceRules){ this.addToResourceRules(item);}} return (A) this;
  }
  public Boolean hasResourceRules() {
    return resourceRules != null && !resourceRules.isEmpty();
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> addNewResourceRule() {
    return new V1alpha1MatchResourcesFluentImpl.ResourceRulesNestedImpl();
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> addNewResourceRuleLike(V1alpha1NamedRuleWithOperations item) {
    return new V1alpha1MatchResourcesFluentImpl.ResourceRulesNestedImpl(-1, item);
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> setNewResourceRuleLike(int index,V1alpha1NamedRuleWithOperations item) {
    return new V1alpha1MatchResourcesFluentImpl.ResourceRulesNestedImpl(index, item);
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> editResourceRule(int index) {
    if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
    return setNewResourceRuleLike(0, buildResourceRule(0));
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
    return setNewResourceRuleLike(index, buildResourceRule(index));
  }
  public V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate) {
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
    V1alpha1MatchResourcesFluentImpl that = (V1alpha1MatchResourcesFluentImpl) o;
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
    if (excludeResourceRules != null) { sb.append("excludeResourceRules:"); sb.append(excludeResourceRules + ","); }
    if (matchPolicy != null) { sb.append("matchPolicy:"); sb.append(matchPolicy + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (objectSelector != null) { sb.append("objectSelector:"); sb.append(objectSelector + ","); }
    if (resourceRules != null) { sb.append("resourceRules:"); sb.append(resourceRules); }
    sb.append("}");
    return sb.toString();
  }
  class ExcludeResourceRulesNestedImpl<N> extends V1alpha1NamedRuleWithOperationsFluentImpl<V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<N>> implements V1alpha1MatchResourcesFluentImpl.ExcludeResourceRulesNested<N>,Nested<N>{
    ExcludeResourceRulesNestedImpl(int index,V1alpha1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1alpha1NamedRuleWithOperationsBuilder(this, item);
    }
    ExcludeResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1NamedRuleWithOperationsBuilder(this);
    }
    V1alpha1NamedRuleWithOperationsBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha1MatchResourcesFluentImpl.this.setToExcludeResourceRules(index,builder.build());
    }
    public N endExcludeResourceRule() {
      return and();
    }
    
  }
  class NamespaceSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<N>> implements V1alpha1MatchResourcesFluentImpl.NamespaceSelectorNested<N>,Nested<N>{
    NamespaceSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    NamespaceSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1alpha1MatchResourcesFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  class ObjectSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<N>> implements V1alpha1MatchResourcesFluentImpl.ObjectSelectorNested<N>,Nested<N>{
    ObjectSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    ObjectSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1alpha1MatchResourcesFluentImpl.this.withObjectSelector(builder.build());
    }
    public N endObjectSelector() {
      return and();
    }
    
  }
  class ResourceRulesNestedImpl<N> extends V1alpha1NamedRuleWithOperationsFluentImpl<V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<N>> implements V1alpha1MatchResourcesFluentImpl.ResourceRulesNested<N>,Nested<N>{
    ResourceRulesNestedImpl(int index,V1alpha1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1alpha1NamedRuleWithOperationsBuilder(this, item);
    }
    ResourceRulesNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1NamedRuleWithOperationsBuilder(this);
    }
    V1alpha1NamedRuleWithOperationsBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha1MatchResourcesFluentImpl.this.setToResourceRules(index,builder.build());
    }
    public N endResourceRule() {
      return and();
    }
    
  }
  
}