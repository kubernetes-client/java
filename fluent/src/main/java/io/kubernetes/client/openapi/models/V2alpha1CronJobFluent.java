package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2alpha1CronJobFluent<A extends io.kubernetes.client.openapi.models.V2alpha1CronJobFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2alpha1CronJobSpec getSpec();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobSpec buildSpec();
    public A withSpec(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec spec);
    public java.lang.Boolean hasSpec();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> withNewSpec();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec item);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editSpec();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editOrNewSpec();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V2alpha1CronJobSpec item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStatus instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2alpha1CronJobStatus getStatus();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatus buildStatus();
    public A withStatus(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus status);
    public java.lang.Boolean hasStatus();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> withNewStatus();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus item);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editStatus();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editOrNewStatus();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2alpha1CronJobSpecFluent<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.SpecNested<N>> {

            public N and();
            public N endSpec();    }


    public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<io.kubernetes.client.openapi.models.V2alpha1CronJobFluent.StatusNested<N>> {

            public N and();
            public N endStatus();    }


}
