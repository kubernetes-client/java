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
public class V1ValidatingAdmissionPolicySpecFluent<A extends V1ValidatingAdmissionPolicySpecFluent<A>> extends BaseFluent<A>{
  public V1ValidatingAdmissionPolicySpecFluent() {
  }
  
  public V1ValidatingAdmissionPolicySpecFluent(V1ValidatingAdmissionPolicySpec instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1AuditAnnotationBuilder> auditAnnotations;
  private String failurePolicy;
  private ArrayList<V1MatchConditionBuilder> matchConditions;
  private V1MatchResourcesBuilder matchConstraints;
  private V1ParamKindBuilder paramKind;
  private ArrayList<V1ValidationBuilder> validations;
  private ArrayList<V1VariableBuilder> variables;
  
  protected void copyInstance(V1ValidatingAdmissionPolicySpec instance) {
    instance = (instance != null ? instance : new V1ValidatingAdmissionPolicySpec());
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
  
  public A addToAuditAnnotations(int index,V1AuditAnnotation item) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1AuditAnnotationBuilder>();}
    V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) { _visitables.get("auditAnnotations").add(builder); auditAnnotations.add(builder); } else { _visitables.get("auditAnnotations").add(index, builder); auditAnnotations.add(index, builder);}
    return (A)this;
  }
  
  public A setToAuditAnnotations(int index,V1AuditAnnotation item) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1AuditAnnotationBuilder>();}
    V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) { _visitables.get("auditAnnotations").add(builder); auditAnnotations.add(builder); } else { _visitables.get("auditAnnotations").set(index, builder); auditAnnotations.set(index, builder);}
    return (A)this;
  }
  
  public A addToAuditAnnotations(io.kubernetes.client.openapi.models.V1AuditAnnotation... items) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1AuditAnnotationBuilder>();}
    for (V1AuditAnnotation item : items) {V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").add(builder);this.auditAnnotations.add(builder);} return (A)this;
  }
  
  public A addAllToAuditAnnotations(Collection<V1AuditAnnotation> items) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1AuditAnnotationBuilder>();}
    for (V1AuditAnnotation item : items) {V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").add(builder);this.auditAnnotations.add(builder);} return (A)this;
  }
  
  public A removeFromAuditAnnotations(io.kubernetes.client.openapi.models.V1AuditAnnotation... items) {
    if (this.auditAnnotations == null) return (A)this;
    for (V1AuditAnnotation item : items) {V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").remove(builder); this.auditAnnotations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromAuditAnnotations(Collection<V1AuditAnnotation> items) {
    if (this.auditAnnotations == null) return (A)this;
    for (V1AuditAnnotation item : items) {V1AuditAnnotationBuilder builder = new V1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").remove(builder); this.auditAnnotations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromAuditAnnotations(Predicate<V1AuditAnnotationBuilder> predicate) {
    if (auditAnnotations == null) return (A) this;
    final Iterator<V1AuditAnnotationBuilder> each = auditAnnotations.iterator();
    final List visitables = _visitables.get("auditAnnotations");
    while (each.hasNext()) {
      V1AuditAnnotationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1AuditAnnotation> buildAuditAnnotations() {
    return this.auditAnnotations != null ? build(auditAnnotations) : null;
  }
  
  public V1AuditAnnotation buildAuditAnnotation(int index) {
    return this.auditAnnotations.get(index).build();
  }
  
  public V1AuditAnnotation buildFirstAuditAnnotation() {
    return this.auditAnnotations.get(0).build();
  }
  
  public V1AuditAnnotation buildLastAuditAnnotation() {
    return this.auditAnnotations.get(auditAnnotations.size() - 1).build();
  }
  
  public V1AuditAnnotation buildMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
      for (V1AuditAnnotationBuilder item : auditAnnotations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
      for (V1AuditAnnotationBuilder item : auditAnnotations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withAuditAnnotations(io.kubernetes.client.openapi.models.V1AuditAnnotation... auditAnnotations) {
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
  
  public boolean hasAuditAnnotations() {
    return this.auditAnnotations != null && !this.auditAnnotations.isEmpty();
  }
  
  public AuditAnnotationsNested<A> addNewAuditAnnotation() {
    return new AuditAnnotationsNested(-1, null);
  }
  
  public AuditAnnotationsNested<A> addNewAuditAnnotationLike(V1AuditAnnotation item) {
    return new AuditAnnotationsNested(-1, item);
  }
  
  public AuditAnnotationsNested<A> setNewAuditAnnotationLike(int index,V1AuditAnnotation item) {
    return new AuditAnnotationsNested(index, item);
  }
  
  public AuditAnnotationsNested<A> editAuditAnnotation(int index) {
    if (auditAnnotations.size() <= index) throw new RuntimeException("Can't edit auditAnnotations. Index exceeds size.");
    return setNewAuditAnnotationLike(index, buildAuditAnnotation(index));
  }
  
  public AuditAnnotationsNested<A> editFirstAuditAnnotation() {
    if (auditAnnotations.size() == 0) throw new RuntimeException("Can't edit first auditAnnotations. The list is empty.");
    return setNewAuditAnnotationLike(0, buildAuditAnnotation(0));
  }
  
  public AuditAnnotationsNested<A> editLastAuditAnnotation() {
    int index = auditAnnotations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last auditAnnotations. The list is empty.");
    return setNewAuditAnnotationLike(index, buildAuditAnnotation(index));
  }
  
  public AuditAnnotationsNested<A> editMatchingAuditAnnotation(Predicate<V1AuditAnnotationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<auditAnnotations.size();i++) { 
    if (predicate.test(auditAnnotations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching auditAnnotations. No match found.");
    return setNewAuditAnnotationLike(index, buildAuditAnnotation(index));
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
  
  public A addToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").add(index, builder); matchConditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").set(index, builder); matchConditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  
  public A addAllToMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... items) {
    if (this.matchConditions == null) return (A)this;
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder); this.matchConditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) return (A)this;
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder); this.matchConditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchConditions(Predicate<V1MatchConditionBuilder> predicate) {
    if (matchConditions == null) return (A) this;
    final Iterator<V1MatchConditionBuilder> each = matchConditions.iterator();
    final List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
      V1MatchConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1MatchCondition> buildMatchConditions() {
    return this.matchConditions != null ? build(matchConditions) : null;
  }
  
  public V1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  
  public V1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  
  public V1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  
  public V1MatchCondition buildMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... matchConditions) {
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
  
  public boolean hasMatchConditions() {
    return this.matchConditions != null && !this.matchConditions.isEmpty();
  }
  
  public MatchConditionsNested<A> addNewMatchCondition() {
    return new MatchConditionsNested(-1, null);
  }
  
  public MatchConditionsNested<A> addNewMatchConditionLike(V1MatchCondition item) {
    return new MatchConditionsNested(-1, item);
  }
  
  public MatchConditionsNested<A> setNewMatchConditionLike(int index,V1MatchCondition item) {
    return new MatchConditionsNested(index, item);
  }
  
  public MatchConditionsNested<A> editMatchCondition(int index) {
    if (matchConditions.size() <= index) throw new RuntimeException("Can't edit matchConditions. Index exceeds size.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) throw new RuntimeException("Can't edit first matchConditions. The list is empty.");
    return setNewMatchConditionLike(0, buildMatchCondition(0));
  }
  
  public MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchConditions. The list is empty.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchConditions.size();i++) { 
    if (predicate.test(matchConditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchConditions. No match found.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public V1MatchResources buildMatchConstraints() {
    return this.matchConstraints != null ? this.matchConstraints.build() : null;
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
  
  public boolean hasMatchConstraints() {
    return this.matchConstraints != null;
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraints() {
    return new MatchConstraintsNested(null);
  }
  
  public MatchConstraintsNested<A> withNewMatchConstraintsLike(V1MatchResources item) {
    return new MatchConstraintsNested(item);
  }
  
  public MatchConstraintsNested<A> editMatchConstraints() {
    return withNewMatchConstraintsLike(java.util.Optional.ofNullable(buildMatchConstraints()).orElse(null));
  }
  
  public MatchConstraintsNested<A> editOrNewMatchConstraints() {
    return withNewMatchConstraintsLike(java.util.Optional.ofNullable(buildMatchConstraints()).orElse(new V1MatchResourcesBuilder().build()));
  }
  
  public MatchConstraintsNested<A> editOrNewMatchConstraintsLike(V1MatchResources item) {
    return withNewMatchConstraintsLike(java.util.Optional.ofNullable(buildMatchConstraints()).orElse(item));
  }
  
  public V1ParamKind buildParamKind() {
    return this.paramKind != null ? this.paramKind.build() : null;
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
  
  public boolean hasParamKind() {
    return this.paramKind != null;
  }
  
  public ParamKindNested<A> withNewParamKind() {
    return new ParamKindNested(null);
  }
  
  public ParamKindNested<A> withNewParamKindLike(V1ParamKind item) {
    return new ParamKindNested(item);
  }
  
  public ParamKindNested<A> editParamKind() {
    return withNewParamKindLike(java.util.Optional.ofNullable(buildParamKind()).orElse(null));
  }
  
  public ParamKindNested<A> editOrNewParamKind() {
    return withNewParamKindLike(java.util.Optional.ofNullable(buildParamKind()).orElse(new V1ParamKindBuilder().build()));
  }
  
  public ParamKindNested<A> editOrNewParamKindLike(V1ParamKind item) {
    return withNewParamKindLike(java.util.Optional.ofNullable(buildParamKind()).orElse(item));
  }
  
  public A addToValidations(int index,V1Validation item) {
    if (this.validations == null) {this.validations = new ArrayList<V1ValidationBuilder>();}
    V1ValidationBuilder builder = new V1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) { _visitables.get("validations").add(builder); validations.add(builder); } else { _visitables.get("validations").add(index, builder); validations.add(index, builder);}
    return (A)this;
  }
  
  public A setToValidations(int index,V1Validation item) {
    if (this.validations == null) {this.validations = new ArrayList<V1ValidationBuilder>();}
    V1ValidationBuilder builder = new V1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) { _visitables.get("validations").add(builder); validations.add(builder); } else { _visitables.get("validations").set(index, builder); validations.set(index, builder);}
    return (A)this;
  }
  
  public A addToValidations(io.kubernetes.client.openapi.models.V1Validation... items) {
    if (this.validations == null) {this.validations = new ArrayList<V1ValidationBuilder>();}
    for (V1Validation item : items) {V1ValidationBuilder builder = new V1ValidationBuilder(item);_visitables.get("validations").add(builder);this.validations.add(builder);} return (A)this;
  }
  
  public A addAllToValidations(Collection<V1Validation> items) {
    if (this.validations == null) {this.validations = new ArrayList<V1ValidationBuilder>();}
    for (V1Validation item : items) {V1ValidationBuilder builder = new V1ValidationBuilder(item);_visitables.get("validations").add(builder);this.validations.add(builder);} return (A)this;
  }
  
  public A removeFromValidations(io.kubernetes.client.openapi.models.V1Validation... items) {
    if (this.validations == null) return (A)this;
    for (V1Validation item : items) {V1ValidationBuilder builder = new V1ValidationBuilder(item);_visitables.get("validations").remove(builder); this.validations.remove(builder);} return (A)this;
  }
  
  public A removeAllFromValidations(Collection<V1Validation> items) {
    if (this.validations == null) return (A)this;
    for (V1Validation item : items) {V1ValidationBuilder builder = new V1ValidationBuilder(item);_visitables.get("validations").remove(builder); this.validations.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromValidations(Predicate<V1ValidationBuilder> predicate) {
    if (validations == null) return (A) this;
    final Iterator<V1ValidationBuilder> each = validations.iterator();
    final List visitables = _visitables.get("validations");
    while (each.hasNext()) {
      V1ValidationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Validation> buildValidations() {
    return this.validations != null ? build(validations) : null;
  }
  
  public V1Validation buildValidation(int index) {
    return this.validations.get(index).build();
  }
  
  public V1Validation buildFirstValidation() {
    return this.validations.get(0).build();
  }
  
  public V1Validation buildLastValidation() {
    return this.validations.get(validations.size() - 1).build();
  }
  
  public V1Validation buildMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
      for (V1ValidationBuilder item : validations) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
      for (V1ValidationBuilder item : validations) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withValidations(io.kubernetes.client.openapi.models.V1Validation... validations) {
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
  
  public boolean hasValidations() {
    return this.validations != null && !this.validations.isEmpty();
  }
  
  public ValidationsNested<A> addNewValidation() {
    return new ValidationsNested(-1, null);
  }
  
  public ValidationsNested<A> addNewValidationLike(V1Validation item) {
    return new ValidationsNested(-1, item);
  }
  
  public ValidationsNested<A> setNewValidationLike(int index,V1Validation item) {
    return new ValidationsNested(index, item);
  }
  
  public ValidationsNested<A> editValidation(int index) {
    if (validations.size() <= index) throw new RuntimeException("Can't edit validations. Index exceeds size.");
    return setNewValidationLike(index, buildValidation(index));
  }
  
  public ValidationsNested<A> editFirstValidation() {
    if (validations.size() == 0) throw new RuntimeException("Can't edit first validations. The list is empty.");
    return setNewValidationLike(0, buildValidation(0));
  }
  
  public ValidationsNested<A> editLastValidation() {
    int index = validations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last validations. The list is empty.");
    return setNewValidationLike(index, buildValidation(index));
  }
  
  public ValidationsNested<A> editMatchingValidation(Predicate<V1ValidationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<validations.size();i++) { 
    if (predicate.test(validations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching validations. No match found.");
    return setNewValidationLike(index, buildValidation(index));
  }
  
  public A addToVariables(int index,V1Variable item) {
    if (this.variables == null) {this.variables = new ArrayList<V1VariableBuilder>();}
    V1VariableBuilder builder = new V1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) { _visitables.get("variables").add(builder); variables.add(builder); } else { _visitables.get("variables").add(index, builder); variables.add(index, builder);}
    return (A)this;
  }
  
  public A setToVariables(int index,V1Variable item) {
    if (this.variables == null) {this.variables = new ArrayList<V1VariableBuilder>();}
    V1VariableBuilder builder = new V1VariableBuilder(item);
    if (index < 0 || index >= variables.size()) { _visitables.get("variables").add(builder); variables.add(builder); } else { _visitables.get("variables").set(index, builder); variables.set(index, builder);}
    return (A)this;
  }
  
  public A addToVariables(io.kubernetes.client.openapi.models.V1Variable... items) {
    if (this.variables == null) {this.variables = new ArrayList<V1VariableBuilder>();}
    for (V1Variable item : items) {V1VariableBuilder builder = new V1VariableBuilder(item);_visitables.get("variables").add(builder);this.variables.add(builder);} return (A)this;
  }
  
  public A addAllToVariables(Collection<V1Variable> items) {
    if (this.variables == null) {this.variables = new ArrayList<V1VariableBuilder>();}
    for (V1Variable item : items) {V1VariableBuilder builder = new V1VariableBuilder(item);_visitables.get("variables").add(builder);this.variables.add(builder);} return (A)this;
  }
  
  public A removeFromVariables(io.kubernetes.client.openapi.models.V1Variable... items) {
    if (this.variables == null) return (A)this;
    for (V1Variable item : items) {V1VariableBuilder builder = new V1VariableBuilder(item);_visitables.get("variables").remove(builder); this.variables.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVariables(Collection<V1Variable> items) {
    if (this.variables == null) return (A)this;
    for (V1Variable item : items) {V1VariableBuilder builder = new V1VariableBuilder(item);_visitables.get("variables").remove(builder); this.variables.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromVariables(Predicate<V1VariableBuilder> predicate) {
    if (variables == null) return (A) this;
    final Iterator<V1VariableBuilder> each = variables.iterator();
    final List visitables = _visitables.get("variables");
    while (each.hasNext()) {
      V1VariableBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1Variable> buildVariables() {
    return this.variables != null ? build(variables) : null;
  }
  
  public V1Variable buildVariable(int index) {
    return this.variables.get(index).build();
  }
  
  public V1Variable buildFirstVariable() {
    return this.variables.get(0).build();
  }
  
  public V1Variable buildLastVariable() {
    return this.variables.get(variables.size() - 1).build();
  }
  
  public V1Variable buildMatchingVariable(Predicate<V1VariableBuilder> predicate) {
      for (V1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVariable(Predicate<V1VariableBuilder> predicate) {
      for (V1VariableBuilder item : variables) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withVariables(io.kubernetes.client.openapi.models.V1Variable... variables) {
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
  
  public boolean hasVariables() {
    return this.variables != null && !this.variables.isEmpty();
  }
  
  public VariablesNested<A> addNewVariable() {
    return new VariablesNested(-1, null);
  }
  
  public VariablesNested<A> addNewVariableLike(V1Variable item) {
    return new VariablesNested(-1, item);
  }
  
  public VariablesNested<A> setNewVariableLike(int index,V1Variable item) {
    return new VariablesNested(index, item);
  }
  
  public VariablesNested<A> editVariable(int index) {
    if (variables.size() <= index) throw new RuntimeException("Can't edit variables. Index exceeds size.");
    return setNewVariableLike(index, buildVariable(index));
  }
  
  public VariablesNested<A> editFirstVariable() {
    if (variables.size() == 0) throw new RuntimeException("Can't edit first variables. The list is empty.");
    return setNewVariableLike(0, buildVariable(0));
  }
  
  public VariablesNested<A> editLastVariable() {
    int index = variables.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last variables. The list is empty.");
    return setNewVariableLike(index, buildVariable(index));
  }
  
  public VariablesNested<A> editMatchingVariable(Predicate<V1VariableBuilder> predicate) {
    int index = -1;
    for (int i=0;i<variables.size();i++) { 
    if (predicate.test(variables.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching variables. No match found.");
    return setNewVariableLike(index, buildVariable(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidatingAdmissionPolicySpecFluent that = (V1ValidatingAdmissionPolicySpecFluent) o;
    if (!java.util.Objects.equals(auditAnnotations, that.auditAnnotations)) return false;
    if (!java.util.Objects.equals(failurePolicy, that.failurePolicy)) return false;
    if (!java.util.Objects.equals(matchConditions, that.matchConditions)) return false;
    if (!java.util.Objects.equals(matchConstraints, that.matchConstraints)) return false;
    if (!java.util.Objects.equals(paramKind, that.paramKind)) return false;
    if (!java.util.Objects.equals(validations, that.validations)) return false;
    if (!java.util.Objects.equals(variables, that.variables)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(auditAnnotations,  failurePolicy,  matchConditions,  matchConstraints,  paramKind,  validations,  variables,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auditAnnotations != null && !auditAnnotations.isEmpty()) { sb.append("auditAnnotations:"); sb.append(auditAnnotations + ","); }
    if (failurePolicy != null) { sb.append("failurePolicy:"); sb.append(failurePolicy + ","); }
    if (matchConditions != null && !matchConditions.isEmpty()) { sb.append("matchConditions:"); sb.append(matchConditions + ","); }
    if (matchConstraints != null) { sb.append("matchConstraints:"); sb.append(matchConstraints + ","); }
    if (paramKind != null) { sb.append("paramKind:"); sb.append(paramKind + ","); }
    if (validations != null && !validations.isEmpty()) { sb.append("validations:"); sb.append(validations + ","); }
    if (variables != null && !variables.isEmpty()) { sb.append("variables:"); sb.append(variables); }
    sb.append("}");
    return sb.toString();
  }
  public class AuditAnnotationsNested<N> extends V1AuditAnnotationFluent<AuditAnnotationsNested<N>> implements Nested<N>{
    AuditAnnotationsNested(int index,V1AuditAnnotation item) {
      this.index = index;
      this.builder = new V1AuditAnnotationBuilder(this, item);
    }
    V1AuditAnnotationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToAuditAnnotations(index,builder.build());
    }
    
    public N endAuditAnnotation() {
      return and();
    }
    
  
  }
  public class MatchConditionsNested<N> extends V1MatchConditionFluent<MatchConditionsNested<N>> implements Nested<N>{
    MatchConditionsNested(int index,V1MatchCondition item) {
      this.index = index;
      this.builder = new V1MatchConditionBuilder(this, item);
    }
    V1MatchConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToMatchConditions(index,builder.build());
    }
    
    public N endMatchCondition() {
      return and();
    }
    
  
  }
  public class MatchConstraintsNested<N> extends V1MatchResourcesFluent<MatchConstraintsNested<N>> implements Nested<N>{
    MatchConstraintsNested(V1MatchResources item) {
      this.builder = new V1MatchResourcesBuilder(this, item);
    }
    V1MatchResourcesBuilder builder;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.withMatchConstraints(builder.build());
    }
    
    public N endMatchConstraints() {
      return and();
    }
    
  
  }
  public class ParamKindNested<N> extends V1ParamKindFluent<ParamKindNested<N>> implements Nested<N>{
    ParamKindNested(V1ParamKind item) {
      this.builder = new V1ParamKindBuilder(this, item);
    }
    V1ParamKindBuilder builder;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.withParamKind(builder.build());
    }
    
    public N endParamKind() {
      return and();
    }
    
  
  }
  public class ValidationsNested<N> extends V1ValidationFluent<ValidationsNested<N>> implements Nested<N>{
    ValidationsNested(int index,V1Validation item) {
      this.index = index;
      this.builder = new V1ValidationBuilder(this, item);
    }
    V1ValidationBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToValidations(index,builder.build());
    }
    
    public N endValidation() {
      return and();
    }
    
  
  }
  public class VariablesNested<N> extends V1VariableFluent<VariablesNested<N>> implements Nested<N>{
    VariablesNested(int index,V1Variable item) {
      this.index = index;
      this.builder = new V1VariableBuilder(this, item);
    }
    V1VariableBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingAdmissionPolicySpecFluent.this.setToVariables(index,builder.build());
    }
    
    public N endVariable() {
      return and();
    }
    
  
  }

}