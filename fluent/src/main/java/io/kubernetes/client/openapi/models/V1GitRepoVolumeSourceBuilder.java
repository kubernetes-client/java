package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1GitRepoVolumeSourceBuilder extends V1GitRepoVolumeSourceFluentImpl<V1GitRepoVolumeSourceBuilder> implements VisitableBuilder<V1GitRepoVolumeSource,V1GitRepoVolumeSourceBuilder>{
  public V1GitRepoVolumeSourceBuilder() {
    this(false);
  }
  public V1GitRepoVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GitRepoVolumeSource(), validationEnabled);
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1GitRepoVolumeSource(), validationEnabled);
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent,V1GitRepoVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSourceFluent<?> fluent,V1GitRepoVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDirectory(instance.getDirectory());

    fluent.withRepository(instance.getRepository());

    fluent.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled; 
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSource instance) {
    this(instance,false);
  }
  public V1GitRepoVolumeSourceBuilder(V1GitRepoVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDirectory(instance.getDirectory());

    this.withRepository(instance.getRepository());

    this.withRevision(instance.getRevision());

    this.validationEnabled = validationEnabled; 
  }
  V1GitRepoVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1GitRepoVolumeSource build() {
    V1GitRepoVolumeSource buildable = new V1GitRepoVolumeSource();
    buildable.setDirectory(fluent.getDirectory());
    buildable.setRepository(fluent.getRepository());
    buildable.setRevision(fluent.getRevision());
    return buildable;
  }
  
}