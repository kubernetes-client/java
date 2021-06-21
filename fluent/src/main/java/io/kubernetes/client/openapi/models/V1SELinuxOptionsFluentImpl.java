package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1SELinuxOptionsFluentImpl<A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A> {

    private java.lang.String level;
    private java.lang.String role;
    private java.lang.String type;
    private java.lang.String user;

    public V1SELinuxOptionsFluentImpl() {
    }

    public V1SELinuxOptionsFluentImpl(io.kubernetes.client.openapi.models.V1SELinuxOptions instance) {
        this.withLevel(instance.getLevel());
        
        this.withRole(instance.getRole());
        
        this.withType(instance.getType());
        
        this.withUser(instance.getUser());
    }

    public java.lang.String getLevel() {
        return this.level;
    }

    public A withLevel(java.lang.String level) {
        this.level=level; return (A) this;
    }

    public java.lang.Boolean hasLevel() {
        return this.level != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withLevel instead.
     */
        public A withNewLevel(java.lang.String original) {
        return (A)withLevel(new String(original));
    }

    public java.lang.String getRole() {
        return this.role;
    }

    public A withRole(java.lang.String role) {
        this.role=role; return (A) this;
    }

    public java.lang.Boolean hasRole() {
        return this.role != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRole instead.
     */
        public A withNewRole(java.lang.String original) {
        return (A)withRole(new String(original));
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

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1SELinuxOptionsFluentImpl that = (V1SELinuxOptionsFluentImpl) o;
        if (level != null ? !level.equals(that.level) :that.level != null) return false;
        if (role != null ? !role.equals(that.role) :that.role != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        if (user != null ? !user.equals(that.user) :that.user != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(level,  role,  type,  user,  super.hashCode());
    }

}
