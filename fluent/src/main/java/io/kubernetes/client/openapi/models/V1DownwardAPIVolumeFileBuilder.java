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
public class V1DownwardAPIVolumeFileBuilder extends V1DownwardAPIVolumeFileFluent<V1DownwardAPIVolumeFileBuilder> implements VisitableBuilder<V1DownwardAPIVolumeFile,V1DownwardAPIVolumeFileBuilder>{

  V1DownwardAPIVolumeFileFluent<?> fluent;

  public V1DownwardAPIVolumeFileBuilder() {
    this(new V1DownwardAPIVolumeFile());
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFileFluent<?> fluent) {
    this(fluent, new V1DownwardAPIVolumeFile());
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFileFluent<?> fluent,V1DownwardAPIVolumeFile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DownwardAPIVolumeFile build() {
    V1DownwardAPIVolumeFile buildable = new V1DownwardAPIVolumeFile();
    buildable.setFieldRef(fluent.buildFieldRef());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    buildable.setResourceFieldRef(fluent.buildResourceFieldRef());
    return buildable;
  }
  
}