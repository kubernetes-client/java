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

/** Rule describes an alerting or recording rule. */
@ApiModel(description = "Rule describes an alerting or recording rule.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusRuleSpecRules {
  public static final String SERIALIZED_NAME_ALERT = "alert";

  @SerializedName(SERIALIZED_NAME_ALERT)
  private String alert;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";

  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_EXPR = "expr";

  @SerializedName(SERIALIZED_NAME_EXPR)
  private Object expr;

  public static final String SERIALIZED_NAME_FOR = "for";

  @SerializedName(SERIALIZED_NAME_FOR)
  private String _for;

  public static final String SERIALIZED_NAME_LABELS = "labels";

  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_RECORD = "record";

  @SerializedName(SERIALIZED_NAME_RECORD)
  private String record;

  public V1PrometheusRuleSpecRules alert(String alert) {

    this.alert = alert;
    return this;
  }

  /**
   * Get alert
   *
   * @return alert
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getAlert() {
    return alert;
  }

  public void setAlert(String alert) {
    this.alert = alert;
  }

  public V1PrometheusRuleSpecRules annotations(Map<String, String> annotations) {

    this.annotations = annotations;
    return this;
  }

  public V1PrometheusRuleSpecRules putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Get annotations
   *
   * @return annotations
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1PrometheusRuleSpecRules expr(Object expr) {

    this.expr = expr;
    return this;
  }

  /**
   * Get expr
   *
   * @return expr
   */
  @ApiModelProperty(required = true, value = "")
  public Object getExpr() {
    return expr;
  }

  public void setExpr(Object expr) {
    this.expr = expr;
  }

  public V1PrometheusRuleSpecRules _for(String _for) {

    this._for = _for;
    return this;
  }

  /**
   * Get _for
   *
   * @return _for
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getFor() {
    return _for;
  }

  public void setFor(String _for) {
    this._for = _for;
  }

  public V1PrometheusRuleSpecRules labels(Map<String, String> labels) {

    this.labels = labels;
    return this;
  }

  public V1PrometheusRuleSpecRules putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   *
   * @return labels
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1PrometheusRuleSpecRules record(String record) {

    this.record = record;
    return this;
  }

  /**
   * Get record
   *
   * @return record
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getRecord() {
    return record;
  }

  public void setRecord(String record) {
    this.record = record;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusRuleSpecRules v1PrometheusRuleSpecRules = (V1PrometheusRuleSpecRules) o;
    return Objects.equals(this.alert, v1PrometheusRuleSpecRules.alert)
        && Objects.equals(this.annotations, v1PrometheusRuleSpecRules.annotations)
        && Objects.equals(this.expr, v1PrometheusRuleSpecRules.expr)
        && Objects.equals(this._for, v1PrometheusRuleSpecRules._for)
        && Objects.equals(this.labels, v1PrometheusRuleSpecRules.labels)
        && Objects.equals(this.record, v1PrometheusRuleSpecRules.record);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, annotations, expr, _for, labels, record);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusRuleSpecRules {\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
    sb.append("    _for: ").append(toIndentedString(_for)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
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
