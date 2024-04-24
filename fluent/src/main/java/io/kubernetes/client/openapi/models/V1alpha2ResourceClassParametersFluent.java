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
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceClassParametersFluent<A extends V1alpha2ResourceClassParametersFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceClassParametersFluent() {
  }
  
  public V1alpha2ResourceClassParametersFluent(V1alpha2ResourceClassParameters instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private ArrayList<V1alpha2ResourceFilterBuilder> filters;
  private V1alpha2ResourceClassParametersReferenceBuilder generatedFrom;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1alpha2VendorParametersBuilder> vendorParameters;
  
  protected void copyInstance(V1alpha2ResourceClassParameters instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceClassParameters());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withFilters(instance.getFilters());
          this.withGeneratedFrom(instance.getGeneratedFrom());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withVendorParameters(instance.getVendorParameters());
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
  
  public A addToFilters(int index,V1alpha2ResourceFilter item) {
    if (this.filters == null) {this.filters = new ArrayList<V1alpha2ResourceFilterBuilder>();}
    V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);
    if (index < 0 || index >= filters.size()) { _visitables.get("filters").add(builder); filters.add(builder); } else { _visitables.get("filters").add(index, builder); filters.add(index, builder);}
    return (A)this;
  }
  
  public A setToFilters(int index,V1alpha2ResourceFilter item) {
    if (this.filters == null) {this.filters = new ArrayList<V1alpha2ResourceFilterBuilder>();}
    V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);
    if (index < 0 || index >= filters.size()) { _visitables.get("filters").add(builder); filters.add(builder); } else { _visitables.get("filters").set(index, builder); filters.set(index, builder);}
    return (A)this;
  }
  
  public A addToFilters(io.kubernetes.client.openapi.models.V1alpha2ResourceFilter... items) {
    if (this.filters == null) {this.filters = new ArrayList<V1alpha2ResourceFilterBuilder>();}
    for (V1alpha2ResourceFilter item : items) {V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);_visitables.get("filters").add(builder);this.filters.add(builder);} return (A)this;
  }
  
  public A addAllToFilters(Collection<V1alpha2ResourceFilter> items) {
    if (this.filters == null) {this.filters = new ArrayList<V1alpha2ResourceFilterBuilder>();}
    for (V1alpha2ResourceFilter item : items) {V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);_visitables.get("filters").add(builder);this.filters.add(builder);} return (A)this;
  }
  
  public A removeFromFilters(io.kubernetes.client.openapi.models.V1alpha2ResourceFilter... items) {
    if (this.filters == null) return (A)this;
    for (V1alpha2ResourceFilter item : items) {V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);_visitables.get("filters").remove(builder); this.filters.remove(builder);} return (A)this;
  }
  
  public A removeAllFromFilters(Collection<V1alpha2ResourceFilter> items) {
    if (this.filters == null) return (A)this;
    for (V1alpha2ResourceFilter item : items) {V1alpha2ResourceFilterBuilder builder = new V1alpha2ResourceFilterBuilder(item);_visitables.get("filters").remove(builder); this.filters.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromFilters(Predicate<V1alpha2ResourceFilterBuilder> predicate) {
    if (filters == null) return (A) this;
    final Iterator<V1alpha2ResourceFilterBuilder> each = filters.iterator();
    final List visitables = _visitables.get("filters");
    while (each.hasNext()) {
      V1alpha2ResourceFilterBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2ResourceFilter> buildFilters() {
    return this.filters != null ? build(filters) : null;
  }
  
  public V1alpha2ResourceFilter buildFilter(int index) {
    return this.filters.get(index).build();
  }
  
  public V1alpha2ResourceFilter buildFirstFilter() {
    return this.filters.get(0).build();
  }
  
  public V1alpha2ResourceFilter buildLastFilter() {
    return this.filters.get(filters.size() - 1).build();
  }
  
  public V1alpha2ResourceFilter buildMatchingFilter(Predicate<V1alpha2ResourceFilterBuilder> predicate) {
      for (V1alpha2ResourceFilterBuilder item : filters) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingFilter(Predicate<V1alpha2ResourceFilterBuilder> predicate) {
      for (V1alpha2ResourceFilterBuilder item : filters) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFilters(List<V1alpha2ResourceFilter> filters) {
    if (this.filters != null) {
      this._visitables.get("filters").clear();
    }
    if (filters != null) {
        this.filters = new ArrayList();
        for (V1alpha2ResourceFilter item : filters) {
          this.addToFilters(item);
        }
    } else {
      this.filters = null;
    }
    return (A) this;
  }
  
  public A withFilters(io.kubernetes.client.openapi.models.V1alpha2ResourceFilter... filters) {
    if (this.filters != null) {
        this.filters.clear();
        _visitables.remove("filters");
    }
    if (filters != null) {
      for (V1alpha2ResourceFilter item : filters) {
        this.addToFilters(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFilters() {
    return this.filters != null && !this.filters.isEmpty();
  }
  
  public FiltersNested<A> addNewFilter() {
    return new FiltersNested(-1, null);
  }
  
  public FiltersNested<A> addNewFilterLike(V1alpha2ResourceFilter item) {
    return new FiltersNested(-1, item);
  }
  
  public FiltersNested<A> setNewFilterLike(int index,V1alpha2ResourceFilter item) {
    return new FiltersNested(index, item);
  }
  
  public FiltersNested<A> editFilter(int index) {
    if (filters.size() <= index) throw new RuntimeException("Can't edit filters. Index exceeds size.");
    return setNewFilterLike(index, buildFilter(index));
  }
  
  public FiltersNested<A> editFirstFilter() {
    if (filters.size() == 0) throw new RuntimeException("Can't edit first filters. The list is empty.");
    return setNewFilterLike(0, buildFilter(0));
  }
  
  public FiltersNested<A> editLastFilter() {
    int index = filters.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last filters. The list is empty.");
    return setNewFilterLike(index, buildFilter(index));
  }
  
  public FiltersNested<A> editMatchingFilter(Predicate<V1alpha2ResourceFilterBuilder> predicate) {
    int index = -1;
    for (int i=0;i<filters.size();i++) { 
    if (predicate.test(filters.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching filters. No match found.");
    return setNewFilterLike(index, buildFilter(index));
  }
  
  public V1alpha2ResourceClassParametersReference buildGeneratedFrom() {
    return this.generatedFrom != null ? this.generatedFrom.build() : null;
  }
  
  public A withGeneratedFrom(V1alpha2ResourceClassParametersReference generatedFrom) {
    this._visitables.remove("generatedFrom");
    if (generatedFrom != null) {
        this.generatedFrom = new V1alpha2ResourceClassParametersReferenceBuilder(generatedFrom);
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
  
  public GeneratedFromNested<A> withNewGeneratedFromLike(V1alpha2ResourceClassParametersReference item) {
    return new GeneratedFromNested(item);
  }
  
  public GeneratedFromNested<A> editGeneratedFrom() {
    return withNewGeneratedFromLike(java.util.Optional.ofNullable(buildGeneratedFrom()).orElse(null));
  }
  
  public GeneratedFromNested<A> editOrNewGeneratedFrom() {
    return withNewGeneratedFromLike(java.util.Optional.ofNullable(buildGeneratedFrom()).orElse(new V1alpha2ResourceClassParametersReferenceBuilder().build()));
  }
  
  public GeneratedFromNested<A> editOrNewGeneratedFromLike(V1alpha2ResourceClassParametersReference item) {
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
  
  public A addToVendorParameters(int index,V1alpha2VendorParameters item) {
    if (this.vendorParameters == null) {this.vendorParameters = new ArrayList<V1alpha2VendorParametersBuilder>();}
    V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);
    if (index < 0 || index >= vendorParameters.size()) { _visitables.get("vendorParameters").add(builder); vendorParameters.add(builder); } else { _visitables.get("vendorParameters").add(index, builder); vendorParameters.add(index, builder);}
    return (A)this;
  }
  
  public A setToVendorParameters(int index,V1alpha2VendorParameters item) {
    if (this.vendorParameters == null) {this.vendorParameters = new ArrayList<V1alpha2VendorParametersBuilder>();}
    V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);
    if (index < 0 || index >= vendorParameters.size()) { _visitables.get("vendorParameters").add(builder); vendorParameters.add(builder); } else { _visitables.get("vendorParameters").set(index, builder); vendorParameters.set(index, builder);}
    return (A)this;
  }
  
  public A addToVendorParameters(io.kubernetes.client.openapi.models.V1alpha2VendorParameters... items) {
    if (this.vendorParameters == null) {this.vendorParameters = new ArrayList<V1alpha2VendorParametersBuilder>();}
    for (V1alpha2VendorParameters item : items) {V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);_visitables.get("vendorParameters").add(builder);this.vendorParameters.add(builder);} return (A)this;
  }
  
  public A addAllToVendorParameters(Collection<V1alpha2VendorParameters> items) {
    if (this.vendorParameters == null) {this.vendorParameters = new ArrayList<V1alpha2VendorParametersBuilder>();}
    for (V1alpha2VendorParameters item : items) {V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);_visitables.get("vendorParameters").add(builder);this.vendorParameters.add(builder);} return (A)this;
  }
  
  public A removeFromVendorParameters(io.kubernetes.client.openapi.models.V1alpha2VendorParameters... items) {
    if (this.vendorParameters == null) return (A)this;
    for (V1alpha2VendorParameters item : items) {V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);_visitables.get("vendorParameters").remove(builder); this.vendorParameters.remove(builder);} return (A)this;
  }
  
  public A removeAllFromVendorParameters(Collection<V1alpha2VendorParameters> items) {
    if (this.vendorParameters == null) return (A)this;
    for (V1alpha2VendorParameters item : items) {V1alpha2VendorParametersBuilder builder = new V1alpha2VendorParametersBuilder(item);_visitables.get("vendorParameters").remove(builder); this.vendorParameters.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromVendorParameters(Predicate<V1alpha2VendorParametersBuilder> predicate) {
    if (vendorParameters == null) return (A) this;
    final Iterator<V1alpha2VendorParametersBuilder> each = vendorParameters.iterator();
    final List visitables = _visitables.get("vendorParameters");
    while (each.hasNext()) {
      V1alpha2VendorParametersBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2VendorParameters> buildVendorParameters() {
    return this.vendorParameters != null ? build(vendorParameters) : null;
  }
  
  public V1alpha2VendorParameters buildVendorParameter(int index) {
    return this.vendorParameters.get(index).build();
  }
  
  public V1alpha2VendorParameters buildFirstVendorParameter() {
    return this.vendorParameters.get(0).build();
  }
  
  public V1alpha2VendorParameters buildLastVendorParameter() {
    return this.vendorParameters.get(vendorParameters.size() - 1).build();
  }
  
  public V1alpha2VendorParameters buildMatchingVendorParameter(Predicate<V1alpha2VendorParametersBuilder> predicate) {
      for (V1alpha2VendorParametersBuilder item : vendorParameters) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVendorParameter(Predicate<V1alpha2VendorParametersBuilder> predicate) {
      for (V1alpha2VendorParametersBuilder item : vendorParameters) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVendorParameters(List<V1alpha2VendorParameters> vendorParameters) {
    if (this.vendorParameters != null) {
      this._visitables.get("vendorParameters").clear();
    }
    if (vendorParameters != null) {
        this.vendorParameters = new ArrayList();
        for (V1alpha2VendorParameters item : vendorParameters) {
          this.addToVendorParameters(item);
        }
    } else {
      this.vendorParameters = null;
    }
    return (A) this;
  }
  
  public A withVendorParameters(io.kubernetes.client.openapi.models.V1alpha2VendorParameters... vendorParameters) {
    if (this.vendorParameters != null) {
        this.vendorParameters.clear();
        _visitables.remove("vendorParameters");
    }
    if (vendorParameters != null) {
      for (V1alpha2VendorParameters item : vendorParameters) {
        this.addToVendorParameters(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVendorParameters() {
    return this.vendorParameters != null && !this.vendorParameters.isEmpty();
  }
  
  public VendorParametersNested<A> addNewVendorParameter() {
    return new VendorParametersNested(-1, null);
  }
  
  public VendorParametersNested<A> addNewVendorParameterLike(V1alpha2VendorParameters item) {
    return new VendorParametersNested(-1, item);
  }
  
  public VendorParametersNested<A> setNewVendorParameterLike(int index,V1alpha2VendorParameters item) {
    return new VendorParametersNested(index, item);
  }
  
  public VendorParametersNested<A> editVendorParameter(int index) {
    if (vendorParameters.size() <= index) throw new RuntimeException("Can't edit vendorParameters. Index exceeds size.");
    return setNewVendorParameterLike(index, buildVendorParameter(index));
  }
  
  public VendorParametersNested<A> editFirstVendorParameter() {
    if (vendorParameters.size() == 0) throw new RuntimeException("Can't edit first vendorParameters. The list is empty.");
    return setNewVendorParameterLike(0, buildVendorParameter(0));
  }
  
  public VendorParametersNested<A> editLastVendorParameter() {
    int index = vendorParameters.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last vendorParameters. The list is empty.");
    return setNewVendorParameterLike(index, buildVendorParameter(index));
  }
  
  public VendorParametersNested<A> editMatchingVendorParameter(Predicate<V1alpha2VendorParametersBuilder> predicate) {
    int index = -1;
    for (int i=0;i<vendorParameters.size();i++) { 
    if (predicate.test(vendorParameters.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching vendorParameters. No match found.");
    return setNewVendorParameterLike(index, buildVendorParameter(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClassParametersFluent that = (V1alpha2ResourceClassParametersFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(filters, that.filters)) return false;
    if (!java.util.Objects.equals(generatedFrom, that.generatedFrom)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(vendorParameters, that.vendorParameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  filters,  generatedFrom,  kind,  metadata,  vendorParameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (filters != null && !filters.isEmpty()) { sb.append("filters:"); sb.append(filters + ","); }
    if (generatedFrom != null) { sb.append("generatedFrom:"); sb.append(generatedFrom + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (vendorParameters != null && !vendorParameters.isEmpty()) { sb.append("vendorParameters:"); sb.append(vendorParameters); }
    sb.append("}");
    return sb.toString();
  }
  public class FiltersNested<N> extends V1alpha2ResourceFilterFluent<FiltersNested<N>> implements Nested<N>{
    FiltersNested(int index,V1alpha2ResourceFilter item) {
      this.index = index;
      this.builder = new V1alpha2ResourceFilterBuilder(this, item);
    }
    V1alpha2ResourceFilterBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2ResourceClassParametersFluent.this.setToFilters(index,builder.build());
    }
    
    public N endFilter() {
      return and();
    }
    
  
  }
  public class GeneratedFromNested<N> extends V1alpha2ResourceClassParametersReferenceFluent<GeneratedFromNested<N>> implements Nested<N>{
    GeneratedFromNested(V1alpha2ResourceClassParametersReference item) {
      this.builder = new V1alpha2ResourceClassParametersReferenceBuilder(this, item);
    }
    V1alpha2ResourceClassParametersReferenceBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClassParametersFluent.this.withGeneratedFrom(builder.build());
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
      return (N) V1alpha2ResourceClassParametersFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class VendorParametersNested<N> extends V1alpha2VendorParametersFluent<VendorParametersNested<N>> implements Nested<N>{
    VendorParametersNested(int index,V1alpha2VendorParameters item) {
      this.index = index;
      this.builder = new V1alpha2VendorParametersBuilder(this, item);
    }
    V1alpha2VendorParametersBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2ResourceClassParametersFluent.this.setToVendorParameters(index,builder.build());
    }
    
    public N endVendorParameter() {
      return and();
    }
    
  
  }

}