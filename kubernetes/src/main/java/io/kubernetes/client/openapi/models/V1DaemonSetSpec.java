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
import io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
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
 * DaemonSetSpec is the specification of a daemon set.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1DaemonSetSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";
  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";
  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  private V1DaemonSetUpdateStrategy updateStrategy;

  public V1DaemonSetSpec() {
  }

  public V1DaemonSetSpec minReadySeconds(Integer minReadySeconds) {

    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
   * @return minReadySeconds
  **/
  @jakarta.annotation.Nullable
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }


  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }


  public V1DaemonSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {

    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @jakarta.annotation.Nullable
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }


  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1DaemonSetSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nonnull
  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1DaemonSetSpec template(V1PodTemplateSpec template) {

    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @jakarta.annotation.Nonnull
  public V1PodTemplateSpec getTemplate() {
    return template;
  }


  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  public V1DaemonSetSpec updateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {

    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Get updateStrategy
   * @return updateStrategy
  **/
  @jakarta.annotation.Nullable
  public V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }


  public void setUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonSetSpec v1DaemonSetSpec = (V1DaemonSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1DaemonSetSpec.minReadySeconds) &&
        Objects.equals(this.revisionHistoryLimit, v1DaemonSetSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, v1DaemonSetSpec.selector) &&
        Objects.equals(this.template, v1DaemonSetSpec.template) &&
        Objects.equals(this.updateStrategy, v1DaemonSetSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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
    openapiFields.add("minReadySeconds");
    openapiFields.add("revisionHistoryLimit");
    openapiFields.add("selector");
    openapiFields.add("template");
    openapiFields.add("updateStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selector");
    openapiRequiredFields.add("template");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1DaemonSetSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1DaemonSetSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DaemonSetSpec is not found in the empty JSON string", V1DaemonSetSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1DaemonSetSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DaemonSetSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DaemonSetSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `selector`
      V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      // validate the required field `template`
      V1PodTemplateSpec.validateJsonObject(jsonObj.getAsJsonObject("template"));
      // validate the optional field `updateStrategy`
      if (jsonObj.get("updateStrategy") != null && !jsonObj.get("updateStrategy").isJsonNull()) {
        V1DaemonSetUpdateStrategy.validateJsonObject(jsonObj.getAsJsonObject("updateStrategy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DaemonSetSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DaemonSetSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DaemonSetSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DaemonSetSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DaemonSetSpec>() {
           @Override
           public void write(JsonWriter out, V1DaemonSetSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DaemonSetSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1DaemonSetSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1DaemonSetSpec
  * @throws IOException if the JSON string is invalid with respect to V1DaemonSetSpec
  */
  public static V1DaemonSetSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DaemonSetSpec.class);
  }

 /**
  * Convert an instance of V1DaemonSetSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
