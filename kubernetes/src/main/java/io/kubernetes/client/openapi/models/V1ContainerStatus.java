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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1VolumeMountStatus;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ContainerStatus contains details for the current status of this container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ContainerStatus {
  public static final String SERIALIZED_NAME_ALLOCATED_RESOURCES = "allocatedResources";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_RESOURCES)
  private Map<String, Quantity> allocatedResources = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTAINER_I_D = "containerID";
  @SerializedName(SERIALIZED_NAME_CONTAINER_I_D)
  private String containerID;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "imageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_LAST_STATE = "lastState";
  @SerializedName(SERIALIZED_NAME_LAST_STATE)
  private V1ContainerState lastState;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READY = "ready";
  @SerializedName(SERIALIZED_NAME_READY)
  private Boolean ready;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources;

  public static final String SERIALIZED_NAME_RESTART_COUNT = "restartCount";
  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Integer restartCount;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private Boolean started;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private V1ContainerState state;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1VolumeMountStatus> volumeMounts;

  public V1ContainerStatus() {
  }

  public V1ContainerStatus allocatedResources(Map<String, Quantity> allocatedResources) {

    this.allocatedResources = allocatedResources;
    return this;
  }

  public V1ContainerStatus putAllocatedResourcesItem(String key, Quantity allocatedResourcesItem) {
    if (this.allocatedResources == null) {
      this.allocatedResources = new HashMap<>();
    }
    this.allocatedResources.put(key, allocatedResourcesItem);
    return this;
  }

   /**
   * AllocatedResources represents the compute resources allocated for this container by the node. Kubelet sets this value to Container.Resources.Requests upon successful pod admission and after successfully admitting desired pod resize.
   * @return allocatedResources
  **/
  @jakarta.annotation.Nullable
  public Map<String, Quantity> getAllocatedResources() {
    return allocatedResources;
  }


  public void setAllocatedResources(Map<String, Quantity> allocatedResources) {
    this.allocatedResources = allocatedResources;
  }


  public V1ContainerStatus containerID(String containerID) {

    this.containerID = containerID;
    return this;
  }

   /**
   * ContainerID is the ID of the container in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;. Where type is a container runtime identifier, returned from Version call of CRI API (for example \&quot;containerd\&quot;).
   * @return containerID
  **/
  @jakarta.annotation.Nullable
  public String getContainerID() {
    return containerID;
  }


  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }


  public V1ContainerStatus image(String image) {

    this.image = image;
    return this;
  }

   /**
   * Image is the name of container image that the container is running. The container image may not match the image used in the PodSpec, as it may have been resolved by the runtime. More info: https://kubernetes.io/docs/concepts/containers/images.
   * @return image
  **/
  @jakarta.annotation.Nonnull
  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1ContainerStatus imageID(String imageID) {

    this.imageID = imageID;
    return this;
  }

   /**
   * ImageID is the image ID of the container&#39;s image. The image ID may not match the image ID of the image used in the PodSpec, as it may have been resolved by the runtime.
   * @return imageID
  **/
  @jakarta.annotation.Nonnull
  public String getImageID() {
    return imageID;
  }


  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public V1ContainerStatus lastState(V1ContainerState lastState) {

    this.lastState = lastState;
    return this;
  }

   /**
   * Get lastState
   * @return lastState
  **/
  @jakarta.annotation.Nullable
  public V1ContainerState getLastState() {
    return lastState;
  }


  public void setLastState(V1ContainerState lastState) {
    this.lastState = lastState;
  }


  public V1ContainerStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name is a DNS_LABEL representing the unique name of the container. Each container in a pod must have a unique name across all container types. Cannot be updated.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ContainerStatus ready(Boolean ready) {

    this.ready = ready;
    return this;
  }

   /**
   * Ready specifies whether the container is currently passing its readiness check. The value will change as readiness probes keep executing. If no readiness probes are specified, this field defaults to true once the container is fully started (see Started field).  The value is typically used to determine whether a container is ready to accept traffic.
   * @return ready
  **/
  @jakarta.annotation.Nonnull
  public Boolean getReady() {
    return ready;
  }


  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  public V1ContainerStatus resources(V1ResourceRequirements resources) {

    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1ResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public V1ContainerStatus restartCount(Integer restartCount) {

    this.restartCount = restartCount;
    return this;
  }

   /**
   * RestartCount holds the number of times the container has been restarted. Kubelet makes an effort to always increment the value, but there are cases when the state may be lost due to node restarts and then the value may be reset to 0. The value is never negative.
   * @return restartCount
  **/
  @jakarta.annotation.Nonnull
  public Integer getRestartCount() {
    return restartCount;
  }


  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }


  public V1ContainerStatus started(Boolean started) {

    this.started = started;
    return this;
  }

   /**
   * Started indicates whether the container has finished its postStart lifecycle hook and passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. In both cases, startup probes will run again. Is always true when no startupProbe is defined and container is running and has passed the postStart lifecycle hook. The null value must be treated the same as false.
   * @return started
  **/
  @jakarta.annotation.Nullable
  public Boolean getStarted() {
    return started;
  }


  public void setStarted(Boolean started) {
    this.started = started;
  }


  public V1ContainerStatus state(V1ContainerState state) {

    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  public V1ContainerState getState() {
    return state;
  }


  public void setState(V1ContainerState state) {
    this.state = state;
  }


  public V1ContainerStatus volumeMounts(List<V1VolumeMountStatus> volumeMounts) {

    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1ContainerStatus addVolumeMountsItem(V1VolumeMountStatus volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Status of volume mounts.
   * @return volumeMounts
  **/
  @jakarta.annotation.Nullable
  public List<V1VolumeMountStatus> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1VolumeMountStatus> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStatus v1ContainerStatus = (V1ContainerStatus) o;
    return Objects.equals(this.allocatedResources, v1ContainerStatus.allocatedResources) &&
        Objects.equals(this.containerID, v1ContainerStatus.containerID) &&
        Objects.equals(this.image, v1ContainerStatus.image) &&
        Objects.equals(this.imageID, v1ContainerStatus.imageID) &&
        Objects.equals(this.lastState, v1ContainerStatus.lastState) &&
        Objects.equals(this.name, v1ContainerStatus.name) &&
        Objects.equals(this.ready, v1ContainerStatus.ready) &&
        Objects.equals(this.resources, v1ContainerStatus.resources) &&
        Objects.equals(this.restartCount, v1ContainerStatus.restartCount) &&
        Objects.equals(this.started, v1ContainerStatus.started) &&
        Objects.equals(this.state, v1ContainerStatus.state) &&
        Objects.equals(this.volumeMounts, v1ContainerStatus.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedResources, containerID, image, imageID, lastState, name, ready, resources, restartCount, started, state, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStatus {\n");
    sb.append("    allocatedResources: ").append(toIndentedString(allocatedResources)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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
    openapiFields.add("allocatedResources");
    openapiFields.add("containerID");
    openapiFields.add("image");
    openapiFields.add("imageID");
    openapiFields.add("lastState");
    openapiFields.add("name");
    openapiFields.add("ready");
    openapiFields.add("resources");
    openapiFields.add("restartCount");
    openapiFields.add("started");
    openapiFields.add("state");
    openapiFields.add("volumeMounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("imageID");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("ready");
    openapiRequiredFields.add("restartCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ContainerStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ContainerStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ContainerStatus is not found in the empty JSON string", V1ContainerStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ContainerStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ContainerStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ContainerStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("containerID") != null && !jsonObj.get("containerID").isJsonNull()) && !jsonObj.get("containerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerID").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (!jsonObj.get("imageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageID").toString()));
      }
      // validate the optional field `lastState`
      if (jsonObj.get("lastState") != null && !jsonObj.get("lastState").isJsonNull()) {
        V1ContainerState.validateJsonObject(jsonObj.getAsJsonObject("lastState"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1ResourceRequirements.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        V1ContainerState.validateJsonObject(jsonObj.getAsJsonObject("state"));
      }
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        JsonArray jsonArrayvolumeMounts = jsonObj.getAsJsonArray("volumeMounts");
        if (jsonArrayvolumeMounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeMounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeMounts` to be an array in the JSON string but got `%s`", jsonObj.get("volumeMounts").toString()));
          }

          // validate the optional field `volumeMounts` (array)
          for (int i = 0; i < jsonArrayvolumeMounts.size(); i++) {
            V1VolumeMountStatus.validateJsonObject(jsonArrayvolumeMounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ContainerStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ContainerStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ContainerStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ContainerStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ContainerStatus>() {
           @Override
           public void write(JsonWriter out, V1ContainerStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ContainerStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ContainerStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ContainerStatus
  * @throws IOException if the JSON string is invalid with respect to V1ContainerStatus
  */
  public static V1ContainerStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ContainerStatus.class);
  }

 /**
  * Convert an instance of V1ContainerStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
