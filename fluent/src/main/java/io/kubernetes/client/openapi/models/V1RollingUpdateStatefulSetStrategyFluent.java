package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1RollingUpdateStatefulSetStrategyFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getPartition();
    public A withPartition(java.lang.Integer partition);
    public java.lang.Boolean hasPartition();
}
