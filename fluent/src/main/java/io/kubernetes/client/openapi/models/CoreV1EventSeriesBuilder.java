package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class CoreV1EventSeriesBuilder extends io.kubernetes.client.openapi.models.CoreV1EventSeriesFluentImpl<io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.CoreV1EventSeries,io.kubernetes.client.openapi.models.CoreV1EventSeriesBuilder> {

    io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public CoreV1EventSeriesBuilder() {
        this(true);
    }

    public CoreV1EventSeriesBuilder(java.lang.Boolean validationEnabled) {
        this(new CoreV1EventSeries(), validationEnabled);
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<?> fluent) {
        this(fluent, true);
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new CoreV1EventSeries(), validationEnabled);
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<?> fluent,io.kubernetes.client.openapi.models.CoreV1EventSeries instance) {
        this(fluent, instance, true);
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<?> fluent,io.kubernetes.client.openapi.models.CoreV1EventSeries instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCount(instance.getCount());
        
        fluent.withLastObservedTime(instance.getLastObservedTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeries instance) {
        this(instance,true);
    }

    public CoreV1EventSeriesBuilder(io.kubernetes.client.openapi.models.CoreV1EventSeries instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCount(instance.getCount());
        
        this.withLastObservedTime(instance.getLastObservedTime());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.CoreV1EventSeries build() {
        CoreV1EventSeries buildable = new CoreV1EventSeries();
        buildable.setCount(fluent.getCount());
        buildable.setLastObservedTime(fluent.getLastObservedTime());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CoreV1EventSeriesBuilder that = (CoreV1EventSeriesBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
