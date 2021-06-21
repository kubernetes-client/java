package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ServiceBackendPortFluent<A extends io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Integer getNumber();
    public A withNumber(java.lang.Integer number);
    public java.lang.Boolean hasNumber();
}
