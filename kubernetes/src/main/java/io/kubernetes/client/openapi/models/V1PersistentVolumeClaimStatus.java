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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1ModifyVolumeStatus;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 */
@ApiModel(description = "PersistentVolumeClaimStatus is the current status of a persistent volume claim.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PersistentVolumeClaimStatus {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  @jakarta.annotation.Nullable
  private List<String> accessModes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCE_STATUSES = "allocatedResourceStatuses";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCE_STATUSES)
  @jakarta.annotation.Nullable
  private Map<String, String> allocatedResourceStatuses = new HashMap<>();

  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "allocatedResources";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> allocatedResources = new HashMap<>();

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> capacity = new HashMap<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1PersistentVolumeClaimCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT_VOLUME_ATTRIBUTES_CLASS_NAME = "currentVolumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_CURRENT_VOLUME_ATTRIBUTES_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String currentVolumeAttributesClassName;

  public static final String SERIALIZED_NAME_MODIFY_VOLUME_STATUS = "modifyVolumeStatus";
  @SerializedName(SERIALIZED_NAME_MODIFY_VOLUME_STATUS)
  @jakarta.annotation.Nullable
  private V1ModifyVolumeStatus modifyVolumeStatus;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  @jakarta.annotation.Nullable
  private String phase;

  public V1PersistentVolumeClaimStatus() {
  }

  public V1PersistentVolumeClaimStatus accessModes(@jakarta.annotation.Nullable List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public V1PersistentVolumeClaimStatus addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

  /**
   * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(@jakarta.annotation.Nullable List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1PersistentVolumeClaimStatus allocatedResourceStatuses(@jakarta.annotation.Nullable Map<String, String> allocatedResourceStatuses) {
    this.allocatedResourceStatuses = allocatedResourceStatuses;
    return this;
  }

  public V1PersistentVolumeClaimStatus putAllocatedResourceStatusesItem(String key, String allocatedResourceStatusesItem) {
    if (this.allocatedResourceStatuses == null) {
      this.allocatedResourceStatuses = new HashMap<>();
    }
    this.allocatedResourceStatuses.put(key, allocatedResourceStatusesItem);
    return this;
  }

  /**
   * allocatedResourceStatuses stores status of resource being resized for the given PVC. Key names follow standard Kubernetes label syntax. Valid values are either:  * Un-prefixed keys:   - storage - the capacity of the volume.  * Custom resources must use implementation-defined prefixed names such as \&quot;example.com/my-custom-resource\&quot; Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.  ClaimResourceStatus can be in any of following states:  - ControllerResizeInProgress:   State set when resize controller starts resizing the volume in control-plane.  - ControllerResizeFailed:   State set when resize has failed in resize controller with a terminal error.  - NodeResizePending:   State set when resize controller has finished resizing the volume but further resizing of   volume is needed on the node.  - NodeResizeInProgress:   State set when kubelet starts resizing the volume.  - NodeResizeFailed:   State set when resizing has failed in kubelet with a terminal error. Transient errors don&#39;t set   NodeResizeFailed. For example: if expanding a PVC for more capacity - this field can be one of the following states:  - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;ControllerResizeInProgress\&quot;      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;ControllerResizeFailed\&quot;      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizePending\&quot;      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizeInProgress\&quot;      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] &#x3D; \&quot;NodeResizeFailed\&quot; When this field is not set, it means that no resize operation is in progress for the given PVC.  A controller that receives PVC update with previously unknown resourceName or ClaimResourceStatus should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.  This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   * @return allocatedResourceStatuses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "allocatedResourceStatuses stores status of resource being resized for the given PVC. Key names follow standard Kubernetes label syntax. Valid values are either:  * Un-prefixed keys:   - storage - the capacity of the volume.  * Custom resources must use implementation-defined prefixed names such as \"example.com/my-custom-resource\" Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.  ClaimResourceStatus can be in any of following states:  - ControllerResizeInProgress:   State set when resize controller starts resizing the volume in control-plane.  - ControllerResizeFailed:   State set when resize has failed in resize controller with a terminal error.  - NodeResizePending:   State set when resize controller has finished resizing the volume but further resizing of   volume is needed on the node.  - NodeResizeInProgress:   State set when kubelet starts resizing the volume.  - NodeResizeFailed:   State set when resizing has failed in kubelet with a terminal error. Transient errors don't set   NodeResizeFailed. For example: if expanding a PVC for more capacity - this field can be one of the following states:  - pvc.status.allocatedResourceStatus['storage'] = \"ControllerResizeInProgress\"      - pvc.status.allocatedResourceStatus['storage'] = \"ControllerResizeFailed\"      - pvc.status.allocatedResourceStatus['storage'] = \"NodeResizePending\"      - pvc.status.allocatedResourceStatus['storage'] = \"NodeResizeInProgress\"      - pvc.status.allocatedResourceStatus['storage'] = \"NodeResizeFailed\" When this field is not set, it means that no resize operation is in progress for the given PVC.  A controller that receives PVC update with previously unknown resourceName or ClaimResourceStatus should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.  This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
  public Map<String, String> getAllocatedResourceStatuses() {
    return allocatedResourceStatuses;
  }

  public void setAllocatedResourceStatuses(@jakarta.annotation.Nullable Map<String, String> allocatedResourceStatuses) {
    this.allocatedResourceStatuses = allocatedResourceStatuses;
  }


  public V1PersistentVolumeClaimStatus allocatedResources(@jakarta.annotation.Nullable Map<String, Quantity> allocatedResources) {
    this.allocatedResources = allocatedResources;
    return this;
  }

  public V1PersistentVolumeClaimStatus putAllocatedResourcesItem(String key, Quantity allocatedResourcesItem) {
    if (this.allocatedResources == null) {
      this.allocatedResources = new HashMap<>();
    }
    this.allocatedResources.put(key, allocatedResourcesItem);
    return this;
  }

  /**
   * allocatedResources tracks the resources allocated to a PVC including its capacity. Key names follow standard Kubernetes label syntax. Valid values are either:  * Un-prefixed keys:   - storage - the capacity of the volume.  * Custom resources must use implementation-defined prefixed names such as \&quot;example.com/my-custom-resource\&quot; Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.  Capacity reported here may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity.  A controller that receives PVC update with previously unknown resourceName should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.  This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   * @return allocatedResources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "allocatedResources tracks the resources allocated to a PVC including its capacity. Key names follow standard Kubernetes label syntax. Valid values are either:  * Un-prefixed keys:   - storage - the capacity of the volume.  * Custom resources must use implementation-defined prefixed names such as \"example.com/my-custom-resource\" Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.  Capacity reported here may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity.  A controller that receives PVC update with previously unknown resourceName should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.  This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.")
  public Map<String, Quantity> getAllocatedResources() {
    return allocatedResources;
  }

  public void setAllocatedResources(@jakarta.annotation.Nullable Map<String, Quantity> allocatedResources) {
    this.allocatedResources = allocatedResources;
  }


  public V1PersistentVolumeClaimStatus capacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
    this.capacity = capacity;
    return this;
  }

  public V1PersistentVolumeClaimStatus putCapacityItem(String key, Quantity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

  /**
   * capacity represents the actual resources of the underlying volume.
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "capacity represents the actual resources of the underlying volume.")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }


  public V1PersistentVolumeClaimStatus conditions(@jakarta.annotation.Nullable List<V1PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1PersistentVolumeClaimStatus addConditionsItem(V1PersistentVolumeClaimCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;Resizing&#39;.
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'Resizing'.")
  public List<V1PersistentVolumeClaimCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
  }


  public V1PersistentVolumeClaimStatus currentVolumeAttributesClassName(@jakarta.annotation.Nullable String currentVolumeAttributesClassName) {
    this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
    return this;
  }

  /**
   * currentVolumeAttributesClassName is the current name of the VolumeAttributesClass the PVC is using. When unset, there is no VolumeAttributeClass applied to this PersistentVolumeClaim
   * @return currentVolumeAttributesClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "currentVolumeAttributesClassName is the current name of the VolumeAttributesClass the PVC is using. When unset, there is no VolumeAttributeClass applied to this PersistentVolumeClaim")
  public String getCurrentVolumeAttributesClassName() {
    return currentVolumeAttributesClassName;
  }

  public void setCurrentVolumeAttributesClassName(@jakarta.annotation.Nullable String currentVolumeAttributesClassName) {
    this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
  }


  public V1PersistentVolumeClaimStatus modifyVolumeStatus(@jakarta.annotation.Nullable V1ModifyVolumeStatus modifyVolumeStatus) {
    this.modifyVolumeStatus = modifyVolumeStatus;
    return this;
  }

  /**
   * Get modifyVolumeStatus
   * @return modifyVolumeStatus
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ModifyVolumeStatus getModifyVolumeStatus() {
    return modifyVolumeStatus;
  }

  public void setModifyVolumeStatus(@jakarta.annotation.Nullable V1ModifyVolumeStatus modifyVolumeStatus) {
    this.modifyVolumeStatus = modifyVolumeStatus;
  }


  public V1PersistentVolumeClaimStatus phase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * phase represents the current phase of PersistentVolumeClaim.
   * @return phase
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "phase represents the current phase of PersistentVolumeClaim.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeClaimStatus v1PersistentVolumeClaimStatus = (V1PersistentVolumeClaimStatus) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeClaimStatus.accessModes) &&
        Objects.equals(this.allocatedResourceStatuses, v1PersistentVolumeClaimStatus.allocatedResourceStatuses) &&
        Objects.equals(this.allocatedResources, v1PersistentVolumeClaimStatus.allocatedResources) &&
        Objects.equals(this.capacity, v1PersistentVolumeClaimStatus.capacity) &&
        Objects.equals(this.conditions, v1PersistentVolumeClaimStatus.conditions) &&
        Objects.equals(this.currentVolumeAttributesClassName, v1PersistentVolumeClaimStatus.currentVolumeAttributesClassName) &&
        Objects.equals(this.modifyVolumeStatus, v1PersistentVolumeClaimStatus.modifyVolumeStatus) &&
        Objects.equals(this.phase, v1PersistentVolumeClaimStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, allocatedResourceStatuses, allocatedResources, capacity, conditions, currentVolumeAttributesClassName, modifyVolumeStatus, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimStatus {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    allocatedResourceStatuses: ").append(toIndentedString(allocatedResourceStatuses)).append("\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentVolumeAttributesClassName: ").append(toIndentedString(currentVolumeAttributesClassName)).append("\n");
    sb.append("    modifyVolumeStatus: ").append(toIndentedString(modifyVolumeStatus)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
    openapiFields.add("accessModes");
    openapiFields.add("allocatedResourceStatuses");
    openapiFields.add("allocatedResources");
    openapiFields.add("capacity");
    openapiFields.add("conditions");
    openapiFields.add("currentVolumeAttributesClassName");
    openapiFields.add("modifyVolumeStatus");
    openapiFields.add("phase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PersistentVolumeClaimStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PersistentVolumeClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PersistentVolumeClaimStatus is not found in the empty JSON string", V1PersistentVolumeClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PersistentVolumeClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PersistentVolumeClaimStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessModes") != null && !jsonObj.get("accessModes").isJsonNull() && !jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1PersistentVolumeClaimCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if ((jsonObj.get("currentVolumeAttributesClassName") != null && !jsonObj.get("currentVolumeAttributesClassName").isJsonNull()) && !jsonObj.get("currentVolumeAttributesClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentVolumeAttributesClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentVolumeAttributesClassName").toString()));
      }
      // validate the optional field `modifyVolumeStatus`
      if (jsonObj.get("modifyVolumeStatus") != null && !jsonObj.get("modifyVolumeStatus").isJsonNull()) {
        V1ModifyVolumeStatus.validateJsonElement(jsonObj.get("modifyVolumeStatus"));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PersistentVolumeClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PersistentVolumeClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PersistentVolumeClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PersistentVolumeClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PersistentVolumeClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1PersistentVolumeClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PersistentVolumeClaimStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PersistentVolumeClaimStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PersistentVolumeClaimStatus
   * @throws IOException if the JSON string is invalid with respect to V1PersistentVolumeClaimStatus
   */
  public static V1PersistentVolumeClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PersistentVolumeClaimStatus.class);
  }

  /**
   * Convert an instance of V1PersistentVolumeClaimStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
