package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LimitRangeItemBuilder extends io.kubernetes.client.openapi.models.V1LimitRangeItemFluentImpl<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LimitRangeItem,io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> {

    io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LimitRangeItemBuilder() {
        this(true);
    }

    public V1LimitRangeItemBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LimitRangeItem(), validationEnabled);
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LimitRangeItem(), validationEnabled);
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<?> fluent,io.kubernetes.client.openapi.models.V1LimitRangeItem instance) {
        this(fluent, instance, true);
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<?> fluent,io.kubernetes.client.openapi.models.V1LimitRangeItem instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDefault(instance.getDefault());
        
        fluent.withDefaultRequest(instance.getDefaultRequest());
        
        fluent.withMax(instance.getMax());
        
        fluent.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());
        
        fluent.withMin(instance.getMin());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItem instance) {
        this(instance,true);
    }

    public V1LimitRangeItemBuilder(io.kubernetes.client.openapi.models.V1LimitRangeItem instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDefault(instance.getDefault());
        
        this.withDefaultRequest(instance.getDefaultRequest());
        
        this.withMax(instance.getMax());
        
        this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());
        
        this.withMin(instance.getMin());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LimitRangeItem build() {
        V1LimitRangeItem buildable = new V1LimitRangeItem();
        buildable.setDefault(fluent.getDefault());
        buildable.setDefaultRequest(fluent.getDefaultRequest());
        buildable.setMax(fluent.getMax());
        buildable.setMaxLimitRequestRatio(fluent.getMaxLimitRequestRatio());
        buildable.setMin(fluent.getMin());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LimitRangeItemBuilder that = (V1LimitRangeItemBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
