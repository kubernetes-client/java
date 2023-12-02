package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CSIDriverSpecFluent<A extends V1CSIDriverSpecFluent<A>> extends BaseFluent<A>{
  public V1CSIDriverSpecFluent() {
  }
  
  public V1CSIDriverSpecFluent(V1CSIDriverSpec instance) {
    this.copyInstance(instance);
  }
  private Boolean attachRequired;
  private String fsGroupPolicy;
  private Boolean podInfoOnMount;
  private Boolean requiresRepublish;
  private Boolean seLinuxMount;
  private Boolean storageCapacity;
  private ArrayList<StorageV1TokenRequestBuilder> tokenRequests;
  private List<String> volumeLifecycleModes;
  
  protected void copyInstance(V1CSIDriverSpec instance) {
    instance = (instance != null ? instance : new V1CSIDriverSpec());
    if (instance != null) {
          this.withAttachRequired(instance.getAttachRequired());
          this.withFsGroupPolicy(instance.getFsGroupPolicy());
          this.withPodInfoOnMount(instance.getPodInfoOnMount());
          this.withRequiresRepublish(instance.getRequiresRepublish());
          this.withSeLinuxMount(instance.getSeLinuxMount());
          this.withStorageCapacity(instance.getStorageCapacity());
          this.withTokenRequests(instance.getTokenRequests());
          this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());
        }
  }
  
  public Boolean getAttachRequired() {
    return this.attachRequired;
  }
  
  public A withAttachRequired(Boolean attachRequired) {
    this.attachRequired = attachRequired;
    return (A) this;
  }
  
  public boolean hasAttachRequired() {
    return this.attachRequired != null;
  }
  
  public String getFsGroupPolicy() {
    return this.fsGroupPolicy;
  }
  
  public A withFsGroupPolicy(String fsGroupPolicy) {
    this.fsGroupPolicy = fsGroupPolicy;
    return (A) this;
  }
  
  public boolean hasFsGroupPolicy() {
    return this.fsGroupPolicy != null;
  }
  
  public Boolean getPodInfoOnMount() {
    return this.podInfoOnMount;
  }
  
  public A withPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
    return (A) this;
  }
  
  public boolean hasPodInfoOnMount() {
    return this.podInfoOnMount != null;
  }
  
  public Boolean getRequiresRepublish() {
    return this.requiresRepublish;
  }
  
  public A withRequiresRepublish(Boolean requiresRepublish) {
    this.requiresRepublish = requiresRepublish;
    return (A) this;
  }
  
  public boolean hasRequiresRepublish() {
    return this.requiresRepublish != null;
  }
  
  public Boolean getSeLinuxMount() {
    return this.seLinuxMount;
  }
  
  public A withSeLinuxMount(Boolean seLinuxMount) {
    this.seLinuxMount = seLinuxMount;
    return (A) this;
  }
  
  public boolean hasSeLinuxMount() {
    return this.seLinuxMount != null;
  }
  
  public Boolean getStorageCapacity() {
    return this.storageCapacity;
  }
  
  public A withStorageCapacity(Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
    return (A) this;
  }
  
  public boolean hasStorageCapacity() {
    return this.storageCapacity != null;
  }
  
  public A addToTokenRequests(int index,StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);
    if (index < 0 || index >= tokenRequests.size()) { _visitables.get("tokenRequests").add(builder); tokenRequests.add(builder); } else { _visitables.get("tokenRequests").add(index, builder); tokenRequests.add(index, builder);}
    return (A)this;
  }
  
  public A setToTokenRequests(int index,StorageV1TokenRequest item) {
    if (this.tokenRequests == null) {this.tokenRequests = new ArrayList<StorageV1TokenRequestBuilder>();}
    StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);
    if (index < 0 || index >= tokenRequests.size()) { _visitables.get("tokenRequests").add(builder); tokenRequests.add(builder); } else { _visitables.get("tokenRequests").set(index, builder); tokenRequests.set(index, builder);}
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
    if (this.tokenRequests == null) return (A)this;
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").remove(builder); this.tokenRequests.remove(builder);} return (A)this;
  }
  
  public A removeAllFromTokenRequests(Collection<StorageV1TokenRequest> items) {
    if (this.tokenRequests == null) return (A)this;
    for (StorageV1TokenRequest item : items) {StorageV1TokenRequestBuilder builder = new StorageV1TokenRequestBuilder(item);_visitables.get("tokenRequests").remove(builder); this.tokenRequests.remove(builder);} return (A)this;
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
  
  public List<StorageV1TokenRequest> buildTokenRequests() {
    return this.tokenRequests != null ? build(tokenRequests) : null;
  }
  
  public StorageV1TokenRequest buildTokenRequest(int index) {
    return this.tokenRequests.get(index).build();
  }
  
  public StorageV1TokenRequest buildFirstTokenRequest() {
    return this.tokenRequests.get(0).build();
  }
  
  public StorageV1TokenRequest buildLastTokenRequest() {
    return this.tokenRequests.get(tokenRequests.size() - 1).build();
  }
  
  public StorageV1TokenRequest buildMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
      for (StorageV1TokenRequestBuilder item : tokenRequests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
      for (StorageV1TokenRequestBuilder item : tokenRequests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withTokenRequests(List<StorageV1TokenRequest> tokenRequests) {
    if (this.tokenRequests != null) {
      this._visitables.get("tokenRequests").clear();
    }
    if (tokenRequests != null) {
        this.tokenRequests = new ArrayList();
        for (StorageV1TokenRequest item : tokenRequests) {
          this.addToTokenRequests(item);
        }
    } else {
      this.tokenRequests = null;
    }
    return (A) this;
  }
  
  public A withTokenRequests(io.kubernetes.client.openapi.models.StorageV1TokenRequest... tokenRequests) {
    if (this.tokenRequests != null) {
        this.tokenRequests.clear();
        _visitables.remove("tokenRequests");
    }
    if (tokenRequests != null) {
      for (StorageV1TokenRequest item : tokenRequests) {
        this.addToTokenRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasTokenRequests() {
    return this.tokenRequests != null && !this.tokenRequests.isEmpty();
  }
  
  public TokenRequestsNested<A> addNewTokenRequest() {
    return new TokenRequestsNested(-1, null);
  }
  
  public TokenRequestsNested<A> addNewTokenRequestLike(StorageV1TokenRequest item) {
    return new TokenRequestsNested(-1, item);
  }
  
  public TokenRequestsNested<A> setNewTokenRequestLike(int index,StorageV1TokenRequest item) {
    return new TokenRequestsNested(index, item);
  }
  
  public TokenRequestsNested<A> editTokenRequest(int index) {
    if (tokenRequests.size() <= index) throw new RuntimeException("Can't edit tokenRequests. Index exceeds size.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  
  public TokenRequestsNested<A> editFirstTokenRequest() {
    if (tokenRequests.size() == 0) throw new RuntimeException("Can't edit first tokenRequests. The list is empty.");
    return setNewTokenRequestLike(0, buildTokenRequest(0));
  }
  
  public TokenRequestsNested<A> editLastTokenRequest() {
    int index = tokenRequests.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last tokenRequests. The list is empty.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  
  public TokenRequestsNested<A> editMatchingTokenRequest(Predicate<StorageV1TokenRequestBuilder> predicate) {
    int index = -1;
    for (int i=0;i<tokenRequests.size();i++) { 
    if (predicate.test(tokenRequests.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching tokenRequests. No match found.");
    return setNewTokenRequestLike(index, buildTokenRequest(index));
  }
  
  public A addToVolumeLifecycleModes(int index,String item) {
    if (this.volumeLifecycleModes == null) {this.volumeLifecycleModes = new ArrayList<String>();}
    this.volumeLifecycleModes.add(index, item);
    return (A)this;
  }
  
  public A setToVolumeLifecycleModes(int index,String item) {
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
    if (this.volumeLifecycleModes == null) return (A)this;
    for (String item : items) { this.volumeLifecycleModes.remove(item);} return (A)this;
  }
  
  public A removeAllFromVolumeLifecycleModes(Collection<String> items) {
    if (this.volumeLifecycleModes == null) return (A)this;
    for (String item : items) { this.volumeLifecycleModes.remove(item);} return (A)this;
  }
  
  public List<String> getVolumeLifecycleModes() {
    return this.volumeLifecycleModes;
  }
  
  public String getVolumeLifecycleMode(int index) {
    return this.volumeLifecycleModes.get(index);
  }
  
  public String getFirstVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(0);
  }
  
  public String getLastVolumeLifecycleMode() {
    return this.volumeLifecycleModes.get(volumeLifecycleModes.size() - 1);
  }
  
  public String getMatchingVolumeLifecycleMode(Predicate<String> predicate) {
      for (String item : volumeLifecycleModes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumeLifecycleMode(Predicate<String> predicate) {
      for (String item : volumeLifecycleModes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumeLifecycleModes(List<String> volumeLifecycleModes) {
    if (volumeLifecycleModes != null) {
        this.volumeLifecycleModes = new ArrayList();
        for (String item : volumeLifecycleModes) {
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
        _visitables.remove("volumeLifecycleModes");
    }
    if (volumeLifecycleModes != null) {
      for (String item : volumeLifecycleModes) {
        this.addToVolumeLifecycleModes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumeLifecycleModes() {
    return this.volumeLifecycleModes != null && !this.volumeLifecycleModes.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIDriverSpecFluent that = (V1CSIDriverSpecFluent) o;
    if (!java.util.Objects.equals(attachRequired, that.attachRequired)) return false;
    if (!java.util.Objects.equals(fsGroupPolicy, that.fsGroupPolicy)) return false;
    if (!java.util.Objects.equals(podInfoOnMount, that.podInfoOnMount)) return false;
    if (!java.util.Objects.equals(requiresRepublish, that.requiresRepublish)) return false;
    if (!java.util.Objects.equals(seLinuxMount, that.seLinuxMount)) return false;
    if (!java.util.Objects.equals(storageCapacity, that.storageCapacity)) return false;
    if (!java.util.Objects.equals(tokenRequests, that.tokenRequests)) return false;
    if (!java.util.Objects.equals(volumeLifecycleModes, that.volumeLifecycleModes)) return false;
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
  public class TokenRequestsNested<N> extends StorageV1TokenRequestFluent<TokenRequestsNested<N>> implements Nested<N>{
    TokenRequestsNested(int index,StorageV1TokenRequest item) {
      this.index = index;
      this.builder = new StorageV1TokenRequestBuilder(this, item);
    }
    StorageV1TokenRequestBuilder builder;
    int index;
    
    public N and() {
      return (N) V1CSIDriverSpecFluent.this.setToTokenRequests(index,builder.build());
    }
    
    public N endTokenRequest() {
      return and();
    }
    
  
  }

}