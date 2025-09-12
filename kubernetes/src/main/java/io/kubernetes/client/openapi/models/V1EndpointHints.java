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
import io.kubernetes.client.openapi.models.V1ForNode;
import io.kubernetes.client.openapi.models.V1ForZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
@ApiModel(description = "EndpointHints provides hints describing how an endpoint should be consumed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1EndpointHints {
  public static final String SERIALIZED_NAME_FOR_NODES = "forNodes";
  @SerializedName(SERIALIZED_NAME_FOR_NODES)
  private List<V1ForNode> forNodes = null;

  public static final String SERIALIZED_NAME_FOR_ZONES = "forZones";
  @SerializedName(SERIALIZED_NAME_FOR_ZONES)
  private List<V1ForZone> forZones = null;


  public V1EndpointHints forNodes(List<V1ForNode> forNodes) {

    this.forNodes = forNodes;
    return this;
  }

  public V1EndpointHints addForNodesItem(V1ForNode forNodesItem) {
    if (this.forNodes == null) {
      this.forNodes = new ArrayList<>();
    }
    this.forNodes.add(forNodesItem);
    return this;
  }

   /**
   * forNodes indicates the node(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. This is an Alpha feature and is only used when the PreferSameTrafficDistribution feature gate is enabled.
   * @return forNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "forNodes indicates the node(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries. This is an Alpha feature and is only used when the PreferSameTrafficDistribution feature gate is enabled.")

  public List<V1ForNode> getForNodes() {
    return forNodes;
  }


  public void setForNodes(List<V1ForNode> forNodes) {
    this.forNodes = forNodes;
  }


  public V1EndpointHints forZones(List<V1ForZone> forZones) {

    this.forZones = forZones;
    return this;
  }

  public V1EndpointHints addForZonesItem(V1ForZone forZonesItem) {
    if (this.forZones == null) {
      this.forZones = new ArrayList<>();
    }
    this.forZones.add(forZonesItem);
    return this;
  }

   /**
   * forZones indicates the zone(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries.
   * @return forZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "forZones indicates the zone(s) this endpoint should be consumed by when using topology aware routing. May contain a maximum of 8 entries.")

  public List<V1ForZone> getForZones() {
    return forZones;
  }


  public void setForZones(List<V1ForZone> forZones) {
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
    V1EndpointHints v1EndpointHints = (V1EndpointHints) o;
    return Objects.equals(this.forNodes, v1EndpointHints.forNodes) &&
        Objects.equals(this.forZones, v1EndpointHints.forZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forNodes, forZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointHints {\n");
    sb.append("    forNodes: ").append(toIndentedString(forNodes)).append("\n");
    sb.append("    forZones: ").append(toIndentedString(forZones)).append("\n");
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
