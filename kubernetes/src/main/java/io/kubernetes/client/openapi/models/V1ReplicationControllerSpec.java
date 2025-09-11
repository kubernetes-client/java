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
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * ReplicationControllerSpec is the specification of a replication controller.
 */
@ApiModel(description = "ReplicationControllerSpec is the specification of a replication controller.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ReplicationControllerSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  @jakarta.annotation.Nullable
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer replicas;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nullable
  private Map<String, String> selector = new HashMap<>();

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @jakarta.annotation.Nullable
  private V1PodTemplateSpec template;

  public V1ReplicationControllerSpec() {
  }

  public V1ReplicationControllerSpec minReadySeconds(@jakarta.annotation.Nullable Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(@jakarta.annotation.Nullable Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }


  public V1ReplicationControllerSpec replicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   * @return replicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
  }


  public V1ReplicationControllerSpec selector(@jakarta.annotation.Nullable Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public V1ReplicationControllerSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

  /**
   * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nullable Map<String, String> selector) {
    this.selector = selector;
  }


  public V1ReplicationControllerSpec template(@jakarta.annotation.Nullable V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(@jakarta.annotation.Nullable V1PodTemplateSpec template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicationControllerSpec v1ReplicationControllerSpec = (V1ReplicationControllerSpec) o;
    return Objects.equals(this.minReadySeconds, v1ReplicationControllerSpec.minReadySeconds) &&
        Objects.equals(this.replicas, v1ReplicationControllerSpec.replicas) &&
        Objects.equals(this.selector, v1ReplicationControllerSpec.selector) &&
        Objects.equals(this.template, v1ReplicationControllerSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, replicas, selector, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicationControllerSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("replicas");
    openapiFields.add("selector");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ReplicationControllerSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ReplicationControllerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ReplicationControllerSpec is not found in the empty JSON string", V1ReplicationControllerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ReplicationControllerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ReplicationControllerSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        V1PodTemplateSpec.validateJsonElement(jsonObj.get("template"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ReplicationControllerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ReplicationControllerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ReplicationControllerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ReplicationControllerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ReplicationControllerSpec>() {
           @Override
           public void write(JsonWriter out, V1ReplicationControllerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ReplicationControllerSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ReplicationControllerSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ReplicationControllerSpec
   * @throws IOException if the JSON string is invalid with respect to V1ReplicationControllerSpec
   */
  public static V1ReplicationControllerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ReplicationControllerSpec.class);
  }

  /**
   * Convert an instance of V1ReplicationControllerSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
