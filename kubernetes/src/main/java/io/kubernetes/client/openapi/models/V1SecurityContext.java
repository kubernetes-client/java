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
import io.kubernetes.client.openapi.models.V1AppArmorProfile;
import io.kubernetes.client.openapi.models.V1Capabilities;
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
import io.kubernetes.client.openapi.models.V1SeccompProfile;
import io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 */
@ApiModel(description = "SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1SecurityContext {
  public static final String SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION = "allowPrivilegeEscalation";
  @SerializedName(SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION)
  @jakarta.annotation.Nullable
  private Boolean allowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_APP_ARMOR_PROFILE = "appArmorProfile";
  @SerializedName(SERIALIZED_NAME_APP_ARMOR_PROFILE)
  @jakarta.annotation.Nullable
  private V1AppArmorProfile appArmorProfile;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  @jakarta.annotation.Nullable
  private V1Capabilities capabilities;

  public static final String SERIALIZED_NAME_PRIVILEGED = "privileged";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  @jakarta.annotation.Nullable
  private Boolean privileged;

  public static final String SERIALIZED_NAME_PROC_MOUNT = "procMount";
  @SerializedName(SERIALIZED_NAME_PROC_MOUNT)
  @jakarta.annotation.Nullable
  private String procMount;

  public static final String SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM = "readOnlyRootFilesystem";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM)
  @jakarta.annotation.Nullable
  private Boolean readOnlyRootFilesystem;

  public static final String SERIALIZED_NAME_RUN_AS_GROUP = "runAsGroup";
  @SerializedName(SERIALIZED_NAME_RUN_AS_GROUP)
  @jakarta.annotation.Nullable
  private Long runAsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_NON_ROOT = "runAsNonRoot";
  @SerializedName(SERIALIZED_NAME_RUN_AS_NON_ROOT)
  @jakarta.annotation.Nullable
  private Boolean runAsNonRoot;

  public static final String SERIALIZED_NAME_RUN_AS_USER = "runAsUser";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER)
  @jakarta.annotation.Nullable
  private Long runAsUser;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  @jakarta.annotation.Nullable
  private V1SELinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_SECCOMP_PROFILE = "seccompProfile";
  @SerializedName(SERIALIZED_NAME_SECCOMP_PROFILE)
  @jakarta.annotation.Nullable
  private V1SeccompProfile seccompProfile;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";
  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  @jakarta.annotation.Nullable
  private V1WindowsSecurityContextOptions windowsOptions;

  public V1SecurityContext() {
  }

  public V1SecurityContext allowPrivilegeEscalation(@jakarta.annotation.Nullable Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
   * @return allowPrivilegeEscalation
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(@jakarta.annotation.Nullable Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }


  public V1SecurityContext appArmorProfile(@jakarta.annotation.Nullable V1AppArmorProfile appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
    return this;
  }

  /**
   * Get appArmorProfile
   * @return appArmorProfile
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AppArmorProfile getAppArmorProfile() {
    return appArmorProfile;
  }

  public void setAppArmorProfile(@jakarta.annotation.Nullable V1AppArmorProfile appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
  }


  public V1SecurityContext capabilities(@jakarta.annotation.Nullable V1Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(@jakarta.annotation.Nullable V1Capabilities capabilities) {
    this.capabilities = capabilities;
  }


  public V1SecurityContext privileged(@jakarta.annotation.Nullable Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
   * @return privileged
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(@jakarta.annotation.Nullable Boolean privileged) {
    this.privileged = privileged;
  }


  public V1SecurityContext procMount(@jakarta.annotation.Nullable String procMount) {
    this.procMount = procMount;
    return this;
  }

  /**
   * procMount denotes the type of proc mount to use for the containers. The default value is Default which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
   * @return procMount
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "procMount denotes the type of proc mount to use for the containers. The default value is Default which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.")
  public String getProcMount() {
    return procMount;
  }

  public void setProcMount(@jakarta.annotation.Nullable String procMount) {
    this.procMount = procMount;
  }


  public V1SecurityContext readOnlyRootFilesystem(@jakarta.annotation.Nullable Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
   * @return readOnlyRootFilesystem
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(@jakarta.annotation.Nullable Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }


  public V1SecurityContext runAsGroup(@jakarta.annotation.Nullable Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsGroup
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(@jakarta.annotation.Nullable Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }


  public V1SecurityContext runAsNonRoot(@jakarta.annotation.Nullable Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(@jakarta.annotation.Nullable Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }


  public V1SecurityContext runAsUser(@jakarta.annotation.Nullable Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsUser
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(@jakarta.annotation.Nullable Long runAsUser) {
    this.runAsUser = runAsUser;
  }


  public V1SecurityContext seLinuxOptions(@jakarta.annotation.Nullable V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  /**
   * Get seLinuxOptions
   * @return seLinuxOptions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(@jakarta.annotation.Nullable V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }


  public V1SecurityContext seccompProfile(@jakarta.annotation.Nullable V1SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
    return this;
  }

  /**
   * Get seccompProfile
   * @return seccompProfile
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SeccompProfile getSeccompProfile() {
    return seccompProfile;
  }

  public void setSeccompProfile(@jakarta.annotation.Nullable V1SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
  }


  public V1SecurityContext windowsOptions(@jakarta.annotation.Nullable V1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }

  /**
   * Get windowsOptions
   * @return windowsOptions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1WindowsSecurityContextOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(@jakarta.annotation.Nullable V1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SecurityContext v1SecurityContext = (V1SecurityContext) o;
    return Objects.equals(this.allowPrivilegeEscalation, v1SecurityContext.allowPrivilegeEscalation) &&
        Objects.equals(this.appArmorProfile, v1SecurityContext.appArmorProfile) &&
        Objects.equals(this.capabilities, v1SecurityContext.capabilities) &&
        Objects.equals(this.privileged, v1SecurityContext.privileged) &&
        Objects.equals(this.procMount, v1SecurityContext.procMount) &&
        Objects.equals(this.readOnlyRootFilesystem, v1SecurityContext.readOnlyRootFilesystem) &&
        Objects.equals(this.runAsGroup, v1SecurityContext.runAsGroup) &&
        Objects.equals(this.runAsNonRoot, v1SecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, v1SecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxOptions, v1SecurityContext.seLinuxOptions) &&
        Objects.equals(this.seccompProfile, v1SecurityContext.seccompProfile) &&
        Objects.equals(this.windowsOptions, v1SecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrivilegeEscalation, appArmorProfile, capabilities, privileged, procMount, readOnlyRootFilesystem, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecurityContext {\n");
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    appArmorProfile: ").append(toIndentedString(appArmorProfile)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    procMount: ").append(toIndentedString(procMount)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    seccompProfile: ").append(toIndentedString(seccompProfile)).append("\n");
    sb.append("    windowsOptions: ").append(toIndentedString(windowsOptions)).append("\n");
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
    openapiFields.add("allowPrivilegeEscalation");
    openapiFields.add("appArmorProfile");
    openapiFields.add("capabilities");
    openapiFields.add("privileged");
    openapiFields.add("procMount");
    openapiFields.add("readOnlyRootFilesystem");
    openapiFields.add("runAsGroup");
    openapiFields.add("runAsNonRoot");
    openapiFields.add("runAsUser");
    openapiFields.add("seLinuxOptions");
    openapiFields.add("seccompProfile");
    openapiFields.add("windowsOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1SecurityContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1SecurityContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1SecurityContext is not found in the empty JSON string", V1SecurityContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1SecurityContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1SecurityContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `appArmorProfile`
      if (jsonObj.get("appArmorProfile") != null && !jsonObj.get("appArmorProfile").isJsonNull()) {
        V1AppArmorProfile.validateJsonElement(jsonObj.get("appArmorProfile"));
      }
      // validate the optional field `capabilities`
      if (jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull()) {
        V1Capabilities.validateJsonElement(jsonObj.get("capabilities"));
      }
      if ((jsonObj.get("procMount") != null && !jsonObj.get("procMount").isJsonNull()) && !jsonObj.get("procMount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `procMount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("procMount").toString()));
      }
      // validate the optional field `seLinuxOptions`
      if (jsonObj.get("seLinuxOptions") != null && !jsonObj.get("seLinuxOptions").isJsonNull()) {
        V1SELinuxOptions.validateJsonElement(jsonObj.get("seLinuxOptions"));
      }
      // validate the optional field `seccompProfile`
      if (jsonObj.get("seccompProfile") != null && !jsonObj.get("seccompProfile").isJsonNull()) {
        V1SeccompProfile.validateJsonElement(jsonObj.get("seccompProfile"));
      }
      // validate the optional field `windowsOptions`
      if (jsonObj.get("windowsOptions") != null && !jsonObj.get("windowsOptions").isJsonNull()) {
        V1WindowsSecurityContextOptions.validateJsonElement(jsonObj.get("windowsOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1SecurityContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1SecurityContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1SecurityContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1SecurityContext.class));

       return (TypeAdapter<T>) new TypeAdapter<V1SecurityContext>() {
           @Override
           public void write(JsonWriter out, V1SecurityContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1SecurityContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1SecurityContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1SecurityContext
   * @throws IOException if the JSON string is invalid with respect to V1SecurityContext
   */
  public static V1SecurityContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1SecurityContext.class);
  }

  /**
   * Convert an instance of V1SecurityContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
