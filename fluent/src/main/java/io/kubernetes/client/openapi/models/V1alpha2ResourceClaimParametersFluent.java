package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceClaimParametersFluent<A extends V1alpha2ResourceClaimParametersFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceClaimParametersFluent() {
  }
  
  public V1alpha2ResourceClaimParametersFluent(V1alpha2ResourceClaimParameters instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private ArrayList<V1alpha2DriverRequestsBuilder> driverRequests;
  private V1alpha2ResourceClaimParametersReferenceBuilder generatedFrom;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Boolean shareable;
  
  protected void copyInstance(V1alpha2ResourceClaimParameters instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceClaimParameters());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDriverRequests(instance.getDriverRequests());
          this.withGeneratedFrom(instance.getGeneratedFrom());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withShareable(instance.getShareable());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public A addToDriverRequests(int index,V1alpha2DriverRequests item) {
    if (this.driverRequests == null) {this.driverRequests = new ArrayList<V1alpha2DriverRequestsBuilder>();}
    V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);
    if (index < 0 || index >= driverRequests.size()) { _visitables.get("driverRequests").add(builder); driverRequests.add(builder); } else { _visitables.get("driverRequests").add(index, builder); driverRequests.add(index, builder);}
    return (A)this;
  }
  
  public A setToDriverRequests(int index,V1alpha2DriverRequests item) {
    if (this.driverRequests == null) {this.driverRequests = new ArrayList<V1alpha2DriverRequestsBuilder>();}
    V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);
    if (index < 0 || index >= driverRequests.size()) { _visitables.get("driverRequests").add(builder); driverRequests.add(builder); } else { _visitables.get("driverRequests").set(index, builder); driverRequests.set(index, builder);}
    return (A)this;
  }
  
  public A addToDriverRequests(io.kubernetes.client.openapi.models.V1alpha2DriverRequests... items) {
    if (this.driverRequests == null) {this.driverRequests = new ArrayList<V1alpha2DriverRequestsBuilder>();}
    for (V1alpha2DriverRequests item : items) {V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);_visitables.get("driverRequests").add(builder);this.driverRequests.add(builder);} return (A)this;
  }
  
  public A addAllToDriverRequests(Collection<V1alpha2DriverRequests> items) {
    if (this.driverRequests == null) {this.driverRequests = new ArrayList<V1alpha2DriverRequestsBuilder>();}
    for (V1alpha2DriverRequests item : items) {V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);_visitables.get("driverRequests").add(builder);this.driverRequests.add(builder);} return (A)this;
  }
  
  public A removeFromDriverRequests(io.kubernetes.client.openapi.models.V1alpha2DriverRequests... items) {
    if (this.driverRequests == null) return (A)this;
    for (V1alpha2DriverRequests item : items) {V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);_visitables.get("driverRequests").remove(builder); this.driverRequests.remove(builder);} return (A)this;
  }
  
  public A removeAllFromDriverRequests(Collection<V1alpha2DriverRequests> items) {
    if (this.driverRequests == null) return (A)this;
    for (V1alpha2DriverRequests item : items) {V1alpha2DriverRequestsBuilder builder = new V1alpha2DriverRequestsBuilder(item);_visitables.get("driverRequests").remove(builder); this.driverRequests.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromDriverRequests(Predicate<V1alpha2DriverRequestsBuilder> predicate) {
    if (driverRequests == null) return (A) this;
    final Iterator<V1alpha2DriverRequestsBuilder> each = driverRequests.iterator();
    final List visitables = _visitables.get("driverRequests");
    while (each.hasNext()) {
      V1alpha2DriverRequestsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2DriverRequests> buildDriverRequests() {
    return this.driverRequests != null ? build(driverRequests) : null;
  }
  
  public V1alpha2DriverRequests buildDriverRequest(int index) {
    return this.driverRequests.get(index).build();
  }
  
  public V1alpha2DriverRequests buildFirstDriverRequest() {
    return this.driverRequests.get(0).build();
  }
  
  public V1alpha2DriverRequests buildLastDriverRequest() {
    return this.driverRequests.get(driverRequests.size() - 1).build();
  }
  
  public V1alpha2DriverRequests buildMatchingDriverRequest(Predicate<V1alpha2DriverRequestsBuilder> predicate) {
      for (V1alpha2DriverRequestsBuilder item : driverRequests) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDriverRequest(Predicate<V1alpha2DriverRequestsBuilder> predicate) {
      for (V1alpha2DriverRequestsBuilder item : driverRequests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDriverRequests(List<V1alpha2DriverRequests> driverRequests) {
    if (this.driverRequests != null) {
      this._visitables.get("driverRequests").clear();
    }
    if (driverRequests != null) {
        this.driverRequests = new ArrayList();
        for (V1alpha2DriverRequests item : driverRequests) {
          this.addToDriverRequests(item);
        }
    } else {
      this.driverRequests = null;
    }
    return (A) this;
  }
  
  public A withDriverRequests(io.kubernetes.client.openapi.models.V1alpha2DriverRequests... driverRequests) {
    if (this.driverRequests != null) {
        this.driverRequests.clear();
        _visitables.remove("driverRequests");
    }
    if (driverRequests != null) {
      for (V1alpha2DriverRequests item : driverRequests) {
        this.addToDriverRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDriverRequests() {
    return this.driverRequests != null && !this.driverRequests.isEmpty();
  }
  
  public DriverRequestsNested<A> addNewDriverRequest() {
    return new DriverRequestsNested(-1, null);
  }
  
  public DriverRequestsNested<A> addNewDriverRequestLike(V1alpha2DriverRequests item) {
    return new DriverRequestsNested(-1, item);
  }
  
  public DriverRequestsNested<A> setNewDriverRequestLike(int index,V1alpha2DriverRequests item) {
    return new DriverRequestsNested(index, item);
  }
  
  public DriverRequestsNested<A> editDriverRequest(int index) {
    if (driverRequests.size() <= index) throw new RuntimeException("Can't edit driverRequests. Index exceeds size.");
    return setNewDriverRequestLike(index, buildDriverRequest(index));
  }
  
  public DriverRequestsNested<A> editFirstDriverRequest() {
    if (driverRequests.size() == 0) throw new RuntimeException("Can't edit first driverRequests. The list is empty.");
    return setNewDriverRequestLike(0, buildDriverRequest(0));
  }
  
  public DriverRequestsNested<A> editLastDriverRequest() {
    int index = driverRequests.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last driverRequests. The list is empty.");
    return setNewDriverRequestLike(index, buildDriverRequest(index));
  }
  
  public DriverRequestsNested<A> editMatchingDriverRequest(Predicate<V1alpha2DriverRequestsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<driverRequests.size();i++) { 
    if (predicate.test(driverRequests.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching driverRequests. No match found.");
    return setNewDriverRequestLike(index, buildDriverRequest(index));
  }
  
  public V1alpha2ResourceClaimParametersReference buildGeneratedFrom() {
    return this.generatedFrom != null ? this.generatedFrom.build() : null;
  }
  
  public A withGeneratedFrom(V1alpha2ResourceClaimParametersReference generatedFrom) {
    this._visitables.remove("generatedFrom");
    if (generatedFrom != null) {
        this.generatedFrom = new V1alpha2ResourceClaimParametersReferenceBuilder(generatedFrom);
        this._visitables.get("generatedFrom").add(this.generatedFrom);
    } else {
        this.generatedFrom = null;
        this._visitables.get("generatedFrom").remove(this.generatedFrom);
    }
    return (A) this;
  }
  
  public boolean hasGeneratedFrom() {
    return this.generatedFrom != null;
  }
  
  public GeneratedFromNested<A> withNewGeneratedFrom() {
    return new GeneratedFromNested(null);
  }
  
  public GeneratedFromNested<A> withNewGeneratedFromLike(V1alpha2ResourceClaimParametersReference item) {
    return new GeneratedFromNested(item);
  }
  
  public GeneratedFromNested<A> editGeneratedFrom() {
    return withNewGeneratedFromLike(java.util.Optional.ofNullable(buildGeneratedFrom()).orElse(null));
  }
  
  public GeneratedFromNested<A> editOrNewGeneratedFrom() {
    return withNewGeneratedFromLike(java.util.Optional.ofNullable(buildGeneratedFrom()).orElse(new V1alpha2ResourceClaimParametersReferenceBuilder().build()));
  }
  
  public GeneratedFromNested<A> editOrNewGeneratedFromLike(V1alpha2ResourceClaimParametersReference item) {
    return withNewGeneratedFromLike(java.util.Optional.ofNullable(buildGeneratedFrom()).orElse(item));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public Boolean getShareable() {
    return this.shareable;
  }
  
  public A withShareable(Boolean shareable) {
    this.shareable = shareable;
    return (A) this;
  }
  
  public boolean hasShareable() {
    return this.shareable != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimParametersFluent that = (V1alpha2ResourceClaimParametersFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(driverRequests, that.driverRequests)) return false;
    if (!java.util.Objects.equals(generatedFrom, that.generatedFrom)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(shareable, that.shareable)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  driverRequests,  generatedFrom,  kind,  metadata,  shareable,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (driverRequests != null && !driverRequests.isEmpty()) { sb.append("driverRequests:"); sb.append(driverRequests + ","); }
    if (generatedFrom != null) { sb.append("generatedFrom:"); sb.append(generatedFrom + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (shareable != null) { sb.append("shareable:"); sb.append(shareable); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withShareable() {
    return withShareable(true);
  }
  public class DriverRequestsNested<N> extends V1alpha2DriverRequestsFluent<DriverRequestsNested<N>> implements Nested<N>{
    DriverRequestsNested(int index,V1alpha2DriverRequests item) {
      this.index = index;
      this.builder = new V1alpha2DriverRequestsBuilder(this, item);
    }
    V1alpha2DriverRequestsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2ResourceClaimParametersFluent.this.setToDriverRequests(index,builder.build());
    }
    
    public N endDriverRequest() {
      return and();
    }
    
  
  }
  public class GeneratedFromNested<N> extends V1alpha2ResourceClaimParametersReferenceFluent<GeneratedFromNested<N>> implements Nested<N>{
    GeneratedFromNested(V1alpha2ResourceClaimParametersReference item) {
      this.builder = new V1alpha2ResourceClaimParametersReferenceBuilder(this, item);
    }
    V1alpha2ResourceClaimParametersReferenceBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClaimParametersFluent.this.withGeneratedFrom(builder.build());
    }
    
    public N endGeneratedFrom() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClaimParametersFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}