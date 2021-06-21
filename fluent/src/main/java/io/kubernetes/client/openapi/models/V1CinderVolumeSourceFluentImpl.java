package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1CinderVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<A> {

    private java.lang.String fsType;
    private java.lang.Boolean readOnly;
    private io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder secretRef;
    private java.lang.String volumeID;

    public V1CinderVolumeSourceFluentImpl() {
    }

    public V1CinderVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1CinderVolumeSource instance) {
        this.withFsType(instance.getFsType());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withVolumeID(instance.getVolumeID());
    }

    public java.lang.String getFsType() {
        return this.fsType;
    }

    public A withFsType(java.lang.String fsType) {
        this.fsType=fsType; return (A) this;
    }

    public java.lang.Boolean hasFsType() {
        return this.fsType != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original) {
        return (A)withFsType(new String(original));
    }

    public java.lang.Boolean getReadOnly() {
        return this.readOnly;
    }

    public A withReadOnly(java.lang.Boolean readOnly) {
        this.readOnly=readOnly; return (A) this;
    }

    public java.lang.Boolean hasReadOnly() {
        return this.readOnly != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecretRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef() {
        return this.secretRef!=null?this.secretRef.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef() {
        return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef) {
        _visitables.get("secretRef").remove(this.secretRef);
        if (secretRef!=null){ this.secretRef= new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} return (A) this;
    }

    public java.lang.Boolean hasSecretRef() {
        return this.secretRef != null;
    }

    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
        return new io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluentImpl.SecretRefNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
        return new io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluentImpl.SecretRefNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
        return withNewSecretRefLike(getSecretRef());
    }

    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
        return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
        return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public java.lang.String getVolumeID() {
        return this.volumeID;
    }

    public A withVolumeID(java.lang.String volumeID) {
        this.volumeID=volumeID; return (A) this;
    }

    public java.lang.Boolean hasVolumeID() {
        return this.volumeID != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeID instead.
     */
        public A withNewVolumeID(java.lang.String original) {
        return (A)withVolumeID(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1CinderVolumeSourceFluentImpl that = (V1CinderVolumeSourceFluentImpl) o;
        if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
        if (volumeID != null ? !volumeID.equals(that.volumeID) :that.volumeID != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fsType,  readOnly,  secretRef,  volumeID,  super.hashCode());
    }

    public class SecretRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<N>> implements io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent.SecretRefNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

            SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this, item);
                        
            }

            SecretRefNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1CinderVolumeSourceFluentImpl.this.withSecretRef(builder.build());
            }

            public N endSecretRef() {
                return and();
            }
    }


}
