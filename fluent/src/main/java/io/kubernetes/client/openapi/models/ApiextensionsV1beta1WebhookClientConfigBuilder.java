package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ApiextensionsV1beta1WebhookClientConfigBuilder extends io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluentImpl<io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig,io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder> {

    io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public ApiextensionsV1beta1WebhookClientConfigBuilder() {
        this(true);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(java.lang.Boolean validationEnabled) {
        this(new ApiextensionsV1beta1WebhookClientConfig(), validationEnabled);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<?> fluent) {
        this(fluent, true);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new ApiextensionsV1beta1WebhookClientConfig(), validationEnabled);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<?> fluent,io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig instance) {
        this(fluent, instance, true);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<?> fluent,io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCaBundle(instance.getCaBundle());
        
        fluent.withService(instance.getService());
        
        fluent.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig instance) {
        this(instance,true);
    }

    public ApiextensionsV1beta1WebhookClientConfigBuilder(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCaBundle(instance.getCaBundle());
        
        this.withService(instance.getService());
        
        this.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig build() {
        ApiextensionsV1beta1WebhookClientConfig buildable = new ApiextensionsV1beta1WebhookClientConfig();
        buildable.setCaBundle(fluent.getCaBundle());
        buildable.setService(fluent.getService());
        buildable.setUrl(fluent.getUrl());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApiextensionsV1beta1WebhookClientConfigBuilder that = (ApiextensionsV1beta1WebhookClientConfigBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
