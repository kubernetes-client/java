package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta2ExternalMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetric instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier getMetric();
    public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric();
    public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric);
    public java.lang.Boolean hasMetric();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetric();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editMetric();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetric();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTarget instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget();
    public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget();
    public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target);
    public java.lang.Boolean hasTarget();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTarget();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editTarget();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTarget();
    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
    public interface MetricNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<N>> {

            public N and();
            public N endMetric();    }


    public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<N>> {

            public N and();
            public N endTarget();    }


}
