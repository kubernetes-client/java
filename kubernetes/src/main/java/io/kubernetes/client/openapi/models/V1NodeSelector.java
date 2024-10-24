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
import io.kubernetes.client.openapi.models.V1NodeSelectorTerm;
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
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1NodeSelector {
  public static final String SERIALIZED_NAME_NODE_SELECTOR_TERMS = "nodeSelectorTerms";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR_TERMS)
  private List<V1NodeSelectorTerm> nodeSelectorTerms = new ArrayList<>();

  public V1NodeSelector() {
  }

  public V1NodeSelector nodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
    return this;
  }

  public V1NodeSelector addNodeSelectorTermsItem(V1NodeSelectorTerm nodeSelectorTermsItem) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms = new ArrayList<>();
    }
    this.nodeSelectorTerms.add(nodeSelectorTermsItem);
    return this;
  }

   /**
   * Required. A list of node selector terms. The terms are ORed.
   * @return nodeSelectorTerms
  **/
  @jakarta.annotation.Nonnull
  public List<V1NodeSelectorTerm> getNodeSelectorTerms() {
    return nodeSelectorTerms;
  }

  public void setNodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSelector v1NodeSelector = (V1NodeSelector) o;
    return Objects.equals(this.nodeSelectorTerms, v1NodeSelector.nodeSelectorTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelectorTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSelector {\n");
    sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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
    openapiFields.add("nodeSelectorTerms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nodeSelectorTerms");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1NodeSelector
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeSelector is not found in the empty JSON string", V1NodeSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NodeSelector.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("nodeSelectorTerms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeSelectorTerms` to be an array in the JSON string but got `%s`", jsonObj.get("nodeSelectorTerms").toString()));
      }

      JsonArray jsonArraynodeSelectorTerms = jsonObj.getAsJsonArray("nodeSelectorTerms");
      // validate the required field `nodeSelectorTerms` (array)
      for (int i = 0; i < jsonArraynodeSelectorTerms.size(); i++) {
        V1NodeSelectorTerm.validateJsonElement(jsonArraynodeSelectorTerms.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeSelector>() {
           @Override
           public void write(JsonWriter out, V1NodeSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeSelector
  * @throws IOException if the JSON string is invalid with respect to V1NodeSelector
  */
  public static V1NodeSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeSelector.class);
  }

 /**
  * Convert an instance of V1NodeSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
