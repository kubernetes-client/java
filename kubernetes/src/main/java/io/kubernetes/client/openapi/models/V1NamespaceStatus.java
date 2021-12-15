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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NamespaceStatus is information about the current status of a Namespace. */
@ApiModel(description = "NamespaceStatus is information about the current status of a Namespace.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1NamespaceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1NamespaceCondition> conditions = null;

  /**
   * Phase is the current lifecycle phase of the namespace. More info:
   * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ Possible enum values: -
   * &#x60;\&quot;Active\&quot;&#x60; means the namespace is available for use in the system -
   * &#x60;\&quot;Terminating\&quot;&#x60; means the namespace is undergoing graceful termination
   */
  @JsonAdapter(PhaseEnum.Adapter.class)
  public enum PhaseEnum {
    ACTIVE("Active"),

    TERMINATING("Terminating");

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

  public V1NamespaceStatus conditions(List<V1NamespaceCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1NamespaceStatus addConditionsItem(V1NamespaceCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a namespace&#39;s current state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Represents the latest available observations of a namespace's current state.")
  public List<V1NamespaceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1NamespaceCondition> conditions) {
    this.conditions = conditions;
  }

  public V1NamespaceStatus phase(PhaseEnum phase) {

    this.phase = phase;
    return this;
  }

  /**
   * Phase is the current lifecycle phase of the namespace. More info:
   * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/ Possible enum values: -
   * &#x60;\&quot;Active\&quot;&#x60; means the namespace is available for use in the system -
   * &#x60;\&quot;Terminating\&quot;&#x60; means the namespace is undergoing graceful termination
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/  Possible enum values:  - `\"Active\"` means the namespace is available for use in the system  - `\"Terminating\"` means the namespace is undergoing graceful termination")
  public PhaseEnum getPhase() {
    return phase;
  }

  public void setPhase(PhaseEnum phase) {
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
    V1NamespaceStatus v1NamespaceStatus = (V1NamespaceStatus) o;
    return Objects.equals(this.conditions, v1NamespaceStatus.conditions)
        && Objects.equals(this.phase, v1NamespaceStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceStatus {\n");
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
