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

/** DeploymentStrategy describes how to replace existing pods with new ones. */
@ApiModel(description = "DeploymentStrategy describes how to replace existing pods with new ones.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1DeploymentStrategy {
  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";

  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1RollingUpdateDeployment rollingUpdate;

  /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is
   * RollingUpdate. Possible enum values: - &#x60;\&quot;Recreate\&quot;&#x60; Kill all existing
   * pods before creating new ones. - &#x60;\&quot;RollingUpdate\&quot;&#x60; Replace the old
   * ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and
   * scale up the new one.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    RECREATE("Recreate"),

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

  public V1DeploymentStrategy rollingUpdate(V1RollingUpdateDeployment rollingUpdate) {

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
  public V1RollingUpdateDeployment getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1DeploymentStrategy type(TypeEnum type) {

    this.type = type;
    return this;
  }

  /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is
   * RollingUpdate. Possible enum values: - &#x60;\&quot;Recreate\&quot;&#x60; Kill all existing
   * pods before creating new ones. - &#x60;\&quot;RollingUpdate\&quot;&#x60; Replace the old
   * ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and
   * scale up the new one.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.  Possible enum values:  - `\"Recreate\"` Kill all existing pods before creating new ones.  - `\"RollingUpdate\"` Replace the old ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and scale up the new one.")
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
    V1DeploymentStrategy v1DeploymentStrategy = (V1DeploymentStrategy) o;
    return Objects.equals(this.rollingUpdate, v1DeploymentStrategy.rollingUpdate)
        && Objects.equals(this.type, v1DeploymentStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeploymentStrategy {\n");
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
