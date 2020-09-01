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

/** Source for the environment variable&#39;s value. Cannot be used if value is not empty. */
@ApiModel(
    description =
        "Source for the environment variable's value. Cannot be used if value is not empty.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1ThanosRulerSpecValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";

  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1ThanosRulerSpecValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";

  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1ThanosRulerSpecValueFromResourceFieldRef resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";

  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1ThanosRulerSpecValueFromSecretKeyRef secretKeyRef;

  public V1ThanosRulerSpecValueFrom configMapKeyRef(
      V1ThanosRulerSpecValueFromConfigMapKeyRef configMapKeyRef) {

    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

  /**
   * Get configMapKeyRef
   *
   * @return configMapKeyRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  public void setConfigMapKeyRef(V1ThanosRulerSpecValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  public V1ThanosRulerSpecValueFrom fieldRef(V1ThanosRulerSpecValueFromFieldRef fieldRef) {

    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * Get fieldRef
   *
   * @return fieldRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecValueFromFieldRef getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1ThanosRulerSpecValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }

  public V1ThanosRulerSpecValueFrom resourceFieldRef(
      V1ThanosRulerSpecValueFromResourceFieldRef resourceFieldRef) {

    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  /**
   * Get resourceFieldRef
   *
   * @return resourceFieldRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(V1ThanosRulerSpecValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  public V1ThanosRulerSpecValueFrom secretKeyRef(
      V1ThanosRulerSpecValueFromSecretKeyRef secretKeyRef) {

    this.secretKeyRef = secretKeyRef;
    return this;
  }

  /**
   * Get secretKeyRef
   *
   * @return secretKeyRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(V1ThanosRulerSpecValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecValueFrom v1ThanosRulerSpecValueFrom = (V1ThanosRulerSpecValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1ThanosRulerSpecValueFrom.configMapKeyRef)
        && Objects.equals(this.fieldRef, v1ThanosRulerSpecValueFrom.fieldRef)
        && Objects.equals(this.resourceFieldRef, v1ThanosRulerSpecValueFrom.resourceFieldRef)
        && Objects.equals(this.secretKeyRef, v1ThanosRulerSpecValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
