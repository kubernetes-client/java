package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1AllowedFlexVolumeFluent<A extends io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getDriver();
    public A withDriver(java.lang.String driver);
    public java.lang.Boolean hasDriver();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDriver instead.
     */
        public A withNewDriver(java.lang.String original);
}
