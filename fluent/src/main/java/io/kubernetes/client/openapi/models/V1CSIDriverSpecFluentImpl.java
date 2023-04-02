package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CSIDriverSpecFluentImpl<A extends V1CSIDriverSpecFluent<A>> extends BaseFluent<A> implements V1CSIDriverSpecFluent<A>{
  public V1CSIDriverSpecFluentImpl() {
  }
  public V1CSIDriverSpecFluentImpl(V1CSIDriverSpec instance) {
    this.withAttachRequired(instance.getAttachRequired());

    this.withFsGroupPolicy(instance.getFsGroupPolicy());

    this.withPodInfoOnMount(instance.getPodInfoOnMount());

    this.withRequiresRepublish(instance.getRequiresRepublish());

    this.withSeLinuxMount(instance.getSeLinuxMount());

    this.withStorageCapacity(instance.getStorageCapacity());

    this.withTokenRequests(instance.getTokenRequests());

    this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());

  }
  private Boolean attachRequired;
  private String fsGroupPolicy;
  private Boolean podInfoOnMount;
  private Boolean requiresRepublish;
  private Boolean seLinuxMount;
  private Boolean storageCapacity;
  private ArrayList<StorageV1TokenRequestBuilder> tokenRequests;
  private List<String> volumeLifecycleModes;
  public Boolean getAttachRequired() {
    return this.attachRequired;
  }
  public A withAttachRequired(Boolean attachRequired) {
    this.attachRequired=attachRequired; return (A) this;
  }
  public Boolean hasAttachRequired() {
    return this.attachRequired != null;
  }
  public String getFsGroupPolicy() {
    return this.fsGroupPolicy;
  }
  public A withFsGroupPolicy(String fsGroupPolicy) {
    this.fsGroupPolicy=fsGroupPolicy; return (A) this;
  }
  public Boolean hasFsGroupPolicy() {
    return this.fsGroupPolicy != null;
  }
  public Boolean getPodInfoOnMount() {
    return this.podInfoOnMount;
  }
  public A withPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount=podInfoOnMount; return (A) this;
  }
  public Boolean hasPodInfoOnMount() {
    return this.podInfoOnMount != null;
  }
  public Boolean getRequiresRepublish() {
    return this.requiresRepublish;
  }
  public A withRequiresRepublish(Boolean requiresRepublish) {
    this.requiresRepublish=requiresRepublish; return (A) this;
  }
  public Boolean hasRequiresRepublish() {
    return this.requiresRepublish != null;
  }
  public Boolean getSeLinuxMount() {
    return this.seLinuxMount;
  }
  public A withSeLinuxMount(Boolean seLinuxMount) {
    this.seLinuxMount=seLinuxMount; return (A) this;
  }
  public Boolean hasSeLinuxMount() {
    return this.seLinuxMount != null;
  }
  public Boolean getStorageCapacity() {
    return this.storageCapacity;
  }
  public A withStorageCapacity(Boolean storageCapacity) {
    this.storageCapacity=storageCapacity; return (A) this;
  }
  public Boolean hasStorageCapacity() {
    return this.storageCapacity != null;
  }
  public A addToTokenRequests(Integer index,StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").add(index >= 0 ? index : _visitables.get("tokenRequests").size(), builder);this.tokenRequests.add(index >= 0 ? index : tokenRequests.size(), builder); return (A)this;
  }
  public A setToTokenRequests(Integer index,StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);
    if (index < 0 || index >= _visitables.get("tokenRequests").size()) { _visitables.get("tokenRequests").add(builder); } else { _visitables.get("tokenRequests").set(index, builder);}
    if (index < 0 || index >= tokenRequests.size()) { tokenRequests.add(builder); } else { tokenRequests.set(index, builder);}
     return (A)this;
  }
  public A addToTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... items) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").add(builder);this.tokenRequests.add(builder);} return (A)this;
  }
  public A addAllToTokenRequests(Collection<StorageV1TokenRequest> items) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").add(builder);this.tokenRequests.add(builder);} return (A)this;
  }
  public A removeFromTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... items) {
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").remove(builder);if (this.tokenRequests != null) {this.tokenRequests.remove(builder);}} return (A)this;
  }
  public A removeAllFromTokenRequests(Collection<StorageV1TokenRequest> items) {
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").remove(builder);if (this.tokenRequests != null) {this.tokenRequests.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTokenRequests(Predicate<StorageV1TokenRequestBuilder> predicate) {
    if (tokenRequests == null) return (A) this;
    final Iterator<StorageV1TokenRequestBuilder> each = tokenRequests.iterator();
    final List visitables = _visitables.get("tokenRequests");
    while (each.hasNext()) {
      StorageV1TokenRequestBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTokenRequests instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<StorageV1TokenRequest> getTokenRequests() {
    return tokenRequests != null ? build(tokenRequests) : null;
  }
  public List<StorageV1TokenRequest> buildTokenRequests() {
    return tokenRequests != null ? build(tokenRequests) : null;
  }
  public StorageV1TokenRequest buildTokenRequest(Integer index) {
    return this.tokenRequests.get(index).build();
  }
  public StorageV1TokenRequest buildFirstTokenRequest() {
    return this.tokenRequests.get(0).build();
  }
  public StorageV1TokenRequest buildLastTokenRequest() {
    return this.tokenRequests.get(tokenRequests.size() - 1).build();
  }
  public StorageV1TokenRequest buildMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
    for (StorageV1TokenRequestBuilder item: tokenRequests) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
    for (StorageV1TokenRequestBuilder item: tokenRequests) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTokenRequests(List<StorageV1TokenRequest> tokenRequests) {
    if (this.tokenRequests != null) { _visitables.get("tokenRequests").removeAll(this.tokenRequests);}
    if (tokenRequests != null) {this.tokenRequests = new ArrayList(); for (StorageV1TokenRequest item : tokenRequests){this.addToTokenRequests(item);}} else { this.tokenRequests = null;} return (A) this;
  }
  public A withTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... tokenRequests) {
    if (this.tokenRequests != null) {this.tokenRequests.clear();}
    if (tokenRequests != null) {for (StorageV1TokenRequest item :tokenRequests){ this.addToTokenRequests(item);}} return (A) this;
  }
  public Boolean hasTokenRequests() {
    return tokenRequests != null && !tokenRequests.isEmpty();
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequest() {
    return new V1CSIDriverSpecFluentImpl.TokenRequestsNestedImpl();
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> addNewTokenRequestLike(StorageV1TokenRequest item) {
    return new V1CSIDriverSpecFluentImpl.TokenRequestsNestedImpl(-1, item);
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> setNewTokenRequestLike(Integer index,StorageV1TokenRequest item) {
    return new V1CSIDriverSpecFluentImpl.TokenRequestsNestedImpl(index, item);
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editTokenRequest(Integer index) {
    if (tokenRequests.size() <= index) throw new RuntimeException("Can't edit tokenRequests. Index exceeds size.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editFirstTokenRequest() {
    if (tokenRequests.size() == 0) throw new RuntimeException("Can't edit first tokenRequests. The list is empty.");
    return setNewTokenRequestLike(0, buildTokenRequest(0));
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editLastTokenRequest() {
    int index = tokenRequests.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tokenRequests. The list is empty.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  public V1CSIDriverSpecFluent.TokenRequestsNested<A> editMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tokenRequests.size();i++) { 
    if (predicate.test(tokenRequests.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tokenRequests. No match found.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  public A addToVolumeLifecycleModes(Integer index,String item) {
    if (this.volumeLifecycleModes == null) {this.volumeLifecycleModes = new ArrayList<String>();}
    this.volumeLifecycleModes.add(index, item);
    return (A)this;
  }
  public A setToVolumeLifecycleModes(Integer index,String item) {
    if (this.volumeLifecycleModes == null) {this.volumeLifecycleModes = new ArrayList<String>();}
    this.volumeLifecycleModes.set(index, item); return (A)this;
  }
  public A addToVolumeLifecycleModes(java.lang.String... items) {
    if (this.volumeLifecycleModes == null) {this.volumeLifecycleModes = new ArrayList<String>();}
    for (String item : items) {this.volumeLifecycleModes.add(item);} return (A)this;
  }
  public A addAllToVolumeLifecycleModes(Collection<String> items) {
    if (this.volumeLifecycleModes == null) {this.volumeLifecycleModes = new ArrayList<String>();}
    for (String item : items) {this.volumeLifecycleModes.add(item);} return (A)this;
  }
  public A removeFromVolumeLifecycleModes(java.lang.String... items) {
    for (String item : items) {if (this.volumeLifecycleModes!= null){ this.volumeLifecycleModes.remove(item);}} return (A)this;
  }
  public A removeAllFromVolumeLifecycleModes(Collection<String> items) {
    for (String item : items) {if (this.volumeLifecycleModes!= null){ this.volumeLifecycleModes.remove(item);}} return (A)this;
  }
  public List<String> getVolumeLifecycleModes() {
    return this.volumeLifecycleModes;
  }
  public String getVolumeLifecycleMode(Integer index) {
    return this.volumeLifecycleModes.get(index);
  }
  public String getFirstVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(0);
  }
  public String getLastVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(volumeLifecycleModes.size() - 1);
  }
  public String getMatchingVolumeLifecycleMode(Predicate<String> predicate) {
    for (String item: volumeLifecycleModes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingVolumeLifecycleMode(Predicate<String> predicate) {
    for (String item: volumeLifecycleModes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVolumeLifecycleModes(List<String> volumeLifecycleModes) {
    if (volumeLifecycleModes != null) {this.volumeLifecycleModes = new ArrayList(); for (String item : volumeLifecycleModes){this.addToVolumeLifecycleModes(item);}} else { this.volumeLifecycleModes = null;} return (A) this;
  }
  public A withVolumeLifecycleModes(java.lang.String... volumeLifecycleModes) {
    if (this.volumeLifecycleModes != null) {this.volumeLifecycleModes.clear();}
    if (volumeLifecycleModes != null) {for (String item :volumeLifecycleModes){ this.addToVolumeLifecycleModes(item);}} return (A) this;
  }
  public Boolean hasVolumeLifecycleModes() {
    return volumeLifecycleModes != null && !volumeLifecycleModes.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIDriverSpecFluentImpl that = (V1CSIDriverSpecFluentImpl) o;
    if (attachRequired != null ? !attachRequired.equals(that.attachRequired) :that.attachRequired != null) return false;
    if (fsGroupPolicy != null ? !fsGroupPolicy.equals(that.fsGroupPolicy) :that.fsGroupPolicy != null) return false;
    if (podInfoOnMount != null ? !podInfoOnMount.equals(that.podInfoOnMount) :that.podInfoOnMount != null) return false;
    if (requiresRepublish != null ? !requiresRepublish.equals(that.requiresRepublish) :that.requiresRepublish != null) return false;
    if (seLinuxMount != null ? !seLinuxMount.equals(that.seLinuxMount) :that.seLinuxMount != null) return false;
    if (storageCapacity != null ? !storageCapacity.equals(that.storageCapacity) :that.storageCapacity != null) return false;
    if (tokenRequests != null ? !tokenRequests.equals(that.tokenRequests) :that.tokenRequests != null) return false;
    if (volumeLifecycleModes != null ? !volumeLifecycleModes.equals(that.volumeLifecycleModes) :that.volumeLifecycleModes != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(attachRequired,  fsGroupPolicy,  podInfoOnMount,  requiresRepublish,  seLinuxMount,  storageCapacity,  tokenRequests,  volumeLifecycleModes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attachRequired != null) { sb.append("attachRequired:"); sb.append(attachRequired + ","); }
    if (fsGroupPolicy != null) { sb.append("fsGroupPolicy:"); sb.append(fsGroupPolicy + ","); }
    if (podInfoOnMount != null) { sb.append("podInfoOnMount:"); sb.append(podInfoOnMount + ","); }
    if (requiresRepublish != null) { sb.append("requiresRepublish:"); sb.append(requiresRepublish + ","); }
    if (seLinuxMount != null) { sb.append("seLinuxMount:"); sb.append(seLinuxMount + ","); }
    if (storageCapacity != null) { sb.append("storageCapacity:"); sb.append(storageCapacity + ","); }
    if (tokenRequests != null && !tokenRequests.isEmpty()) { sb.append("tokenRequests:"); sb.append(tokenRequests + ","); }
    if (volumeLifecycleModes != null && !volumeLifecycleModes.isEmpty()) { sb.append("volumeLifecycleModes:"); sb.append(volumeLifecycleModes); }
    sb.append("}");
    return sb.toString();
  }
  public A withAttachRequired() {
    return withAttachRequired(true);
  }
  public A withPodInfoOnMount() {
    return withPodInfoOnMount(true);
  }
  public A withRequiresRepublish() {
    return withRequiresRepublish(true);
  }
  public A withSeLinuxMount() {
    return withSeLinuxMount(true);
  }
  public A withStorageCapacity() {
    return withStorageCapacity(true);
  }
  class TokenRequestsNestedImpl<N> extends StorageV1TokenRequestFluentImpl<V1CSIDriverSpecFluent.TokenRequestsNested<N>> implements V1CSIDriverSpecFluent.TokenRequestsNested<N>,Nested<N>{
    TokenRequestsNestedImpl(Integer index,StorageV1TokenRequest item) {
      this.index = index;
      this.builder = new StorageV1TokenRequestBuilder(this, item);
    }
    TokenRequestsNestedImpl() {
      this.index = -1;
      this.builder = new StorageV1TokenRequestBuilder(this);
    }
    StorageV1TokenRequestBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CSIDriverSpecFluentImpl.this.setToTokenRequests(index,builder.build());
    }
    public N endTokenRequest() {
      return and();
    }
    
  }
  
}