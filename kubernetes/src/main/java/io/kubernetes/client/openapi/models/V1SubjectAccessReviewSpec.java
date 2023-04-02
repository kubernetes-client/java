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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * SubjectAccessReviewSpec is a description of the access request. Exactly one of
 * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 */
@ApiModel(
    description =
        "SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";

  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = null;

  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";

  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1ResourceAttributes resourceAttributes;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public V1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

  /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator. Since that is
   * input to the authorizer it needs a reflection here.
   *
   * @return extra
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public V1SubjectAccessReviewSpec groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public V1SubjectAccessReviewSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups is the groups you&#39;re testing for.
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Groups is the groups you're testing for.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public V1SubjectAccessReviewSpec nonResourceAttributes(
      V1NonResourceAttributes nonResourceAttributes) {

    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

  /**
   * Get nonResourceAttributes
   *
   * @return nonResourceAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public V1SubjectAccessReviewSpec resourceAttributes(V1ResourceAttributes resourceAttributes) {

    this.resourceAttributes = resourceAttributes;
    return this;
  }

  /**
   * Get resourceAttributes
   *
   * @return resourceAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public V1SubjectAccessReviewSpec uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID information about the requesting user.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID information about the requesting user.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1SubjectAccessReviewSpec user(String user) {

    this.user = user;
    return this;
  }

  /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not
   * \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any
   * groups
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "User is the user you're testing for. If you specify \"User\" but not \"Groups\", then is it interpreted as \"What if User were not a member of any groups")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SubjectAccessReviewSpec v1SubjectAccessReviewSpec = (V1SubjectAccessReviewSpec) o;
    return Objects.equals(this.extra, v1SubjectAccessReviewSpec.extra)
        && Objects.equals(this.groups, v1SubjectAccessReviewSpec.groups)
        && Objects.equals(
            this.nonResourceAttributes, v1SubjectAccessReviewSpec.nonResourceAttributes)
        && Objects.equals(this.resourceAttributes, v1SubjectAccessReviewSpec.resourceAttributes)
        && Objects.equals(this.uid, v1SubjectAccessReviewSpec.uid)
        && Objects.equals(this.user, v1SubjectAccessReviewSpec.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, nonResourceAttributes, resourceAttributes, uid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectAccessReviewSpec {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nonResourceAttributes: ")
        .append(toIndentedString(nonResourceAttributes))
        .append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
