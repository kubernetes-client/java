package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1StatusCauseFluentImpl<A extends io.kubernetes.client.openapi.models.V1StatusCauseFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1StatusCauseFluent<A> {

    private java.lang.String field;
    private java.lang.String message;
    private java.lang.String reason;

    public V1StatusCauseFluentImpl() {
    }

    public V1StatusCauseFluentImpl(io.kubernetes.client.openapi.models.V1StatusCause instance) {
        this.withField(instance.getField());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
    }

    public java.lang.String getField() {
        return this.field;
    }

    public A withField(java.lang.String field) {
        this.field=field; return (A) this;
    }

    public java.lang.Boolean hasField() {
        return this.field != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withField instead.
     */
        public A withNewField(java.lang.String original) {
        return (A)withField(new String(original));
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public A withMessage(java.lang.String message) {
        this.message=message; return (A) this;
    }

    public java.lang.Boolean hasMessage() {
        return this.message != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original) {
        return (A)withMessage(new String(original));
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    public A withReason(java.lang.String reason) {
        this.reason=reason; return (A) this;
    }

    public java.lang.Boolean hasReason() {
        return this.reason != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original) {
        return (A)withReason(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1StatusCauseFluentImpl that = (V1StatusCauseFluentImpl) o;
        if (field != null ? !field.equals(that.field) :that.field != null) return false;
        if (message != null ? !message.equals(that.message) :that.message != null) return false;
        if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(field,  message,  reason,  super.hashCode());
    }

}
