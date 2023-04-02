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
 * VolumeAttachmentSource represents a volume that should be attached. Right now only
 * PersistenVolumes can be attached via external attacher, in future we may allow also inline
 * volumes in pods. Exactly one member can be set.
 */
@ApiModel(
    description =
        "VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1VolumeAttachmentSource {
  public static final String SERIALIZED_NAME_INLINE_VOLUME_SPEC = "inlineVolumeSpec";

  @SerializedName(SERIALIZED_NAME_INLINE_VOLUME_SPEC)
  private V1PersistentVolumeSpec inlineVolumeSpec;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_NAME = "persistentVolumeName";

  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_NAME)
  private String persistentVolumeName;

  public V1VolumeAttachmentSource inlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec) {

    this.inlineVolumeSpec = inlineVolumeSpec;
    return this;
  }

  /**
   * Get inlineVolumeSpec
   *
   * @return inlineVolumeSpec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PersistentVolumeSpec getInlineVolumeSpec() {
    return inlineVolumeSpec;
  }

  public void setInlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
  }

  public V1VolumeAttachmentSource persistentVolumeName(String persistentVolumeName) {

    this.persistentVolumeName = persistentVolumeName;
    return this;
  }

  /**
   * Name of the persistent volume to attach.
   *
   * @return persistentVolumeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the persistent volume to attach.")
  public String getPersistentVolumeName() {
    return persistentVolumeName;
  }

  public void setPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentSource v1VolumeAttachmentSource = (V1VolumeAttachmentSource) o;
    return Objects.equals(this.inlineVolumeSpec, v1VolumeAttachmentSource.inlineVolumeSpec)
        && Objects.equals(this.persistentVolumeName, v1VolumeAttachmentSource.persistentVolumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineVolumeSpec, persistentVolumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentSource {\n");
    sb.append("    inlineVolumeSpec: ").append(toIndentedString(inlineVolumeSpec)).append("\n");
    sb.append("    persistentVolumeName: ")
        .append(toIndentedString(persistentVolumeName))
        .append("\n");
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
