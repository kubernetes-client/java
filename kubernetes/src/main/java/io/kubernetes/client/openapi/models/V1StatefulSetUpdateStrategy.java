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

/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
 * perform updates. It includes any additional parameters necessary to perform the update for the
 * indicated strategy.
 */
@ApiModel(
    description =
        "StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1StatefulSetUpdateStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";

  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1RollingUpdateStatefulSetStrategy rollingUpdate;

  /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. Possible
   * enum values: - &#x60;\&quot;OnDelete\&quot;&#x60; triggers the legacy behavior. Version
   * tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec
   * when they are manually deleted. When a scale operation is performed with this
   * strategy,specification version indicated by the StatefulSet&#39;s currentRevision. -
   * &#x60;\&quot;RollingUpdate\&quot;&#x60; indicates that update will be applied to all Pods in
   * the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is
   * performed with this strategy, new Pods will be created from the specification version indicated
   * by the StatefulSet&#39;s updateRevision.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONDELETE("OnDelete"),

    ROLLINGUPDATE("RollingUpdate");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public V1StatefulSetUpdateStrategy rollingUpdate(
      V1RollingUpdateStatefulSetStrategy rollingUpdate) {

    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Get rollingUpdate
   *
   * @return rollingUpdate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1StatefulSetUpdateStrategy type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. Possible
   * enum values: - &#x60;\&quot;OnDelete\&quot;&#x60; triggers the legacy behavior. Version
   * tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec
   * when they are manually deleted. When a scale operation is performed with this
   * strategy,specification version indicated by the StatefulSet&#39;s currentRevision. -
   * &#x60;\&quot;RollingUpdate\&quot;&#x60; indicates that update will be applied to all Pods in
   * the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is
   * performed with this strategy, new Pods will be created from the specification version indicated
   * by the StatefulSet&#39;s updateRevision.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.  Possible enum values:  - `\"OnDelete\"` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet's currentRevision.  - `\"RollingUpdate\"` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetUpdateStrategy v1StatefulSetUpdateStrategy = (V1StatefulSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, v1StatefulSetUpdateStrategy.rollingUpdate)
        && Objects.equals(this.type, v1StatefulSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetUpdateStrategy {\n");
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
