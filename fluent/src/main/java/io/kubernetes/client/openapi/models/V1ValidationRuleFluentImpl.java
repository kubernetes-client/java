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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ValidationRuleFluentImpl<A extends V1ValidationRuleFluent<A>> extends BaseFluent<A>
    implements V1ValidationRuleFluent<A> {
  public V1ValidationRuleFluentImpl() {}

  public V1ValidationRuleFluentImpl(io.kubernetes.client.openapi.models.V1ValidationRule instance) {
    this.withMessage(instance.getMessage());

    this.withRule(instance.getRule());
  }

  private String message;
  private java.lang.String rule;

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public Boolean hasMessage() {
    return this.message != null;
  }

  public java.lang.String getRule() {
    return this.rule;
  }

  public A withRule(java.lang.String rule) {
    this.rule = rule;
    return (A) this;
  }

  public java.lang.Boolean hasRule() {
    return this.rule != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ValidationRuleFluentImpl that = (V1ValidationRuleFluentImpl) o;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (rule != null ? !rule.equals(that.rule) : that.rule != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(message, rule, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (rule != null) {
      sb.append("rule:");
      sb.append(rule);
    }
    sb.append("}");
    return sb.toString();
  }
}
