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
public interface V1ContainerStateTerminatedFluent<A extends V1ContainerStateTerminatedFluent<A>>
    extends Fluent<A> {
  public String getContainerID();

  public A withContainerID(java.lang.String containerID);

  public Boolean hasContainerID();

  public Integer getExitCode();

  public A withExitCode(java.lang.Integer exitCode);

  public java.lang.Boolean hasExitCode();

  public OffsetDateTime getFinishedAt();

  public A withFinishedAt(java.time.OffsetDateTime finishedAt);

  public java.lang.Boolean hasFinishedAt();

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  public java.lang.Integer getSignal();

  public A withSignal(java.lang.Integer signal);

  public java.lang.Boolean hasSignal();

  public java.time.OffsetDateTime getStartedAt();

  public A withStartedAt(java.time.OffsetDateTime startedAt);

  public java.lang.Boolean hasStartedAt();
}
