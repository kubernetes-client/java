package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1WebhookConversionBuilder extends io.kubernetes.client.openapi.models.V1WebhookConversionFluentImpl<io.kubernetes.client.openapi.models.V1WebhookConversionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1WebhookConversion,io.kubernetes.client.openapi.models.V1WebhookConversionBuilder> {

    io.kubernetes.client.openapi.models.V1WebhookConversionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1WebhookConversionBuilder() {
        this(true);
    }

    public V1WebhookConversionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1WebhookConversion(), validationEnabled);
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1WebhookConversion(), validationEnabled);
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1WebhookConversion instance) {
        this(fluent, instance, true);
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1WebhookConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withClientConfig(instance.getClientConfig());
        
        fluent.withConversionReviewVersions(instance.getConversionReviewVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversion instance) {
        this(instance,true);
    }

    public V1WebhookConversionBuilder(io.kubernetes.client.openapi.models.V1WebhookConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withClientConfig(instance.getClientConfig());
        
        this.withConversionReviewVersions(instance.getConversionReviewVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1WebhookConversion build() {
        V1WebhookConversion buildable = new V1WebhookConversion();
        buildable.setClientConfig(fluent.getClientConfig());
        buildable.setConversionReviewVersions(fluent.getConversionReviewVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1WebhookConversionBuilder that = (V1WebhookConversionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
