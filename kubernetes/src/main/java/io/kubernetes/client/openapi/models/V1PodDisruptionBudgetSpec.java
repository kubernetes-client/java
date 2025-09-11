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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@ApiModel(description = "PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodDisruptionBudgetSpec {
  public static final String SERIALIZED_NAME_MAX_UNAVAILABLE = "maxUnavailable";
  @SerializedName(SERIALIZED_NAME_MAX_UNAVAILABLE)
  @jakarta.annotation.Nullable
  private IntOrString maxUnavailable;

  public static final String SERIALIZED_NAME_MIN_AVAILABLE = "minAvailable";
  @SerializedName(SERIALIZED_NAME_MIN_AVAILABLE)
  @jakarta.annotation.Nullable
  private IntOrString minAvailable;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_UNHEALTHY_POD_EVICTION_POLICY = "unhealthyPodEvictionPolicy";
  @SerializedName(SERIALIZED_NAME_UNHEALTHY_POD_EVICTION_POLICY)
  @jakarta.annotation.Nullable
  private String unhealthyPodEvictionPolicy;

  public V1PodDisruptionBudgetSpec() {
  }

  public V1PodDisruptionBudgetSpec maxUnavailable(@jakarta.annotation.Nullable IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return maxUnavailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(@jakarta.annotation.Nullable IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }


  public V1PodDisruptionBudgetSpec minAvailable(@jakarta.annotation.Nullable IntOrString minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return minAvailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")
  public IntOrString getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(@jakarta.annotation.Nullable IntOrString minAvailable) {
    this.minAvailable = minAvailable;
  }


  public V1PodDisruptionBudgetSpec selector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1PodDisruptionBudgetSpec unhealthyPodEvictionPolicy(@jakarta.annotation.Nullable String unhealthyPodEvictionPolicy) {
    this.unhealthyPodEvictionPolicy = unhealthyPodEvictionPolicy;
    return this;
  }

  /**
   * UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction. Current implementation considers healthy pods, as pods that have status.conditions item with type&#x3D;\&quot;Ready\&quot;,status&#x3D;\&quot;True\&quot;.  Valid policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which corresponds to the IfHealthyBudget policy.  IfHealthyBudget policy means that running pods (status.phase&#x3D;\&quot;Running\&quot;), but not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction.  AlwaysAllow policy means that all running pods (status.phase&#x3D;\&quot;Running\&quot;), but not yet healthy are considered disrupted and can be evicted regardless of whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a chance to become healthy. Healthy pods will be subject to the PDB for eviction.  Additional policies may be added in the future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized policy in this field.
   * @return unhealthyPodEvictionPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction. Current implementation considers healthy pods, as pods that have status.conditions item with type=\"Ready\",status=\"True\".  Valid policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which corresponds to the IfHealthyBudget policy.  IfHealthyBudget policy means that running pods (status.phase=\"Running\"), but not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction.  AlwaysAllow policy means that all running pods (status.phase=\"Running\"), but not yet healthy are considered disrupted and can be evicted regardless of whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a chance to become healthy. Healthy pods will be subject to the PDB for eviction.  Additional policies may be added in the future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized policy in this field.")
  public String getUnhealthyPodEvictionPolicy() {
    return unhealthyPodEvictionPolicy;
  }

  public void setUnhealthyPodEvictionPolicy(@jakarta.annotation.Nullable String unhealthyPodEvictionPolicy) {
    this.unhealthyPodEvictionPolicy = unhealthyPodEvictionPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDisruptionBudgetSpec v1PodDisruptionBudgetSpec = (V1PodDisruptionBudgetSpec) o;
    return Objects.equals(this.maxUnavailable, v1PodDisruptionBudgetSpec.maxUnavailable) &&
        Objects.equals(this.minAvailable, v1PodDisruptionBudgetSpec.minAvailable) &&
        Objects.equals(this.selector, v1PodDisruptionBudgetSpec.selector) &&
        Objects.equals(this.unhealthyPodEvictionPolicy, v1PodDisruptionBudgetSpec.unhealthyPodEvictionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnavailable, minAvailable, selector, unhealthyPodEvictionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDisruptionBudgetSpec {\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    unhealthyPodEvictionPolicy: ").append(toIndentedString(unhealthyPodEvictionPolicy)).append("\n");
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
    openapiFields.add("maxUnavailable");
    openapiFields.add("minAvailable");
    openapiFields.add("selector");
    openapiFields.add("unhealthyPodEvictionPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodDisruptionBudgetSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodDisruptionBudgetSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodDisruptionBudgetSpec is not found in the empty JSON string", V1PodDisruptionBudgetSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodDisruptionBudgetSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodDisruptionBudgetSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maxUnavailable") != null && !jsonObj.get("maxUnavailable").isJsonNull()) && !jsonObj.get("maxUnavailable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxUnavailable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxUnavailable").toString()));
      }
      if ((jsonObj.get("minAvailable") != null && !jsonObj.get("minAvailable").isJsonNull()) && !jsonObj.get("minAvailable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minAvailable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minAvailable").toString()));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("selector"));
      }
      if ((jsonObj.get("unhealthyPodEvictionPolicy") != null && !jsonObj.get("unhealthyPodEvictionPolicy").isJsonNull()) && !jsonObj.get("unhealthyPodEvictionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unhealthyPodEvictionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unhealthyPodEvictionPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodDisruptionBudgetSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodDisruptionBudgetSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodDisruptionBudgetSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodDisruptionBudgetSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodDisruptionBudgetSpec>() {
           @Override
           public void write(JsonWriter out, V1PodDisruptionBudgetSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodDisruptionBudgetSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodDisruptionBudgetSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodDisruptionBudgetSpec
   * @throws IOException if the JSON string is invalid with respect to V1PodDisruptionBudgetSpec
   */
  public static V1PodDisruptionBudgetSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodDisruptionBudgetSpec.class);
  }

  /**
   * Convert an instance of V1PodDisruptionBudgetSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
