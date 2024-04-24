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
import java.io.IOException;

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
 * Represents a Persistent Disk resource in AWS.  An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1AWSElasticBlockStoreVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";
  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public V1AWSElasticBlockStoreVolumeSource() {
  }

  public V1AWSElasticBlockStoreVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1AWSElasticBlockStoreVolumeSource partition(Integer partition) {

    this.partition = partition;
    return this;
  }

   /**
   * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \&quot;1\&quot;. Similarly, the volume partition for /dev/sda is \&quot;0\&quot; (or you can leave the property empty).
   * @return partition
  **/
  @jakarta.annotation.Nullable
  public Integer getPartition() {
    return partition;
  }


  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public V1AWSElasticBlockStoreVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly value true will force the readOnly setting in VolumeMounts. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1AWSElasticBlockStoreVolumeSource volumeID(String volumeID) {

    this.volumeID = volumeID;
    return this;
  }

   /**
   * volumeID is unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   * @return volumeID
  **/
  @jakarta.annotation.Nonnull
  public String getVolumeID() {
    return volumeID;
  }


  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AWSElasticBlockStoreVolumeSource v1AWSElasticBlockStoreVolumeSource = (V1AWSElasticBlockStoreVolumeSource) o;
    return Objects.equals(this.fsType, v1AWSElasticBlockStoreVolumeSource.fsType) &&
        Objects.equals(this.partition, v1AWSElasticBlockStoreVolumeSource.partition) &&
        Objects.equals(this.readOnly, v1AWSElasticBlockStoreVolumeSource.readOnly) &&
        Objects.equals(this.volumeID, v1AWSElasticBlockStoreVolumeSource.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, readOnly, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AWSElasticBlockStoreVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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
    openapiFields.add("partition");
    openapiFields.add("readOnly");
    openapiFields.add("volumeID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("volumeID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1AWSElasticBlockStoreVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1AWSElasticBlockStoreVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AWSElasticBlockStoreVolumeSource is not found in the empty JSON string", V1AWSElasticBlockStoreVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1AWSElasticBlockStoreVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AWSElasticBlockStoreVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AWSElasticBlockStoreVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("volumeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AWSElasticBlockStoreVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AWSElasticBlockStoreVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AWSElasticBlockStoreVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AWSElasticBlockStoreVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AWSElasticBlockStoreVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1AWSElasticBlockStoreVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AWSElasticBlockStoreVolumeSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1AWSElasticBlockStoreVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1AWSElasticBlockStoreVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1AWSElasticBlockStoreVolumeSource
  */
  public static V1AWSElasticBlockStoreVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AWSElasticBlockStoreVolumeSource.class);
  }

 /**
  * Convert an instance of V1AWSElasticBlockStoreVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
