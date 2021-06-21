package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1PodReadinessGateFluent<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getConditionType();
    public A withConditionType(java.lang.String conditionType);
    public java.lang.Boolean hasConditionType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withConditionType instead.
     */
        public A withNewConditionType(java.lang.String original);
}
