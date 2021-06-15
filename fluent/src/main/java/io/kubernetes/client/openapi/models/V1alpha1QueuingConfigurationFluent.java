package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1alpha1QueuingConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1alpha1QueuingConfigurationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getHandSize();
    public A withHandSize(java.lang.Integer handSize);
    public java.lang.Boolean hasHandSize();
    public java.lang.Integer getQueueLengthLimit();
    public A withQueueLengthLimit(java.lang.Integer queueLengthLimit);
    public java.lang.Boolean hasQueueLengthLimit();
    public java.lang.Integer getQueues();
    public A withQueues(java.lang.Integer queues);
    public java.lang.Boolean hasQueues();
}
