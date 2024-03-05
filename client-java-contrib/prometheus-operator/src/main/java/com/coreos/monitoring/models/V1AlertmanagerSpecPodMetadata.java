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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** PodMetadata configures Labels and Annotations which are propagated to the alertmanager pods. */
@ApiModel(
    description =
        "PodMetadata configures Labels and Annotations which are propagated to the alertmanager pods.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1AlertmanagerSpecPodMetadata {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";

  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";

  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public V1AlertmanagerSpecPodMetadata annotations(Map<String, String> annotations) {

    this.annotations = annotations;
    return this;
  }

  public V1AlertmanagerSpecPodMetadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external
   * tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved
   * when modifying objects. More info: https://kubernetes.io/docs/user-guide/annotations
   *
   * @return annotations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: https://kubernetes.io/docs/user-guide/annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1AlertmanagerSpecPodMetadata labels(Map<String, String> labels) {

    this.labels = labels;
    return this;
  }

  public V1AlertmanagerSpecPodMetadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select)
   * objects. May match selectors of replication controllers and services. More info:
   * https://kubernetes.io/docs/user-guide/labels
   *
   * @return labels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: https://kubernetes.io/docs/user-guide/labels")
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
    V1AlertmanagerSpecPodMetadata v1AlertmanagerSpecPodMetadata = (V1AlertmanagerSpecPodMetadata) o;
    return Objects.equals(this.annotations, v1AlertmanagerSpecPodMetadata.annotations)
        && Objects.equals(this.labels, v1AlertmanagerSpecPodMetadata.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AlertmanagerSpecPodMetadata {\n");
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
