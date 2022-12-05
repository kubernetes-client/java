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
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and
 * datasetUUID should be set. Flocker volumes do not support ownership management or SELinux
 * relabeling.
 */
@ApiModel(
    description =
        "Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1FlockerVolumeSource {
  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";

  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_DATASET_U_U_I_D = "datasetUUID";

  @SerializedName(SERIALIZED_NAME_DATASET_U_U_I_D)
  private String datasetUUID;

  public V1FlockerVolumeSource datasetName(String datasetName) {

    this.datasetName = datasetName;
    return this;
  }

  /**
   * datasetName is Name of the dataset stored as metadata -&gt; name on the dataset for Flocker
   * should be considered as deprecated
   *
   * @return datasetName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  public V1FlockerVolumeSource datasetUUID(String datasetUUID) {

    this.datasetUUID = datasetUUID;
    return this;
  }

  /**
   * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
   *
   * @return datasetUUID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset")
  public String getDatasetUUID() {
    return datasetUUID;
  }

  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FlockerVolumeSource v1FlockerVolumeSource = (V1FlockerVolumeSource) o;
    return Objects.equals(this.datasetName, v1FlockerVolumeSource.datasetName)
        && Objects.equals(this.datasetUUID, v1FlockerVolumeSource.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FlockerVolumeSource {\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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
