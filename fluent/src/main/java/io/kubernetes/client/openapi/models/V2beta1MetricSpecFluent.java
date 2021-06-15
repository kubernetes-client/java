package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;

public interface V2beta1MetricSpecFluent<A extends io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildContainerResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource getContainerResource();
    public io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource buildContainerResource();
    public A withContainerResource(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource containerResource);
    public java.lang.Boolean hasContainerResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A> withNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A> editContainerResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExternal instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource getExternal();
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource buildExternal();
    public A withExternal(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource external);
    public java.lang.Boolean hasExternal();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A> withNewExternal();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A> withNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A> editExternal();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A> editOrNewExternal();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildObject instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource getObject();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource buildObject();
    public A withObject(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource _object);
    public java.lang.Boolean hasObject();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> withNewObject();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> withNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> editObject();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> editOrNewObject();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPods instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource getPods();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSource buildPods();
    public A withPods(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource pods);
    public java.lang.Boolean hasPods();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> withNewPods();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> withNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editPods();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editOrNewPods();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<A> editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta1PodsMetricSource item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource getResource();
    public io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource buildResource();
    public A withResource(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource resource);
    public java.lang.Boolean hasResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A> withNewResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A> editResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A> editOrNewResource();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource item);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public interface ContainerResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ContainerResourceNested<N>> {

            public N and();
            public N endContainerResource();    }


    public interface ExternalNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ExternalNested<N>> {

            public N and();
            public N endExternal();    }


    public interface ObjectNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ObjectNested<N>> {

            public N and();
            public N endObject();    }


    public interface PodsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.PodsNested<N>> {

            public N and();
            public N endPods();    }


    public interface ResourceNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceFluent<io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent.ResourceNested<N>> {

            public N and();
            public N endResource();    }


}
