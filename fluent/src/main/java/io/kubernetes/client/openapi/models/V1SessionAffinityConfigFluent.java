package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1SessionAffinityConfigFluent<A extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildClientIP instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ClientIPConfig getClientIP();
    public io.kubernetes.client.openapi.models.V1ClientIPConfig buildClientIP();
    public A withClientIP(io.kubernetes.client.openapi.models.V1ClientIPConfig clientIP);
    public java.lang.Boolean hasClientIP();
    public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIP();
    public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item);
    public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editClientIP();
    public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIP();
    public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item);
    public interface ClientIPNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<N>> {

            public N and();
            public N endClientIP();    }


}
