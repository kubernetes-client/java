package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;

public interface V1VolumeProjectionFluent<A extends io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConfigMap instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ConfigMapProjection getConfigMap();
    public io.kubernetes.client.openapi.models.V1ConfigMapProjection buildConfigMap();
    public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapProjection configMap);
    public java.lang.Boolean hasConfigMap();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMap();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapProjection item);
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A> editConfigMap();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMap();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapProjection item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDownwardAPI instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DownwardAPIProjection getDownwardAPI();
    public io.kubernetes.client.openapi.models.V1DownwardAPIProjection buildDownwardAPI();
    public A withDownwardAPI(io.kubernetes.client.openapi.models.V1DownwardAPIProjection downwardAPI);
    public java.lang.Boolean hasDownwardAPI();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPI();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIProjection item);
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A> editDownwardAPI();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPI();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIProjection item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecret instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1SecretProjection getSecret();
    public io.kubernetes.client.openapi.models.V1SecretProjection buildSecret();
    public A withSecret(io.kubernetes.client.openapi.models.V1SecretProjection secret);
    public java.lang.Boolean hasSecret();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> withNewSecret();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> withNewSecretLike(io.kubernetes.client.openapi.models.V1SecretProjection item);
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> editSecret();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> editOrNewSecret();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> editOrNewSecretLike(io.kubernetes.client.openapi.models.V1SecretProjection item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildServiceAccountToken instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection getServiceAccountToken();
    public io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection buildServiceAccountToken();
    public A withServiceAccountToken(io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection serviceAccountToken);
    public java.lang.Boolean hasServiceAccountToken();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountToken();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection item);
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editServiceAccountToken();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountToken();
    public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection item);
    public interface ConfigMapNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<N>> {

            public N and();
            public N endConfigMap();    }


    public interface DownwardAPINested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<N>> {

            public N and();
            public N endDownwardAPI();    }


    public interface SecretNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretProjectionFluent<io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<N>> {

            public N and();
            public N endSecret();    }


    public interface ServiceAccountTokenNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluent<io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<N>> {

            public N and();
            public N endServiceAccountToken();    }


}
