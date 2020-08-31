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
import java.util.Objects;

/** Maps a string key to a path within a volume. */
@ApiModel(description = "Maps a string key to a path within a volume.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecConfigMapItems {
  public static final String SERIALIZED_NAME_KEY = "key";

  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MODE = "mode";

  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public V1ThanosRulerSpecConfigMapItems key(String key) {

    this.key = key;
    return this;
  }

  /**
   * The key to project.
   *
   * @return key
   */
  @ApiModelProperty(required = true, value = "The key to project.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1ThanosRulerSpecConfigMapItems mode(Integer mode) {

    this.mode = mode;
    return this;
  }

  /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified,
   * the volume defaultMode will be used. This might be in conflict with other options that affect
   * the file mode, like fsGroup, and the result can be other mode bits set.
   *
   * @return mode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public V1ThanosRulerSpecConfigMapItems path(String path) {

    this.path = path;
    return this;
  }

  /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain
   * the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
   *
   * @return path
   */
  @ApiModelProperty(
      required = true,
      value =
          "The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecConfigMapItems v1ThanosRulerSpecConfigMapItems =
        (V1ThanosRulerSpecConfigMapItems) o;
    return Objects.equals(this.key, v1ThanosRulerSpecConfigMapItems.key)
        && Objects.equals(this.mode, v1ThanosRulerSpecConfigMapItems.mode)
        && Objects.equals(this.path, v1ThanosRulerSpecConfigMapItems.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, mode, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecConfigMapItems {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
