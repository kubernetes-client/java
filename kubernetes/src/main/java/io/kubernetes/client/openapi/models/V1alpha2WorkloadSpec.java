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
import io.kubernetes.client.openapi.models.V1alpha2PodGroupTemplate;
import io.kubernetes.client.openapi.models.V1alpha2TypedLocalObjectReference;
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
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha2WorkloadSpec {
  public static final String SERIALIZED_NAME_CONTROLLER_REF = "controllerRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_REF)
  @jakarta.annotation.Nullable
  private V1alpha2TypedLocalObjectReference controllerRef;

  public static final String SERIALIZED_NAME_POD_GROUP_TEMPLATES = "podGroupTemplates";
  @SerializedName(SERIALIZED_NAME_POD_GROUP_TEMPLATES)
  @jakarta.annotation.Nonnull
  private List<V1alpha2PodGroupTemplate> podGroupTemplates = new ArrayList<>();

  public V1alpha2WorkloadSpec() {
  }

  public V1alpha2WorkloadSpec controllerRef(@jakarta.annotation.Nullable V1alpha2TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }

  /**
   * Get controllerRef
   * @return controllerRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2TypedLocalObjectReference getControllerRef() {
    return controllerRef;
  }

  public void setControllerRef(@jakarta.annotation.Nullable V1alpha2TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
  }


  public V1alpha2WorkloadSpec podGroupTemplates(@jakarta.annotation.Nonnull List<V1alpha2PodGroupTemplate> podGroupTemplates) {
    this.podGroupTemplates = podGroupTemplates;
    return this;
  }

  public V1alpha2WorkloadSpec addPodGroupTemplatesItem(V1alpha2PodGroupTemplate podGroupTemplatesItem) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    this.podGroupTemplates.add(podGroupTemplatesItem);
    return this;
  }

  /**
   * PodGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. This field is immutable.
   * @return podGroupTemplates
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "PodGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. This field is immutable.")
  public List<V1alpha2PodGroupTemplate> getPodGroupTemplates() {
    return podGroupTemplates;
  }

  public void setPodGroupTemplates(@jakarta.annotation.Nonnull List<V1alpha2PodGroupTemplate> podGroupTemplates) {
    this.podGroupTemplates = podGroupTemplates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2WorkloadSpec v1alpha2WorkloadSpec = (V1alpha2WorkloadSpec) o;
    return Objects.equals(this.controllerRef, v1alpha2WorkloadSpec.controllerRef) &&
        Objects.equals(this.podGroupTemplates, v1alpha2WorkloadSpec.podGroupTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerRef, podGroupTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2WorkloadSpec {\n");
    sb.append("    controllerRef: ").append(toIndentedString(controllerRef)).append("\n");
    sb.append("    podGroupTemplates: ").append(toIndentedString(podGroupTemplates)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("controllerRef", "podGroupTemplates"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("podGroupTemplates"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha2WorkloadSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2WorkloadSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha2WorkloadSpec is not found in the empty JSON string", V1alpha2WorkloadSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2WorkloadSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha2WorkloadSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2WorkloadSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `controllerRef`
      if (jsonObj.get("controllerRef") != null && !jsonObj.get("controllerRef").isJsonNull()) {
        V1alpha2TypedLocalObjectReference.validateJsonElement(jsonObj.get("controllerRef"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("podGroupTemplates").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `podGroupTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("podGroupTemplates").toString()));
      }

      JsonArray jsonArraypodGroupTemplates = jsonObj.getAsJsonArray("podGroupTemplates");
      // validate the required field `podGroupTemplates` (array)
      for (int i = 0; i < jsonArraypodGroupTemplates.size(); i++) {
        V1alpha2PodGroupTemplate.validateJsonElement(jsonArraypodGroupTemplates.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2WorkloadSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2WorkloadSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2WorkloadSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2WorkloadSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2WorkloadSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2WorkloadSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2WorkloadSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha2WorkloadSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha2WorkloadSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha2WorkloadSpec
   */
  public static V1alpha2WorkloadSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2WorkloadSpec.class);
  }

  /**
   * Convert an instance of V1alpha2WorkloadSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
