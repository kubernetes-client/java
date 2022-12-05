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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NamespaceSpec describes the attributes on a Namespace. */
@ApiModel(description = "NamespaceSpec describes the attributes on a Namespace.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NamespaceSpec {
  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";

  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers = null;

  public V1NamespaceSpec finalizers(List<String> finalizers) {

    this.finalizers = finalizers;
    return this;
  }

  public V1NamespaceSpec addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from
   * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   *
   * @return finalizers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NamespaceSpec v1NamespaceSpec = (V1NamespaceSpec) o;
    return Objects.equals(this.finalizers, v1NamespaceSpec.finalizers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceSpec {\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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
