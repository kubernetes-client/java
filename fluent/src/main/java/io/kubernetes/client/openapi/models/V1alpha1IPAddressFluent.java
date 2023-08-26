package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1IPAddressFluent<A extends V1alpha1IPAddressFluent<A>> extends Fluent<A>{
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
  public V1alpha1IPAddressFluent.MetadataNested<A> withNewMetadata();
  public V1alpha1IPAddressFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha1IPAddressFluent.MetadataNested<A> editMetadata();
  public V1alpha1IPAddressFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha1IPAddressFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1IPAddressSpec getSpec();
  public V1alpha1IPAddressSpec buildSpec();
  public A withSpec(V1alpha1IPAddressSpec spec);
  public Boolean hasSpec();
  public V1alpha1IPAddressFluent.SpecNested<A> withNewSpec();
  public V1alpha1IPAddressFluent.SpecNested<A> withNewSpecLike(V1alpha1IPAddressSpec item);
  public V1alpha1IPAddressFluent.SpecNested<A> editSpec();
  public V1alpha1IPAddressFluent.SpecNested<A> editOrNewSpec();
  public V1alpha1IPAddressFluent.SpecNested<A> editOrNewSpecLike(V1alpha1IPAddressSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha1IPAddressFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1alpha1IPAddressSpecFluent<V1alpha1IPAddressFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}