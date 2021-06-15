package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeDaemonEndpointsBuilder extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluentImpl<io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints,io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder> {

    io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeDaemonEndpointsBuilder() {
        this(true);
    }

    public V1NodeDaemonEndpointsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NodeDaemonEndpoints(), validationEnabled);
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NodeDaemonEndpoints(), validationEnabled);
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints instance) {
        this(fluent, instance, true);
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withKubeletEndpoint(instance.getKubeletEndpoint());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints instance) {
        this(instance,true);
    }

    public V1NodeDaemonEndpointsBuilder(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withKubeletEndpoint(instance.getKubeletEndpoint());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints build() {
        V1NodeDaemonEndpoints buildable = new V1NodeDaemonEndpoints();
        buildable.setKubeletEndpoint(fluent.getKubeletEndpoint());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeDaemonEndpointsBuilder that = (V1NodeDaemonEndpointsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
