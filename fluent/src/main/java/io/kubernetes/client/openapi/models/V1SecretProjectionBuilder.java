package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SecretProjectionBuilder extends io.kubernetes.client.openapi.models.V1SecretProjectionFluentImpl<io.kubernetes.client.openapi.models.V1SecretProjectionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SecretProjection,io.kubernetes.client.openapi.models.V1SecretProjectionBuilder> {

    io.kubernetes.client.openapi.models.V1SecretProjectionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SecretProjectionBuilder() {
        this(true);
    }

    public V1SecretProjectionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SecretProjection(), validationEnabled);
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjectionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjectionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SecretProjection(), validationEnabled);
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretProjection instance) {
        this(fluent, instance, true);
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretProjection instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withItems(instance.getItems());
        
        fluent.withName(instance.getName());
        
        fluent.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjection instance) {
        this(instance,true);
    }

    public V1SecretProjectionBuilder(io.kubernetes.client.openapi.models.V1SecretProjection instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withItems(instance.getItems());
        
        this.withName(instance.getName());
        
        this.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SecretProjection build() {
        V1SecretProjection buildable = new V1SecretProjection();
        buildable.setItems(fluent.getItems());
        buildable.setName(fluent.getName());
        buildable.setOptional(fluent.getOptional());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SecretProjectionBuilder that = (V1SecretProjectionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
