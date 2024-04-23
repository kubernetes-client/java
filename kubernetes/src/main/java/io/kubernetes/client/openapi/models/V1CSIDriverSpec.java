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
import io.kubernetes.client.openapi.models.StorageV1TokenRequest;
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
 * CSIDriverSpec is the specification of a CSIDriver.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CSIDriverSpec {
  public static final String SERIALIZED_NAME_ATTACH_REQUIRED = "attachRequired";
  @SerializedName(SERIALIZED_NAME_ATTACH_REQUIRED)
  private Boolean attachRequired;

  public static final String SERIALIZED_NAME_FS_GROUP_POLICY = "fsGroupPolicy";
  @SerializedName(SERIALIZED_NAME_FS_GROUP_POLICY)
  private String fsGroupPolicy;

  public static final String SERIALIZED_NAME_POD_INFO_ON_MOUNT = "podInfoOnMount";
  @SerializedName(SERIALIZED_NAME_POD_INFO_ON_MOUNT)
  private Boolean podInfoOnMount;

  public static final String SERIALIZED_NAME_REQUIRES_REPUBLISH = "requiresRepublish";
  @SerializedName(SERIALIZED_NAME_REQUIRES_REPUBLISH)
  private Boolean requiresRepublish;

  public static final String SERIALIZED_NAME_SE_LINUX_MOUNT = "seLinuxMount";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_MOUNT)
  private Boolean seLinuxMount;

  public static final String SERIALIZED_NAME_STORAGE_CAPACITY = "storageCapacity";
  @SerializedName(SERIALIZED_NAME_STORAGE_CAPACITY)
  private Boolean storageCapacity;

  public static final String SERIALIZED_NAME_TOKEN_REQUESTS = "tokenRequests";
  @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTS)
  private List<StorageV1TokenRequest> tokenRequests;

  public static final String SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES = "volumeLifecycleModes";
  @SerializedName(SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES)
  private List<String> volumeLifecycleModes;

  public V1CSIDriverSpec() {
  }

  public V1CSIDriverSpec attachRequired(Boolean attachRequired) {

    this.attachRequired = attachRequired;
    return this;
  }

   /**
   * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.  This field is immutable.
   * @return attachRequired
  **/
  @jakarta.annotation.Nullable
  public Boolean getAttachRequired() {
    return attachRequired;
  }


  public void setAttachRequired(Boolean attachRequired) {
    this.attachRequired = attachRequired;
  }


  public V1CSIDriverSpec fsGroupPolicy(String fsGroupPolicy) {

    this.fsGroupPolicy = fsGroupPolicy;
    return this;
  }

   /**
   * fsGroupPolicy defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.  This field was immutable in Kubernetes &lt; 1.29 and now is mutable.  Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
   * @return fsGroupPolicy
  **/
  @jakarta.annotation.Nullable
  public String getFsGroupPolicy() {
    return fsGroupPolicy;
  }


  public void setFsGroupPolicy(String fsGroupPolicy) {
    this.fsGroupPolicy = fsGroupPolicy;
  }


  public V1CSIDriverSpec podInfoOnMount(Boolean podInfoOnMount) {

    this.podInfoOnMount = podInfoOnMount;
    return this;
  }

   /**
   * podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations, if set to true. If set to false, pod information will not be passed on mount. Default is false.  The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext.  The following VolumeContext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. \&quot;csi.storage.k8s.io/pod.name\&quot;: pod.Name \&quot;csi.storage.k8s.io/pod.namespace\&quot;: pod.Namespace \&quot;csi.storage.k8s.io/pod.uid\&quot;: string(pod.UID) \&quot;csi.storage.k8s.io/ephemeral\&quot;: \&quot;true\&quot; if the volume is an ephemeral inline volume                                 defined by a CSIVolumeSource, otherwise \&quot;false\&quot;  \&quot;csi.storage.k8s.io/ephemeral\&quot; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the \&quot;Persistent\&quot; and \&quot;Ephemeral\&quot; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.  This field was immutable in Kubernetes &lt; 1.29 and now is mutable.
   * @return podInfoOnMount
  **/
  @jakarta.annotation.Nullable
  public Boolean getPodInfoOnMount() {
    return podInfoOnMount;
  }


  public void setPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
  }


  public V1CSIDriverSpec requiresRepublish(Boolean requiresRepublish) {

    this.requiresRepublish = requiresRepublish;
    return this;
  }

   /**
   * requiresRepublish indicates the CSI driver wants &#x60;NodePublishVolume&#x60; being periodically called to reflect any possible change in the mounted volume. This field defaults to false.  Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
   * @return requiresRepublish
  **/
  @jakarta.annotation.Nullable
  public Boolean getRequiresRepublish() {
    return requiresRepublish;
  }


  public void setRequiresRepublish(Boolean requiresRepublish) {
    this.requiresRepublish = requiresRepublish;
  }


  public V1CSIDriverSpec seLinuxMount(Boolean seLinuxMount) {

    this.seLinuxMount = seLinuxMount;
    return this;
  }

   /**
   * seLinuxMount specifies if the CSI driver supports \&quot;-o context\&quot; mount option.  When \&quot;true\&quot;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different &#x60;-o context&#x60; options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with \&quot;-o context&#x3D;xyz\&quot; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.  When \&quot;false\&quot;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.  Default is \&quot;false\&quot;.
   * @return seLinuxMount
  **/
  @jakarta.annotation.Nullable
  public Boolean getSeLinuxMount() {
    return seLinuxMount;
  }


  public void setSeLinuxMount(Boolean seLinuxMount) {
    this.seLinuxMount = seLinuxMount;
  }


  public V1CSIDriverSpec storageCapacity(Boolean storageCapacity) {

    this.storageCapacity = storageCapacity;
    return this;
  }

   /**
   * storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information, if set to true.  The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.  Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.  This field was immutable in Kubernetes &lt;&#x3D; 1.22 and now is mutable.
   * @return storageCapacity
  **/
  @jakarta.annotation.Nullable
  public Boolean getStorageCapacity() {
    return storageCapacity;
  }


  public void setStorageCapacity(Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
  }


  public V1CSIDriverSpec tokenRequests(List<StorageV1TokenRequest> tokenRequests) {

    this.tokenRequests = tokenRequests;
    return this;
  }

  public V1CSIDriverSpec addTokenRequestsItem(StorageV1TokenRequest tokenRequestsItem) {
    if (this.tokenRequests == null) {
      this.tokenRequests = new ArrayList<>();
    }
    this.tokenRequests.add(tokenRequestsItem);
    return this;
  }

   /**
   * tokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: \&quot;csi.storage.k8s.io/serviceAccount.tokens\&quot;: {   \&quot;&lt;audience&gt;\&quot;: {     \&quot;token\&quot;: &lt;token&gt;,     \&quot;expirationTimestamp\&quot;: &lt;expiration timestamp in RFC3339&gt;,   },   ... }  Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
   * @return tokenRequests
  **/
  @jakarta.annotation.Nullable
  public List<StorageV1TokenRequest> getTokenRequests() {
    return tokenRequests;
  }


  public void setTokenRequests(List<StorageV1TokenRequest> tokenRequests) {
    this.tokenRequests = tokenRequests;
  }


  public V1CSIDriverSpec volumeLifecycleModes(List<String> volumeLifecycleModes) {

    this.volumeLifecycleModes = volumeLifecycleModes;
    return this;
  }

  public V1CSIDriverSpec addVolumeLifecycleModesItem(String volumeLifecycleModesItem) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new ArrayList<>();
    }
    this.volumeLifecycleModes.add(volumeLifecycleModesItem);
    return this;
  }

   /**
   * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is \&quot;Persistent\&quot;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism.  The other mode is \&quot;Ephemeral\&quot;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume.  For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.  This field is beta. This field is immutable.
   * @return volumeLifecycleModes
  **/
  @jakarta.annotation.Nullable
  public List<String> getVolumeLifecycleModes() {
    return volumeLifecycleModes;
  }


  public void setVolumeLifecycleModes(List<String> volumeLifecycleModes) {
    this.volumeLifecycleModes = volumeLifecycleModes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIDriverSpec v1CSIDriverSpec = (V1CSIDriverSpec) o;
    return Objects.equals(this.attachRequired, v1CSIDriverSpec.attachRequired) &&
        Objects.equals(this.fsGroupPolicy, v1CSIDriverSpec.fsGroupPolicy) &&
        Objects.equals(this.podInfoOnMount, v1CSIDriverSpec.podInfoOnMount) &&
        Objects.equals(this.requiresRepublish, v1CSIDriverSpec.requiresRepublish) &&
        Objects.equals(this.seLinuxMount, v1CSIDriverSpec.seLinuxMount) &&
        Objects.equals(this.storageCapacity, v1CSIDriverSpec.storageCapacity) &&
        Objects.equals(this.tokenRequests, v1CSIDriverSpec.tokenRequests) &&
        Objects.equals(this.volumeLifecycleModes, v1CSIDriverSpec.volumeLifecycleModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachRequired, fsGroupPolicy, podInfoOnMount, requiresRepublish, seLinuxMount, storageCapacity, tokenRequests, volumeLifecycleModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIDriverSpec {\n");
    sb.append("    attachRequired: ").append(toIndentedString(attachRequired)).append("\n");
    sb.append("    fsGroupPolicy: ").append(toIndentedString(fsGroupPolicy)).append("\n");
    sb.append("    podInfoOnMount: ").append(toIndentedString(podInfoOnMount)).append("\n");
    sb.append("    requiresRepublish: ").append(toIndentedString(requiresRepublish)).append("\n");
    sb.append("    seLinuxMount: ").append(toIndentedString(seLinuxMount)).append("\n");
    sb.append("    storageCapacity: ").append(toIndentedString(storageCapacity)).append("\n");
    sb.append("    tokenRequests: ").append(toIndentedString(tokenRequests)).append("\n");
    sb.append("    volumeLifecycleModes: ").append(toIndentedString(volumeLifecycleModes)).append("\n");
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
    openapiFields.add("attachRequired");
    openapiFields.add("fsGroupPolicy");
    openapiFields.add("podInfoOnMount");
    openapiFields.add("requiresRepublish");
    openapiFields.add("seLinuxMount");
    openapiFields.add("storageCapacity");
    openapiFields.add("tokenRequests");
    openapiFields.add("volumeLifecycleModes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CSIDriverSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CSIDriverSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CSIDriverSpec is not found in the empty JSON string", V1CSIDriverSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CSIDriverSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CSIDriverSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fsGroupPolicy") != null && !jsonObj.get("fsGroupPolicy").isJsonNull()) && !jsonObj.get("fsGroupPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsGroupPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsGroupPolicy").toString()));
      }
      if (jsonObj.get("tokenRequests") != null && !jsonObj.get("tokenRequests").isJsonNull()) {
        JsonArray jsonArraytokenRequests = jsonObj.getAsJsonArray("tokenRequests");
        if (jsonArraytokenRequests != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tokenRequests").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tokenRequests` to be an array in the JSON string but got `%s`", jsonObj.get("tokenRequests").toString()));
          }

          // validate the optional field `tokenRequests` (array)
          for (int i = 0; i < jsonArraytokenRequests.size(); i++) {
            StorageV1TokenRequest.validateJsonObject(jsonArraytokenRequests.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumeLifecycleModes") != null && !jsonObj.get("volumeLifecycleModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeLifecycleModes` to be an array in the JSON string but got `%s`", jsonObj.get("volumeLifecycleModes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CSIDriverSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CSIDriverSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CSIDriverSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CSIDriverSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CSIDriverSpec>() {
           @Override
           public void write(JsonWriter out, V1CSIDriverSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CSIDriverSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CSIDriverSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CSIDriverSpec
  * @throws IOException if the JSON string is invalid with respect to V1CSIDriverSpec
  */
  public static V1CSIDriverSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CSIDriverSpec.class);
  }

 /**
  * Convert an instance of V1CSIDriverSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
