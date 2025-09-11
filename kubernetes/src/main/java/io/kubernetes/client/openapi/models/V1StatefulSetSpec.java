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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1StatefulSetOrdinals;
import io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy;
import io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy;
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
 * A StatefulSetSpec is the specification of a StatefulSet.
 */
@ApiModel(description = "A StatefulSetSpec is the specification of a StatefulSet.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1StatefulSetSpec {
  public static final String SERIALIZED_NAME_MIN_READY_SECONDS = "minReadySeconds";
  @SerializedName(SERIALIZED_NAME_MIN_READY_SECONDS)
  @jakarta.annotation.Nullable
  private Integer minReadySeconds;

  public static final String SERIALIZED_NAME_ORDINALS = "ordinals";
  @SerializedName(SERIALIZED_NAME_ORDINALS)
  @jakarta.annotation.Nullable
  private V1StatefulSetOrdinals ordinals;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM_RETENTION_POLICY = "persistentVolumeClaimRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM_RETENTION_POLICY)
  @jakarta.annotation.Nullable
  private V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;

  public static final String SERIALIZED_NAME_POD_MANAGEMENT_POLICY = "podManagementPolicy";
  @SerializedName(SERIALIZED_NAME_POD_MANAGEMENT_POLICY)
  @jakarta.annotation.Nullable
  private String podManagementPolicy;

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

  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  @jakarta.annotation.Nullable
  private String serviceName;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @jakarta.annotation.Nonnull
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_UPDATE_STRATEGY = "updateStrategy";
  @SerializedName(SERIALIZED_NAME_UPDATE_STRATEGY)
  @jakarta.annotation.Nullable
  private V1StatefulSetUpdateStrategy updateStrategy;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  @jakarta.annotation.Nullable
  private List<V1PersistentVolumeClaim> volumeClaimTemplates = new ArrayList<>();

  public V1StatefulSetSpec() {
  }

  public V1StatefulSetSpec minReadySeconds(@jakarta.annotation.Nullable Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

  /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(@jakarta.annotation.Nullable Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }


  public V1StatefulSetSpec ordinals(@jakarta.annotation.Nullable V1StatefulSetOrdinals ordinals) {
    this.ordinals = ordinals;
    return this;
  }

  /**
   * Get ordinals
   * @return ordinals
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StatefulSetOrdinals getOrdinals() {
    return ordinals;
  }

  public void setOrdinals(@jakarta.annotation.Nullable V1StatefulSetOrdinals ordinals) {
    this.ordinals = ordinals;
  }


  public V1StatefulSetSpec persistentVolumeClaimRetentionPolicy(@jakarta.annotation.Nullable V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
    this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
    return this;
  }

  /**
   * Get persistentVolumeClaimRetentionPolicy
   * @return persistentVolumeClaimRetentionPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy() {
    return persistentVolumeClaimRetentionPolicy;
  }

  public void setPersistentVolumeClaimRetentionPolicy(@jakarta.annotation.Nullable V1StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
    this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
  }


  public V1StatefulSetSpec podManagementPolicy(@jakarta.annotation.Nullable String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return this;
  }

  /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is &#x60;OrderedReady&#x60;, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is &#x60;Parallel&#x60; which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
   * @return podManagementPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.")
  public String getPodManagementPolicy() {
    return podManagementPolicy;
  }

  public void setPodManagementPolicy(@jakarta.annotation.Nullable String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
  }


  public V1StatefulSetSpec replicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
   * @return replicas
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(@jakarta.annotation.Nullable Integer replicas) {
    this.replicas = replicas;
  }


  public V1StatefulSetSpec revisionHistoryLimit(@jakarta.annotation.Nullable Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

  /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
   * @return revisionHistoryLimit
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(@jakarta.annotation.Nullable Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }


  public V1StatefulSetSpec selector(@jakarta.annotation.Nonnull V1LabelSelector selector) {
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


  public V1StatefulSetSpec serviceName(@jakarta.annotation.Nullable String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \&quot;pod-specific-string\&quot; is managed by the StatefulSet controller.
   * @return serviceName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(@jakarta.annotation.Nullable String serviceName) {
    this.serviceName = serviceName;
  }


  public V1StatefulSetSpec template(@jakarta.annotation.Nonnull V1PodTemplateSpec template) {
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


  public V1StatefulSetSpec updateStrategy(@jakarta.annotation.Nullable V1StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

  /**
   * Get updateStrategy
   * @return updateStrategy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StatefulSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(@jakarta.annotation.Nullable V1StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  public V1StatefulSetSpec volumeClaimTemplates(@jakarta.annotation.Nullable List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1StatefulSetSpec addVolumeClaimTemplatesItem(V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

  /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
   * @return volumeClaimTemplates
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.")
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(@jakarta.annotation.Nullable List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetSpec v1StatefulSetSpec = (V1StatefulSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1StatefulSetSpec.minReadySeconds) &&
        Objects.equals(this.ordinals, v1StatefulSetSpec.ordinals) &&
        Objects.equals(this.persistentVolumeClaimRetentionPolicy, v1StatefulSetSpec.persistentVolumeClaimRetentionPolicy) &&
        Objects.equals(this.podManagementPolicy, v1StatefulSetSpec.podManagementPolicy) &&
        Objects.equals(this.replicas, v1StatefulSetSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, v1StatefulSetSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, v1StatefulSetSpec.selector) &&
        Objects.equals(this.serviceName, v1StatefulSetSpec.serviceName) &&
        Objects.equals(this.template, v1StatefulSetSpec.template) &&
        Objects.equals(this.updateStrategy, v1StatefulSetSpec.updateStrategy) &&
        Objects.equals(this.volumeClaimTemplates, v1StatefulSetSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, ordinals, persistentVolumeClaimRetentionPolicy, podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetSpec {\n");
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    ordinals: ").append(toIndentedString(ordinals)).append("\n");
    sb.append("    persistentVolumeClaimRetentionPolicy: ").append(toIndentedString(persistentVolumeClaimRetentionPolicy)).append("\n");
    sb.append("    podManagementPolicy: ").append(toIndentedString(podManagementPolicy)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
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
    openapiFields.add("ordinals");
    openapiFields.add("persistentVolumeClaimRetentionPolicy");
    openapiFields.add("podManagementPolicy");
    openapiFields.add("replicas");
    openapiFields.add("revisionHistoryLimit");
    openapiFields.add("selector");
    openapiFields.add("serviceName");
    openapiFields.add("template");
    openapiFields.add("updateStrategy");
    openapiFields.add("volumeClaimTemplates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selector");
    openapiRequiredFields.add("template");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1StatefulSetSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1StatefulSetSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StatefulSetSpec is not found in the empty JSON string", V1StatefulSetSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1StatefulSetSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StatefulSetSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1StatefulSetSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ordinals`
      if (jsonObj.get("ordinals") != null && !jsonObj.get("ordinals").isJsonNull()) {
        V1StatefulSetOrdinals.validateJsonElement(jsonObj.get("ordinals"));
      }
      // validate the optional field `persistentVolumeClaimRetentionPolicy`
      if (jsonObj.get("persistentVolumeClaimRetentionPolicy") != null && !jsonObj.get("persistentVolumeClaimRetentionPolicy").isJsonNull()) {
        V1StatefulSetPersistentVolumeClaimRetentionPolicy.validateJsonElement(jsonObj.get("persistentVolumeClaimRetentionPolicy"));
      }
      if ((jsonObj.get("podManagementPolicy") != null && !jsonObj.get("podManagementPolicy").isJsonNull()) && !jsonObj.get("podManagementPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `podManagementPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("podManagementPolicy").toString()));
      }
      // validate the required field `selector`
      V1LabelSelector.validateJsonElement(jsonObj.get("selector"));
      if ((jsonObj.get("serviceName") != null && !jsonObj.get("serviceName").isJsonNull()) && !jsonObj.get("serviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceName").toString()));
      }
      // validate the required field `template`
      V1PodTemplateSpec.validateJsonElement(jsonObj.get("template"));
      // validate the optional field `updateStrategy`
      if (jsonObj.get("updateStrategy") != null && !jsonObj.get("updateStrategy").isJsonNull()) {
        V1StatefulSetUpdateStrategy.validateJsonElement(jsonObj.get("updateStrategy"));
      }
      if (jsonObj.get("volumeClaimTemplates") != null && !jsonObj.get("volumeClaimTemplates").isJsonNull()) {
        JsonArray jsonArrayvolumeClaimTemplates = jsonObj.getAsJsonArray("volumeClaimTemplates");
        if (jsonArrayvolumeClaimTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeClaimTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeClaimTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("volumeClaimTemplates").toString()));
          }

          // validate the optional field `volumeClaimTemplates` (array)
          for (int i = 0; i < jsonArrayvolumeClaimTemplates.size(); i++) {
            V1PersistentVolumeClaim.validateJsonElement(jsonArrayvolumeClaimTemplates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StatefulSetSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StatefulSetSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StatefulSetSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StatefulSetSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StatefulSetSpec>() {
           @Override
           public void write(JsonWriter out, V1StatefulSetSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StatefulSetSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1StatefulSetSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1StatefulSetSpec
   * @throws IOException if the JSON string is invalid with respect to V1StatefulSetSpec
   */
  public static V1StatefulSetSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StatefulSetSpec.class);
  }

  /**
   * Convert an instance of V1StatefulSetSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
