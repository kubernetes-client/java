package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ControllerRevisionFluent<A extends V1ControllerRevisionFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Object getData();
  public A withData(Object data);
  public Boolean hasData();
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
  public V1ControllerRevisionFluent.MetadataNested<A> withNewMetadata();
  public V1ControllerRevisionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ControllerRevisionFluent.MetadataNested<A> editMetadata();
  public V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadata();
  public V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public Long getRevision();
  public A withRevision(Long revision);
  public Boolean hasRevision();
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ControllerRevisionFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}