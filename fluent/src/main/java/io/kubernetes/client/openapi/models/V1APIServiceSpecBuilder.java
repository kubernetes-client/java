package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIServiceSpecBuilder extends V1APIServiceSpecFluent<V1APIServiceSpecBuilder> implements VisitableBuilder<V1APIServiceSpec,V1APIServiceSpecBuilder>{
  public V1APIServiceSpecBuilder() {
    this(new V1APIServiceSpec());
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent) {
    this(fluent, new V1APIServiceSpec());
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent,V1APIServiceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIServiceSpecBuilder(V1APIServiceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIServiceSpecFluent<?> fluent;
  
  public V1APIServiceSpec build() {
    V1APIServiceSpec buildable = new V1APIServiceSpec();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setGroup(fluent.getGroup());
    buildable.setGroupPriorityMinimum(fluent.getGroupPriorityMinimum());
    buildable.setInsecureSkipTLSVerify(fluent.getInsecureSkipTLSVerify());
    buildable.setService(fluent.buildService());
    buildable.setVersion(fluent.getVersion());
    buildable.setVersionPriority(fluent.getVersionPriority());
    return buildable;
  }
  

}