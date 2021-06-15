package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

public interface V1EmptyDirVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getMedium();
    public A withMedium(java.lang.String medium);
    public java.lang.Boolean hasMedium();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMedium instead.
     */
        public A withNewMedium(java.lang.String original);
    public io.kubernetes.client.custom.Quantity getSizeLimit();
    public A withSizeLimit(io.kubernetes.client.custom.Quantity sizeLimit);
    public java.lang.Boolean hasSizeLimit();
    public A withNewSizeLimit(java.lang.String value);
}
