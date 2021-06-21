package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class AdmissionregistrationV1WebhookClientConfigBuilder extends io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluentImpl<io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig,io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigBuilder> {

    io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public AdmissionregistrationV1WebhookClientConfigBuilder() {
        this(true);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(java.lang.Boolean validationEnabled) {
        this(new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<?> fluent) {
        this(fluent, true);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new AdmissionregistrationV1WebhookClientConfig(), validationEnabled);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig instance) {
        this(fluent, instance, true);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<?> fluent,io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCaBundle(instance.getCaBundle());
        
        fluent.withService(instance.getService());
        
        fluent.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig instance) {
        this(instance,true);
    }

    public AdmissionregistrationV1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCaBundle(instance.getCaBundle());
        
        this.withService(instance.getService());
        
        this.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig build() {
        AdmissionregistrationV1WebhookClientConfig buildable = new AdmissionregistrationV1WebhookClientConfig();
        buildable.setCaBundle(fluent.getCaBundle());
        buildable.setService(fluent.getService());
        buildable.setUrl(fluent.getUrl());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdmissionregistrationV1WebhookClientConfigBuilder that = (AdmissionregistrationV1WebhookClientConfigBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
