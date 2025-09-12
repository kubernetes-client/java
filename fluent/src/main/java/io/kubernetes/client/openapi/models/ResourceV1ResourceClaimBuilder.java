package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class ResourceV1ResourceClaimBuilder extends ResourceV1ResourceClaimFluent<ResourceV1ResourceClaimBuilder> implements VisitableBuilder<ResourceV1ResourceClaim,ResourceV1ResourceClaimBuilder>{
  public ResourceV1ResourceClaimBuilder() {
    this(new ResourceV1ResourceClaim());
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaimFluent<?> fluent) {
    this(fluent, new ResourceV1ResourceClaim());
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaimFluent<?> fluent,ResourceV1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  ResourceV1ResourceClaimFluent<?> fluent;
  
  public ResourceV1ResourceClaim build() {
    ResourceV1ResourceClaim buildable = new ResourceV1ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}