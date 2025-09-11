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
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior;
import io.kubernetes.client.openapi.models.V2MetricSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 */
@ApiModel(description = "HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V2HorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR)
  @jakarta.annotation.Nullable
  private V2HorizontalPodAutoscalerBehavior behavior;

  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  @jakarta.annotation.Nonnull
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  @jakarta.annotation.Nullable
  private List<V2MetricSpec> metrics = new ArrayList<>();

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";
  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  @jakarta.annotation.Nonnull
  private V2CrossVersionObjectReference scaleTargetRef;

  public V2HorizontalPodAutoscalerSpec() {
  }

  public V2HorizontalPodAutoscalerSpec behavior(@jakarta.annotation.Nullable V2HorizontalPodAutoscalerBehavior behavior) {
    this.behavior = behavior;
    return this;
  }

  /**
   * Get behavior
   * @return behavior
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2HorizontalPodAutoscalerBehavior getBehavior() {
    return behavior;
  }

  public void setBehavior(@jakarta.annotation.Nullable V2HorizontalPodAutoscalerBehavior behavior) {
    this.behavior = behavior;
  }


  public V2HorizontalPodAutoscalerSpec maxReplicas(@jakarta.annotation.Nonnull Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
   * @return maxReplicas
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(@jakarta.annotation.Nonnull Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public V2HorizontalPodAutoscalerSpec metrics(@jakarta.annotation.Nullable List<V2MetricSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  public V2HorizontalPodAutoscalerSpec addMetricsItem(V2MetricSpec metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.")
  public List<V2MetricSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(@jakarta.annotation.Nullable List<V2MetricSpec> metrics) {
    this.metrics = metrics;
  }


  public V2HorizontalPodAutoscalerSpec minReplicas(@jakarta.annotation.Nullable Integer minReplicas) {
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


  public V2HorizontalPodAutoscalerSpec scaleTargetRef(@jakarta.annotation.Nonnull V2CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

  /**
   * Get scaleTargetRef
   * @return scaleTargetRef
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V2CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(@jakarta.annotation.Nonnull V2CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HorizontalPodAutoscalerSpec v2HorizontalPodAutoscalerSpec = (V2HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.behavior, v2HorizontalPodAutoscalerSpec.behavior) &&
        Objects.equals(this.maxReplicas, v2HorizontalPodAutoscalerSpec.maxReplicas) &&
        Objects.equals(this.metrics, v2HorizontalPodAutoscalerSpec.metrics) &&
        Objects.equals(this.minReplicas, v2HorizontalPodAutoscalerSpec.minReplicas) &&
        Objects.equals(this.scaleTargetRef, v2HorizontalPodAutoscalerSpec.scaleTargetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behavior, maxReplicas, metrics, minReplicas, scaleTargetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HorizontalPodAutoscalerSpec {\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
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
    openapiFields.add("behavior");
    openapiFields.add("maxReplicas");
    openapiFields.add("metrics");
    openapiFields.add("minReplicas");
    openapiFields.add("scaleTargetRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maxReplicas");
    openapiRequiredFields.add("scaleTargetRef");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V2HorizontalPodAutoscalerSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V2HorizontalPodAutoscalerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2HorizontalPodAutoscalerSpec is not found in the empty JSON string", V2HorizontalPodAutoscalerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V2HorizontalPodAutoscalerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2HorizontalPodAutoscalerSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2HorizontalPodAutoscalerSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `behavior`
      if (jsonObj.get("behavior") != null && !jsonObj.get("behavior").isJsonNull()) {
        V2HorizontalPodAutoscalerBehavior.validateJsonElement(jsonObj.get("behavior"));
      }
      if (jsonObj.get("metrics") != null && !jsonObj.get("metrics").isJsonNull()) {
        JsonArray jsonArraymetrics = jsonObj.getAsJsonArray("metrics");
        if (jsonArraymetrics != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metrics").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
          }

          // validate the optional field `metrics` (array)
          for (int i = 0; i < jsonArraymetrics.size(); i++) {
            V2MetricSpec.validateJsonElement(jsonArraymetrics.get(i));
          };
        }
      }
      // validate the required field `scaleTargetRef`
      V2CrossVersionObjectReference.validateJsonElement(jsonObj.get("scaleTargetRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2HorizontalPodAutoscalerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2HorizontalPodAutoscalerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2HorizontalPodAutoscalerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2HorizontalPodAutoscalerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V2HorizontalPodAutoscalerSpec>() {
           @Override
           public void write(JsonWriter out, V2HorizontalPodAutoscalerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2HorizontalPodAutoscalerSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V2HorizontalPodAutoscalerSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V2HorizontalPodAutoscalerSpec
   * @throws IOException if the JSON string is invalid with respect to V2HorizontalPodAutoscalerSpec
   */
  public static V2HorizontalPodAutoscalerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2HorizontalPodAutoscalerSpec.class);
  }

  /**
   * Convert an instance of V2HorizontalPodAutoscalerSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
