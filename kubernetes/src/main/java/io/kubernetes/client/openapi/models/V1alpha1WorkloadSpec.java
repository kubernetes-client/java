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
import io.kubernetes.client.openapi.models.V1alpha1PodGroup;
import io.kubernetes.client.openapi.models.V1alpha1TypedLocalObjectReference;
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
 * WorkloadSpec defines the desired state of a Workload.
 */
@ApiModel(description = "WorkloadSpec defines the desired state of a Workload.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha1WorkloadSpec {
  public static final String SERIALIZED_NAME_CONTROLLER_REF = "controllerRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_REF)
  @jakarta.annotation.Nullable
  private V1alpha1TypedLocalObjectReference controllerRef;

  public static final String SERIALIZED_NAME_POD_GROUPS = "podGroups";
  @SerializedName(SERIALIZED_NAME_POD_GROUPS)
  @jakarta.annotation.Nonnull
  private List<V1alpha1PodGroup> podGroups = new ArrayList<>();

  public V1alpha1WorkloadSpec() {
  }

  public V1alpha1WorkloadSpec controllerRef(@jakarta.annotation.Nullable V1alpha1TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }

  /**
   * Get controllerRef
   * @return controllerRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1TypedLocalObjectReference getControllerRef() {
    return controllerRef;
  }

  public void setControllerRef(@jakarta.annotation.Nullable V1alpha1TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
  }


  public V1alpha1WorkloadSpec podGroups(@jakarta.annotation.Nonnull List<V1alpha1PodGroup> podGroups) {
    this.podGroups = podGroups;
    return this;
  }

  public V1alpha1WorkloadSpec addPodGroupsItem(V1alpha1PodGroup podGroupsItem) {
    if (this.podGroups == null) {
      this.podGroups = new ArrayList<>();
    }
    this.podGroups.add(podGroupsItem);
    return this;
  }

  /**
   * PodGroups is the list of pod groups that make up the Workload. The maximum number of pod groups is 8. This field is immutable.
   * @return podGroups
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PodGroups is the list of pod groups that make up the Workload. The maximum number of pod groups is 8. This field is immutable.")
  public List<V1alpha1PodGroup> getPodGroups() {
    return podGroups;
  }

  public void setPodGroups(@jakarta.annotation.Nonnull List<V1alpha1PodGroup> podGroups) {
    this.podGroups = podGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1WorkloadSpec v1alpha1WorkloadSpec = (V1alpha1WorkloadSpec) o;
    return Objects.equals(this.controllerRef, v1alpha1WorkloadSpec.controllerRef) &&
        Objects.equals(this.podGroups, v1alpha1WorkloadSpec.podGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, podGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1WorkloadSpec {\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    podGroups: ").append(toIndentedString(podGroups)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("controllerRef", "podGroups"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("podGroups"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha1WorkloadSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha1WorkloadSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha1WorkloadSpec is not found in the empty JSON string", V1alpha1WorkloadSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1WorkloadSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha1WorkloadSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1WorkloadSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `controllerRef`
      if (jsonObj.get("controllerRef") != null && !jsonObj.get("controllerRef").isJsonNull()) {
        V1alpha1TypedLocalObjectReference.validateJsonElement(jsonObj.get("controllerRef"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("podGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `podGroups` to be an array in the JSON string but got `%s`", jsonObj.get("podGroups").toString()));
      }

      JsonArray jsonArraypodGroups = jsonObj.getAsJsonArray("podGroups");
      // validate the required field `podGroups` (array)
      for (int i = 0; i < jsonArraypodGroups.size(); i++) {
        V1alpha1PodGroup.validateJsonElement(jsonArraypodGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1WorkloadSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1WorkloadSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1WorkloadSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1WorkloadSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1WorkloadSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1WorkloadSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1WorkloadSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha1WorkloadSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha1WorkloadSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha1WorkloadSpec
   */
  public static V1alpha1WorkloadSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1WorkloadSpec.class);
  }

  /**
   * Convert an instance of V1alpha1WorkloadSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
