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

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example:
 * http://&lt;host&gt;/&lt;path&gt;?&lt;searchpart&gt; -&gt; backend where where parts of the url
 * correspond to RFC 3986, this resource will be used to match against everything after the last
 * &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 */
@ApiModel(
    description =
        "HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1HTTPIngressRuleValue {
  public static final String SERIALIZED_NAME_PATHS = "paths";

  @SerializedName(SERIALIZED_NAME_PATHS)
  private List<V1HTTPIngressPath> paths = new ArrayList<>();

  public V1HTTPIngressRuleValue paths(List<V1HTTPIngressPath> paths) {

    this.paths = paths;
    return this;
  }

  public V1HTTPIngressRuleValue addPathsItem(V1HTTPIngressPath pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

  /**
   * A collection of paths that map requests to backends.
   *
   * @return paths
   */
  @ApiModelProperty(required = true, value = "A collection of paths that map requests to backends.")
  public List<V1HTTPIngressPath> getPaths() {
    return paths;
  }

  public void setPaths(List<V1HTTPIngressPath> paths) {
    this.paths = paths;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPIngressRuleValue v1HTTPIngressRuleValue = (V1HTTPIngressRuleValue) o;
    return Objects.equals(this.paths, v1HTTPIngressRuleValue.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPIngressRuleValue {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
