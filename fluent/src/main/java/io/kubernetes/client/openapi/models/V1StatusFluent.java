package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1StatusFluent<A extends io.kubernetes.client.openapi.models.V1StatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.Integer getCode();
    public A withCode(java.lang.Integer code);
    public java.lang.Boolean hasCode();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDetails instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1StatusDetails getDetails();
    public io.kubernetes.client.openapi.models.V1StatusDetails buildDetails();
    public A withDetails(io.kubernetes.client.openapi.models.V1StatusDetails details);
    public java.lang.Boolean hasDetails();
    public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetails();
    public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetailsLike(io.kubernetes.client.openapi.models.V1StatusDetails item);
    public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editDetails();
    public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetails();
    public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(io.kubernetes.client.openapi.models.V1StatusDetails item);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.String getMessage();
    public A withMessage(java.lang.String message);
    public java.lang.Boolean hasMessage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public java.lang.String getReason();
    public A withReason(java.lang.String reason);
    public java.lang.Boolean hasReason();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original);
    public java.lang.String getStatus();
    public A withStatus(java.lang.String status);
    public java.lang.Boolean hasStatus();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStatus instead.
     */
        public A withNewStatus(java.lang.String original);
    public interface DetailsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatusDetailsFluent<io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<N>> {

            public N and();
            public N endDetails();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ListMetaFluent<io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


}
