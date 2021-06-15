package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public interface StorageV1TokenRequestFluent<A extends io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getAudience();
    public A withAudience(java.lang.String audience);
    public java.lang.Boolean hasAudience();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAudience instead.
     */
        public A withNewAudience(java.lang.String original);
    public java.lang.Long getExpirationSeconds();
    public A withExpirationSeconds(java.lang.Long expirationSeconds);
    public java.lang.Boolean hasExpirationSeconds();
}
