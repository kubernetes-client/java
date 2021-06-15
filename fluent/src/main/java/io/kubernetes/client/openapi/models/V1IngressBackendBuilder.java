package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1IngressBackendBuilder extends io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl<io.kubernetes.client.openapi.models.V1IngressBackendBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IngressBackend,io.kubernetes.client.openapi.models.V1IngressBackendBuilder> {

    io.kubernetes.client.openapi.models.V1IngressBackendFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1IngressBackendBuilder() {
        this(true);
    }

    public V1IngressBackendBuilder(java.lang.Boolean validationEnabled) {
        this(new V1IngressBackend(), validationEnabled);
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackendFluent<?> fluent) {
        this(fluent, true);
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackendFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1IngressBackend(), validationEnabled);
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackendFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressBackend instance) {
        this(fluent, instance, true);
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackendFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withResource(instance.getResource());
        
        fluent.withService(instance.getService());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackend instance) {
        this(instance,true);
    }

    public V1IngressBackendBuilder(io.kubernetes.client.openapi.models.V1IngressBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withResource(instance.getResource());
        
        this.withService(instance.getService());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1IngressBackend build() {
        V1IngressBackend buildable = new V1IngressBackend();
        buildable.setResource(fluent.getResource());
        buildable.setService(fluent.getService());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1IngressBackendBuilder that = (V1IngressBackendBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
