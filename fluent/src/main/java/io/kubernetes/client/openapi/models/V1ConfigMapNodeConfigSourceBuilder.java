package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapNodeConfigSourceBuilder extends V1ConfigMapNodeConfigSourceFluent<V1ConfigMapNodeConfigSourceBuilder> implements VisitableBuilder<V1ConfigMapNodeConfigSource,V1ConfigMapNodeConfigSourceBuilder>{
  public V1ConfigMapNodeConfigSourceBuilder() {
    this(new V1ConfigMapNodeConfigSource());
  }
  
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent) {
    this(fluent, new V1ConfigMapNodeConfigSource());
  }
  
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent,V1ConfigMapNodeConfigSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapNodeConfigSourceFluent<?> fluent;
  
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