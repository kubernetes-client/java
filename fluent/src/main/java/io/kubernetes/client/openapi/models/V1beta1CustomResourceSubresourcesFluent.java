package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Boolean;

public interface V1beta1CustomResourceSubresourcesFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScale instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale getScale();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale buildScale();
    public A withScale(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale scale);
    public java.lang.Boolean hasScale();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScale();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> withNewScaleLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editScale();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScale();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<A> editOrNewScaleLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale item);
    public java.lang.Object getStatus();
    public A withStatus(java.lang.Object status);
    public java.lang.Boolean hasStatus();
    public interface ScaleNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourcesFluent.ScaleNested<N>> {

            public N and();
            public N endScale();    }


}
