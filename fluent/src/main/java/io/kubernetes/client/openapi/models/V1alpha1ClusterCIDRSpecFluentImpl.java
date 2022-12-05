package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ClusterCIDRSpecFluentImpl<A extends V1alpha1ClusterCIDRSpecFluent<A>> extends BaseFluent<A> implements V1alpha1ClusterCIDRSpecFluent<A>{
  public V1alpha1ClusterCIDRSpecFluentImpl() {
  }
  public V1alpha1ClusterCIDRSpecFluentImpl(V1alpha1ClusterCIDRSpec instance) {
    this.withIpv4(instance.getIpv4());

    this.withIpv6(instance.getIpv6());

    this.withNodeSelector(instance.getNodeSelector());

    this.withPerNodeHostBits(instance.getPerNodeHostBits());

  }
  private String ipv4;
  private String ipv6;
  private V1NodeSelectorBuilder nodeSelector;
  private Integer perNodeHostBits;
  public String getIpv4() {
    return this.ipv4;
  }
  public A withIpv4(String ipv4) {
    this.ipv4=ipv4; return (A) this;
  }
  public Boolean hasIpv4() {
    return this.ipv4 != null;
  }
  public String getIpv6() {
    return this.ipv6;
  }
  public A withIpv6(String ipv6) {
    this.ipv6=ipv6; return (A) this;
  }
  public Boolean hasIpv6() {
    return this.ipv6 != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNodeSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getNodeSelector() {
    return this.nodeSelector!=null ?this.nodeSelector.build():null;
  }
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector!=null ?this.nodeSelector.build():null;
  }
  public A withNodeSelector(V1NodeSelector nodeSelector) {
    _visitables.get("nodeSelector").remove(this.nodeSelector);
    if (nodeSelector!=null){ this.nodeSelector= new V1NodeSelectorBuilder(nodeSelector); _visitables.get("nodeSelector").add(this.nodeSelector);} else { this.nodeSelector = null; _visitables.get("nodeSelector").remove(this.nodeSelector); } return (A) this;
  }
  public Boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelector() {
    return new V1alpha1ClusterCIDRSpecFluentImpl.NodeSelectorNestedImpl();
  }
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new V1alpha1ClusterCIDRSpecFluentImpl.NodeSelectorNestedImpl(item);
  }
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editNodeSelector() {
    return withNewNodeSelectorLike(getNodeSelector());
  }
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelector() {
    return withNewNodeSelectorLike(getNodeSelector() != null ? getNodeSelector(): new V1NodeSelectorBuilder().build());
  }
  public V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return withNewNodeSelectorLike(getNodeSelector() != null ? getNodeSelector(): item);
  }
  public Integer getPerNodeHostBits() {
    return this.perNodeHostBits;
  }
  public A withPerNodeHostBits(Integer perNodeHostBits) {
    this.perNodeHostBits=perNodeHostBits; return (A) this;
  }
  public Boolean hasPerNodeHostBits() {
    return this.perNodeHostBits != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1ClusterCIDRSpecFluentImpl that = (V1alpha1ClusterCIDRSpecFluentImpl) o;
    if (ipv4 != null ? !ipv4.equals(that.ipv4) :that.ipv4 != null) return false;
    if (ipv6 != null ? !ipv6.equals(that.ipv6) :that.ipv6 != null) return false;
    if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
    if (perNodeHostBits != null ? !perNodeHostBits.equals(that.perNodeHostBits) :that.perNodeHostBits != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(ipv4,  ipv6,  nodeSelector,  perNodeHostBits,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ipv4 != null) { sb.append("ipv4:"); sb.append(ipv4 + ","); }
    if (ipv6 != null) { sb.append("ipv6:"); sb.append(ipv6 + ","); }
    if (nodeSelector != null) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (perNodeHostBits != null) { sb.append("perNodeHostBits:"); sb.append(perNodeHostBits); }
    sb.append("}");
    return sb.toString();
  }
  class NodeSelectorNestedImpl<N> extends V1NodeSelectorFluentImpl<V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<N>> implements V1alpha1ClusterCIDRSpecFluent.NodeSelectorNested<N>,Nested<N>{
    NodeSelectorNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    NodeSelectorNestedImpl() {
      this.builder = new V1NodeSelectorBuilder(this);
    }
    V1NodeSelectorBuilder builder;
    public N and() {
      return (N) V1alpha1ClusterCIDRSpecFluentImpl.this.withNodeSelector(builder.build());
    }
    public N endNodeSelector() {
      return and();
    }
    
  }
  
}