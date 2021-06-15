package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1EndpointPortBuilder extends io.kubernetes.client.openapi.models.V1EndpointPortFluentImpl<io.kubernetes.client.openapi.models.V1EndpointPortBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1EndpointPort,io.kubernetes.client.openapi.models.V1EndpointPortBuilder> {

    io.kubernetes.client.openapi.models.V1EndpointPortFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1EndpointPortBuilder() {
        this(true);
    }

    public V1EndpointPortBuilder(java.lang.Boolean validationEnabled) {
        this(new V1EndpointPort(), validationEnabled);
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPortFluent<?> fluent) {
        this(fluent, true);
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1EndpointPort(), validationEnabled);
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointPort instance) {
        this(fluent, instance, true);
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointPort instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAppProtocol(instance.getAppProtocol());
        
        fluent.withName(instance.getName());
        
        fluent.withPort(instance.getPort());
        
        fluent.withProtocol(instance.getProtocol());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPort instance) {
        this(instance,true);
    }

    public V1EndpointPortBuilder(io.kubernetes.client.openapi.models.V1EndpointPort instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAppProtocol(instance.getAppProtocol());
        
        this.withName(instance.getName());
        
        this.withPort(instance.getPort());
        
        this.withProtocol(instance.getProtocol());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1EndpointPort build() {
        V1EndpointPort buildable = new V1EndpointPort();
        buildable.setAppProtocol(fluent.getAppProtocol());
        buildable.setName(fluent.getName());
        buildable.setPort(fluent.getPort());
        buildable.setProtocol(fluent.getProtocol());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1EndpointPortBuilder that = (V1EndpointPortBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
