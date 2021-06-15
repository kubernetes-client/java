package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1EndpointConditionsFluent<A extends io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getReady();
    public A withReady(java.lang.Boolean ready);
    public java.lang.Boolean hasReady();
    public java.lang.Boolean getServing();
    public A withServing(java.lang.Boolean serving);
    public java.lang.Boolean hasServing();
    public java.lang.Boolean getTerminating();
    public A withTerminating(java.lang.Boolean terminating);
    public java.lang.Boolean hasTerminating();
}
