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
  public class V1alpha1ValidatingAdmissionPolicySpecFluentImpl<A extends V1alpha1ValidatingAdmissionPolicySpecFluent<A>> extends BaseFluent<A> implements V1alpha1ValidatingAdmissionPolicySpecFluent<A>{
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl() {
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl(V1alpha1ValidatingAdmissionPolicySpec instance) {
    if (instance != null) {
      this.withAuditAnnotations(instance.getAuditAnnotations());
      this.withFailurePolicy(instance.getFailurePolicy());
      this.withMatchConditions(instance.getMatchConditions());
      this.withMatchConstraints(instance.getMatchConstraints());
      this.withParamKind(instance.getParamKind());
      this.withValidations(instance.getValidations());
    }
  }
  private ArrayList<V1alpha1AuditAnnotationBuilder> auditAnnotations;
  private String failurePolicy;
  private ArrayList<V1alpha1MatchConditionBuilder> matchConditions;
  private V1alpha1MatchResourcesBuilder matchConstraints;
  private V1alpha1ParamKindBuilder paramKind;
  private ArrayList<V1alpha1ValidationBuilder> validations;
  public A addToAuditAnnotations(int index,V1alpha1AuditAnnotation item) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1alpha1AuditAnnotationBuilder>();}
    V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) { _visitables.get("auditAnnotations").add(builder); auditAnnotations.add(builder); } else { _visitables.get("auditAnnotations").add(index, builder); auditAnnotations.add(index, builder);}
    return (A)this;
  }
  public A setToAuditAnnotations(int index,V1alpha1AuditAnnotation item) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1alpha1AuditAnnotationBuilder>();}
    V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);
    if (index < 0 || index >= auditAnnotations.size()) { _visitables.get("auditAnnotations").add(builder); auditAnnotations.add(builder); } else { _visitables.get("auditAnnotations").set(index, builder); auditAnnotations.set(index, builder);}
    return (A)this;
  }
  public A addToAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... items) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1alpha1AuditAnnotationBuilder>();}
    for (V1alpha1AuditAnnotation item : items) {V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").add(builder);this.auditAnnotations.add(builder);} return (A)this;
  }
  public A addAllToAuditAnnotations(Collection<V1alpha1AuditAnnotation> items) {
    if (this.auditAnnotations == null) {this.auditAnnotations = new ArrayList<V1alpha1AuditAnnotationBuilder>();}
    for (V1alpha1AuditAnnotation item : items) {V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").add(builder);this.auditAnnotations.add(builder);} return (A)this;
  }
  public A removeFromAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... items) {
    for (V1alpha1AuditAnnotation item : items) {V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").remove(builder);if (this.auditAnnotations != null) {this.auditAnnotations.remove(builder);}} return (A)this;
  }
  public A removeAllFromAuditAnnotations(Collection<V1alpha1AuditAnnotation> items) {
    for (V1alpha1AuditAnnotation item : items) {V1alpha1AuditAnnotationBuilder builder = new V1alpha1AuditAnnotationBuilder(item);_visitables.get("auditAnnotations").remove(builder);if (this.auditAnnotations != null) {this.auditAnnotations.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAuditAnnotations(Predicate<V1alpha1AuditAnnotationBuilder> predicate) {
    if (auditAnnotations == null) return (A) this;
    final Iterator<V1alpha1AuditAnnotationBuilder> each = auditAnnotations.iterator();
    final List visitables = _visitables.get("auditAnnotations");
    while (each.hasNext()) {
      V1alpha1AuditAnnotationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAuditAnnotations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1AuditAnnotation> getAuditAnnotations() {
    return auditAnnotations != null ? build(auditAnnotations) : null;
  }
  public List<V1alpha1AuditAnnotation> buildAuditAnnotations() {
    return auditAnnotations != null ? build(auditAnnotations) : null;
  }
  public V1alpha1AuditAnnotation buildAuditAnnotation(int index) {
    return this.auditAnnotations.get(index).build();
  }
  public V1alpha1AuditAnnotation buildFirstAuditAnnotation() {
    return this.auditAnnotations.get(0).build();
  }
  public V1alpha1AuditAnnotation buildLastAuditAnnotation() {
    return this.auditAnnotations.get(auditAnnotations.size() - 1).build();
  }
  public V1alpha1AuditAnnotation buildMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate) {
    for (V1alpha1AuditAnnotationBuilder item: auditAnnotations) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate) {
    for (V1alpha1AuditAnnotationBuilder item: auditAnnotations) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAuditAnnotations(List<V1alpha1AuditAnnotation> auditAnnotations) {
    if (this.auditAnnotations != null) { _visitables.get("auditAnnotations").clear();}
    if (auditAnnotations != null) {this.auditAnnotations = new ArrayList(); for (V1alpha1AuditAnnotation item : auditAnnotations){this.addToAuditAnnotations(item);}} else { this.auditAnnotations = null;} return (A) this;
  }
  public A withAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... auditAnnotations) {
    if (this.auditAnnotations != null) {this.auditAnnotations.clear(); _visitables.remove("auditAnnotations"); }
    if (auditAnnotations != null) {for (V1alpha1AuditAnnotation item :auditAnnotations){ this.addToAuditAnnotations(item);}} return (A) this;
  }
  public Boolean hasAuditAnnotations() {
    return auditAnnotations != null && !auditAnnotations.isEmpty();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> addNewAuditAnnotation() {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> addNewAuditAnnotationLike(V1alpha1AuditAnnotation item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNestedImpl(-1, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> setNewAuditAnnotationLike(int index,V1alpha1AuditAnnotation item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNestedImpl(index, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> editAuditAnnotation(int index) {
    if (auditAnnotations.size() <= index) throw new RuntimeException("Can't edit auditAnnotations. Index exceeds size.");
    return setNewAuditAnnotationLike(index, buildAuditAnnotation(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> editFirstAuditAnnotation() {
    if (auditAnnotations.size() == 0) throw new RuntimeException("Can't edit first auditAnnotations. The list is empty.");
    return setNewAuditAnnotationLike(0, buildAuditAnnotation(0));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> editLastAuditAnnotation() {
    int index = auditAnnotations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last auditAnnotations. The list is empty.");
    return setNewAuditAnnotationLike(index, buildAuditAnnotation(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<A> editMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate) {
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
    this.failurePolicy=failurePolicy; return (A) this;
  }
  public Boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  public A addToMatchConditions(int index,V1alpha1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1alpha1MatchConditionBuilder>();}
    V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").add(index, builder); matchConditions.add(index, builder);}
    return (A)this;
  }
  public A setToMatchConditions(int index,V1alpha1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1alpha1MatchConditionBuilder>();}
    V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").set(index, builder); matchConditions.set(index, builder);}
    return (A)this;
  }
  public A addToMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1alpha1MatchConditionBuilder>();}
    for (V1alpha1MatchCondition item : items) {V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  public A addAllToMatchConditions(Collection<V1alpha1MatchCondition> items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1alpha1MatchConditionBuilder>();}
    for (V1alpha1MatchCondition item : items) {V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  public A removeFromMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... items) {
    for (V1alpha1MatchCondition item : items) {V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder);if (this.matchConditions != null) {this.matchConditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromMatchConditions(Collection<V1alpha1MatchCondition> items) {
    for (V1alpha1MatchCondition item : items) {V1alpha1MatchConditionBuilder builder = new V1alpha1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder);if (this.matchConditions != null) {this.matchConditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromMatchConditions(Predicate<V1alpha1MatchConditionBuilder> predicate) {
    if (matchConditions == null) return (A) this;
    final Iterator<V1alpha1MatchConditionBuilder> each = matchConditions.iterator();
    final List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
      V1alpha1MatchConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildMatchConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1MatchCondition> getMatchConditions() {
    return matchConditions != null ? build(matchConditions) : null;
  }
  public List<V1alpha1MatchCondition> buildMatchConditions() {
    return matchConditions != null ? build(matchConditions) : null;
  }
  public V1alpha1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  public V1alpha1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  public V1alpha1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  public V1alpha1MatchCondition buildMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate) {
    for (V1alpha1MatchConditionBuilder item: matchConditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate) {
    for (V1alpha1MatchConditionBuilder item: matchConditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMatchConditions(List<V1alpha1MatchCondition> matchConditions) {
    if (this.matchConditions != null) { _visitables.get("matchConditions").clear();}
    if (matchConditions != null) {this.matchConditions = new ArrayList(); for (V1alpha1MatchCondition item : matchConditions){this.addToMatchConditions(item);}} else { this.matchConditions = null;} return (A) this;
  }
  public A withMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... matchConditions) {
    if (this.matchConditions != null) {this.matchConditions.clear(); _visitables.remove("matchConditions"); }
    if (matchConditions != null) {for (V1alpha1MatchCondition item :matchConditions){ this.addToMatchConditions(item);}} return (A) this;
  }
  public Boolean hasMatchConditions() {
    return matchConditions != null && !matchConditions.isEmpty();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> addNewMatchCondition() {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> addNewMatchConditionLike(V1alpha1MatchCondition item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNestedImpl(-1, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> setNewMatchConditionLike(int index,V1alpha1MatchCondition item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNestedImpl(index, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> editMatchCondition(int index) {
    if (matchConditions.size() <= index) throw new RuntimeException("Can't edit matchConditions. Index exceeds size.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) throw new RuntimeException("Can't edit first matchConditions. The list is empty.");
    return setNewMatchConditionLike(0, buildMatchCondition(0));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchConditions. The list is empty.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchConditions.size();i++) { 
    if (predicate.test(matchConditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchConditions. No match found.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  /**
   * This method has been deprecated, please use method buildMatchConstraints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1MatchResources getMatchConstraints() {
    return this.matchConstraints!=null ?this.matchConstraints.build():null;
  }
  public V1alpha1MatchResources buildMatchConstraints() {
    return this.matchConstraints!=null ?this.matchConstraints.build():null;
  }
  public A withMatchConstraints(V1alpha1MatchResources matchConstraints) {
    _visitables.get("matchConstraints").remove(this.matchConstraints);
    if (matchConstraints!=null){ this.matchConstraints= new V1alpha1MatchResourcesBuilder(matchConstraints); _visitables.get("matchConstraints").add(this.matchConstraints);} else { this.matchConstraints = null; _visitables.get("matchConstraints").remove(this.matchConstraints); } return (A) this;
  }
  public Boolean hasMatchConstraints() {
    return this.matchConstraints != null;
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<A> withNewMatchConstraints() {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<A> withNewMatchConstraintsLike(V1alpha1MatchResources item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<A> editMatchConstraints() {
    return withNewMatchConstraintsLike(getMatchConstraints());
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<A> editOrNewMatchConstraints() {
    return withNewMatchConstraintsLike(getMatchConstraints() != null ? getMatchConstraints(): new V1alpha1MatchResourcesBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<A> editOrNewMatchConstraintsLike(V1alpha1MatchResources item) {
    return withNewMatchConstraintsLike(getMatchConstraints() != null ? getMatchConstraints(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildParamKind instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParamKind getParamKind() {
    return this.paramKind!=null ?this.paramKind.build():null;
  }
  public V1alpha1ParamKind buildParamKind() {
    return this.paramKind!=null ?this.paramKind.build():null;
  }
  public A withParamKind(V1alpha1ParamKind paramKind) {
    _visitables.get("paramKind").remove(this.paramKind);
    if (paramKind!=null){ this.paramKind= new V1alpha1ParamKindBuilder(paramKind); _visitables.get("paramKind").add(this.paramKind);} else { this.paramKind = null; _visitables.get("paramKind").remove(this.paramKind); } return (A) this;
  }
  public Boolean hasParamKind() {
    return this.paramKind != null;
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<A> withNewParamKind() {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<A> withNewParamKindLike(V1alpha1ParamKind item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<A> editParamKind() {
    return withNewParamKindLike(getParamKind());
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<A> editOrNewParamKind() {
    return withNewParamKindLike(getParamKind() != null ? getParamKind(): new V1alpha1ParamKindBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<A> editOrNewParamKindLike(V1alpha1ParamKind item) {
    return withNewParamKindLike(getParamKind() != null ? getParamKind(): item);
  }
  public A addToValidations(int index,V1alpha1Validation item) {
    if (this.validations == null) {this.validations = new ArrayList<V1alpha1ValidationBuilder>();}
    V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) { _visitables.get("validations").add(builder); validations.add(builder); } else { _visitables.get("validations").add(index, builder); validations.add(index, builder);}
    return (A)this;
  }
  public A setToValidations(int index,V1alpha1Validation item) {
    if (this.validations == null) {this.validations = new ArrayList<V1alpha1ValidationBuilder>();}
    V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);
    if (index < 0 || index >= validations.size()) { _visitables.get("validations").add(builder); validations.add(builder); } else { _visitables.get("validations").set(index, builder); validations.set(index, builder);}
    return (A)this;
  }
  public A addToValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... items) {
    if (this.validations == null) {this.validations = new ArrayList<V1alpha1ValidationBuilder>();}
    for (V1alpha1Validation item : items) {V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);_visitables.get("validations").add(builder);this.validations.add(builder);} return (A)this;
  }
  public A addAllToValidations(Collection<V1alpha1Validation> items) {
    if (this.validations == null) {this.validations = new ArrayList<V1alpha1ValidationBuilder>();}
    for (V1alpha1Validation item : items) {V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);_visitables.get("validations").add(builder);this.validations.add(builder);} return (A)this;
  }
  public A removeFromValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... items) {
    for (V1alpha1Validation item : items) {V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);_visitables.get("validations").remove(builder);if (this.validations != null) {this.validations.remove(builder);}} return (A)this;
  }
  public A removeAllFromValidations(Collection<V1alpha1Validation> items) {
    for (V1alpha1Validation item : items) {V1alpha1ValidationBuilder builder = new V1alpha1ValidationBuilder(item);_visitables.get("validations").remove(builder);if (this.validations != null) {this.validations.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromValidations(Predicate<V1alpha1ValidationBuilder> predicate) {
    if (validations == null) return (A) this;
    final Iterator<V1alpha1ValidationBuilder> each = validations.iterator();
    final List visitables = _visitables.get("validations");
    while (each.hasNext()) {
      V1alpha1ValidationBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildValidations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1Validation> getValidations() {
    return validations != null ? build(validations) : null;
  }
  public List<V1alpha1Validation> buildValidations() {
    return validations != null ? build(validations) : null;
  }
  public V1alpha1Validation buildValidation(int index) {
    return this.validations.get(index).build();
  }
  public V1alpha1Validation buildFirstValidation() {
    return this.validations.get(0).build();
  }
  public V1alpha1Validation buildLastValidation() {
    return this.validations.get(validations.size() - 1).build();
  }
  public V1alpha1Validation buildMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate) {
    for (V1alpha1ValidationBuilder item: validations) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate) {
    for (V1alpha1ValidationBuilder item: validations) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withValidations(List<V1alpha1Validation> validations) {
    if (this.validations != null) { _visitables.get("validations").clear();}
    if (validations != null) {this.validations = new ArrayList(); for (V1alpha1Validation item : validations){this.addToValidations(item);}} else { this.validations = null;} return (A) this;
  }
  public A withValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... validations) {
    if (this.validations != null) {this.validations.clear(); _visitables.remove("validations"); }
    if (validations != null) {for (V1alpha1Validation item :validations){ this.addToValidations(item);}} return (A) this;
  }
  public Boolean hasValidations() {
    return validations != null && !validations.isEmpty();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> addNewValidation() {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> addNewValidationLike(V1alpha1Validation item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNestedImpl(-1, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> setNewValidationLike(int index,V1alpha1Validation item) {
    return new V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNestedImpl(index, item);
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> editValidation(int index) {
    if (validations.size() <= index) throw new RuntimeException("Can't edit validations. Index exceeds size.");
    return setNewValidationLike(index, buildValidation(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> editFirstValidation() {
    if (validations.size() == 0) throw new RuntimeException("Can't edit first validations. The list is empty.");
    return setNewValidationLike(0, buildValidation(0));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> editLastValidation() {
    int index = validations.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last validations. The list is empty.");
    return setNewValidationLike(index, buildValidation(index));
  }
  public V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<A> editMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate) {
    int index = -1;
    for (int i=0;i<validations.size();i++) { 
    if (predicate.test(validations.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching validations. No match found.");
    return setNewValidationLike(index, buildValidation(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicySpecFluentImpl that = (V1alpha1ValidatingAdmissionPolicySpecFluentImpl) o;
    if (!java.util.Objects.equals(auditAnnotations, that.auditAnnotations)) return false;

    if (!java.util.Objects.equals(failurePolicy, that.failurePolicy)) return false;

    if (!java.util.Objects.equals(matchConditions, that.matchConditions)) return false;

    if (!java.util.Objects.equals(matchConstraints, that.matchConstraints)) return false;

    if (!java.util.Objects.equals(paramKind, that.paramKind)) return false;

    if (!java.util.Objects.equals(validations, that.validations)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(auditAnnotations,  failurePolicy,  matchConditions,  matchConstraints,  paramKind,  validations,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (auditAnnotations != null) { sb.append("auditAnnotations:"); sb.append(auditAnnotations + ","); }
    if (failurePolicy != null) { sb.append("failurePolicy:"); sb.append(failurePolicy + ","); }
    if (matchConditions != null) { sb.append("matchConditions:"); sb.append(matchConditions + ","); }
    if (matchConstraints != null) { sb.append("matchConstraints:"); sb.append(matchConstraints + ","); }
    if (paramKind != null) { sb.append("paramKind:"); sb.append(paramKind + ","); }
    if (validations != null) { sb.append("validations:"); sb.append(validations); }
    sb.append("}");
    return sb.toString();
  }
  class AuditAnnotationsNestedImpl<N> extends V1alpha1AuditAnnotationFluentImpl<V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<N>> implements V1alpha1ValidatingAdmissionPolicySpecFluentImpl.AuditAnnotationsNested<N>,Nested<N>{
    AuditAnnotationsNestedImpl(int index,V1alpha1AuditAnnotation item) {
      this.index = index;
      this.builder = new V1alpha1AuditAnnotationBuilder(this, item);
    }
    AuditAnnotationsNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1AuditAnnotationBuilder(this);
    }
    V1alpha1AuditAnnotationBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicySpecFluentImpl.this.setToAuditAnnotations(index,builder.build());
    }
    public N endAuditAnnotation() {
      return and();
    }
    
  }
  class MatchConditionsNestedImpl<N> extends V1alpha1MatchConditionFluentImpl<V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<N>> implements V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConditionsNested<N>,Nested<N>{
    MatchConditionsNestedImpl(int index,V1alpha1MatchCondition item) {
      this.index = index;
      this.builder = new V1alpha1MatchConditionBuilder(this, item);
    }
    MatchConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1MatchConditionBuilder(this);
    }
    V1alpha1MatchConditionBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicySpecFluentImpl.this.setToMatchConditions(index,builder.build());
    }
    public N endMatchCondition() {
      return and();
    }
    
  }
  class MatchConstraintsNestedImpl<N> extends V1alpha1MatchResourcesFluentImpl<V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<N>> implements V1alpha1ValidatingAdmissionPolicySpecFluentImpl.MatchConstraintsNested<N>,Nested<N>{
    MatchConstraintsNestedImpl(V1alpha1MatchResources item) {
      this.builder = new V1alpha1MatchResourcesBuilder(this, item);
    }
    MatchConstraintsNestedImpl() {
      this.builder = new V1alpha1MatchResourcesBuilder(this);
    }
    V1alpha1MatchResourcesBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicySpecFluentImpl.this.withMatchConstraints(builder.build());
    }
    public N endMatchConstraints() {
      return and();
    }
    
  }
  class ParamKindNestedImpl<N> extends V1alpha1ParamKindFluentImpl<V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<N>> implements V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ParamKindNested<N>,Nested<N>{
    ParamKindNestedImpl(V1alpha1ParamKind item) {
      this.builder = new V1alpha1ParamKindBuilder(this, item);
    }
    ParamKindNestedImpl() {
      this.builder = new V1alpha1ParamKindBuilder(this);
    }
    V1alpha1ParamKindBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicySpecFluentImpl.this.withParamKind(builder.build());
    }
    public N endParamKind() {
      return and();
    }
    
  }
  class ValidationsNestedImpl<N> extends V1alpha1ValidationFluentImpl<V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<N>> implements V1alpha1ValidatingAdmissionPolicySpecFluentImpl.ValidationsNested<N>,Nested<N>{
    ValidationsNestedImpl(int index,V1alpha1Validation item) {
      this.index = index;
      this.builder = new V1alpha1ValidationBuilder(this, item);
    }
    ValidationsNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1ValidationBuilder(this);
    }
    V1alpha1ValidationBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicySpecFluentImpl.this.setToValidations(index,builder.build());
    }
    public N endValidation() {
      return and();
    }
    
  }
  
}