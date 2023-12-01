package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1ClusterCIDRSpecFluent<A extends V1alpha1ClusterCIDRSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1ClusterCIDRSpecFluent() {
  }
  
  public V1alpha1ClusterCIDRSpecFluent(V1alpha1ClusterCIDRSpec instance) {
    this.copyInstance(instance);
  }
  private String ipv4;
  private String ipv6;
  private V1NodeSelectorBuilder nodeSelector;
  private Integer perNodeHostBits;
  
  protected void copyInstance(V1alpha1ClusterCIDRSpec instance) {
    instance = (instance != null ? instance : new V1alpha1ClusterCIDRSpec());
    if (instance != null) {
          this.withIpv4(instance.getIpv4());
          this.withIpv6(instance.getIpv6());
          this.withNodeSelector(instance.getNodeSelector());
          this.withPerNodeHostBits(instance.getPerNodeHostBits());
        }
  }
  
  public String getIpv4() {
    return this.ipv4;
  }
  
  public A withIpv4(String ipv4) {
    this.ipv4 = ipv4;
    return (A) this;
  }
  
  public boolean hasIpv4() {
    return this.ipv4 != null;
  }
  
  public String getIpv6() {
    return this.ipv6;
  }
  
  public A withIpv6(String ipv6) {
    this.ipv6 = ipv6;
    return (A) this;
  }
  
  public boolean hasIpv6() {
    return this.ipv6 != null;
  }
  
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector != null ? this.nodeSelector.build() : null;
  }
  
  public A withNodeSelector(V1NodeSelector nodeSelector) {
    this._visitables.remove("nodeSelector");
    if (nodeSelector != null) {
        this.nodeSelector = new V1NodeSelectorBuilder(nodeSelector);
        this._visitables.get("nodeSelector").add(this.nodeSelector);
    } else {
        this.nodeSelector = null;
        this._visitables.get("nodeSelector").remove(this.nodeSelector);
    }
    return (A) this;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public NodeSelectorNested<A> withNewNodeSelector() {
    return new NodeSelectorNested(null);
  }
  
  public NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new NodeSelectorNested(item);
  }
  
  public NodeSelectorNested<A> editNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(null));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(item));
  }
  
  public Integer getPerNodeHostBits() {
    return this.perNodeHostBits;
  }
  
  public A withPerNodeHostBits(Integer perNodeHostBits) {
    this.perNodeHostBits = perNodeHostBits;
    return (A) this;
  }
  
  public boolean hasPerNodeHostBits() {
    return this.perNodeHostBits != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ClusterCIDRSpecFluent that = (V1alpha1ClusterCIDRSpecFluent) o;
    if (!java.util.Objects.equals(ipv4, that.ipv4)) return false;
    if (!java.util.Objects.equals(ipv6, that.ipv6)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(perNodeHostBits, that.perNodeHostBits)) return false;
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
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha1ClusterCIDRSpecFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  
  }

}