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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1FieldSelectorRequirement;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * FieldSelectorAttributes indicates a field limited access. Webhook authors are encouraged to * ensure rawSelector and requirements are not both set * consider the requirements field if set * not try to parse or consider the rawSelector field if set. This is to avoid another CVE-2022-2880 (i.e. getting different systems to agree on how exactly to parse a query is not something we want), see https://www.oxeye.io/resources/golang-parameter-smuggling-attack for more details. For the *SubjectAccessReview endpoints of the kube-apiserver: * If rawSelector is empty and requirements are empty, the request is not limited. * If rawSelector is present and requirements are empty, the rawSelector will be parsed and limited if the parsing succeeds. * If rawSelector is empty and requirements are present, the requirements should be honored * If rawSelector is present and requirements are present, the request is invalid.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1FieldSelectorAttributes {
  public static final String SERIALIZED_NAME_RAW_SELECTOR = "rawSelector";
  @SerializedName(SERIALIZED_NAME_RAW_SELECTOR)
  private String rawSelector;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private List<V1FieldSelectorRequirement> requirements = new ArrayList<>();

  public V1FieldSelectorAttributes() {
  }

  public V1FieldSelectorAttributes rawSelector(String rawSelector) {
    this.rawSelector = rawSelector;
    return this;
  }

   /**
   * rawSelector is the serialization of a field selector that would be included in a query parameter. Webhook implementations are encouraged to ignore rawSelector. The kube-apiserver&#39;s *SubjectAccessReview will parse the rawSelector as long as the requirements are not present.
   * @return rawSelector
  **/
  @jakarta.annotation.Nullable
  public String getRawSelector() {
    return rawSelector;
  }

  public void setRawSelector(String rawSelector) {
    this.rawSelector = rawSelector;
  }


  public V1FieldSelectorAttributes requirements(List<V1FieldSelectorRequirement> requirements) {
    this.requirements = requirements;
    return this;
  }

  public V1FieldSelectorAttributes addRequirementsItem(V1FieldSelectorRequirement requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * requirements is the parsed interpretation of a field selector. All requirements must be met for a resource instance to match the selector. Webhook implementations should handle requirements, but how to handle them is up to the webhook. Since requirements can only limit the request, it is safe to authorize as unlimited request if the requirements are not understood.
   * @return requirements
  **/
  @jakarta.annotation.Nullable
  public List<V1FieldSelectorRequirement> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<V1FieldSelectorRequirement> requirements) {
    this.requirements = requirements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FieldSelectorAttributes v1FieldSelectorAttributes = (V1FieldSelectorAttributes) o;
    return Objects.equals(this.rawSelector, v1FieldSelectorAttributes.rawSelector) &&
        Objects.equals(this.requirements, v1FieldSelectorAttributes.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawSelector, requirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FieldSelectorAttributes {\n");
    sb.append("    rawSelector: ").append(toIndentedString(rawSelector)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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
    openapiFields.add("rawSelector");
    openapiFields.add("requirements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1FieldSelectorAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1FieldSelectorAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FieldSelectorAttributes is not found in the empty JSON string", V1FieldSelectorAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1FieldSelectorAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FieldSelectorAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rawSelector") != null && !jsonObj.get("rawSelector").isJsonNull()) && !jsonObj.get("rawSelector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawSelector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawSelector").toString()));
      }
      if (jsonObj.get("requirements") != null && !jsonObj.get("requirements").isJsonNull()) {
        JsonArray jsonArrayrequirements = jsonObj.getAsJsonArray("requirements");
        if (jsonArrayrequirements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requirements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requirements` to be an array in the JSON string but got `%s`", jsonObj.get("requirements").toString()));
          }

          // validate the optional field `requirements` (array)
          for (int i = 0; i < jsonArrayrequirements.size(); i++) {
            V1FieldSelectorRequirement.validateJsonElement(jsonArrayrequirements.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FieldSelectorAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FieldSelectorAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FieldSelectorAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FieldSelectorAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FieldSelectorAttributes>() {
           @Override
           public void write(JsonWriter out, V1FieldSelectorAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FieldSelectorAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1FieldSelectorAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1FieldSelectorAttributes
  * @throws IOException if the JSON string is invalid with respect to V1FieldSelectorAttributes
  */
  public static V1FieldSelectorAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FieldSelectorAttributes.class);
  }

 /**
  * Convert an instance of V1FieldSelectorAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
