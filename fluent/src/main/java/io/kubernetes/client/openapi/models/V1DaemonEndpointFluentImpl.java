package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1DaemonEndpointFluentImpl<A extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A> {

    private java.lang.Integer port;

    public V1DaemonEndpointFluentImpl() {
    }

    public V1DaemonEndpointFluentImpl(io.kubernetes.client.openapi.models.V1DaemonEndpoint instance) {
        this.withPort(instance.getPort());
    }

    public java.lang.Integer getPort() {
        return this.port;
    }

    public A withPort(java.lang.Integer port) {
        this.port=port; return (A) this;
    }

    public java.lang.Boolean hasPort() {
        return this.port != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1DaemonEndpointFluentImpl that = (V1DaemonEndpointFluentImpl) o;
        if (port != null ? !port.equals(that.port) :that.port != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(port,  super.hashCode());
    }

}
