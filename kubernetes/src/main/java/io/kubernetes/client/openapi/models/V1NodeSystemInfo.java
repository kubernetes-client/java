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
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1NodeSystemInfo {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_BOOT_I_D = "bootID";
  @SerializedName(SERIALIZED_NAME_BOOT_I_D)
  private String bootID;

  public static final String SERIALIZED_NAME_CONTAINER_RUNTIME_VERSION = "containerRuntimeVersion";
  @SerializedName(SERIALIZED_NAME_CONTAINER_RUNTIME_VERSION)
  private String containerRuntimeVersion;

  public static final String SERIALIZED_NAME_KERNEL_VERSION = "kernelVersion";
  @SerializedName(SERIALIZED_NAME_KERNEL_VERSION)
  private String kernelVersion;

  public static final String SERIALIZED_NAME_KUBE_PROXY_VERSION = "kubeProxyVersion";
  @SerializedName(SERIALIZED_NAME_KUBE_PROXY_VERSION)
  private String kubeProxyVersion;

  public static final String SERIALIZED_NAME_KUBELET_VERSION = "kubeletVersion";
  @SerializedName(SERIALIZED_NAME_KUBELET_VERSION)
  private String kubeletVersion;

  public static final String SERIALIZED_NAME_MACHINE_I_D = "machineID";
  @SerializedName(SERIALIZED_NAME_MACHINE_I_D)
  private String machineID;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operatingSystem";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private String operatingSystem;

  public static final String SERIALIZED_NAME_OS_IMAGE = "osImage";
  @SerializedName(SERIALIZED_NAME_OS_IMAGE)
  private String osImage;

  public static final String SERIALIZED_NAME_SYSTEM_U_U_I_D = "systemUUID";
  @SerializedName(SERIALIZED_NAME_SYSTEM_U_U_I_D)
  private String systemUUID;

  public V1NodeSystemInfo() {
  }

  public V1NodeSystemInfo architecture(String architecture) {

    this.architecture = architecture;
    return this;
  }

   /**
   * The Architecture reported by the node
   * @return architecture
  **/
  @jakarta.annotation.Nonnull
  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public V1NodeSystemInfo bootID(String bootID) {

    this.bootID = bootID;
    return this;
  }

   /**
   * Boot ID reported by the node.
   * @return bootID
  **/
  @jakarta.annotation.Nonnull
  public String getBootID() {
    return bootID;
  }


  public void setBootID(String bootID) {
    this.bootID = bootID;
  }


  public V1NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {

    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

   /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. containerd://1.4.2).
   * @return containerRuntimeVersion
  **/
  @jakarta.annotation.Nonnull
  public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }


  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }


  public V1NodeSystemInfo kernelVersion(String kernelVersion) {

    this.kernelVersion = kernelVersion;
    return this;
  }

   /**
   * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
   * @return kernelVersion
  **/
  @jakarta.annotation.Nonnull
  public String getKernelVersion() {
    return kernelVersion;
  }


  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }


  public V1NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {

    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

   /**
   * KubeProxy Version reported by the node.
   * @return kubeProxyVersion
  **/
  @jakarta.annotation.Nonnull
  public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }


  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }


  public V1NodeSystemInfo kubeletVersion(String kubeletVersion) {

    this.kubeletVersion = kubeletVersion;
    return this;
  }

   /**
   * Kubelet Version reported by the node.
   * @return kubeletVersion
  **/
  @jakarta.annotation.Nonnull
  public String getKubeletVersion() {
    return kubeletVersion;
  }


  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }


  public V1NodeSystemInfo machineID(String machineID) {

    this.machineID = machineID;
    return this;
  }

   /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
   * @return machineID
  **/
  @jakarta.annotation.Nonnull
  public String getMachineID() {
    return machineID;
  }


  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }


  public V1NodeSystemInfo operatingSystem(String operatingSystem) {

    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * The Operating System reported by the node
   * @return operatingSystem
  **/
  @jakarta.annotation.Nonnull
  public String getOperatingSystem() {
    return operatingSystem;
  }


  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public V1NodeSystemInfo osImage(String osImage) {

    this.osImage = osImage;
    return this;
  }

   /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   * @return osImage
  **/
  @jakarta.annotation.Nonnull
  public String getOsImage() {
    return osImage;
  }


  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }


  public V1NodeSystemInfo systemUUID(String systemUUID) {

    this.systemUUID = systemUUID;
    return this;
  }

   /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
   * @return systemUUID
  **/
  @jakarta.annotation.Nonnull
  public String getSystemUUID() {
    return systemUUID;
  }


  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSystemInfo v1NodeSystemInfo = (V1NodeSystemInfo) o;
    return Objects.equals(this.architecture, v1NodeSystemInfo.architecture) &&
        Objects.equals(this.bootID, v1NodeSystemInfo.bootID) &&
        Objects.equals(this.containerRuntimeVersion, v1NodeSystemInfo.containerRuntimeVersion) &&
        Objects.equals(this.kernelVersion, v1NodeSystemInfo.kernelVersion) &&
        Objects.equals(this.kubeProxyVersion, v1NodeSystemInfo.kubeProxyVersion) &&
        Objects.equals(this.kubeletVersion, v1NodeSystemInfo.kubeletVersion) &&
        Objects.equals(this.machineID, v1NodeSystemInfo.machineID) &&
        Objects.equals(this.operatingSystem, v1NodeSystemInfo.operatingSystem) &&
        Objects.equals(this.osImage, v1NodeSystemInfo.osImage) &&
        Objects.equals(this.systemUUID, v1NodeSystemInfo.systemUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSystemInfo {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
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
    openapiFields.add("architecture");
    openapiFields.add("bootID");
    openapiFields.add("containerRuntimeVersion");
    openapiFields.add("kernelVersion");
    openapiFields.add("kubeProxyVersion");
    openapiFields.add("kubeletVersion");
    openapiFields.add("machineID");
    openapiFields.add("operatingSystem");
    openapiFields.add("osImage");
    openapiFields.add("systemUUID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("architecture");
    openapiRequiredFields.add("bootID");
    openapiRequiredFields.add("containerRuntimeVersion");
    openapiRequiredFields.add("kernelVersion");
    openapiRequiredFields.add("kubeProxyVersion");
    openapiRequiredFields.add("kubeletVersion");
    openapiRequiredFields.add("machineID");
    openapiRequiredFields.add("operatingSystem");
    openapiRequiredFields.add("osImage");
    openapiRequiredFields.add("systemUUID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1NodeSystemInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1NodeSystemInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeSystemInfo is not found in the empty JSON string", V1NodeSystemInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1NodeSystemInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeSystemInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1NodeSystemInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("architecture").toString()));
      }
      if (!jsonObj.get("bootID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bootID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bootID").toString()));
      }
      if (!jsonObj.get("containerRuntimeVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerRuntimeVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerRuntimeVersion").toString()));
      }
      if (!jsonObj.get("kernelVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kernelVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kernelVersion").toString()));
      }
      if (!jsonObj.get("kubeProxyVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kubeProxyVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kubeProxyVersion").toString()));
      }
      if (!jsonObj.get("kubeletVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kubeletVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kubeletVersion").toString()));
      }
      if (!jsonObj.get("machineID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `machineID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("machineID").toString()));
      }
      if (!jsonObj.get("operatingSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operatingSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operatingSystem").toString()));
      }
      if (!jsonObj.get("osImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osImage").toString()));
      }
      if (!jsonObj.get("systemUUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemUUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemUUID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeSystemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeSystemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeSystemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeSystemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeSystemInfo>() {
           @Override
           public void write(JsonWriter out, V1NodeSystemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeSystemInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1NodeSystemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1NodeSystemInfo
  * @throws IOException if the JSON string is invalid with respect to V1NodeSystemInfo
  */
  public static V1NodeSystemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeSystemInfo.class);
  }

 /**
  * Convert an instance of V1NodeSystemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
