/*
Copyright 2021 The Kubernetes Authors.
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
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1SubjectAccessReviewSpec {
  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = null;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private List<String> group = null;

  public static final String SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES = "nonResourceAttributes";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_ATTRIBUTES)
  private V1beta1NonResourceAttributes nonResourceAttributes;

  public static final String SERIALIZED_NAME_RESOURCE_ATTRIBUTES = "resourceAttributes";

  @SerializedName(SERIALIZED_NAME_RESOURCE_ATTRIBUTES)
  private V1beta1ResourceAttributes resourceAttributes;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1beta1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public V1beta1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
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

  public V1beta1SubjectAccessReviewSpec group(List<String> group) {

    this.group = group;
    return this;
  }

  public V1beta1SubjectAccessReviewSpec addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * Groups is the groups you&#39;re testing for.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Groups is the groups you're testing for.")
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }

  public V1beta1SubjectAccessReviewSpec nonResourceAttributes(
      V1beta1NonResourceAttributes nonResourceAttributes) {

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
  public V1beta1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public V1beta1SubjectAccessReviewSpec resourceAttributes(
      V1beta1ResourceAttributes resourceAttributes) {

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
  public V1beta1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public V1beta1SubjectAccessReviewSpec uid(String uid) {

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

  public V1beta1SubjectAccessReviewSpec user(String user) {

    this.user = user;
    return this;
  }

  /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not
   * \&quot;Group\&quot;, then is it interpreted as \&quot;What if User were not a member of any
   * groups
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "User is the user you're testing for. If you specify \"User\" but not \"Group\", then is it interpreted as \"What if User were not a member of any groups")
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
    V1beta1SubjectAccessReviewSpec v1beta1SubjectAccessReviewSpec =
        (V1beta1SubjectAccessReviewSpec) o;
    return Objects.equals(this.extra, v1beta1SubjectAccessReviewSpec.extra)
        && Objects.equals(this.group, v1beta1SubjectAccessReviewSpec.group)
        && Objects.equals(
            this.nonResourceAttributes, v1beta1SubjectAccessReviewSpec.nonResourceAttributes)
        && Objects.equals(
            this.resourceAttributes, v1beta1SubjectAccessReviewSpec.resourceAttributes)
        && Objects.equals(this.uid, v1beta1SubjectAccessReviewSpec.uid)
        && Objects.equals(this.user, v1beta1SubjectAccessReviewSpec.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, group, nonResourceAttributes, resourceAttributes, uid, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SubjectAccessReviewSpec {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
