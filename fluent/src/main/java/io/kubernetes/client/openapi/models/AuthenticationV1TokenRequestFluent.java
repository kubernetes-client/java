package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface AuthenticationV1TokenRequestFluent<A extends AuthenticationV1TokenRequestFluent<A>> extends Fluent<A>{
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
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> withNewMetadata();
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editMetadata();
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editOrNewMetadata();
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenRequestSpec getSpec();
  public V1TokenRequestSpec buildSpec();
  public A withSpec(V1TokenRequestSpec spec);
  public Boolean hasSpec();
  public AuthenticationV1TokenRequestFluent.SpecNested<A> withNewSpec();
  public AuthenticationV1TokenRequestFluent.SpecNested<A> withNewSpecLike(V1TokenRequestSpec item);
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editSpec();
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editOrNewSpec();
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editOrNewSpecLike(V1TokenRequestSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenRequestStatus getStatus();
  public V1TokenRequestStatus buildStatus();
  public A withStatus(V1TokenRequestStatus status);
  public Boolean hasStatus();
  public AuthenticationV1TokenRequestFluent.StatusNested<A> withNewStatus();
  public AuthenticationV1TokenRequestFluent.StatusNested<A> withNewStatusLike(V1TokenRequestStatus item);
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editStatus();
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editOrNewStatus();
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editOrNewStatusLike(V1TokenRequestStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<AuthenticationV1TokenRequestFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1TokenRequestSpecFluent<AuthenticationV1TokenRequestFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1TokenRequestStatusFluent<AuthenticationV1TokenRequestFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}