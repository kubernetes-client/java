package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ClientIPConfigFluent<A extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getTimeoutSeconds();
    public A withTimeoutSeconds(java.lang.Integer timeoutSeconds);
    public java.lang.Boolean hasTimeoutSeconds();
}
