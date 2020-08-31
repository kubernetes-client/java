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

/** QuerySpec defines the query command line flags when starting Prometheus. */
@ApiModel(description = "QuerySpec defines the query command line flags when starting Prometheus.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecQuery {
  public static final String SERIALIZED_NAME_LOOKBACK_DELTA = "lookbackDelta";

  @SerializedName(SERIALIZED_NAME_LOOKBACK_DELTA)
  private String lookbackDelta;

  public static final String SERIALIZED_NAME_MAX_CONCURRENCY = "maxConcurrency";

  @SerializedName(SERIALIZED_NAME_MAX_CONCURRENCY)
  private Integer maxConcurrency;

  public static final String SERIALIZED_NAME_MAX_SAMPLES = "maxSamples";

  @SerializedName(SERIALIZED_NAME_MAX_SAMPLES)
  private Integer maxSamples;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";

  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public V1PrometheusSpecQuery lookbackDelta(String lookbackDelta) {

    this.lookbackDelta = lookbackDelta;
    return this;
  }

  /**
   * The delta difference allowed for retrieving metrics during expression evaluations.
   *
   * @return lookbackDelta
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The delta difference allowed for retrieving metrics during expression evaluations.")
  public String getLookbackDelta() {
    return lookbackDelta;
  }

  public void setLookbackDelta(String lookbackDelta) {
    this.lookbackDelta = lookbackDelta;
  }

  public V1PrometheusSpecQuery maxConcurrency(Integer maxConcurrency) {

    this.maxConcurrency = maxConcurrency;
    return this;
  }

  /**
   * Number of concurrent queries that can be run at once.
   *
   * @return maxConcurrency
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of concurrent queries that can be run at once.")
  public Integer getMaxConcurrency() {
    return maxConcurrency;
  }

  public void setMaxConcurrency(Integer maxConcurrency) {
    this.maxConcurrency = maxConcurrency;
  }

  public V1PrometheusSpecQuery maxSamples(Integer maxSamples) {

    this.maxSamples = maxSamples;
    return this;
  }

  /**
   * Maximum number of samples a single query can load into memory. Note that queries will fail if
   * they would load more samples than this into memory, so this also limits the number of samples a
   * query can return.
   *
   * @return maxSamples
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Maximum number of samples a single query can load into memory. Note that queries will fail if they would load more samples than this into memory, so this also limits the number of samples a query can return.")
  public Integer getMaxSamples() {
    return maxSamples;
  }

  public void setMaxSamples(Integer maxSamples) {
    this.maxSamples = maxSamples;
  }

  public V1PrometheusSpecQuery timeout(String timeout) {

    this.timeout = timeout;
    return this;
  }

  /**
   * Maximum time a query may take before being aborted.
   *
   * @return timeout
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum time a query may take before being aborted.")
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecQuery v1PrometheusSpecQuery = (V1PrometheusSpecQuery) o;
    return Objects.equals(this.lookbackDelta, v1PrometheusSpecQuery.lookbackDelta)
        && Objects.equals(this.maxConcurrency, v1PrometheusSpecQuery.maxConcurrency)
        && Objects.equals(this.maxSamples, v1PrometheusSpecQuery.maxSamples)
        && Objects.equals(this.timeout, v1PrometheusSpecQuery.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookbackDelta, maxConcurrency, maxSamples, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecQuery {\n");
    sb.append("    lookbackDelta: ").append(toIndentedString(lookbackDelta)).append("\n");
    sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
    sb.append("    maxSamples: ").append(toIndentedString(maxSamples)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
