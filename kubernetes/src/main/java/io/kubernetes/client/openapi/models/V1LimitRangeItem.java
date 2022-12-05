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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** LimitRangeItem defines a min/max usage limit for any resource that matches on kind. */
@ApiModel(
    description =
        "LimitRangeItem defines a min/max usage limit for any resource that matches on kind.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1LimitRangeItem {
  public static final String SERIALIZED_NAME_DEFAULT = "default";

  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Map<String, Quantity> _default = null;

  public static final String SERIALIZED_NAME_DEFAULT_REQUEST = "defaultRequest";

  @SerializedName(SERIALIZED_NAME_DEFAULT_REQUEST)
  private Map<String, Quantity> defaultRequest = null;

  public static final String SERIALIZED_NAME_MAX = "max";

  @SerializedName(SERIALIZED_NAME_MAX)
  private Map<String, Quantity> max = null;

  public static final String SERIALIZED_NAME_MAX_LIMIT_REQUEST_RATIO = "maxLimitRequestRatio";

  @SerializedName(SERIALIZED_NAME_MAX_LIMIT_REQUEST_RATIO)
  private Map<String, Quantity> maxLimitRequestRatio = null;

  public static final String SERIALIZED_NAME_MIN = "min";

  @SerializedName(SERIALIZED_NAME_MIN)
  private Map<String, Quantity> min = null;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1LimitRangeItem _default(Map<String, Quantity> _default) {

    this._default = _default;
    return this;
  }

  public V1LimitRangeItem putDefaultItem(String key, Quantity _defaultItem) {
    if (this._default == null) {
      this._default = new HashMap<>();
    }
    this._default.put(key, _defaultItem);
    return this;
  }

  /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   *
   * @return _default
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Default resource requirement limit value by resource name if resource limit is omitted.")
  public Map<String, Quantity> getDefault() {
    return _default;
  }

  public void setDefault(Map<String, Quantity> _default) {
    this._default = _default;
  }

  public V1LimitRangeItem defaultRequest(Map<String, Quantity> defaultRequest) {

    this.defaultRequest = defaultRequest;
    return this;
  }

  public V1LimitRangeItem putDefaultRequestItem(String key, Quantity defaultRequestItem) {
    if (this.defaultRequest == null) {
      this.defaultRequest = new HashMap<>();
    }
    this.defaultRequest.put(key, defaultRequestItem);
    return this;
  }

  /**
   * DefaultRequest is the default resource requirement request value by resource name if resource
   * request is omitted.
   *
   * @return defaultRequest
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.")
  public Map<String, Quantity> getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(Map<String, Quantity> defaultRequest) {
    this.defaultRequest = defaultRequest;
  }

  public V1LimitRangeItem max(Map<String, Quantity> max) {

    this.max = max;
    return this;
  }

  public V1LimitRangeItem putMaxItem(String key, Quantity maxItem) {
    if (this.max == null) {
      this.max = new HashMap<>();
    }
    this.max.put(key, maxItem);
    return this;
  }

  /**
   * Max usage constraints on this kind by resource name.
   *
   * @return max
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max usage constraints on this kind by resource name.")
  public Map<String, Quantity> getMax() {
    return max;
  }

  public void setMax(Map<String, Quantity> max) {
    this.max = max;
  }

  public V1LimitRangeItem maxLimitRequestRatio(Map<String, Quantity> maxLimitRequestRatio) {

    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

  public V1LimitRangeItem putMaxLimitRequestRatioItem(
      String key, Quantity maxLimitRequestRatioItem) {
    if (this.maxLimitRequestRatio == null) {
      this.maxLimitRequestRatio = new HashMap<>();
    }
    this.maxLimitRequestRatio.put(key, maxLimitRequestRatioItem);
    return this;
  }

  /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are
   * both non-zero where limit divided by request is less than or equal to the enumerated value;
   * this represents the max burst for the named resource.
   *
   * @return maxLimitRequestRatio
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.")
  public Map<String, Quantity> getMaxLimitRequestRatio() {
    return maxLimitRequestRatio;
  }

  public void setMaxLimitRequestRatio(Map<String, Quantity> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
  }

  public V1LimitRangeItem min(Map<String, Quantity> min) {

    this.min = min;
    return this;
  }

  public V1LimitRangeItem putMinItem(String key, Quantity minItem) {
    if (this.min == null) {
      this.min = new HashMap<>();
    }
    this.min.put(key, minItem);
    return this;
  }

  /**
   * Min usage constraints on this kind by resource name.
   *
   * @return min
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Min usage constraints on this kind by resource name.")
  public Map<String, Quantity> getMin() {
    return min;
  }

  public void setMin(Map<String, Quantity> min) {
    this.min = min;
  }

  public V1LimitRangeItem type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type of resource that this limit applies to.
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of resource that this limit applies to.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LimitRangeItem v1LimitRangeItem = (V1LimitRangeItem) o;
    return Objects.equals(this._default, v1LimitRangeItem._default)
        && Objects.equals(this.defaultRequest, v1LimitRangeItem.defaultRequest)
        && Objects.equals(this.max, v1LimitRangeItem.max)
        && Objects.equals(this.maxLimitRequestRatio, v1LimitRangeItem.maxLimitRequestRatio)
        && Objects.equals(this.min, v1LimitRangeItem.min)
        && Objects.equals(this.type, v1LimitRangeItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultRequest, max, maxLimitRequestRatio, min, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeItem {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLimitRequestRatio: ")
        .append(toIndentedString(maxLimitRequestRatio))
        .append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
