package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LeaseSpecFluent<A extends V1LeaseSpecFluent<A>> extends Fluent<A>{
  public OffsetDateTime getAcquireTime();
  public A withAcquireTime(OffsetDateTime acquireTime);
  public Boolean hasAcquireTime();
  public String getHolderIdentity();
  public A withHolderIdentity(String holderIdentity);
  public Boolean hasHolderIdentity();
  public Integer getLeaseDurationSeconds();
  public A withLeaseDurationSeconds(Integer leaseDurationSeconds);
  public Boolean hasLeaseDurationSeconds();
  public Integer getLeaseTransitions();
  public A withLeaseTransitions(Integer leaseTransitions);
  public Boolean hasLeaseTransitions();
  public OffsetDateTime getRenewTime();
  public A withRenewTime(OffsetDateTime renewTime);
  public Boolean hasRenewTime();
  
}