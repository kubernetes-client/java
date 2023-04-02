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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ObjectMeta overrides for the pod used to solve HTTP01 challenges. Only the &#39;labels&#39; and
 * &#39;annotations&#39; fields may be set. If labels or annotations overlap with in-built values,
 * the values here will override the in-built values.
 */
@ApiModel(
    description =
        "ObjectMeta overrides for the pod used to solve HTTP01 challenges. Only the 'labels' and 'annotations' fields may be set. If labels or annotations overlap with in-built values, the values here will override the in-built values.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";

  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";

  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata annotations(
      Map<String, String> annotations) {

    this.annotations = annotations;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata putAnnotationsItem(
      String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations that should be added to the create ACME HTTP01 solver pods.
   *
   * @return annotations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Annotations that should be added to the create ACME HTTP01 solver pods.")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata labels(Map<String, String> labels) {

    this.labels = labels;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata putLabelsItem(
      String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels that should be added to the created ACME HTTP01 solver pods.
   *
   * @return labels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels that should be added to the created ACME HTTP01 solver pods.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata) o;
    return Objects.equals(
            this.annotations, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata.annotations)
        && Objects.equals(
            this.labels, v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateMetadata {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
