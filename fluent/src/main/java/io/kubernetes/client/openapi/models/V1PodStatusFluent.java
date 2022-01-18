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

/** Generated */
public interface V1PodStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1PodStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodCondition item);

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1PodCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1PodCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodCondition> items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> buildConditions();

  public io.kubernetes.client.openapi.models.V1PodCondition buildCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1PodCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1PodCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1PodCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1PodCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1PodCondition item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodCondition item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A> editCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodConditionBuilder>
              predicate);

  public A addToContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A setToContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A addToContainerStatuses(io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A addAllToContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeFromContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A removeAllFromContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeMatchingFromContainerStatuses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildContainerStatuses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      getContainerStatuses();

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      buildContainerStatuses();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildContainerStatus(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildMatchingContainerStatus(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  public java.lang.Boolean hasMatchingContainerStatus(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  public A withContainerStatuses(
      java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> containerStatuses);

  public A withContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... containerStatuses);

  public java.lang.Boolean hasContainerStatuses();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      addNewContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      addNewContainerStatusLike(io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      setNewContainerStatusLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      editContainerStatus(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      editFirstContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      editLastContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<A>
      editMatchingContainerStatus(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
              predicate);

  public A addToEphemeralContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A setToEphemeralContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A addToEphemeralContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A addAllToEphemeralContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeFromEphemeralContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A removeAllFromEphemeralContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeMatchingFromEphemeralContainerStatuses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildEphemeralContainerStatuses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      getEphemeralContainerStatuses();

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      buildEphemeralContainerStatuses();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildEphemeralContainerStatus(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstEphemeralContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastEphemeralContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus
      buildMatchingEphemeralContainerStatus(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
              predicate);

  public java.lang.Boolean hasMatchingEphemeralContainerStatus(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  public A withEphemeralContainerStatuses(
      java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
          ephemeralContainerStatuses);

  public A withEphemeralContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... ephemeralContainerStatuses);

  public java.lang.Boolean hasEphemeralContainerStatuses();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      addNewEphemeralContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      addNewEphemeralContainerStatusLike(
          io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      setNewEphemeralContainerStatusLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      editEphemeralContainerStatus(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      editFirstEphemeralContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      editLastEphemeralContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.EphemeralContainerStatusesNested<A>
      editMatchingEphemeralContainerStatus(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
              predicate);

  public java.lang.String getHostIP();

  public A withHostIP(java.lang.String hostIP);

  public java.lang.Boolean hasHostIP();

  /** Method is deprecated. use withHostIP instead. */
  @java.lang.Deprecated
  public A withNewHostIP(java.lang.String original);

  public A addToInitContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A setToInitContainerStatuses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public A addToInitContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A addAllToInitContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeFromInitContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... items);

  public A removeAllFromInitContainerStatuses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerStatus> items);

  public A removeMatchingFromInitContainerStatuses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildInitContainerStatuses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      getInitContainerStatuses();

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus>
      buildInitContainerStatuses();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildInitContainerStatus(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildFirstInitContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildLastInitContainerStatus();

  public io.kubernetes.client.openapi.models.V1ContainerStatus buildMatchingInitContainerStatus(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  public java.lang.Boolean hasMatchingInitContainerStatus(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
          predicate);

  public A withInitContainerStatuses(
      java.util.List<io.kubernetes.client.openapi.models.V1ContainerStatus> initContainerStatuses);

  public A withInitContainerStatuses(
      io.kubernetes.client.openapi.models.V1ContainerStatus... initContainerStatuses);

  public java.lang.Boolean hasInitContainerStatuses();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      addNewInitContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      addNewInitContainerStatusLike(io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      setNewInitContainerStatusLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerStatus item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      editInitContainerStatus(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      editFirstInitContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      editLastInitContainerStatus();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<A>
      editMatchingInitContainerStatus(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerStatusBuilder>
              predicate);

  public java.lang.String getMessage();

  public A withMessage(java.lang.String message);

  public java.lang.Boolean hasMessage();

  /** Method is deprecated. use withMessage instead. */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);

  public java.lang.String getNominatedNodeName();

  public A withNominatedNodeName(java.lang.String nominatedNodeName);

  public java.lang.Boolean hasNominatedNodeName();

  /** Method is deprecated. use withNominatedNodeName instead. */
  @java.lang.Deprecated
  public A withNewNominatedNodeName(java.lang.String original);

  public io.kubernetes.client.openapi.models.V1PodStatus.PhaseEnum getPhase();

  public A withPhase(io.kubernetes.client.openapi.models.V1PodStatus.PhaseEnum phase);

  public java.lang.Boolean hasPhase();

  public java.lang.String getPodIP();

  public A withPodIP(java.lang.String podIP);

  public java.lang.Boolean hasPodIP();

  /** Method is deprecated. use withPodIP instead. */
  @java.lang.Deprecated
  public A withNewPodIP(java.lang.String original);

  public A addToPodIPs(java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodIP item);

  public A setToPodIPs(java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodIP item);

  public A addToPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items);

  public A addAllToPodIPs(java.util.Collection<io.kubernetes.client.openapi.models.V1PodIP> items);

  public A removeFromPodIPs(io.kubernetes.client.openapi.models.V1PodIP... items);

  public A removeAllFromPodIPs(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodIP> items);

  public A removeMatchingFromPodIPs(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPodIPs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodIP> getPodIPs();

  public java.util.List<io.kubernetes.client.openapi.models.V1PodIP> buildPodIPs();

  public io.kubernetes.client.openapi.models.V1PodIP buildPodIP(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodIP buildFirstPodIP();

  public io.kubernetes.client.openapi.models.V1PodIP buildLastPodIP();

  public io.kubernetes.client.openapi.models.V1PodIP buildMatchingPodIP(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate);

  public java.lang.Boolean hasMatchingPodIP(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate);

  public A withPodIPs(java.util.List<io.kubernetes.client.openapi.models.V1PodIP> podIPs);

  public A withPodIPs(io.kubernetes.client.openapi.models.V1PodIP... podIPs);

  public java.lang.Boolean hasPodIPs();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> addNewPodIP();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> addNewPodIPLike(
      io.kubernetes.client.openapi.models.V1PodIP item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> setNewPodIPLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodIP item);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editPodIP(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editFirstPodIP();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editLastPodIP();

  public io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<A> editMatchingPodIP(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodIPBuilder> predicate);

  public io.kubernetes.client.openapi.models.V1PodStatus.QosClassEnum getQosClass();

  public A withQosClass(io.kubernetes.client.openapi.models.V1PodStatus.QosClassEnum qosClass);

  public java.lang.Boolean hasQosClass();

  public java.lang.String getReason();

  public A withReason(java.lang.String reason);

  public java.lang.Boolean hasReason();

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);

  public java.time.OffsetDateTime getStartTime();

  public A withStartTime(java.time.OffsetDateTime startTime);

  public java.lang.Boolean hasStartTime();

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PodConditionFluent<
              io.kubernetes.client.openapi.models.V1PodStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface ContainerStatusesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ContainerStatusFluent<
              io.kubernetes.client.openapi.models.V1PodStatusFluent.ContainerStatusesNested<N>> {
    public N and();

    public N endContainerStatus();
  }

  public interface EphemeralContainerStatusesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ContainerStatusFluent<
              io.kubernetes.client.openapi.models.V1PodStatusFluent
                      .EphemeralContainerStatusesNested<
                  N>> {
    public N and();

    public N endEphemeralContainerStatus();
  }

  public interface InitContainerStatusesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ContainerStatusFluent<
              io.kubernetes.client.openapi.models.V1PodStatusFluent.InitContainerStatusesNested<
                  N>> {
    public N and();

    public N endInitContainerStatus();
  }

  public interface PodIPsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PodIPFluent<
              io.kubernetes.client.openapi.models.V1PodStatusFluent.PodIPsNested<N>> {
    public N and();

    public N endPodIP();
  }
}
