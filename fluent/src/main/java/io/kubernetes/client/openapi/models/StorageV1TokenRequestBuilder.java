package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class StorageV1TokenRequestBuilder extends io.kubernetes.client.openapi.models.StorageV1TokenRequestFluentImpl<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.StorageV1TokenRequest,io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder> {

    io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public StorageV1TokenRequestBuilder() {
        this(true);
    }

    public StorageV1TokenRequestBuilder(java.lang.Boolean validationEnabled) {
        this(new StorageV1TokenRequest(), validationEnabled);
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<?> fluent) {
        this(fluent, true);
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new StorageV1TokenRequest(), validationEnabled);
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.StorageV1TokenRequest instance) {
        this(fluent, instance, true);
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<?> fluent,io.kubernetes.client.openapi.models.StorageV1TokenRequest instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAudience(instance.getAudience());
        
        fluent.withExpirationSeconds(instance.getExpirationSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequest instance) {
        this(instance,true);
    }

    public StorageV1TokenRequestBuilder(io.kubernetes.client.openapi.models.StorageV1TokenRequest instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAudience(instance.getAudience());
        
        this.withExpirationSeconds(instance.getExpirationSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.StorageV1TokenRequest build() {
        StorageV1TokenRequest buildable = new StorageV1TokenRequest();
        buildable.setAudience(fluent.getAudience());
        buildable.setExpirationSeconds(fluent.getExpirationSeconds());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StorageV1TokenRequestBuilder that = (StorageV1TokenRequestBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
