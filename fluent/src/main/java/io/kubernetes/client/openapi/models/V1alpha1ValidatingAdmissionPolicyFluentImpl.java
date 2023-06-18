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
  public class V1alpha1ValidatingAdmissionPolicyFluentImpl<A extends V1alpha1ValidatingAdmissionPolicyFluent<A>> extends BaseFluent<A> implements V1alpha1ValidatingAdmissionPolicyFluent<A>{
  public V1alpha1ValidatingAdmissionPolicyFluentImpl() {
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl(V1alpha1ValidatingAdmissionPolicy instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1ValidatingAdmissionPolicySpecBuilder spec;
  private V1alpha1ValidatingAdmissionPolicyStatusBuilder status;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
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
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ValidatingAdmissionPolicySpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1alpha1ValidatingAdmissionPolicySpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1alpha1ValidatingAdmissionPolicySpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1alpha1ValidatingAdmissionPolicySpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<A> withNewSpec() {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<A> withNewSpecLike(V1alpha1ValidatingAdmissionPolicySpec item) {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1alpha1ValidatingAdmissionPolicySpecBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<A> editOrNewSpecLike(V1alpha1ValidatingAdmissionPolicySpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ValidatingAdmissionPolicyStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1alpha1ValidatingAdmissionPolicyStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1alpha1ValidatingAdmissionPolicyStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1alpha1ValidatingAdmissionPolicyStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<A> withNewStatus() {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<A> withNewStatusLike(V1alpha1ValidatingAdmissionPolicyStatus item) {
    return new V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1alpha1ValidatingAdmissionPolicyStatusBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<A> editOrNewStatusLike(V1alpha1ValidatingAdmissionPolicyStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicyFluentImpl that = (V1alpha1ValidatingAdmissionPolicyFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    if (!java.util.Objects.equals(status, that.status)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<N>> implements V1alpha1ValidatingAdmissionPolicyFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1alpha1ValidatingAdmissionPolicySpecFluentImpl<V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<N>> implements V1alpha1ValidatingAdmissionPolicyFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1alpha1ValidatingAdmissionPolicySpec item) {
      this.builder = new V1alpha1ValidatingAdmissionPolicySpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1alpha1ValidatingAdmissionPolicySpecBuilder(this);
    }
    V1alpha1ValidatingAdmissionPolicySpecBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1alpha1ValidatingAdmissionPolicyStatusFluentImpl<V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<N>> implements V1alpha1ValidatingAdmissionPolicyFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1alpha1ValidatingAdmissionPolicyStatus item) {
      this.builder = new V1alpha1ValidatingAdmissionPolicyStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1alpha1ValidatingAdmissionPolicyStatusBuilder(this);
    }
    V1alpha1ValidatingAdmissionPolicyStatusBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}