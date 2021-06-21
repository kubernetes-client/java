package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;

public interface V2beta2MetricSpecFluent<A extends io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildContainerResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource getContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource buildContainerResource();
    public A withContainerResource(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource containerResource);
    public java.lang.Boolean hasContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<A> editContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExternal instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource getExternal();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource buildExternal();
    public A withExternal(io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource external);
    public java.lang.Boolean hasExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<A> withNewExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<A> withNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<A> editExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<A> editOrNewExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildObject instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource getObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource buildObject();
    public A withObject(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource _object);
    public java.lang.Boolean hasObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<A> withNewObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<A> withNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<A> editObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<A> editOrNewObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPods instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2PodsMetricSource getPods();
    public io.kubernetes.client.openapi.models.V2beta2PodsMetricSource buildPods();
    public A withPods(io.kubernetes.client.openapi.models.V2beta2PodsMetricSource pods);
    public java.lang.Boolean hasPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<A> withNewPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<A> withNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<A> editPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<A> editOrNewPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<A> editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource getResource();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource buildResource();
    public A withResource(io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource resource);
    public java.lang.Boolean hasResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<A> withNewResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<A> editResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<A> editOrNewResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface ContainerResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ContainerResourceNested<N>> {

            public N and();
            public N endContainerResource();    }


    public interface ExternalNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ExternalNested<N>> {

            public N and();
            public N endExternal();    }


    public interface ObjectNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ObjectMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ObjectNested<N>> {

            public N and();
            public N endObject();    }


    public interface PodsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2PodsMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.PodsNested<N>> {

            public N and();
            public N endPods();    }


    public interface ResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent.ResourceNested<N>> {

            public N and();
            public N endResource();    }


}
