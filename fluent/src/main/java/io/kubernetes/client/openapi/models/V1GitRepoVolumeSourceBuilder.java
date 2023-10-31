package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GitRepoVolumeSourceBuilder extends V1GitRepoVolumeSourceFluent<V1GitRepoVolumeSourceBuilder> implements VisitableBuilder<V1GitRepoVolumeSource,V1GitRepoVolumeSourceBuilder>{
  public V1GitRepoVolumeSourceBuilder() {
    this(new V1GitRepoVolumeSource());
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GitRepoVolumeSource());
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent,V1GitRepoVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GitRepoVolumeSourceFluent<?> fluent;
  
  public V1GitRepoVolumeSource build() {
    V1GitRepoVolumeSource buildable = new V1GitRepoVolumeSource();
    buildable.setDirectory(fluent.getDirectory());
    buildable.setRepository(fluent.getRepository());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  

}