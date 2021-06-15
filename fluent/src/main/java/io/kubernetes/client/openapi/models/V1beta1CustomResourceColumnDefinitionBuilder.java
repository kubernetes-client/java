package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceColumnDefinitionBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceColumnDefinitionBuilder() {
        this(true);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceColumnDefinition(), validationEnabled);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceColumnDefinition(), validationEnabled);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinitionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withJsONPath(instance.getJsONPath());
        
        fluent.withDescription(instance.getDescription());
        
        fluent.withFormat(instance.getFormat());
        
        fluent.withName(instance.getName());
        
        fluent.withPriority(instance.getPriority());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceColumnDefinitionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withJsONPath(instance.getJsONPath());
        
        this.withDescription(instance.getDescription());
        
        this.withFormat(instance.getFormat());
        
        this.withName(instance.getName());
        
        this.withPriority(instance.getPriority());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceColumnDefinition build() {
        V1beta1CustomResourceColumnDefinition buildable = new V1beta1CustomResourceColumnDefinition();
        buildable.setJsONPath(fluent.getJsONPath());
        buildable.setDescription(fluent.getDescription());
        buildable.setFormat(fluent.getFormat());
        buildable.setName(fluent.getName());
        buildable.setPriority(fluent.getPriority());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceColumnDefinitionBuilder that = (V1beta1CustomResourceColumnDefinitionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
