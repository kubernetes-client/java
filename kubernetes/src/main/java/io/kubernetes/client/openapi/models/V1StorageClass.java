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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1TopologySelectorTerm;
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
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1StorageClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_ALLOW_VOLUME_EXPANSION = "allowVolumeExpansion";
  @SerializedName(SERIALIZED_NAME_ALLOW_VOLUME_EXPANSION)
  private Boolean allowVolumeExpansion;

  public static final String SERIALIZED_NAME_ALLOWED_TOPOLOGIES = "allowedTopologies";
  @SerializedName(SERIALIZED_NAME_ALLOWED_TOPOLOGIES)
  private List<V1TopologySelectorTerm> allowedTopologies;

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_MOUNT_OPTIONS = "mountOptions";
  @SerializedName(SERIALIZED_NAME_MOUNT_OPTIONS)
  private List<String> mountOptions;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, String> parameters = new HashMap<>();

  public static final String SERIALIZED_NAME_PROVISIONER = "provisioner";
  @SerializedName(SERIALIZED_NAME_PROVISIONER)
  private String provisioner;

  public static final String SERIALIZED_NAME_RECLAIM_POLICY = "reclaimPolicy";
  @SerializedName(SERIALIZED_NAME_RECLAIM_POLICY)
  private String reclaimPolicy;

  public static final String SERIALIZED_NAME_VOLUME_BINDING_MODE = "volumeBindingMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_BINDING_MODE)
  private String volumeBindingMode;

  public V1StorageClass() {
  }

  public V1StorageClass allowVolumeExpansion(Boolean allowVolumeExpansion) {

    this.allowVolumeExpansion = allowVolumeExpansion;
    return this;
  }

   /**
   * allowVolumeExpansion shows whether the storage class allow volume expand.
   * @return allowVolumeExpansion
  **/
  @jakarta.annotation.Nullable
  public Boolean getAllowVolumeExpansion() {
    return allowVolumeExpansion;
  }


  public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
  }


  public V1StorageClass allowedTopologies(List<V1TopologySelectorTerm> allowedTopologies) {

    this.allowedTopologies = allowedTopologies;
    return this;
  }

  public V1StorageClass addAllowedTopologiesItem(V1TopologySelectorTerm allowedTopologiesItem) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies = new ArrayList<>();
    }
    this.allowedTopologies.add(allowedTopologiesItem);
    return this;
  }

   /**
   * allowedTopologies restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
   * @return allowedTopologies
  **/
  @jakarta.annotation.Nullable
  public List<V1TopologySelectorTerm> getAllowedTopologies() {
    return allowedTopologies;
  }


  public void setAllowedTopologies(List<V1TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
  }


  public V1StorageClass apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @jakarta.annotation.Nullable
  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1StorageClass kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @jakarta.annotation.Nullable
  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1StorageClass metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1StorageClass mountOptions(List<String> mountOptions) {

    this.mountOptions = mountOptions;
    return this;
  }

  public V1StorageClass addMountOptionsItem(String mountOptionsItem) {
    if (this.mountOptions == null) {
      this.mountOptions = new ArrayList<>();
    }
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

   /**
   * mountOptions controls the mountOptions for dynamically provisioned PersistentVolumes of this storage class. e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount of the PVs will simply fail if one is invalid.
   * @return mountOptions
  **/
  @jakarta.annotation.Nullable
  public List<String> getMountOptions() {
    return mountOptions;
  }


  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }


  public V1StorageClass parameters(Map<String, String> parameters) {

    this.parameters = parameters;
    return this;
  }

  public V1StorageClass putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * parameters holds the parameters for the provisioner that should create volumes of this storage class.
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }


  public V1StorageClass provisioner(String provisioner) {

    this.provisioner = provisioner;
    return this;
  }

   /**
   * provisioner indicates the type of the provisioner.
   * @return provisioner
  **/
  @jakarta.annotation.Nonnull
  public String getProvisioner() {
    return provisioner;
  }


  public void setProvisioner(String provisioner) {
    this.provisioner = provisioner;
  }


  public V1StorageClass reclaimPolicy(String reclaimPolicy) {

    this.reclaimPolicy = reclaimPolicy;
    return this;
  }

   /**
   * reclaimPolicy controls the reclaimPolicy for dynamically provisioned PersistentVolumes of this storage class. Defaults to Delete.
   * @return reclaimPolicy
  **/
  @jakarta.annotation.Nullable
  public String getReclaimPolicy() {
    return reclaimPolicy;
  }


  public void setReclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
  }


  public V1StorageClass volumeBindingMode(String volumeBindingMode) {

    this.volumeBindingMode = volumeBindingMode;
    return this;
  }

   /**
   * volumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
   * @return volumeBindingMode
  **/
  @jakarta.annotation.Nullable
  public String getVolumeBindingMode() {
    return volumeBindingMode;
  }


  public void setVolumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StorageClass v1StorageClass = (V1StorageClass) o;
    return Objects.equals(this.allowVolumeExpansion, v1StorageClass.allowVolumeExpansion) &&
        Objects.equals(this.allowedTopologies, v1StorageClass.allowedTopologies) &&
        Objects.equals(this.apiVersion, v1StorageClass.apiVersion) &&
        Objects.equals(this.kind, v1StorageClass.kind) &&
        Objects.equals(this.metadata, v1StorageClass.metadata) &&
        Objects.equals(this.mountOptions, v1StorageClass.mountOptions) &&
        Objects.equals(this.parameters, v1StorageClass.parameters) &&
        Objects.equals(this.provisioner, v1StorageClass.provisioner) &&
        Objects.equals(this.reclaimPolicy, v1StorageClass.reclaimPolicy) &&
        Objects.equals(this.volumeBindingMode, v1StorageClass.volumeBindingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StorageClass {\n");
    sb.append("    allowVolumeExpansion: ").append(toIndentedString(allowVolumeExpansion)).append("\n");
    sb.append("    allowedTopologies: ").append(toIndentedString(allowedTopologies)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    provisioner: ").append(toIndentedString(provisioner)).append("\n");
    sb.append("    reclaimPolicy: ").append(toIndentedString(reclaimPolicy)).append("\n");
    sb.append("    volumeBindingMode: ").append(toIndentedString(volumeBindingMode)).append("\n");
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
    openapiFields.add("allowVolumeExpansion");
    openapiFields.add("allowedTopologies");
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("mountOptions");
    openapiFields.add("parameters");
    openapiFields.add("provisioner");
    openapiFields.add("reclaimPolicy");
    openapiFields.add("volumeBindingMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("provisioner");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1StorageClass
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1StorageClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StorageClass is not found in the empty JSON string", V1StorageClass.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1StorageClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StorageClass` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1StorageClass.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("allowedTopologies") != null && !jsonObj.get("allowedTopologies").isJsonNull()) {
        JsonArray jsonArrayallowedTopologies = jsonObj.getAsJsonArray("allowedTopologies");
        if (jsonArrayallowedTopologies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allowedTopologies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowedTopologies` to be an array in the JSON string but got `%s`", jsonObj.get("allowedTopologies").toString()));
          }

          // validate the optional field `allowedTopologies` (array)
          for (int i = 0; i < jsonArrayallowedTopologies.size(); i++) {
            V1TopologySelectorTerm.validateJsonObject(jsonArrayallowedTopologies.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mountOptions") != null && !jsonObj.get("mountOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountOptions` to be an array in the JSON string but got `%s`", jsonObj.get("mountOptions").toString()));
      }
      if (!jsonObj.get("provisioner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisioner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provisioner").toString()));
      }
      if ((jsonObj.get("reclaimPolicy") != null && !jsonObj.get("reclaimPolicy").isJsonNull()) && !jsonObj.get("reclaimPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reclaimPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reclaimPolicy").toString()));
      }
      if ((jsonObj.get("volumeBindingMode") != null && !jsonObj.get("volumeBindingMode").isJsonNull()) && !jsonObj.get("volumeBindingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeBindingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeBindingMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StorageClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StorageClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StorageClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StorageClass.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StorageClass>() {
           @Override
           public void write(JsonWriter out, V1StorageClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StorageClass read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1StorageClass given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1StorageClass
  * @throws IOException if the JSON string is invalid with respect to V1StorageClass
  */
  public static V1StorageClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StorageClass.class);
  }

 /**
  * Convert an instance of V1StorageClass to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
