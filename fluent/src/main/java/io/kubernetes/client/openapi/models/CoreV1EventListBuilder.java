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

public class CoreV1EventListBuilder extends CoreV1EventListFluentImpl<CoreV1EventListBuilder>
    implements VisitableBuilder<CoreV1EventList, CoreV1EventListBuilder> {
  public CoreV1EventListBuilder() {
    this(false);
  }

  public CoreV1EventListBuilder(Boolean validationEnabled) {
    this(new CoreV1EventList(), validationEnabled);
  }

  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new CoreV1EventList(), validationEnabled);
  }

  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent, CoreV1EventList instance) {
    this(fluent, instance, false);
  }

  public CoreV1EventListBuilder(
      CoreV1EventListFluent<?> fluent, CoreV1EventList instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EventListBuilder(CoreV1EventList instance) {
    this(instance, false);
  }

  public CoreV1EventListBuilder(CoreV1EventList instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  CoreV1EventListFluent<?> fluent;
  Boolean validationEnabled;

  public CoreV1EventList build() {
    CoreV1EventList buildable = new CoreV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
