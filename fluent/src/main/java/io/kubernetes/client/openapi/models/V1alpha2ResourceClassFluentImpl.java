package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha2ResourceClassFluentImpl<A extends V1alpha2ResourceClassFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceClassFluent<A>{
  public V1alpha2ResourceClassFluentImpl() {
  }
  public V1alpha2ResourceClassFluentImpl(V1alpha2ResourceClass instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withDriverName(instance.getDriverName());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withParametersRef(instance.getParametersRef());
      this.withSuitableNodes(instance.getSuitableNodes());
    }
  }
  private String apiVersion;
  private String driverName;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha2ResourceClassParametersReferenceBuilder parametersRef;
  private V1NodeSelectorBuilder suitableNodes;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getDriverName() {
    return this.driverName;
  }
  public A withDriverName(String driverName) {
    this.driverName=driverName; return (A) this;
  }
  public Boolean hasDriverName() {
    return this.driverName != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1alpha2ResourceClassFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha2ResourceClassFluentImpl.MetadataNestedImpl();
  }
  public V1alpha2ResourceClassFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha2ResourceClassFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha2ResourceClassFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha2ResourceClassFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha2ResourceClassFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildParametersRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClassParametersReference getParametersRef() {
    return this.parametersRef!=null ?this.parametersRef.build():null;
  }
  public V1alpha2ResourceClassParametersReference buildParametersRef() {
    return this.parametersRef!=null ?this.parametersRef.build():null;
  }
  public A withParametersRef(V1alpha2ResourceClassParametersReference parametersRef) {
    _visitables.get("parametersRef").remove(this.parametersRef);
    if (parametersRef!=null){ this.parametersRef= new V1alpha2ResourceClassParametersReferenceBuilder(parametersRef); _visitables.get("parametersRef").add(this.parametersRef);} else { this.parametersRef = null; _visitables.get("parametersRef").remove(this.parametersRef); } return (A) this;
  }
  public Boolean hasParametersRef() {
    return this.parametersRef != null;
  }
  public V1alpha2ResourceClassFluentImpl.ParametersRefNested<A> withNewParametersRef() {
    return new V1alpha2ResourceClassFluentImpl.ParametersRefNestedImpl();
  }
  public V1alpha2ResourceClassFluentImpl.ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClassParametersReference item) {
    return new V1alpha2ResourceClassFluentImpl.ParametersRefNestedImpl(item);
  }
  public V1alpha2ResourceClassFluentImpl.ParametersRefNested<A> editParametersRef() {
    return withNewParametersRefLike(getParametersRef());
  }
  public V1alpha2ResourceClassFluentImpl.ParametersRefNested<A> editOrNewParametersRef() {
    return withNewParametersRefLike(getParametersRef() != null ? getParametersRef(): new V1alpha2ResourceClassParametersReferenceBuilder().build());
  }
  public V1alpha2ResourceClassFluentImpl.ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClassParametersReference item) {
    return withNewParametersRefLike(getParametersRef() != null ? getParametersRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSuitableNodes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getSuitableNodes() {
    return this.suitableNodes!=null ?this.suitableNodes.build():null;
  }
  public V1NodeSelector buildSuitableNodes() {
    return this.suitableNodes!=null ?this.suitableNodes.build():null;
  }
  public A withSuitableNodes(V1NodeSelector suitableNodes) {
    _visitables.get("suitableNodes").remove(this.suitableNodes);
    if (suitableNodes!=null){ this.suitableNodes= new V1NodeSelectorBuilder(suitableNodes); _visitables.get("suitableNodes").add(this.suitableNodes);} else { this.suitableNodes = null; _visitables.get("suitableNodes").remove(this.suitableNodes); } return (A) this;
  }
  public Boolean hasSuitableNodes() {
    return this.suitableNodes != null;
  }
  public V1alpha2ResourceClassFluentImpl.SuitableNodesNested<A> withNewSuitableNodes() {
    return new V1alpha2ResourceClassFluentImpl.SuitableNodesNestedImpl();
  }
  public V1alpha2ResourceClassFluentImpl.SuitableNodesNested<A> withNewSuitableNodesLike(V1NodeSelector item) {
    return new V1alpha2ResourceClassFluentImpl.SuitableNodesNestedImpl(item);
  }
  public V1alpha2ResourceClassFluentImpl.SuitableNodesNested<A> editSuitableNodes() {
    return withNewSuitableNodesLike(getSuitableNodes());
  }
  public V1alpha2ResourceClassFluentImpl.SuitableNodesNested<A> editOrNewSuitableNodes() {
    return withNewSuitableNodesLike(getSuitableNodes() != null ? getSuitableNodes(): new V1NodeSelectorBuilder().build());
  }
  public V1alpha2ResourceClassFluentImpl.SuitableNodesNested<A> editOrNewSuitableNodesLike(V1NodeSelector item) {
    return withNewSuitableNodesLike(getSuitableNodes() != null ? getSuitableNodes(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClassFluentImpl that = (V1alpha2ResourceClassFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(driverName, that.driverName)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(parametersRef, that.parametersRef)) return false;

    if (!java.util.Objects.equals(suitableNodes, that.suitableNodes)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  driverName,  kind,  metadata,  parametersRef,  suitableNodes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (parametersRef != null) { sb.append("parametersRef:"); sb.append(parametersRef + ","); }
    if (suitableNodes != null) { sb.append("suitableNodes:"); sb.append(suitableNodes); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha2ResourceClassFluentImpl.MetadataNested<N>> implements V1alpha2ResourceClassFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClassFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class ParametersRefNestedImpl<N> extends V1alpha2ResourceClassParametersReferenceFluentImpl<V1alpha2ResourceClassFluentImpl.ParametersRefNested<N>> implements V1alpha2ResourceClassFluentImpl.ParametersRefNested<N>,Nested<N>{
    ParametersRefNestedImpl(V1alpha2ResourceClassParametersReference item) {
      this.builder = new V1alpha2ResourceClassParametersReferenceBuilder(this, item);
    }
    ParametersRefNestedImpl() {
      this.builder = new V1alpha2ResourceClassParametersReferenceBuilder(this);
    }
    V1alpha2ResourceClassParametersReferenceBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClassFluentImpl.this.withParametersRef(builder.build());
    }
    public N endParametersRef() {
      return and();
    }
    
  }
  class SuitableNodesNestedImpl<N> extends V1NodeSelectorFluentImpl<V1alpha2ResourceClassFluentImpl.SuitableNodesNested<N>> implements V1alpha2ResourceClassFluentImpl.SuitableNodesNested<N>,Nested<N>{
    SuitableNodesNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    SuitableNodesNestedImpl() {
      this.builder = new V1NodeSelectorBuilder(this);
    }
    V1NodeSelectorBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClassFluentImpl.this.withSuitableNodes(builder.build());
    }
    public N endSuitableNodes() {
      return and();
    }
    
  }
  
}