package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface EventsV1EventSeriesFluent<A extends io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getCount();
    public A withCount(java.lang.Integer count);
    public java.lang.Boolean hasCount();
    public java.time.OffsetDateTime getLastObservedTime();
    public A withLastObservedTime(java.time.OffsetDateTime lastObservedTime);
    public java.lang.Boolean hasLastObservedTime();
}
