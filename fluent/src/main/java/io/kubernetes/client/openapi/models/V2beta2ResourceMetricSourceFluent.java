package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V2beta2ResourceMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTarget instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget();
    public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget();
    public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target);
    public java.lang.Boolean hasTarget();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTarget();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editTarget();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item);
    public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<io.kubernetes.client.openapi.models.V2beta2ResourceMetricSourceFluent.TargetNested<N>> {

            public N and();
            public N endTarget();    }


}
