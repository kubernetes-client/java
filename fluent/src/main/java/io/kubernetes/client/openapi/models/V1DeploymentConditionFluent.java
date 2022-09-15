/*
Copyright 2022 The Kubernetes Authors.
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

import io.kubernetes.client.fluent.Fluent;
import java.time.OffsetDateTime;

/** Generated */
public interface V1DeploymentConditionFluent<A extends V1DeploymentConditionFluent<A>>
    extends Fluent<A> {
  public OffsetDateTime getLastTransitionTime();

  public A withLastTransitionTime(OffsetDateTime lastTransitionTime);

  public Boolean hasLastTransitionTime();

  public OffsetDateTime getLastUpdateTime();

  public A withLastUpdateTime(OffsetDateTime lastUpdateTime);

  public Boolean hasLastUpdateTime();

  public String getMessage();

  public A withMessage(String message);

  public Boolean hasMessage();

  public String getReason();

  public A withReason(String reason);

  public Boolean hasReason();

  public String getStatus();

  public A withStatus(String status);

  public Boolean hasStatus();

  public String getType();

  public A withType(String type);

  public Boolean hasType();
}
