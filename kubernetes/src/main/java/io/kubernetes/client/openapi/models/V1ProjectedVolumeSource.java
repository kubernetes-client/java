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
import java.util.List;
import java.util.Objects;

/** Represents a projected volume source */
@ApiModel(description = "Represents a projected volume source")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ProjectedVolumeSource {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";

  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_SOURCES = "sources";

  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<V1VolumeProjection> sources = null;

  public V1ProjectedVolumeSource defaultMode(Integer defaultMode) {

    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * defaultMode are the mode bits used to set permissions on created files by default. Must be an
   * octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal
   * and decimal values, JSON requires decimal values for mode bits. Directories within the path are
   * not affected by this setting. This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set.
   *
   * @return defaultMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "defaultMode are the mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public V1ProjectedVolumeSource sources(List<V1VolumeProjection> sources) {

    this.sources = sources;
    return this;
  }

  public V1ProjectedVolumeSource addSourcesItem(V1VolumeProjection sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * sources is the list of volume projections
   *
   * @return sources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sources is the list of volume projections")
  public List<V1VolumeProjection> getSources() {
    return sources;
  }

  public void setSources(List<V1VolumeProjection> sources) {
    this.sources = sources;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectedVolumeSource v1ProjectedVolumeSource = (V1ProjectedVolumeSource) o;
    return Objects.equals(this.defaultMode, v1ProjectedVolumeSource.defaultMode)
        && Objects.equals(this.sources, v1ProjectedVolumeSource.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectedVolumeSource {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
