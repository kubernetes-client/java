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
import io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersReference;
import io.kubernetes.client.openapi.models.V1alpha2ResourceFilter;
import io.kubernetes.client.openapi.models.V1alpha2VendorParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.
 */
@ApiModel(description = "ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha2ResourceClassParameters implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<V1alpha2ResourceFilter> filters = null;

  public static final String SERIALIZED_NAME_GENERATED_FROM = "generatedFrom";
  @SerializedName(SERIALIZED_NAME_GENERATED_FROM)
  private V1alpha2ResourceClassParametersReference generatedFrom;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_VENDOR_PARAMETERS = "vendorParameters";
  @SerializedName(SERIALIZED_NAME_VENDOR_PARAMETERS)
  private List<V1alpha2VendorParameters> vendorParameters = null;


  public V1alpha2ResourceClassParameters apiVersion(String apiVersion) {

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


  public V1alpha2ResourceClassParameters filters(List<V1alpha2ResourceFilter> filters) {

    this.filters = filters;
    return this;
  }

  public V1alpha2ResourceClassParameters addFiltersItem(V1alpha2ResourceFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filters describes additional contraints that must be met when using the class.
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filters describes additional contraints that must be met when using the class.")

  public List<V1alpha2ResourceFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<V1alpha2ResourceFilter> filters) {
    this.filters = filters;
  }


  public V1alpha2ResourceClassParameters generatedFrom(V1alpha2ResourceClassParametersReference generatedFrom) {

    this.generatedFrom = generatedFrom;
    return this;
  }

   /**
   * Get generatedFrom
   * @return generatedFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha2ResourceClassParametersReference getGeneratedFrom() {
    return generatedFrom;
  }


  public void setGeneratedFrom(V1alpha2ResourceClassParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
  }


  public V1alpha2ResourceClassParameters kind(String kind) {

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


  public V1alpha2ResourceClassParameters metadata(V1ObjectMeta metadata) {

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


  public V1alpha2ResourceClassParameters vendorParameters(List<V1alpha2VendorParameters> vendorParameters) {

    this.vendorParameters = vendorParameters;
    return this;
  }

  public V1alpha2ResourceClassParameters addVendorParametersItem(V1alpha2VendorParameters vendorParametersItem) {
    if (this.vendorParameters == null) {
      this.vendorParameters = new ArrayList<>();
    }
    this.vendorParameters.add(vendorParametersItem);
    return this;
  }

   /**
   * VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
   * @return vendorParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.")

  public List<V1alpha2VendorParameters> getVendorParameters() {
    return vendorParameters;
  }


  public void setVendorParameters(List<V1alpha2VendorParameters> vendorParameters) {
    this.vendorParameters = vendorParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClassParameters v1alpha2ResourceClassParameters = (V1alpha2ResourceClassParameters) o;
    return Objects.equals(this.apiVersion, v1alpha2ResourceClassParameters.apiVersion) &&
        Objects.equals(this.filters, v1alpha2ResourceClassParameters.filters) &&
        Objects.equals(this.generatedFrom, v1alpha2ResourceClassParameters.generatedFrom) &&
        Objects.equals(this.kind, v1alpha2ResourceClassParameters.kind) &&
        Objects.equals(this.metadata, v1alpha2ResourceClassParameters.metadata) &&
        Objects.equals(this.vendorParameters, v1alpha2ResourceClassParameters.vendorParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, filters, generatedFrom, kind, metadata, vendorParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClassParameters {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    generatedFrom: ").append(toIndentedString(generatedFrom)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    vendorParameters: ").append(toIndentedString(vendorParameters)).append("\n");
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
