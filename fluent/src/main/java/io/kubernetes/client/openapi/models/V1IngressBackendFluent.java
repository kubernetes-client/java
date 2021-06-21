package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1IngressBackendFluent<A extends io.kubernetes.client.openapi.models.V1IngressBackendFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getResource();
    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildResource();
    public A withResource(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference resource);
    public java.lang.Boolean hasResource();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A> withNewResource();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A> editResource();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A> editOrNewResource();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildService instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1IngressServiceBackend getService();
    public io.kubernetes.client.openapi.models.V1IngressServiceBackend buildService();
    public A withService(io.kubernetes.client.openapi.models.V1IngressServiceBackend service);
    public java.lang.Boolean hasService();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> withNewService();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item);
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> editService();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> editOrNewService();
    public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item);
    public interface ResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<N>> {

            public N and();
            public N endResource();    }


    public interface ServiceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<N>> {

            public N and();
            public N endService();    }


}
