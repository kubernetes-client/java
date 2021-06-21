package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ConfigMapProjectionBuilder extends io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl<io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ConfigMapProjection,io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder> {

    io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ConfigMapProjectionBuilder() {
        this(true);
    }

    public V1ConfigMapProjectionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ConfigMapProjection(), validationEnabled);
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ConfigMapProjection(), validationEnabled);
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapProjection instance) {
        this(fluent, instance, true);
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapProjection instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withItems(instance.getItems());
        
        fluent.withName(instance.getName());
        
        fluent.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjection instance) {
        this(instance,true);
    }

    public V1ConfigMapProjectionBuilder(io.kubernetes.client.openapi.models.V1ConfigMapProjection instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withItems(instance.getItems());
        
        this.withName(instance.getName());
        
        this.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapProjection build() {
        V1ConfigMapProjection buildable = new V1ConfigMapProjection();
        buildable.setItems(fluent.getItems());
        buildable.setName(fluent.getName());
        buildable.setOptional(fluent.getOptional());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ConfigMapProjectionBuilder that = (V1ConfigMapProjectionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
