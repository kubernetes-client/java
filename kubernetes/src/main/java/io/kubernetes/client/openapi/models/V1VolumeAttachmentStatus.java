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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** VolumeAttachmentStatus is the status of a VolumeAttachment request. */
@ApiModel(description = "VolumeAttachmentStatus is the status of a VolumeAttachment request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1VolumeAttachmentStatus {
  public static final String SERIALIZED_NAME_ATTACH_ERROR = "attachError";

  @SerializedName(SERIALIZED_NAME_ATTACH_ERROR)
  private V1VolumeError attachError;

  public static final String SERIALIZED_NAME_ATTACHED = "attached";

  @SerializedName(SERIALIZED_NAME_ATTACHED)
  private Boolean attached;

  public static final String SERIALIZED_NAME_ATTACHMENT_METADATA = "attachmentMetadata";

  @SerializedName(SERIALIZED_NAME_ATTACHMENT_METADATA)
  private Map<String, String> attachmentMetadata = null;

  public static final String SERIALIZED_NAME_DETACH_ERROR = "detachError";

  @SerializedName(SERIALIZED_NAME_DETACH_ERROR)
  private V1VolumeError detachError;

  public V1VolumeAttachmentStatus attachError(V1VolumeError attachError) {

    this.attachError = attachError;
    return this;
  }

  /**
   * Get attachError
   *
   * @return attachError
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeError getAttachError() {
    return attachError;
  }

  public void setAttachError(V1VolumeError attachError) {
    this.attachError = attachError;
  }

  public V1VolumeAttachmentStatus attached(Boolean attached) {

    this.attached = attached;
    return this;
  }

  /**
   * Indicates the volume is successfully attached. This field must only be set by the entity
   * completing the attach operation, i.e. the external-attacher.
   *
   * @return attached
   */
  @ApiModelProperty(
      required = true,
      value =
          "Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean attached) {
    this.attached = attached;
  }

  public V1VolumeAttachmentStatus attachmentMetadata(Map<String, String> attachmentMetadata) {

    this.attachmentMetadata = attachmentMetadata;
    return this;
  }

  public V1VolumeAttachmentStatus putAttachmentMetadataItem(
      String key, String attachmentMetadataItem) {
    if (this.attachmentMetadata == null) {
      this.attachmentMetadata = new HashMap<>();
    }
    this.attachmentMetadata.put(key, attachmentMetadataItem);
    return this;
  }

  /**
   * Upon successful attach, this field is populated with any information returned by the attach
   * operation that must be passed into subsequent WaitForAttach or Mount calls. This field must
   * only be set by the entity completing the attach operation, i.e. the external-attacher.
   *
   * @return attachmentMetadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  public Map<String, String> getAttachmentMetadata() {
    return attachmentMetadata;
  }

  public void setAttachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
  }

  public V1VolumeAttachmentStatus detachError(V1VolumeError detachError) {

    this.detachError = detachError;
    return this;
  }

  /**
   * Get detachError
   *
   * @return detachError
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeError getDetachError() {
    return detachError;
  }

  public void setDetachError(V1VolumeError detachError) {
    this.detachError = detachError;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentStatus v1VolumeAttachmentStatus = (V1VolumeAttachmentStatus) o;
    return Objects.equals(this.attachError, v1VolumeAttachmentStatus.attachError)
        && Objects.equals(this.attached, v1VolumeAttachmentStatus.attached)
        && Objects.equals(this.attachmentMetadata, v1VolumeAttachmentStatus.attachmentMetadata)
        && Objects.equals(this.detachError, v1VolumeAttachmentStatus.detachError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachError, attached, attachmentMetadata, detachError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentStatus {\n");
    sb.append("    attachError: ").append(toIndentedString(attachError)).append("\n");
    sb.append("    attached: ").append(toIndentedString(attached)).append("\n");
    sb.append("    attachmentMetadata: ").append(toIndentedString(attachmentMetadata)).append("\n");
    sb.append("    detachError: ").append(toIndentedString(detachError)).append("\n");
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
