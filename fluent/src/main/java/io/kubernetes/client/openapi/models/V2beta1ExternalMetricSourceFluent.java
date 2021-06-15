package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta1ExternalMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getMetricName();
    public A withMetricName(java.lang.String metricName);
    public java.lang.Boolean hasMetricName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMetricName instead.
     */
        public A withNewMetricName(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetricSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getMetricSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildMetricSelector();
    public A withMetricSelector(io.kubernetes.client.openapi.models.V1LabelSelector metricSelector);
    public java.lang.Boolean hasMetricSelector();
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelector();
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> editMetricSelector();
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelector();
    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.custom.Quantity getTargetAverageValue();
    public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);
    public java.lang.Boolean hasTargetAverageValue();
    public A withNewTargetAverageValue(java.lang.String value);
    public io.kubernetes.client.custom.Quantity getTargetValue();
    public A withTargetValue(io.kubernetes.client.custom.Quantity targetValue);
    public java.lang.Boolean hasTargetValue();
    public A withNewTargetValue(java.lang.String value);
    public interface MetricSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent.MetricSelectorNested<N>> {

            public N and();
            public N endMetricSelector();    }


}
