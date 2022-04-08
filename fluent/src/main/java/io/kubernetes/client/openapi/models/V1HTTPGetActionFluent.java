/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1HTTPGetActionFluent<A extends V1HTTPGetActionFluent<A>> extends Fluent<A> {
  public String getHost();

  public A withHost(java.lang.String host);

  public Boolean hasHost();

  public A addToHttpHeaders(Integer index, V1HTTPHeader item);

  public A setToHttpHeaders(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item);

  public A addToHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);

  public A addAllToHttpHeaders(Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items);

  public A removeFromHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items);

  public A removeAllFromHttpHeaders(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items);

  public A removeMatchingFromHttpHeaders(Predicate<V1HTTPHeaderBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildHttpHeaders instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1HTTPHeader> getHttpHeaders();

  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> buildHttpHeaders();

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildHttpHeader(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildFirstHttpHeader();

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildLastHttpHeader();

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildMatchingHttpHeader(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
          predicate);

  public java.lang.Boolean hasMatchingHttpHeader(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
          predicate);

  public A withHttpHeaders(
      java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> httpHeaders);

  public A withHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... httpHeaders);

  public java.lang.Boolean hasHttpHeaders();

  public V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader();

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      addNewHttpHeaderLike(io.kubernetes.client.openapi.models.V1HTTPHeader item);

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      setNewHttpHeaderLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item);

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editHttpHeader(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editFirstHttpHeader();

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editLastHttpHeader();

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editMatchingHttpHeader(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
              predicate);

  public java.lang.String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  public IntOrString getPort();

  public A withPort(io.kubernetes.client.custom.IntOrString port);

  public java.lang.Boolean hasPort();

  public A withNewPort(int value);

  public A withNewPort(java.lang.String value);

  public java.lang.String getScheme();

  public A withScheme(java.lang.String scheme);

  public java.lang.Boolean hasScheme();

  public interface HttpHeadersNested<N>
      extends Nested<N>, V1HTTPHeaderFluent<V1HTTPGetActionFluent.HttpHeadersNested<N>> {
    public N and();

    public N endHttpHeader();
  }
}
