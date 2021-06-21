package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.lang.Boolean;
import java.util.Map;

public interface V1FlexVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getDriver();
    public A withDriver(java.lang.String driver);
    public java.lang.Boolean hasDriver();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDriver instead.
     */
        public A withNewDriver(java.lang.String original);
    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public A addToOptions(java.lang.String key,java.lang.String value);
    public A addToOptions(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromOptions(java.lang.String key);
    public A removeFromOptions(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getOptions();
    public <K,V>A withOptions(java.util.Map<java.lang.String,java.lang.String> options);
    public java.lang.Boolean hasOptions();
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecretRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef();
    public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();
    public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);
    public java.lang.Boolean hasSecretRef();
    public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
    public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
    public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<N>> {

            public N and();
            public N endSecretRef();    }


}
