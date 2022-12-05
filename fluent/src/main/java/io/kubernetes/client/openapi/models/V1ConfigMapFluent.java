package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1ConfigMapFluent<A extends V1ConfigMapFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToBinaryData(String key,byte[] value);
  public A addToBinaryData(Map<String,byte[]> map);
  public A removeFromBinaryData(String key);
  public A removeFromBinaryData(Map<String,byte[]> map);
  public Map<String,byte[]> getBinaryData();
  public <K,V>A withBinaryData(Map<String,byte[]> binaryData);
  public Boolean hasBinaryData();
  public A addToData(String key,String value);
  public A addToData(Map<String,String> map);
  public A removeFromData(String key);
  public A removeFromData(Map<String,String> map);
  public Map<String,String> getData();
  public <K,V>A withData(Map<String,String> data);
  public Boolean hasData();
  public Boolean getImmutable();
  public A withImmutable(Boolean immutable);
  public Boolean hasImmutable();
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
  public V1ConfigMapFluent.MetadataNested<A> withNewMetadata();
  public V1ConfigMapFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1ConfigMapFluent.MetadataNested<A> editMetadata();
  public V1ConfigMapFluent.MetadataNested<A> editOrNewMetadata();
  public V1ConfigMapFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  public A withImmutable();
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1ConfigMapFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}