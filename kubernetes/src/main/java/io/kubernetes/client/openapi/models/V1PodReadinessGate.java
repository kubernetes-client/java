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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/** PodReadinessGate contains the reference to a pod condition */
@ApiModel(description = "PodReadinessGate contains the reference to a pod condition")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1PodReadinessGate {
  /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * Possible enum values: - &#x60;\&quot;ContainersReady\&quot;&#x60; indicates whether all
   * containers in the pod are ready. - &#x60;\&quot;Initialized\&quot;&#x60; means that all init
   * containers in the pod have started successfully. - &#x60;\&quot;PodScheduled\&quot;&#x60;
   * represents status of the scheduling process for this pod. - &#x60;\&quot;Ready\&quot;&#x60;
   * means the pod is able to service requests and should be added to the load balancing pools of
   * all matching services.
   */
  @JsonAdapter(ConditionTypeEnum.Adapter.class)
  public enum ConditionTypeEnum {
    CONTAINERSREADY("ContainersReady"),

    INITIALIZED("Initialized"),

    PODSCHEDULED("PodScheduled"),

    READY("Ready");

    private String value;

    ConditionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionTypeEnum fromValue(String value) {
      for (ConditionTypeEnum b : ConditionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConditionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONDITION_TYPE = "conditionType";

  @SerializedName(SERIALIZED_NAME_CONDITION_TYPE)
  private ConditionTypeEnum conditionType;

  public V1PodReadinessGate conditionType(ConditionTypeEnum conditionType) {

    this.conditionType = conditionType;
    return this;
  }

  /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * Possible enum values: - &#x60;\&quot;ContainersReady\&quot;&#x60; indicates whether all
   * containers in the pod are ready. - &#x60;\&quot;Initialized\&quot;&#x60; means that all init
   * containers in the pod have started successfully. - &#x60;\&quot;PodScheduled\&quot;&#x60;
   * represents status of the scheduling process for this pod. - &#x60;\&quot;Ready\&quot;&#x60;
   * means the pod is able to service requests and should be added to the load balancing pools of
   * all matching services.
   *
   * @return conditionType
   */
  @ApiModelProperty(
      required = true,
      value =
          "ConditionType refers to a condition in the pod's condition list with matching type.  Possible enum values:  - `\"ContainersReady\"` indicates whether all containers in the pod are ready.  - `\"Initialized\"` means that all init containers in the pod have started successfully.  - `\"PodScheduled\"` represents status of the scheduling process for this pod.  - `\"Ready\"` means the pod is able to service requests and should be added to the load balancing pools of all matching services.")
  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }

  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodReadinessGate v1PodReadinessGate = (V1PodReadinessGate) o;
    return Objects.equals(this.conditionType, v1PodReadinessGate.conditionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodReadinessGate {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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
