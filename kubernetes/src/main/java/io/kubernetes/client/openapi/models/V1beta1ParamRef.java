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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ParamRef describes how to locate the params to be used as input to expressions of rules applied by a policy binding.
 */
@ApiModel(description = "ParamRef describes how to locate the params to be used as input to expressions of rules applied by a policy binding.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1beta1ParamRef {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETER_NOT_FOUND_ACTION = "parameterNotFoundAction";
  @SerializedName(SERIALIZED_NAME_PARAMETER_NOT_FOUND_ACTION)
  private String parameterNotFoundAction;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;


  public V1beta1ParamRef name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the name of the resource being referenced.  One of &#x60;name&#x60; or &#x60;selector&#x60; must be set, but &#x60;name&#x60; and &#x60;selector&#x60; are mutually exclusive properties. If one is set, the other must be unset.  A single parameter used for all admission requests can be configured by setting the &#x60;name&#x60; field, leaving &#x60;selector&#x60; blank, and setting namespace if &#x60;paramKind&#x60; is namespace-scoped.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name is the name of the resource being referenced.  One of `name` or `selector` must be set, but `name` and `selector` are mutually exclusive properties. If one is set, the other must be unset.  A single parameter used for all admission requests can be configured by setting the `name` field, leaving `selector` blank, and setting namespace if `paramKind` is namespace-scoped.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ParamRef namespace(String namespace) {

    this.namespace = namespace;
    return this;
  }

   /**
   * namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both &#x60;name&#x60; and &#x60;selector&#x60; fields.  A per-namespace parameter may be used by specifying a namespace-scoped &#x60;paramKind&#x60; in the policy and leaving this field empty.  - If &#x60;paramKind&#x60; is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.  - If &#x60;paramKind&#x60; is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "namespace is the namespace of the referenced resource. Allows limiting the search for params to a specific namespace. Applies to both `name` and `selector` fields.  A per-namespace parameter may be used by specifying a namespace-scoped `paramKind` in the policy and leaving this field empty.  - If `paramKind` is cluster-scoped, this field MUST be unset. Setting this field results in a configuration error.  - If `paramKind` is namespace-scoped, the namespace of the object being evaluated for admission will be used when this field is left unset. Take care that if this is left empty the binding must not match any cluster-scoped resources, which will result in an error.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1beta1ParamRef parameterNotFoundAction(String parameterNotFoundAction) {

    this.parameterNotFoundAction = parameterNotFoundAction;
    return this;
  }

   /**
   * &#x60;parameterNotFoundAction&#x60; controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to &#x60;Allow&#x60;, then no matched parameters will be treated as successful validation by the binding. If set to &#x60;Deny&#x60;, then no matched parameters will be subject to the &#x60;failurePolicy&#x60; of the policy.  Allowed values are &#x60;Allow&#x60; or &#x60;Deny&#x60;  Required
   * @return parameterNotFoundAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`parameterNotFoundAction` controls the behavior of the binding when the resource exists, and name or selector is valid, but there are no parameters matched by the binding. If the value is set to `Allow`, then no matched parameters will be treated as successful validation by the binding. If set to `Deny`, then no matched parameters will be subject to the `failurePolicy` of the policy.  Allowed values are `Allow` or `Deny`  Required")

  public String getParameterNotFoundAction() {
    return parameterNotFoundAction;
  }


  public void setParameterNotFoundAction(String parameterNotFoundAction) {
    this.parameterNotFoundAction = parameterNotFoundAction;
  }


  public V1beta1ParamRef selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ParamRef v1beta1ParamRef = (V1beta1ParamRef) o;
    return Objects.equals(this.name, v1beta1ParamRef.name) &&
        Objects.equals(this.namespace, v1beta1ParamRef.namespace) &&
        Objects.equals(this.parameterNotFoundAction, v1beta1ParamRef.parameterNotFoundAction) &&
        Objects.equals(this.selector, v1beta1ParamRef.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, parameterNotFoundAction, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ParamRef {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameterNotFoundAction: ").append(toIndentedString(parameterNotFoundAction)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
