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
import io.kubernetes.client.openapi.models.V1LabelSelector;
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
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1PodAffinityTerm {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_MATCH_LABEL_KEYS = "matchLabelKeys";
  @SerializedName(SERIALIZED_NAME_MATCH_LABEL_KEYS)
  private List<String> matchLabelKeys;

  public static final String SERIALIZED_NAME_MISMATCH_LABEL_KEYS = "mismatchLabelKeys";
  @SerializedName(SERIALIZED_NAME_MISMATCH_LABEL_KEYS)
  private List<String> mismatchLabelKeys;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1LabelSelector namespaceSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public V1PodAffinityTerm() {
  }

  public V1PodAffinityTerm labelSelector(V1LabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1PodAffinityTerm matchLabelKeys(List<String> matchLabelKeys) {

    this.matchLabelKeys = matchLabelKeys;
    return this;
  }

  public V1PodAffinityTerm addMatchLabelKeysItem(String matchLabelKeysItem) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList<>();
    }
    this.matchLabelKeys.add(matchLabelKeysItem);
    return this;
  }

   /**
   * MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with &#x60;labelSelector&#x60; as &#x60;key in (value)&#x60; to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
   * @return matchLabelKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getMatchLabelKeys() {
    return matchLabelKeys;
  }


  public void setMatchLabelKeys(List<String> matchLabelKeys) {
    this.matchLabelKeys = matchLabelKeys;
  }


  public V1PodAffinityTerm mismatchLabelKeys(List<String> mismatchLabelKeys) {

    this.mismatchLabelKeys = mismatchLabelKeys;
    return this;
  }

  public V1PodAffinityTerm addMismatchLabelKeysItem(String mismatchLabelKeysItem) {
    if (this.mismatchLabelKeys == null) {
      this.mismatchLabelKeys = new ArrayList<>();
    }
    this.mismatchLabelKeys.add(mismatchLabelKeysItem);
    return this;
  }

   /**
   * MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with &#x60;labelSelector&#x60; as &#x60;key notin (value)&#x60; to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
   * @return mismatchLabelKeys
  **/
  @jakarta.annotation.Nullable
  public List<String> getMismatchLabelKeys() {
    return mismatchLabelKeys;
  }


  public void setMismatchLabelKeys(List<String> mismatchLabelKeys) {
    this.mismatchLabelKeys = mismatchLabelKeys;
  }


  public V1PodAffinityTerm namespaceSelector(V1LabelSelector namespaceSelector) {

    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1PodAffinityTerm namespaces(List<String> namespaces) {

    this.namespaces = namespaces;
    return this;
  }

  public V1PodAffinityTerm addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \&quot;this pod&#39;s namespace\&quot;.
   * @return namespaces
  **/
  @jakarta.annotation.Nullable
  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public V1PodAffinityTerm topologyKey(String topologyKey) {

    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @jakarta.annotation.Nonnull
  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodAffinityTerm v1PodAffinityTerm = (V1PodAffinityTerm) o;
    return Objects.equals(this.labelSelector, v1PodAffinityTerm.labelSelector) &&
        Objects.equals(this.matchLabelKeys, v1PodAffinityTerm.matchLabelKeys) &&
        Objects.equals(this.mismatchLabelKeys, v1PodAffinityTerm.mismatchLabelKeys) &&
        Objects.equals(this.namespaceSelector, v1PodAffinityTerm.namespaceSelector) &&
        Objects.equals(this.namespaces, v1PodAffinityTerm.namespaces) &&
        Objects.equals(this.topologyKey, v1PodAffinityTerm.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, matchLabelKeys, mismatchLabelKeys, namespaceSelector, namespaces, topologyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodAffinityTerm {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    matchLabelKeys: ").append(toIndentedString(matchLabelKeys)).append("\n");
    sb.append("    mismatchLabelKeys: ").append(toIndentedString(mismatchLabelKeys)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
    openapiFields.add("labelSelector");
    openapiFields.add("matchLabelKeys");
    openapiFields.add("mismatchLabelKeys");
    openapiFields.add("namespaceSelector");
    openapiFields.add("namespaces");
    openapiFields.add("topologyKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("topologyKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PodAffinityTerm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PodAffinityTerm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodAffinityTerm is not found in the empty JSON string", V1PodAffinityTerm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PodAffinityTerm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodAffinityTerm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1PodAffinityTerm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `labelSelector`
      if (jsonObj.get("labelSelector") != null && !jsonObj.get("labelSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("labelSelector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("matchLabelKeys") != null && !jsonObj.get("matchLabelKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchLabelKeys` to be an array in the JSON string but got `%s`", jsonObj.get("matchLabelKeys").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mismatchLabelKeys") != null && !jsonObj.get("mismatchLabelKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mismatchLabelKeys` to be an array in the JSON string but got `%s`", jsonObj.get("mismatchLabelKeys").toString()));
      }
      // validate the optional field `namespaceSelector`
      if (jsonObj.get("namespaceSelector") != null && !jsonObj.get("namespaceSelector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("namespaceSelector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namespaces") != null && !jsonObj.get("namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("namespaces").toString()));
      }
      if (!jsonObj.get("topologyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topologyKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodAffinityTerm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodAffinityTerm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodAffinityTerm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodAffinityTerm.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodAffinityTerm>() {
           @Override
           public void write(JsonWriter out, V1PodAffinityTerm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodAffinityTerm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodAffinityTerm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodAffinityTerm
  * @throws IOException if the JSON string is invalid with respect to V1PodAffinityTerm
  */
  public static V1PodAffinityTerm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodAffinityTerm.class);
  }

 /**
  * Convert an instance of V1PodAffinityTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
