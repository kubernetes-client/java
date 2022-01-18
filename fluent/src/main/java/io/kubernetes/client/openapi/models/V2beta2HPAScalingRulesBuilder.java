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

public class V2beta2HPAScalingRulesBuilder
    extends io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluentImpl<
        io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2HPAScalingRules,
        io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesBuilder> {
  public V2beta2HPAScalingRulesBuilder() {
    this(false);
  }

  public V2beta2HPAScalingRulesBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta2HPAScalingRules(), validationEnabled);
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2HPAScalingRules(), validationEnabled);
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance) {
    this(fluent, instance, false);
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPolicies(instance.getPolicies());

    fluent.withSelectPolicy(instance.getSelectPolicy());

    fluent.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance) {
    this(instance, false);
  }

  public V2beta2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules build() {
    V2beta2HPAScalingRules buildable = new V2beta2HPAScalingRules();
    buildable.setPolicies(fluent.getPolicies());
    buildable.setSelectPolicy(fluent.getSelectPolicy());
    buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta2HPAScalingRulesBuilder that = (V2beta2HPAScalingRulesBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
