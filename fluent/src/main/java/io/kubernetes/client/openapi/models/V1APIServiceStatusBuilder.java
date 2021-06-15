package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIServiceStatusBuilder extends io.kubernetes.client.openapi.models.V1APIServiceStatusFluentImpl<io.kubernetes.client.openapi.models.V1APIServiceStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIServiceStatus,io.kubernetes.client.openapi.models.V1APIServiceStatusBuilder> {

    io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIServiceStatusBuilder() {
        this(true);
    }

    public V1APIServiceStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIServiceStatus(), validationEnabled);
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIServiceStatus(), validationEnabled);
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIServiceStatus instance) {
        this(fluent, instance, true);
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIServiceStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatus instance) {
        this(instance,true);
    }

    public V1APIServiceStatusBuilder(io.kubernetes.client.openapi.models.V1APIServiceStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConditions(instance.getConditions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatus build() {
        V1APIServiceStatus buildable = new V1APIServiceStatus();
        buildable.setConditions(fluent.getConditions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIServiceStatusBuilder that = (V1APIServiceStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
