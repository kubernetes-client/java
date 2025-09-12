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
import io.kubernetes.client.openapi.models.V2HPAScalingRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 */
@ApiModel(description = "HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V2HorizontalPodAutoscalerBehavior {
  public static final String SERIALIZED_NAME_SCALE_DOWN = "scaleDown";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN)
  private V2HPAScalingRules scaleDown;

  public static final String SERIALIZED_NAME_SCALE_UP = "scaleUp";
  @SerializedName(SERIALIZED_NAME_SCALE_UP)
  private V2HPAScalingRules scaleUp;


  public V2HorizontalPodAutoscalerBehavior scaleDown(V2HPAScalingRules scaleDown) {

    this.scaleDown = scaleDown;
    return this;
  }

   /**
   * Get scaleDown
   * @return scaleDown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2HPAScalingRules getScaleDown() {
    return scaleDown;
  }


  public void setScaleDown(V2HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
  }


  public V2HorizontalPodAutoscalerBehavior scaleUp(V2HPAScalingRules scaleUp) {

    this.scaleUp = scaleUp;
    return this;
  }

   /**
   * Get scaleUp
   * @return scaleUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2HPAScalingRules getScaleUp() {
    return scaleUp;
  }


  public void setScaleUp(V2HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HorizontalPodAutoscalerBehavior v2HorizontalPodAutoscalerBehavior = (V2HorizontalPodAutoscalerBehavior) o;
    return Objects.equals(this.scaleDown, v2HorizontalPodAutoscalerBehavior.scaleDown) &&
        Objects.equals(this.scaleUp, v2HorizontalPodAutoscalerBehavior.scaleUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleDown, scaleUp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HorizontalPodAutoscalerBehavior {\n");
    sb.append("    scaleDown: ").append(toIndentedString(scaleDown)).append("\n");
    sb.append("    scaleUp: ").append(toIndentedString(scaleUp)).append("\n");
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
