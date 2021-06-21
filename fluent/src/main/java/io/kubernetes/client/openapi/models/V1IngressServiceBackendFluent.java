package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1IngressServiceBackendFluent<A extends io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPort instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ServiceBackendPort getPort();
    public io.kubernetes.client.openapi.models.V1ServiceBackendPort buildPort();
    public A withPort(io.kubernetes.client.openapi.models.V1ServiceBackendPort port);
    public java.lang.Boolean hasPort();
    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> withNewPort();
    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> withNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);
    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editPort();
    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPort();
    public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editOrNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);
    public interface PortNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<N>> {

            public N and();
            public N endPort();    }


}
