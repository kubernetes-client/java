/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1alpha2DriverRequests;
import io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.
 */
@ApiModel(description = "ResourceClaimParameters defines resource requests for a ResourceClaim in an in-tree format understood by Kubernetes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2ResourceClaimParameters implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DRIVER_REQUESTS = "driverRequests";
  @SerializedName(SERIALIZED_NAME_DRIVER_REQUESTS)
  private List<V1alpha2DriverRequests> driverRequests = null;

  public static final String SERIALIZED_NAME_GENERATED_FROM = "generatedFrom";
  @SerializedName(SERIALIZED_NAME_GENERATED_FROM)
  private V1alpha2ResourceClaimParametersReference generatedFrom;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SHAREABLE = "shareable";
  @SerializedName(SERIALIZED_NAME_SHAREABLE)
  private Boolean shareable;


  public V1alpha2ResourceClaimParameters apiVersion(String apiVersion) {

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


  public V1alpha2ResourceClaimParameters driverRequests(List<V1alpha2DriverRequests> driverRequests) {

    this.driverRequests = driverRequests;
    return this;
  }

  public V1alpha2ResourceClaimParameters addDriverRequestsItem(V1alpha2DriverRequests driverRequestsItem) {
    if (this.driverRequests == null) {
      this.driverRequests = new ArrayList<>();
    }
    this.driverRequests.add(driverRequestsItem);
    return this;
  }

   /**
   * DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.  May be empty, in which case the claim can always be allocated.
   * @return driverRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DriverRequests describes all resources that are needed for the allocated claim. A single claim may use resources coming from different drivers. For each driver, this array has at most one entry which then may have one or more per-driver requests.  May be empty, in which case the claim can always be allocated.")

  public List<V1alpha2DriverRequests> getDriverRequests() {
    return driverRequests;
  }


  public void setDriverRequests(List<V1alpha2DriverRequests> driverRequests) {
    this.driverRequests = driverRequests;
  }


  public V1alpha2ResourceClaimParameters generatedFrom(V1alpha2ResourceClaimParametersReference generatedFrom) {

    this.generatedFrom = generatedFrom;
    return this;
  }

   /**
   * Get generatedFrom
   * @return generatedFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2ResourceClaimParametersReference getGeneratedFrom() {
    return generatedFrom;
  }


  public void setGeneratedFrom(V1alpha2ResourceClaimParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
  }


  public V1alpha2ResourceClaimParameters kind(String kind) {

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


  public V1alpha2ResourceClaimParameters metadata(V1ObjectMeta metadata) {

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


  public V1alpha2ResourceClaimParameters shareable(Boolean shareable) {

    this.shareable = shareable;
    return this;
  }

   /**
   * Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.
   * @return shareable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shareable indicates whether the allocated claim is meant to be shareable by multiple consumers at the same time.")

  public Boolean getShareable() {
    return shareable;
  }


  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimParameters v1alpha2ResourceClaimParameters = (V1alpha2ResourceClaimParameters) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClaimParameters.apiVersion) &&
        Objects.equals(this.driverRequests, v1alpha2ResourceClaimParameters.driverRequests) &&
        Objects.equals(this.generatedFrom, v1alpha2ResourceClaimParameters.generatedFrom) &&
        Objects.equals(this.kind, v1alpha2ResourceClaimParameters.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClaimParameters.metadata) &&
        Objects.equals(this.shareable, v1alpha2ResourceClaimParameters.shareable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, driverRequests, generatedFrom, kind, metadata, shareable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimParameters {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    driverRequests: ").append(toIndentedString(driverRequests)).append("\n");
    sb.append("    generatedFrom: ").append(toIndentedString(generatedFrom)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
