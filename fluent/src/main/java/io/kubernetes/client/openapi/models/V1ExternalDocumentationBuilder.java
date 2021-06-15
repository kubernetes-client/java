package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ExternalDocumentationBuilder extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluentImpl<io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ExternalDocumentation,io.kubernetes.client.openapi.models.V1ExternalDocumentationBuilder> {

    io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ExternalDocumentationBuilder() {
        this(true);
    }

    public V1ExternalDocumentationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ExternalDocumentation(), validationEnabled);
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ExternalDocumentation(), validationEnabled);
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
        this(fluent, instance, true);
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<?> fluent,io.kubernetes.client.openapi.models.V1ExternalDocumentation instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDescription(instance.getDescription());
        
        fluent.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentation instance) {
        this(instance,true);
    }

    public V1ExternalDocumentationBuilder(io.kubernetes.client.openapi.models.V1ExternalDocumentation instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDescription(instance.getDescription());
        
        this.withUrl(instance.getUrl());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ExternalDocumentation build() {
        V1ExternalDocumentation buildable = new V1ExternalDocumentation();
        buildable.setDescription(fluent.getDescription());
        buildable.setUrl(fluent.getUrl());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ExternalDocumentationBuilder that = (V1ExternalDocumentationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
