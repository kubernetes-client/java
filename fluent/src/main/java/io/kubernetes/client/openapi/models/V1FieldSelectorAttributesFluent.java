package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FieldSelectorAttributesFluent<A extends V1FieldSelectorAttributesFluent<A>> extends BaseFluent<A>{
  public V1FieldSelectorAttributesFluent() {
  }
  
  public V1FieldSelectorAttributesFluent(V1FieldSelectorAttributes instance) {
    this.copyInstance(instance);
  }
  private String rawSelector;
  private ArrayList<V1FieldSelectorRequirementBuilder> requirements;
  
  protected void copyInstance(V1FieldSelectorAttributes instance) {
    instance = (instance != null ? instance : new V1FieldSelectorAttributes());
    if (instance != null) {
          this.withRawSelector(instance.getRawSelector());
          this.withRequirements(instance.getRequirements());
        }
  }
  
  public String getRawSelector() {
    return this.rawSelector;
  }
  
  public A withRawSelector(String rawSelector) {
    this.rawSelector = rawSelector;
    return (A) this;
  }
  
  public boolean hasRawSelector() {
    return this.rawSelector != null;
  }
  
  public A addToRequirements(int index,V1FieldSelectorRequirement item) {
    if (this.requirements == null) {this.requirements = new ArrayList<V1FieldSelectorRequirementBuilder>();}
    V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);
    if (index < 0 || index >= requirements.size()) { _visitables.get("requirements").add(builder); requirements.add(builder); } else { _visitables.get("requirements").add(index, builder); requirements.add(index, builder);}
    return (A)this;
  }
  
  public A setToRequirements(int index,V1FieldSelectorRequirement item) {
    if (this.requirements == null) {this.requirements = new ArrayList<V1FieldSelectorRequirementBuilder>();}
    V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);
    if (index < 0 || index >= requirements.size()) { _visitables.get("requirements").add(builder); requirements.add(builder); } else { _visitables.get("requirements").set(index, builder); requirements.set(index, builder);}
    return (A)this;
  }
  
  public A addToRequirements(io.kubernetes.client.openapi.models.V1FieldSelectorRequirement... items) {
    if (this.requirements == null) {this.requirements = new ArrayList<V1FieldSelectorRequirementBuilder>();}
    for (V1FieldSelectorRequirement item : items) {V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);_visitables.get("requirements").add(builder);this.requirements.add(builder);} return (A)this;
  }
  
  public A addAllToRequirements(Collection<V1FieldSelectorRequirement> items) {
    if (this.requirements == null) {this.requirements = new ArrayList<V1FieldSelectorRequirementBuilder>();}
    for (V1FieldSelectorRequirement item : items) {V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);_visitables.get("requirements").add(builder);this.requirements.add(builder);} return (A)this;
  }
  
  public A removeFromRequirements(io.kubernetes.client.openapi.models.V1FieldSelectorRequirement... items) {
    if (this.requirements == null) return (A)this;
    for (V1FieldSelectorRequirement item : items) {V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);_visitables.get("requirements").remove(builder); this.requirements.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRequirements(Collection<V1FieldSelectorRequirement> items) {
    if (this.requirements == null) return (A)this;
    for (V1FieldSelectorRequirement item : items) {V1FieldSelectorRequirementBuilder builder = new V1FieldSelectorRequirementBuilder(item);_visitables.get("requirements").remove(builder); this.requirements.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRequirements(Predicate<V1FieldSelectorRequirementBuilder> predicate) {
    if (requirements == null) return (A) this;
    final Iterator<V1FieldSelectorRequirementBuilder> each = requirements.iterator();
    final List visitables = _visitables.get("requirements");
    while (each.hasNext()) {
      V1FieldSelectorRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1FieldSelectorRequirement> buildRequirements() {
    return this.requirements != null ? build(requirements) : null;
  }
  
  public V1FieldSelectorRequirement buildRequirement(int index) {
    return this.requirements.get(index).build();
  }
  
  public V1FieldSelectorRequirement buildFirstRequirement() {
    return this.requirements.get(0).build();
  }
  
  public V1FieldSelectorRequirement buildLastRequirement() {
    return this.requirements.get(requirements.size() - 1).build();
  }
  
  public V1FieldSelectorRequirement buildMatchingRequirement(Predicate<V1FieldSelectorRequirementBuilder> predicate) {
      for (V1FieldSelectorRequirementBuilder item : requirements) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequirement(Predicate<V1FieldSelectorRequirementBuilder> predicate) {
      for (V1FieldSelectorRequirementBuilder item : requirements) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequirements(List<V1FieldSelectorRequirement> requirements) {
    if (this.requirements != null) {
      this._visitables.get("requirements").clear();
    }
    if (requirements != null) {
        this.requirements = new ArrayList();
        for (V1FieldSelectorRequirement item : requirements) {
          this.addToRequirements(item);
        }
    } else {
      this.requirements = null;
    }
    return (A) this;
  }
  
  public A withRequirements(io.kubernetes.client.openapi.models.V1FieldSelectorRequirement... requirements) {
    if (this.requirements != null) {
        this.requirements.clear();
        _visitables.remove("requirements");
    }
    if (requirements != null) {
      for (V1FieldSelectorRequirement item : requirements) {
        this.addToRequirements(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequirements() {
    return this.requirements != null && !this.requirements.isEmpty();
  }
  
  public RequirementsNested<A> addNewRequirement() {
    return new RequirementsNested(-1, null);
  }
  
  public RequirementsNested<A> addNewRequirementLike(V1FieldSelectorRequirement item) {
    return new RequirementsNested(-1, item);
  }
  
  public RequirementsNested<A> setNewRequirementLike(int index,V1FieldSelectorRequirement item) {
    return new RequirementsNested(index, item);
  }
  
  public RequirementsNested<A> editRequirement(int index) {
    if (requirements.size() <= index) throw new RuntimeException("Can't edit requirements. Index exceeds size.");
    return setNewRequirementLike(index, buildRequirement(index));
  }
  
  public RequirementsNested<A> editFirstRequirement() {
    if (requirements.size() == 0) throw new RuntimeException("Can't edit first requirements. The list is empty.");
    return setNewRequirementLike(0, buildRequirement(0));
  }
  
  public RequirementsNested<A> editLastRequirement() {
    int index = requirements.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last requirements. The list is empty.");
    return setNewRequirementLike(index, buildRequirement(index));
  }
  
  public RequirementsNested<A> editMatchingRequirement(Predicate<V1FieldSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requirements.size();i++) { 
    if (predicate.test(requirements.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requirements. No match found.");
    return setNewRequirementLike(index, buildRequirement(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1FieldSelectorAttributesFluent that = (V1FieldSelectorAttributesFluent) o;
    if (!java.util.Objects.equals(rawSelector, that.rawSelector)) return false;
    if (!java.util.Objects.equals(requirements, that.requirements)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(rawSelector,  requirements,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (rawSelector != null) { sb.append("rawSelector:"); sb.append(rawSelector + ","); }
    if (requirements != null && !requirements.isEmpty()) { sb.append("requirements:"); sb.append(requirements); }
    sb.append("}");
    return sb.toString();
  }
  public class RequirementsNested<N> extends V1FieldSelectorRequirementFluent<RequirementsNested<N>> implements Nested<N>{
    RequirementsNested(int index,V1FieldSelectorRequirement item) {
      this.index = index;
      this.builder = new V1FieldSelectorRequirementBuilder(this, item);
    }
    V1FieldSelectorRequirementBuilder builder;
    int index;
    
    public N and() {
      return (N) V1FieldSelectorAttributesFluent.this.setToRequirements(index,builder.build());
    }
    
    public N endRequirement() {
      return and();
    }
    
  
  }

}