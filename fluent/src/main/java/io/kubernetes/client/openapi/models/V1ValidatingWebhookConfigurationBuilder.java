package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ValidatingWebhookConfigurationBuilder extends io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration,io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationBuilder> {

    io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ValidatingWebhookConfigurationBuilder() {
        this(true);
    }

    public V1ValidatingWebhookConfigurationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ValidatingWebhookConfiguration(), validationEnabled);
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ValidatingWebhookConfiguration(), validationEnabled);
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration instance) {
        this(fluent, instance, true);
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withWebhooks(instance.getWebhooks());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration instance) {
        this(instance,true);
    }

    public V1ValidatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withWebhooks(instance.getWebhooks());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration build() {
        V1ValidatingWebhookConfiguration buildable = new V1ValidatingWebhookConfiguration();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setWebhooks(fluent.getWebhooks());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ValidatingWebhookConfigurationBuilder that = (V1ValidatingWebhookConfigurationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
