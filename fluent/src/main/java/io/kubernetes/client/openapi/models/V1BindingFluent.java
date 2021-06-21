package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1BindingFluent<A extends io.kubernetes.client.openapi.models.V1BindingFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTarget instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectReference getTarget();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildTarget();
    public A withTarget(io.kubernetes.client.openapi.models.V1ObjectReference target);
    public java.lang.Boolean hasTarget();
    public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> withNewTarget();
    public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editTarget();
    public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editOrNewTarget();
    public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<N>> {

            public N and();
            public N endTarget();    }


}
