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

/** Generated */
public interface V1LeaseSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.time.OffsetDateTime getAcquireTime();

  public A withAcquireTime(java.time.OffsetDateTime acquireTime);

  public java.lang.Boolean hasAcquireTime();

  public java.lang.String getHolderIdentity();

  public A withHolderIdentity(java.lang.String holderIdentity);

  public java.lang.Boolean hasHolderIdentity();

  /** Method is deprecated. use withHolderIdentity instead. */
  @java.lang.Deprecated
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
