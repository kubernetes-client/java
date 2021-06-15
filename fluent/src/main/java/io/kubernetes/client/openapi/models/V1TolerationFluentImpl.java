package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1TolerationFluentImpl<A extends io.kubernetes.client.openapi.models.V1TolerationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TolerationFluent<A> {

    private java.lang.String effect;
    private java.lang.String key;
    private java.lang.String operator;
    private java.lang.Long tolerationSeconds;
    private java.lang.String value;

    public V1TolerationFluentImpl() {
    }

    public V1TolerationFluentImpl(io.kubernetes.client.openapi.models.V1Toleration instance) {
        this.withEffect(instance.getEffect());
        
        this.withKey(instance.getKey());
        
        this.withOperator(instance.getOperator());
        
        this.withTolerationSeconds(instance.getTolerationSeconds());
        
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

    public java.lang.String getOperator() {
        return this.operator;
    }

    public A withOperator(java.lang.String operator) {
        this.operator=operator; return (A) this;
    }

    public java.lang.Boolean hasOperator() {
        return this.operator != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOperator instead.
     */
        public A withNewOperator(java.lang.String original) {
        return (A)withOperator(new String(original));
    }

    public java.lang.Long getTolerationSeconds() {
        return this.tolerationSeconds;
    }

    public A withTolerationSeconds(java.lang.Long tolerationSeconds) {
        this.tolerationSeconds=tolerationSeconds; return (A) this;
    }

    public java.lang.Boolean hasTolerationSeconds() {
        return this.tolerationSeconds != null;
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
        V1TolerationFluentImpl that = (V1TolerationFluentImpl) o;
        if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
        if (key != null ? !key.equals(that.key) :that.key != null) return false;
        if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
        if (tolerationSeconds != null ? !tolerationSeconds.equals(that.tolerationSeconds) :that.tolerationSeconds != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(effect,  key,  operator,  tolerationSeconds,  value,  super.hashCode());
    }

}
