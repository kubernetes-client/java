/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ConfigMapEnvSource;
import io.kubernetes.client.openapi.models.V1SecretEnvSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnvFromSource represents the source of a set of ConfigMaps or Secrets
 */
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps or Secrets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1EnvFromSource {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1ConfigMapEnvSource configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretEnvSource secretRef;


  public V1EnvFromSource configMapRef(V1ConfigMapEnvSource configMapRef) {

    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(V1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1EnvFromSource prefix(String prefix) {

    this.prefix = prefix;
    return this;
  }

   /**
   * Optional text to prepend to the name of each environment variable. May consist of any printable ASCII characters except &#39;&#x3D;&#39;.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional text to prepend to the name of each environment variable. May consist of any printable ASCII characters except '='.")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public V1EnvFromSource secretRef(V1SecretEnvSource secretRef) {

    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretEnvSource getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1SecretEnvSource secretRef) {
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
    V1EnvFromSource v1EnvFromSource = (V1EnvFromSource) o;
    return Objects.equals(this.configMapRef, v1EnvFromSource.configMapRef) &&
        Objects.equals(this.prefix, v1EnvFromSource.prefix) &&
        Objects.equals(this.secretRef, v1EnvFromSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EnvFromSource {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
