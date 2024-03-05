/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Items for all in one resources secrets, configmaps, and downward API */
@ApiModel(description = "Items for all in one resources secrets, configmaps, and downward API")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecProjected {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";

  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_SOURCES = "sources";

  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<V1ThanosRulerSpecProjectedSources> sources =
      new ArrayList<V1ThanosRulerSpecProjectedSources>();

  public V1ThanosRulerSpecProjected defaultMode(Integer defaultMode) {

    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories
   * within the path are not affected by this setting. This might be in conflict with other options
   * that affect the file mode, like fsGroup, and the result can be other mode bits set.
   *
   * @return defaultMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public V1ThanosRulerSpecProjected sources(List<V1ThanosRulerSpecProjectedSources> sources) {

    this.sources = sources;
    return this;
  }

  public V1ThanosRulerSpecProjected addSourcesItem(V1ThanosRulerSpecProjectedSources sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * list of volume projections
   *
   * @return sources
   */
  @ApiModelProperty(required = true, value = "list of volume projections")
  public List<V1ThanosRulerSpecProjectedSources> getSources() {
    return sources;
  }

  public void setSources(List<V1ThanosRulerSpecProjectedSources> sources) {
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
    V1ThanosRulerSpecProjected v1ThanosRulerSpecProjected = (V1ThanosRulerSpecProjected) o;
    return Objects.equals(this.defaultMode, v1ThanosRulerSpecProjected.defaultMode)
        && Objects.equals(this.sources, v1ThanosRulerSpecProjected.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecProjected {\n");
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
