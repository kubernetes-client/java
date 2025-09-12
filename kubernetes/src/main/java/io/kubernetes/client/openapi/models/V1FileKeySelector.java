/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FileKeySelector selects a key of the env file.
 */
@ApiModel(description = "FileKeySelector selects a key of the env file.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1FileKeySelector {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public V1FileKeySelector key(String key) {

    this.key = key;
    return this;
  }

   /**
   * The key within the env file. An invalid key will prevent the pod from starting. The keys defined within a source may consist of any printable ASCII characters except &#39;&#x3D;&#39;. During Alpha stage of the EnvFiles feature gate, the key size is limited to 128 characters.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key within the env file. An invalid key will prevent the pod from starting. The keys defined within a source may consist of any printable ASCII characters except '='. During Alpha stage of the EnvFiles feature gate, the key size is limited to 128 characters.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1FileKeySelector optional(Boolean optional) {

    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the file or its key must be defined. If the file or key does not exist, then the env var is not published. If optional is set to true and the specified key does not exist, the environment variable will not be set in the Pod&#39;s containers.  If optional is set to false and the specified key does not exist, an error will be returned during Pod creation.
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the file or its key must be defined. If the file or key does not exist, then the env var is not published. If optional is set to true and the specified key does not exist, the environment variable will not be set in the Pod's containers.  If optional is set to false and the specified key does not exist, an error will be returned during Pod creation.")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1FileKeySelector path(String path) {

    this.path = path;
    return this;
  }

   /**
   * The path within the volume from which to select the file. Must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The path within the volume from which to select the file. Must be relative and may not contain the '..' path or start with '..'.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1FileKeySelector volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

   /**
   * The name of the volume mount containing the env file.
   * @return volumeName
  **/
  @ApiModelProperty(required = true, value = "The name of the volume mount containing the env file.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FileKeySelector v1FileKeySelector = (V1FileKeySelector) o;
    return Objects.equals(this.key, v1FileKeySelector.key) &&
        Objects.equals(this.optional, v1FileKeySelector.optional) &&
        Objects.equals(this.path, v1FileKeySelector.path) &&
        Objects.equals(this.volumeName, v1FileKeySelector.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, optional, path, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FileKeySelector {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
