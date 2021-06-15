package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceDefinitionSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceDefinitionSpecBuilder() {
        this(true);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceDefinitionSpec(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceDefinitionSpec(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        fluent.withConversion(instance.getConversion());
        
        fluent.withGroup(instance.getGroup());
        
        fluent.withNames(instance.getNames());
        
        fluent.withPreserveUnknownFields(instance.getPreserveUnknownFields());
        
        fluent.withScope(instance.getScope());
        
        fluent.withSubresources(instance.getSubresources());
        
        fluent.withValidation(instance.getValidation());
        
        fluent.withVersion(instance.getVersion());
        
        fluent.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceDefinitionSpecBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        this.withConversion(instance.getConversion());
        
        this.withGroup(instance.getGroup());
        
        this.withNames(instance.getNames());
        
        this.withPreserveUnknownFields(instance.getPreserveUnknownFields());
        
        this.withScope(instance.getScope());
        
        this.withSubresources(instance.getSubresources());
        
        this.withValidation(instance.getValidation());
        
        this.withVersion(instance.getVersion());
        
        this.withVersions(instance.getVersions());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionSpec build() {
        V1beta1CustomResourceDefinitionSpec buildable = new V1beta1CustomResourceDefinitionSpec();
        buildable.setAdditionalPrinterColumns(fluent.getAdditionalPrinterColumns());
        buildable.setConversion(fluent.getConversion());
        buildable.setGroup(fluent.getGroup());
        buildable.setNames(fluent.getNames());
        buildable.setPreserveUnknownFields(fluent.getPreserveUnknownFields());
        buildable.setScope(fluent.getScope());
        buildable.setSubresources(fluent.getSubresources());
        buildable.setValidation(fluent.getValidation());
        buildable.setVersion(fluent.getVersion());
        buildable.setVersions(fluent.getVersions());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceDefinitionSpecBuilder that = (V1beta1CustomResourceDefinitionSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
