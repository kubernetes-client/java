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
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodFailurePolicyRuleFluent<A extends io.kubernetes.client.openapi.models.V1PodFailurePolicyRuleFluent<A>> extends BaseFluent<A>{

  private String action;
  private V1PodFailurePolicyOnExitCodesRequirementBuilder onExitCodes;
  private ArrayList<V1PodFailurePolicyOnPodConditionsPatternBuilder> onPodConditions;

  public V1PodFailurePolicyRuleFluent() {
  }
  
  public V1PodFailurePolicyRuleFluent(V1PodFailurePolicyRule instance) {
    this.copyInstance(instance);
  }

  public A addAllToOnPodConditions(Collection<V1PodFailurePolicyOnPodConditionsPattern> items) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList();
    }
    for (V1PodFailurePolicyOnPodConditionsPattern item : items) {
        V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
        _visitables.get("onPodConditions").add(builder);
        this.onPodConditions.add(builder);
    }
    return (A) this;
  }
  
  public OnPodConditionsNested<A> addNewOnPodCondition() {
    return new OnPodConditionsNested(-1, null);
  }
  
  public OnPodConditionsNested<A> addNewOnPodConditionLike(V1PodFailurePolicyOnPodConditionsPattern item) {
    return new OnPodConditionsNested(-1, item);
  }
  
  public A addToOnPodConditions(V1PodFailurePolicyOnPodConditionsPattern... items) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList();
    }
    for (V1PodFailurePolicyOnPodConditionsPattern item : items) {
        V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
        _visitables.get("onPodConditions").add(builder);
        this.onPodConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToOnPodConditions(int index,V1PodFailurePolicyOnPodConditionsPattern item) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList();
    }
    V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
    if (index < 0 || index >= onPodConditions.size()) {
        _visitables.get("onPodConditions").add(builder);
        onPodConditions.add(builder);
    } else {
        _visitables.get("onPodConditions").add(builder);
        onPodConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1PodFailurePolicyOnPodConditionsPattern buildFirstOnPodCondition() {
    return this.onPodConditions.get(0).build();
  }
  
  public V1PodFailurePolicyOnPodConditionsPattern buildLastOnPodCondition() {
    return this.onPodConditions.get(onPodConditions.size() - 1).build();
  }
  
  public V1PodFailurePolicyOnPodConditionsPattern buildMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate) {
      for (V1PodFailurePolicyOnPodConditionsPatternBuilder item : onPodConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1PodFailurePolicyOnExitCodesRequirement buildOnExitCodes() {
    return this.onExitCodes != null ? this.onExitCodes.build() : null;
  }
  
  public V1PodFailurePolicyOnPodConditionsPattern buildOnPodCondition(int index) {
    return this.onPodConditions.get(index).build();
  }
  
  public List<V1PodFailurePolicyOnPodConditionsPattern> buildOnPodConditions() {
    return this.onPodConditions != null ? build(onPodConditions) : null;
  }
  
  protected void copyInstance(V1PodFailurePolicyRule instance) {
    instance = instance != null ? instance : new V1PodFailurePolicyRule();
    if (instance != null) {
        this.withAction(instance.getAction());
        this.withOnExitCodes(instance.getOnExitCodes());
        this.withOnPodConditions(instance.getOnPodConditions());
    }
  }
  
  public OnPodConditionsNested<A> editFirstOnPodCondition() {
    if (onPodConditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "onPodConditions"));
    }
    return this.setNewOnPodConditionLike(0, this.buildOnPodCondition(0));
  }
  
  public OnPodConditionsNested<A> editLastOnPodCondition() {
    int index = onPodConditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "onPodConditions"));
    }
    return this.setNewOnPodConditionLike(index, this.buildOnPodCondition(index));
  }
  
  public OnPodConditionsNested<A> editMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < onPodConditions.size();i++) {
      if (predicate.test(onPodConditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "onPodConditions"));
    }
    return this.setNewOnPodConditionLike(index, this.buildOnPodCondition(index));
  }
  
  public OnExitCodesNested<A> editOnExitCodes() {
    return this.withNewOnExitCodesLike(Optional.ofNullable(this.buildOnExitCodes()).orElse(null));
  }
  
  public OnPodConditionsNested<A> editOnPodCondition(int index) {
    if (onPodConditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "onPodConditions"));
    }
    return this.setNewOnPodConditionLike(index, this.buildOnPodCondition(index));
  }
  
  public OnExitCodesNested<A> editOrNewOnExitCodes() {
    return this.withNewOnExitCodesLike(Optional.ofNullable(this.buildOnExitCodes()).orElse(new V1PodFailurePolicyOnExitCodesRequirementBuilder().build()));
  }
  
  public OnExitCodesNested<A> editOrNewOnExitCodesLike(V1PodFailurePolicyOnExitCodesRequirement item) {
    return this.withNewOnExitCodesLike(Optional.ofNullable(this.buildOnExitCodes()).orElse(item));
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
    V1PodFailurePolicyRuleFluent that = (V1PodFailurePolicyRuleFluent) o;
    if (!(Objects.equals(action, that.action))) {
      return false;
    }
    if (!(Objects.equals(onExitCodes, that.onExitCodes))) {
      return false;
    }
    if (!(Objects.equals(onPodConditions, that.onPodConditions))) {
      return false;
    }
    return true;
  }
  
  public String getAction() {
    return this.action;
  }
  
  public boolean hasAction() {
    return this.action != null;
  }
  
  public boolean hasMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate) {
      for (V1PodFailurePolicyOnPodConditionsPatternBuilder item : onPodConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasOnExitCodes() {
    return this.onExitCodes != null;
  }
  
  public boolean hasOnPodConditions() {
    return this.onPodConditions != null && !(this.onPodConditions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(action, onExitCodes, onPodConditions);
  }
  
  public A removeAllFromOnPodConditions(Collection<V1PodFailurePolicyOnPodConditionsPattern> items) {
    if (this.onPodConditions == null) {
      return (A) this;
    }
    for (V1PodFailurePolicyOnPodConditionsPattern item : items) {
        V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
        _visitables.get("onPodConditions").remove(builder);
        this.onPodConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromOnPodConditions(V1PodFailurePolicyOnPodConditionsPattern... items) {
    if (this.onPodConditions == null) {
      return (A) this;
    }
    for (V1PodFailurePolicyOnPodConditionsPattern item : items) {
        V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
        _visitables.get("onPodConditions").remove(builder);
        this.onPodConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromOnPodConditions(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate) {
    if (onPodConditions == null) {
      return (A) this;
    }
    Iterator<V1PodFailurePolicyOnPodConditionsPatternBuilder> each = onPodConditions.iterator();
    List visitables = _visitables.get("onPodConditions");
    while (each.hasNext()) {
        V1PodFailurePolicyOnPodConditionsPatternBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public OnPodConditionsNested<A> setNewOnPodConditionLike(int index,V1PodFailurePolicyOnPodConditionsPattern item) {
    return new OnPodConditionsNested(index, item);
  }
  
  public A setToOnPodConditions(int index,V1PodFailurePolicyOnPodConditionsPattern item) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList();
    }
    V1PodFailurePolicyOnPodConditionsPatternBuilder builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(item);
    if (index < 0 || index >= onPodConditions.size()) {
        _visitables.get("onPodConditions").add(builder);
        onPodConditions.add(builder);
    } else {
        _visitables.get("onPodConditions").add(builder);
        onPodConditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(action == null)) {
        sb.append("action:");
        sb.append(action);
        sb.append(",");
    }
    if (!(onExitCodes == null)) {
        sb.append("onExitCodes:");
        sb.append(onExitCodes);
        sb.append(",");
    }
    if (!(onPodConditions == null) && !(onPodConditions.isEmpty())) {
        sb.append("onPodConditions:");
        sb.append(onPodConditions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAction(String action) {
    this.action = action;
    return (A) this;
  }
  
  public OnExitCodesNested<A> withNewOnExitCodes() {
    return new OnExitCodesNested(null);
  }
  
  public OnExitCodesNested<A> withNewOnExitCodesLike(V1PodFailurePolicyOnExitCodesRequirement item) {
    return new OnExitCodesNested(item);
  }
  
  public A withOnExitCodes(V1PodFailurePolicyOnExitCodesRequirement onExitCodes) {
    this._visitables.remove("onExitCodes");
    if (onExitCodes != null) {
        this.onExitCodes = new V1PodFailurePolicyOnExitCodesRequirementBuilder(onExitCodes);
        this._visitables.get("onExitCodes").add(this.onExitCodes);
    } else {
        this.onExitCodes = null;
        this._visitables.get("onExitCodes").remove(this.onExitCodes);
    }
    return (A) this;
  }
  
  public A withOnPodConditions(List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
    if (this.onPodConditions != null) {
      this._visitables.get("onPodConditions").clear();
    }
    if (onPodConditions != null) {
        this.onPodConditions = new ArrayList();
        for (V1PodFailurePolicyOnPodConditionsPattern item : onPodConditions) {
          this.addToOnPodConditions(item);
        }
    } else {
      this.onPodConditions = null;
    }
    return (A) this;
  }
  
  public A withOnPodConditions(V1PodFailurePolicyOnPodConditionsPattern... onPodConditions) {
    if (this.onPodConditions != null) {
        this.onPodConditions.clear();
        _visitables.remove("onPodConditions");
    }
    if (onPodConditions != null) {
      for (V1PodFailurePolicyOnPodConditionsPattern item : onPodConditions) {
        this.addToOnPodConditions(item);
      }
    }
    return (A) this;
  }
  public class OnExitCodesNested<N> extends V1PodFailurePolicyOnExitCodesRequirementFluent<OnExitCodesNested<N>> implements Nested<N>{
  
    V1PodFailurePolicyOnExitCodesRequirementBuilder builder;
  
    OnExitCodesNested(V1PodFailurePolicyOnExitCodesRequirement item) {
      this.builder = new V1PodFailurePolicyOnExitCodesRequirementBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodFailurePolicyRuleFluent.this.withOnExitCodes(builder.build());
    }
    
    public N endOnExitCodes() {
      return and();
    }
    
  }
  public class OnPodConditionsNested<N> extends V1PodFailurePolicyOnPodConditionsPatternFluent<OnPodConditionsNested<N>> implements Nested<N>{
  
    V1PodFailurePolicyOnPodConditionsPatternBuilder builder;
    int index;
  
    OnPodConditionsNested(int index,V1PodFailurePolicyOnPodConditionsPattern item) {
      this.index = index;
      this.builder = new V1PodFailurePolicyOnPodConditionsPatternBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodFailurePolicyRuleFluent.this.setToOnPodConditions(index, builder.build());
    }
    
    public N endOnPodCondition() {
      return and();
    }
    
  }
}