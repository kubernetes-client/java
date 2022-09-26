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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1IngressTLSBuilder extends V1IngressTLSFluentImpl<V1IngressTLSBuilder>
    implements VisitableBuilder<V1IngressTLS, V1IngressTLSBuilder> {
  public V1IngressTLSBuilder() {
    this(false);
  }

  public V1IngressTLSBuilder(Boolean validationEnabled) {
    this(new V1IngressTLS(), validationEnabled);
  }

  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent) {
    this(fluent, false);
  }

  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1IngressTLS(), validationEnabled);
  }

  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent, V1IngressTLS instance) {
    this(fluent, instance, false);
  }

  public V1IngressTLSBuilder(
      V1IngressTLSFluent<?> fluent, V1IngressTLS instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHosts(instance.getHosts());

    fluent.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled;
  }

  public V1IngressTLSBuilder(V1IngressTLS instance) {
    this(instance, false);
  }

  public V1IngressTLSBuilder(V1IngressTLS instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled;
  }

  V1IngressTLSFluent<?> fluent;
  Boolean validationEnabled;

  public V1IngressTLS build() {
    V1IngressTLS buildable = new V1IngressTLS();
    buildable.setHosts(fluent.getHosts());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
}
