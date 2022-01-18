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
public interface V1CSIDriverSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Boolean getAttachRequired();

  public A withAttachRequired(java.lang.Boolean attachRequired);

  public java.lang.Boolean hasAttachRequired();

  public java.lang.String getFsGroupPolicy();

  public A withFsGroupPolicy(java.lang.String fsGroupPolicy);

  public java.lang.Boolean hasFsGroupPolicy();

  /** Method is deprecated. use withFsGroupPolicy instead. */
  @java.lang.Deprecated
  public A withNewFsGroupPolicy(java.lang.String original);

  public java.lang.Boolean getPodInfoOnMount();

  public A withPodInfoOnMount(java.lang.Boolean podInfoOnMount);

  public java.lang.Boolean hasPodInfoOnMount();

  public java.lang.Boolean getRequiresRepublish();

  public A withRequiresRepublish(java.lang.Boolean requiresRepublish);

  public java.lang.Boolean hasRequiresRepublish();

  public java.lang.Boolean getStorageCapacity();

  public A withStorageCapacity(java.lang.Boolean storageCapacity);

  public java.lang.Boolean hasStorageCapacity();

  public A addToTokenRequests(
      java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item);

  public A setToTokenRequests(
      java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item);

  public A addToTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... items);

  public A addAllToTokenRequests(
      java.util.Collection<io.kubernetes.client.openapi.models.StorageV1TokenRequest> items);

  public A removeFromTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... items);

  public A removeAllFromTokenRequests(
      java.util.Collection<io.kubernetes.client.openapi.models.StorageV1TokenRequest> items);

  public A removeMatchingFromTokenRequests(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildTokenRequests instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest>
      getTokenRequests();

  public java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest>
      buildTokenRequests();

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildTokenRequest(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildFirstTokenRequest();

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildLastTokenRequest();

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildMatchingTokenRequest(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate);

  public java.lang.Boolean hasMatchingTokenRequest(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate);

  public A withTokenRequests(
      java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest> tokenRequests);

  public A withTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... tokenRequests);

  public java.lang.Boolean hasTokenRequests();

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      addNewTokenRequest();

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      addNewTokenRequestLike(io.kubernetes.client.openapi.models.StorageV1TokenRequest item);

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      setNewTokenRequestLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item);

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editTokenRequest(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editFirstTokenRequest();

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editLastTokenRequest();

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editMatchingTokenRequest(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
              predicate);

  public A addToVolumeLifecycleModes(java.lang.Integer index, java.lang.String item);

  public A setToVolumeLifecycleModes(java.lang.Integer index, java.lang.String item);

  public A addToVolumeLifecycleModes(java.lang.String... items);

  public A addAllToVolumeLifecycleModes(java.util.Collection<java.lang.String> items);

  public A removeFromVolumeLifecycleModes(java.lang.String... items);

  public A removeAllFromVolumeLifecycleModes(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getVolumeLifecycleModes();

  public java.lang.String getVolumeLifecycleMode(java.lang.Integer index);

  public java.lang.String getFirstVolumeLifecycleMode();

  public java.lang.String getLastVolumeLifecycleMode();

  public java.lang.String getMatchingVolumeLifecycleMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingVolumeLifecycleMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withVolumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes);

  public A withVolumeLifecycleModes(java.lang.String... volumeLifecycleModes);

  public java.lang.Boolean hasVolumeLifecycleModes();

  public A addNewVolumeLifecycleMode(java.lang.String original);

  public interface TokenRequestsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.StorageV1TokenRequestFluent<
              io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<N>> {
    public N and();

    public N endTokenRequest();
  }
}
