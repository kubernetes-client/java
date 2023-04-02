package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SubjectAccessReviewStatusFluent<A extends V1SubjectAccessReviewStatusFluent<A>> extends Fluent<A>{
  public Boolean getAllowed();
  public A withAllowed(Boolean allowed);
  public Boolean hasAllowed();
  public Boolean getDenied();
  public A withDenied(Boolean denied);
  public Boolean hasDenied();
  public String getEvaluationError();
  public A withEvaluationError(String evaluationError);
  public Boolean hasEvaluationError();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  public A withAllowed();
  public A withDenied();
  
}