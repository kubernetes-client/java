package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatusFluent<A extends V1StatusFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public Integer getCode();
  public A withCode(Integer code);
  public Boolean hasCode();
  
  /**
   * This method has been deprecated, please use method buildDetails instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StatusDetails getDetails();
  public V1StatusDetails buildDetails();
  public A withDetails(V1StatusDetails details);
  public Boolean hasDetails();
  public V1StatusFluent.DetailsNested<A> withNewDetails();
  public V1StatusFluent.DetailsNested<A> withNewDetailsLike(V1StatusDetails item);
  public V1StatusFluent.DetailsNested<A> editDetails();
  public V1StatusFluent.DetailsNested<A> editOrNewDetails();
  public V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(V1StatusDetails item);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();
  public V1ListMeta buildMetadata();
  public A withMetadata(V1ListMeta metadata);
  public Boolean hasMetadata();
  public V1StatusFluent.MetadataNested<A> withNewMetadata();
  public V1StatusFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1StatusFluent.MetadataNested<A> editMetadata();
  public V1StatusFluent.MetadataNested<A> editOrNewMetadata();
  public V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  public String getStatus();
  public A withStatus(String status);
  public Boolean hasStatus();
  public interface DetailsNested<N> extends Nested<N>,V1StatusDetailsFluent<V1StatusFluent.DetailsNested<N>>{
    public N and();
    public N endDetails();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1StatusFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}