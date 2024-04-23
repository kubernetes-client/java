package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2ResourceClassFluent<A extends V1alpha2ResourceClassFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceClassFluent() {
  }
  
  public V1alpha2ResourceClassFluent(V1alpha2ResourceClass instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String driverName;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha2ResourceClassParametersReferenceBuilder parametersRef;
  private Boolean structuredParameters;
  private V1NodeSelectorBuilder suitableNodes;
  
  protected void copyInstance(V1alpha2ResourceClass instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceClass());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDriverName(instance.getDriverName());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withParametersRef(instance.getParametersRef());
          this.withStructuredParameters(instance.getStructuredParameters());
          this.withSuitableNodes(instance.getSuitableNodes());
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
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
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
  
  public V1alpha2ResourceClassParametersReference buildParametersRef() {
    return this.parametersRef != null ? this.parametersRef.build() : null;
  }
  
  public A withParametersRef(V1alpha2ResourceClassParametersReference parametersRef) {
    this._visitables.remove("parametersRef");
    if (parametersRef != null) {
        this.parametersRef = new V1alpha2ResourceClassParametersReferenceBuilder(parametersRef);
        this._visitables.get("parametersRef").add(this.parametersRef);
    } else {
        this.parametersRef = null;
        this._visitables.get("parametersRef").remove(this.parametersRef);
    }
    return (A) this;
  }
  
  public boolean hasParametersRef() {
    return this.parametersRef != null;
  }
  
  public ParametersRefNested<A> withNewParametersRef() {
    return new ParametersRefNested(null);
  }
  
  public ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClassParametersReference item) {
    return new ParametersRefNested(item);
  }
  
  public ParametersRefNested<A> editParametersRef() {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(null));
  }
  
  public ParametersRefNested<A> editOrNewParametersRef() {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(new V1alpha2ResourceClassParametersReferenceBuilder().build()));
  }
  
  public ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClassParametersReference item) {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(item));
  }
  
  public Boolean getStructuredParameters() {
    return this.structuredParameters;
  }
  
  public A withStructuredParameters(Boolean structuredParameters) {
    this.structuredParameters = structuredParameters;
    return (A) this;
  }
  
  public boolean hasStructuredParameters() {
    return this.structuredParameters != null;
  }
  
  public V1NodeSelector buildSuitableNodes() {
    return this.suitableNodes != null ? this.suitableNodes.build() : null;
  }
  
  public A withSuitableNodes(V1NodeSelector suitableNodes) {
    this._visitables.remove("suitableNodes");
    if (suitableNodes != null) {
        this.suitableNodes = new V1NodeSelectorBuilder(suitableNodes);
        this._visitables.get("suitableNodes").add(this.suitableNodes);
    } else {
        this.suitableNodes = null;
        this._visitables.get("suitableNodes").remove(this.suitableNodes);
    }
    return (A) this;
  }
  
  public boolean hasSuitableNodes() {
    return this.suitableNodes != null;
  }
  
  public SuitableNodesNested<A> withNewSuitableNodes() {
    return new SuitableNodesNested(null);
  }
  
  public SuitableNodesNested<A> withNewSuitableNodesLike(V1NodeSelector item) {
    return new SuitableNodesNested(item);
  }
  
  public SuitableNodesNested<A> editSuitableNodes() {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(null));
  }
  
  public SuitableNodesNested<A> editOrNewSuitableNodes() {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public SuitableNodesNested<A> editOrNewSuitableNodesLike(V1NodeSelector item) {
    return withNewSuitableNodesLike(java.util.Optional.ofNullable(buildSuitableNodes()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClassFluent that = (V1alpha2ResourceClassFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(parametersRef, that.parametersRef)) return false;
    if (!java.util.Objects.equals(structuredParameters, that.structuredParameters)) return false;
    if (!java.util.Objects.equals(suitableNodes, that.suitableNodes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  driverName,  kind,  metadata,  parametersRef,  structuredParameters,  suitableNodes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (parametersRef != null) { sb.append("parametersRef:"); sb.append(parametersRef + ","); }
    if (structuredParameters != null) { sb.append("structuredParameters:"); sb.append(structuredParameters + ","); }
    if (suitableNodes != null) { sb.append("suitableNodes:"); sb.append(suitableNodes); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStructuredParameters() {
    return withStructuredParameters(true);
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class ParametersRefNested<N> extends V1alpha2ResourceClassParametersReferenceFluent<ParametersRefNested<N>> implements Nested<N>{
    ParametersRefNested(V1alpha2ResourceClassParametersReference item) {
      this.builder = new V1alpha2ResourceClassParametersReferenceBuilder(this, item);
    }
    V1alpha2ResourceClassParametersReferenceBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClassFluent.this.withParametersRef(builder.build());
    }
    
    public N endParametersRef() {
      return and();
    }
    
  
  }
  public class SuitableNodesNested<N> extends V1NodeSelectorFluent<SuitableNodesNested<N>> implements Nested<N>{
    SuitableNodesNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClassFluent.this.withSuitableNodes(builder.build());
    }
    
    public N endSuitableNodes() {
      return and();
    }
    
  
  }

}