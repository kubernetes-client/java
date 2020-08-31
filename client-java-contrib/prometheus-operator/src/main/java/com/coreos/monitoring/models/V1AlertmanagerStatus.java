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

/**
 * Most recent observed status of the Alertmanager cluster. Read-only. Not included when requesting
 * from the apiserver, only from the Prometheus Operator API itself. More info:
 * https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
 */
@ApiModel(
    description =
        "Most recent observed status of the Alertmanager cluster. Read-only. Not included when requesting from the apiserver, only from the Prometheus Operator API itself. More info: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#spec-and-status")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1AlertmanagerStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_PAUSED = "paused";

  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_UNAVAILABLE_REPLICAS = "unavailableReplicas";

  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_REPLICAS)
  private Integer unavailableReplicas;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";

  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;

  public V1AlertmanagerStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this
   * Alertmanager cluster.
   *
   * @return availableReplicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "Total number of available pods (ready for at least minReadySeconds) targeted by this Alertmanager cluster.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1AlertmanagerStatus paused(Boolean paused) {

    this.paused = paused;
    return this;
  }

  /**
   * Represents whether any actions on the underlaying managed objects are being performed. Only
   * delete actions will be performed.
   *
   * @return paused
   */
  @ApiModelProperty(
      required = true,
      value =
          "Represents whether any actions on the underlaying managed objects are being performed. Only delete actions will be performed.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1AlertmanagerStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this Alertmanager cluster (their labels match
   * the selector).
   *
   * @return replicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "Total number of non-terminated pods targeted by this Alertmanager cluster (their labels match the selector).")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1AlertmanagerStatus unavailableReplicas(Integer unavailableReplicas) {

    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

  /**
   * Total number of unavailable pods targeted by this Alertmanager cluster.
   *
   * @return unavailableReplicas
   */
  @ApiModelProperty(
      required = true,
      value = "Total number of unavailable pods targeted by this Alertmanager cluster.")
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }

  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }

  public V1AlertmanagerStatus updatedReplicas(Integer updatedReplicas) {

    this.updatedReplicas = updatedReplicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this Alertmanager cluster that have the desired
   * version spec.
   *
   * @return updatedReplicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "Total number of non-terminated pods targeted by this Alertmanager cluster that have the desired version spec.")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AlertmanagerStatus v1AlertmanagerStatus = (V1AlertmanagerStatus) o;
    return Objects.equals(this.availableReplicas, v1AlertmanagerStatus.availableReplicas)
        && Objects.equals(this.paused, v1AlertmanagerStatus.paused)
        && Objects.equals(this.replicas, v1AlertmanagerStatus.replicas)
        && Objects.equals(this.unavailableReplicas, v1AlertmanagerStatus.unavailableReplicas)
        && Objects.equals(this.updatedReplicas, v1AlertmanagerStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, paused, replicas, unavailableReplicas, updatedReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ")
        .append(toIndentedString(unavailableReplicas))
        .append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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
