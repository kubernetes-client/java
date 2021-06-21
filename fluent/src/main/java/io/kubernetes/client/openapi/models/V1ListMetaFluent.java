package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public interface V1ListMetaFluent<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getContinue();
    public A withContinue(java.lang.String _continue);
    public java.lang.Boolean hasContinue();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContinue instead.
     */
        public A withNewContinue(java.lang.String original);
    public java.lang.Long getRemainingItemCount();
    public A withRemainingItemCount(java.lang.Long remainingItemCount);
    public java.lang.Boolean hasRemainingItemCount();
    public java.lang.String getResourceVersion();
    public A withResourceVersion(java.lang.String resourceVersion);
    public java.lang.Boolean hasResourceVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResourceVersion instead.
     */
        public A withNewResourceVersion(java.lang.String original);
    public java.lang.String getSelfLink();
    public A withSelfLink(java.lang.String selfLink);
    public java.lang.Boolean hasSelfLink();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSelfLink instead.
     */
        public A withNewSelfLink(java.lang.String original);
}
