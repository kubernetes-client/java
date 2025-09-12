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
public class V1beta1MutatingAdmissionPolicySpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1MutatingAdmissionPolicySpecFluent<A>> extends BaseFluent<A>{
  public V1beta1MutatingAdmissionPolicySpecFluent() {
  }
  
  public V1beta1MutatingAdmissionPolicySpecFluent(V1beta1MutatingAdmissionPolicySpec instance) {
    this.copyInstance(instance);
  }
  private String failurePolicy;
  private ArrayList<V1beta1MatchConditionBuilder> matchConditions;
  private V1beta1MatchResourcesBuilder matchConstraints;
  private ArrayList<V1beta1MutationBuilder> mutations;
  private V1beta1ParamKindBuilder paramKind;
  private String reinvocationPolicy;
  private ArrayList<V1beta1VariableBuilder> variables;
  
  protected void copyInstance(V1beta1MutatingAdmissionPolicySpec instance) {
    instance = instance != null ? instance : new V1beta1MutatingAdmissionPolicySpec();
    if (instance != null) {
        this.withFailurePolicy(instance.getFailurePolicy());
        this.withMatchConditions(instance.getMatchConditions());
        this.withMatchConstraints(instance.getMatchConstraints());
        this.withMutations(instance.getMutations());
        this.withParamKind(instance.getParamKind());
        this.withReinvocationPolicy(instance.getReinvocationPolicy());
        this.withVariables(instance.getVariables());
    }
  }
  
  public String getFailurePolicy() {
    return this.failurePolicy;
  }
  
  public A withFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return (A) this;
  }
  
  public boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  
  public A addToMatchConditions(int index,V1beta1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToMatchConditions(int index,V1beta1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToMatchConditions(V1beta1MatchCondition... items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1beta1MatchCondition item : items) {
        V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToMatchConditions(Collection<V1beta1MatchCondition> items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1beta1MatchCondition item : items) {
        V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromMatchConditions(V1beta1MatchCondition... items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1beta1MatchCondition item : items) {
        V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromMatchConditions(Collection<V1beta1MatchCondition> items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1beta1MatchCondition item : items) {
        V1beta1MatchConditionBuilder builder = new V1beta1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchConditions(Predicate<V1beta1MatchConditionBuilder> predicate) {
    if (matchConditions == null) {
      return (A) this;
    }
    Iterator<V1beta1MatchConditionBuilder> each = matchConditions.iterator();
    List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
        V1beta1MatchConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1MatchCondition> buildMatchConditions() {
    return this.matchConditions != null ? build(matchConditions) : null;
  }
  
  public V1beta1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  
  public V1beta1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  
  public V1beta1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  
  public V1beta1MatchCondition buildMatchingMatchCondition(Predicate<V1beta1MatchConditionBuilder> predicate) {
      for (V1beta1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchCondition(Predicate<V1beta1MatchConditionBuilder> predicate) {
      for (V1beta1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchConditions(List<V1beta1MatchCondition> matchConditions) {
    if (this.matchConditions != null) {
      this._visitables.get("matchConditions").clear();
    }
    if (matchConditions != null) {
        this.matchConditions = new ArrayList();
        for (V1beta1MatchCondition item : matchConditions) {
          this.addToMatchConditions(item);
        }
    } else {
      this.matchConditions = null;
    }
    return (A) this;
  }
  
  public A withMatchConditions(V1beta1MatchCondition... matchConditions) {
    if (this.matchConditions != null) {
        this.matchConditions.clear();
        _visitables.remove("matchConditions");
    }
    if (matchConditions != null) {
      for (V1beta1MatchCondition item : matchConditions) {
        this.addToMatchConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchConditions() {
    return this.matchConditions != null && !(this.matchConditions.isEmpty());
  }
  
  public MatchConditionsNested<A> addNewMatchCondition() {
    return new MatchConditionsNested(-1, null);
  }
  
  public MatchConditionsNested<A> addNewMatchConditionLike(V1beta1MatchCondition item) {
    return new MatchConditionsNested(-1, item);
  }
  
  public MatchConditionsNested<A> setNewMatchConditionLike(int index,V1beta1MatchCondition item) {
    return new MatchConditionsNested(index, item);
  }
  
  public MatchConditionsNested<A> editMatchCondition(int index) {
    if (index <= matchConditions.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(0, this.buildMatchCondition(0));
  }
  
  public MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1beta1MatchConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < matchConditions.size();i++) {
      if (predicate.test(matchConditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public V1beta1MatchResources buildMatchConstraints() {
    return this.matchConstraints != null ? this.matchConstraints.build() : null;
  }
  
  public A withMatchConstraints(V1beta1MatchResources matchConstraints) {
    this._visitables.remove("matchConstraints");
    if (matchConstraints != null) {
        this.matchConstraints = new V1beta1MatchResourcesBuilder(matchConstraints);
        this._visitables.get("matchConstraints").add(this.matchConstraints);
    } else {
        this.matchConstraints = null;
        this._visitables.get("matchConstraints").remove(this.matchConstraints);
    }
    return (A) this;
  }
  
  public boolean hasMatchConstraints() {
    return this.matchConstraints != null;
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraints() {
    return new MatchConstraintsNested(null);
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraintsLike(V1beta1MatchResources item) {
    return new MatchConstraintsNested(item);
  }
  
  public MatchConstraintsNested<A> editMatchConstraints() {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(null));
  }
  
  public MatchConstraintsNested<A> editOrNewMatchConstraints() {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(new V1beta1MatchResourcesBuilder().build()));
  }
  
  public MatchConstraintsNested<A> editOrNewMatchConstraintsLike(V1beta1MatchResources item) {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(item));
  }
  
  public A addToMutations(int index,V1beta1Mutation item) {
    if (this.mutations == null) {
      this.mutations = new ArrayList();
    }
    V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
    if (index < 0 || index >= mutations.size()) {
        _visitables.get("mutations").add(builder);
        mutations.add(builder);
    } else {
        _visitables.get("mutations").add(builder);
        mutations.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToMutations(int index,V1beta1Mutation item) {
    if (this.mutations == null) {
      this.mutations = new ArrayList();
    }
    V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
    if (index < 0 || index >= mutations.size()) {
        _visitables.get("mutations").add(builder);
        mutations.add(builder);
    } else {
        _visitables.get("mutations").add(builder);
        mutations.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToMutations(V1beta1Mutation... items) {
    if (this.mutations == null) {
      this.mutations = new ArrayList();
    }
    for (V1beta1Mutation item : items) {
        V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
        _visitables.get("mutations").add(builder);
        this.mutations.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToMutations(Collection<V1beta1Mutation> items) {
    if (this.mutations == null) {
      this.mutations = new ArrayList();
    }
    for (V1beta1Mutation item : items) {
        V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
        _visitables.get("mutations").add(builder);
        this.mutations.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromMutations(V1beta1Mutation... items) {
    if (this.mutations == null) {
      return (A) this;
    }
    for (V1beta1Mutation item : items) {
        V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
        _visitables.get("mutations").remove(builder);
        this.mutations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromMutations(Collection<V1beta1Mutation> items) {
    if (this.mutations == null) {
      return (A) this;
    }
    for (V1beta1Mutation item : items) {
        V1beta1MutationBuilder builder = new V1beta1MutationBuilder(item);
        _visitables.get("mutations").remove(builder);
        this.mutations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMutations(Predicate<V1beta1MutationBuilder> predicate) {
    if (mutations == null) {
      return (A) this;
    }
    Iterator<V1beta1MutationBuilder> each = mutations.iterator();
    List visitables = _visitables.get("mutations");
    while (each.hasNext()) {
        V1beta1MutationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1Mutation> buildMutations() {
    return this.mutations != null ? build(mutations) : null;
  }
  
  public V1beta1Mutation buildMutation(int index) {
    return this.mutations.get(index).build();
  }
  
  public V1beta1Mutation buildFirstMutation() {
    return this.mutations.get(0).build();
  }
  
  public V1beta1Mutation buildLastMutation() {
    return this.mutations.get(mutations.size() - 1).build();
  }
  
  public V1beta1Mutation buildMatchingMutation(Predicate<V1beta1MutationBuilder> predicate) {
      for (V1beta1MutationBuilder item : mutations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMutation(Predicate<V1beta1MutationBuilder> predicate) {
      for (V1beta1MutationBuilder item : mutations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMutations(List<V1beta1Mutation> mutations) {
    if (this.mutations != null) {
      this._visitables.get("mutations").clear();
    }
    if (mutations != null) {
        this.mutations = new ArrayList();
        for (V1beta1Mutation item : mutations) {
          this.addToMutations(item);
        }
    } else {
      this.mutations = null;
    }
    return (A) this;
  }
  
  public A withMutations(V1beta1Mutation... mutations) {
    if (this.mutations != null) {
        this.mutations.clear();
        _visitables.remove("mutations");
    }
    if (mutations != null) {
      for (V1beta1Mutation item : mutations) {
        this.addToMutations(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMutations() {
    return this.mutations != null && !(this.mutations.isEmpty());
  }
  
  public MutationsNested<A> addNewMutation() {
    return new MutationsNested(-1, null);
  }
  
  public MutationsNested<A> addNewMutationLike(V1beta1Mutation item) {
    return new MutationsNested(-1, item);
  }
  
  public MutationsNested<A> setNewMutationLike(int index,V1beta1Mutation item) {
    return new MutationsNested(index, item);
  }
  
  public MutationsNested<A> editMutation(int index) {
    if (index <= mutations.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "mutations"));
    }
    return this.setNewMutationLike(index, this.buildMutation(index));
  }
  
  public MutationsNested<A> editFirstMutation() {
    if (mutations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "mutations"));
    }
    return this.setNewMutationLike(0, this.buildMutation(0));
  }
  
  public MutationsNested<A> editLastMutation() {
    int index = mutations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "mutations"));
    }
    return this.setNewMutationLike(index, this.buildMutation(index));
  }
  
  public MutationsNested<A> editMatchingMutation(Predicate<V1beta1MutationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < mutations.size();i++) {
      if (predicate.test(mutations.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "mutations"));
    }
    return this.setNewMutationLike(index, this.buildMutation(index));
  }
  
  public V1beta1ParamKind buildParamKind() {
    return this.paramKind != null ? this.paramKind.build() : null;
  }
  
  public A withParamKind(V1beta1ParamKind paramKind) {
    this._visitables.remove("paramKind");
    if (paramKind != null) {
        this.paramKind = new V1beta1ParamKindBuilder(paramKind);
        this._visitables.get("paramKind").add(this.paramKind);
    } else {
        this.paramKind = null;
        this._visitables.get("paramKind").remove(this.paramKind);
    }
    return (A) this;
  }
  
  public boolean hasParamKind() {
    return this.paramKind != null;
  }
  
  public ParamKindNested<A> withNewParamKind() {
    return new ParamKindNested(null);
  }
  
  public ParamKindNested<A> withNewParamKindLike(V1beta1ParamKind item) {
    return new ParamKindNested(item);
  }
  
  public ParamKindNested<A> editParamKind() {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(null));
  }
  
  public ParamKindNested<A> editOrNewParamKind() {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(new V1beta1ParamKindBuilder().build()));
  }
  
  public ParamKindNested<A> editOrNewParamKindLike(V1beta1ParamKind item) {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(item));
  }
  
  public String getReinvocationPolicy() {
    return this.reinvocationPolicy;
  }
  
  public A withReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
    return (A) this;
  }
  
  public boolean hasReinvocationPolicy() {
    return this.reinvocationPolicy != null;
  }
  
  public A addToVariables(int index,V1beta1Variable item) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) {
        _visitables.get("variables").add(builder);
        variables.add(builder);
    } else {
        _visitables.get("variables").add(builder);
        variables.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToVariables(int index,V1beta1Variable item) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) {
        _visitables.get("variables").add(builder);
        variables.add(builder);
    } else {
        _visitables.get("variables").add(builder);
        variables.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToVariables(V1beta1Variable... items) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    for (V1beta1Variable item : items) {
        V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
        _visitables.get("variables").add(builder);
        this.variables.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVariables(Collection<V1beta1Variable> items) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    for (V1beta1Variable item : items) {
        V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
        _visitables.get("variables").add(builder);
        this.variables.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromVariables(V1beta1Variable... items) {
    if (this.variables == null) {
      return (A) this;
    }
    for (V1beta1Variable item : items) {
        V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
        _visitables.get("variables").remove(builder);
        this.variables.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVariables(Collection<V1beta1Variable> items) {
    if (this.variables == null) {
      return (A) this;
    }
    for (V1beta1Variable item : items) {
        V1beta1VariableBuilder builder = new V1beta1VariableBuilder(item);
        _visitables.get("variables").remove(builder);
        this.variables.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromVariables(Predicate<V1beta1VariableBuilder> predicate) {
    if (variables == null) {
      return (A) this;
    }
    Iterator<V1beta1VariableBuilder> each = variables.iterator();
    List visitables = _visitables.get("variables");
    while (each.hasNext()) {
        V1beta1VariableBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1Variable> buildVariables() {
    return this.variables != null ? build(variables) : null;
  }
  
  public V1beta1Variable buildVariable(int index) {
    return this.variables.get(index).build();
  }
  
  public V1beta1Variable buildFirstVariable() {
    return this.variables.get(0).build();
  }
  
  public V1beta1Variable buildLastVariable() {
    return this.variables.get(variables.size() - 1).build();
  }
  
  public V1beta1Variable buildMatchingVariable(Predicate<V1beta1VariableBuilder> predicate) {
      for (V1beta1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVariable(Predicate<V1beta1VariableBuilder> predicate) {
      for (V1beta1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVariables(List<V1beta1Variable> variables) {
    if (this.variables != null) {
      this._visitables.get("variables").clear();
    }
    if (variables != null) {
        this.variables = new ArrayList();
        for (V1beta1Variable item : variables) {
          this.addToVariables(item);
        }
    } else {
      this.variables = null;
    }
    return (A) this;
  }
  
  public A withVariables(V1beta1Variable... variables) {
    if (this.variables != null) {
        this.variables.clear();
        _visitables.remove("variables");
    }
    if (variables != null) {
      for (V1beta1Variable item : variables) {
        this.addToVariables(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVariables() {
    return this.variables != null && !(this.variables.isEmpty());
  }
  
  public VariablesNested<A> addNewVariable() {
    return new VariablesNested(-1, null);
  }
  
  public VariablesNested<A> addNewVariableLike(V1beta1Variable item) {
    return new VariablesNested(-1, item);
  }
  
  public VariablesNested<A> setNewVariableLike(int index,V1beta1Variable item) {
    return new VariablesNested(index, item);
  }
  
  public VariablesNested<A> editVariable(int index) {
    if (index <= variables.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "variables"));
    }
    return this.setNewVariableLike(index, this.buildVariable(index));
  }
  
  public VariablesNested<A> editFirstVariable() {
    if (variables.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "variables"));
    }
    return this.setNewVariableLike(0, this.buildVariable(0));
  }
  
  public VariablesNested<A> editLastVariable() {
    int index = variables.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "variables"));
    }
    return this.setNewVariableLike(index, this.buildVariable(index));
  }
  
  public VariablesNested<A> editMatchingVariable(Predicate<V1beta1VariableBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < variables.size();i++) {
      if (predicate.test(variables.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "variables"));
    }
    return this.setNewVariableLike(index, this.buildVariable(index));
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
    V1beta1MutatingAdmissionPolicySpecFluent that = (V1beta1MutatingAdmissionPolicySpecFluent) o;
    if (!(Objects.equals(failurePolicy, that.failurePolicy))) {
      return false;
    }
    if (!(Objects.equals(matchConditions, that.matchConditions))) {
      return false;
    }
    if (!(Objects.equals(matchConstraints, that.matchConstraints))) {
      return false;
    }
    if (!(Objects.equals(mutations, that.mutations))) {
      return false;
    }
    if (!(Objects.equals(paramKind, that.paramKind))) {
      return false;
    }
    if (!(Objects.equals(reinvocationPolicy, that.reinvocationPolicy))) {
      return false;
    }
    if (!(Objects.equals(variables, that.variables))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(failurePolicy, matchConditions, matchConstraints, mutations, paramKind, reinvocationPolicy, variables);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(failurePolicy == null)) {
        sb.append("failurePolicy:");
        sb.append(failurePolicy);
        sb.append(",");
    }
    if (!(matchConditions == null) && !(matchConditions.isEmpty())) {
        sb.append("matchConditions:");
        sb.append(matchConditions);
        sb.append(",");
    }
    if (!(matchConstraints == null)) {
        sb.append("matchConstraints:");
        sb.append(matchConstraints);
        sb.append(",");
    }
    if (!(mutations == null) && !(mutations.isEmpty())) {
        sb.append("mutations:");
        sb.append(mutations);
        sb.append(",");
    }
    if (!(paramKind == null)) {
        sb.append("paramKind:");
        sb.append(paramKind);
        sb.append(",");
    }
    if (!(reinvocationPolicy == null)) {
        sb.append("reinvocationPolicy:");
        sb.append(reinvocationPolicy);
        sb.append(",");
    }
    if (!(variables == null) && !(variables.isEmpty())) {
        sb.append("variables:");
        sb.append(variables);
    }
    sb.append("}");
    return sb.toString();
  }
  public class MatchConditionsNested<N> extends V1beta1MatchConditionFluent<MatchConditionsNested<N>> implements Nested<N>{
    MatchConditionsNested(int index,V1beta1MatchCondition item) {
      this.index = index;
      this.builder = new V1beta1MatchConditionBuilder(this, item);
    }
    V1beta1MatchConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1MutatingAdmissionPolicySpecFluent.this.setToMatchConditions(index, builder.build());
    }
    
    public N endMatchCondition() {
      return and();
    }
    
  
  }
  public class MatchConstraintsNested<N> extends V1beta1MatchResourcesFluent<MatchConstraintsNested<N>> implements Nested<N>{
    MatchConstraintsNested(V1beta1MatchResources item) {
      this.builder = new V1beta1MatchResourcesBuilder(this, item);
    }
    V1beta1MatchResourcesBuilder builder;
    
    public N and() {
      return (N) V1beta1MutatingAdmissionPolicySpecFluent.this.withMatchConstraints(builder.build());
    }
    
    public N endMatchConstraints() {
      return and();
    }
    
  
  }
  public class MutationsNested<N> extends V1beta1MutationFluent<MutationsNested<N>> implements Nested<N>{
    MutationsNested(int index,V1beta1Mutation item) {
      this.index = index;
      this.builder = new V1beta1MutationBuilder(this, item);
    }
    V1beta1MutationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1MutatingAdmissionPolicySpecFluent.this.setToMutations(index, builder.build());
    }
    
    public N endMutation() {
      return and();
    }
    
  
  }
  public class ParamKindNested<N> extends V1beta1ParamKindFluent<ParamKindNested<N>> implements Nested<N>{
    ParamKindNested(V1beta1ParamKind item) {
      this.builder = new V1beta1ParamKindBuilder(this, item);
    }
    V1beta1ParamKindBuilder builder;
    
    public N and() {
      return (N) V1beta1MutatingAdmissionPolicySpecFluent.this.withParamKind(builder.build());
    }
    
    public N endParamKind() {
      return and();
    }
    
  
  }
  public class VariablesNested<N> extends V1beta1VariableFluent<VariablesNested<N>> implements Nested<N>{
    VariablesNested(int index,V1beta1Variable item) {
      this.index = index;
      this.builder = new V1beta1VariableBuilder(this, item);
    }
    V1beta1VariableBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1MutatingAdmissionPolicySpecFluent.this.setToVariables(index, builder.build());
    }
    
    public N endVariable() {
      return and();
    }
    
  
  }

}