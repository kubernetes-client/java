package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class V1beta1OverheadFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1OverheadFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1OverheadFluent<A> {

    private java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> podFixed;

    public V1beta1OverheadFluentImpl() {
    }

    public V1beta1OverheadFluentImpl(io.kubernetes.client.openapi.models.V1beta1Overhead instance) {
        this.withPodFixed(instance.getPodFixed());
    }

    public A addToPodFixed(java.lang.String key,io.kubernetes.client.custom.Quantity value) {
        if(this.podFixed == null && key != null && value != null) { this.podFixed = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(key != null && value != null) {this.podFixed.put(key, value);} return (A)this;
    }

    public A addToPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.podFixed == null && map != null) { this.podFixed = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(map != null) { this.podFixed.putAll(map);} return (A)this;
    }

    public A removeFromPodFixed(java.lang.String key) {
        if(this.podFixed == null) { return (A) this; }
        if(key != null && this.podFixed != null) {this.podFixed.remove(key);} return (A)this;
    }

    public A removeFromPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.podFixed == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.podFixed != null){this.podFixed.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getPodFixed() {
        return this.podFixed;
    }

    public <K,V>A withPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> podFixed) {
        if (podFixed == null) { this.podFixed =  null;} else {this.podFixed = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(podFixed);} return (A) this;
    }

    public java.lang.Boolean hasPodFixed() {
        return this.podFixed != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1OverheadFluentImpl that = (V1beta1OverheadFluentImpl) o;
        if (podFixed != null ? !podFixed.equals(that.podFixed) :that.podFixed != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(podFixed,  super.hashCode());
    }

}
