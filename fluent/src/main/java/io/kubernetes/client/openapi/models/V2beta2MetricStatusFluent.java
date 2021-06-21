package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;

public interface V2beta2MetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildContainerResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus getContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus buildContainerResource();
    public A withContainerResource(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus containerResource);
    public java.lang.Boolean hasContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item);
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExternal instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus getExternal();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus buildExternal();
    public A withExternal(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus external);
    public java.lang.Boolean hasExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> withNewExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> withNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item);
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternal();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildObject instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus getObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus buildObject();
    public A withObject(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus _object);
    public java.lang.Boolean hasObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> withNewObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> withNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item);
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObject();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPods instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus getPods();
    public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus buildPods();
    public A withPods(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus pods);
    public java.lang.Boolean hasPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> withNewPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> withNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item);
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editOrNewPods();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus getResource();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus buildResource();
    public A withResource(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus resource);
    public java.lang.Boolean hasResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> withNewResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item);
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResource();
    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface ContainerResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<N>> {

            public N and();
            public N endContainerResource();    }


    public interface ExternalNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusFluent<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<N>> {

            public N and();
            public N endExternal();    }


    public interface ObjectNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<N>> {

            public N and();
            public N endObject();    }


    public interface PodsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<N>> {

            public N and();
            public N endPods();    }


    public interface ResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<N>> {

            public N and();
            public N endResource();    }


}
