package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1CinderVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
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
    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
    public java.lang.String getVolumeID();
    public A withVolumeID(java.lang.String volumeID);
    public java.lang.Boolean hasVolumeID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeID instead.
     */
        public A withNewVolumeID(java.lang.String original);
    public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<N>> {

            public N and();
            public N endSecretRef();    }


}
