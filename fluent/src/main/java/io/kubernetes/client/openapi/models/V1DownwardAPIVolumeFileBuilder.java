package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DownwardAPIVolumeFileBuilder extends V1DownwardAPIVolumeFileFluent<V1DownwardAPIVolumeFileBuilder> implements VisitableBuilder<V1DownwardAPIVolumeFile,V1DownwardAPIVolumeFileBuilder>{
  public V1DownwardAPIVolumeFileBuilder() {
    this(new V1DownwardAPIVolumeFile());
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFileFluent<?> fluent) {
    this(fluent, new V1DownwardAPIVolumeFile());
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFileFluent<?> fluent,V1DownwardAPIVolumeFile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DownwardAPIVolumeFileFluent<?> fluent;
  
  public V1DownwardAPIVolumeFile build() {
    V1DownwardAPIVolumeFile buildable = new V1DownwardAPIVolumeFile();
    buildable.setFieldRef(fluent.buildFieldRef());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    buildable.setResourceFieldRef(fluent.buildResourceFieldRef());
    return buildable;
  }
  

}