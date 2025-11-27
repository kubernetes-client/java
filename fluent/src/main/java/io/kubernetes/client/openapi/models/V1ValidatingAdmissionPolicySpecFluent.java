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
public class V1ValidatingAdmissionPolicySpecFluent<A extends io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicySpecFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1AuditAnnotationBuilder> auditAnnotations;
  private String failurePolicy;
  private ArrayList<V1MatchConditionBuilder> matchConditions;
  private V1MatchResourcesBuilder matchConstraints;
  private V1ParamKindBuilder paramKind;
  private ArrayList<V1ValidationBuilder> validations;
  private ArrayList<V1VariableBuilder> variables;

  public V1ValidatingAdmissionPolicySpecFluent() {
  }
  
  public V1ValidatingAdmissionPolicySpecFluent(V1ValidatingAdmissionPolicySpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToAuditAnnotations(Collection<V1AuditAnnotation> items) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new ArrayList();
    }
    for (V1AuditAnnotation item : items) {
        V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
        _visitables.get("auditAnnotations").add(builder);
        this.auditAnnotations.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToValidations(Collection<V1Validation> items) {
    if (this.validations == null) {
      this.validations = new ArrayList();
    }
    for (V1Validation item : items) {
        V1ValidationBuilder builder = new V1ValidationBuilder(item);
        _visitables.get("validations").add(builder);
        this.validations.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVariables(Collection<V1Variable> items) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    for (V1Variable item : items) {
        V1VariableBuilder builder = new V1VariableBuilder(item);
        _visitables.get("variables").add(builder);
        this.variables.add(builder);
    }
    return (A) this;
  }
  
  public AuditAnnotationsNested<A> addNewAuditAnnotation() {
    return new AuditAnnotationsNested(-1, null);
  }
  
  public AuditAnnotationsNested<A> addNewAuditAnnotationLike(V1AuditAnnotation item) {
    return new AuditAnnotationsNested(-1, item);
  }
  
  public MatchConditionsNested<A> addNewMatchCondition() {
    return new MatchConditionsNested(-1, null);
  }
  
  public MatchConditionsNested<A> addNewMatchConditionLike(V1MatchCondition item) {
    return new MatchConditionsNested(-1, item);
  }
  
  public ValidationsNested<A> addNewValidation() {
    return new ValidationsNested(-1, null);
  }
  
  public ValidationsNested<A> addNewValidationLike(V1Validation item) {
    return new ValidationsNested(-1, item);
  }
  
  public VariablesNested<A> addNewVariable() {
    return new VariablesNested(-1, null);
  }
  
  public VariablesNested<A> addNewVariableLike(V1Variable item) {
    return new VariablesNested(-1, item);
  }
  
  public A addToAuditAnnotations(V1AuditAnnotation... items) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new ArrayList();
    }
    for (V1AuditAnnotation item : items) {
        V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
        _visitables.get("auditAnnotations").add(builder);
        this.auditAnnotations.add(builder);
    }
    return (A) this;
  }
  
  public A addToAuditAnnotations(int index,V1AuditAnnotation item) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new ArrayList();
    }
    V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) {
        _visitables.get("auditAnnotations").add(builder);
        auditAnnotations.add(builder);
    } else {
        _visitables.get("auditAnnotations").add(builder);
        auditAnnotations.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToMatchConditions(V1MatchCondition... items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToValidations(V1Validation... items) {
    if (this.validations == null) {
      this.validations = new ArrayList();
    }
    for (V1Validation item : items) {
        V1ValidationBuilder builder = new V1ValidationBuilder(item);
        _visitables.get("validations").add(builder);
        this.validations.add(builder);
    }
    return (A) this;
  }
  
  public A addToValidations(int index,V1Validation item) {
    if (this.validations == null) {
      this.validations = new ArrayList();
    }
    V1ValidationBuilder builder = new V1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) {
        _visitables.get("validations").add(builder);
        validations.add(builder);
    } else {
        _visitables.get("validations").add(builder);
        validations.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToVariables(V1Variable... items) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    for (V1Variable item : items) {
        V1VariableBuilder builder = new V1VariableBuilder(item);
        _visitables.get("variables").add(builder);
        this.variables.add(builder);
    }
    return (A) this;
  }
  
  public A addToVariables(int index,V1Variable item) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    V1VariableBuilder builder = new V1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) {
        _visitables.get("variables").add(builder);
        variables.add(builder);
    } else {
        _visitables.get("variables").add(builder);
        variables.add(index, builder);
    }
    return (A) this;
  }
  
  public V1AuditAnnotation buildAuditAnnotation(int index) {
    return this.auditAnnotations.get(index).build();
  }
  
  public List<V1AuditAnnotation> buildAuditAnnotations() {
    return this.auditAnnotations != null ? build(auditAnnotations) : null;
  }
  
  public V1AuditAnnotation buildFirstAuditAnnotation() {
    return this.auditAnnotations.get(0).build();
  }
  
  public V1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  
  public V1Validation buildFirstValidation() {
    return this.validations.get(0).build();
  }
  
  public V1Variable buildFirstVariable() {
    return this.variables.get(0).build();
  }
  
  public V1AuditAnnotation buildLastAuditAnnotation() {
    return this.auditAnnotations.get(auditAnnotations.size() - 1).build();
  }
  
  public V1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  
  public V1Validation buildLastValidation() {
    return this.validations.get(validations.size() - 1).build();
  }
  
  public V1Variable buildLastVariable() {
    return this.variables.get(variables.size() - 1).build();
  }
  
  public V1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  
  public List<V1MatchCondition> buildMatchConditions() {
    return this.matchConditions != null ? build(matchConditions) : null;
  }
  
  public V1MatchResources buildMatchConstraints() {
    return this.matchConstraints != null ? this.matchConstraints.build() : null;
  }
  
  public V1AuditAnnotation buildMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
      for (V1AuditAnnotationBuilder item : auditAnnotations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1MatchCondition buildMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1Validation buildMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
      for (V1ValidationBuilder item : validations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1Variable buildMatchingVariable(Predicate<V1VariableBuilder> predicate) {
      for (V1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1ParamKind buildParamKind() {
    return this.paramKind != null ? this.paramKind.build() : null;
  }
  
  public V1Validation buildValidation(int index) {
    return this.validations.get(index).build();
  }
  
  public List<V1Validation> buildValidations() {
    return this.validations != null ? build(validations) : null;
  }
  
  public V1Variable buildVariable(int index) {
    return this.variables.get(index).build();
  }
  
  public List<V1Variable> buildVariables() {
    return this.variables != null ? build(variables) : null;
  }
  
  protected void copyInstance(V1ValidatingAdmissionPolicySpec instance) {
    instance = instance != null ? instance : new V1ValidatingAdmissionPolicySpec();
    if (instance != null) {
        this.withAuditAnnotations(instance.getAuditAnnotations());
        this.withFailurePolicy(instance.getFailurePolicy());
        this.withMatchConditions(instance.getMatchConditions());
        this.withMatchConstraints(instance.getMatchConstraints());
        this.withParamKind(instance.getParamKind());
        this.withValidations(instance.getValidations());
        this.withVariables(instance.getVariables());
    }
  }
  
  public AuditAnnotationsNested<A> editAuditAnnotation(int index) {
    if (auditAnnotations.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "auditAnnotations"));
    }
    return this.setNewAuditAnnotationLike(index, this.buildAuditAnnotation(index));
  }
  
  public AuditAnnotationsNested<A> editFirstAuditAnnotation() {
    if (auditAnnotations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "auditAnnotations"));
    }
    return this.setNewAuditAnnotationLike(0, this.buildAuditAnnotation(0));
  }
  
  public MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(0, this.buildMatchCondition(0));
  }
  
  public ValidationsNested<A> editFirstValidation() {
    if (validations.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "validations"));
    }
    return this.setNewValidationLike(0, this.buildValidation(0));
  }
  
  public VariablesNested<A> editFirstVariable() {
    if (variables.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "variables"));
    }
    return this.setNewVariableLike(0, this.buildVariable(0));
  }
  
  public AuditAnnotationsNested<A> editLastAuditAnnotation() {
    int index = auditAnnotations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "auditAnnotations"));
    }
    return this.setNewAuditAnnotationLike(index, this.buildAuditAnnotation(index));
  }
  
  public MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public ValidationsNested<A> editLastValidation() {
    int index = validations.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "validations"));
    }
    return this.setNewValidationLike(index, this.buildValidation(index));
  }
  
  public VariablesNested<A> editLastVariable() {
    int index = variables.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "variables"));
    }
    return this.setNewVariableLike(index, this.buildVariable(index));
  }
  
  public MatchConditionsNested<A> editMatchCondition(int index) {
    if (matchConditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public MatchConstraintsNested<A> editMatchConstraints() {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(null));
  }
  
  public AuditAnnotationsNested<A> editMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < auditAnnotations.size();i++) {
      if (predicate.test(auditAnnotations.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "auditAnnotations"));
    }
    return this.setNewAuditAnnotationLike(index, this.buildAuditAnnotation(index));
  }
  
  public MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
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
  
  public ValidationsNested<A> editMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < validations.size();i++) {
      if (predicate.test(validations.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "validations"));
    }
    return this.setNewValidationLike(index, this.buildValidation(index));
  }
  
  public VariablesNested<A> editMatchingVariable(Predicate<V1VariableBuilder> predicate) {
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
  
  public MatchConstraintsNested<A> editOrNewMatchConstraints() {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(new V1MatchResourcesBuilder().build()));
  }
  
  public MatchConstraintsNested<A> editOrNewMatchConstraintsLike(V1MatchResources item) {
    return this.withNewMatchConstraintsLike(Optional.ofNullable(this.buildMatchConstraints()).orElse(item));
  }
  
  public ParamKindNested<A> editOrNewParamKind() {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(new V1ParamKindBuilder().build()));
  }
  
  public ParamKindNested<A> editOrNewParamKindLike(V1ParamKind item) {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(item));
  }
  
  public ParamKindNested<A> editParamKind() {
    return this.withNewParamKindLike(Optional.ofNullable(this.buildParamKind()).orElse(null));
  }
  
  public ValidationsNested<A> editValidation(int index) {
    if (validations.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "validations"));
    }
    return this.setNewValidationLike(index, this.buildValidation(index));
  }
  
  public VariablesNested<A> editVariable(int index) {
    if (variables.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "variables"));
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
    V1ValidatingAdmissionPolicySpecFluent that = (V1ValidatingAdmissionPolicySpecFluent) o;
    if (!(Objects.equals(auditAnnotations, that.auditAnnotations))) {
      return false;
    }
    if (!(Objects.equals(failurePolicy, that.failurePolicy))) {
      return false;
    }
    if (!(Objects.equals(matchConditions, that.matchConditions))) {
      return false;
    }
    if (!(Objects.equals(matchConstraints, that.matchConstraints))) {
      return false;
    }
    if (!(Objects.equals(paramKind, that.paramKind))) {
      return false;
    }
    if (!(Objects.equals(validations, that.validations))) {
      return false;
    }
    if (!(Objects.equals(variables, that.variables))) {
      return false;
    }
    return true;
  }
  
  public String getFailurePolicy() {
    return this.failurePolicy;
  }
  
  public boolean hasAuditAnnotations() {
    return this.auditAnnotations != null && !(this.auditAnnotations.isEmpty());
  }
  
  public boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  
  public boolean hasMatchConditions() {
    return this.matchConditions != null && !(this.matchConditions.isEmpty());
  }
  
  public boolean hasMatchConstraints() {
    return this.matchConstraints != null;
  }
  
  public boolean hasMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
      for (V1AuditAnnotationBuilder item : auditAnnotations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
      for (V1ValidationBuilder item : validations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVariable(Predicate<V1VariableBuilder> predicate) {
      for (V1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasParamKind() {
    return this.paramKind != null;
  }
  
  public boolean hasValidations() {
    return this.validations != null && !(this.validations.isEmpty());
  }
  
  public boolean hasVariables() {
    return this.variables != null && !(this.variables.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(auditAnnotations, failurePolicy, matchConditions, matchConstraints, paramKind, validations, variables);
  }
  
  public A removeAllFromAuditAnnotations(Collection<V1AuditAnnotation> items) {
    if (this.auditAnnotations == null) {
      return (A) this;
    }
    for (V1AuditAnnotation item : items) {
        V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
        _visitables.get("auditAnnotations").remove(builder);
        this.auditAnnotations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromValidations(Collection<V1Validation> items) {
    if (this.validations == null) {
      return (A) this;
    }
    for (V1Validation item : items) {
        V1ValidationBuilder builder = new V1ValidationBuilder(item);
        _visitables.get("validations").remove(builder);
        this.validations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVariables(Collection<V1Variable> items) {
    if (this.variables == null) {
      return (A) this;
    }
    for (V1Variable item : items) {
        V1VariableBuilder builder = new V1VariableBuilder(item);
        _visitables.get("variables").remove(builder);
        this.variables.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromAuditAnnotations(V1AuditAnnotation... items) {
    if (this.auditAnnotations == null) {
      return (A) this;
    }
    for (V1AuditAnnotation item : items) {
        V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
        _visitables.get("auditAnnotations").remove(builder);
        this.auditAnnotations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromMatchConditions(V1MatchCondition... items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromValidations(V1Validation... items) {
    if (this.validations == null) {
      return (A) this;
    }
    for (V1Validation item : items) {
        V1ValidationBuilder builder = new V1ValidationBuilder(item);
        _visitables.get("validations").remove(builder);
        this.validations.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromVariables(V1Variable... items) {
    if (this.variables == null) {
      return (A) this;
    }
    for (V1Variable item : items) {
        V1VariableBuilder builder = new V1VariableBuilder(item);
        _visitables.get("variables").remove(builder);
        this.variables.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromAuditAnnotations(Predicate<V1AuditAnnotationBuilder> predicate) {
    if (auditAnnotations == null) {
      return (A) this;
    }
    Iterator<V1AuditAnnotationBuilder> each = auditAnnotations.iterator();
    List visitables = _visitables.get("auditAnnotations");
    while (each.hasNext()) {
        V1AuditAnnotationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchConditions(Predicate<V1MatchConditionBuilder> predicate) {
    if (matchConditions == null) {
      return (A) this;
    }
    Iterator<V1MatchConditionBuilder> each = matchConditions.iterator();
    List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
        V1MatchConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromValidations(Predicate<V1ValidationBuilder> predicate) {
    if (validations == null) {
      return (A) this;
    }
    Iterator<V1ValidationBuilder> each = validations.iterator();
    List visitables = _visitables.get("validations");
    while (each.hasNext()) {
        V1ValidationBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromVariables(Predicate<V1VariableBuilder> predicate) {
    if (variables == null) {
      return (A) this;
    }
    Iterator<V1VariableBuilder> each = variables.iterator();
    List visitables = _visitables.get("variables");
    while (each.hasNext()) {
        V1VariableBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public AuditAnnotationsNested<A> setNewAuditAnnotationLike(int index,V1AuditAnnotation item) {
    return new AuditAnnotationsNested(index, item);
  }
  
  public MatchConditionsNested<A> setNewMatchConditionLike(int index,V1MatchCondition item) {
    return new MatchConditionsNested(index, item);
  }
  
  public ValidationsNested<A> setNewValidationLike(int index,V1Validation item) {
    return new ValidationsNested(index, item);
  }
  
  public VariablesNested<A> setNewVariableLike(int index,V1Variable item) {
    return new VariablesNested(index, item);
  }
  
  public A setToAuditAnnotations(int index,V1AuditAnnotation item) {
    if (this.auditAnnotations == null) {
      this.auditAnnotations = new ArrayList();
    }
    V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) {
        _visitables.get("auditAnnotations").add(builder);
        auditAnnotations.add(builder);
    } else {
        _visitables.get("auditAnnotations").add(builder);
        auditAnnotations.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToValidations(int index,V1Validation item) {
    if (this.validations == null) {
      this.validations = new ArrayList();
    }
    V1ValidationBuilder builder = new V1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) {
        _visitables.get("validations").add(builder);
        validations.add(builder);
    } else {
        _visitables.get("validations").add(builder);
        validations.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToVariables(int index,V1Variable item) {
    if (this.variables == null) {
      this.variables = new ArrayList();
    }
    V1VariableBuilder builder = new V1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) {
        _visitables.get("variables").add(builder);
        variables.add(builder);
    } else {
        _visitables.get("variables").add(builder);
        variables.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(auditAnnotations == null) && !(auditAnnotations.isEmpty())) {
        sb.append("auditAnnotations:");
        sb.append(auditAnnotations);
        sb.append(",");
    }
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
    if (!(paramKind == null)) {
        sb.append("paramKind:");
        sb.append(paramKind);
        sb.append(",");
    }
    if (!(validations == null) && !(validations.isEmpty())) {
        sb.append("validations:");
        sb.append(validations);
        sb.append(",");
    }
    if (!(variables == null) && !(variables.isEmpty())) {
        sb.append("variables:");
        sb.append(variables);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAuditAnnotations(List<V1AuditAnnotation> auditAnnotations) {
    if (this.auditAnnotations != null) {
      this._visitables.get("auditAnnotations").clear();
    }
    if (auditAnnotations != null) {
        this.auditAnnotations = new ArrayList();
        for (V1AuditAnnotation item : auditAnnotations) {
          this.addToAuditAnnotations(item);
        }
    } else {
      this.auditAnnotations = null;
    }
    return (A) this;
  }
  
  public A withAuditAnnotations(V1AuditAnnotation... auditAnnotations) {
    if (this.auditAnnotations != null) {
        this.auditAnnotations.clear();
        _visitables.remove("auditAnnotations");
    }
    if (auditAnnotations != null) {
      for (V1AuditAnnotation item : auditAnnotations) {
        this.addToAuditAnnotations(item);
      }
    }
    return (A) this;
  }
  
  public A withFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return (A) this;
  }
  
  public A withMatchConditions(List<V1MatchCondition> matchConditions) {
    if (this.matchConditions != null) {
      this._visitables.get("matchConditions").clear();
    }
    if (matchConditions != null) {
        this.matchConditions = new ArrayList();
        for (V1MatchCondition item : matchConditions) {
          this.addToMatchConditions(item);
        }
    } else {
      this.matchConditions = null;
    }
    return (A) this;
  }
  
  public A withMatchConditions(V1MatchCondition... matchConditions) {
    if (this.matchConditions != null) {
        this.matchConditions.clear();
        _visitables.remove("matchConditions");
    }
    if (matchConditions != null) {
      for (V1MatchCondition item : matchConditions) {
        this.addToMatchConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withMatchConstraints(V1MatchResources matchConstraints) {
    this._visitables.remove("matchConstraints");
    if (matchConstraints != null) {
        this.matchConstraints = new V1MatchResourcesBuilder(matchConstraints);
        this._visitables.get("matchConstraints").add(this.matchConstraints);
    } else {
        this.matchConstraints = null;
        this._visitables.get("matchConstraints").remove(this.matchConstraints);
    }
    return (A) this;
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraints() {
    return new MatchConstraintsNested(null);
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraintsLike(V1MatchResources item) {
    return new MatchConstraintsNested(item);
  }
  
  public ParamKindNested<A> withNewParamKind() {
    return new ParamKindNested(null);
  }
  
  public ParamKindNested<A> withNewParamKindLike(V1ParamKind item) {
    return new ParamKindNested(item);
  }
  
  public A withParamKind(V1ParamKind paramKind) {
    this._visitables.remove("paramKind");
    if (paramKind != null) {
        this.paramKind = new V1ParamKindBuilder(paramKind);
        this._visitables.get("paramKind").add(this.paramKind);
    } else {
        this.paramKind = null;
        this._visitables.get("paramKind").remove(this.paramKind);
    }
    return (A) this;
  }
  
  public A withValidations(List<V1Validation> validations) {
    if (this.validations != null) {
      this._visitables.get("validations").clear();
    }
    if (validations != null) {
        this.validations = new ArrayList();
        for (V1Validation item : validations) {
          this.addToValidations(item);
        }
    } else {
      this.validations = null;
    }
    return (A) this;
  }
  
  public A withValidations(V1Validation... validations) {
    if (this.validations != null) {
        this.validations.clear();
        _visitables.remove("validations");
    }
    if (validations != null) {
      for (V1Validation item : validations) {
        this.addToValidations(item);
      }
    }
    return (A) this;
  }
  
  public A withVariables(List<V1Variable> variables) {
    if (this.variables != null) {
      this._visitables.get("variables").clear();
    }
    if (variables != null) {
        this.variables = new ArrayList();
        for (V1Variable item : variables) {
          this.addToVariables(item);
        }
    } else {
      this.variables = null;
    }
    return (A) this;
  }
  
  public A withVariables(V1Variable... variables) {
    if (this.variables != null) {
        this.variables.clear();
        _visitables.remove("variables");
    }
    if (variables != null) {
      for (V1Variable item : variables) {
        this.addToVariables(item);
      }
    }
    return (A) this;
  }
  public class AuditAnnotationsNested<N> extends V1AuditAnnotationFluent<AuditAnnotationsNested<N>> implements Nested<N>{
  
    V1AuditAnnotationBuilder builder;
    int index;
  
    AuditAnnotationsNested(int index,V1AuditAnnotation item) {
      this.index = index;
      this.builder = new V1AuditAnnotationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToAuditAnnotations(index, builder.build());
    }
    
    public N endAuditAnnotation() {
      return and();
    }
    
  }
  public class MatchConditionsNested<N> extends V1MatchConditionFluent<MatchConditionsNested<N>> implements Nested<N>{
  
    V1MatchConditionBuilder builder;
    int index;
  
    MatchConditionsNested(int index,V1MatchCondition item) {
      this.index = index;
      this.builder = new V1MatchConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToMatchConditions(index, builder.build());
    }
    
    public N endMatchCondition() {
      return and();
    }
    
  }
  public class MatchConstraintsNested<N> extends V1MatchResourcesFluent<MatchConstraintsNested<N>> implements Nested<N>{
  
    V1MatchResourcesBuilder builder;
  
    MatchConstraintsNested(V1MatchResources item) {
      this.builder = new V1MatchResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.withMatchConstraints(builder.build());
    }
    
    public N endMatchConstraints() {
      return and();
    }
    
  }
  public class ParamKindNested<N> extends V1ParamKindFluent<ParamKindNested<N>> implements Nested<N>{
  
    V1ParamKindBuilder builder;
  
    ParamKindNested(V1ParamKind item) {
      this.builder = new V1ParamKindBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.withParamKind(builder.build());
    }
    
    public N endParamKind() {
      return and();
    }
    
  }
  public class ValidationsNested<N> extends V1ValidationFluent<ValidationsNested<N>> implements Nested<N>{
  
    V1ValidationBuilder builder;
    int index;
  
    ValidationsNested(int index,V1Validation item) {
      this.index = index;
      this.builder = new V1ValidationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToValidations(index, builder.build());
    }
    
    public N endValidation() {
      return and();
    }
    
  }
  public class VariablesNested<N> extends V1VariableFluent<VariablesNested<N>> implements Nested<N>{
  
    V1VariableBuilder builder;
    int index;
  
    VariablesNested(int index,V1Variable item) {
      this.index = index;
      this.builder = new V1VariableBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToVariables(index, builder.build());
    }
    
    public N endVariable() {
      return and();
    }
    
  }
}