package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1HostAliasFluentImpl<A extends io.kubernetes.client.openapi.models.V1HostAliasFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HostAliasFluent<A>{
  public V1HostAliasFluentImpl() {
  }
  public V1HostAliasFluentImpl(io.kubernetes.client.openapi.models.V1HostAlias instance) {
    this.withHostnames(instance.getHostnames());

    this.withIp(instance.getIp());

  }
  private java.util.List<java.lang.String> hostnames;
  private java.lang.String ip;
  public A addToHostnames(java.lang.Integer index,java.lang.String item) {
    if (this.hostnames == null) {this.hostnames = new java.util.ArrayList<java.lang.String>();}
    this.hostnames.add(index, item);
    return (A)this;
  }
  public A setToHostnames(java.lang.Integer index,java.lang.String item) {
    if (this.hostnames == null) {this.hostnames = new java.util.ArrayList<java.lang.String>();}
    this.hostnames.set(index, item); return (A)this;
  }
  public A addToHostnames(java.lang.String... items) {
    if (this.hostnames == null) {this.hostnames = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.hostnames.add(item);} return (A)this;
  }
  public A addAllToHostnames(java.util.Collection<java.lang.String> items) {
    if (this.hostnames == null) {this.hostnames = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.hostnames.add(item);} return (A)this;
  }
  public A removeFromHostnames(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
  }
  public A removeAllFromHostnames(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getHostnames() {
    return this.hostnames;
  }
  public java.lang.String getHostname(java.lang.Integer index) {
    return this.hostnames.get(index);
  }
  public java.lang.String getFirstHostname() {
    return this.hostnames.get(0);
  }
  public java.lang.String getLastHostname() {
    return this.hostnames.get(hostnames.size() - 1);
  }
  public java.lang.String getMatchingHostname(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: hostnames) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingHostname(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: hostnames) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withHostnames(java.util.List<java.lang.String> hostnames) {
    if (hostnames != null) {this.hostnames = new java.util.ArrayList(); for (java.lang.String item : hostnames){this.addToHostnames(item);}} else { this.hostnames = null;} return (A) this;
  }
  public A withHostnames(java.lang.String... hostnames) {
    if (this.hostnames != null) {this.hostnames.clear();}
    if (hostnames != null) {for (java.lang.String item :hostnames){ this.addToHostnames(item);}} return (A) this;
  }
  public java.lang.Boolean hasHostnames() {
    return hostnames != null && !hostnames.isEmpty();
  }
  public A addNewHostname(java.lang.String arg0) {
    return (A)addToHostnames(new String(arg0));
  }
  public java.lang.String getIp() {
    return this.ip;
  }
  public A withIp(java.lang.String ip) {
    this.ip=ip; return (A) this;
  }
  public java.lang.Boolean hasIp() {
    return this.ip != null;
  }
  
  /**
   * Method is deprecated. use withIp instead.
   */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String arg0) {
    return (A)withIp(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HostAliasFluentImpl that = (V1HostAliasFluentImpl) o;
    if (hostnames != null ? !hostnames.equals(that.hostnames) :that.hostnames != null) return false;
    if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hostnames,  ip,  super.hashCode());
  }
  
}