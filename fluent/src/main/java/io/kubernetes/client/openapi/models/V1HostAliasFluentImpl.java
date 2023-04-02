package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1HostAliasFluentImpl<A extends V1HostAliasFluent<A>> extends BaseFluent<A> implements V1HostAliasFluent<A>{
  public V1HostAliasFluentImpl() {
  }
  public V1HostAliasFluentImpl(V1HostAlias instance) {
    this.withHostnames(instance.getHostnames());

    this.withIp(instance.getIp());

  }
  private List<String> hostnames;
  private String ip;
  public A addToHostnames(Integer index,String item) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    this.hostnames.add(index, item);
    return (A)this;
  }
  public A setToHostnames(Integer index,String item) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    this.hostnames.set(index, item); return (A)this;
  }
  public A addToHostnames(java.lang.String... items) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    for (String item : items) {this.hostnames.add(item);} return (A)this;
  }
  public A addAllToHostnames(Collection<String> items) {
    if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
    for (String item : items) {this.hostnames.add(item);} return (A)this;
  }
  public A removeFromHostnames(java.lang.String... items) {
    for (String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
  }
  public A removeAllFromHostnames(Collection<String> items) {
    for (String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
  }
  public List<String> getHostnames() {
    return this.hostnames;
  }
  public String getHostname(Integer index) {
    return this.hostnames.get(index);
  }
  public String getFirstHostname() {
    return this.hostnames.get(0);
  }
  public String getLastHostname() {
    return this.hostnames.get(hostnames.size() - 1);
  }
  public String getMatchingHostname(Predicate<String> predicate) {
    for (String item: hostnames) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingHostname(Predicate<String> predicate) {
    for (String item: hostnames) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withHostnames(List<String> hostnames) {
    if (hostnames != null) {this.hostnames = new ArrayList(); for (String item : hostnames){this.addToHostnames(item);}} else { this.hostnames = null;} return (A) this;
  }
  public A withHostnames(java.lang.String... hostnames) {
    if (this.hostnames != null) {this.hostnames.clear();}
    if (hostnames != null) {for (String item :hostnames){ this.addToHostnames(item);}} return (A) this;
  }
  public Boolean hasHostnames() {
    return hostnames != null && !hostnames.isEmpty();
  }
  public String getIp() {
    return this.ip;
  }
  public A withIp(String ip) {
    this.ip=ip; return (A) this;
  }
  public Boolean hasIp() {
    return this.ip != null;
  }
  public boolean equals(Object o) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hostnames != null && !hostnames.isEmpty()) { sb.append("hostnames:"); sb.append(hostnames + ","); }
    if (ip != null) { sb.append("ip:"); sb.append(ip); }
    sb.append("}");
    return sb.toString();
  }
  
}