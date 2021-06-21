package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1PodTemplateFluent<A extends io.kubernetes.client.openapi.models.V1PodTemplateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
    public java.lang.Boolean hasTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> withNewTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editOrNewTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1PodTemplateFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1PodTemplateFluent.TemplateNested<N>> {

            public N and();
            public N endTemplate();    }


}
