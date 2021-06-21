package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1HTTPHeaderBuilder extends io.kubernetes.client.openapi.models.V1HTTPHeaderFluentImpl<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HTTPHeader,io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> {

    io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1HTTPHeaderBuilder() {
        this(true);
    }

    public V1HTTPHeaderBuilder(java.lang.Boolean validationEnabled) {
        this(new V1HTTPHeader(), validationEnabled);
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<?> fluent) {
        this(fluent, true);
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1HTTPHeader(), validationEnabled);
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPHeader instance) {
        this(fluent, instance, true);
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<?> fluent,io.kubernetes.client.openapi.models.V1HTTPHeader instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeader instance) {
        this(instance,true);
    }

    public V1HTTPHeaderBuilder(io.kubernetes.client.openapi.models.V1HTTPHeader instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withValue(instance.getValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1HTTPHeader build() {
        V1HTTPHeader buildable = new V1HTTPHeader();
        buildable.setName(fluent.getName());
        buildable.setValue(fluent.getValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1HTTPHeaderBuilder that = (V1HTTPHeaderBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
