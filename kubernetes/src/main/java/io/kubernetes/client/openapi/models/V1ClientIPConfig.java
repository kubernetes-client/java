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

/** ClientIPConfig represents the configurations of Client IP based session affinity. */
@ApiModel(
    description =
        "ClientIPConfig represents the configurations of Client IP based session affinity.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ClientIPConfig {
  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";

  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1ClientIPConfig timeoutSeconds(Integer timeoutSeconds) {

    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be
   * &gt;0 &amp;&amp; &lt;&#x3D;86400(for 1 day) if ServiceAffinity &#x3D;&#x3D;
   * \&quot;ClientIP\&quot;. Default value is 10800(for 3 hours).
   *
   * @return timeoutSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == \"ClientIP\". Default value is 10800(for 3 hours).")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClientIPConfig v1ClientIPConfig = (V1ClientIPConfig) o;
    return Objects.equals(this.timeoutSeconds, v1ClientIPConfig.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClientIPConfig {\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
