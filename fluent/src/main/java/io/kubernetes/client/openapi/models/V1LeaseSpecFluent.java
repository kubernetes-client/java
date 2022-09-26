/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.time.OffsetDateTime;

/** Generated */
public interface V1LeaseSpecFluent<A extends V1LeaseSpecFluent<A>> extends Fluent<A> {
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
