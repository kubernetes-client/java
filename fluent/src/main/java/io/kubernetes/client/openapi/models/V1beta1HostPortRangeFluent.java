package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1HostPortRangeFluent<A extends io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMax();
    public A withMax(java.lang.Integer max);
    public java.lang.Boolean hasMax();
    public java.lang.Integer getMin();
    public A withMin(java.lang.Integer min);
    public java.lang.Boolean hasMin();
}
