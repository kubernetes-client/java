/*
Copyright 2026 The Kubernetes Authors.
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
public class CoreV1ResourceClaimBuilder extends CoreV1ResourceClaimFluent<CoreV1ResourceClaimBuilder> implements VisitableBuilder<CoreV1ResourceClaim,CoreV1ResourceClaimBuilder>{

  CoreV1ResourceClaimFluent<?> fluent;

  public CoreV1ResourceClaimBuilder() {
    this(new CoreV1ResourceClaim());
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaimFluent<?> fluent) {
    this(fluent, new CoreV1ResourceClaim());
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public CoreV1ResourceClaimBuilder(CoreV1ResourceClaimFluent<?> fluent,CoreV1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public CoreV1ResourceClaim build() {
    CoreV1ResourceClaim buildable = new CoreV1ResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setRequest(fluent.getRequest());
    return buildable;
  }
  
}