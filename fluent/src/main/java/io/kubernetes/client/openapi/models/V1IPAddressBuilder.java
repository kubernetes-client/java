package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1IPAddressBuilder extends V1IPAddressFluent<V1IPAddressBuilder> implements VisitableBuilder<V1IPAddress,V1IPAddressBuilder>{

  V1IPAddressFluent<?> fluent;

  public V1IPAddressBuilder() {
    this(new V1IPAddress());
  }
  
  public V1IPAddressBuilder(V1IPAddressFluent<?> fluent) {
    this(fluent, new V1IPAddress());
  }
  
  public V1IPAddressBuilder(V1IPAddress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1IPAddressBuilder(V1IPAddressFluent<?> fluent,V1IPAddress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1IPAddress build() {
    V1IPAddress buildable = new V1IPAddress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}