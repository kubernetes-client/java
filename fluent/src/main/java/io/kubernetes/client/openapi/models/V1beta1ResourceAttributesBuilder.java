package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ResourceAttributesBuilder extends io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ResourceAttributes,io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ResourceAttributesBuilder() {
        this(true);
    }

    public V1beta1ResourceAttributesBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ResourceAttributes(), validationEnabled);
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ResourceAttributes(), validationEnabled);
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ResourceAttributes instance) {
        this(fluent, instance, true);
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ResourceAttributes instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withGroup(instance.getGroup());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        fluent.withResource(instance.getResource());
        
        fluent.withSubresource(instance.getSubresource());
        
        fluent.withVerb(instance.getVerb());
        
        fluent.withVersion(instance.getVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes instance) {
        this(instance,true);
    }

    public V1beta1ResourceAttributesBuilder(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withGroup(instance.getGroup());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withResource(instance.getResource());
        
        this.withSubresource(instance.getSubresource());
        
        this.withVerb(instance.getVerb());
        
        this.withVersion(instance.getVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes build() {
        V1beta1ResourceAttributes buildable = new V1beta1ResourceAttributes();
        buildable.setGroup(fluent.getGroup());
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        buildable.setResource(fluent.getResource());
        buildable.setSubresource(fluent.getSubresource());
        buildable.setVerb(fluent.getVerb());
        buildable.setVersion(fluent.getVersion());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ResourceAttributesBuilder that = (V1beta1ResourceAttributesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
