package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TokenRequestStatusBuilder extends io.kubernetes.client.openapi.models.V1TokenRequestStatusFluentImpl<io.kubernetes.client.openapi.models.V1TokenRequestStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TokenRequestStatus,io.kubernetes.client.openapi.models.V1TokenRequestStatusBuilder> {

    io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TokenRequestStatusBuilder() {
        this(true);
    }

    public V1TokenRequestStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TokenRequestStatus(), validationEnabled);
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TokenRequestStatus(), validationEnabled);
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
        this(fluent, instance, true);
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenRequestStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExpirationTimestamp(instance.getExpirationTimestamp());
        
        fluent.withToken(instance.getToken());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
        this(instance,true);
    }

    public V1TokenRequestStatusBuilder(io.kubernetes.client.openapi.models.V1TokenRequestStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExpirationTimestamp(instance.getExpirationTimestamp());
        
        this.withToken(instance.getToken());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestStatus build() {
        V1TokenRequestStatus buildable = new V1TokenRequestStatus();
        buildable.setExpirationTimestamp(fluent.getExpirationTimestamp());
        buildable.setToken(fluent.getToken());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TokenRequestStatusBuilder that = (V1TokenRequestStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
