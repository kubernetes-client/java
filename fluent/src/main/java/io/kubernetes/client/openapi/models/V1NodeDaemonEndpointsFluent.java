package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1NodeDaemonEndpointsFluent<A extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildKubeletEndpoint instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DaemonEndpoint getKubeletEndpoint();
    public io.kubernetes.client.openapi.models.V1DaemonEndpoint buildKubeletEndpoint();
    public A withKubeletEndpoint(io.kubernetes.client.openapi.models.V1DaemonEndpoint kubeletEndpoint);
    public java.lang.Boolean hasKubeletEndpoint();
    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint();
    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);
    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint();
    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint();
    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);
    public interface KubeletEndpointNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>> {

            public N and();
            public N endKubeletEndpoint();    }


}
