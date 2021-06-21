package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V2beta2HPAScalingPolicyFluent<A extends io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getPeriodSeconds();
    public A withPeriodSeconds(java.lang.Integer periodSeconds);
    public java.lang.Boolean hasPeriodSeconds();
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public java.lang.Integer getValue();
    public A withValue(java.lang.Integer value);
    public java.lang.Boolean hasValue();
}
