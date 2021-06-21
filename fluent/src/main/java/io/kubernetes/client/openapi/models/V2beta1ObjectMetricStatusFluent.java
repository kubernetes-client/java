package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta1ObjectMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public io.kubernetes.client.custom.Quantity getAverageValue();
    public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue);
    public java.lang.Boolean hasAverageValue();
    public A withNewAverageValue(java.lang.String value);
    public io.kubernetes.client.custom.Quantity getCurrentValue();
    public A withCurrentValue(io.kubernetes.client.custom.Quantity currentValue);
    public java.lang.Boolean hasCurrentValue();
    public A withNewCurrentValue(java.lang.String value);
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
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
    public java.lang.Boolean hasSelector();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTarget instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference getTarget();
    public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference buildTarget();
    public A withTarget(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference target);
    public java.lang.Boolean hasTarget();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> withNewTarget();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editTarget();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editOrNewTarget();
    public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


    public interface TargetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent.TargetNested<N>> {

            public N and();
            public N endTarget();    }


}
