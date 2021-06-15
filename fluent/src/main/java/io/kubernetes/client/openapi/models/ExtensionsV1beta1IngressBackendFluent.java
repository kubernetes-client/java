package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface ExtensionsV1beta1IngressBackendFluent<A extends io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getResource();
    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildResource();
    public A withResource(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference resource);
    public java.lang.Boolean hasResource();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<A> withNewResource();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<A> editResource();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<A> editOrNewResource();
    public io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);
    public java.lang.String getServiceName();
    public A withServiceName(java.lang.String serviceName);
    public java.lang.Boolean hasServiceName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withServiceName instead.
     */
        public A withNewServiceName(java.lang.String original);
    public io.kubernetes.client.custom.IntOrString getServicePort();
    public A withServicePort(io.kubernetes.client.custom.IntOrString servicePort);
    public java.lang.Boolean hasServicePort();
    public A withNewServicePort(int value);
    public A withNewServicePort(java.lang.String value);
    public interface ResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<io.kubernetes.client.openapi.models.ExtensionsV1beta1IngressBackendFluent.ResourceNested<N>> {

            public N and();
            public N endResource();    }


}
