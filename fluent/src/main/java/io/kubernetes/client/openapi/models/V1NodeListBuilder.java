package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeListBuilder extends io.kubernetes.client.openapi.models.V1NodeListFluentImpl<io.kubernetes.client.openapi.models.V1NodeListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NodeList,io.kubernetes.client.openapi.models.V1NodeListBuilder> {

    io.kubernetes.client.openapi.models.V1NodeListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeListBuilder() {
        this(true);
    }

    public V1NodeListBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NodeList(), validationEnabled);
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeListFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NodeList(), validationEnabled);
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeListFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeList instance) {
        this(fluent, instance, true);
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeListFluent<?> fluent,io.kubernetes.client.openapi.models.V1NodeList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeList instance) {
        this(instance,true);
    }

    public V1NodeListBuilder(io.kubernetes.client.openapi.models.V1NodeList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NodeList build() {
        V1NodeList buildable = new V1NodeList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeListBuilder that = (V1NodeListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
