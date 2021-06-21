package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface V1ResourceQuotaStatusFluent<A extends io.kubernetes.client.openapi.models.V1ResourceQuotaStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToHard(java.lang.String key,io.kubernetes.client.custom.Quantity value);
    public A addToHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public A removeFromHard(java.lang.String key);
    public A removeFromHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getHard();
    public <K,V>A withHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> hard);
    public java.lang.Boolean hasHard();
    public A addToUsed(java.lang.String key,io.kubernetes.client.custom.Quantity value);
    public A addToUsed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public A removeFromUsed(java.lang.String key);
    public A removeFromUsed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map);
    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getUsed();
    public <K,V>A withUsed(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> used);
    public java.lang.Boolean hasUsed();
}
