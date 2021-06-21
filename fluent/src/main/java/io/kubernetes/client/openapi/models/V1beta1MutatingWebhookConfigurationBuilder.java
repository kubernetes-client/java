package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1MutatingWebhookConfigurationBuilder extends io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration,io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationBuilder> {

    io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1MutatingWebhookConfigurationBuilder() {
        this(true);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1MutatingWebhookConfiguration(), validationEnabled);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1MutatingWebhookConfiguration(), validationEnabled);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration instance) {
        this(fluent, instance, true);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withWebhooks(instance.getWebhooks());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration instance) {
        this(instance,true);
    }

    public V1beta1MutatingWebhookConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withWebhooks(instance.getWebhooks());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration build() {
        V1beta1MutatingWebhookConfiguration buildable = new V1beta1MutatingWebhookConfiguration();
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
        V1beta1MutatingWebhookConfigurationBuilder that = (V1beta1MutatingWebhookConfigurationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
