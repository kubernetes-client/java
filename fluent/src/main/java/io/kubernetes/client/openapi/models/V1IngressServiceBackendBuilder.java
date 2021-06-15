package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1IngressServiceBackendBuilder extends io.kubernetes.client.openapi.models.V1IngressServiceBackendFluentImpl<io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IngressServiceBackend,io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder> {

    io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1IngressServiceBackendBuilder() {
        this(true);
    }

    public V1IngressServiceBackendBuilder(java.lang.Boolean validationEnabled) {
        this(new V1IngressServiceBackend(), validationEnabled);
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent) {
        this(fluent, true);
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1IngressServiceBackend(), validationEnabled);
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressServiceBackend instance) {
        this(fluent, instance, true);
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressServiceBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackend instance) {
        this(instance,true);
    }

    public V1IngressServiceBackendBuilder(io.kubernetes.client.openapi.models.V1IngressServiceBackend instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withPort(instance.getPort());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1IngressServiceBackend build() {
        V1IngressServiceBackend buildable = new V1IngressServiceBackend();
        buildable.setName(fluent.getName());
        buildable.setPort(fluent.getPort());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1IngressServiceBackendBuilder that = (V1IngressServiceBackendBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
