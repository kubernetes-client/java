package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1SubjectAccessReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getAllowed();
    public A withAllowed(java.lang.Boolean allowed);
    public java.lang.Boolean hasAllowed();
    public java.lang.Boolean getDenied();
    public A withDenied(java.lang.Boolean denied);
    public java.lang.Boolean hasDenied();
    public java.lang.String getEvaluationError();
    public A withEvaluationError(java.lang.String evaluationError);
    public java.lang.Boolean hasEvaluationError();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEvaluationError instead.
     */
        public A withNewEvaluationError(java.lang.String original);
    public java.lang.String getReason();
    public A withReason(java.lang.String reason);
    public java.lang.Boolean hasReason();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original);
}
