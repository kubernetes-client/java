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
import io.kubernetes.client.openapi.models.V1alpha3CompositePodGroupTemplate;
import io.kubernetes.client.openapi.models.V1alpha3PodGroupTemplate;
import io.kubernetes.client.openapi.models.V1alpha3TypedLocalObjectReference;
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
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3WorkloadSpec {
  public static final String SERIALIZED_NAME_COMPOSITE_POD_GROUP_TEMPLATES = "compositePodGroupTemplates";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_POD_GROUP_TEMPLATES)
  @jakarta.annotation.Nullable
  private List<V1alpha3CompositePodGroupTemplate> compositePodGroupTemplates = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTROLLER_REF = "controllerRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_REF)
  @jakarta.annotation.Nullable
  private V1alpha3TypedLocalObjectReference controllerRef;

  public static final String SERIALIZED_NAME_POD_GROUP_TEMPLATES = "podGroupTemplates";
  @SerializedName(SERIALIZED_NAME_POD_GROUP_TEMPLATES)
  @jakarta.annotation.Nullable
  private List<V1alpha3PodGroupTemplate> podGroupTemplates = new ArrayList<>();

  public V1alpha3WorkloadSpec() {
  }

  public V1alpha3WorkloadSpec compositePodGroupTemplates(@jakarta.annotation.Nullable List<V1alpha3CompositePodGroupTemplate> compositePodGroupTemplates) {
    this.compositePodGroupTemplates = compositePodGroupTemplates;
    return this;
  }

  public V1alpha3WorkloadSpec addCompositePodGroupTemplatesItem(V1alpha3CompositePodGroupTemplate compositePodGroupTemplatesItem) {
    if (this.compositePodGroupTemplates == null) {
      this.compositePodGroupTemplates = new ArrayList<>();
    }
    this.compositePodGroupTemplates.add(compositePodGroupTemplatesItem);
    return this;
  }

  /**
   * compositePodGroupTemplates is the list of CompositePodGroup templates that make up the Workload. The maximum number of templates is 8. This field is immutable. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set.  This field is used only when the CompositePodGroup feature gate is enabled.
   * @return compositePodGroupTemplates
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "compositePodGroupTemplates is the list of CompositePodGroup templates that make up the Workload. The maximum number of templates is 8. This field is immutable. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set.  This field is used only when the CompositePodGroup feature gate is enabled.")
  public List<V1alpha3CompositePodGroupTemplate> getCompositePodGroupTemplates() {
    return compositePodGroupTemplates;
  }

  public void setCompositePodGroupTemplates(@jakarta.annotation.Nullable List<V1alpha3CompositePodGroupTemplate> compositePodGroupTemplates) {
    this.compositePodGroupTemplates = compositePodGroupTemplates;
  }


  public V1alpha3WorkloadSpec controllerRef(@jakarta.annotation.Nullable V1alpha3TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
    return this;
  }

  /**
   * Get controllerRef
   * @return controllerRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3TypedLocalObjectReference getControllerRef() {
    return controllerRef;
  }

  public void setControllerRef(@jakarta.annotation.Nullable V1alpha3TypedLocalObjectReference controllerRef) {
    this.controllerRef = controllerRef;
  }


  public V1alpha3WorkloadSpec podGroupTemplates(@jakarta.annotation.Nullable List<V1alpha3PodGroupTemplate> podGroupTemplates) {
    this.podGroupTemplates = podGroupTemplates;
    return this;
  }

  public V1alpha3WorkloadSpec addPodGroupTemplatesItem(V1alpha3PodGroupTemplate podGroupTemplatesItem) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    this.podGroupTemplates.add(podGroupTemplatesItem);
    return this;
  }

  /**
   * podGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. Templates cannot be added or removed after the workload is created. Existing templates may still be updated where their individual fields allow it. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set.
   * @return podGroupTemplates
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podGroupTemplates is the list of templates that make up the Workload. The maximum number of templates is 8. Templates cannot be added or removed after the workload is created. Existing templates may still be updated where their individual fields allow it. Exactly one of CompositePodGroupTemplates and PodGroupTemplates must be set.")
  public List<V1alpha3PodGroupTemplate> getPodGroupTemplates() {
    return podGroupTemplates;
  }

  public void setPodGroupTemplates(@jakarta.annotation.Nullable List<V1alpha3PodGroupTemplate> podGroupTemplates) {
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
    V1alpha3WorkloadSpec v1alpha3WorkloadSpec = (V1alpha3WorkloadSpec) o;
    return Objects.equals(this.compositePodGroupTemplates, v1alpha3WorkloadSpec.compositePodGroupTemplates) &&
        Objects.equals(this.controllerRef, v1alpha3WorkloadSpec.controllerRef) &&
        Objects.equals(this.podGroupTemplates, v1alpha3WorkloadSpec.podGroupTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositePodGroupTemplates, controllerRef, podGroupTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3WorkloadSpec {\n");
    sb.append("    compositePodGroupTemplates: ").append(toIndentedString(compositePodGroupTemplates)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("compositePodGroupTemplates", "controllerRef", "podGroupTemplates"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3WorkloadSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3WorkloadSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3WorkloadSpec is not found in the empty JSON string", V1alpha3WorkloadSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3WorkloadSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3WorkloadSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("compositePodGroupTemplates") != null && !jsonObj.get("compositePodGroupTemplates").isJsonNull()) {
        JsonArray jsonArraycompositePodGroupTemplates = jsonObj.getAsJsonArray("compositePodGroupTemplates");
        if (jsonArraycompositePodGroupTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compositePodGroupTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `compositePodGroupTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("compositePodGroupTemplates").toString()));
          }

          // validate the optional field `compositePodGroupTemplates` (array)
          for (int i = 0; i < jsonArraycompositePodGroupTemplates.size(); i++) {
            V1alpha3CompositePodGroupTemplate.validateJsonElement(jsonArraycompositePodGroupTemplates.get(i));
          };
        }
      }
      // validate the optional field `controllerRef`
      if (jsonObj.get("controllerRef") != null && !jsonObj.get("controllerRef").isJsonNull()) {
        V1alpha3TypedLocalObjectReference.validateJsonElement(jsonObj.get("controllerRef"));
      }
      if (jsonObj.get("podGroupTemplates") != null && !jsonObj.get("podGroupTemplates").isJsonNull()) {
        JsonArray jsonArraypodGroupTemplates = jsonObj.getAsJsonArray("podGroupTemplates");
        if (jsonArraypodGroupTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("podGroupTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `podGroupTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("podGroupTemplates").toString()));
          }

          // validate the optional field `podGroupTemplates` (array)
          for (int i = 0; i < jsonArraypodGroupTemplates.size(); i++) {
            V1alpha3PodGroupTemplate.validateJsonElement(jsonArraypodGroupTemplates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3WorkloadSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3WorkloadSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3WorkloadSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3WorkloadSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3WorkloadSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha3WorkloadSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3WorkloadSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3WorkloadSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3WorkloadSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha3WorkloadSpec
   */
  public static V1alpha3WorkloadSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3WorkloadSpec.class);
  }

  /**
   * Convert an instance of V1alpha3WorkloadSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
