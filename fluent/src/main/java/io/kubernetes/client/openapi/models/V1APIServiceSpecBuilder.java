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

public class V1APIServiceSpecBuilder
    extends io.kubernetes.client.openapi.models.V1APIServiceSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1APIServiceSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1APIServiceSpec,
        io.kubernetes.client.openapi.models.V1APIServiceSpecBuilder> {
  public V1APIServiceSpecBuilder() {
    this(false);
  }

  public V1APIServiceSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1APIServiceSpec(), validationEnabled);
  }

  public V1APIServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1APIServiceSpec(), validationEnabled);
  }

  public V1APIServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIServiceSpec instance) {
    this(fluent, instance, false);
  }

  public V1APIServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1APIServiceSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCaBundle(instance.getCaBundle());

    fluent.withGroup(instance.getGroup());

    fluent.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());

    fluent.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());

    fluent.withService(instance.getService());

    fluent.withVersion(instance.getVersion());

    fluent.withVersionPriority(instance.getVersionPriority());

    this.validationEnabled = validationEnabled;
  }

  public V1APIServiceSpecBuilder(io.kubernetes.client.openapi.models.V1APIServiceSpec instance) {
    this(instance, false);
  }

  public V1APIServiceSpecBuilder(
      io.kubernetes.client.openapi.models.V1APIServiceSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCaBundle(instance.getCaBundle());

    this.withGroup(instance.getGroup());

    this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());

    this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());

    this.withService(instance.getService());

    this.withVersion(instance.getVersion());

    this.withVersionPriority(instance.getVersionPriority());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1APIServiceSpec build() {
    V1APIServiceSpec buildable = new V1APIServiceSpec();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setGroup(fluent.getGroup());
    buildable.setGroupPriorityMinimum(fluent.getGroupPriorityMinimum());
    buildable.setInsecureSkipTLSVerify(fluent.getInsecureSkipTLSVerify());
    buildable.setService(fluent.getService());
    buildable.setVersion(fluent.getVersion());
    buildable.setVersionPriority(fluent.getVersionPriority());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIServiceSpecBuilder that = (V1APIServiceSpecBuilder) o;
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
