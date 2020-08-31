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

/**
 * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine. This depends on the
 * Flocker control service being running
 */
@ApiModel(
    description =
        "Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecFlocker {
  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";

  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_DATASET_U_U_I_D = "datasetUUID";

  @SerializedName(SERIALIZED_NAME_DATASET_U_U_I_D)
  private String datasetUUID;

  public V1ThanosRulerSpecFlocker datasetName(String datasetName) {

    this.datasetName = datasetName;
    return this;
  }

  /**
   * Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be
   * considered as deprecated
   *
   * @return datasetName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  public V1ThanosRulerSpecFlocker datasetUUID(String datasetUUID) {

    this.datasetUUID = datasetUUID;
    return this;
  }

  /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
   *
   * @return datasetUUID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the dataset. This is unique identifier of a Flocker dataset")
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
    V1ThanosRulerSpecFlocker v1ThanosRulerSpecFlocker = (V1ThanosRulerSpecFlocker) o;
    return Objects.equals(this.datasetName, v1ThanosRulerSpecFlocker.datasetName)
        && Objects.equals(this.datasetUUID, v1ThanosRulerSpecFlocker.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecFlocker {\n");
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
