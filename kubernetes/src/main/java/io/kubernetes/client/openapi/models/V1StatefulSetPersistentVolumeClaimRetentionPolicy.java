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
 * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from
 * the StatefulSet VolumeClaimTemplates.
 */
@ApiModel(
    description =
        "StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1StatefulSetPersistentVolumeClaimRetentionPolicy {
  public static final String SERIALIZED_NAME_WHEN_DELETED = "whenDeleted";

  @SerializedName(SERIALIZED_NAME_WHEN_DELETED)
  private String whenDeleted;

  public static final String SERIALIZED_NAME_WHEN_SCALED = "whenScaled";

  @SerializedName(SERIALIZED_NAME_WHEN_SCALED)
  private String whenScaled;

  public V1StatefulSetPersistentVolumeClaimRetentionPolicy whenDeleted(String whenDeleted) {

    this.whenDeleted = whenDeleted;
    return this;
  }

  /**
   * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when
   * the StatefulSet is deleted. The default policy of &#x60;Retain&#x60; causes PVCs to not be
   * affected by StatefulSet deletion. The &#x60;Delete&#x60; policy causes those PVCs to be
   * deleted.
   *
   * @return whenDeleted
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.")
  public String getWhenDeleted() {
    return whenDeleted;
  }

  public void setWhenDeleted(String whenDeleted) {
    this.whenDeleted = whenDeleted;
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicy whenScaled(String whenScaled) {

    this.whenScaled = whenScaled;
    return this;
  }

  /**
   * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when
   * the StatefulSet is scaled down. The default policy of &#x60;Retain&#x60; causes PVCs to not be
   * affected by a scaledown. The &#x60;Delete&#x60; policy causes the associated PVCs for any
   * excess pods above the replica count to be deleted.
   *
   * @return whenScaled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.")
  public String getWhenScaled() {
    return whenScaled;
  }

  public void setWhenScaled(String whenScaled) {
    this.whenScaled = whenScaled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatefulSetPersistentVolumeClaimRetentionPolicy
        v1StatefulSetPersistentVolumeClaimRetentionPolicy =
            (V1StatefulSetPersistentVolumeClaimRetentionPolicy) o;
    return Objects.equals(
            this.whenDeleted, v1StatefulSetPersistentVolumeClaimRetentionPolicy.whenDeleted)
        && Objects.equals(
            this.whenScaled, v1StatefulSetPersistentVolumeClaimRetentionPolicy.whenScaled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whenDeleted, whenScaled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatefulSetPersistentVolumeClaimRetentionPolicy {\n");
    sb.append("    whenDeleted: ").append(toIndentedString(whenDeleted)).append("\n");
    sb.append("    whenScaled: ").append(toIndentedString(whenScaled)).append("\n");
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
