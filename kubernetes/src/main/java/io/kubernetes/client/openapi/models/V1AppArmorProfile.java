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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AppArmorProfile defines a pod or container&#39;s AppArmor settings.
 */
@ApiModel(description = "AppArmorProfile defines a pod or container's AppArmor settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T23:08:31.638427Z[Etc/UTC]")
public class V1AppArmorProfile {
  public static final String SERIALIZED_NAME_LOCALHOST_PROFILE = "localhostProfile";
  @SerializedName(SERIALIZED_NAME_LOCALHOST_PROFILE)
  private String localhostProfile;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1AppArmorProfile localhostProfile(String localhostProfile) {

    this.localhostProfile = localhostProfile;
    return this;
  }

   /**
   * localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is \&quot;Localhost\&quot;.
   * @return localhostProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is \"Localhost\".")

  public String getLocalhostProfile() {
    return localhostProfile;
  }


  public void setLocalhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
  }


  public V1AppArmorProfile type(String type) {

    this.type = type;
    return this;
  }

   /**
   * type indicates which kind of AppArmor profile will be applied. Valid options are:   Localhost - a profile pre-loaded on the node.   RuntimeDefault - the container runtime&#39;s default profile.   Unconfined - no AppArmor enforcement.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type indicates which kind of AppArmor profile will be applied. Valid options are:   Localhost - a profile pre-loaded on the node.   RuntimeDefault - the container runtime's default profile.   Unconfined - no AppArmor enforcement.")

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
    V1AppArmorProfile v1AppArmorProfile = (V1AppArmorProfile) o;
    return Objects.equals(this.localhostProfile, v1AppArmorProfile.localhostProfile) &&
        Objects.equals(this.type, v1AppArmorProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localhostProfile, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppArmorProfile {\n");
    sb.append("    localhostProfile: ").append(toIndentedString(localhostProfile)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
