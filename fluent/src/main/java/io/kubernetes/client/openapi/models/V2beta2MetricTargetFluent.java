package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

public interface V2beta2MetricTargetFluent<A extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getAverageUtilization();
    public A withAverageUtilization(java.lang.Integer averageUtilization);
    public java.lang.Boolean hasAverageUtilization();
    public io.kubernetes.client.custom.Quantity getAverageValue();
    public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue);
    public java.lang.Boolean hasAverageValue();
    public A withNewAverageValue(java.lang.String value);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public io.kubernetes.client.custom.Quantity getValue();
    public A withValue(io.kubernetes.client.custom.Quantity value);
    public java.lang.Boolean hasValue();
    public A withNewValue(java.lang.String value);
}
