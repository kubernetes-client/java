package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1StatusCauseFluent<A extends io.kubernetes.client.openapi.models.V1StatusCauseFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getField();
    public A withField(java.lang.String field);
    public java.lang.Boolean hasField();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withField instead.
     */
        public A withNewField(java.lang.String original);
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
}
