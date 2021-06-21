package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1EndpointsBuilder extends io.kubernetes.client.openapi.models.V1EndpointsFluentImpl<io.kubernetes.client.openapi.models.V1EndpointsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Endpoints,io.kubernetes.client.openapi.models.V1EndpointsBuilder> {

    io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1EndpointsBuilder() {
        this(true);
    }

    public V1EndpointsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Endpoints(), validationEnabled);
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Endpoints(), validationEnabled);
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Endpoints instance) {
        this(fluent, instance, true);
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1EndpointsFluent<?> fluent,io.kubernetes.client.openapi.models.V1Endpoints instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSubsets(instance.getSubsets());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1Endpoints instance) {
        this(instance,true);
    }

    public V1EndpointsBuilder(io.kubernetes.client.openapi.models.V1Endpoints instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSubsets(instance.getSubsets());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Endpoints build() {
        V1Endpoints buildable = new V1Endpoints();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSubsets(fluent.getSubsets());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1EndpointsBuilder that = (V1EndpointsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
