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
  public class V1PodTemplateFluentImpl<A extends V1PodTemplateFluent<A>> extends BaseFluent<A> implements V1PodTemplateFluent<A>{
  public V1PodTemplateFluentImpl() {
  }
  public V1PodTemplateFluentImpl(V1PodTemplate instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTemplate(instance.getTemplate());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1PodTemplateSpecBuilder template;
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
  public V1PodTemplateFluent.MetadataNested<A> withNewMetadata() {
    return new V1PodTemplateFluentImpl.MetadataNestedImpl();
  }
  public V1PodTemplateFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1PodTemplateFluentImpl.MetadataNestedImpl(item);
  }
  public V1PodTemplateFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1PodTemplateFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1PodTemplateFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public V1PodTemplateSpec buildTemplate() {
    return this.template!=null ?this.template.build():null;
  }
  public A withTemplate(V1PodTemplateSpec template) {
    _visitables.get("template").remove(this.template);
    if (template!=null){ this.template= new V1PodTemplateSpecBuilder(template); _visitables.get("template").add(this.template);} else { this.template = null; _visitables.get("template").remove(this.template); } return (A) this;
  }
  public Boolean hasTemplate() {
    return this.template != null;
  }
  public V1PodTemplateFluent.TemplateNested<A> withNewTemplate() {
    return new V1PodTemplateFluentImpl.TemplateNestedImpl();
  }
  public V1PodTemplateFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item) {
    return new V1PodTemplateFluentImpl.TemplateNestedImpl(item);
  }
  public V1PodTemplateFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }
  public V1PodTemplateFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): new V1PodTemplateSpecBuilder().build());
  }
  public V1PodTemplateFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodTemplateFluentImpl that = (V1PodTemplateFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (template != null ? !template.equals(that.template) :that.template != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  template,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (template != null) { sb.append("template:"); sb.append(template); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1PodTemplateFluent.MetadataNested<N>> implements V1PodTemplateFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1PodTemplateFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1PodTemplateFluent.TemplateNested<N>> implements V1PodTemplateFluent.TemplateNested<N>,Nested<N>{
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }
    TemplateNestedImpl() {
      this.builder = new V1PodTemplateSpecBuilder(this);
    }
    V1PodTemplateSpecBuilder builder;
    public N and() {
      return (N) V1PodTemplateFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate() {
      return and();
    }
    
  }
  
}