package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1NonResourceAttributesBuilder extends io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes,io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder> {

    io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1NonResourceAttributesBuilder() {
        this(true);
    }

    public V1beta1NonResourceAttributesBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1NonResourceAttributes(), validationEnabled);
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1NonResourceAttributes(), validationEnabled);
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes instance) {
        this(fluent, instance, true);
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPath(instance.getPath());
        
        fluent.withVerb(instance.getVerb());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes instance) {
        this(instance,true);
    }

    public V1beta1NonResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPath(instance.getPath());
        
        this.withVerb(instance.getVerb());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes build() {
        V1beta1NonResourceAttributes buildable = new V1beta1NonResourceAttributes();
        buildable.setPath(fluent.getPath());
        buildable.setVerb(fluent.getVerb());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1NonResourceAttributesBuilder that = (V1beta1NonResourceAttributesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
