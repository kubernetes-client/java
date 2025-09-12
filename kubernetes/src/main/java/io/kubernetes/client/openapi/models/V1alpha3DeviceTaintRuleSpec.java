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
import io.kubernetes.client.openapi.models.V1alpha3DeviceTaint;
import io.kubernetes.client.openapi.models.V1alpha3DeviceTaintSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceTaintRuleSpec specifies the selector and one taint.
 */
@ApiModel(description = "DeviceTaintRuleSpec specifies the selector and one taint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1alpha3DeviceTaintRuleSpec {
  public static final String SERIALIZED_NAME_DEVICE_SELECTOR = "deviceSelector";
  @SerializedName(SERIALIZED_NAME_DEVICE_SELECTOR)
  private V1alpha3DeviceTaintSelector deviceSelector;

  public static final String SERIALIZED_NAME_TAINT = "taint";
  @SerializedName(SERIALIZED_NAME_TAINT)
  private V1alpha3DeviceTaint taint;


  public V1alpha3DeviceTaintRuleSpec deviceSelector(V1alpha3DeviceTaintSelector deviceSelector) {

    this.deviceSelector = deviceSelector;
    return this;
  }

   /**
   * Get deviceSelector
   * @return deviceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha3DeviceTaintSelector getDeviceSelector() {
    return deviceSelector;
  }


  public void setDeviceSelector(V1alpha3DeviceTaintSelector deviceSelector) {
    this.deviceSelector = deviceSelector;
  }


  public V1alpha3DeviceTaintRuleSpec taint(V1alpha3DeviceTaint taint) {

    this.taint = taint;
    return this;
  }

   /**
   * Get taint
   * @return taint
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha3DeviceTaint getTaint() {
    return taint;
  }


  public void setTaint(V1alpha3DeviceTaint taint) {
    this.taint = taint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceTaintRuleSpec v1alpha3DeviceTaintRuleSpec = (V1alpha3DeviceTaintRuleSpec) o;
    return Objects.equals(this.deviceSelector, v1alpha3DeviceTaintRuleSpec.deviceSelector) &&
        Objects.equals(this.taint, v1alpha3DeviceTaintRuleSpec.taint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceSelector, taint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceTaintRuleSpec {\n");
    sb.append("    deviceSelector: ").append(toIndentedString(deviceSelector)).append("\n");
    sb.append("    taint: ").append(toIndentedString(taint)).append("\n");
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
