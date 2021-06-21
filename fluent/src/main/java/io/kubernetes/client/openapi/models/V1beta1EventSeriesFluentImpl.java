package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1EventSeriesFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1EventSeriesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1EventSeriesFluent<A> {

    private java.lang.Integer count;
    private java.time.OffsetDateTime lastObservedTime;

    public V1beta1EventSeriesFluentImpl() {
    }

    public V1beta1EventSeriesFluentImpl(io.kubernetes.client.openapi.models.V1beta1EventSeries instance) {
        this.withCount(instance.getCount());
        
        this.withLastObservedTime(instance.getLastObservedTime());
    }

    public java.lang.Integer getCount() {
        return this.count;
    }

    public A withCount(java.lang.Integer count) {
        this.count=count; return (A) this;
    }

    public java.lang.Boolean hasCount() {
        return this.count != null;
    }

    public java.time.OffsetDateTime getLastObservedTime() {
        return this.lastObservedTime;
    }

    public A withLastObservedTime(java.time.OffsetDateTime lastObservedTime) {
        this.lastObservedTime=lastObservedTime; return (A) this;
    }

    public java.lang.Boolean hasLastObservedTime() {
        return this.lastObservedTime != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1EventSeriesFluentImpl that = (V1beta1EventSeriesFluentImpl) o;
        if (count != null ? !count.equals(that.count) :that.count != null) return false;
        if (lastObservedTime != null ? !lastObservedTime.equals(that.lastObservedTime) :that.lastObservedTime != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(count,  lastObservedTime,  super.hashCode());
    }

}
