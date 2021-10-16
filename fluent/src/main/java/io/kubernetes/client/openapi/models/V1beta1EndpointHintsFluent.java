package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
public interface V1beta1EndpointHintsFluent<A extends io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToForZones(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public A setToForZones(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public A addToForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items);
  public A addAllToForZones(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items);
  public A removeFromForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... items);
  public A removeAllFromForZones(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ForZone> items);
  public A removeMatchingFromForZones(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildForZones instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> getForZones();
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> buildForZones();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildForZone(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildFirstForZone();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildLastForZone();
  public io.kubernetes.client.openapi.models.V1beta1ForZone buildMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public java.lang.Boolean hasMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public A withForZones(java.util.List<io.kubernetes.client.openapi.models.V1beta1ForZone> forZones);
  public A withForZones(io.kubernetes.client.openapi.models.V1beta1ForZone... forZones);
  public java.lang.Boolean hasForZones();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> addNewForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> addNewForZoneLike(io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> setNewForZoneLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1ForZone item);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editForZone(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editFirstForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editLastForZone();
  public io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<A> editMatchingForZone(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> predicate);
  public interface ForZonesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent.ForZonesNested<N>>{
    public N and();
    public N endForZone();
    
  }
  
}