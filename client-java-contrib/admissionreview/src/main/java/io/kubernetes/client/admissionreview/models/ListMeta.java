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
import java.util.Objects;

/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various
 * status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 */
@ApiModel(
    description =
        "ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-07-01T14:30:02.888Z[Etc/UTC]")
public class ListMeta {
  public static final String SERIALIZED_NAME_CONTINUE = "continue";

  @SerializedName(SERIALIZED_NAME_CONTINUE)
  private String _continue;

  public static final String SERIALIZED_NAME_REMAINING_ITEM_COUNT = "remainingItemCount";

  @SerializedName(SERIALIZED_NAME_REMAINING_ITEM_COUNT)
  private Long remainingItemCount;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";

  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_SELF_LINK = "selfLink";

  @SerializedName(SERIALIZED_NAME_SELF_LINK)
  private String selfLink;

  public ListMeta _continue(String _continue) {

    this._continue = _continue;
    return this;
  }

  /**
   * continue may be set if the user set a limit on the number of items returned, and indicates that
   * the server has more data available. The value is opaque and may be used to issue another
   * request to the endpoint that served this list to retrieve the next set of available objects.
   * Continuing a consistent list may not be possible if the server configuration has changed or
   * more than a few minutes have passed. The resourceVersion field returned when using this
   * continue value will be identical to the value in the first response, unless you have received
   * this token from an error message.
   *
   * @return _continue
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.")
  public String getContinue() {
    return _continue;
  }

  public void setContinue(String _continue) {
    this._continue = _continue;
  }

  public ListMeta remainingItemCount(Long remainingItemCount) {

    this.remainingItemCount = remainingItemCount;
    return this;
  }

  /**
   * remainingItemCount is the number of subsequent items in the list which are not included in this
   * list response. If the list request contained label or field selectors, then the number of
   * remaining items is unknown and the field will be left unset and omitted during serialization.
   * If the list is complete (either because it is not chunking or because this is the last chunk),
   * then there are no more remaining items and this field will be left unset and omitted during
   * serialization. Servers older than v1.15 do not set this field. The intended use of the
   * remainingItemCount is *estimating* the size of a collection. Clients should not rely on the
   * remainingItemCount to be set or to be exact.
   *
   * @return remainingItemCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.")
  public Long getRemainingItemCount() {
    return remainingItemCount;
  }

  public void setRemainingItemCount(Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
  }

  public ListMeta resourceVersion(String resourceVersion) {

    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * String that identifies the server&#39;s internal version of this object that can be used by
   * clients to determine when objects have changed. Value must be treated as opaque by clients and
   * passed unmodified back to the server. Populated by the system. Read-only. More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   *
   * @return resourceVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public ListMeta selfLink(String selfLink) {

    this.selfLink = selfLink;
    return this;
  }

  /**
   * selfLink is a URL representing this object. Populated by the system. Read-only. DEPRECATED
   * Kubernetes will stop propagating this field in 1.20 release and the field is planned to be
   * removed in 1.21 release.
   *
   * @return selfLink
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "selfLink is a URL representing this object. Populated by the system. Read-only.  DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMeta listMeta = (ListMeta) o;
    return Objects.equals(this._continue, listMeta._continue)
        && Objects.equals(this.remainingItemCount, listMeta.remainingItemCount)
        && Objects.equals(this.resourceVersion, listMeta.resourceVersion)
        && Objects.equals(this.selfLink, listMeta.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_continue, remainingItemCount, resourceVersion, selfLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMeta {\n");
    sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
    sb.append("    remainingItemCount: ").append(toIndentedString(remainingItemCount)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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
