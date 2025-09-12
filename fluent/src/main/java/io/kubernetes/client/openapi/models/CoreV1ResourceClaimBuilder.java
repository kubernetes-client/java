package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class CoreV1ResourceClaimBuilder extends CoreV1ResourceClaimFluent<CoreV1ResourceClaimBuilder> implements VisitableBuilder<CoreV1ResourceClaim,CoreV1ResourceClaimBuilder>{
  public CoreV1ResourceClaimBuilder() {
    this(new CoreV1ResourceClaim());
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaimFluent<?> fluent) {
    this(fluent, new CoreV1ResourceClaim());
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaimFluent<?> fluent,CoreV1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CoreV1ResourceClaimFluent<?> fluent;
  
  public CoreV1ResourceClaim build() {
    CoreV1ResourceClaim buildable = new CoreV1ResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setRequest(fluent.getRequest());
    return buildable;
  }
  

}