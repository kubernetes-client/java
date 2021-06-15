package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1CustomResourceColumnDefinitionFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<A> {

    private java.lang.String jsONPath;
    private java.lang.String description;
    private java.lang.String format;
    private java.lang.String name;
    private java.lang.Integer priority;
    private java.lang.String type;

    public V1beta1CustomResourceColumnDefinitionFluentImpl() {
    }

    public V1beta1CustomResourceColumnDefinitionFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition instance) {
        this.withJsONPath(instance.getJsONPath());
        
        this.withDescription(instance.getDescription());
        
        this.withFormat(instance.getFormat());
        
        this.withName(instance.getName());
        
        this.withPriority(instance.getPriority());
        
        this.withType(instance.getType());
    }

    public java.lang.String getJsONPath() {
        return this.jsONPath;
    }

    public A withJsONPath(java.lang.String jsONPath) {
        this.jsONPath=jsONPath; return (A) this;
    }

    public java.lang.Boolean hasJsONPath() {
        return this.jsONPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withJsONPath instead.
     */
        public A withNewJsONPath(java.lang.String original) {
        return (A)withJsONPath(new String(original));
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public A withDescription(java.lang.String description) {
        this.description=description; return (A) this;
    }

    public java.lang.Boolean hasDescription() {
        return this.description != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDescription instead.
     */
        public A withNewDescription(java.lang.String original) {
        return (A)withDescription(new String(original));
    }

    public java.lang.String getFormat() {
        return this.format;
    }

    public A withFormat(java.lang.String format) {
        this.format=format; return (A) this;
    }

    public java.lang.Boolean hasFormat() {
        return this.format != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFormat instead.
     */
        public A withNewFormat(java.lang.String original) {
        return (A)withFormat(new String(original));
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

    public java.lang.Integer getPriority() {
        return this.priority;
    }

    public A withPriority(java.lang.Integer priority) {
        this.priority=priority; return (A) this;
    }

    public java.lang.Boolean hasPriority() {
        return this.priority != null;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceColumnDefinitionFluentImpl that = (V1beta1CustomResourceColumnDefinitionFluentImpl) o;
        if (jsONPath != null ? !jsONPath.equals(that.jsONPath) :that.jsONPath != null) return false;
        if (description != null ? !description.equals(that.description) :that.description != null) return false;
        if (format != null ? !format.equals(that.format) :that.format != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(jsONPath,  description,  format,  name,  priority,  type,  super.hashCode());
    }

}
