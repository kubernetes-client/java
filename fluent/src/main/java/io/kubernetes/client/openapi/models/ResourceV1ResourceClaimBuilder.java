/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class ResourceV1ResourceClaimBuilder extends ResourceV1ResourceClaimFluent<ResourceV1ResourceClaimBuilder> implements VisitableBuilder<ResourceV1ResourceClaim,ResourceV1ResourceClaimBuilder>{

  ResourceV1ResourceClaimFluent<?> fluent;

  public ResourceV1ResourceClaimBuilder() {
    this(new ResourceV1ResourceClaim());
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaimFluent<?> fluent) {
    this(fluent, new ResourceV1ResourceClaim());
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public ResourceV1ResourceClaimBuilder(ResourceV1ResourceClaimFluent<?> fluent,ResourceV1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

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