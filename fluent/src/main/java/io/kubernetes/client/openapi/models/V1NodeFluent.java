package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1NodeFluent<A extends io.kubernetes.client.openapi.models.V1NodeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeSpec getSpec();
    public io.kubernetes.client.openapi.models.V1NodeSpec buildSpec();
    public A withSpec(io.kubernetes.client.openapi.models.V1NodeSpec spec);
    public java.lang.Boolean hasSpec();
    public io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<A> withNewSpec();
    public io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1NodeSpec item);
    public io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<A> editSpec();
    public io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<A> editOrNewSpec();
    public io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1NodeSpec item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStatus instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1NodeStatus getStatus();
    public io.kubernetes.client.openapi.models.V1NodeStatus buildStatus();
    public A withStatus(io.kubernetes.client.openapi.models.V1NodeStatus status);
    public java.lang.Boolean hasStatus();
    public io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<A> withNewStatus();
    public io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1NodeStatus item);
    public io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<A> editStatus();
    public io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<A> editOrNewStatus();
    public io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1NodeStatus item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1NodeFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeSpecFluent<io.kubernetes.client.openapi.models.V1NodeFluent.SpecNested<N>> {

            public N and();
            public N endSpec();    }


    public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NodeStatusFluent<io.kubernetes.client.openapi.models.V1NodeFluent.StatusNested<N>> {

            public N and();
            public N endStatus();    }


}
