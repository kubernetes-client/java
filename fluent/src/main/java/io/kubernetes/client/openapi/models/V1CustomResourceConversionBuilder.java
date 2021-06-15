package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1CustomResourceConversionBuilder extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CustomResourceConversion,io.kubernetes.client.openapi.models.V1CustomResourceConversionBuilder> {

    io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1CustomResourceConversionBuilder() {
        this(true);
    }

    public V1CustomResourceConversionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1CustomResourceConversion(), validationEnabled);
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1CustomResourceConversion(), validationEnabled);
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceConversion instance) {
        this(fluent, instance, true);
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withStrategy(instance.getStrategy());
        
        fluent.withWebhook(instance.getWebhook());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversion instance) {
        this(instance,true);
    }

    public V1CustomResourceConversionBuilder(io.kubernetes.client.openapi.models.V1CustomResourceConversion instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withStrategy(instance.getStrategy());
        
        this.withWebhook(instance.getWebhook());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversion build() {
        V1CustomResourceConversion buildable = new V1CustomResourceConversion();
        buildable.setStrategy(fluent.getStrategy());
        buildable.setWebhook(fluent.getWebhook());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1CustomResourceConversionBuilder that = (V1CustomResourceConversionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
