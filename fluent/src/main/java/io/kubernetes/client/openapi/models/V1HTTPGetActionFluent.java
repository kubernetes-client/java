package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.custom.IntOrString;
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
public interface V1HTTPGetActionFluent<A extends V1HTTPGetActionFluent<A>> extends Fluent<A>{
  public String getHost();
  public A withHost(String host);
  public Boolean hasHost();
  public A addToHttpHeaders(Integer index,V1HTTPHeader item);
  public A setToHttpHeaders(Integer index,V1HTTPHeader item);
  public A addToHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);
  public A addAllToHttpHeaders(Collection<V1HTTPHeader> items);
  public A removeFromHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);
  public A removeAllFromHttpHeaders(Collection<V1HTTPHeader> items);
  public A removeMatchingFromHttpHeaders(Predicate<V1HTTPHeaderBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildHttpHeaders instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HTTPHeader> getHttpHeaders();
  public List<V1HTTPHeader> buildHttpHeaders();
  public V1HTTPHeader buildHttpHeader(Integer index);
  public V1HTTPHeader buildFirstHttpHeader();
  public V1HTTPHeader buildLastHttpHeader();
  public V1HTTPHeader buildMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate);
  public Boolean hasMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate);
  public A withHttpHeaders(List<V1HTTPHeader> httpHeaders);
  public A withHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... httpHeaders);
  public Boolean hasHttpHeaders();
  public V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader();
  public V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeaderLike(V1HTTPHeader item);
  public V1HTTPGetActionFluent.HttpHeadersNested<A> setNewHttpHeaderLike(Integer index,V1HTTPHeader item);
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editHttpHeader(Integer index);
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editFirstHttpHeader();
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editLastHttpHeader();
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate);
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public IntOrString getPort();
  public A withPort(IntOrString port);
  public Boolean hasPort();
  public A withNewPort(int value);
  public A withNewPort(String value);
  public String getScheme();
  public A withScheme(String scheme);
  public Boolean hasScheme();
  public interface HttpHeadersNested<N> extends Nested<N>,V1HTTPHeaderFluent<V1HTTPGetActionFluent.HttpHeadersNested<N>>{
    public N and();
    public N endHttpHeader();
    
  }
  
}