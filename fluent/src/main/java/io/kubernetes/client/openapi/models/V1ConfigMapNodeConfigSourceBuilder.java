package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapNodeConfigSourceBuilder extends V1ConfigMapNodeConfigSourceFluentImpl<V1ConfigMapNodeConfigSourceBuilder> implements VisitableBuilder<V1ConfigMapNodeConfigSource,V1ConfigMapNodeConfigSourceBuilder>{
  public V1ConfigMapNodeConfigSourceBuilder() {
    this(false);
  }
  public V1ConfigMapNodeConfigSourceBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapNodeConfigSource(), validationEnabled);
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMapNodeConfigSource(), validationEnabled);
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent,V1ConfigMapNodeConfigSource instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent,V1ConfigMapNodeConfigSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKubeletConfigKey(instance.getKubeletConfigKey());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSource instance) {
    this(instance,false);
  }
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKubeletConfigKey(instance.getKubeletConfigKey());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapNodeConfigSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMapNodeConfigSource build() {
    V1ConfigMapNodeConfigSource buildable = new V1ConfigMapNodeConfigSource();
    buildable.setKubeletConfigKey(fluent.getKubeletConfigKey());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}