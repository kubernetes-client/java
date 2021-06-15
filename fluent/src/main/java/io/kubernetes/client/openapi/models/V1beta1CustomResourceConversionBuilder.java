package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceConversionBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion,io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceConversionBuilder() {
        this(true);
    }

    public V1beta1CustomResourceConversionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceConversion(), validationEnabled);
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceConversion(), validationEnabled);
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withConversionReviewVersions(instance.getConversionReviewVersions());
        
        fluent.withStrategy(instance.getStrategy());
        
        fluent.withWebhookClientConfig(instance.getWebhookClientConfig());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withConversionReviewVersions(instance.getConversionReviewVersions());
        
        this.withStrategy(instance.getStrategy());
        
        this.withWebhookClientConfig(instance.getWebhookClientConfig());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion build() {
        V1beta1CustomResourceConversion buildable = new V1beta1CustomResourceConversion();
        buildable.setConversionReviewVersions(fluent.getConversionReviewVersions());
        buildable.setStrategy(fluent.getStrategy());
        buildable.setWebhookClientConfig(fluent.getWebhookClientConfig());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceConversionBuilder that = (V1beta1CustomResourceConversionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
