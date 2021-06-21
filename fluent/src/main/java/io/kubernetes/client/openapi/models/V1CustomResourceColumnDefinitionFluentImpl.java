package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1CustomResourceColumnDefinitionFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<A> {

    private java.lang.String description;
    private java.lang.String format;
    private java.lang.String jsonPath;
    private java.lang.String name;
    private java.lang.Integer priority;
    private java.lang.String type;

    public V1CustomResourceColumnDefinitionFluentImpl() {
    }

    public V1CustomResourceColumnDefinitionFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance) {
        this.withDescription(instance.getDescription());
        
        this.withFormat(instance.getFormat());
        
        this.withJsonPath(instance.getJsonPath());
        
        this.withName(instance.getName());
        
        this.withPriority(instance.getPriority());
        
        this.withType(instance.getType());
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

    public java.lang.String getJsonPath() {
        return this.jsonPath;
    }

    public A withJsonPath(java.lang.String jsonPath) {
        this.jsonPath=jsonPath; return (A) this;
    }

    public java.lang.Boolean hasJsonPath() {
        return this.jsonPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withJsonPath instead.
     */
        public A withNewJsonPath(java.lang.String original) {
        return (A)withJsonPath(new String(original));
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
        V1CustomResourceColumnDefinitionFluentImpl that = (V1CustomResourceColumnDefinitionFluentImpl) o;
        if (description != null ? !description.equals(that.description) :that.description != null) return false;
        if (format != null ? !format.equals(that.format) :that.format != null) return false;
        if (jsonPath != null ? !jsonPath.equals(that.jsonPath) :that.jsonPath != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(description,  format,  jsonPath,  name,  priority,  type,  super.hashCode());
    }

}
