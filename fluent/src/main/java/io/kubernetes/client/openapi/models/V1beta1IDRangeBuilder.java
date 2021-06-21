package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1IDRangeBuilder extends io.kubernetes.client.openapi.models.V1beta1IDRangeFluentImpl<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1IDRange,io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> {

    io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1IDRangeBuilder() {
        this(true);
    }

    public V1beta1IDRangeBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1IDRange(), validationEnabled);
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1IDRange(), validationEnabled);
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1IDRange instance) {
        this(fluent, instance, true);
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1IDRange instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMax(instance.getMax());
        
        fluent.withMin(instance.getMin());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRange instance) {
        this(instance,true);
    }

    public V1beta1IDRangeBuilder(io.kubernetes.client.openapi.models.V1beta1IDRange instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMax(instance.getMax());
        
        this.withMin(instance.getMin());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1IDRange build() {
        V1beta1IDRange buildable = new V1beta1IDRange();
        buildable.setMax(fluent.getMax());
        buildable.setMin(fluent.getMin());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1IDRangeBuilder that = (V1beta1IDRangeBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
