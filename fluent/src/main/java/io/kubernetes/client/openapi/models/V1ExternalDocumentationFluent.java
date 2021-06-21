package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ExternalDocumentationFluent<A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getDescription();
    public A withDescription(java.lang.String description);
    public java.lang.Boolean hasDescription();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDescription instead.
     */
        public A withNewDescription(java.lang.String original);
    public java.lang.String getUrl();
    public A withUrl(java.lang.String url);
    public java.lang.Boolean hasUrl();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUrl instead.
     */
        public A withNewUrl(java.lang.String original);
}
