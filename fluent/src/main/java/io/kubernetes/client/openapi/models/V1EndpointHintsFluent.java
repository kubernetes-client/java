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

  public A setToForZones(Integer index, V1ForZone item);

  public A addToForZones(io.kubernetes.client.openapi.models.V1ForZone... items);

  public A addAllToForZones(Collection<V1ForZone> items);

  public A removeFromForZones(io.kubernetes.client.openapi.models.V1ForZone... items);

  public A removeAllFromForZones(Collection<V1ForZone> items);

  public A removeMatchingFromForZones(Predicate<V1ForZoneBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildForZones instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ForZone> getForZones();

  public List<V1ForZone> buildForZones();

  public V1ForZone buildForZone(Integer index);

  public V1ForZone buildFirstForZone();

  public V1ForZone buildLastForZone();

  public V1ForZone buildMatchingForZone(Predicate<V1ForZoneBuilder> predicate);

  public Boolean hasMatchingForZone(Predicate<V1ForZoneBuilder> predicate);

  public A withForZones(List<V1ForZone> forZones);

  public A withForZones(io.kubernetes.client.openapi.models.V1ForZone... forZones);

  public Boolean hasForZones();

  public V1EndpointHintsFluent.ForZonesNested<A> addNewForZone();

  public V1EndpointHintsFluent.ForZonesNested<A> addNewForZoneLike(V1ForZone item);

  public V1EndpointHintsFluent.ForZonesNested<A> setNewForZoneLike(Integer index, V1ForZone item);

  public V1EndpointHintsFluent.ForZonesNested<A> editForZone(Integer index);

  public V1EndpointHintsFluent.ForZonesNested<A> editFirstForZone();

  public V1EndpointHintsFluent.ForZonesNested<A> editLastForZone();

  public V1EndpointHintsFluent.ForZonesNested<A> editMatchingForZone(
      Predicate<V1ForZoneBuilder> predicate);

  public interface ForZonesNested<N>
      extends Nested<N>, V1ForZoneFluent<V1EndpointHintsFluent.ForZonesNested<N>> {
    public N and();

    public N endForZone();
  }
}
