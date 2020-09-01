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

/** HTTPHeader describes a custom header to be used in HTTP probes */
@ApiModel(description = "HTTPHeader describes a custom header to be used in HTTP probes")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The header field name
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "The header field name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders value(String value) {

    this.value = value;
    return this;
  }

  /**
   * The header field value
   *
   * @return value
   */
  @ApiModelProperty(required = true, value = "The header field value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders
        v1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders =
            (V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders) o;
    return Objects.equals(this.name, v1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders.name)
        && Objects.equals(this.value, v1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecLifecyclePostStartHttpGetHttpHeaders {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
