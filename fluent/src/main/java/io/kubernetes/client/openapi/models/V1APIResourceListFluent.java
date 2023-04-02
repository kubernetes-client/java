package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1APIResourceListFluent<A extends V1APIResourceListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getGroupVersion();
  public A withGroupVersion(String groupVersion);
  public Boolean hasGroupVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public A addToResources(Integer index,V1APIResource item);
  public A setToResources(Integer index,V1APIResource item);
  public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items);
  public A addAllToResources(Collection<V1APIResource> items);
  public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items);
  public A removeAllFromResources(Collection<V1APIResource> items);
  public A removeMatchingFromResources(Predicate<V1APIResourceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIResource> getResources();
  public List<V1APIResource> buildResources();
  public V1APIResource buildResource(Integer index);
  public V1APIResource buildFirstResource();
  public V1APIResource buildLastResource();
  public V1APIResource buildMatchingResource(Predicate<V1APIResourceBuilder> predicate);
  public Boolean hasMatchingResource(Predicate<V1APIResourceBuilder> predicate);
  public A withResources(List<V1APIResource> resources);
  public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources);
  public Boolean hasResources();
  public V1APIResourceListFluent.ResourcesNested<A> addNewResource();
  public V1APIResourceListFluent.ResourcesNested<A> addNewResourceLike(V1APIResource item);
  public V1APIResourceListFluent.ResourcesNested<A> setNewResourceLike(Integer index,V1APIResource item);
  public V1APIResourceListFluent.ResourcesNested<A> editResource(Integer index);
  public V1APIResourceListFluent.ResourcesNested<A> editFirstResource();
  public V1APIResourceListFluent.ResourcesNested<A> editLastResource();
  public V1APIResourceListFluent.ResourcesNested<A> editMatchingResource(Predicate<V1APIResourceBuilder> predicate);
  public interface ResourcesNested<N> extends Nested<N>,V1APIResourceFluent<V1APIResourceListFluent.ResourcesNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}