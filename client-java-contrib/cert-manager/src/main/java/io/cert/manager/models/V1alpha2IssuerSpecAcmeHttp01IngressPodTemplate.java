/*
Copyright 2020 The Kubernetes Authors.
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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Optional pod template used to configure the ACME challenge solver pods used for HTTP01 challenges
 */
@ApiModel(
    description =
        "Optional pod template used to configure the ACME challenge solver pods used for HTTP01 challenges")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate {
  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";

  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec spec;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate metadata(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata metadata) {
    this.metadata = metadata;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate spec(
      V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec spec) {

    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   *
   * @return spec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec getSpec() {
    return spec;
  }

  public void setSpec(V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpec spec) {
    this.spec = spec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate v1alpha2IssuerSpecAcmeHttp01IngressPodTemplate =
        (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate) o;
    return Objects.equals(this.metadata, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplate.metadata)
        && Objects.equals(this.spec, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplate {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
