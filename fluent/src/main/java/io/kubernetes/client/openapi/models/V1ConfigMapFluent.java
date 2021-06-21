package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.lang.Boolean;
import java.util.Map;

public interface V1ConfigMapFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToBinaryData(java.lang.String key,byte[] value);
    public A addToBinaryData(java.util.Map<java.lang.String,byte[]> map);
    public A removeFromBinaryData(java.lang.String key);
    public A removeFromBinaryData(java.util.Map<java.lang.String,byte[]> map);
    public java.util.Map<java.lang.String,byte[]> getBinaryData();
    public <K,V>A withBinaryData(java.util.Map<java.lang.String,byte[]> binaryData);
    public java.lang.Boolean hasBinaryData();
    public A addToData(java.lang.String key,java.lang.String value);
    public A addToData(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromData(java.lang.String key);
    public A removeFromData(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getData();
    public <K,V>A withData(java.util.Map<java.lang.String,java.lang.String> data);
    public java.lang.Boolean hasData();
    public java.lang.Boolean getImmutable();
    public A withImmutable(java.lang.Boolean immutable);
    public java.lang.Boolean hasImmutable();
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ConfigMapFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


}
