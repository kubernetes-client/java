package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceAccountBuilder extends V1ServiceAccountFluentImpl<V1ServiceAccountBuilder> implements VisitableBuilder<V1ServiceAccount,V1ServiceAccountBuilder>{
  public V1ServiceAccountBuilder() {
    this(false);
  }
  public V1ServiceAccountBuilder(Boolean validationEnabled) {
    this(new V1ServiceAccount(), validationEnabled);
  }
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceAccount(), validationEnabled);
  }
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent,V1ServiceAccount instance) {
    this(fluent, instance, false);
  }
  public V1ServiceAccountBuilder(V1ServiceAccountFluent<?> fluent,V1ServiceAccount instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    fluent.withImagePullSecrets(instance.getImagePullSecrets());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSecrets(instance.getSecrets());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceAccountBuilder(V1ServiceAccount instance) {
    this(instance,false);
  }
  public V1ServiceAccountBuilder(V1ServiceAccount instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    this.withImagePullSecrets(instance.getImagePullSecrets());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSecrets(instance.getSecrets());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceAccountFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceAccount build() {
    V1ServiceAccount buildable = new V1ServiceAccount();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setAutomountServiceAccountToken(fluent.getAutomountServiceAccountToken());
    buildable.setImagePullSecrets(fluent.getImagePullSecrets());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSecrets(fluent.getSecrets());
    return buildable;
  }
  
}