package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta2ObjectMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildCurrent instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent();
    public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();
    public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);
    public java.lang.Boolean hasCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<A> editCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDescribedObject instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference getDescribedObject();
    public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference buildDescribedObject();
    public A withDescribedObject(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference describedObject);
    public java.lang.Boolean hasDescribedObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObjectLike(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editDescribedObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObject();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetric instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier getMetric();
    public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric();
    public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric);
    public java.lang.Boolean hasMetric();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<A> withNewMetric();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<A> editMetric();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetric();
    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
    public interface CurrentNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.CurrentNested<N>> {

            public N and();
            public N endCurrent();    }


    public interface DescribedObjectNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.DescribedObjectNested<N>> {

            public N and();
            public N endDescribedObject();    }


    public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluent.MetricNested<N>> {

            public N and();
            public N endMetric();    }


}
