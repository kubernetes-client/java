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
import io.kubernetes.client.openapi.models.V1Preconditions;
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
 * DeleteOptions may be provided when deleting an API object.
 */
@ApiModel(description = "DeleteOptions may be provided when deleting an API object.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DeleteOptions {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  @jakarta.annotation.Nullable
  private List<String> dryRun = new ArrayList<>();

  public static final String SERIALIZED_NAME_GRACE_PERIOD_SECONDS = "gracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_GRACE_PERIOD_SECONDS)
  @jakarta.annotation.Nullable
  private Long gracePeriodSeconds;

  public static final String SERIALIZED_NAME_IGNORE_STORE_READ_ERROR_WITH_CLUSTER_BREAKING_POTENTIAL = "ignoreStoreReadErrorWithClusterBreakingPotential";
  @SerializedName(SERIALIZED_NAME_IGNORE_STORE_READ_ERROR_WITH_CLUSTER_BREAKING_POTENTIAL)
  @jakarta.annotation.Nullable
  private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_ORPHAN_DEPENDENTS = "orphanDependents";
  @SerializedName(SERIALIZED_NAME_ORPHAN_DEPENDENTS)
  @jakarta.annotation.Nullable
  private Boolean orphanDependents;

  public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";
  @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
  @jakarta.annotation.Nullable
  private V1Preconditions preconditions;

  public static final String SERIALIZED_NAME_PROPAGATION_POLICY = "propagationPolicy";
  @SerializedName(SERIALIZED_NAME_PROPAGATION_POLICY)
  @jakarta.annotation.Nullable
  private String propagationPolicy;

  public V1DeleteOptions() {
  }

  public V1DeleteOptions apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1DeleteOptions dryRun(@jakarta.annotation.Nullable List<String> dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public V1DeleteOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

  /**
   * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
   * @return dryRun
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed")
  public List<String> getDryRun() {
    return dryRun;
  }

  public void setDryRun(@jakarta.annotation.Nullable List<String> dryRun) {
    this.dryRun = dryRun;
  }


  public V1DeleteOptions gracePeriodSeconds(@jakarta.annotation.Nullable Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

  /**
   * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
   * @return gracePeriodSeconds
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.")
  public Long getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }

  public void setGracePeriodSeconds(@jakarta.annotation.Nullable Long gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }


  public V1DeleteOptions ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
    this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
    return this;
  }

  /**
   * if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it
   * @return ignoreStoreReadErrorWithClusterBreakingPotential
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it")
  public Boolean getIgnoreStoreReadErrorWithClusterBreakingPotential() {
    return ignoreStoreReadErrorWithClusterBreakingPotential;
  }

  public void setIgnoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
    this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
  }


  public V1DeleteOptions kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public V1DeleteOptions orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
    return this;
  }

  /**
   * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both.
   * @return orphanDependents
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \"orphan\" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.")
  public Boolean getOrphanDependents() {
    return orphanDependents;
  }

  public void setOrphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
  }


  public V1DeleteOptions preconditions(@jakarta.annotation.Nullable V1Preconditions preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Preconditions getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(@jakarta.annotation.Nullable V1Preconditions preconditions) {
    this.preconditions = preconditions;
  }


  public V1DeleteOptions propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
    return this;
  }

  /**
   * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   * @return propagationPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.")
  public String getPropagationPolicy() {
    return propagationPolicy;
  }

  public void setPropagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeleteOptions v1DeleteOptions = (V1DeleteOptions) o;
    return Objects.equals(this.apiVersion, v1DeleteOptions.apiVersion) &&
        Objects.equals(this.dryRun, v1DeleteOptions.dryRun) &&
        Objects.equals(this.gracePeriodSeconds, v1DeleteOptions.gracePeriodSeconds) &&
        Objects.equals(this.ignoreStoreReadErrorWithClusterBreakingPotential, v1DeleteOptions.ignoreStoreReadErrorWithClusterBreakingPotential) &&
        Objects.equals(this.kind, v1DeleteOptions.kind) &&
        Objects.equals(this.orphanDependents, v1DeleteOptions.orphanDependents) &&
        Objects.equals(this.preconditions, v1DeleteOptions.preconditions) &&
        Objects.equals(this.propagationPolicy, v1DeleteOptions.propagationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, kind, orphanDependents, preconditions, propagationPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeleteOptions {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    ignoreStoreReadErrorWithClusterBreakingPotential: ").append(toIndentedString(ignoreStoreReadErrorWithClusterBreakingPotential)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    orphanDependents: ").append(toIndentedString(orphanDependents)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("dryRun");
    openapiFields.add("gracePeriodSeconds");
    openapiFields.add("ignoreStoreReadErrorWithClusterBreakingPotential");
    openapiFields.add("kind");
    openapiFields.add("orphanDependents");
    openapiFields.add("preconditions");
    openapiFields.add("propagationPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeleteOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeleteOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeleteOptions is not found in the empty JSON string", V1DeleteOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeleteOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeleteOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dryRun") != null && !jsonObj.get("dryRun").isJsonNull() && !jsonObj.get("dryRun").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dryRun` to be an array in the JSON string but got `%s`", jsonObj.get("dryRun").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `preconditions`
      if (jsonObj.get("preconditions") != null && !jsonObj.get("preconditions").isJsonNull()) {
        V1Preconditions.validateJsonElement(jsonObj.get("preconditions"));
      }
      if ((jsonObj.get("propagationPolicy") != null && !jsonObj.get("propagationPolicy").isJsonNull()) && !jsonObj.get("propagationPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propagationPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propagationPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeleteOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeleteOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeleteOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeleteOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeleteOptions>() {
           @Override
           public void write(JsonWriter out, V1DeleteOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeleteOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeleteOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeleteOptions
   * @throws IOException if the JSON string is invalid with respect to V1DeleteOptions
   */
  public static V1DeleteOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeleteOptions.class);
  }

  /**
   * Convert an instance of V1DeleteOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
