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
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1CSIDriverSpecFluent<A extends V1CSIDriverSpecFluent<A>> extends Fluent<A> {
  public Boolean getAttachRequired();

  public A withAttachRequired(Boolean attachRequired);

  public Boolean hasAttachRequired();

  public String getFsGroupPolicy();

  public A withFsGroupPolicy(String fsGroupPolicy);

  public Boolean hasFsGroupPolicy();

  public Boolean getPodInfoOnMount();

  public A withPodInfoOnMount(Boolean podInfoOnMount);

  public Boolean hasPodInfoOnMount();

  public Boolean getRequiresRepublish();

  public A withRequiresRepublish(Boolean requiresRepublish);

  public Boolean hasRequiresRepublish();

  public Boolean getSeLinuxMount();

  public A withSeLinuxMount(Boolean seLinuxMount);

  public Boolean hasSeLinuxMount();

  public Boolean getStorageCapacity();

  public A withStorageCapacity(Boolean storageCapacity);

  public Boolean hasStorageCapacity();

  public A addToTokenRequests(Integer index, StorageV1TokenRequest item);

  public A setToTokenRequests(Integer index, StorageV1TokenRequest item);

  public A addToTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... items);

  public A addAllToTokenRequests(Collection<StorageV1TokenRequest> items);

  public A removeFromTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... items);

  public A removeAllFromTokenRequests(Collection<StorageV1TokenRequest> items);

  public A removeMatchingFromTokenRequests(Predicate<StorageV1TokenRequestBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildTokenRequests instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<StorageV1TokenRequest> getTokenRequests();

  public List<StorageV1TokenRequest> buildTokenRequests();

  public StorageV1TokenRequest buildTokenRequest(Integer index);

  public StorageV1TokenRequest buildFirstTokenRequest();

  public StorageV1TokenRequest buildLastTokenRequest();

  public StorageV1TokenRequest buildMatchingTokenRequest(
      Predicate<StorageV1TokenRequestBuilder> predicate);

  public Boolean hasMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate);

  public A withTokenRequests(List<StorageV1TokenRequest> tokenRequests);

  public A withTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... tokenRequests);

  public Boolean hasTokenRequests();

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequest();

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequestLike(
      StorageV1TokenRequest item);

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> setNewTokenRequestLike(
      Integer index, StorageV1TokenRequest item);

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editTokenRequest(Integer index);

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editFirstTokenRequest();

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editLastTokenRequest();

  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editMatchingTokenRequest(
      Predicate<StorageV1TokenRequestBuilder> predicate);

  public A addToVolumeLifecycleModes(Integer index, String item);

  public A setToVolumeLifecycleModes(Integer index, String item);

  public A addToVolumeLifecycleModes(java.lang.String... items);

  public A addAllToVolumeLifecycleModes(Collection<String> items);

  public A removeFromVolumeLifecycleModes(java.lang.String... items);

  public A removeAllFromVolumeLifecycleModes(Collection<String> items);

  public List<String> getVolumeLifecycleModes();

  public String getVolumeLifecycleMode(Integer index);

  public String getFirstVolumeLifecycleMode();

  public String getLastVolumeLifecycleMode();

  public String getMatchingVolumeLifecycleMode(Predicate<String> predicate);

  public Boolean hasMatchingVolumeLifecycleMode(Predicate<String> predicate);

  public A withVolumeLifecycleModes(List<String> volumeLifecycleModes);

  public A withVolumeLifecycleModes(java.lang.String... volumeLifecycleModes);

  public Boolean hasVolumeLifecycleModes();

  public A withAttachRequired();

  public A withPodInfoOnMount();

  public A withRequiresRepublish();

  public A withSeLinuxMount();

  public A withStorageCapacity();

  public interface TokenRequestsNested<N>
      extends Nested<N>, StorageV1TokenRequestFluent<V1CSIDriverSpecFluent.TokenRequestsNested<N>> {
    public N and();

    public N endTokenRequest();
  }
}
