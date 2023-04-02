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

/** VolumeAttachmentSpec is the specification of a VolumeAttachment request. */
@ApiModel(description = "VolumeAttachmentSpec is the specification of a VolumeAttachment request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1VolumeAttachmentSpec {
  public static final String SERIALIZED_NAME_ATTACHER = "attacher";

  @SerializedName(SERIALIZED_NAME_ATTACHER)
  private String attacher;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";

  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private V1VolumeAttachmentSource source;

  public V1VolumeAttachmentSpec attacher(String attacher) {

    this.attacher = attacher;
    return this;
  }

  /**
   * Attacher indicates the name of the volume driver that MUST handle this request. This is the
   * name returned by GetPluginName().
   *
   * @return attacher
   */
  @ApiModelProperty(
      required = true,
      value =
          "Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().")
  public String getAttacher() {
    return attacher;
  }

  public void setAttacher(String attacher) {
    this.attacher = attacher;
  }

  public V1VolumeAttachmentSpec nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

  /**
   * The node that the volume should be attached to.
   *
   * @return nodeName
   */
  @ApiModelProperty(required = true, value = "The node that the volume should be attached to.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public V1VolumeAttachmentSpec source(V1VolumeAttachmentSource source) {

    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  @ApiModelProperty(required = true, value = "")
  public V1VolumeAttachmentSource getSource() {
    return source;
  }

  public void setSource(V1VolumeAttachmentSource source) {
    this.source = source;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentSpec v1VolumeAttachmentSpec = (V1VolumeAttachmentSpec) o;
    return Objects.equals(this.attacher, v1VolumeAttachmentSpec.attacher)
        && Objects.equals(this.nodeName, v1VolumeAttachmentSpec.nodeName)
        && Objects.equals(this.source, v1VolumeAttachmentSpec.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacher, nodeName, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentSpec {\n");
    sb.append("    attacher: ").append(toIndentedString(attacher)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
