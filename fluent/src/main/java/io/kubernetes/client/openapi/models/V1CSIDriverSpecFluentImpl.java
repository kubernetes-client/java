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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1CSIDriverSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<A> {
  public V1CSIDriverSpecFluentImpl() {}

  public V1CSIDriverSpecFluentImpl(io.kubernetes.client.openapi.models.V1CSIDriverSpec instance) {
    this.withAttachRequired(instance.getAttachRequired());

    this.withFsGroupPolicy(instance.getFsGroupPolicy());

    this.withPodInfoOnMount(instance.getPodInfoOnMount());

    this.withRequiresRepublish(instance.getRequiresRepublish());

    this.withStorageCapacity(instance.getStorageCapacity());

    this.withTokenRequests(instance.getTokenRequests());

    this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());
  }

  private java.lang.Boolean attachRequired;
  private java.lang.String fsGroupPolicy;
  private java.lang.Boolean podInfoOnMount;
  private java.lang.Boolean requiresRepublish;
  private java.lang.Boolean storageCapacity;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
      tokenRequests;
  private java.util.List<java.lang.String> volumeLifecycleModes;

  public java.lang.Boolean getAttachRequired() {
    return this.attachRequired;
  }

  public A withAttachRequired(java.lang.Boolean attachRequired) {
    this.attachRequired = attachRequired;
    return (A) this;
  }

  public java.lang.Boolean hasAttachRequired() {
    return this.attachRequired != null;
  }

  public java.lang.String getFsGroupPolicy() {
    return this.fsGroupPolicy;
  }

  public A withFsGroupPolicy(java.lang.String fsGroupPolicy) {
    this.fsGroupPolicy = fsGroupPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasFsGroupPolicy() {
    return this.fsGroupPolicy != null;
  }

  /** Method is deprecated. use withFsGroupPolicy instead. */
  @java.lang.Deprecated
  public A withNewFsGroupPolicy(java.lang.String original) {
    return (A) withFsGroupPolicy(new String(original));
  }

  public java.lang.Boolean getPodInfoOnMount() {
    return this.podInfoOnMount;
  }

  public A withPodInfoOnMount(java.lang.Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
    return (A) this;
  }

  public java.lang.Boolean hasPodInfoOnMount() {
    return this.podInfoOnMount != null;
  }

  public java.lang.Boolean getRequiresRepublish() {
    return this.requiresRepublish;
  }

  public A withRequiresRepublish(java.lang.Boolean requiresRepublish) {
    this.requiresRepublish = requiresRepublish;
    return (A) this;
  }

  public java.lang.Boolean hasRequiresRepublish() {
    return this.requiresRepublish != null;
  }

  public java.lang.Boolean getStorageCapacity() {
    return this.storageCapacity;
  }

  public A withStorageCapacity(java.lang.Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
    return (A) this;
  }

  public java.lang.Boolean hasStorageCapacity() {
    return this.storageCapacity != null;
  }

  public A addToTokenRequests(
      java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {
      this.tokenRequests =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>();
    }
    io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
        new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
    _visitables
        .get("tokenRequests")
        .add(index >= 0 ? index : _visitables.get("tokenRequests").size(), builder);
    this.tokenRequests.add(index >= 0 ? index : tokenRequests.size(), builder);
    return (A) this;
  }

  public A setToTokenRequests(
      java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {
      this.tokenRequests =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>();
    }
    io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
        new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
    if (index < 0 || index >= _visitables.get("tokenRequests").size()) {
      _visitables.get("tokenRequests").add(builder);
    } else {
      _visitables.get("tokenRequests").set(index, builder);
    }
    if (index < 0 || index >= tokenRequests.size()) {
      tokenRequests.add(builder);
    } else {
      tokenRequests.set(index, builder);
    }
    return (A) this;
  }

  public A addToTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... items) {
    if (this.tokenRequests == null) {
      this.tokenRequests =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>();
    }
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : items) {
      io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
          new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
      _visitables.get("tokenRequests").add(builder);
      this.tokenRequests.add(builder);
    }
    return (A) this;
  }

  public A addAllToTokenRequests(
      java.util.Collection<io.kubernetes.client.openapi.models.StorageV1TokenRequest> items) {
    if (this.tokenRequests == null) {
      this.tokenRequests =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>();
    }
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : items) {
      io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
          new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
      _visitables.get("tokenRequests").add(builder);
      this.tokenRequests.add(builder);
    }
    return (A) this;
  }

  public A removeFromTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... items) {
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : items) {
      io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
          new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
      _visitables.get("tokenRequests").remove(builder);
      if (this.tokenRequests != null) {
        this.tokenRequests.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTokenRequests(
      java.util.Collection<io.kubernetes.client.openapi.models.StorageV1TokenRequest> items) {
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : items) {
      io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder =
          new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(item);
      _visitables.get("tokenRequests").remove(builder);
      if (this.tokenRequests != null) {
        this.tokenRequests.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTokenRequests(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate) {
    if (tokenRequests == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder> each =
        tokenRequests.iterator();
    final List visitables = _visitables.get("tokenRequests");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildTokenRequests instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest>
      getTokenRequests() {
    return tokenRequests != null ? build(tokenRequests) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest>
      buildTokenRequests() {
    return tokenRequests != null ? build(tokenRequests) : null;
  }

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildTokenRequest(
      java.lang.Integer index) {
    return this.tokenRequests.get(index).build();
  }

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildFirstTokenRequest() {
    return this.tokenRequests.get(0).build();
  }

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildLastTokenRequest() {
    return this.tokenRequests.get(tokenRequests.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.StorageV1TokenRequest buildMatchingTokenRequest(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder item : tokenRequests) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTokenRequest(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder item : tokenRequests) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTokenRequests(
      java.util.List<io.kubernetes.client.openapi.models.StorageV1TokenRequest> tokenRequests) {
    if (this.tokenRequests != null) {
      _visitables.get("tokenRequests").removeAll(this.tokenRequests);
    }
    if (tokenRequests != null) {
      this.tokenRequests = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : tokenRequests) {
        this.addToTokenRequests(item);
      }
    } else {
      this.tokenRequests = null;
    }
    return (A) this;
  }

  public A withTokenRequests(
      io.kubernetes.client.openapi.models.StorageV1TokenRequest... tokenRequests) {
    if (this.tokenRequests != null) {
      this.tokenRequests.clear();
    }
    if (tokenRequests != null) {
      for (io.kubernetes.client.openapi.models.StorageV1TokenRequest item : tokenRequests) {
        this.addToTokenRequests(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTokenRequests() {
    return tokenRequests != null && !tokenRequests.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      addNewTokenRequest() {
    return new io.kubernetes.client.openapi.models.V1CSIDriverSpecFluentImpl
        .TokenRequestsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      addNewTokenRequestLike(io.kubernetes.client.openapi.models.StorageV1TokenRequest item) {
    return new io.kubernetes.client.openapi.models.V1CSIDriverSpecFluentImpl
        .TokenRequestsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      setNewTokenRequestLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item) {
    return new io.kubernetes.client.openapi.models.V1CSIDriverSpecFluentImpl
        .TokenRequestsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editTokenRequest(java.lang.Integer index) {
    if (tokenRequests.size() <= index)
      throw new RuntimeException("Can't edit tokenRequests. Index exceeds size.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editFirstTokenRequest() {
    if (tokenRequests.size() == 0)
      throw new RuntimeException("Can't edit first tokenRequests. The list is empty.");
    return setNewTokenRequestLike(0, buildTokenRequest(0));
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editLastTokenRequest() {
    int index = tokenRequests.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tokenRequests. The list is empty.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }

  public io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<A>
      editMatchingTokenRequest(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < tokenRequests.size(); i++) {
      if (predicate.test(tokenRequests.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching tokenRequests. No match found.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }

  public A addToVolumeLifecycleModes(java.lang.Integer index, java.lang.String item) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new java.util.ArrayList<java.lang.String>();
    }
    this.volumeLifecycleModes.add(index, item);
    return (A) this;
  }

  public A setToVolumeLifecycleModes(java.lang.Integer index, java.lang.String item) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new java.util.ArrayList<java.lang.String>();
    }
    this.volumeLifecycleModes.set(index, item);
    return (A) this;
  }

  public A addToVolumeLifecycleModes(java.lang.String... items) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumeLifecycleModes.add(item);
    }
    return (A) this;
  }

  public A addAllToVolumeLifecycleModes(java.util.Collection<java.lang.String> items) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumeLifecycleModes.add(item);
    }
    return (A) this;
  }

  public A removeFromVolumeLifecycleModes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.volumeLifecycleModes != null) {
        this.volumeLifecycleModes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumeLifecycleModes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.volumeLifecycleModes != null) {
        this.volumeLifecycleModes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getVolumeLifecycleModes() {
    return this.volumeLifecycleModes;
  }

  public java.lang.String getVolumeLifecycleMode(java.lang.Integer index) {
    return this.volumeLifecycleModes.get(index);
  }

  public java.lang.String getFirstVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(0);
  }

  public java.lang.String getLastVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(volumeLifecycleModes.size() - 1);
  }

  public java.lang.String getMatchingVolumeLifecycleMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumeLifecycleModes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumeLifecycleMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumeLifecycleModes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes) {
    if (volumeLifecycleModes != null) {
      this.volumeLifecycleModes = new java.util.ArrayList();
      for (java.lang.String item : volumeLifecycleModes) {
        this.addToVolumeLifecycleModes(item);
      }
    } else {
      this.volumeLifecycleModes = null;
    }
    return (A) this;
  }

  public A withVolumeLifecycleModes(java.lang.String... volumeLifecycleModes) {
    if (this.volumeLifecycleModes != null) {
      this.volumeLifecycleModes.clear();
    }
    if (volumeLifecycleModes != null) {
      for (java.lang.String item : volumeLifecycleModes) {
        this.addToVolumeLifecycleModes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumeLifecycleModes() {
    return volumeLifecycleModes != null && !volumeLifecycleModes.isEmpty();
  }

  public A addNewVolumeLifecycleMode(java.lang.String original) {
    return (A) addToVolumeLifecycleModes(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIDriverSpecFluentImpl that = (V1CSIDriverSpecFluentImpl) o;
    if (attachRequired != null
        ? !attachRequired.equals(that.attachRequired)
        : that.attachRequired != null) return false;
    if (fsGroupPolicy != null
        ? !fsGroupPolicy.equals(that.fsGroupPolicy)
        : that.fsGroupPolicy != null) return false;
    if (podInfoOnMount != null
        ? !podInfoOnMount.equals(that.podInfoOnMount)
        : that.podInfoOnMount != null) return false;
    if (requiresRepublish != null
        ? !requiresRepublish.equals(that.requiresRepublish)
        : that.requiresRepublish != null) return false;
    if (storageCapacity != null
        ? !storageCapacity.equals(that.storageCapacity)
        : that.storageCapacity != null) return false;
    if (tokenRequests != null
        ? !tokenRequests.equals(that.tokenRequests)
        : that.tokenRequests != null) return false;
    if (volumeLifecycleModes != null
        ? !volumeLifecycleModes.equals(that.volumeLifecycleModes)
        : that.volumeLifecycleModes != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        attachRequired,
        fsGroupPolicy,
        podInfoOnMount,
        requiresRepublish,
        storageCapacity,
        tokenRequests,
        volumeLifecycleModes,
        super.hashCode());
  }

  public class TokenRequestsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.StorageV1TokenRequestFluentImpl<
          io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent.TokenRequestsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TokenRequestsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.StorageV1TokenRequest item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(this, item);
    }

    TokenRequestsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder(this);
    }

    io.kubernetes.client.openapi.models.StorageV1TokenRequestBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1CSIDriverSpecFluentImpl.this.setToTokenRequests(index, builder.build());
    }

    public N endTokenRequest() {
      return and();
    }
  }
}
