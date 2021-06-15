package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1TaintFluentImpl<A extends io.kubernetes.client.openapi.models.V1TaintFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TaintFluent<A> {

    private java.lang.String effect;
    private java.lang.String key;
    private java.time.OffsetDateTime timeAdded;
    private java.lang.String value;

    public V1TaintFluentImpl() {
    }

    public V1TaintFluentImpl(io.kubernetes.client.openapi.models.V1Taint instance) {
        this.withEffect(instance.getEffect());
        
        this.withKey(instance.getKey());
        
        this.withTimeAdded(instance.getTimeAdded());
        
        this.withValue(instance.getValue());
    }

    public java.lang.String getEffect() {
        return this.effect;
    }

    public A withEffect(java.lang.String effect) {
        this.effect=effect; return (A) this;
    }

    public java.lang.Boolean hasEffect() {
        return this.effect != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEffect instead.
     */
        public A withNewEffect(java.lang.String original) {
        return (A)withEffect(new String(original));
    }

    public java.lang.String getKey() {
        return this.key;
    }

    public A withKey(java.lang.String key) {
        this.key=key; return (A) this;
    }

    public java.lang.Boolean hasKey() {
        return this.key != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKey instead.
     */
        public A withNewKey(java.lang.String original) {
        return (A)withKey(new String(original));
    }

    public java.time.OffsetDateTime getTimeAdded() {
        return this.timeAdded;
    }

    public A withTimeAdded(java.time.OffsetDateTime timeAdded) {
        this.timeAdded=timeAdded; return (A) this;
    }

    public java.lang.Boolean hasTimeAdded() {
        return this.timeAdded != null;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public A withValue(java.lang.String value) {
        this.value=value; return (A) this;
    }

    public java.lang.Boolean hasValue() {
        return this.value != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withValue instead.
     */
        public A withNewValue(java.lang.String original) {
        return (A)withValue(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1TaintFluentImpl that = (V1TaintFluentImpl) o;
        if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
        if (key != null ? !key.equals(that.key) :that.key != null) return false;
        if (timeAdded != null ? !timeAdded.equals(that.timeAdded) :that.timeAdded != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(effect,  key,  timeAdded,  value,  super.hashCode());
    }

}
