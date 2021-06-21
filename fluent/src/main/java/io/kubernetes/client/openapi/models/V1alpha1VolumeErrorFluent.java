package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1alpha1VolumeErrorFluent<A extends io.kubernetes.client.openapi.models.V1alpha1VolumeErrorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getMessage();
    public A withMessage(java.lang.String message);
    public java.lang.Boolean hasMessage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original);
    public java.time.OffsetDateTime getTime();
    public A withTime(java.time.OffsetDateTime time);
    public java.lang.Boolean hasTime();
}
