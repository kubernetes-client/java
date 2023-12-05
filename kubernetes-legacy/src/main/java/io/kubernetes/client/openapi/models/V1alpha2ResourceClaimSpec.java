/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceClaimSpec defines how a resource is to be allocated.
 */
@ApiModel(description = "ResourceClaimSpec defines how a resource is to be allocated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2ResourceClaimSpec {
  public static final String SERIALIZED_NAME_ALLOCATION_MODE = "allocationMode";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_MODE)
  private String allocationMode;

  public static final String SERIALIZED_NAME_PARAMETERS_REF = "parametersRef";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_REF)
  private V1alpha2ResourceClaimParametersReference parametersRef;

  public static final String SERIALIZED_NAME_RESOURCE_CLASS_NAME = "resourceClassName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLASS_NAME)
  private String resourceClassName;


  public V1alpha2ResourceClaimSpec allocationMode(String allocationMode) {

    this.allocationMode = allocationMode;
    return this;
  }

   /**
   * Allocation can start immediately or when a Pod wants to use the resource. \&quot;WaitForFirstConsumer\&quot; is the default.
   * @return allocationMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocation can start immediately or when a Pod wants to use the resource. \"WaitForFirstConsumer\" is the default.")

  public String getAllocationMode() {
    return allocationMode;
  }


  public void setAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1alpha2ResourceClaimSpec parametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {

    this.parametersRef = parametersRef;
    return this;
  }

   /**
   * Get parametersRef
   * @return parametersRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2ResourceClaimParametersReference getParametersRef() {
    return parametersRef;
  }


  public void setParametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {
    this.parametersRef = parametersRef;
  }


  public V1alpha2ResourceClaimSpec resourceClassName(String resourceClassName) {

    this.resourceClassName = resourceClassName;
    return this;
  }

   /**
   * ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.
   * @return resourceClassName
  **/
  @ApiModelProperty(required = true, value = "ResourceClassName references the driver and additional parameters via the name of a ResourceClass that was created as part of the driver deployment.")

  public String getResourceClassName() {
    return resourceClassName;
  }


  public void setResourceClassName(String resourceClassName) {
    this.resourceClassName = resourceClassName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimSpec v1alpha2ResourceClaimSpec = (V1alpha2ResourceClaimSpec) o;
    return Objects.equals(this.allocationMode, v1alpha2ResourceClaimSpec.allocationMode) &&
        Objects.equals(this.parametersRef, v1alpha2ResourceClaimSpec.parametersRef) &&
        Objects.equals(this.resourceClassName, v1alpha2ResourceClaimSpec.resourceClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMode, parametersRef, resourceClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimSpec {\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    parametersRef: ").append(toIndentedString(parametersRef)).append("\n");
    sb.append("    resourceClassName: ").append(toIndentedString(resourceClassName)).append("\n");
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
