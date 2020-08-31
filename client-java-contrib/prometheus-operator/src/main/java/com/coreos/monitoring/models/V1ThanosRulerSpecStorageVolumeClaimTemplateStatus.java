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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Status represents the current information/status of a persistent volume claim. Read-only. More
 * info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@ApiModel(
    description =
        "Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecStorageVolumeClaimTemplateStatus {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";

  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, String> capacity = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_PHASE = "phase";

  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus addAccessModesItem(
      String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<String>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

  /**
   * AccessModes contains the actual access modes the volume backing the PVC has. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   *
   * @return accessModes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus capacity(Map<String, String> capacity) {

    this.capacity = capacity;
    return this;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus putCapacityItem(
      String key, String capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<String, String>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

  /**
   * Represents the actual resources of the underlying volume.
   *
   * @return capacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the actual resources of the underlying volume.")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus conditions(
      List<V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus addConditionsItem(
      V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions =
          new ArrayList<V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Current Condition of persistent volume claim. If underlying persistent volume is being resized
   * then the Condition will be set to &#39;ResizeStarted&#39;.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.")
  public List<V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(
      List<V1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions> conditions) {
    this.conditions = conditions;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateStatus phase(String phase) {

    this.phase = phase;
    return this;
  }

  /**
   * Phase represents the current phase of PersistentVolumeClaim.
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase represents the current phase of PersistentVolumeClaim.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecStorageVolumeClaimTemplateStatus
        v1ThanosRulerSpecStorageVolumeClaimTemplateStatus =
            (V1ThanosRulerSpecStorageVolumeClaimTemplateStatus) o;
    return Objects.equals(
            this.accessModes, v1ThanosRulerSpecStorageVolumeClaimTemplateStatus.accessModes)
        && Objects.equals(this.capacity, v1ThanosRulerSpecStorageVolumeClaimTemplateStatus.capacity)
        && Objects.equals(
            this.conditions, v1ThanosRulerSpecStorageVolumeClaimTemplateStatus.conditions)
        && Objects.equals(this.phase, v1ThanosRulerSpecStorageVolumeClaimTemplateStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, capacity, conditions, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecStorageVolumeClaimTemplateStatus {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
