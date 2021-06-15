package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ContainerStateRunningFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.time.OffsetDateTime getStartedAt();
    public A withStartedAt(java.time.OffsetDateTime startedAt);
    public java.lang.Boolean hasStartedAt();
}
