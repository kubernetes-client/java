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
import io.kubernetes.client.openapi.models.V1alpha2PodGroupResourceClaim;
import io.kubernetes.client.openapi.models.V1alpha2PodGroupSchedulingConstraints;
import io.kubernetes.client.openapi.models.V1alpha2PodGroupSchedulingPolicy;
import io.kubernetes.client.openapi.models.V1alpha2PodGroupTemplateReference;
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
 * PodGroupSpec defines the desired state of a PodGroup.
 */
@ApiModel(description = "PodGroupSpec defines the desired state of a PodGroup.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-06-26T22:35:15.319369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha2PodGroupSpec {
  public static final String SERIALIZED_NAME_DISRUPTION_MODE = "disruptionMode";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_MODE)
  @jakarta.annotation.Nullable
  private String disruptionMode;

  public static final String SERIALIZED_NAME_POD_GROUP_TEMPLATE_REF = "podGroupTemplateRef";
  @SerializedName(SERIALIZED_NAME_POD_GROUP_TEMPLATE_REF)
  @jakarta.annotation.Nullable
  private V1alpha2PodGroupTemplateReference podGroupTemplateRef;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @jakarta.annotation.Nullable
  private Integer priority;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String priorityClassName;

  public static final String SERIALIZED_NAME_RESOURCE_CLAIMS = "resourceClaims";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIMS)
  @jakarta.annotation.Nullable
  private List<V1alpha2PodGroupResourceClaim> resourceClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULING_CONSTRAINTS = "schedulingConstraints";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_CONSTRAINTS)
  @jakarta.annotation.Nullable
  private V1alpha2PodGroupSchedulingConstraints schedulingConstraints;

  public static final String SERIALIZED_NAME_SCHEDULING_POLICY = "schedulingPolicy";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_POLICY)
  @jakarta.annotation.Nonnull
  private V1alpha2PodGroupSchedulingPolicy schedulingPolicy;

  public V1alpha2PodGroupSpec() {
  }

  public V1alpha2PodGroupSpec disruptionMode(@jakarta.annotation.Nullable String disruptionMode) {
    this.disruptionMode = disruptionMode;
    return this;
  }

  /**
   * DisruptionMode defines the mode in which a given PodGroup can be disrupted. Controllers are expected to fill this field by copying it from a PodGroupTemplate. One of Pod, PodGroup. Defaults to Pod if unset. This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.
   * @return disruptionMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "DisruptionMode defines the mode in which a given PodGroup can be disrupted. Controllers are expected to fill this field by copying it from a PodGroupTemplate. One of Pod, PodGroup. Defaults to Pod if unset. This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.")
  public String getDisruptionMode() {
    return disruptionMode;
  }

  public void setDisruptionMode(@jakarta.annotation.Nullable String disruptionMode) {
    this.disruptionMode = disruptionMode;
  }


  public V1alpha2PodGroupSpec podGroupTemplateRef(@jakarta.annotation.Nullable V1alpha2PodGroupTemplateReference podGroupTemplateRef) {
    this.podGroupTemplateRef = podGroupTemplateRef;
    return this;
  }

  /**
   * Get podGroupTemplateRef
   * @return podGroupTemplateRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2PodGroupTemplateReference getPodGroupTemplateRef() {
    return podGroupTemplateRef;
  }

  public void setPodGroupTemplateRef(@jakarta.annotation.Nullable V1alpha2PodGroupTemplateReference podGroupTemplateRef) {
    this.podGroupTemplateRef = podGroupTemplateRef;
  }


  public V1alpha2PodGroupSpec priority(@jakarta.annotation.Nullable Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority is the value of priority of this pod group. Various system components use this field to find the priority of the pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.
   * @return priority
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Priority is the value of priority of this pod group. Various system components use this field to find the priority of the pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(@jakarta.annotation.Nullable Integer priority) {
    this.priority = priority;
  }


  public V1alpha2PodGroupSpec priorityClassName(@jakarta.annotation.Nullable String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * PriorityClassName defines the priority that should be considered when scheduling this pod group. Controllers are expected to fill this field by copying it from a PodGroupTemplate. Otherwise, it is validated and resolved similarly to the PriorityClassName on PodGroupTemplate (i.e. if no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, the pod group&#39;s priority will be zero). This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.
   * @return priorityClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PriorityClassName defines the priority that should be considered when scheduling this pod group. Controllers are expected to fill this field by copying it from a PodGroupTemplate. Otherwise, it is validated and resolved similarly to the PriorityClassName on PodGroupTemplate (i.e. if no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, the pod group's priority will be zero). This field is immutable. This field is available only when the WorkloadAwarePreemption feature gate is enabled.")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(@jakarta.annotation.Nullable String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public V1alpha2PodGroupSpec resourceClaims(@jakarta.annotation.Nullable List<V1alpha2PodGroupResourceClaim> resourceClaims) {
    this.resourceClaims = resourceClaims;
    return this;
  }

  public V1alpha2PodGroupSpec addResourceClaimsItem(V1alpha2PodGroupResourceClaim resourceClaimsItem) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    this.resourceClaims.add(resourceClaimsItem);
    return this;
  }

  /**
   * ResourceClaims defines which ResourceClaims may be shared among Pods in the group. Pods consume the devices allocated to a PodGroup&#39;s claim by defining a claim in its own Spec.ResourceClaims that matches the PodGroup&#39;s claim exactly. The claim must have the same name and refer to the same ResourceClaim or ResourceClaimTemplate.  This is an alpha-level field and requires that the DRAWorkloadResourceClaims feature gate is enabled.  This field is immutable.
   * @return resourceClaims
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ResourceClaims defines which ResourceClaims may be shared among Pods in the group. Pods consume the devices allocated to a PodGroup's claim by defining a claim in its own Spec.ResourceClaims that matches the PodGroup's claim exactly. The claim must have the same name and refer to the same ResourceClaim or ResourceClaimTemplate.  This is an alpha-level field and requires that the DRAWorkloadResourceClaims feature gate is enabled.  This field is immutable.")
  public List<V1alpha2PodGroupResourceClaim> getResourceClaims() {
    return resourceClaims;
  }

  public void setResourceClaims(@jakarta.annotation.Nullable List<V1alpha2PodGroupResourceClaim> resourceClaims) {
    this.resourceClaims = resourceClaims;
  }


  public V1alpha2PodGroupSpec schedulingConstraints(@jakarta.annotation.Nullable V1alpha2PodGroupSchedulingConstraints schedulingConstraints) {
    this.schedulingConstraints = schedulingConstraints;
    return this;
  }

  /**
   * Get schedulingConstraints
   * @return schedulingConstraints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2PodGroupSchedulingConstraints getSchedulingConstraints() {
    return schedulingConstraints;
  }

  public void setSchedulingConstraints(@jakarta.annotation.Nullable V1alpha2PodGroupSchedulingConstraints schedulingConstraints) {
    this.schedulingConstraints = schedulingConstraints;
  }


  public V1alpha2PodGroupSpec schedulingPolicy(@jakarta.annotation.Nonnull V1alpha2PodGroupSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  /**
   * Get schedulingPolicy
   * @return schedulingPolicy
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1alpha2PodGroupSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public void setSchedulingPolicy(@jakarta.annotation.Nonnull V1alpha2PodGroupSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodGroupSpec v1alpha2PodGroupSpec = (V1alpha2PodGroupSpec) o;
    return Objects.equals(this.disruptionMode, v1alpha2PodGroupSpec.disruptionMode) &&
        Objects.equals(this.podGroupTemplateRef, v1alpha2PodGroupSpec.podGroupTemplateRef) &&
        Objects.equals(this.priority, v1alpha2PodGroupSpec.priority) &&
        Objects.equals(this.priorityClassName, v1alpha2PodGroupSpec.priorityClassName) &&
        Objects.equals(this.resourceClaims, v1alpha2PodGroupSpec.resourceClaims) &&
        Objects.equals(this.schedulingConstraints, v1alpha2PodGroupSpec.schedulingConstraints) &&
        Objects.equals(this.schedulingPolicy, v1alpha2PodGroupSpec.schedulingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionMode, podGroupTemplateRef, priority, priorityClassName, resourceClaims, schedulingConstraints, schedulingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodGroupSpec {\n");
    sb.append("    disruptionMode: ").append(toIndentedString(disruptionMode)).append("\n");
    sb.append("    podGroupTemplateRef: ").append(toIndentedString(podGroupTemplateRef)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    resourceClaims: ").append(toIndentedString(resourceClaims)).append("\n");
    sb.append("    schedulingConstraints: ").append(toIndentedString(schedulingConstraints)).append("\n");
    sb.append("    schedulingPolicy: ").append(toIndentedString(schedulingPolicy)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("disruptionMode", "podGroupTemplateRef", "priority", "priorityClassName", "resourceClaims", "schedulingConstraints", "schedulingPolicy"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("schedulingPolicy"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha2PodGroupSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2PodGroupSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha2PodGroupSpec is not found in the empty JSON string", V1alpha2PodGroupSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2PodGroupSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha2PodGroupSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha2PodGroupSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("disruptionMode") != null && !jsonObj.get("disruptionMode").isJsonNull()) && !jsonObj.get("disruptionMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `disruptionMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disruptionMode").toString()));
      }
      // validate the optional field `podGroupTemplateRef`
      if (jsonObj.get("podGroupTemplateRef") != null && !jsonObj.get("podGroupTemplateRef").isJsonNull()) {
        V1alpha2PodGroupTemplateReference.validateJsonElement(jsonObj.get("podGroupTemplateRef"));
      }
      if ((jsonObj.get("priorityClassName") != null && !jsonObj.get("priorityClassName").isJsonNull()) && !jsonObj.get("priorityClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `priorityClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priorityClassName").toString()));
      }
      if (jsonObj.get("resourceClaims") != null && !jsonObj.get("resourceClaims").isJsonNull()) {
        JsonArray jsonArrayresourceClaims = jsonObj.getAsJsonArray("resourceClaims");
        if (jsonArrayresourceClaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourceClaims").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `resourceClaims` to be an array in the JSON string but got `%s`", jsonObj.get("resourceClaims").toString()));
          }

          // validate the optional field `resourceClaims` (array)
          for (int i = 0; i < jsonArrayresourceClaims.size(); i++) {
            V1alpha2PodGroupResourceClaim.validateJsonElement(jsonArrayresourceClaims.get(i));
          };
        }
      }
      // validate the optional field `schedulingConstraints`
      if (jsonObj.get("schedulingConstraints") != null && !jsonObj.get("schedulingConstraints").isJsonNull()) {
        V1alpha2PodGroupSchedulingConstraints.validateJsonElement(jsonObj.get("schedulingConstraints"));
      }
      // validate the required field `schedulingPolicy`
      V1alpha2PodGroupSchedulingPolicy.validateJsonElement(jsonObj.get("schedulingPolicy"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2PodGroupSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2PodGroupSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2PodGroupSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2PodGroupSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2PodGroupSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha2PodGroupSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2PodGroupSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha2PodGroupSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha2PodGroupSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha2PodGroupSpec
   */
  public static V1alpha2PodGroupSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2PodGroupSpec.class);
  }

  /**
   * Convert an instance of V1alpha2PodGroupSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
