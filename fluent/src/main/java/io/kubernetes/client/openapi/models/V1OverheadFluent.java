package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface V1OverheadFluent<A extends io.kubernetes.client.openapi.models.V1OverheadFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToPodFixed(java.lang.String key,io.kubernetes.client.custom.Quantity value);
    public A addToPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public A removeFromPodFixed(java.lang.String key);
    public A removeFromPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getPodFixed();
    public <K,V>A withPodFixed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> podFixed);
    public java.lang.Boolean hasPodFixed();
}
