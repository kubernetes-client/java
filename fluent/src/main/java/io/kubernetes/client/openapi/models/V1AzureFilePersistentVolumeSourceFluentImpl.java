package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1AzureFilePersistentVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<A> {

    private java.lang.Boolean readOnly;
    private java.lang.String secretName;
    private java.lang.String secretNamespace;
    private java.lang.String shareName;

    public V1AzureFilePersistentVolumeSourceFluentImpl() {
    }

    public V1AzureFilePersistentVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource instance) {
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretName(instance.getSecretName());
        
        this.withSecretNamespace(instance.getSecretNamespace());
        
        this.withShareName(instance.getShareName());
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

    public java.lang.String getSecretName() {
        return this.secretName;
    }

    public A withSecretName(java.lang.String secretName) {
        this.secretName=secretName; return (A) this;
    }

    public java.lang.Boolean hasSecretName() {
        return this.secretName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSecretName instead.
     */
        public A withNewSecretName(java.lang.String original) {
        return (A)withSecretName(new String(original));
    }

    public java.lang.String getSecretNamespace() {
        return this.secretNamespace;
    }

    public A withSecretNamespace(java.lang.String secretNamespace) {
        this.secretNamespace=secretNamespace; return (A) this;
    }

    public java.lang.Boolean hasSecretNamespace() {
        return this.secretNamespace != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSecretNamespace instead.
     */
        public A withNewSecretNamespace(java.lang.String original) {
        return (A)withSecretNamespace(new String(original));
    }

    public java.lang.String getShareName() {
        return this.shareName;
    }

    public A withShareName(java.lang.String shareName) {
        this.shareName=shareName; return (A) this;
    }

    public java.lang.Boolean hasShareName() {
        return this.shareName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withShareName instead.
     */
        public A withNewShareName(java.lang.String original) {
        return (A)withShareName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1AzureFilePersistentVolumeSourceFluentImpl that = (V1AzureFilePersistentVolumeSourceFluentImpl) o;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        if (secretName != null ? !secretName.equals(that.secretName) :that.secretName != null) return false;
        if (secretNamespace != null ? !secretNamespace.equals(that.secretNamespace) :that.secretNamespace != null) return false;
        if (shareName != null ? !shareName.equals(that.shareName) :that.shareName != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(readOnly,  secretName,  secretNamespace,  shareName,  super.hashCode());
    }

}
