package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class V1beta1PodDisruptionBudgetStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<A> {

    private java.lang.Integer currentHealthy;
    private java.lang.Integer desiredHealthy;
    private java.util.Map<java.lang.String,java.time.OffsetDateTime> disruptedPods;
    private java.lang.Integer disruptionsAllowed;
    private java.lang.Integer expectedPods;
    private java.lang.Long observedGeneration;

    public V1beta1PodDisruptionBudgetStatusFluentImpl() {
    }

    public V1beta1PodDisruptionBudgetStatusFluentImpl(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance) {
        this.withCurrentHealthy(instance.getCurrentHealthy());
        
        this.withDesiredHealthy(instance.getDesiredHealthy());
        
        this.withDisruptedPods(instance.getDisruptedPods());
        
        this.withDisruptionsAllowed(instance.getDisruptionsAllowed());
        
        this.withExpectedPods(instance.getExpectedPods());
        
        this.withObservedGeneration(instance.getObservedGeneration());
    }

    public java.lang.Integer getCurrentHealthy() {
        return this.currentHealthy;
    }

    public A withCurrentHealthy(java.lang.Integer currentHealthy) {
        this.currentHealthy=currentHealthy; return (A) this;
    }

    public java.lang.Boolean hasCurrentHealthy() {
        return this.currentHealthy != null;
    }

    public java.lang.Integer getDesiredHealthy() {
        return this.desiredHealthy;
    }

    public A withDesiredHealthy(java.lang.Integer desiredHealthy) {
        this.desiredHealthy=desiredHealthy; return (A) this;
    }

    public java.lang.Boolean hasDesiredHealthy() {
        return this.desiredHealthy != null;
    }

    public A addToDisruptedPods(java.lang.String key,java.time.OffsetDateTime value) {
        if(this.disruptedPods == null && key != null && value != null) { this.disruptedPods = new java.util.LinkedHashMap<java.lang.String,java.time.OffsetDateTime>(); }
        if(key != null && value != null) {this.disruptedPods.put(key, value);} return (A)this;
    }

    public A addToDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map) {
        if(this.disruptedPods == null && map != null) { this.disruptedPods = new java.util.LinkedHashMap<java.lang.String,java.time.OffsetDateTime>(); }
        if(map != null) { this.disruptedPods.putAll(map);} return (A)this;
    }

    public A removeFromDisruptedPods(java.lang.String key) {
        if(this.disruptedPods == null) { return (A) this; }
        if(key != null && this.disruptedPods != null) {this.disruptedPods.remove(key);} return (A)this;
    }

    public A removeFromDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map) {
        if(this.disruptedPods == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.disruptedPods != null){this.disruptedPods.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,java.time.OffsetDateTime> getDisruptedPods() {
        return this.disruptedPods;
    }

    public <K,V>A withDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> disruptedPods) {
        if (disruptedPods == null) { this.disruptedPods =  null;} else {this.disruptedPods = new java.util.LinkedHashMap<java.lang.String,java.time.OffsetDateTime>(disruptedPods);} return (A) this;
    }

    public java.lang.Boolean hasDisruptedPods() {
        return this.disruptedPods != null;
    }

    public java.lang.Integer getDisruptionsAllowed() {
        return this.disruptionsAllowed;
    }

    public A withDisruptionsAllowed(java.lang.Integer disruptionsAllowed) {
        this.disruptionsAllowed=disruptionsAllowed; return (A) this;
    }

    public java.lang.Boolean hasDisruptionsAllowed() {
        return this.disruptionsAllowed != null;
    }

    public java.lang.Integer getExpectedPods() {
        return this.expectedPods;
    }

    public A withExpectedPods(java.lang.Integer expectedPods) {
        this.expectedPods=expectedPods; return (A) this;
    }

    public java.lang.Boolean hasExpectedPods() {
        return this.expectedPods != null;
    }

    public java.lang.Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public A withObservedGeneration(java.lang.Long observedGeneration) {
        this.observedGeneration=observedGeneration; return (A) this;
    }

    public java.lang.Boolean hasObservedGeneration() {
        return this.observedGeneration != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1PodDisruptionBudgetStatusFluentImpl that = (V1beta1PodDisruptionBudgetStatusFluentImpl) o;
        if (currentHealthy != null ? !currentHealthy.equals(that.currentHealthy) :that.currentHealthy != null) return false;
        if (desiredHealthy != null ? !desiredHealthy.equals(that.desiredHealthy) :that.desiredHealthy != null) return false;
        if (disruptedPods != null ? !disruptedPods.equals(that.disruptedPods) :that.disruptedPods != null) return false;
        if (disruptionsAllowed != null ? !disruptionsAllowed.equals(that.disruptionsAllowed) :that.disruptionsAllowed != null) return false;
        if (expectedPods != null ? !expectedPods.equals(that.expectedPods) :that.expectedPods != null) return false;
        if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(currentHealthy,  desiredHealthy,  disruptedPods,  disruptionsAllowed,  expectedPods,  observedGeneration,  super.hashCode());
    }

}
