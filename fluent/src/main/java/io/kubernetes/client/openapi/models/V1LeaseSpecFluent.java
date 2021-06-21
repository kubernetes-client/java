package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1LeaseSpecFluent<A extends io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.time.OffsetDateTime getAcquireTime();
    public A withAcquireTime(java.time.OffsetDateTime acquireTime);
    public java.lang.Boolean hasAcquireTime();
    public java.lang.String getHolderIdentity();
    public A withHolderIdentity(java.lang.String holderIdentity);
    public java.lang.Boolean hasHolderIdentity();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHolderIdentity instead.
     */
        public A withNewHolderIdentity(java.lang.String original);
    public java.lang.Integer getLeaseDurationSeconds();
    public A withLeaseDurationSeconds(java.lang.Integer leaseDurationSeconds);
    public java.lang.Boolean hasLeaseDurationSeconds();
    public java.lang.Integer getLeaseTransitions();
    public A withLeaseTransitions(java.lang.Integer leaseTransitions);
    public java.lang.Boolean hasLeaseTransitions();
    public java.time.OffsetDateTime getRenewTime();
    public A withRenewTime(java.time.OffsetDateTime renewTime);
    public java.lang.Boolean hasRenewTime();
}
