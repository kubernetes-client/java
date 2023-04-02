package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TokenRequestSpecFluent<A extends V1TokenRequestSpecFluent<A>> extends Fluent<A>{
  public A addToAudiences(Integer index,String item);
  public A setToAudiences(Integer index,String item);
  public A addToAudiences(java.lang.String... items);
  public A addAllToAudiences(Collection<String> items);
  public A removeFromAudiences(java.lang.String... items);
  public A removeAllFromAudiences(Collection<String> items);
  public List<String> getAudiences();
  public String getAudience(Integer index);
  public String getFirstAudience();
  public String getLastAudience();
  public String getMatchingAudience(Predicate<String> predicate);
  public Boolean hasMatchingAudience(Predicate<String> predicate);
  public A withAudiences(List<String> audiences);
  public A withAudiences(java.lang.String... audiences);
  public Boolean hasAudiences();
  
  /**
   * This method has been deprecated, please use method buildBoundObjectRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1BoundObjectReference getBoundObjectRef();
  public V1BoundObjectReference buildBoundObjectRef();
  public A withBoundObjectRef(V1BoundObjectReference boundObjectRef);
  public Boolean hasBoundObjectRef();
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef();
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(V1BoundObjectReference item);
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef();
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef();
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(V1BoundObjectReference item);
  public Long getExpirationSeconds();
  public A withExpirationSeconds(Long expirationSeconds);
  public Boolean hasExpirationSeconds();
  public interface BoundObjectRefNested<N> extends Nested<N>,V1BoundObjectReferenceFluent<V1TokenRequestSpecFluent.BoundObjectRefNested<N>>{
    public N and();
    public N endBoundObjectRef();
    
  }
  
}