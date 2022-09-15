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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1TokenRequestSpecFluent<A extends V1TokenRequestSpecFluent<A>> extends Fluent<A> {
  public A addToAudiences(Integer index, String item);

  public A setToAudiences(Integer index, String item);

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
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1BoundObjectReference getBoundObjectRef();

  public V1BoundObjectReference buildBoundObjectRef();

  public A withBoundObjectRef(V1BoundObjectReference boundObjectRef);

  public Boolean hasBoundObjectRef();

  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef();

  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(
      V1BoundObjectReference item);

  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef();

  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef();

  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(
      V1BoundObjectReference item);

  public Long getExpirationSeconds();

  public A withExpirationSeconds(Long expirationSeconds);

  public Boolean hasExpirationSeconds();

  public interface BoundObjectRefNested<N>
      extends Nested<N>,
          V1BoundObjectReferenceFluent<V1TokenRequestSpecFluent.BoundObjectRefNested<N>> {
    public N and();

    public N endBoundObjectRef();
  }
}
