package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1LeaseFluent<A extends io.kubernetes.client.openapi.models.V1LeaseFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LeaseSpec getSpec();
    public io.kubernetes.client.openapi.models.V1LeaseSpec buildSpec();
    public A withSpec(io.kubernetes.client.openapi.models.V1LeaseSpec spec);
    public java.lang.Boolean hasSpec();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<A> withNewSpec();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1LeaseSpec item);
    public io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<A> editSpec();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<A> editOrNewSpec();
    public io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1LeaseSpec item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1LeaseFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LeaseSpecFluent<io.kubernetes.client.openapi.models.V1LeaseFluent.SpecNested<N>> {

            public N and();
            public N endSpec();    }


}
