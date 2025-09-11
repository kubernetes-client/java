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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1CrossVersionObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * specification of a horizontal pod autoscaler.
 */
@ApiModel(description = "specification of a horizontal pod autoscaler.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1HorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  @jakarta.annotation.Nonnull
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";
  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  @jakarta.annotation.Nonnull
  private V1CrossVersionObjectReference scaleTargetRef;

  public static final String SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE = "targetCPUUtilizationPercentage";
  @SerializedName(SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE)
  @jakarta.annotation.Nullable
  private Integer targetCPUUtilizationPercentage;

  public V1HorizontalPodAutoscalerSpec() {
  }

  public V1HorizontalPodAutoscalerSpec maxReplicas(@jakarta.annotation.Nonnull Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
   * @return maxReplicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(@jakarta.annotation.Nonnull Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public V1HorizontalPodAutoscalerSpec minReplicas(@jakarta.annotation.Nullable Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

  /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
   * @return minReplicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(@jakarta.annotation.Nullable Integer minReplicas) {
    this.minReplicas = minReplicas;
  }


  public V1HorizontalPodAutoscalerSpec scaleTargetRef(@jakarta.annotation.Nonnull V1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

  /**
   * Get scaleTargetRef
   * @return scaleTargetRef
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(@jakarta.annotation.Nonnull V1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }


  public V1HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(@jakarta.annotation.Nullable Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }

  /**
   * targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
   * @return targetCPUUtilizationPercentage
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.")
  public Integer getTargetCPUUtilizationPercentage() {
    return targetCPUUtilizationPercentage;
  }

  public void setTargetCPUUtilizationPercentage(@jakarta.annotation.Nullable Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HorizontalPodAutoscalerSpec v1HorizontalPodAutoscalerSpec = (V1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, v1HorizontalPodAutoscalerSpec.maxReplicas) &&
        Objects.equals(this.minReplicas, v1HorizontalPodAutoscalerSpec.minReplicas) &&
        Objects.equals(this.scaleTargetRef, v1HorizontalPodAutoscalerSpec.scaleTargetRef) &&
        Objects.equals(this.targetCPUUtilizationPercentage, v1HorizontalPodAutoscalerSpec.targetCPUUtilizationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HorizontalPodAutoscalerSpec {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
    sb.append("    targetCPUUtilizationPercentage: ").append(toIndentedString(targetCPUUtilizationPercentage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("maxReplicas");
    openapiFields.add("minReplicas");
    openapiFields.add("scaleTargetRef");
    openapiFields.add("targetCPUUtilizationPercentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maxReplicas");
    openapiRequiredFields.add("scaleTargetRef");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1HorizontalPodAutoscalerSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1HorizontalPodAutoscalerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HorizontalPodAutoscalerSpec is not found in the empty JSON string", V1HorizontalPodAutoscalerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1HorizontalPodAutoscalerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HorizontalPodAutoscalerSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1HorizontalPodAutoscalerSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `scaleTargetRef`
      V1CrossVersionObjectReference.validateJsonElement(jsonObj.get("scaleTargetRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1HorizontalPodAutoscalerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1HorizontalPodAutoscalerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1HorizontalPodAutoscalerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1HorizontalPodAutoscalerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1HorizontalPodAutoscalerSpec>() {
           @Override
           public void write(JsonWriter out, V1HorizontalPodAutoscalerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1HorizontalPodAutoscalerSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1HorizontalPodAutoscalerSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1HorizontalPodAutoscalerSpec
   * @throws IOException if the JSON string is invalid with respect to V1HorizontalPodAutoscalerSpec
   */
  public static V1HorizontalPodAutoscalerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1HorizontalPodAutoscalerSpec.class);
  }

  /**
   * Convert an instance of V1HorizontalPodAutoscalerSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
