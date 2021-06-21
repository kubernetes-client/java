package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1StatefulSetConditionFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetConditionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.time.OffsetDateTime getLastTransitionTime();
    public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime);
    public java.lang.Boolean hasLastTransitionTime();
    public java.lang.String getMessage();
    public A withMessage(java.lang.String message);
    public java.lang.Boolean hasMessage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original);
    public java.lang.String getReason();
    public A withReason(java.lang.String reason);
    public java.lang.Boolean hasReason();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original);
    public java.lang.String getStatus();
    public A withStatus(java.lang.String status);
    public java.lang.Boolean hasStatus();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStatus instead.
     */
        public A withNewStatus(java.lang.String original);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
}
