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
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1PodFailurePolicyOnExitCodesRequirement {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = new ArrayList<>();

  public V1PodFailurePolicyOnExitCodesRequirement() {
  }

  public V1PodFailurePolicyOnExitCodesRequirement containerName(String containerName) {

    this.containerName = containerName;
    return this;
  }

   /**
   * Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.
   * @return containerName
  **/
  @jakarta.annotation.Nullable
  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public V1PodFailurePolicyOnExitCodesRequirement operator(String operator) {

    this.operator = operator;
    return this;
  }

   /**
   * Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are:  - In: the requirement is satisfied if at least one container exit code   (might be multiple if there are multiple containers not restricted   by the &#39;containerName&#39; field) is in the set of specified values. - NotIn: the requirement is satisfied if at least one container exit code   (might be multiple if there are multiple containers not restricted   by the &#39;containerName&#39; field) is not in the set of specified values. Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.
   * @return operator
  **/
  @jakarta.annotation.Nonnull
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public V1PodFailurePolicyOnExitCodesRequirement values(List<Integer> values) {

    this.values = values;
    return this;
  }

  public V1PodFailurePolicyOnExitCodesRequirement addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value &#39;0&#39; cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.
   * @return values
  **/
  @jakarta.annotation.Nonnull
  public List<Integer> getValues() {
    return values;
  }


  public void setValues(List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyOnExitCodesRequirement v1PodFailurePolicyOnExitCodesRequirement = (V1PodFailurePolicyOnExitCodesRequirement) o;
    return Objects.equals(this.containerName, v1PodFailurePolicyOnExitCodesRequirement.containerName) &&
        Objects.equals(this.operator, v1PodFailurePolicyOnExitCodesRequirement.operator) &&
        Objects.equals(this.values, v1PodFailurePolicyOnExitCodesRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyOnExitCodesRequirement {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("containerName");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodFailurePolicyOnExitCodesRequirement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodFailurePolicyOnExitCodesRequirement.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodFailurePolicyOnExitCodesRequirement is not found in the empty JSON string", V1PodFailurePolicyOnExitCodesRequirement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodFailurePolicyOnExitCodesRequirement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodFailurePolicyOnExitCodesRequirement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodFailurePolicyOnExitCodesRequirement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodFailurePolicyOnExitCodesRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodFailurePolicyOnExitCodesRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodFailurePolicyOnExitCodesRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodFailurePolicyOnExitCodesRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodFailurePolicyOnExitCodesRequirement>() {
           @Override
           public void write(JsonWriter out, V1PodFailurePolicyOnExitCodesRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodFailurePolicyOnExitCodesRequirement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodFailurePolicyOnExitCodesRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodFailurePolicyOnExitCodesRequirement
  * @throws IOException if the JSON string is invalid with respect to V1PodFailurePolicyOnExitCodesRequirement
  */
  public static V1PodFailurePolicyOnExitCodesRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodFailurePolicyOnExitCodesRequirement.class);
  }

 /**
  * Convert an instance of V1PodFailurePolicyOnExitCodesRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
