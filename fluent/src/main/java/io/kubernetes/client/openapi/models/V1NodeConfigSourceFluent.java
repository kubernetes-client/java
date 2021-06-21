package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1NodeConfigSourceFluent<A extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConfigMap instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource getConfigMap();
    public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource buildConfigMap();
    public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource configMap);
    public java.lang.Boolean hasConfigMap();
    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap();
    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);
    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap();
    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap();
    public io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource item);
    public interface ConfigMapNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent.ConfigMapNested<N>> {

            public N and();
            public N endConfigMap();    }


}
