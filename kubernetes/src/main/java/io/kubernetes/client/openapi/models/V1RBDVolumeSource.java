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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
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
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1RBDVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @jakarta.annotation.Nonnull
  private String image;

  public static final String SERIALIZED_NAME_KEYRING = "keyring";
  @SerializedName(SERIALIZED_NAME_KEYRING)
  @jakarta.annotation.Nullable
  private String keyring;

  public static final String SERIALIZED_NAME_MONITORS = "monitors";
  @SerializedName(SERIALIZED_NAME_MONITORS)
  @jakarta.annotation.Nonnull
  private List<String> monitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  @jakarta.annotation.Nullable
  private String pool;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  @jakarta.annotation.Nullable
  private V1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  @jakarta.annotation.Nullable
  private String user;

  public V1RBDVolumeSource() {
  }

  public V1RBDVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1RBDVolumeSource image(@jakarta.annotation.Nonnull String image) {
    this.image = image;
    return this;
  }

  /**
   * image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return image
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "image is the rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getImage() {
    return image;
  }

  public void setImage(@jakarta.annotation.Nonnull String image) {
    this.image = image;
  }


  public V1RBDVolumeSource keyring(@jakarta.annotation.Nullable String keyring) {
    this.keyring = keyring;
    return this;
  }

  /**
   * keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return keyring
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getKeyring() {
    return keyring;
  }

  public void setKeyring(@jakarta.annotation.Nullable String keyring) {
    this.keyring = keyring;
  }


  public V1RBDVolumeSource monitors(@jakarta.annotation.Nonnull List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public V1RBDVolumeSource addMonitorsItem(String monitorsItem) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<>();
    }
    this.monitors.add(monitorsItem);
    return this;
  }

  /**
   * monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return monitors
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "monitors is a collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(@jakarta.annotation.Nonnull List<String> monitors) {
    this.monitors = monitors;
  }


  public V1RBDVolumeSource pool(@jakarta.annotation.Nullable String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return pool
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "pool is the rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getPool() {
    return pool;
  }

  public void setPool(@jakarta.annotation.Nullable String pool) {
    this.pool = pool;
  }


  public V1RBDVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1RBDVolumeSource secretRef(@jakarta.annotation.Nullable V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   * @return secretRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(@jakarta.annotation.Nullable V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1RBDVolumeSource user(@jakarta.annotation.Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return user
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "user is the rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getUser() {
    return user;
  }

  public void setUser(@jakarta.annotation.Nullable String user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RBDVolumeSource v1RBDVolumeSource = (V1RBDVolumeSource) o;
    return Objects.equals(this.fsType, v1RBDVolumeSource.fsType) &&
        Objects.equals(this.image, v1RBDVolumeSource.image) &&
        Objects.equals(this.keyring, v1RBDVolumeSource.keyring) &&
        Objects.equals(this.monitors, v1RBDVolumeSource.monitors) &&
        Objects.equals(this.pool, v1RBDVolumeSource.pool) &&
        Objects.equals(this.readOnly, v1RBDVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1RBDVolumeSource.secretRef) &&
        Objects.equals(this.user, v1RBDVolumeSource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RBDVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keyring: ").append(toIndentedString(keyring)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("image");
    openapiFields.add("keyring");
    openapiFields.add("monitors");
    openapiFields.add("pool");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("monitors");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1RBDVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1RBDVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1RBDVolumeSource is not found in the empty JSON string", V1RBDVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1RBDVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1RBDVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1RBDVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("keyring") != null && !jsonObj.get("keyring").isJsonNull()) && !jsonObj.get("keyring").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyring` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyring").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("monitors") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("monitors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `monitors` to be an array in the JSON string but got `%s`", jsonObj.get("monitors").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1LocalObjectReference.validateJsonElement(jsonObj.get("secretRef"));
      }
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1RBDVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1RBDVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1RBDVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1RBDVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1RBDVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1RBDVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1RBDVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1RBDVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1RBDVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1RBDVolumeSource
   */
  public static V1RBDVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1RBDVolumeSource.class);
  }

  /**
   * Convert an instance of V1RBDVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
