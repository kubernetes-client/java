package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ValidatingAdmissionPolicyBindingFluentImpl<A extends V1alpha1ValidatingAdmissionPolicyBindingFluent<A>> extends BaseFluent<A> implements V1alpha1ValidatingAdmissionPolicyBindingFluent<A>{
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl() {
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl(V1alpha1ValidatingAdmissionPolicyBinding instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder spec;
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
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ValidatingAdmissionPolicyBindingSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1alpha1ValidatingAdmissionPolicyBindingSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<A> withNewSpec() {
    return new V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<A> withNewSpecLike(V1alpha1ValidatingAdmissionPolicyBindingSpec item) {
    return new V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<A> editOrNewSpecLike(V1alpha1ValidatingAdmissionPolicyBindingSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicyBindingFluentImpl that = (V1alpha1ValidatingAdmissionPolicyBindingFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<N>> implements V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<N>> implements V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1alpha1ValidatingAdmissionPolicyBindingSpec item) {
      this.builder = new V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder(this);
    }
    V1alpha1ValidatingAdmissionPolicyBindingSpecBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyBindingFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  
}