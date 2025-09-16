package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1MatchResourcesFluent<A extends io.kubernetes.client.openapi.models.V1beta1MatchResourcesFluent<A>> extends BaseFluent<A>{
  public V1beta1MatchResourcesFluent() {
  }
  
  public V1beta1MatchResourcesFluent(V1beta1MatchResources instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1beta1NamedRuleWithOperationsBuilder> excludeResourceRules;
  private String matchPolicy;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private ArrayList<V1beta1NamedRuleWithOperationsBuilder> resourceRules;
  
  protected void copyInstance(V1beta1MatchResources instance) {
    instance = instance != null ? instance : new V1beta1MatchResources();
    if (instance != null) {
        this.withExcludeResourceRules(instance.getExcludeResourceRules());
        this.withMatchPolicy(instance.getMatchPolicy());
        this.withNamespaceSelector(instance.getNamespaceSelector());
        this.withObjectSelector(instance.getObjectSelector());
        this.withResourceRules(instance.getResourceRules());
    }
  }
  
  public A addToExcludeResourceRules(int index,V1beta1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {
      this.excludeResourceRules = new ArrayList();
    }
    V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) {
        _visitables.get("excludeResourceRules").add(builder);
        excludeResourceRules.add(builder);
    } else {
        _visitables.get("excludeResourceRules").add(builder);
        excludeResourceRules.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToExcludeResourceRules(int index,V1beta1NamedRuleWithOperations item) {
    if (this.excludeResourceRules == null) {
      this.excludeResourceRules = new ArrayList();
    }
    V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= excludeResourceRules.size()) {
        _visitables.get("excludeResourceRules").add(builder);
        excludeResourceRules.add(builder);
    } else {
        _visitables.get("excludeResourceRules").add(builder);
        excludeResourceRules.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToExcludeResourceRules(V1beta1NamedRuleWithOperations... items) {
    if (this.excludeResourceRules == null) {
      this.excludeResourceRules = new ArrayList();
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("excludeResourceRules").add(builder);
        this.excludeResourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToExcludeResourceRules(Collection<V1beta1NamedRuleWithOperations> items) {
    if (this.excludeResourceRules == null) {
      this.excludeResourceRules = new ArrayList();
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("excludeResourceRules").add(builder);
        this.excludeResourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromExcludeResourceRules(V1beta1NamedRuleWithOperations... items) {
    if (this.excludeResourceRules == null) {
      return (A) this;
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("excludeResourceRules").remove(builder);
        this.excludeResourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromExcludeResourceRules(Collection<V1beta1NamedRuleWithOperations> items) {
    if (this.excludeResourceRules == null) {
      return (A) this;
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("excludeResourceRules").remove(builder);
        this.excludeResourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromExcludeResourceRules(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
    if (excludeResourceRules == null) {
      return (A) this;
    }
    Iterator<V1beta1NamedRuleWithOperationsBuilder> each = excludeResourceRules.iterator();
    List visitables = _visitables.get("excludeResourceRules");
    while (each.hasNext()) {
        V1beta1NamedRuleWithOperationsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1NamedRuleWithOperations> buildExcludeResourceRules() {
    return this.excludeResourceRules != null ? build(excludeResourceRules) : null;
  }
  
  public V1beta1NamedRuleWithOperations buildExcludeResourceRule(int index) {
    return this.excludeResourceRules.get(index).build();
  }
  
  public V1beta1NamedRuleWithOperations buildFirstExcludeResourceRule() {
    return this.excludeResourceRules.get(0).build();
  }
  
  public V1beta1NamedRuleWithOperations buildLastExcludeResourceRule() {
    return this.excludeResourceRules.get(excludeResourceRules.size() - 1).build();
  }
  
  public V1beta1NamedRuleWithOperations buildMatchingExcludeResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
      for (V1beta1NamedRuleWithOperationsBuilder item : excludeResourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingExcludeResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
      for (V1beta1NamedRuleWithOperationsBuilder item : excludeResourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withExcludeResourceRules(List<V1beta1NamedRuleWithOperations> excludeResourceRules) {
    if (this.excludeResourceRules != null) {
      this._visitables.get("excludeResourceRules").clear();
    }
    if (excludeResourceRules != null) {
        this.excludeResourceRules = new ArrayList();
        for (V1beta1NamedRuleWithOperations item : excludeResourceRules) {
          this.addToExcludeResourceRules(item);
        }
    } else {
      this.excludeResourceRules = null;
    }
    return (A) this;
  }
  
  public A withExcludeResourceRules(V1beta1NamedRuleWithOperations... excludeResourceRules) {
    if (this.excludeResourceRules != null) {
        this.excludeResourceRules.clear();
        _visitables.remove("excludeResourceRules");
    }
    if (excludeResourceRules != null) {
      for (V1beta1NamedRuleWithOperations item : excludeResourceRules) {
        this.addToExcludeResourceRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasExcludeResourceRules() {
    return this.excludeResourceRules != null && !(this.excludeResourceRules.isEmpty());
  }
  
  public ExcludeResourceRulesNested<A> addNewExcludeResourceRule() {
    return new ExcludeResourceRulesNested(-1, null);
  }
  
  public ExcludeResourceRulesNested<A> addNewExcludeResourceRuleLike(V1beta1NamedRuleWithOperations item) {
    return new ExcludeResourceRulesNested(-1, item);
  }
  
  public ExcludeResourceRulesNested<A> setNewExcludeResourceRuleLike(int index,V1beta1NamedRuleWithOperations item) {
    return new ExcludeResourceRulesNested(index, item);
  }
  
  public ExcludeResourceRulesNested<A> editExcludeResourceRule(int index) {
    if (index <= excludeResourceRules.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "excludeResourceRules"));
    }
    return this.setNewExcludeResourceRuleLike(index, this.buildExcludeResourceRule(index));
  }
  
  public ExcludeResourceRulesNested<A> editFirstExcludeResourceRule() {
    if (excludeResourceRules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "excludeResourceRules"));
    }
    return this.setNewExcludeResourceRuleLike(0, this.buildExcludeResourceRule(0));
  }
  
  public ExcludeResourceRulesNested<A> editLastExcludeResourceRule() {
    int index = excludeResourceRules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "excludeResourceRules"));
    }
    return this.setNewExcludeResourceRuleLike(index, this.buildExcludeResourceRule(index));
  }
  
  public ExcludeResourceRulesNested<A> editMatchingExcludeResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < excludeResourceRules.size();i++) {
      if (predicate.test(excludeResourceRules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "excludeResourceRules"));
    }
    return this.setNewExcludeResourceRuleLike(index, this.buildExcludeResourceRule(index));
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
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(item));
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
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(null));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelector() {
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(item));
  }
  
  public A addToResourceRules(int index,V1beta1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(builder);
    } else {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToResourceRules(int index,V1beta1NamedRuleWithOperations item) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
    if (index < 0 || index >= resourceRules.size()) {
        _visitables.get("resourceRules").add(builder);
        resourceRules.add(builder);
    } else {
        _visitables.get("resourceRules").add(builder);
        resourceRules.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToResourceRules(V1beta1NamedRuleWithOperations... items) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("resourceRules").add(builder);
        this.resourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResourceRules(Collection<V1beta1NamedRuleWithOperations> items) {
    if (this.resourceRules == null) {
      this.resourceRules = new ArrayList();
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("resourceRules").add(builder);
        this.resourceRules.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromResourceRules(V1beta1NamedRuleWithOperations... items) {
    if (this.resourceRules == null) {
      return (A) this;
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("resourceRules").remove(builder);
        this.resourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResourceRules(Collection<V1beta1NamedRuleWithOperations> items) {
    if (this.resourceRules == null) {
      return (A) this;
    }
    for (V1beta1NamedRuleWithOperations item : items) {
        V1beta1NamedRuleWithOperationsBuilder builder = new V1beta1NamedRuleWithOperationsBuilder(item);
        _visitables.get("resourceRules").remove(builder);
        this.resourceRules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResourceRules(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
    if (resourceRules == null) {
      return (A) this;
    }
    Iterator<V1beta1NamedRuleWithOperationsBuilder> each = resourceRules.iterator();
    List visitables = _visitables.get("resourceRules");
    while (each.hasNext()) {
        V1beta1NamedRuleWithOperationsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1NamedRuleWithOperations> buildResourceRules() {
    return this.resourceRules != null ? build(resourceRules) : null;
  }
  
  public V1beta1NamedRuleWithOperations buildResourceRule(int index) {
    return this.resourceRules.get(index).build();
  }
  
  public V1beta1NamedRuleWithOperations buildFirstResourceRule() {
    return this.resourceRules.get(0).build();
  }
  
  public V1beta1NamedRuleWithOperations buildLastResourceRule() {
    return this.resourceRules.get(resourceRules.size() - 1).build();
  }
  
  public V1beta1NamedRuleWithOperations buildMatchingResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
      for (V1beta1NamedRuleWithOperationsBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
      for (V1beta1NamedRuleWithOperationsBuilder item : resourceRules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceRules(List<V1beta1NamedRuleWithOperations> resourceRules) {
    if (this.resourceRules != null) {
      this._visitables.get("resourceRules").clear();
    }
    if (resourceRules != null) {
        this.resourceRules = new ArrayList();
        for (V1beta1NamedRuleWithOperations item : resourceRules) {
          this.addToResourceRules(item);
        }
    } else {
      this.resourceRules = null;
    }
    return (A) this;
  }
  
  public A withResourceRules(V1beta1NamedRuleWithOperations... resourceRules) {
    if (this.resourceRules != null) {
        this.resourceRules.clear();
        _visitables.remove("resourceRules");
    }
    if (resourceRules != null) {
      for (V1beta1NamedRuleWithOperations item : resourceRules) {
        this.addToResourceRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceRules() {
    return this.resourceRules != null && !(this.resourceRules.isEmpty());
  }
  
  public ResourceRulesNested<A> addNewResourceRule() {
    return new ResourceRulesNested(-1, null);
  }
  
  public ResourceRulesNested<A> addNewResourceRuleLike(V1beta1NamedRuleWithOperations item) {
    return new ResourceRulesNested(-1, item);
  }
  
  public ResourceRulesNested<A> setNewResourceRuleLike(int index,V1beta1NamedRuleWithOperations item) {
    return new ResourceRulesNested(index, item);
  }
  
  public ResourceRulesNested<A> editResourceRule(int index) {
    if (index <= resourceRules.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
  }
  
  public ResourceRulesNested<A> editFirstResourceRule() {
    if (resourceRules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(0, this.buildResourceRule(0));
  }
  
  public ResourceRulesNested<A> editLastResourceRule() {
    int index = resourceRules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
  }
  
  public ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1beta1NamedRuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resourceRules.size();i++) {
      if (predicate.test(resourceRules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resourceRules"));
    }
    return this.setNewResourceRuleLike(index, this.buildResourceRule(index));
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
    V1beta1MatchResourcesFluent that = (V1beta1MatchResourcesFluent) o;
    if (!(Objects.equals(excludeResourceRules, that.excludeResourceRules))) {
      return false;
    }
    if (!(Objects.equals(matchPolicy, that.matchPolicy))) {
      return false;
    }
    if (!(Objects.equals(namespaceSelector, that.namespaceSelector))) {
      return false;
    }
    if (!(Objects.equals(objectSelector, that.objectSelector))) {
      return false;
    }
    if (!(Objects.equals(resourceRules, that.resourceRules))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(excludeResourceRules, matchPolicy, namespaceSelector, objectSelector, resourceRules);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(excludeResourceRules == null) && !(excludeResourceRules.isEmpty())) {
        sb.append("excludeResourceRules:");
        sb.append(excludeResourceRules);
        sb.append(",");
    }
    if (!(matchPolicy == null)) {
        sb.append("matchPolicy:");
        sb.append(matchPolicy);
        sb.append(",");
    }
    if (!(namespaceSelector == null)) {
        sb.append("namespaceSelector:");
        sb.append(namespaceSelector);
        sb.append(",");
    }
    if (!(objectSelector == null)) {
        sb.append("objectSelector:");
        sb.append(objectSelector);
        sb.append(",");
    }
    if (!(resourceRules == null) && !(resourceRules.isEmpty())) {
        sb.append("resourceRules:");
        sb.append(resourceRules);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ExcludeResourceRulesNested<N> extends V1beta1NamedRuleWithOperationsFluent<ExcludeResourceRulesNested<N>> implements Nested<N>{
    ExcludeResourceRulesNested(int index,V1beta1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1beta1NamedRuleWithOperationsBuilder(this, item);
    }
    V1beta1NamedRuleWithOperationsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1MatchResourcesFluent.this.setToExcludeResourceRules(index, builder.build());
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
      return (N) V1beta1MatchResourcesFluent.this.withNamespaceSelector(builder.build());
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
      return (N) V1beta1MatchResourcesFluent.this.withObjectSelector(builder.build());
    }
    
    public N endObjectSelector() {
      return and();
    }
    
  
  }
  public class ResourceRulesNested<N> extends V1beta1NamedRuleWithOperationsFluent<ResourceRulesNested<N>> implements Nested<N>{
    ResourceRulesNested(int index,V1beta1NamedRuleWithOperations item) {
      this.index = index;
      this.builder = new V1beta1NamedRuleWithOperationsBuilder(this, item);
    }
    V1beta1NamedRuleWithOperationsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1MatchResourcesFluent.this.setToResourceRules(index, builder.build());
    }
    
    public N endResourceRule() {
      return and();
    }
    
  
  }

}