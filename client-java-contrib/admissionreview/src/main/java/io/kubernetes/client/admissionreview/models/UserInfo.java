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
package io.kubernetes.client.admissionreview.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** UserInfo holds the information about the user needed to implement the user.Info interface. */
@ApiModel(
    description =
        "UserInfo holds the information about the user needed to implement the user.Info interface.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class UserInfo {
  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";

  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = null;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USERNAME = "username";

  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public UserInfo extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public UserInfo putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<String, List<String>>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

  /**
   * Any additional information provided by the authenticator.
   *
   * @return extra
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any additional information provided by the authenticator.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public UserInfo groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public UserInfo addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * The names of groups this user is a part of.
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of groups this user is a part of.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserInfo uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * A unique value that identifies this user across time. If this user is deleted and another user
   * by the same name is added, they will have different UIDs.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UserInfo username(String username) {

    this.username = username;
    return this;
  }

  /**
   * The name that uniquely identifies this user among all active users.
   *
   * @return username
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name that uniquely identifies this user among all active users.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.extra, userInfo.extra)
        && Objects.equals(this.groups, userInfo.groups)
        && Objects.equals(this.uid, userInfo.uid)
        && Objects.equals(this.username, userInfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, uid, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
