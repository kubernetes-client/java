package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1IDRangeFluent<A extends io.kubernetes.client.openapi.models.V1beta1IDRangeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Long getMax();
    public A withMax(java.lang.Long max);
    public java.lang.Boolean hasMax();
    public java.lang.Long getMin();
    public A withMin(java.lang.Long min);
    public java.lang.Boolean hasMin();
}
