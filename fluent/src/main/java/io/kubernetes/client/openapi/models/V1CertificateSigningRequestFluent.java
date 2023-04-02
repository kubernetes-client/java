package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CertificateSigningRequestFluent<A extends V1CertificateSigningRequestFluent<A>> extends Fluent<A>{
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
  public V1CertificateSigningRequestFluent.MetadataNested<A> withNewMetadata();
  public V1CertificateSigningRequestFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1CertificateSigningRequestFluent.MetadataNested<A> editMetadata();
  public V1CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadata();
  public V1CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CertificateSigningRequestSpec getSpec();
  public V1CertificateSigningRequestSpec buildSpec();
  public A withSpec(V1CertificateSigningRequestSpec spec);
  public Boolean hasSpec();
  public V1CertificateSigningRequestFluent.SpecNested<A> withNewSpec();
  public V1CertificateSigningRequestFluent.SpecNested<A> withNewSpecLike(V1CertificateSigningRequestSpec item);
  public V1CertificateSigningRequestFluent.SpecNested<A> editSpec();
  public V1CertificateSigningRequestFluent.SpecNested<A> editOrNewSpec();
  public V1CertificateSigningRequestFluent.SpecNested<A> editOrNewSpecLike(V1CertificateSigningRequestSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CertificateSigningRequestStatus getStatus();
  public V1CertificateSigningRequestStatus buildStatus();
  public A withStatus(V1CertificateSigningRequestStatus status);
  public Boolean hasStatus();
  public V1CertificateSigningRequestFluent.StatusNested<A> withNewStatus();
  public V1CertificateSigningRequestFluent.StatusNested<A> withNewStatusLike(V1CertificateSigningRequestStatus item);
  public V1CertificateSigningRequestFluent.StatusNested<A> editStatus();
  public V1CertificateSigningRequestFluent.StatusNested<A> editOrNewStatus();
  public V1CertificateSigningRequestFluent.StatusNested<A> editOrNewStatusLike(V1CertificateSigningRequestStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1CertificateSigningRequestFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1CertificateSigningRequestSpecFluent<V1CertificateSigningRequestFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1CertificateSigningRequestStatusFluent<V1CertificateSigningRequestFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}