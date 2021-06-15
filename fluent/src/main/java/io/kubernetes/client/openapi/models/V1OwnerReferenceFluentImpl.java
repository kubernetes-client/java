package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1OwnerReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.Boolean blockOwnerDeletion;
    private java.lang.Boolean controller;
    private java.lang.String kind;
    private java.lang.String name;
    private java.lang.String uid;

    public V1OwnerReferenceFluentImpl() {
    }

    public V1OwnerReferenceFluentImpl(io.kubernetes.client.openapi.models.V1OwnerReference instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());
        
        this.withController(instance.getController());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withUid(instance.getUid());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public java.lang.Boolean getBlockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    public A withBlockOwnerDeletion(java.lang.Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion=blockOwnerDeletion; return (A) this;
    }

    public java.lang.Boolean hasBlockOwnerDeletion() {
        return this.blockOwnerDeletion != null;
    }

    public java.lang.Boolean getController() {
        return this.controller;
    }

    public A withController(java.lang.Boolean controller) {
        this.controller=controller; return (A) this;
    }

    public java.lang.Boolean hasController() {
        return this.controller != null;
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public java.lang.String getUid() {
        return this.uid;
    }

    public A withUid(java.lang.String uid) {
        this.uid=uid; return (A) this;
    }

    public java.lang.Boolean hasUid() {
        return this.uid != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original) {
        return (A)withUid(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1OwnerReferenceFluentImpl that = (V1OwnerReferenceFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (blockOwnerDeletion != null ? !blockOwnerDeletion.equals(that.blockOwnerDeletion) :that.blockOwnerDeletion != null) return false;
        if (controller != null ? !controller.equals(that.controller) :that.controller != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  blockOwnerDeletion,  controller,  kind,  name,  uid,  super.hashCode());
    }

}
