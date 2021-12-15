/*
Copyright 2021 The Kubernetes Authors.
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

/** EndpointHints provides hints describing how an endpoint should be consumed. */
@ApiModel(
    description = "EndpointHints provides hints describing how an endpoint should be consumed.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1EndpointHints {
  public static final String SERIALIZED_NAME_FOR_ZONES = "forZones";

  @SerializedName(SERIALIZED_NAME_FOR_ZONES)
  private List<V1beta1ForZone> forZones = null;

  public V1beta1EndpointHints forZones(List<V1beta1ForZone> forZones) {

    this.forZones = forZones;
    return this;
  }

  public V1beta1EndpointHints addForZonesItem(V1beta1ForZone forZonesItem) {
    if (this.forZones == null) {
      this.forZones = new ArrayList<>();
    }
    this.forZones.add(forZonesItem);
    return this;
  }

  /**
   * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware
   * routing. May contain a maximum of 8 entries.
   *
   * @return forZones
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing. May contain a maximum of 8 entries.")
  public List<V1beta1ForZone> getForZones() {
    return forZones;
  }

  public void setForZones(List<V1beta1ForZone> forZones) {
    this.forZones = forZones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1EndpointHints v1beta1EndpointHints = (V1beta1EndpointHints) o;
    return Objects.equals(this.forZones, v1beta1EndpointHints.forZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1EndpointHints {\n");
    sb.append("    forZones: ").append(toIndentedString(forZones)).append("\n");
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
