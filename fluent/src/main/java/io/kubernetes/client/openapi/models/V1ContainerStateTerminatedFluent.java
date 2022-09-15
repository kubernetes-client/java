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

  public A withContainerID(String containerID);

  public Boolean hasContainerID();

  public Integer getExitCode();

  public A withExitCode(Integer exitCode);

  public Boolean hasExitCode();

  public OffsetDateTime getFinishedAt();

  public A withFinishedAt(OffsetDateTime finishedAt);

  public Boolean hasFinishedAt();

  public String getMessage();

  public A withMessage(String message);

  public Boolean hasMessage();

  public String getReason();

  public A withReason(String reason);

  public Boolean hasReason();

  public Integer getSignal();

  public A withSignal(Integer signal);

  public Boolean hasSignal();

  public OffsetDateTime getStartedAt();

  public A withStartedAt(OffsetDateTime startedAt);

  public Boolean hasStartedAt();
}
