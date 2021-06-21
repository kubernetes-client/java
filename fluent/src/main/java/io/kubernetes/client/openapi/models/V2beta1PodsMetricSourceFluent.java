package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta1PodsMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.custom.Quantity getTargetAverageValue();
    public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);
    public java.lang.Boolean hasTargetAverageValue();
    public A withNewTargetAverageValue(java.lang.String value);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


}
