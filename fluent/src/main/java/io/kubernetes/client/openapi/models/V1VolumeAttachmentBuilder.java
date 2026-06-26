/*
Copyright 2026 The Kubernetes Authors.
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
public class V1VolumeAttachmentBuilder extends V1VolumeAttachmentFluent<V1VolumeAttachmentBuilder> implements VisitableBuilder<V1VolumeAttachment,V1VolumeAttachmentBuilder>{

  V1VolumeAttachmentFluent<?> fluent;

  public V1VolumeAttachmentBuilder() {
    this(new V1VolumeAttachment());
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent) {
    this(fluent, new V1VolumeAttachment());
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachment instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeAttachmentBuilder(V1VolumeAttachmentFluent<?> fluent,V1VolumeAttachment instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeAttachment build() {
    V1VolumeAttachment buildable = new V1VolumeAttachment();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}