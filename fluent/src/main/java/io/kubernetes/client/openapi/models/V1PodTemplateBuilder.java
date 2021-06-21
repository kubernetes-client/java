package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PodTemplateBuilder extends io.kubernetes.client.openapi.models.V1PodTemplateFluentImpl<io.kubernetes.client.openapi.models.V1PodTemplateBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodTemplate,io.kubernetes.client.openapi.models.V1PodTemplateBuilder> {

    io.kubernetes.client.openapi.models.V1PodTemplateFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PodTemplateBuilder() {
        this(true);
    }

    public V1PodTemplateBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PodTemplate(), validationEnabled);
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplateFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplateFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PodTemplate(), validationEnabled);
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodTemplate instance) {
        this(fluent, instance, true);
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplateFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodTemplate instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withTemplate(instance.getTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplate instance) {
        this(instance,true);
    }

    public V1PodTemplateBuilder(io.kubernetes.client.openapi.models.V1PodTemplate instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withTemplate(instance.getTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PodTemplate build() {
        V1PodTemplate buildable = new V1PodTemplate();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setTemplate(fluent.getTemplate());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PodTemplateBuilder that = (V1PodTemplateBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
