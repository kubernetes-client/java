/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * LeaseSpec is a specification of a Lease.
 */
@ApiModel(description = "LeaseSpec is a specification of a Lease.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T23:08:31.638427Z[Etc/UTC]")
public class V1LeaseSpec {
  public static final String SERIALIZED_NAME_ACQUIRE_TIME = "acquireTime";
  @SerializedName(SERIALIZED_NAME_ACQUIRE_TIME)
  private OffsetDateTime acquireTime;

  public static final String SERIALIZED_NAME_HOLDER_IDENTITY = "holderIdentity";
  @SerializedName(SERIALIZED_NAME_HOLDER_IDENTITY)
  private String holderIdentity;

  public static final String SERIALIZED_NAME_LEASE_DURATION_SECONDS = "leaseDurationSeconds";
  @SerializedName(SERIALIZED_NAME_LEASE_DURATION_SECONDS)
  private Integer leaseDurationSeconds;

  public static final String SERIALIZED_NAME_LEASE_TRANSITIONS = "leaseTransitions";
  @SerializedName(SERIALIZED_NAME_LEASE_TRANSITIONS)
  private Integer leaseTransitions;

  public static final String SERIALIZED_NAME_PREFERRED_HOLDER = "preferredHolder";
  @SerializedName(SERIALIZED_NAME_PREFERRED_HOLDER)
  private String preferredHolder;

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  private OffsetDateTime renewTime;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;


  public V1LeaseSpec acquireTime(OffsetDateTime acquireTime) {

    this.acquireTime = acquireTime;
    return this;
  }

   /**
   * acquireTime is a time when the current lease was acquired.
   * @return acquireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "acquireTime is a time when the current lease was acquired.")

  public OffsetDateTime getAcquireTime() {
    return acquireTime;
  }


  public void setAcquireTime(OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
  }


  public V1LeaseSpec holderIdentity(String holderIdentity) {

    this.holderIdentity = holderIdentity;
    return this;
  }

   /**
   * holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field.
   * @return holderIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field.")

  public String getHolderIdentity() {
    return holderIdentity;
  }


  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }


  public V1LeaseSpec leaseDurationSeconds(Integer leaseDurationSeconds) {

    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

   /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime.
   * @return leaseDurationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime.")

  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }


  public void setLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }


  public V1LeaseSpec leaseTransitions(Integer leaseTransitions) {

    this.leaseTransitions = leaseTransitions;
    return this;
  }

   /**
   * leaseTransitions is the number of transitions of a lease between holders.
   * @return leaseTransitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "leaseTransitions is the number of transitions of a lease between holders.")

  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }


  public void setLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }


  public V1LeaseSpec preferredHolder(String preferredHolder) {

    this.preferredHolder = preferredHolder;
    return this;
  }

   /**
   * PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set.
   * @return preferredHolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set.")

  public String getPreferredHolder() {
    return preferredHolder;
  }


  public void setPreferredHolder(String preferredHolder) {
    this.preferredHolder = preferredHolder;
  }


  public V1LeaseSpec renewTime(OffsetDateTime renewTime) {

    this.renewTime = renewTime;
    return this;
  }

   /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   * @return renewTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "renewTime is a time when the current holder of a lease has last updated the lease.")

  public OffsetDateTime getRenewTime() {
    return renewTime;
  }


  public void setRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
  }


  public V1LeaseSpec strategy(String strategy) {

    this.strategy = strategy;
    return this;
  }

   /**
   * Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.")

  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LeaseSpec v1LeaseSpec = (V1LeaseSpec) o;
    return Objects.equals(this.acquireTime, v1LeaseSpec.acquireTime) &&
        Objects.equals(this.holderIdentity, v1LeaseSpec.holderIdentity) &&
        Objects.equals(this.leaseDurationSeconds, v1LeaseSpec.leaseDurationSeconds) &&
        Objects.equals(this.leaseTransitions, v1LeaseSpec.leaseTransitions) &&
        Objects.equals(this.preferredHolder, v1LeaseSpec.preferredHolder) &&
        Objects.equals(this.renewTime, v1LeaseSpec.renewTime) &&
        Objects.equals(this.strategy, v1LeaseSpec.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, preferredHolder, renewTime, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LeaseSpec {\n");
    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ").append(toIndentedString(leaseDurationSeconds)).append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    preferredHolder: ").append(toIndentedString(preferredHolder)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
