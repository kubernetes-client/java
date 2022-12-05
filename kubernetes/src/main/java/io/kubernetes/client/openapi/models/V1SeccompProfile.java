/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SeccompProfile defines a pod/container&#39;s seccomp profile settings. Only one profile source
 * may be set.
 */
@ApiModel(
    description =
        "SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SeccompProfile {
  public static final String SERIALIZED_NAME_LOCALHOST_PROFILE = "localhostProfile";

  @SerializedName(SERIALIZED_NAME_LOCALHOST_PROFILE)
  private String localhostProfile;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1SeccompProfile localhostProfile(String localhostProfile) {

    this.localhostProfile = localhostProfile;
    return this;
  }

  /**
   * localhostProfile indicates a profile defined in a file on the node should be used. The profile
   * must be preconfigured on the node to work. Must be a descending path, relative to the
   * kubelet&#39;s configured seccomp profile location. Must only be set if type is
   * \&quot;Localhost\&quot;.
   *
   * @return localhostProfile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is \"Localhost\".")
  public String getLocalhostProfile() {
    return localhostProfile;
  }

  public void setLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
  }

  public V1SeccompProfile type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type indicates which kind of seccomp profile will be applied. Valid options are: Localhost - a
   * profile defined in a file on the node should be used. RuntimeDefault - the container runtime
   * default profile should be used. Unconfined - no profile should be applied.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type indicates which kind of seccomp profile will be applied. Valid options are:  Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.  ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SeccompProfile v1SeccompProfile = (V1SeccompProfile) o;
    return Objects.equals(this.localhostProfile, v1SeccompProfile.localhostProfile)
        && Objects.equals(this.type, v1SeccompProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localhostProfile, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SeccompProfile {\n");
    sb.append("    localhostProfile: ").append(toIndentedString(localhostProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
