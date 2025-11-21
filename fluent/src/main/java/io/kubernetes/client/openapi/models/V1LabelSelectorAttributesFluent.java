package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LabelSelectorAttributesFluent<A extends io.kubernetes.client.openapi.models.V1LabelSelectorAttributesFluent<A>> extends BaseFluent<A>{

  private String rawSelector;
  private ArrayList<V1LabelSelectorRequirementBuilder> requirements;

  public V1LabelSelectorAttributesFluent() {
  }
  
  public V1LabelSelectorAttributesFluent(V1LabelSelectorAttributes instance) {
    this.copyInstance(instance);
  }

  public A addAllToRequirements(Collection<V1LabelSelectorRequirement> items) {
    if (this.requirements == null) {
      this.requirements = new ArrayList();
    }
    for (V1LabelSelectorRequirement item : items) {
        V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
        _visitables.get("requirements").add(builder);
        this.requirements.add(builder);
    }
    return (A) this;
  }
  
  public RequirementsNested<A> addNewRequirement() {
    return new RequirementsNested(-1, null);
  }
  
  public RequirementsNested<A> addNewRequirementLike(V1LabelSelectorRequirement item) {
    return new RequirementsNested(-1, item);
  }
  
  public A addToRequirements(V1LabelSelectorRequirement... items) {
    if (this.requirements == null) {
      this.requirements = new ArrayList();
    }
    for (V1LabelSelectorRequirement item : items) {
        V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
        _visitables.get("requirements").add(builder);
        this.requirements.add(builder);
    }
    return (A) this;
  }
  
  public A addToRequirements(int index,V1LabelSelectorRequirement item) {
    if (this.requirements == null) {
      this.requirements = new ArrayList();
    }
    V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
    if (index < 0 || index >= requirements.size()) {
        _visitables.get("requirements").add(builder);
        requirements.add(builder);
    } else {
        _visitables.get("requirements").add(builder);
        requirements.add(index, builder);
    }
    return (A) this;
  }
  
  public V1LabelSelectorRequirement buildFirstRequirement() {
    return this.requirements.get(0).build();
  }
  
  public V1LabelSelectorRequirement buildLastRequirement() {
    return this.requirements.get(requirements.size() - 1).build();
  }
  
  public V1LabelSelectorRequirement buildMatchingRequirement(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
      for (V1LabelSelectorRequirementBuilder item : requirements) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1LabelSelectorRequirement buildRequirement(int index) {
    return this.requirements.get(index).build();
  }
  
  public List<V1LabelSelectorRequirement> buildRequirements() {
    return this.requirements != null ? build(requirements) : null;
  }
  
  protected void copyInstance(V1LabelSelectorAttributes instance) {
    instance = instance != null ? instance : new V1LabelSelectorAttributes();
    if (instance != null) {
        this.withRawSelector(instance.getRawSelector());
        this.withRequirements(instance.getRequirements());
    }
  }
  
  public RequirementsNested<A> editFirstRequirement() {
    if (requirements.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "requirements"));
    }
    return this.setNewRequirementLike(0, this.buildRequirement(0));
  }
  
  public RequirementsNested<A> editLastRequirement() {
    int index = requirements.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "requirements"));
    }
    return this.setNewRequirementLike(index, this.buildRequirement(index));
  }
  
  public RequirementsNested<A> editMatchingRequirement(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < requirements.size();i++) {
      if (predicate.test(requirements.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "requirements"));
    }
    return this.setNewRequirementLike(index, this.buildRequirement(index));
  }
  
  public RequirementsNested<A> editRequirement(int index) {
    if (requirements.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "requirements"));
    }
    return this.setNewRequirementLike(index, this.buildRequirement(index));
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
    V1LabelSelectorAttributesFluent that = (V1LabelSelectorAttributesFluent) o;
    if (!(Objects.equals(rawSelector, that.rawSelector))) {
      return false;
    }
    if (!(Objects.equals(requirements, that.requirements))) {
      return false;
    }
    return true;
  }
  
  public String getRawSelector() {
    return this.rawSelector;
  }
  
  public boolean hasMatchingRequirement(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
      for (V1LabelSelectorRequirementBuilder item : requirements) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasRawSelector() {
    return this.rawSelector != null;
  }
  
  public boolean hasRequirements() {
    return this.requirements != null && !(this.requirements.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(rawSelector, requirements);
  }
  
  public A removeAllFromRequirements(Collection<V1LabelSelectorRequirement> items) {
    if (this.requirements == null) {
      return (A) this;
    }
    for (V1LabelSelectorRequirement item : items) {
        V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
        _visitables.get("requirements").remove(builder);
        this.requirements.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromRequirements(V1LabelSelectorRequirement... items) {
    if (this.requirements == null) {
      return (A) this;
    }
    for (V1LabelSelectorRequirement item : items) {
        V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
        _visitables.get("requirements").remove(builder);
        this.requirements.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRequirements(Predicate<V1LabelSelectorRequirementBuilder> predicate) {
    if (requirements == null) {
      return (A) this;
    }
    Iterator<V1LabelSelectorRequirementBuilder> each = requirements.iterator();
    List visitables = _visitables.get("requirements");
    while (each.hasNext()) {
        V1LabelSelectorRequirementBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public RequirementsNested<A> setNewRequirementLike(int index,V1LabelSelectorRequirement item) {
    return new RequirementsNested(index, item);
  }
  
  public A setToRequirements(int index,V1LabelSelectorRequirement item) {
    if (this.requirements == null) {
      this.requirements = new ArrayList();
    }
    V1LabelSelectorRequirementBuilder builder = new V1LabelSelectorRequirementBuilder(item);
    if (index < 0 || index >= requirements.size()) {
        _visitables.get("requirements").add(builder);
        requirements.add(builder);
    } else {
        _visitables.get("requirements").add(builder);
        requirements.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(rawSelector == null)) {
        sb.append("rawSelector:");
        sb.append(rawSelector);
        sb.append(",");
    }
    if (!(requirements == null) && !(requirements.isEmpty())) {
        sb.append("requirements:");
        sb.append(requirements);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRawSelector(String rawSelector) {
    this.rawSelector = rawSelector;
    return (A) this;
  }
  
  public A withRequirements(List<V1LabelSelectorRequirement> requirements) {
    if (this.requirements != null) {
      this._visitables.get("requirements").clear();
    }
    if (requirements != null) {
        this.requirements = new ArrayList();
        for (V1LabelSelectorRequirement item : requirements) {
          this.addToRequirements(item);
        }
    } else {
      this.requirements = null;
    }
    return (A) this;
  }
  
  public A withRequirements(V1LabelSelectorRequirement... requirements) {
    if (this.requirements != null) {
        this.requirements.clear();
        _visitables.remove("requirements");
    }
    if (requirements != null) {
      for (V1LabelSelectorRequirement item : requirements) {
        this.addToRequirements(item);
      }
    }
    return (A) this;
  }
  public class RequirementsNested<N> extends V1LabelSelectorRequirementFluent<RequirementsNested<N>> implements Nested<N>{
  
    V1LabelSelectorRequirementBuilder builder;
    int index;
  
    RequirementsNested(int index,V1LabelSelectorRequirement item) {
      this.index = index;
      this.builder = new V1LabelSelectorRequirementBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LabelSelectorAttributesFluent.this.setToRequirements(index, builder.build());
    }
    
    public N endRequirement() {
      return and();
    }
    
  }
}