/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceClass is used by administrators to influence how resources are allocated.  This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
@ApiModel(description = "ResourceClass is used by administrators to influence how resources are allocated.  This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2ResourceClass implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_PARAMETERS_REF = "parametersRef";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_REF)
  private V1alpha2ResourceClassParametersReference parametersRef;

  public static final String SERIALIZED_NAME_SUITABLE_NODES = "suitableNodes";
  @SerializedName(SERIALIZED_NAME_SUITABLE_NODES)
  private V1NodeSelector suitableNodes;


  public V1alpha2ResourceClass apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha2ResourceClass driverName(String driverName) {

    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.  Resource drivers have a unique name in forward domain order (acme.example.com).
   * @return driverName
  **/
  @ApiModelProperty(required = true, value = "DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.  Resource drivers have a unique name in forward domain order (acme.example.com).")

  public String getDriverName() {
    return driverName;
  }


  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceClass kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha2ResourceClass metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1alpha2ResourceClass parametersRef(V1alpha2ResourceClassParametersReference parametersRef) {

    this.parametersRef = parametersRef;
    return this;
  }

   /**
   * Get parametersRef
   * @return parametersRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2ResourceClassParametersReference getParametersRef() {
    return parametersRef;
  }


  public void setParametersRef(V1alpha2ResourceClassParametersReference parametersRef) {
    this.parametersRef = parametersRef;
  }


  public V1alpha2ResourceClass suitableNodes(V1NodeSelector suitableNodes) {

    this.suitableNodes = suitableNodes;
    return this;
  }

   /**
   * Get suitableNodes
   * @return suitableNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NodeSelector getSuitableNodes() {
    return suitableNodes;
  }


  public void setSuitableNodes(V1NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClass v1alpha2ResourceClass = (V1alpha2ResourceClass) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClass.apiVersion) &&
        Objects.equals(this.driverName, v1alpha2ResourceClass.driverName) &&
        Objects.equals(this.kind, v1alpha2ResourceClass.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClass.metadata) &&
        Objects.equals(this.parametersRef, v1alpha2ResourceClass.parametersRef) &&
        Objects.equals(this.suitableNodes, v1alpha2ResourceClass.suitableNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, driverName, kind, metadata, parametersRef, suitableNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClass {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    parametersRef: ").append(toIndentedString(parametersRef)).append("\n");
    sb.append("    suitableNodes: ").append(toIndentedString(suitableNodes)).append("\n");
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
