package io.kubernetes.client.extended.generic.options;

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

  public String getFieldSelector() {
    return fieldSelector;
  }

  public void setFieldSelector(String fieldSelector) {
    this.fieldSelector = fieldSelector;
  }

  public String getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
  }

  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public String getContinue() {
    return _continue;
  }

  public void setContinue(String _continue) {
    this._continue = _continue;
  }

  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }
}
