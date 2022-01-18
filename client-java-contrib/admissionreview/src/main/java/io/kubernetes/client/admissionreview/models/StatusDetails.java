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
import java.util.List;
import java.util.Objects;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide
 * additional information about a response. The Reason field of a Status object defines what
 * attributes will be set. Clients must ignore fields that do not match the defined type of each
 * attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
@ApiModel(
    description =
        "StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class StatusDetails {
  public static final String SERIALIZED_NAME_CAUSES = "causes";

  @SerializedName(SERIALIZED_NAME_CAUSES)
  private List<StatusCause> causes = null;

  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RETRY_AFTER_SECONDS = "retryAfterSeconds";

  @SerializedName(SERIALIZED_NAME_RETRY_AFTER_SECONDS)
  private Integer retryAfterSeconds;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public StatusDetails causes(List<StatusCause> causes) {

    this.causes = causes;
    return this;
  }

  public StatusDetails addCausesItem(StatusCause causesItem) {
    if (this.causes == null) {
      this.causes = new ArrayList<StatusCause>();
    }
    this.causes.add(causesItem);
    return this;
  }

  /**
   * The Causes array includes more details associated with the StatusReason failure. Not all
   * StatusReasons may provide detailed causes.
   *
   * @return causes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.")
  public List<StatusCause> getCauses() {
    return causes;
  }

  public void setCauses(List<StatusCause> causes) {
    this.causes = causes;
  }

  public StatusDetails group(String group) {

    this.group = group;
    return this;
  }

  /**
   * The group attribute of the resource associated with the status StatusReason.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "The group attribute of the resource associated with the status StatusReason.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public StatusDetails kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations
   * may differ from the requested resource Kind. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public StatusDetails name(String name) {

    this.name = name;
    return this;
  }

  /**
   * The name attribute of the resource associated with the status StatusReason (when there is a
   * single name which can be described).
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusDetails retryAfterSeconds(Integer retryAfterSeconds) {

    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

  /**
   * If specified, the time in seconds before the operation should be retried. Some errors may
   * indicate the client must take an alternate action - for those errors this field may indicate
   * how long to wait before taking the alternate action.
   *
   * @return retryAfterSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.")
  public Integer getRetryAfterSeconds() {
    return retryAfterSeconds;
  }

  public void setRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
  }

  public StatusDetails uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * UID of the resource. (when there is a single resource which can be described). More info:
   * http://kubernetes.io/docs/user-guide/identifiers#uids
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.causes, statusDetails.causes)
        && Objects.equals(this.group, statusDetails.group)
        && Objects.equals(this.kind, statusDetails.kind)
        && Objects.equals(this.name, statusDetails.name)
        && Objects.equals(this.retryAfterSeconds, statusDetails.retryAfterSeconds)
        && Objects.equals(this.uid, statusDetails.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causes, group, kind, name, retryAfterSeconds, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retryAfterSeconds: ").append(toIndentedString(retryAfterSeconds)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
