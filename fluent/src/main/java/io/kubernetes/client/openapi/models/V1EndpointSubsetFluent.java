package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointSubsetFluent<A extends V1EndpointSubsetFluent<A>> extends Fluent<A>{
  public A addToAddresses(int index,V1EndpointAddress item);
  public A setToAddresses(int index,V1EndpointAddress item);
  public A addToAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
  public A addAllToAddresses(Collection<V1EndpointAddress> items);
  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
  public A removeAllFromAddresses(Collection<V1EndpointAddress> items);
  public A removeMatchingFromAddresses(Predicate<V1EndpointAddressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointAddress> getAddresses();
  public List<V1EndpointAddress> buildAddresses();
  public V1EndpointAddress buildAddress(int index);
  public V1EndpointAddress buildFirstAddress();
  public V1EndpointAddress buildLastAddress();
  public V1EndpointAddress buildMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public Boolean hasMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public A withAddresses(List<V1EndpointAddress> addresses);
  public A withAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... addresses);
  public Boolean hasAddresses();
  public V1EndpointSubsetFluent.AddressesNested<A> addNewAddress();
  public V1EndpointSubsetFluent.AddressesNested<A> addNewAddressLike(V1EndpointAddress item);
  public V1EndpointSubsetFluent.AddressesNested<A> setNewAddressLike(int index,V1EndpointAddress item);
  public V1EndpointSubsetFluent.AddressesNested<A> editAddress(int index);
  public V1EndpointSubsetFluent.AddressesNested<A> editFirstAddress();
  public V1EndpointSubsetFluent.AddressesNested<A> editLastAddress();
  public V1EndpointSubsetFluent.AddressesNested<A> editMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public A addToNotReadyAddresses(int index,V1EndpointAddress item);
  public A setToNotReadyAddresses(int index,V1EndpointAddress item);
  public A addToNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
  public A addAllToNotReadyAddresses(Collection<V1EndpointAddress> items);
  public A removeFromNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items);
  public A removeAllFromNotReadyAddresses(Collection<V1EndpointAddress> items);
  public A removeMatchingFromNotReadyAddresses(Predicate<V1EndpointAddressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNotReadyAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointAddress> getNotReadyAddresses();
  public List<V1EndpointAddress> buildNotReadyAddresses();
  public V1EndpointAddress buildNotReadyAddress(int index);
  public V1EndpointAddress buildFirstNotReadyAddress();
  public V1EndpointAddress buildLastNotReadyAddress();
  public V1EndpointAddress buildMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public Boolean hasMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public A withNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses);
  public A withNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... notReadyAddresses);
  public Boolean hasNotReadyAddresses();
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddress();
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> addNewNotReadyAddressLike(V1EndpointAddress item);
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,V1EndpointAddress item);
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> editNotReadyAddress(int index);
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> editFirstNotReadyAddress();
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> editLastNotReadyAddress();
  public V1EndpointSubsetFluent.NotReadyAddressesNested<A> editMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate);
  public A addToPorts(int index,CoreV1EndpointPort item);
  public A setToPorts(int index,CoreV1EndpointPort item);
  public A addToPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items);
  public A addAllToPorts(Collection<CoreV1EndpointPort> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items);
  public A removeAllFromPorts(Collection<CoreV1EndpointPort> items);
  public A removeMatchingFromPorts(Predicate<CoreV1EndpointPortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<CoreV1EndpointPort> getPorts();
  public List<CoreV1EndpointPort> buildPorts();
  public CoreV1EndpointPort buildPort(int index);
  public CoreV1EndpointPort buildFirstPort();
  public CoreV1EndpointPort buildLastPort();
  public CoreV1EndpointPort buildMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate);
  public A withPorts(List<CoreV1EndpointPort> ports);
  public A withPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... ports);
  public Boolean hasPorts();
  public V1EndpointSubsetFluent.PortsNested<A> addNewPort();
  public V1EndpointSubsetFluent.PortsNested<A> addNewPortLike(CoreV1EndpointPort item);
  public V1EndpointSubsetFluent.PortsNested<A> setNewPortLike(int index,CoreV1EndpointPort item);
  public V1EndpointSubsetFluent.PortsNested<A> editPort(int index);
  public V1EndpointSubsetFluent.PortsNested<A> editFirstPort();
  public V1EndpointSubsetFluent.PortsNested<A> editLastPort();
  public V1EndpointSubsetFluent.PortsNested<A> editMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate);
  public interface AddressesNested<N> extends Nested<N>,V1EndpointAddressFluent<V1EndpointSubsetFluent.AddressesNested<N>>{
    public N and();
    public N endAddress();
    
  }
  public interface NotReadyAddressesNested<N> extends Nested<N>,V1EndpointAddressFluent<V1EndpointSubsetFluent.NotReadyAddressesNested<N>>{
    public N and();
    public N endNotReadyAddress();
    
  }
  public interface PortsNested<N> extends Nested<N>,CoreV1EndpointPortFluent<V1EndpointSubsetFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}