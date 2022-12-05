package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointAddressFluent<A extends V1EndpointAddressFluent<A>> extends Fluent<A>{
  public String getHostname();
  public A withHostname(String hostname);
  public Boolean hasHostname();
  public String getIp();
  public A withIp(String ip);
  public Boolean hasIp();
  public String getNodeName();
  public A withNodeName(String nodeName);
  public Boolean hasNodeName();
  
  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef();
  public V1ObjectReference buildTargetRef();
  public A withTargetRef(V1ObjectReference targetRef);
  public Boolean hasTargetRef();
  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef();
  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item);
  public V1EndpointAddressFluent.TargetRefNested<A> editTargetRef();
  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef();
  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item);
  public interface TargetRefNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1EndpointAddressFluent.TargetRefNested<N>>{
    public N and();
    public N endTargetRef();
    
  }
  
}