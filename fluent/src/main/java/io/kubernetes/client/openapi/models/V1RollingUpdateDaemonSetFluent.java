package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1RollingUpdateDaemonSetFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public io.kubernetes.client.custom.IntOrString getMaxUnavailable();
    public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable);
    public java.lang.Boolean hasMaxUnavailable();
    public A withNewMaxUnavailable(int value);
    public A withNewMaxUnavailable(java.lang.String value);
}
