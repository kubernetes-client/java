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
public interface V1NodeStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1NodeStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item);

  public A setToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item);

  public A addToAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items);

  public A addAllToAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeAddress> items);

  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items);

  public A removeAllFromAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeAddress> items);

  public A removeMatchingFromAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildAddresses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> getAddresses();

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> buildAddresses();

  public io.kubernetes.client.openapi.models.V1NodeAddress buildAddress(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeAddress buildFirstAddress();

  public io.kubernetes.client.openapi.models.V1NodeAddress buildLastAddress();

  public io.kubernetes.client.openapi.models.V1NodeAddress buildMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate);

  public java.lang.Boolean hasMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate);

  public A withAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> addresses);

  public A withAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... addresses);

  public java.lang.Boolean hasAddresses();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A> addNewAddress();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      addNewAddressLike(io.kubernetes.client.openapi.models.V1NodeAddress item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      setNewAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A> editAddress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editFirstAddress();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editLastAddress();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editMatchingAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
              predicate);

  public A addToAllocatable(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromAllocatable(java.lang.String key);

  public A removeFromAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getAllocatable();

  public <K, V> A withAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatable);

  public java.lang.Boolean hasAllocatable();

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToCapacity(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromCapacity(java.lang.String key);

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity();

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity);

  public java.lang.Boolean hasCapacity();

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item);

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items);

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeCondition> items);

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeCondition> items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> buildConditions();

  public io.kubernetes.client.openapi.models.V1NodeCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeCondition buildFirstCondition();

  public io.kubernetes.client.openapi.models.V1NodeCondition buildLastCondition();

  public io.kubernetes.client.openapi.models.V1NodeCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> conditions);

  public A withConditions(io.kubernetes.client.openapi.models.V1NodeCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1NodeCondition item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A> editCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
              predicate);

  /**
   * This method has been deprecated, please use method buildConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigStatus getConfig();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatus buildConfig();

  public A withConfig(io.kubernetes.client.openapi.models.V1NodeConfigStatus config);

  public java.lang.Boolean hasConfig();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> withNewConfig();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> withNewConfigLike(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editConfig();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editOrNewConfig();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus item);

  /**
   * This method has been deprecated, please use method buildDaemonEndpoints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints getDaemonEndpoints();

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints buildDaemonEndpoints();

  public A withDaemonEndpoints(
      io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints daemonEndpoints);

  public java.lang.Boolean hasDaemonEndpoints();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      withNewDaemonEndpoints();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      withNewDaemonEndpointsLike(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editDaemonEndpoints();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editOrNewDaemonEndpoints();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editOrNewDaemonEndpointsLike(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints item);

  public A addToImages(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item);

  public A setToImages(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item);

  public A addToImages(io.kubernetes.client.openapi.models.V1ContainerImage... items);

  public A addAllToImages(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerImage> items);

  public A removeFromImages(io.kubernetes.client.openapi.models.V1ContainerImage... items);

  public A removeAllFromImages(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerImage> items);

  public A removeMatchingFromImages(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildImages instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> getImages();

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> buildImages();

  public io.kubernetes.client.openapi.models.V1ContainerImage buildImage(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ContainerImage buildFirstImage();

  public io.kubernetes.client.openapi.models.V1ContainerImage buildLastImage();

  public io.kubernetes.client.openapi.models.V1ContainerImage buildMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate);

  public java.lang.Boolean hasMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate);

  public A withImages(java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> images);

  public A withImages(io.kubernetes.client.openapi.models.V1ContainerImage... images);

  public java.lang.Boolean hasImages();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> addNewImage();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> addNewImageLike(
      io.kubernetes.client.openapi.models.V1ContainerImage item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> setNewImageLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editImage(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editFirstImage();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editLastImage();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildNodeInfo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeSystemInfo getNodeInfo();

  public io.kubernetes.client.openapi.models.V1NodeSystemInfo buildNodeInfo();

  public A withNodeInfo(io.kubernetes.client.openapi.models.V1NodeSystemInfo nodeInfo);

  public java.lang.Boolean hasNodeInfo();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A> withNewNodeInfo();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      withNewNodeInfoLike(io.kubernetes.client.openapi.models.V1NodeSystemInfo item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A> editNodeInfo();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      editOrNewNodeInfo();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      editOrNewNodeInfoLike(io.kubernetes.client.openapi.models.V1NodeSystemInfo item);

  public io.kubernetes.client.openapi.models.V1NodeStatus.PhaseEnum getPhase();

  public A withPhase(io.kubernetes.client.openapi.models.V1NodeStatus.PhaseEnum phase);

  public java.lang.Boolean hasPhase();

  public A addToVolumesAttached(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item);

  public A setToVolumesAttached(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item);

  public A addToVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items);

  public A addAllToVolumesAttached(
      java.util.Collection<io.kubernetes.client.openapi.models.V1AttachedVolume> items);

  public A removeFromVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items);

  public A removeAllFromVolumesAttached(
      java.util.Collection<io.kubernetes.client.openapi.models.V1AttachedVolume> items);

  public A removeMatchingFromVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildVolumesAttached instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume> getVolumesAttached();

  public java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume>
      buildVolumesAttached();

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildVolumesAttached(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildFirstVolumesAttached();

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildLastVolumesAttached();

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildMatchingVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate);

  public java.lang.Boolean hasMatchingVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate);

  public A withVolumesAttached(
      java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume> volumesAttached);

  public A withVolumesAttached(
      io.kubernetes.client.openapi.models.V1AttachedVolume... volumesAttached);

  public java.lang.Boolean hasVolumesAttached();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      addNewVolumesAttached();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      addNewVolumesAttachedLike(io.kubernetes.client.openapi.models.V1AttachedVolume item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      setNewVolumesAttachedLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editVolumesAttached(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editFirstVolumesAttached();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editLastVolumesAttached();

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editMatchingVolumesAttached(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
              predicate);

  public A addToVolumesInUse(java.lang.Integer index, java.lang.String item);

  public A setToVolumesInUse(java.lang.Integer index, java.lang.String item);

  public A addToVolumesInUse(java.lang.String... items);

  public A addAllToVolumesInUse(java.util.Collection<java.lang.String> items);

  public A removeFromVolumesInUse(java.lang.String... items);

  public A removeAllFromVolumesInUse(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getVolumesInUse();

  public java.lang.String getVolumesInUse(java.lang.Integer index);

  public java.lang.String getFirstVolumesInUse();

  public java.lang.String getLastVolumesInUse();

  public java.lang.String getMatchingVolumesInUse(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingVolumesInUse(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withVolumesInUse(java.util.List<java.lang.String> volumesInUse);

  public A withVolumesInUse(java.lang.String... volumesInUse);

  public java.lang.Boolean hasVolumesInUse();

  public A addNewVolumesInUse(java.lang.String original);

  public interface AddressesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeAddressFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<N>> {
    public N and();

    public N endAddress();
  }

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConditionFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }

  public interface ConfigNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<N>> {
    public N and();

    public N endConfig();
  }

  public interface DaemonEndpointsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<N>> {
    public N and();

    public N endDaemonEndpoints();
  }

  public interface ImagesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ContainerImageFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<N>> {
    public N and();

    public N endImage();
  }

  public interface NodeInfoNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<N>> {
    public N and();

    public N endNodeInfo();
  }

  public interface VolumesAttachedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<
              io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<N>> {
    public N and();

    public N endVolumesAttached();
  }
}
