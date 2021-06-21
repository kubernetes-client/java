package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1DaemonEndpointFluent<A extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getPort();
    public A withPort(java.lang.Integer port);
    public java.lang.Boolean hasPort();
}
