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

/** IngressBackend describes all endpoints for a given service and port. */
@ApiModel(description = "IngressBackend describes all endpoints for a given service and port.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1IngressBackend {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V1TypedLocalObjectReference resource;

  public static final String SERIALIZED_NAME_SERVICE = "service";

  @SerializedName(SERIALIZED_NAME_SERVICE)
  private V1IngressServiceBackend service;

  public V1IngressBackend resource(V1TypedLocalObjectReference resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TypedLocalObjectReference getResource() {
    return resource;
  }

  public void setResource(V1TypedLocalObjectReference resource) {
    this.resource = resource;
  }

  public V1IngressBackend service(V1IngressServiceBackend service) {

    this.service = service;
    return this;
  }

  /**
   * Get service
   *
   * @return service
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1IngressServiceBackend getService() {
    return service;
  }

  public void setService(V1IngressServiceBackend service) {
    this.service = service;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressBackend v1IngressBackend = (V1IngressBackend) o;
    return Objects.equals(this.resource, v1IngressBackend.resource)
        && Objects.equals(this.service, v1IngressBackend.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressBackend {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
