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
public interface V1EndpointHintsFluent<A extends V1EndpointHintsFluent<A>> extends Fluent<A> {
  public A addToForZones(Integer index, V1ForZone item);

  public A setToForZones(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ForZone item);

  public A addToForZones(io.kubernetes.client.openapi.models.V1ForZone... items);

  public A addAllToForZones(Collection<io.kubernetes.client.openapi.models.V1ForZone> items);

  public A removeFromForZones(io.kubernetes.client.openapi.models.V1ForZone... items);

  public A removeAllFromForZones(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ForZone> items);

  public A removeMatchingFromForZones(Predicate<V1ForZoneBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildForZones instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ForZone> getForZones();

  public java.util.List<io.kubernetes.client.openapi.models.V1ForZone> buildForZones();

  public io.kubernetes.client.openapi.models.V1ForZone buildForZone(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ForZone buildFirstForZone();

  public io.kubernetes.client.openapi.models.V1ForZone buildLastForZone();

  public io.kubernetes.client.openapi.models.V1ForZone buildMatchingForZone(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ForZoneBuilder> predicate);

  public Boolean hasMatchingForZone(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ForZoneBuilder> predicate);

  public A withForZones(java.util.List<io.kubernetes.client.openapi.models.V1ForZone> forZones);

  public A withForZones(io.kubernetes.client.openapi.models.V1ForZone... forZones);

  public java.lang.Boolean hasForZones();

  public V1EndpointHintsFluent.ForZonesNested<A> addNewForZone();

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A>
      addNewForZoneLike(io.kubernetes.client.openapi.models.V1ForZone item);

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A>
      setNewForZoneLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ForZone item);

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A> editForZone(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A>
      editFirstForZone();

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A>
      editLastForZone();

  public io.kubernetes.client.openapi.models.V1EndpointHintsFluent.ForZonesNested<A>
      editMatchingForZone(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ForZoneBuilder>
              predicate);

  public interface ForZonesNested<N>
      extends Nested<N>, V1ForZoneFluent<V1EndpointHintsFluent.ForZonesNested<N>> {
    public N and();

    public N endForZone();
  }
}
