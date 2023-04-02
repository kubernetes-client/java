package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ClusterCIDRSpecFluent<A extends V1alpha1ClusterCIDRSpecFluent<A>> extends Fluent<A>{
  public String getIpv4();
  public A withIpv4(String ipv4);
  public Boolean hasIpv4();
  public String getIpv6();
  public A withIpv6(String ipv6);
  public Boolean hasIpv6();
  
  /**
   * This method has been deprecated, please use method buildNodeSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getNodeSelector();
  public V1NodeSelector buildNodeSelector();
  public A withNodeSelector(V1NodeSelector nodeSelector);
  public Boolean hasNodeSelector();
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelector();
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item);
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editNodeSelector();
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelector();
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item);
  public Integer getPerNodeHostBits();
  public A withPerNodeHostBits(Integer perNodeHostBits);
  public Boolean hasPerNodeHostBits();
  public interface NodeSelectorNested<N> extends Nested<N>,V1NodeSelectorFluent<V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<N>>{
    public N and();
    public N endNodeSelector();
    
  }
  
}