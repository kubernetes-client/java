/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** QueueConfig allows tuning of the remote write queue parameters. */
@ApiModel(description = "QueueConfig allows tuning of the remote write queue parameters.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecQueueConfig {
  public static final String SERIALIZED_NAME_BATCH_SEND_DEADLINE = "batchSendDeadline";

  @SerializedName(SERIALIZED_NAME_BATCH_SEND_DEADLINE)
  private String batchSendDeadline;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_MAX_BACKOFF = "maxBackoff";

  @SerializedName(SERIALIZED_NAME_MAX_BACKOFF)
  private String maxBackoff;

  public static final String SERIALIZED_NAME_MAX_RETRIES = "maxRetries";

  @SerializedName(SERIALIZED_NAME_MAX_RETRIES)
  private Integer maxRetries;

  public static final String SERIALIZED_NAME_MAX_SAMPLES_PER_SEND = "maxSamplesPerSend";

  @SerializedName(SERIALIZED_NAME_MAX_SAMPLES_PER_SEND)
  private Integer maxSamplesPerSend;

  public static final String SERIALIZED_NAME_MAX_SHARDS = "maxShards";

  @SerializedName(SERIALIZED_NAME_MAX_SHARDS)
  private Integer maxShards;

  public static final String SERIALIZED_NAME_MIN_BACKOFF = "minBackoff";

  @SerializedName(SERIALIZED_NAME_MIN_BACKOFF)
  private String minBackoff;

  public static final String SERIALIZED_NAME_MIN_SHARDS = "minShards";

  @SerializedName(SERIALIZED_NAME_MIN_SHARDS)
  private Integer minShards;

  public V1PrometheusSpecQueueConfig batchSendDeadline(String batchSendDeadline) {

    this.batchSendDeadline = batchSendDeadline;
    return this;
  }

  /**
   * BatchSendDeadline is the maximum time a sample will wait in buffer.
   *
   * @return batchSendDeadline
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BatchSendDeadline is the maximum time a sample will wait in buffer.")
  public String getBatchSendDeadline() {
    return batchSendDeadline;
  }

  public void setBatchSendDeadline(String batchSendDeadline) {
    this.batchSendDeadline = batchSendDeadline;
  }

  public V1PrometheusSpecQueueConfig capacity(Integer capacity) {

    this.capacity = capacity;
    return this;
  }

  /**
   * Capacity is the number of samples to buffer per shard before we start dropping them.
   *
   * @return capacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Capacity is the number of samples to buffer per shard before we start dropping them.")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public V1PrometheusSpecQueueConfig maxBackoff(String maxBackoff) {

    this.maxBackoff = maxBackoff;
    return this;
  }

  /**
   * MaxBackoff is the maximum retry delay.
   *
   * @return maxBackoff
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaxBackoff is the maximum retry delay.")
  public String getMaxBackoff() {
    return maxBackoff;
  }

  public void setMaxBackoff(String maxBackoff) {
    this.maxBackoff = maxBackoff;
  }

  public V1PrometheusSpecQueueConfig maxRetries(Integer maxRetries) {

    this.maxRetries = maxRetries;
    return this;
  }

  /**
   * MaxRetries is the maximum number of times to retry a batch on recoverable errors.
   *
   * @return maxRetries
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "MaxRetries is the maximum number of times to retry a batch on recoverable errors.")
  public Integer getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
  }

  public V1PrometheusSpecQueueConfig maxSamplesPerSend(Integer maxSamplesPerSend) {

    this.maxSamplesPerSend = maxSamplesPerSend;
    return this;
  }

  /**
   * MaxSamplesPerSend is the maximum number of samples per send.
   *
   * @return maxSamplesPerSend
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaxSamplesPerSend is the maximum number of samples per send.")
  public Integer getMaxSamplesPerSend() {
    return maxSamplesPerSend;
  }

  public void setMaxSamplesPerSend(Integer maxSamplesPerSend) {
    this.maxSamplesPerSend = maxSamplesPerSend;
  }

  public V1PrometheusSpecQueueConfig maxShards(Integer maxShards) {

    this.maxShards = maxShards;
    return this;
  }

  /**
   * MaxShards is the maximum number of shards, i.e. amount of concurrency.
   *
   * @return maxShards
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "MaxShards is the maximum number of shards, i.e. amount of concurrency.")
  public Integer getMaxShards() {
    return maxShards;
  }

  public void setMaxShards(Integer maxShards) {
    this.maxShards = maxShards;
  }

  public V1PrometheusSpecQueueConfig minBackoff(String minBackoff) {

    this.minBackoff = minBackoff;
    return this;
  }

  /**
   * MinBackoff is the initial retry delay. Gets doubled for every retry.
   *
   * @return minBackoff
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MinBackoff is the initial retry delay. Gets doubled for every retry.")
  public String getMinBackoff() {
    return minBackoff;
  }

  public void setMinBackoff(String minBackoff) {
    this.minBackoff = minBackoff;
  }

  public V1PrometheusSpecQueueConfig minShards(Integer minShards) {

    this.minShards = minShards;
    return this;
  }

  /**
   * MinShards is the minimum number of shards, i.e. amount of concurrency.
   *
   * @return minShards
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "MinShards is the minimum number of shards, i.e. amount of concurrency.")
  public Integer getMinShards() {
    return minShards;
  }

  public void setMinShards(Integer minShards) {
    this.minShards = minShards;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecQueueConfig v1PrometheusSpecQueueConfig = (V1PrometheusSpecQueueConfig) o;
    return Objects.equals(this.batchSendDeadline, v1PrometheusSpecQueueConfig.batchSendDeadline)
        && Objects.equals(this.capacity, v1PrometheusSpecQueueConfig.capacity)
        && Objects.equals(this.maxBackoff, v1PrometheusSpecQueueConfig.maxBackoff)
        && Objects.equals(this.maxRetries, v1PrometheusSpecQueueConfig.maxRetries)
        && Objects.equals(this.maxSamplesPerSend, v1PrometheusSpecQueueConfig.maxSamplesPerSend)
        && Objects.equals(this.maxShards, v1PrometheusSpecQueueConfig.maxShards)
        && Objects.equals(this.minBackoff, v1PrometheusSpecQueueConfig.minBackoff)
        && Objects.equals(this.minShards, v1PrometheusSpecQueueConfig.minShards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        batchSendDeadline,
        capacity,
        maxBackoff,
        maxRetries,
        maxSamplesPerSend,
        maxShards,
        minBackoff,
        minShards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecQueueConfig {\n");
    sb.append("    batchSendDeadline: ").append(toIndentedString(batchSendDeadline)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    maxBackoff: ").append(toIndentedString(maxBackoff)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxSamplesPerSend: ").append(toIndentedString(maxSamplesPerSend)).append("\n");
    sb.append("    maxShards: ").append(toIndentedString(maxShards)).append("\n");
    sb.append("    minBackoff: ").append(toIndentedString(minBackoff)).append("\n");
    sb.append("    minShards: ").append(toIndentedString(minShards)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
