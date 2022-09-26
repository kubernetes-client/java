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
public interface V1HorizontalPodAutoscalerStatusFluent<
        A extends V1HorizontalPodAutoscalerStatusFluent<A>>
    extends Fluent<A> {
  public Integer getCurrentCPUUtilizationPercentage();

  public A withCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage);

  public Boolean hasCurrentCPUUtilizationPercentage();

  public Integer getCurrentReplicas();

  public A withCurrentReplicas(Integer currentReplicas);

  public Boolean hasCurrentReplicas();

  public Integer getDesiredReplicas();

  public A withDesiredReplicas(Integer desiredReplicas);

  public Boolean hasDesiredReplicas();

  public OffsetDateTime getLastScaleTime();

  public A withLastScaleTime(OffsetDateTime lastScaleTime);

  public Boolean hasLastScaleTime();

  public Long getObservedGeneration();

  public A withObservedGeneration(Long observedGeneration);

  public Boolean hasObservedGeneration();
}
