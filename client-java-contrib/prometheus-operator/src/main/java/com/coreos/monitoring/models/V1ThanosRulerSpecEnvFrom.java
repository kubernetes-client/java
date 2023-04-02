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

/** EnvFromSource represents the source of a set of ConfigMaps */
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecEnvFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1ThanosRulerSpecConfigMapRef configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";

  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ThanosRulerSpecSecretRef secretRef;

  public V1ThanosRulerSpecEnvFrom configMapRef(V1ThanosRulerSpecConfigMapRef configMapRef) {

    this.configMapRef = configMapRef;
    return this;
  }

  /**
   * Get configMapRef
   *
   * @return configMapRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecConfigMapRef getConfigMapRef() {
    return configMapRef;
  }

  public void setConfigMapRef(V1ThanosRulerSpecConfigMapRef configMapRef) {
    this.configMapRef = configMapRef;
  }

  public V1ThanosRulerSpecEnvFrom prefix(String prefix) {

    this.prefix = prefix;
    return this;
  }

  /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   *
   * @return prefix
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public V1ThanosRulerSpecEnvFrom secretRef(V1ThanosRulerSpecSecretRef secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecEnvFrom v1ThanosRulerSpecEnvFrom = (V1ThanosRulerSpecEnvFrom) o;
    return Objects.equals(this.configMapRef, v1ThanosRulerSpecEnvFrom.configMapRef)
        && Objects.equals(this.prefix, v1ThanosRulerSpecEnvFrom.prefix)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecEnvFrom.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecEnvFrom {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
