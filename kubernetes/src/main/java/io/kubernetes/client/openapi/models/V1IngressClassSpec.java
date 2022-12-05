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

/** IngressClassSpec provides information about the class of an Ingress. */
@ApiModel(description = "IngressClassSpec provides information about the class of an Ingress.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1IngressClassSpec {
  public static final String SERIALIZED_NAME_CONTROLLER = "controller";

  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private String controller;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private V1IngressClassParametersReference parameters;

  public V1IngressClassSpec controller(String controller) {

    this.controller = controller;
    return this;
  }

  /**
   * Controller refers to the name of the controller that should handle this class. This allows for
   * different \&quot;flavors\&quot; that are controlled by the same controller. For example, you
   * may have different Parameters for the same implementing controller. This should be specified as
   * a domain-prefixed path no more than 250 characters in length, e.g.
   * \&quot;acme.io/ingress-controller\&quot;. This field is immutable.
   *
   * @return controller
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Controller refers to the name of the controller that should handle this class. This allows for different \"flavors\" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. \"acme.io/ingress-controller\". This field is immutable.")
  public String getController() {
    return controller;
  }

  public void setController(String controller) {
    this.controller = controller;
  }

  public V1IngressClassSpec parameters(V1IngressClassParametersReference parameters) {

    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   *
   * @return parameters
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1IngressClassParametersReference getParameters() {
    return parameters;
  }

  public void setParameters(V1IngressClassParametersReference parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IngressClassSpec v1IngressClassSpec = (V1IngressClassSpec) o;
    return Objects.equals(this.controller, v1IngressClassSpec.controller)
        && Objects.equals(this.parameters, v1IngressClassSpec.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IngressClassSpec {\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
