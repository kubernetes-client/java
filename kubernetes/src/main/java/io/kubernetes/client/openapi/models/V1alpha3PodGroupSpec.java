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
import io.kubernetes.client.openapi.models.V1alpha3DisruptionMode;
import io.kubernetes.client.openapi.models.V1alpha3PodGroupResourceClaim;
import io.kubernetes.client.openapi.models.V1alpha3PodGroupSchedulingConstraints;
import io.kubernetes.client.openapi.models.V1alpha3PodGroupSchedulingPolicy;
import io.kubernetes.client.openapi.models.V1alpha3WorkloadReference;
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
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-10-15T02:48:00.835726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1alpha3PodGroupSpec {
  public static final String SERIALIZED_NAME_DISRUPTION_MODE = "disruptionMode";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_MODE)
  @jakarta.annotation.Nullable
  private V1alpha3DisruptionMode disruptionMode;

  public static final String SERIALIZED_NAME_PARENT_COMPOSITE_POD_GROUP_NAME = "parentCompositePodGroupName";
  @SerializedName(SERIALIZED_NAME_PARENT_COMPOSITE_POD_GROUP_NAME)
  @jakarta.annotation.Nullable
  private String parentCompositePodGroupName;

  public static final String SERIALIZED_NAME_PREEMPTION_POLICY = "preemptionPolicy";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_POLICY)
  @jakarta.annotation.Nullable
  private String preemptionPolicy;

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
  private List<V1alpha3PodGroupResourceClaim> resourceClaims = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEDULING_CONSTRAINTS = "schedulingConstraints";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_CONSTRAINTS)
  @jakarta.annotation.Nullable
  private V1alpha3PodGroupSchedulingConstraints schedulingConstraints;

  public static final String SERIALIZED_NAME_SCHEDULING_POLICY = "schedulingPolicy";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_POLICY)
  @jakarta.annotation.Nonnull
  private V1alpha3PodGroupSchedulingPolicy schedulingPolicy;

  public static final String SERIALIZED_NAME_WORKLOAD_REF = "workloadRef";
  @SerializedName(SERIALIZED_NAME_WORKLOAD_REF)
  @jakarta.annotation.Nullable
  private V1alpha3WorkloadReference workloadRef;

  public V1alpha3PodGroupSpec() {
  }

  public V1alpha3PodGroupSpec disruptionMode(@jakarta.annotation.Nullable V1alpha3DisruptionMode disruptionMode) {
    this.disruptionMode = disruptionMode;
    return this;
  }

  /**
   * Get disruptionMode
   * @return disruptionMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3DisruptionMode getDisruptionMode() {
    return disruptionMode;
  }

  public void setDisruptionMode(@jakarta.annotation.Nullable V1alpha3DisruptionMode disruptionMode) {
    this.disruptionMode = disruptionMode;
  }


  public V1alpha3PodGroupSpec parentCompositePodGroupName(@jakarta.annotation.Nullable String parentCompositePodGroupName) {
    this.parentCompositePodGroupName = parentCompositePodGroupName;
    return this;
  }

  /**
   * parentCompositePodGroupName contains the name of the parent composite pod group within the same namespace as this pod group. If it&#39;s nil, then this pod group is a root of a workload&#39;s hierarchy. This field is used only when the CompositePodGroup feature gate is enabled. This field is immutable.
   * @return parentCompositePodGroupName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "parentCompositePodGroupName contains the name of the parent composite pod group within the same namespace as this pod group. If it's nil, then this pod group is a root of a workload's hierarchy. This field is used only when the CompositePodGroup feature gate is enabled. This field is immutable.")
  public String getParentCompositePodGroupName() {
    return parentCompositePodGroupName;
  }

  public void setParentCompositePodGroupName(@jakarta.annotation.Nullable String parentCompositePodGroupName) {
    this.parentCompositePodGroupName = parentCompositePodGroupName;
  }


  public V1alpha3PodGroupSpec preemptionPolicy(@jakarta.annotation.Nullable String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

  /**
   * preemptionPolicy is the Policy for preempting pods/podgroups with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. When Priority Admission Controller is enabled, it populates this field from PriorityClassName, and defaults to PreemptLowerPriority if value is unset in PriorityClass. This field is immutable. This field is available only when the PodGroupPreemptionPolicy feature gate is enabled.
   * @return preemptionPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "preemptionPolicy is the Policy for preempting pods/podgroups with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. When Priority Admission Controller is enabled, it populates this field from PriorityClassName, and defaults to PreemptLowerPriority if value is unset in PriorityClass. This field is immutable. This field is available only when the PodGroupPreemptionPolicy feature gate is enabled.")
  public String getPreemptionPolicy() {
    return preemptionPolicy;
  }

  public void setPreemptionPolicy(@jakarta.annotation.Nullable String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
  }


  public V1alpha3PodGroupSpec priority(@jakarta.annotation.Nullable Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * priority is the value of priority of this pod group. Various system components use this field to find the priority of the pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable.
   * @return priority
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "priority is the value of priority of this pod group. Various system components use this field to find the priority of the pod group. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority. This field is immutable.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(@jakarta.annotation.Nullable Integer priority) {
    this.priority = priority;
  }


  public V1alpha3PodGroupSpec priorityClassName(@jakarta.annotation.Nullable String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

  /**
   * priorityClassName defines the priority that should be considered when scheduling this pod group. Controllers are expected to fill this field by copying it from a PodGroupTemplate. Otherwise, it is validated and resolved similarly to the PriorityClassName on PodGroupTemplate (i.e. if no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, the pod group&#39;s priority will be zero). This field is immutable.
   * @return priorityClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "priorityClassName defines the priority that should be considered when scheduling this pod group. Controllers are expected to fill this field by copying it from a PodGroupTemplate. Otherwise, it is validated and resolved similarly to the PriorityClassName on PodGroupTemplate (i.e. if no priority class is specified, admission control can set this to the global default priority class if it exists. Otherwise, the pod group's priority will be zero). This field is immutable.")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(@jakarta.annotation.Nullable String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public V1alpha3PodGroupSpec resourceClaims(@jakarta.annotation.Nullable List<V1alpha3PodGroupResourceClaim> resourceClaims) {
    this.resourceClaims = resourceClaims;
    return this;
  }

  public V1alpha3PodGroupSpec addResourceClaimsItem(V1alpha3PodGroupResourceClaim resourceClaimsItem) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    this.resourceClaims.add(resourceClaimsItem);
    return this;
  }

  /**
   * resourceClaims defines which ResourceClaims may be shared among Pods in the group. Pods consume the devices allocated to a PodGroup&#39;s claim by defining a claim in its own Spec.ResourceClaims that matches the PodGroup&#39;s claim exactly. The claim must have the same name and refer to the same ResourceClaim or ResourceClaimTemplate.  This is a beta-level field and requires that the DRAWorkloadResourceClaims feature gate is enabled.  This field is immutable.
   * @return resourceClaims
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "resourceClaims defines which ResourceClaims may be shared among Pods in the group. Pods consume the devices allocated to a PodGroup's claim by defining a claim in its own Spec.ResourceClaims that matches the PodGroup's claim exactly. The claim must have the same name and refer to the same ResourceClaim or ResourceClaimTemplate.  This is a beta-level field and requires that the DRAWorkloadResourceClaims feature gate is enabled.  This field is immutable.")
  public List<V1alpha3PodGroupResourceClaim> getResourceClaims() {
    return resourceClaims;
  }

  public void setResourceClaims(@jakarta.annotation.Nullable List<V1alpha3PodGroupResourceClaim> resourceClaims) {
    this.resourceClaims = resourceClaims;
  }


  public V1alpha3PodGroupSpec schedulingConstraints(@jakarta.annotation.Nullable V1alpha3PodGroupSchedulingConstraints schedulingConstraints) {
    this.schedulingConstraints = schedulingConstraints;
    return this;
  }

  /**
   * Get schedulingConstraints
   * @return schedulingConstraints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3PodGroupSchedulingConstraints getSchedulingConstraints() {
    return schedulingConstraints;
  }

  public void setSchedulingConstraints(@jakarta.annotation.Nullable V1alpha3PodGroupSchedulingConstraints schedulingConstraints) {
    this.schedulingConstraints = schedulingConstraints;
  }


  public V1alpha3PodGroupSpec schedulingPolicy(@jakarta.annotation.Nonnull V1alpha3PodGroupSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  /**
   * Get schedulingPolicy
   * @return schedulingPolicy
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1alpha3PodGroupSchedulingPolicy getSchedulingPolicy() {
    return schedulingPolicy;
  }

  public void setSchedulingPolicy(@jakarta.annotation.Nonnull V1alpha3PodGroupSchedulingPolicy schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
  }


  public V1alpha3PodGroupSpec workloadRef(@jakarta.annotation.Nullable V1alpha3WorkloadReference workloadRef) {
    this.workloadRef = workloadRef;
    return this;
  }

  /**
   * Get workloadRef
   * @return workloadRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3WorkloadReference getWorkloadRef() {
    return workloadRef;
  }

  public void setWorkloadRef(@jakarta.annotation.Nullable V1alpha3WorkloadReference workloadRef) {
    this.workloadRef = workloadRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3PodGroupSpec v1alpha3PodGroupSpec = (V1alpha3PodGroupSpec) o;
    return Objects.equals(this.disruptionMode, v1alpha3PodGroupSpec.disruptionMode) &&
        Objects.equals(this.parentCompositePodGroupName, v1alpha3PodGroupSpec.parentCompositePodGroupName) &&
        Objects.equals(this.preemptionPolicy, v1alpha3PodGroupSpec.preemptionPolicy) &&
        Objects.equals(this.priority, v1alpha3PodGroupSpec.priority) &&
        Objects.equals(this.priorityClassName, v1alpha3PodGroupSpec.priorityClassName) &&
        Objects.equals(this.resourceClaims, v1alpha3PodGroupSpec.resourceClaims) &&
        Objects.equals(this.schedulingConstraints, v1alpha3PodGroupSpec.schedulingConstraints) &&
        Objects.equals(this.schedulingPolicy, v1alpha3PodGroupSpec.schedulingPolicy) &&
        Objects.equals(this.workloadRef, v1alpha3PodGroupSpec.workloadRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionMode, parentCompositePodGroupName, preemptionPolicy, priority, priorityClassName, resourceClaims, schedulingConstraints, schedulingPolicy, workloadRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3PodGroupSpec {\n");
    sb.append("    disruptionMode: ").append(toIndentedString(disruptionMode)).append("\n");
    sb.append("    parentCompositePodGroupName: ").append(toIndentedString(parentCompositePodGroupName)).append("\n");
    sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    resourceClaims: ").append(toIndentedString(resourceClaims)).append("\n");
    sb.append("    schedulingConstraints: ").append(toIndentedString(schedulingConstraints)).append("\n");
    sb.append("    schedulingPolicy: ").append(toIndentedString(schedulingPolicy)).append("\n");
    sb.append("    workloadRef: ").append(toIndentedString(workloadRef)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("disruptionMode", "parentCompositePodGroupName", "preemptionPolicy", "priority", "priorityClassName", "resourceClaims", "schedulingConstraints", "schedulingPolicy", "workloadRef"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("schedulingPolicy"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3PodGroupSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3PodGroupSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1alpha3PodGroupSpec is not found in the empty JSON string", V1alpha3PodGroupSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3PodGroupSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1alpha3PodGroupSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3PodGroupSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `disruptionMode`
      if (jsonObj.get("disruptionMode") != null && !jsonObj.get("disruptionMode").isJsonNull()) {
        V1alpha3DisruptionMode.validateJsonElement(jsonObj.get("disruptionMode"));
      }
      if ((jsonObj.get("parentCompositePodGroupName") != null && !jsonObj.get("parentCompositePodGroupName").isJsonNull()) && !jsonObj.get("parentCompositePodGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `parentCompositePodGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCompositePodGroupName").toString()));
      }
      if ((jsonObj.get("preemptionPolicy") != null && !jsonObj.get("preemptionPolicy").isJsonNull()) && !jsonObj.get("preemptionPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `preemptionPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preemptionPolicy").toString()));
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
            V1alpha3PodGroupResourceClaim.validateJsonElement(jsonArrayresourceClaims.get(i));
          };
        }
      }
      // validate the optional field `schedulingConstraints`
      if (jsonObj.get("schedulingConstraints") != null && !jsonObj.get("schedulingConstraints").isJsonNull()) {
        V1alpha3PodGroupSchedulingConstraints.validateJsonElement(jsonObj.get("schedulingConstraints"));
      }
      // validate the required field `schedulingPolicy`
      V1alpha3PodGroupSchedulingPolicy.validateJsonElement(jsonObj.get("schedulingPolicy"));
      // validate the optional field `workloadRef`
      if (jsonObj.get("workloadRef") != null && !jsonObj.get("workloadRef").isJsonNull()) {
        V1alpha3WorkloadReference.validateJsonElement(jsonObj.get("workloadRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3PodGroupSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3PodGroupSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3PodGroupSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3PodGroupSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3PodGroupSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha3PodGroupSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3PodGroupSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3PodGroupSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3PodGroupSpec
   * @throws IOException if the JSON string is invalid with respect to V1alpha3PodGroupSpec
   */
  public static V1alpha3PodGroupSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3PodGroupSpec.class);
  }

  /**
   * Convert an instance of V1alpha3PodGroupSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
