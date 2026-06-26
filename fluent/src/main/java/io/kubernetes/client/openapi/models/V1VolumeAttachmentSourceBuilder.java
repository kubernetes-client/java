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
public class V1VolumeAttachmentSourceBuilder extends V1VolumeAttachmentSourceFluent<V1VolumeAttachmentSourceBuilder> implements VisitableBuilder<V1VolumeAttachmentSource,V1VolumeAttachmentSourceBuilder>{

  V1VolumeAttachmentSourceFluent<?> fluent;

  public V1VolumeAttachmentSourceBuilder() {
    this(new V1VolumeAttachmentSource());
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent) {
    this(fluent, new V1VolumeAttachmentSource());
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent,V1VolumeAttachmentSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeAttachmentSource build() {
    V1VolumeAttachmentSource buildable = new V1VolumeAttachmentSource();
    buildable.setInlineVolumeSpec(fluent.buildInlineVolumeSpec());
    buildable.setPersistentVolumeName(fluent.getPersistentVolumeName());
    return buildable;
  }
  
}