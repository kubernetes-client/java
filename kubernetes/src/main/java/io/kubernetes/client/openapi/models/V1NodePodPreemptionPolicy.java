/*
Copyright 2026 The Kubernetes Authors.
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
 * NodePodPreemptionPolicy defines the node-level policies governing preemption for pods on this node.
 */
@ApiModel(description = "NodePodPreemptionPolicy defines the node-level policies governing preemption for pods on this node.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1NodePodPreemptionPolicy {
  public static final String SERIALIZED_NAME_DISABLE_RESIZE_PREEMPTION = "disableResizePreemption";
  @SerializedName(SERIALIZED_NAME_DISABLE_RESIZE_PREEMPTION)
  @jakarta.annotation.Nullable
  private List<String> disableResizePreemption = new ArrayList<>();

  public V1NodePodPreemptionPolicy() {
  }

  public V1NodePodPreemptionPolicy disableResizePreemption(@jakarta.annotation.Nullable List<String> disableResizePreemption) {
    this.disableResizePreemption = disableResizePreemption;
    return this;
  }

  public V1NodePodPreemptionPolicy addDisableResizePreemptionItem(String disableResizePreemptionItem) {
    if (this.disableResizePreemption == null) {
      this.disableResizePreemption = new ArrayList<>();
    }
    this.disableResizePreemption.add(disableResizePreemptionItem);
    return this;
  }

  /**
   * DisableResizePreemption lists the owners (e.g., autoscalers, operators, administrators) that have requested to disable scheduler and Kubelet preemption for in-place pod resize on this node. If this list is non-empty, resize-induced preemption is disabled on this node. This is an alpha field and requires enabling the InPlacePodVerticalScalingSchedulerPreemption feature gate.
   * @return disableResizePreemption
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "DisableResizePreemption lists the owners (e.g., autoscalers, operators, administrators) that have requested to disable scheduler and Kubelet preemption for in-place pod resize on this node. If this list is non-empty, resize-induced preemption is disabled on this node. This is an alpha field and requires enabling the InPlacePodVerticalScalingSchedulerPreemption feature gate.")
  public List<String> getDisableResizePreemption() {
    return disableResizePreemption;
  }

  public void setDisableResizePreemption(@jakarta.annotation.Nullable List<String> disableResizePreemption) {
    this.disableResizePreemption = disableResizePreemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodePodPreemptionPolicy v1NodePodPreemptionPolicy = (V1NodePodPreemptionPolicy) o;
    return Objects.equals(this.disableResizePreemption, v1NodePodPreemptionPolicy.disableResizePreemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableResizePreemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodePodPreemptionPolicy {\n");
    sb.append("    disableResizePreemption: ").append(toIndentedString(disableResizePreemption)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("disableResizePreemption"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NodePodPreemptionPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodePodPreemptionPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1NodePodPreemptionPolicy is not found in the empty JSON string", V1NodePodPreemptionPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodePodPreemptionPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1NodePodPreemptionPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("disableResizePreemption") != null && !jsonObj.get("disableResizePreemption").isJsonNull() && !jsonObj.get("disableResizePreemption").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `disableResizePreemption` to be an array in the JSON string but got `%s`", jsonObj.get("disableResizePreemption").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodePodPreemptionPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodePodPreemptionPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodePodPreemptionPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodePodPreemptionPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodePodPreemptionPolicy>() {
           @Override
           public void write(JsonWriter out, V1NodePodPreemptionPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodePodPreemptionPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NodePodPreemptionPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NodePodPreemptionPolicy
   * @throws IOException if the JSON string is invalid with respect to V1NodePodPreemptionPolicy
   */
  public static V1NodePodPreemptionPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodePodPreemptionPolicy.class);
  }

  /**
   * Convert an instance of V1NodePodPreemptionPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
