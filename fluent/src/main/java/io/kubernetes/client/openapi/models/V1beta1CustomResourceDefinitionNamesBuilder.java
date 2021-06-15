package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceDefinitionNamesBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceDefinitionNamesBuilder() {
        this(true);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceDefinitionNames(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceDefinitionNames(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCategories(instance.getCategories());
        
        fluent.withKind(instance.getKind());
        
        fluent.withListKind(instance.getListKind());
        
        fluent.withPlural(instance.getPlural());
        
        fluent.withShortNames(instance.getShortNames());
        
        fluent.withSingular(instance.getSingular());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceDefinitionNamesBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCategories(instance.getCategories());
        
        this.withKind(instance.getKind());
        
        this.withListKind(instance.getListKind());
        
        this.withPlural(instance.getPlural());
        
        this.withShortNames(instance.getShortNames());
        
        this.withSingular(instance.getSingular());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames build() {
        V1beta1CustomResourceDefinitionNames buildable = new V1beta1CustomResourceDefinitionNames();
        buildable.setCategories(fluent.getCategories());
        buildable.setKind(fluent.getKind());
        buildable.setListKind(fluent.getListKind());
        buildable.setPlural(fluent.getPlural());
        buildable.setShortNames(fluent.getShortNames());
        buildable.setSingular(fluent.getSingular());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceDefinitionNamesBuilder that = (V1beta1CustomResourceDefinitionNamesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
