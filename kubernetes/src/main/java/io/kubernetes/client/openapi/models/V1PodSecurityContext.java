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
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
import io.kubernetes.client.openapi.models.V1SeccompProfile;
import io.kubernetes.client.openapi.models.V1Sysctl;
import io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions;
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
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 */
@ApiModel(description = "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PodSecurityContext {
  public static final String SERIALIZED_NAME_APP_ARMOR_PROFILE = "appArmorProfile";
  @SerializedName(SERIALIZED_NAME_APP_ARMOR_PROFILE)
  @jakarta.annotation.Nullable
  private V1AppArmorProfile appArmorProfile;

  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";
  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  @jakarta.annotation.Nullable
  private Long fsGroup;

  public static final String SERIALIZED_NAME_FS_GROUP_CHANGE_POLICY = "fsGroupChangePolicy";
  @SerializedName(SERIALIZED_NAME_FS_GROUP_CHANGE_POLICY)
  @jakarta.annotation.Nullable
  private String fsGroupChangePolicy;

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

  public static final String SERIALIZED_NAME_SE_LINUX_CHANGE_POLICY = "seLinuxChangePolicy";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_CHANGE_POLICY)
  @jakarta.annotation.Nullable
  private String seLinuxChangePolicy;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  @jakarta.annotation.Nullable
  private V1SELinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_SECCOMP_PROFILE = "seccompProfile";
  @SerializedName(SERIALIZED_NAME_SECCOMP_PROFILE)
  @jakarta.annotation.Nullable
  private V1SeccompProfile seccompProfile;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  @jakarta.annotation.Nullable
  private List<Long> supplementalGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY = "supplementalGroupsPolicy";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS_POLICY)
  @jakarta.annotation.Nullable
  private String supplementalGroupsPolicy;

  public static final String SERIALIZED_NAME_SYSCTLS = "sysctls";
  @SerializedName(SERIALIZED_NAME_SYSCTLS)
  @jakarta.annotation.Nullable
  private List<V1Sysctl> sysctls = new ArrayList<>();

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";
  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  @jakarta.annotation.Nullable
  private V1WindowsSecurityContextOptions windowsOptions;

  public V1PodSecurityContext() {
  }

  public V1PodSecurityContext appArmorProfile(@jakarta.annotation.Nullable V1AppArmorProfile appArmorProfile) {
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


  public V1PodSecurityContext fsGroup(@jakarta.annotation.Nullable Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.
   * @return fsGroup
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(@jakarta.annotation.Nullable Long fsGroup) {
    this.fsGroup = fsGroup;
  }


  public V1PodSecurityContext fsGroupChangePolicy(@jakarta.annotation.Nullable String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return this;
  }

  /**
   * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \&quot;OnRootMismatch\&quot; and \&quot;Always\&quot;. If not specified, \&quot;Always\&quot; is used. Note that this field cannot be set when spec.os.name is windows.
   * @return fsGroupChangePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \"OnRootMismatch\" and \"Always\". If not specified, \"Always\" is used. Note that this field cannot be set when spec.os.name is windows.")
  public String getFsGroupChangePolicy() {
    return fsGroupChangePolicy;
  }

  public void setFsGroupChangePolicy(@jakarta.annotation.Nullable String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
  }


  public V1PodSecurityContext runAsGroup(@jakarta.annotation.Nullable Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsGroup
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(@jakarta.annotation.Nullable Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }


  public V1PodSecurityContext runAsNonRoot(@jakarta.annotation.Nullable Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(@jakarta.annotation.Nullable Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }


  public V1PodSecurityContext runAsUser(@jakarta.annotation.Nullable Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.
   * @return runAsUser
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(@jakarta.annotation.Nullable Long runAsUser) {
    this.runAsUser = runAsUser;
  }


  public V1PodSecurityContext seLinuxChangePolicy(@jakarta.annotation.Nullable String seLinuxChangePolicy) {
    this.seLinuxChangePolicy = seLinuxChangePolicy;
    return this;
  }

  /**
   * seLinuxChangePolicy defines how the container&#39;s SELinux label is applied to all volumes used by the Pod. It has no effect on nodes that do not support SELinux or to volumes does not support SELinux. Valid values are \&quot;MountOption\&quot; and \&quot;Recursive\&quot;.  \&quot;Recursive\&quot; means relabeling of all files on all Pod volumes by the container runtime. This may be slow for large volumes, but allows mixing privileged and unprivileged Pods sharing the same volume on the same node.  \&quot;MountOption\&quot; mounts all eligible Pod volumes with &#x60;-o context&#x60; mount option. This requires all Pods that share the same volume to use the same SELinux label. It is not possible to share the same volume among privileged and unprivileged Pods. Eligible volumes are in-tree FibreChannel and iSCSI volumes, and all CSI volumes whose CSI driver announces SELinux support by setting spec.seLinuxMount: true in their CSIDriver instance. Other volumes are always re-labelled recursively. \&quot;MountOption\&quot; value is allowed only when SELinuxMount feature gate is enabled.  If not specified and SELinuxMount feature gate is enabled, \&quot;MountOption\&quot; is used. If not specified and SELinuxMount feature gate is disabled, \&quot;MountOption\&quot; is used for ReadWriteOncePod volumes and \&quot;Recursive\&quot; for all other volumes.  This field affects only Pods that have SELinux label set, either in PodSecurityContext or in SecurityContext of all containers.  All Pods that use the same volume should use the same seLinuxChangePolicy, otherwise some pods can get stuck in ContainerCreating state. Note that this field cannot be set when spec.os.name is windows.
   * @return seLinuxChangePolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "seLinuxChangePolicy defines how the container's SELinux label is applied to all volumes used by the Pod. It has no effect on nodes that do not support SELinux or to volumes does not support SELinux. Valid values are \"MountOption\" and \"Recursive\".  \"Recursive\" means relabeling of all files on all Pod volumes by the container runtime. This may be slow for large volumes, but allows mixing privileged and unprivileged Pods sharing the same volume on the same node.  \"MountOption\" mounts all eligible Pod volumes with `-o context` mount option. This requires all Pods that share the same volume to use the same SELinux label. It is not possible to share the same volume among privileged and unprivileged Pods. Eligible volumes are in-tree FibreChannel and iSCSI volumes, and all CSI volumes whose CSI driver announces SELinux support by setting spec.seLinuxMount: true in their CSIDriver instance. Other volumes are always re-labelled recursively. \"MountOption\" value is allowed only when SELinuxMount feature gate is enabled.  If not specified and SELinuxMount feature gate is enabled, \"MountOption\" is used. If not specified and SELinuxMount feature gate is disabled, \"MountOption\" is used for ReadWriteOncePod volumes and \"Recursive\" for all other volumes.  This field affects only Pods that have SELinux label set, either in PodSecurityContext or in SecurityContext of all containers.  All Pods that use the same volume should use the same seLinuxChangePolicy, otherwise some pods can get stuck in ContainerCreating state. Note that this field cannot be set when spec.os.name is windows.")
  public String getSeLinuxChangePolicy() {
    return seLinuxChangePolicy;
  }

  public void setSeLinuxChangePolicy(@jakarta.annotation.Nullable String seLinuxChangePolicy) {
    this.seLinuxChangePolicy = seLinuxChangePolicy;
  }


  public V1PodSecurityContext seLinuxOptions(@jakarta.annotation.Nullable V1SELinuxOptions seLinuxOptions) {
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


  public V1PodSecurityContext seccompProfile(@jakarta.annotation.Nullable V1SeccompProfile seccompProfile) {
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


  public V1PodSecurityContext supplementalGroups(@jakarta.annotation.Nullable List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID and fsGroup (if specified).  If the SupplementalGroupsPolicy feature is enabled, the supplementalGroupsPolicy field determines whether these are in addition to or instead of any group memberships defined in the container image. If unspecified, no additional groups are added, though group memberships defined in the container image may still be used, depending on the supplementalGroupsPolicy field. Note that this field cannot be set when spec.os.name is windows.
   * @return supplementalGroups
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A list of groups applied to the first process run in each container, in addition to the container's primary GID and fsGroup (if specified).  If the SupplementalGroupsPolicy feature is enabled, the supplementalGroupsPolicy field determines whether these are in addition to or instead of any group memberships defined in the container image. If unspecified, no additional groups are added, though group memberships defined in the container image may still be used, depending on the supplementalGroupsPolicy field. Note that this field cannot be set when spec.os.name is windows.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(@jakarta.annotation.Nullable List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  public V1PodSecurityContext supplementalGroupsPolicy(@jakarta.annotation.Nullable String supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return this;
  }

  /**
   * Defines how supplemental groups of the first container processes are calculated. Valid values are \&quot;Merge\&quot; and \&quot;Strict\&quot;. If not specified, \&quot;Merge\&quot; is used. (Alpha) Using the field requires the SupplementalGroupsPolicy feature gate to be enabled and the container runtime must implement support for this feature. Note that this field cannot be set when spec.os.name is windows.
   * @return supplementalGroupsPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Defines how supplemental groups of the first container processes are calculated. Valid values are \"Merge\" and \"Strict\". If not specified, \"Merge\" is used. (Alpha) Using the field requires the SupplementalGroupsPolicy feature gate to be enabled and the container runtime must implement support for this feature. Note that this field cannot be set when spec.os.name is windows.")
  public String getSupplementalGroupsPolicy() {
    return supplementalGroupsPolicy;
  }

  public void setSupplementalGroupsPolicy(@jakarta.annotation.Nullable String supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
  }


  public V1PodSecurityContext sysctls(@jakarta.annotation.Nullable List<V1Sysctl> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public V1PodSecurityContext addSysctlsItem(V1Sysctl sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

  /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.
   * @return sysctls
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.")
  public List<V1Sysctl> getSysctls() {
    return sysctls;
  }

  public void setSysctls(@jakarta.annotation.Nullable List<V1Sysctl> sysctls) {
    this.sysctls = sysctls;
  }


  public V1PodSecurityContext windowsOptions(@jakarta.annotation.Nullable V1WindowsSecurityContextOptions windowsOptions) {
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
    V1PodSecurityContext v1PodSecurityContext = (V1PodSecurityContext) o;
    return Objects.equals(this.appArmorProfile, v1PodSecurityContext.appArmorProfile) &&
        Objects.equals(this.fsGroup, v1PodSecurityContext.fsGroup) &&
        Objects.equals(this.fsGroupChangePolicy, v1PodSecurityContext.fsGroupChangePolicy) &&
        Objects.equals(this.runAsGroup, v1PodSecurityContext.runAsGroup) &&
        Objects.equals(this.runAsNonRoot, v1PodSecurityContext.runAsNonRoot) &&
        Objects.equals(this.runAsUser, v1PodSecurityContext.runAsUser) &&
        Objects.equals(this.seLinuxChangePolicy, v1PodSecurityContext.seLinuxChangePolicy) &&
        Objects.equals(this.seLinuxOptions, v1PodSecurityContext.seLinuxOptions) &&
        Objects.equals(this.seccompProfile, v1PodSecurityContext.seccompProfile) &&
        Objects.equals(this.supplementalGroups, v1PodSecurityContext.supplementalGroups) &&
        Objects.equals(this.supplementalGroupsPolicy, v1PodSecurityContext.supplementalGroupsPolicy) &&
        Objects.equals(this.sysctls, v1PodSecurityContext.sysctls) &&
        Objects.equals(this.windowsOptions, v1PodSecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appArmorProfile, fsGroup, fsGroupChangePolicy, runAsGroup, runAsNonRoot, runAsUser, seLinuxChangePolicy, seLinuxOptions, seccompProfile, supplementalGroups, supplementalGroupsPolicy, sysctls, windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSecurityContext {\n");
    sb.append("    appArmorProfile: ").append(toIndentedString(appArmorProfile)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    fsGroupChangePolicy: ").append(toIndentedString(fsGroupChangePolicy)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxChangePolicy: ").append(toIndentedString(seLinuxChangePolicy)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    seccompProfile: ").append(toIndentedString(seccompProfile)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    supplementalGroupsPolicy: ").append(toIndentedString(supplementalGroupsPolicy)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
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
    openapiFields.add("appArmorProfile");
    openapiFields.add("fsGroup");
    openapiFields.add("fsGroupChangePolicy");
    openapiFields.add("runAsGroup");
    openapiFields.add("runAsNonRoot");
    openapiFields.add("runAsUser");
    openapiFields.add("seLinuxChangePolicy");
    openapiFields.add("seLinuxOptions");
    openapiFields.add("seccompProfile");
    openapiFields.add("supplementalGroups");
    openapiFields.add("supplementalGroupsPolicy");
    openapiFields.add("sysctls");
    openapiFields.add("windowsOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PodSecurityContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodSecurityContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodSecurityContext is not found in the empty JSON string", V1PodSecurityContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodSecurityContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodSecurityContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `appArmorProfile`
      if (jsonObj.get("appArmorProfile") != null && !jsonObj.get("appArmorProfile").isJsonNull()) {
        V1AppArmorProfile.validateJsonElement(jsonObj.get("appArmorProfile"));
      }
      if ((jsonObj.get("fsGroupChangePolicy") != null && !jsonObj.get("fsGroupChangePolicy").isJsonNull()) && !jsonObj.get("fsGroupChangePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsGroupChangePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsGroupChangePolicy").toString()));
      }
      if ((jsonObj.get("seLinuxChangePolicy") != null && !jsonObj.get("seLinuxChangePolicy").isJsonNull()) && !jsonObj.get("seLinuxChangePolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seLinuxChangePolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seLinuxChangePolicy").toString()));
      }
      // validate the optional field `seLinuxOptions`
      if (jsonObj.get("seLinuxOptions") != null && !jsonObj.get("seLinuxOptions").isJsonNull()) {
        V1SELinuxOptions.validateJsonElement(jsonObj.get("seLinuxOptions"));
      }
      // validate the optional field `seccompProfile`
      if (jsonObj.get("seccompProfile") != null && !jsonObj.get("seccompProfile").isJsonNull()) {
        V1SeccompProfile.validateJsonElement(jsonObj.get("seccompProfile"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supplementalGroups") != null && !jsonObj.get("supplementalGroups").isJsonNull() && !jsonObj.get("supplementalGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplementalGroups` to be an array in the JSON string but got `%s`", jsonObj.get("supplementalGroups").toString()));
      }
      if ((jsonObj.get("supplementalGroupsPolicy") != null && !jsonObj.get("supplementalGroupsPolicy").isJsonNull()) && !jsonObj.get("supplementalGroupsPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplementalGroupsPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplementalGroupsPolicy").toString()));
      }
      if (jsonObj.get("sysctls") != null && !jsonObj.get("sysctls").isJsonNull()) {
        JsonArray jsonArraysysctls = jsonObj.getAsJsonArray("sysctls");
        if (jsonArraysysctls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sysctls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sysctls` to be an array in the JSON string but got `%s`", jsonObj.get("sysctls").toString()));
          }

          // validate the optional field `sysctls` (array)
          for (int i = 0; i < jsonArraysysctls.size(); i++) {
            V1Sysctl.validateJsonElement(jsonArraysysctls.get(i));
          };
        }
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
       if (!V1PodSecurityContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodSecurityContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodSecurityContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodSecurityContext.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodSecurityContext>() {
           @Override
           public void write(JsonWriter out, V1PodSecurityContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodSecurityContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PodSecurityContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PodSecurityContext
   * @throws IOException if the JSON string is invalid with respect to V1PodSecurityContext
   */
  public static V1PodSecurityContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodSecurityContext.class);
  }

  /**
   * Convert an instance of V1PodSecurityContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
