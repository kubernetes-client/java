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
public interface V1beta1FlowSchemaConditionFluent<A extends V1beta1FlowSchemaConditionFluent<A>>
    extends Fluent<A> {
  public OffsetDateTime getLastTransitionTime();

  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime);

  public Boolean hasLastTransitionTime();

  public String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  public java.lang.String getStatus();

  public A withStatus(java.lang.String status);

  public java.lang.Boolean hasStatus();

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();
}
