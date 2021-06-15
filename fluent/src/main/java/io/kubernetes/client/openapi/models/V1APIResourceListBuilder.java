package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIResourceListBuilder extends io.kubernetes.client.openapi.models.V1APIResourceListFluentImpl<io.kubernetes.client.openapi.models.V1APIResourceListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIResourceList,io.kubernetes.client.openapi.models.V1APIResourceListBuilder> {

    io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIResourceListBuilder() {
        this(true);
    }

    public V1APIResourceListBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIResourceList(), validationEnabled);
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIResourceList(), validationEnabled);
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIResourceList instance) {
        this(fluent, instance, true);
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceListFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIResourceList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withGroupVersion(instance.getGroupVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withResources(instance.getResources());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceList instance) {
        this(instance,true);
    }

    public V1APIResourceListBuilder(io.kubernetes.client.openapi.models.V1APIResourceList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withGroupVersion(instance.getGroupVersion());
        
        this.withKind(instance.getKind());
        
        this.withResources(instance.getResources());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIResourceList build() {
        V1APIResourceList buildable = new V1APIResourceList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setGroupVersion(fluent.getGroupVersion());
        buildable.setKind(fluent.getKind());
        buildable.setResources(fluent.getResources());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIResourceListBuilder that = (V1APIResourceListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
