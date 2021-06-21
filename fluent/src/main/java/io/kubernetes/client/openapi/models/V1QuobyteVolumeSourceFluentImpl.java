package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1QuobyteVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<A> {

    private java.lang.String group;
    private java.lang.Boolean readOnly;
    private java.lang.String registry;
    private java.lang.String tenant;
    private java.lang.String user;
    private java.lang.String volume;

    public V1QuobyteVolumeSourceFluentImpl() {
    }

    public V1QuobyteVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance) {
        this.withGroup(instance.getGroup());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withRegistry(instance.getRegistry());
        
        this.withTenant(instance.getTenant());
        
        this.withUser(instance.getUser());
        
        this.withVolume(instance.getVolume());
    }

    public java.lang.String getGroup() {
        return this.group;
    }

    public A withGroup(java.lang.String group) {
        this.group=group; return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return this.group != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original) {
        return (A)withGroup(new String(original));
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

    public java.lang.String getRegistry() {
        return this.registry;
    }

    public A withRegistry(java.lang.String registry) {
        this.registry=registry; return (A) this;
    }

    public java.lang.Boolean hasRegistry() {
        return this.registry != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRegistry instead.
     */
        public A withNewRegistry(java.lang.String original) {
        return (A)withRegistry(new String(original));
    }

    public java.lang.String getTenant() {
        return this.tenant;
    }

    public A withTenant(java.lang.String tenant) {
        this.tenant=tenant; return (A) this;
    }

    public java.lang.Boolean hasTenant() {
        return this.tenant != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTenant instead.
     */
        public A withNewTenant(java.lang.String original) {
        return (A)withTenant(new String(original));
    }

    public java.lang.String getUser() {
        return this.user;
    }

    public A withUser(java.lang.String user) {
        this.user=user; return (A) this;
    }

    public java.lang.Boolean hasUser() {
        return this.user != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original) {
        return (A)withUser(new String(original));
    }

    public java.lang.String getVolume() {
        return this.volume;
    }

    public A withVolume(java.lang.String volume) {
        this.volume=volume; return (A) this;
    }

    public java.lang.Boolean hasVolume() {
        return this.volume != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolume instead.
     */
        public A withNewVolume(java.lang.String original) {
        return (A)withVolume(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1QuobyteVolumeSourceFluentImpl that = (V1QuobyteVolumeSourceFluentImpl) o;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        if (registry != null ? !registry.equals(that.registry) :that.registry != null) return false;
        if (tenant != null ? !tenant.equals(that.tenant) :that.tenant != null) return false;
        if (user != null ? !user.equals(that.user) :that.user != null) return false;
        if (volume != null ? !volume.equals(that.volume) :that.volume != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(group,  readOnly,  registry,  tenant,  user,  volume,  super.hashCode());
    }

}
