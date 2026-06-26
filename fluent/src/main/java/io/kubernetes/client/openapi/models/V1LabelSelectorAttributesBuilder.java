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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1LabelSelectorAttributesBuilder extends V1LabelSelectorAttributesFluent<V1LabelSelectorAttributesBuilder> implements VisitableBuilder<V1LabelSelectorAttributes,V1LabelSelectorAttributesBuilder>{

  V1LabelSelectorAttributesFluent<?> fluent;

  public V1LabelSelectorAttributesBuilder() {
    this(new V1LabelSelectorAttributes());
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributesFluent<?> fluent) {
    this(fluent, new V1LabelSelectorAttributes());
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LabelSelectorAttributesBuilder(V1LabelSelectorAttributesFluent<?> fluent,V1LabelSelectorAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LabelSelectorAttributes build() {
    V1LabelSelectorAttributes buildable = new V1LabelSelectorAttributes();
    buildable.setRawSelector(fluent.getRawSelector());
    buildable.setRequirements(fluent.buildRequirements());
    return buildable;
  }
  
}