package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1alpha1ValidatingAdmissionPolicySpecFluent<A extends V1alpha1ValidatingAdmissionPolicySpecFluent<A>> extends Fluent<A>{
  public A addToAuditAnnotations(int index,V1alpha1AuditAnnotation item);
  public A setToAuditAnnotations(int index,V1alpha1AuditAnnotation item);
  public A addToAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... items);
  public A addAllToAuditAnnotations(Collection<V1alpha1AuditAnnotation> items);
  public A removeFromAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... items);
  public A removeAllFromAuditAnnotations(Collection<V1alpha1AuditAnnotation> items);
  public A removeMatchingFromAuditAnnotations(Predicate<V1alpha1AuditAnnotationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAuditAnnotations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1AuditAnnotation> getAuditAnnotations();
  public List<V1alpha1AuditAnnotation> buildAuditAnnotations();
  public V1alpha1AuditAnnotation buildAuditAnnotation(int index);
  public V1alpha1AuditAnnotation buildFirstAuditAnnotation();
  public V1alpha1AuditAnnotation buildLastAuditAnnotation();
  public V1alpha1AuditAnnotation buildMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate);
  public Boolean hasMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate);
  public A withAuditAnnotations(List<V1alpha1AuditAnnotation> auditAnnotations);
  public A withAuditAnnotations(io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation... auditAnnotations);
  public Boolean hasAuditAnnotations();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> addNewAuditAnnotation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> addNewAuditAnnotationLike(V1alpha1AuditAnnotation item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> setNewAuditAnnotationLike(int index,V1alpha1AuditAnnotation item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> editAuditAnnotation(int index);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> editFirstAuditAnnotation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> editLastAuditAnnotation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<A> editMatchingAuditAnnotation(Predicate<V1alpha1AuditAnnotationBuilder> predicate);
  public String getFailurePolicy();
  public A withFailurePolicy(String failurePolicy);
  public Boolean hasFailurePolicy();
  public A addToMatchConditions(int index,V1alpha1MatchCondition item);
  public A setToMatchConditions(int index,V1alpha1MatchCondition item);
  public A addToMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... items);
  public A addAllToMatchConditions(Collection<V1alpha1MatchCondition> items);
  public A removeFromMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... items);
  public A removeAllFromMatchConditions(Collection<V1alpha1MatchCondition> items);
  public A removeMatchingFromMatchConditions(Predicate<V1alpha1MatchConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1MatchCondition> getMatchConditions();
  public List<V1alpha1MatchCondition> buildMatchConditions();
  public V1alpha1MatchCondition buildMatchCondition(int index);
  public V1alpha1MatchCondition buildFirstMatchCondition();
  public V1alpha1MatchCondition buildLastMatchCondition();
  public V1alpha1MatchCondition buildMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate);
  public Boolean hasMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate);
  public A withMatchConditions(List<V1alpha1MatchCondition> matchConditions);
  public A withMatchConditions(io.kubernetes.client.openapi.models.V1alpha1MatchCondition... matchConditions);
  public Boolean hasMatchConditions();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> addNewMatchCondition();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> addNewMatchConditionLike(V1alpha1MatchCondition item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> setNewMatchConditionLike(int index,V1alpha1MatchCondition item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> editMatchCondition(int index);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> editFirstMatchCondition();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> editLastMatchCondition();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1alpha1MatchConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMatchConstraints instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1MatchResources getMatchConstraints();
  public V1alpha1MatchResources buildMatchConstraints();
  public A withMatchConstraints(V1alpha1MatchResources matchConstraints);
  public Boolean hasMatchConstraints();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<A> withNewMatchConstraints();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<A> withNewMatchConstraintsLike(V1alpha1MatchResources item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<A> editMatchConstraints();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<A> editOrNewMatchConstraints();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<A> editOrNewMatchConstraintsLike(V1alpha1MatchResources item);
  
  /**
   * This method has been deprecated, please use method buildParamKind instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParamKind getParamKind();
  public V1alpha1ParamKind buildParamKind();
  public A withParamKind(V1alpha1ParamKind paramKind);
  public Boolean hasParamKind();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<A> withNewParamKind();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<A> withNewParamKindLike(V1alpha1ParamKind item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<A> editParamKind();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<A> editOrNewParamKind();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<A> editOrNewParamKindLike(V1alpha1ParamKind item);
  public A addToValidations(int index,V1alpha1Validation item);
  public A setToValidations(int index,V1alpha1Validation item);
  public A addToValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... items);
  public A addAllToValidations(Collection<V1alpha1Validation> items);
  public A removeFromValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... items);
  public A removeAllFromValidations(Collection<V1alpha1Validation> items);
  public A removeMatchingFromValidations(Predicate<V1alpha1ValidationBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildValidations instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1Validation> getValidations();
  public List<V1alpha1Validation> buildValidations();
  public V1alpha1Validation buildValidation(int index);
  public V1alpha1Validation buildFirstValidation();
  public V1alpha1Validation buildLastValidation();
  public V1alpha1Validation buildMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate);
  public Boolean hasMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate);
  public A withValidations(List<V1alpha1Validation> validations);
  public A withValidations(io.kubernetes.client.openapi.models.V1alpha1Validation... validations);
  public Boolean hasValidations();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> addNewValidation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> addNewValidationLike(V1alpha1Validation item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> setNewValidationLike(int index,V1alpha1Validation item);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> editValidation(int index);
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> editFirstValidation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> editLastValidation();
  public V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<A> editMatchingValidation(Predicate<V1alpha1ValidationBuilder> predicate);
  public interface AuditAnnotationsNested<N> extends Nested<N>,V1alpha1AuditAnnotationFluent<V1alpha1ValidatingAdmissionPolicySpecFluent.AuditAnnotationsNested<N>>{
    public N and();
    public N endAuditAnnotation();
    
  }
  public interface MatchConditionsNested<N> extends Nested<N>,V1alpha1MatchConditionFluent<V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConditionsNested<N>>{
    public N and();
    public N endMatchCondition();
    
  }
  public interface MatchConstraintsNested<N> extends Nested<N>,V1alpha1MatchResourcesFluent<V1alpha1ValidatingAdmissionPolicySpecFluent.MatchConstraintsNested<N>>{
    public N and();
    public N endMatchConstraints();
    
  }
  public interface ParamKindNested<N> extends Nested<N>,V1alpha1ParamKindFluent<V1alpha1ValidatingAdmissionPolicySpecFluent.ParamKindNested<N>>{
    public N and();
    public N endParamKind();
    
  }
  public interface ValidationsNested<N> extends Nested<N>,V1alpha1ValidationFluent<V1alpha1ValidatingAdmissionPolicySpecFluent.ValidationsNested<N>>{
    public N and();
    public N endValidation();
    
  }
  
}