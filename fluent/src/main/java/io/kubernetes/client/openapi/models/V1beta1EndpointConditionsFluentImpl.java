package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1EndpointConditionsFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<A> {

    private java.lang.Boolean ready;
    private java.lang.Boolean serving;
    private java.lang.Boolean terminating;

    public V1beta1EndpointConditionsFluentImpl() {
    }

    public V1beta1EndpointConditionsFluentImpl(io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance) {
        this.withReady(instance.getReady());
        
        this.withServing(instance.getServing());
        
        this.withTerminating(instance.getTerminating());
    }

    public java.lang.Boolean getReady() {
        return this.ready;
    }

    public A withReady(java.lang.Boolean ready) {
        this.ready=ready; return (A) this;
    }

    public java.lang.Boolean hasReady() {
        return this.ready != null;
    }

    public java.lang.Boolean getServing() {
        return this.serving;
    }

    public A withServing(java.lang.Boolean serving) {
        this.serving=serving; return (A) this;
    }

    public java.lang.Boolean hasServing() {
        return this.serving != null;
    }

    public java.lang.Boolean getTerminating() {
        return this.terminating;
    }

    public A withTerminating(java.lang.Boolean terminating) {
        this.terminating=terminating; return (A) this;
    }

    public java.lang.Boolean hasTerminating() {
        return this.terminating != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1EndpointConditionsFluentImpl that = (V1beta1EndpointConditionsFluentImpl) o;
        if (ready != null ? !ready.equals(that.ready) :that.ready != null) return false;
        if (serving != null ? !serving.equals(that.serving) :that.serving != null) return false;
        if (terminating != null ? !terminating.equals(that.terminating) :that.terminating != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(ready,  serving,  terminating,  super.hashCode());
    }

}
