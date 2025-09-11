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
import io.kubernetes.client.openapi.models.V1DeploymentStrategy;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@ApiModel(description = "DeploymentSpec is the specification of the desired behavior of the Deployment.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DeploymentSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  @jakarta.annotation.Nullable
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  @jakarta.annotation.Nullable
  private Boolean paused;

  public static final String SERIALIZED_NAME_PROGRESS_DEADLINE_SECONDS = "progressDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_PROGRESS_DEADLINE_SECONDS)
  @jakarta.annotation.Nullable
  private Integer progressDeadlineSeconds;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  @jakarta.annotation.Nullable
  private Integer replicas;

  public static final String SERIALIZED_NAME_REVISION_HISTORY_LIMIT = "revisionHistoryLimit";
  @SerializedName(SERIALIZED_NAME_REVISION_HISTORY_LIMIT)
  @jakarta.annotation.Nullable
  private Integer revisionHistoryLimit;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nonnull
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  @jakarta.annotation.Nullable
  private V1DeploymentStrategy strategy;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @jakarta.annotation.Nonnull
  private V1PodTemplateSpec template;

  public V1DeploymentSpec() {
  }

  public V1DeploymentSpec minReadySeconds(@jakarta.annotation.Nullable Integer minReadySeconds) {
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


  public V1DeploymentSpec paused(@jakarta.annotation.Nullable Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * Indicates that the deployment is paused.
   * @return paused
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the deployment is paused.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(@jakarta.annotation.Nullable Boolean paused) {
    this.paused = paused;
  }


  public V1DeploymentSpec progressDeadlineSeconds(@jakarta.annotation.Nullable Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

  /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   * @return progressDeadlineSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.")
  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }

  public void setProgressDeadlineSeconds(@jakarta.annotation.Nullable Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }


  public V1DeploymentSpec replicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
  }


  public V1DeploymentSpec revisionHistoryLimit(@jakarta.annotation.Nullable Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(@jakarta.annotation.Nullable Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1DeploymentSpec selector(@jakarta.annotation.Nonnull V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nonnull V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1DeploymentSpec strategy(@jakarta.annotation.Nullable V1DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(@jakarta.annotation.Nullable V1DeploymentStrategy strategy) {
    this.strategy = strategy;
  }


  public V1DeploymentSpec template(@jakarta.annotation.Nonnull V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(@jakarta.annotation.Nonnull V1PodTemplateSpec template) {
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
    V1DeploymentSpec v1DeploymentSpec = (V1DeploymentSpec) o;
    return Objects.equals(this.minReadySeconds, v1DeploymentSpec.minReadySeconds) &&
        Objects.equals(this.paused, v1DeploymentSpec.paused) &&
        Objects.equals(this.progressDeadlineSeconds, v1DeploymentSpec.progressDeadlineSeconds) &&
        Objects.equals(this.replicas, v1DeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, v1DeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, v1DeploymentSpec.selector) &&
        Objects.equals(this.strategy, v1DeploymentSpec.strategy) &&
        Objects.equals(this.template, v1DeploymentSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeploymentSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
    openapiFields.add("paused");
    openapiFields.add("progressDeadlineSeconds");
    openapiFields.add("replicas");
    openapiFields.add("revisionHistoryLimit");
    openapiFields.add("selector");
    openapiFields.add("strategy");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selector");
    openapiRequiredFields.add("template");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeploymentSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeploymentSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeploymentSpec is not found in the empty JSON string", V1DeploymentSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeploymentSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeploymentSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DeploymentSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `selector`
      V1LabelSelector.validateJsonElement(jsonObj.get("selector"));
      // validate the optional field `strategy`
      if (jsonObj.get("strategy") != null && !jsonObj.get("strategy").isJsonNull()) {
        V1DeploymentStrategy.validateJsonElement(jsonObj.get("strategy"));
      }
      // validate the required field `template`
      V1PodTemplateSpec.validateJsonElement(jsonObj.get("template"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeploymentSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeploymentSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeploymentSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeploymentSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeploymentSpec>() {
           @Override
           public void write(JsonWriter out, V1DeploymentSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeploymentSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeploymentSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeploymentSpec
   * @throws IOException if the JSON string is invalid with respect to V1DeploymentSpec
   */
  public static V1DeploymentSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeploymentSpec.class);
  }

  /**
   * Convert an instance of V1DeploymentSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
