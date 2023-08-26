package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodResourceClaimFluent<A extends V1PodResourceClaimFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ClaimSource getSource();
  public V1ClaimSource buildSource();
  public A withSource(V1ClaimSource source);
  public Boolean hasSource();
  public V1PodResourceClaimFluent.SourceNested<A> withNewSource();
  public V1PodResourceClaimFluent.SourceNested<A> withNewSourceLike(V1ClaimSource item);
  public V1PodResourceClaimFluent.SourceNested<A> editSource();
  public V1PodResourceClaimFluent.SourceNested<A> editOrNewSource();
  public V1PodResourceClaimFluent.SourceNested<A> editOrNewSourceLike(V1ClaimSource item);
  public interface SourceNested<N> extends Nested<N>,V1ClaimSourceFluent<V1PodResourceClaimFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}