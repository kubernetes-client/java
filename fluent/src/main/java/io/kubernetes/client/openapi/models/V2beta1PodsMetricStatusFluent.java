package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta1PodsMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public io.kubernetes.client.custom.Quantity getCurrentAverageValue();
    public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);
    public java.lang.Boolean hasCurrentAverageValue();
    public A withNewCurrentAverageValue(java.lang.String value);
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
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


}
