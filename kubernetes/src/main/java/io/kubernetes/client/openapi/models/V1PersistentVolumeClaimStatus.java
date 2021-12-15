/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** PersistentVolumeClaimStatus is the current status of a persistent volume claim. */
@ApiModel(
    description = "PersistentVolumeClaimStatus is the current status of a persistent volume claim.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1PersistentVolumeClaimStatus {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";

  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "allocatedResources";

  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  private Map<String, Quantity> allocatedResources = null;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, Quantity> capacity = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1PersistentVolumeClaimCondition> conditions = null;

  /**
   * Phase represents the current phase of PersistentVolumeClaim. Possible enum values: -
   * &#x60;\&quot;Bound\&quot;&#x60; used for PersistentVolumeClaims that are bound -
   * &#x60;\&quot;Lost\&quot;&#x60; used for PersistentVolumeClaims that lost their underlying
   * PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any
   * longer and all data on it was lost. - &#x60;\&quot;Pending\&quot;&#x60; used for
   * PersistentVolumeClaims that are not yet bound
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    BOUND("Bound"),

    LOST("Lost"),

    PENDING("Pending");

    private String value;

    PhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhaseEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHASE = "phase";

  @SerializedName(SERIALIZED_NAME_PHASE)
  private PhaseEnum phase;

  public static final String SERIALIZED_NAME_RESIZE_STATUS = "resizeStatus";

  @SerializedName(SERIALIZED_NAME_RESIZE_STATUS)
  private String resizeStatus;

  public V1PersistentVolumeClaimStatus accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public V1PersistentVolumeClaimStatus addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
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

  public V1PersistentVolumeClaimStatus allocatedResources(
      Map<String, Quantity> allocatedResources) {

    this.allocatedResources = allocatedResources;
    return this;
  }

  public V1PersistentVolumeClaimStatus putAllocatedResourcesItem(
      String key, Quantity allocatedResourcesItem) {
    if (this.allocatedResources == null) {
      this.allocatedResources = new HashMap<>();
    }
    this.allocatedResources.put(key, allocatedResourcesItem);
    return this;
  }

  /**
   * The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may
   * be larger than the actual capacity when a volume expansion operation is requested. For storage
   * quota, the larger value from allocatedResources and PVC.spec.resources is used. If
   * allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a
   * volume expansion capacity request is lowered, allocatedResources is only lowered if there are
   * no expansion operations in progress and if the actual volume capacity is equal or lower than
   * the requested capacity. This is an alpha field and requires enabling
   * RecoverVolumeExpansionFailure feature.
   *
   * @return allocatedResources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
  public Map<String, Quantity> getAllocatedResources() {
    return allocatedResources;
  }

  public void setAllocatedResources(Map<String, Quantity> allocatedResources) {
    this.allocatedResources = allocatedResources;
  }

  public V1PersistentVolumeClaimStatus capacity(Map<String, Quantity> capacity) {

    this.capacity = capacity;
    return this;
  }

  public V1PersistentVolumeClaimStatus putCapacityItem(String key, Quantity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
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
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }

  public V1PersistentVolumeClaimStatus conditions(
      List<V1PersistentVolumeClaimCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1PersistentVolumeClaimStatus addConditionsItem(
      V1PersistentVolumeClaimCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
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
  public List<V1PersistentVolumeClaimCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
  }

  public V1PersistentVolumeClaimStatus phase(PhaseEnum phase) {

    this.phase = phase;
    return this;
  }

  /**
   * Phase represents the current phase of PersistentVolumeClaim. Possible enum values: -
   * &#x60;\&quot;Bound\&quot;&#x60; used for PersistentVolumeClaims that are bound -
   * &#x60;\&quot;Lost\&quot;&#x60; used for PersistentVolumeClaims that lost their underlying
   * PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any
   * longer and all data on it was lost. - &#x60;\&quot;Pending\&quot;&#x60; used for
   * PersistentVolumeClaims that are not yet bound
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Phase represents the current phase of PersistentVolumeClaim.  Possible enum values:  - `\"Bound\"` used for PersistentVolumeClaims that are bound  - `\"Lost\"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.  - `\"Pending\"` used for PersistentVolumeClaims that are not yet bound")
  public PhaseEnum getPhase() {
    return phase;
  }

  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }

  public V1PersistentVolumeClaimStatus resizeStatus(String resizeStatus) {

    this.resizeStatus = resizeStatus;
    return this;
  }

  /**
   * ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when
   * expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This
   * is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   *
   * @return resizeStatus
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
  public String getResizeStatus() {
    return resizeStatus;
  }

  public void setResizeStatus(String resizeStatus) {
    this.resizeStatus = resizeStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeClaimStatus v1PersistentVolumeClaimStatus = (V1PersistentVolumeClaimStatus) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeClaimStatus.accessModes)
        && Objects.equals(this.allocatedResources, v1PersistentVolumeClaimStatus.allocatedResources)
        && Objects.equals(this.capacity, v1PersistentVolumeClaimStatus.capacity)
        && Objects.equals(this.conditions, v1PersistentVolumeClaimStatus.conditions)
        && Objects.equals(this.phase, v1PersistentVolumeClaimStatus.phase)
        && Objects.equals(this.resizeStatus, v1PersistentVolumeClaimStatus.resizeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, allocatedResources, capacity, conditions, phase, resizeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimStatus {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    resizeStatus: ").append(toIndentedString(resizeStatus)).append("\n");
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
