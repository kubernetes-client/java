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
import java.util.ArrayList;
import java.util.List;

/**
 * LinuxContainerUser represents user identity information in Linux containers
 */
@ApiModel(description = "LinuxContainerUser represents user identity information in Linux containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T23:08:31.638427Z[Etc/UTC]")
public class V1LinuxContainerUser {
  public static final String SERIALIZED_NAME_GID = "gid";
  @SerializedName(SERIALIZED_NAME_GID)
  private Long gid;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private List<Long> supplementalGroups = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private Long uid;


  public V1LinuxContainerUser gid(Long gid) {

    this.gid = gid;
    return this;
  }

   /**
   * GID is the primary gid initially attached to the first process in the container
   * @return gid
  **/
  @ApiModelProperty(required = true, value = "GID is the primary gid initially attached to the first process in the container")

  public Long getGid() {
    return gid;
  }


  public void setGid(Long gid) {
    this.gid = gid;
  }


  public V1LinuxContainerUser supplementalGroups(List<Long> supplementalGroups) {

    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1LinuxContainerUser addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

   /**
   * SupplementalGroups are the supplemental groups initially attached to the first process in the container
   * @return supplementalGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SupplementalGroups are the supplemental groups initially attached to the first process in the container")

  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }


  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  public V1LinuxContainerUser uid(Long uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID is the primary uid initially attached to the first process in the container
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "UID is the primary uid initially attached to the first process in the container")

  public Long getUid() {
    return uid;
  }


  public void setUid(Long uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LinuxContainerUser v1LinuxContainerUser = (V1LinuxContainerUser) o;
    return Objects.equals(this.gid, v1LinuxContainerUser.gid) &&
        Objects.equals(this.supplementalGroups, v1LinuxContainerUser.supplementalGroups) &&
        Objects.equals(this.uid, v1LinuxContainerUser.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, supplementalGroups, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LinuxContainerUser {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
