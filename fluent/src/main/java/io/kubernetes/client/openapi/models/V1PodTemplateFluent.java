package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodTemplateFluent<A extends V1PodTemplateFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1PodTemplateFluent.MetadataNested<A> withNewMetadata();
  public V1PodTemplateFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1PodTemplateFluent.MetadataNested<A> editMetadata();
  public V1PodTemplateFluent.MetadataNested<A> editOrNewMetadata();
  public V1PodTemplateFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodTemplateSpec getTemplate();
  public V1PodTemplateSpec buildTemplate();
  public A withTemplate(V1PodTemplateSpec template);
  public Boolean hasTemplate();
  public V1PodTemplateFluent.TemplateNested<A> withNewTemplate();
  public V1PodTemplateFluent.TemplateNested<A> withNewTemplateLike(V1PodTemplateSpec item);
  public V1PodTemplateFluent.TemplateNested<A> editTemplate();
  public V1PodTemplateFluent.TemplateNested<A> editOrNewTemplate();
  public V1PodTemplateFluent.TemplateNested<A> editOrNewTemplateLike(V1PodTemplateSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PodTemplateFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface TemplateNested<N> extends Nested<N>,V1PodTemplateSpecFluent<V1PodTemplateFluent.TemplateNested<N>>{
    public N and();
    public N endTemplate();
    
  }
  
}