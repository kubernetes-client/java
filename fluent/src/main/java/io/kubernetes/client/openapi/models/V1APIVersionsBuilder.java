package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIVersionsBuilder extends V1APIVersionsFluentImpl<V1APIVersionsBuilder> implements VisitableBuilder<V1APIVersions,V1APIVersionsBuilder>{
  public V1APIVersionsBuilder() {
    this(false);
  }
  public V1APIVersionsBuilder(Boolean validationEnabled) {
    this(new V1APIVersions(), validationEnabled);
  }
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIVersions(), validationEnabled);
  }
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent,V1APIVersions instance) {
    this(fluent, instance, false);
  }
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent,V1APIVersions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIVersionsBuilder(V1APIVersions instance) {
    this(instance,false);
  }
  public V1APIVersionsBuilder(V1APIVersions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withServerAddressByClientCIDRs(instance.getServerAddressByClientCIDRs());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled; 
  }
  V1APIVersionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIVersions build() {
    V1APIVersions buildable = new V1APIVersions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setServerAddressByClientCIDRs(fluent.getServerAddressByClientCIDRs());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
  
}