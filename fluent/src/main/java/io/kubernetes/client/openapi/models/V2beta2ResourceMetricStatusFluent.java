package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V2beta2ResourceMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildCurrent instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent();
    public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();
    public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);
    public java.lang.Boolean hasCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public interface CurrentNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent.CurrentNested<N>> {

            public N and();
            public N endCurrent();    }


}
