package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public interface V1WatchEventFluent<A extends io.kubernetes.client.openapi.models.V1WatchEventFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Object getObject();
    public A withObject(java.lang.Object _object);
    public java.lang.Boolean hasObject();
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
}
