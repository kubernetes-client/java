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
package io.kubernetes.client.util.generic.options;

import com.google.gson.annotations.SerializedName;

public class ListOptions {
  @SerializedName("fieldSelector")
  private String fieldSelector;

  @SerializedName("labelSelector")
  private String labelSelector;

  @SerializedName("resourceVersion")
  private String resourceVersion;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds;

  @SerializedName("limit")
  private Integer limit;

  @SerializedName("continue")
  private String _continue;

  @SerializedName("isPartialObjectMetadataListRequest")
  private Boolean isPartialObjectMetadataListRequest;

  public ListOptions fieldSelector(String fieldSelector) {
    this.fieldSelector = fieldSelector;
    return this;
  }

  public String getFieldSelector() {
    return fieldSelector;
  }

  public void setFieldSelector(String fieldSelector) {
    this.fieldSelector = fieldSelector;
  }

  public ListOptions labelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  public String getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
  }

  public ListOptions resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public ListOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListOptions _continue(String _continue) {
    this._continue = _continue;
    return this;
  }

  public String getContinue() {
    return _continue;
  }

  public void setContinue(String _continue) {
    this._continue = _continue;
  }

  public ListOptions timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public ListOptions isPartialObjectMetadataListRequest(
      Boolean isPartialObjectMetadataListRequest) {
    this.isPartialObjectMetadataListRequest = isPartialObjectMetadataListRequest;
    return this;
  }

  public Boolean isPartialObjectMetadataListRequest() {
    return isPartialObjectMetadataListRequest;
  }

  public void setPartialObjectMetadataListRequest(Boolean isPartialObjectMetadataListRequest) {
    this.isPartialObjectMetadataListRequest = isPartialObjectMetadataListRequest;
  }
}
