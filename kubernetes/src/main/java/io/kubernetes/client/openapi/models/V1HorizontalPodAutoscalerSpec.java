/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1CrossVersionObjectReference;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * specification of a horizontal pod autoscaler.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1HorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";
  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  private V1CrossVersionObjectReference scaleTargetRef;

  public static final String SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE = "targetCPUUtilizationPercentage";
  @SerializedName(SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE)
  private Integer targetCPUUtilizationPercentage;

  public V1HorizontalPodAutoscalerSpec() {
  }

  public V1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {

    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * maxReplicas is the upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
   * @return maxReplicas
  **/
  @jakarta.annotation.Nonnull
  public Integer getMaxReplicas() {
    return maxReplicas;
  }


  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public V1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {

    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
   * @return minReplicas
  **/
  @jakarta.annotation.Nullable
  public Integer getMinReplicas() {
    return minReplicas;
  }


  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }


  public V1HorizontalPodAutoscalerSpec scaleTargetRef(V1CrossVersionObjectReference scaleTargetRef) {

    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

   /**
   * Get scaleTargetRef
   * @return scaleTargetRef
  **/
  @jakarta.annotation.Nonnull
  public V1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }


  public void setScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }


  public V1HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {

    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }

   /**
   * targetCPUUtilizationPercentage is the target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
   * @return targetCPUUtilizationPercentage
  **/
  @jakarta.annotation.Nullable
  public Integer getTargetCPUUtilizationPercentage() {
    return targetCPUUtilizationPercentage;
  }


  public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1HorizontalPodAutoscalerSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1HorizontalPodAutoscalerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1HorizontalPodAutoscalerSpec is not found in the empty JSON string", V1HorizontalPodAutoscalerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1HorizontalPodAutoscalerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1HorizontalPodAutoscalerSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1HorizontalPodAutoscalerSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `scaleTargetRef`
      V1CrossVersionObjectReference.validateJsonObject(jsonObj.getAsJsonObject("scaleTargetRef"));
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
