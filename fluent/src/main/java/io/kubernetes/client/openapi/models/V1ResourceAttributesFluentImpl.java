package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ResourceAttributesFluentImpl<A extends io.kubernetes.client.openapi.models.V1ResourceAttributesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ResourceAttributesFluent<A> {

    private java.lang.String group;
    private java.lang.String name;
    private java.lang.String namespace;
    private java.lang.String resource;
    private java.lang.String subresource;
    private java.lang.String verb;
    private java.lang.String version;

    public V1ResourceAttributesFluentImpl() {
    }

    public V1ResourceAttributesFluentImpl(io.kubernetes.client.openapi.models.V1ResourceAttributes instance) {
        this.withGroup(instance.getGroup());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withResource(instance.getResource());
        
        this.withSubresource(instance.getSubresource());
        
        this.withVerb(instance.getVerb());
        
        this.withVersion(instance.getVersion());
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

    public java.lang.String getNamespace() {
        return this.namespace;
    }

    public A withNamespace(java.lang.String namespace) {
        this.namespace=namespace; return (A) this;
    }

    public java.lang.Boolean hasNamespace() {
        return this.namespace != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNamespace instead.
     */
        public A withNewNamespace(java.lang.String original) {
        return (A)withNamespace(new String(original));
    }

    public java.lang.String getResource() {
        return this.resource;
    }

    public A withResource(java.lang.String resource) {
        this.resource=resource; return (A) this;
    }

    public java.lang.Boolean hasResource() {
        return this.resource != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResource instead.
     */
        public A withNewResource(java.lang.String original) {
        return (A)withResource(new String(original));
    }

    public java.lang.String getSubresource() {
        return this.subresource;
    }

    public A withSubresource(java.lang.String subresource) {
        this.subresource=subresource; return (A) this;
    }

    public java.lang.Boolean hasSubresource() {
        return this.subresource != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSubresource instead.
     */
        public A withNewSubresource(java.lang.String original) {
        return (A)withSubresource(new String(original));
    }

    public java.lang.String getVerb() {
        return this.verb;
    }

    public A withVerb(java.lang.String verb) {
        this.verb=verb; return (A) this;
    }

    public java.lang.Boolean hasVerb() {
        return this.verb != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVerb instead.
     */
        public A withNewVerb(java.lang.String original) {
        return (A)withVerb(new String(original));
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public A withVersion(java.lang.String version) {
        this.version=version; return (A) this;
    }

    public java.lang.Boolean hasVersion() {
        return this.version != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original) {
        return (A)withVersion(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ResourceAttributesFluentImpl that = (V1ResourceAttributesFluentImpl) o;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
        if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
        if (subresource != null ? !subresource.equals(that.subresource) :that.subresource != null) return false;
        if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
        if (version != null ? !version.equals(that.version) :that.version != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(group,  name,  namespace,  resource,  subresource,  verb,  version,  super.hashCode());
    }

}
