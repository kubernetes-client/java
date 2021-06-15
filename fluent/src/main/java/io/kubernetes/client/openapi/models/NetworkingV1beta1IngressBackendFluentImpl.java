package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1IngressBackendFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent<A> {

    private io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder resource;
    private java.lang.String serviceName;
    private io.kubernetes.client.custom.IntOrString servicePort;

    public NetworkingV1beta1IngressBackendFluentImpl() {
    }

    public NetworkingV1beta1IngressBackendFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend instance) {
        this.withResource(instance.getResource());
        
        this.withServiceName(instance.getServiceName());
        
        this.withServicePort(instance.getServicePort());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getResource() {
        return this.resource!=null?this.resource.build():null;
    }

    public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildResource() {
        return this.resource!=null?this.resource.build():null;
    }

    public A withResource(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference resource) {
        _visitables.get("resource").remove(this.resource);
        if (resource!=null){ this.resource= new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(resource); _visitables.get("resource").add(this.resource);} return (A) this;
    }

    public java.lang.Boolean hasResource() {
        return this.resource != null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<A> withNewResource() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluentImpl.ResourceNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluentImpl.ResourceNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<A> editResource() {
        return withNewResourceLike(getResource());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<A> editOrNewResource() {
        return withNewResourceLike(getResource() != null ? getResource(): new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
        return withNewResourceLike(getResource() != null ? getResource(): item);
    }

    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    public A withServiceName(java.lang.String serviceName) {
        this.serviceName=serviceName; return (A) this;
    }

    public java.lang.Boolean hasServiceName() {
        return this.serviceName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withServiceName instead.
     */
        public A withNewServiceName(java.lang.String original) {
        return (A)withServiceName(new String(original));
    }

    public io.kubernetes.client.custom.IntOrString getServicePort() {
        return this.servicePort;
    }

    public A withServicePort(io.kubernetes.client.custom.IntOrString servicePort) {
        this.servicePort=servicePort; return (A) this;
    }

    public java.lang.Boolean hasServicePort() {
        return this.servicePort != null;
    }

    public A withNewServicePort(int value) {
        return (A)withServicePort(new IntOrString(value));
    }

    public A withNewServicePort(java.lang.String value) {
        return (A)withServicePort(new IntOrString(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1IngressBackendFluentImpl that = (NetworkingV1beta1IngressBackendFluentImpl) o;
        if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) :that.serviceName != null) return false;
        if (servicePort != null ? !servicePort.equals(that.servicePort) :that.servicePort != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(resource,  serviceName,  servicePort,  super.hashCode());
    }

    public class ResourceNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluent.ResourceNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder builder;

            ResourceNestedImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this, item);
                        
            }

            ResourceNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressBackendFluentImpl.this.withResource(builder.build());
            }

            public N endResource() {
                return and();
            }
    }


}
