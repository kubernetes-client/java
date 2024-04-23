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
import io.kubernetes.client.openapi.models.V1SecretReference;
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
 * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ISCSIPersistentVolumeSource {
  public static final String SERIALIZED_NAME_CHAP_AUTH_DISCOVERY = "chapAuthDiscovery";
  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_DISCOVERY)
  private Boolean chapAuthDiscovery;

  public static final String SERIALIZED_NAME_CHAP_AUTH_SESSION = "chapAuthSession";
  @SerializedName(SERIALIZED_NAME_CHAP_AUTH_SESSION)
  private Boolean chapAuthSession;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_INITIATOR_NAME = "initiatorName";
  @SerializedName(SERIALIZED_NAME_INITIATOR_NAME)
  private String initiatorName;

  public static final String SERIALIZED_NAME_IQN = "iqn";
  @SerializedName(SERIALIZED_NAME_IQN)
  private String iqn;

  public static final String SERIALIZED_NAME_ISCSI_INTERFACE = "iscsiInterface";
  @SerializedName(SERIALIZED_NAME_ISCSI_INTERFACE)
  private String iscsiInterface;

  public static final String SERIALIZED_NAME_LUN = "lun";
  @SerializedName(SERIALIZED_NAME_LUN)
  private Integer lun;

  public static final String SERIALIZED_NAME_PORTALS = "portals";
  @SerializedName(SERIALIZED_NAME_PORTALS)
  private List<String> portals;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretReference secretRef;

  public static final String SERIALIZED_NAME_TARGET_PORTAL = "targetPortal";
  @SerializedName(SERIALIZED_NAME_TARGET_PORTAL)
  private String targetPortal;

  public V1ISCSIPersistentVolumeSource() {
  }

  public V1ISCSIPersistentVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {

    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

   /**
   * chapAuthDiscovery defines whether support iSCSI Discovery CHAP authentication
   * @return chapAuthDiscovery
  **/
  @jakarta.annotation.Nullable
  public Boolean getChapAuthDiscovery() {
    return chapAuthDiscovery;
  }


  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }


  public V1ISCSIPersistentVolumeSource chapAuthSession(Boolean chapAuthSession) {

    this.chapAuthSession = chapAuthSession;
    return this;
  }

   /**
   * chapAuthSession defines whether support iSCSI Session CHAP authentication
   * @return chapAuthSession
  **/
  @jakarta.annotation.Nullable
  public Boolean getChapAuthSession() {
    return chapAuthSession;
  }


  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }


  public V1ISCSIPersistentVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1ISCSIPersistentVolumeSource initiatorName(String initiatorName) {

    this.initiatorName = initiatorName;
    return this;
  }

   /**
   * initiatorName is the custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
   * @return initiatorName
  **/
  @jakarta.annotation.Nullable
  public String getInitiatorName() {
    return initiatorName;
  }


  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }


  public V1ISCSIPersistentVolumeSource iqn(String iqn) {

    this.iqn = iqn;
    return this;
  }

   /**
   * iqn is Target iSCSI Qualified Name.
   * @return iqn
  **/
  @jakarta.annotation.Nonnull
  public String getIqn() {
    return iqn;
  }


  public void setIqn(String iqn) {
    this.iqn = iqn;
  }


  public V1ISCSIPersistentVolumeSource iscsiInterface(String iscsiInterface) {

    this.iscsiInterface = iscsiInterface;
    return this;
  }

   /**
   * iscsiInterface is the interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   * @return iscsiInterface
  **/
  @jakarta.annotation.Nullable
  public String getIscsiInterface() {
    return iscsiInterface;
  }


  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }


  public V1ISCSIPersistentVolumeSource lun(Integer lun) {

    this.lun = lun;
    return this;
  }

   /**
   * lun is iSCSI Target Lun number.
   * @return lun
  **/
  @jakarta.annotation.Nonnull
  public Integer getLun() {
    return lun;
  }


  public void setLun(Integer lun) {
    this.lun = lun;
  }


  public V1ISCSIPersistentVolumeSource portals(List<String> portals) {

    this.portals = portals;
    return this;
  }

  public V1ISCSIPersistentVolumeSource addPortalsItem(String portalsItem) {
    if (this.portals == null) {
      this.portals = new ArrayList<>();
    }
    this.portals.add(portalsItem);
    return this;
  }

   /**
   * portals is the iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return portals
  **/
  @jakarta.annotation.Nullable
  public List<String> getPortals() {
    return portals;
  }


  public void setPortals(List<String> portals) {
    this.portals = portals;
  }


  public V1ISCSIPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1ISCSIPersistentVolumeSource secretRef(V1SecretReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1ISCSIPersistentVolumeSource targetPortal(String targetPortal) {

    this.targetPortal = targetPortal;
    return this;
  }

   /**
   * targetPortal is iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return targetPortal
  **/
  @jakarta.annotation.Nonnull
  public String getTargetPortal() {
    return targetPortal;
  }


  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ISCSIPersistentVolumeSource v1ISCSIPersistentVolumeSource = (V1ISCSIPersistentVolumeSource) o;
    return Objects.equals(this.chapAuthDiscovery, v1ISCSIPersistentVolumeSource.chapAuthDiscovery) &&
        Objects.equals(this.chapAuthSession, v1ISCSIPersistentVolumeSource.chapAuthSession) &&
        Objects.equals(this.fsType, v1ISCSIPersistentVolumeSource.fsType) &&
        Objects.equals(this.initiatorName, v1ISCSIPersistentVolumeSource.initiatorName) &&
        Objects.equals(this.iqn, v1ISCSIPersistentVolumeSource.iqn) &&
        Objects.equals(this.iscsiInterface, v1ISCSIPersistentVolumeSource.iscsiInterface) &&
        Objects.equals(this.lun, v1ISCSIPersistentVolumeSource.lun) &&
        Objects.equals(this.portals, v1ISCSIPersistentVolumeSource.portals) &&
        Objects.equals(this.readOnly, v1ISCSIPersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ISCSIPersistentVolumeSource.secretRef) &&
        Objects.equals(this.targetPortal, v1ISCSIPersistentVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ISCSIPersistentVolumeSource {\n");
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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
    openapiFields.add("chapAuthDiscovery");
    openapiFields.add("chapAuthSession");
    openapiFields.add("fsType");
    openapiFields.add("initiatorName");
    openapiFields.add("iqn");
    openapiFields.add("iscsiInterface");
    openapiFields.add("lun");
    openapiFields.add("portals");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("targetPortal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iqn");
    openapiRequiredFields.add("lun");
    openapiRequiredFields.add("targetPortal");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ISCSIPersistentVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ISCSIPersistentVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ISCSIPersistentVolumeSource is not found in the empty JSON string", V1ISCSIPersistentVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ISCSIPersistentVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ISCSIPersistentVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ISCSIPersistentVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if ((jsonObj.get("initiatorName") != null && !jsonObj.get("initiatorName").isJsonNull()) && !jsonObj.get("initiatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initiatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initiatorName").toString()));
      }
      if (!jsonObj.get("iqn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iqn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iqn").toString()));
      }
      if ((jsonObj.get("iscsiInterface") != null && !jsonObj.get("iscsiInterface").isJsonNull()) && !jsonObj.get("iscsiInterface").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iscsiInterface` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iscsiInterface").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("portals") != null && !jsonObj.get("portals").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `portals` to be an array in the JSON string but got `%s`", jsonObj.get("portals").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
      }
      if (!jsonObj.get("targetPortal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPortal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetPortal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ISCSIPersistentVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ISCSIPersistentVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ISCSIPersistentVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ISCSIPersistentVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ISCSIPersistentVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1ISCSIPersistentVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ISCSIPersistentVolumeSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ISCSIPersistentVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ISCSIPersistentVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1ISCSIPersistentVolumeSource
  */
  public static V1ISCSIPersistentVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ISCSIPersistentVolumeSource.class);
  }

 /**
  * Convert an instance of V1ISCSIPersistentVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
