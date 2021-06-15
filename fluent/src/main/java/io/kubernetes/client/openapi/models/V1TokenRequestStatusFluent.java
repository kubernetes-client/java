package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1TokenRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.time.OffsetDateTime getExpirationTimestamp();
    public A withExpirationTimestamp(java.time.OffsetDateTime expirationTimestamp);
    public java.lang.Boolean hasExpirationTimestamp();
    public java.lang.String getToken();
    public A withToken(java.lang.String token);
    public java.lang.Boolean hasToken();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withToken instead.
     */
        public A withNewToken(java.lang.String original);
}
