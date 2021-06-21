package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LifecycleBuilder extends io.kubernetes.client.openapi.models.V1LifecycleFluentImpl<io.kubernetes.client.openapi.models.V1LifecycleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Lifecycle,io.kubernetes.client.openapi.models.V1LifecycleBuilder> {

    io.kubernetes.client.openapi.models.V1LifecycleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LifecycleBuilder() {
        this(true);
    }

    public V1LifecycleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Lifecycle(), validationEnabled);
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1LifecycleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1LifecycleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Lifecycle(), validationEnabled);
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1LifecycleFluent<?> fluent,io.kubernetes.client.openapi.models.V1Lifecycle instance) {
        this(fluent, instance, true);
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1LifecycleFluent<?> fluent,io.kubernetes.client.openapi.models.V1Lifecycle instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPostStart(instance.getPostStart());
        
        fluent.withPreStop(instance.getPreStop());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1Lifecycle instance) {
        this(instance,true);
    }

    public V1LifecycleBuilder(io.kubernetes.client.openapi.models.V1Lifecycle instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPostStart(instance.getPostStart());
        
        this.withPreStop(instance.getPreStop());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Lifecycle build() {
        V1Lifecycle buildable = new V1Lifecycle();
        buildable.setPostStart(fluent.getPostStart());
        buildable.setPreStop(fluent.getPreStop());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LifecycleBuilder that = (V1LifecycleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
