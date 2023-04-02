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
  public class V1IngressTLSFluentImpl<A extends V1IngressTLSFluent<A>> extends BaseFluent<A> implements V1IngressTLSFluent<A>{
  public V1IngressTLSFluentImpl() {
  }
  public V1IngressTLSFluentImpl(V1IngressTLS instance) {
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());

  }
  private List<String> hosts;
  private String secretName;
  public A addToHosts(Integer index,String item) {
    if (this.hosts == null) {this.hosts = new ArrayList<String>();}
    this.hosts.add(index, item);
    return (A)this;
  }
  public A setToHosts(Integer index,String item) {
    if (this.hosts == null) {this.hosts = new ArrayList<String>();}
    this.hosts.set(index, item); return (A)this;
  }
  public A addToHosts(java.lang.String... items) {
    if (this.hosts == null) {this.hosts = new ArrayList<String>();}
    for (String item : items) {this.hosts.add(item);} return (A)this;
  }
  public A addAllToHosts(Collection<String> items) {
    if (this.hosts == null) {this.hosts = new ArrayList<String>();}
    for (String item : items) {this.hosts.add(item);} return (A)this;
  }
  public A removeFromHosts(java.lang.String... items) {
    for (String item : items) {if (this.hosts!= null){ this.hosts.remove(item);}} return (A)this;
  }
  public A removeAllFromHosts(Collection<String> items) {
    for (String item : items) {if (this.hosts!= null){ this.hosts.remove(item);}} return (A)this;
  }
  public List<String> getHosts() {
    return this.hosts;
  }
  public String getHost(Integer index) {
    return this.hosts.get(index);
  }
  public String getFirstHost() {
    return this.hosts.get(0);
  }
  public String getLastHost() {
    return this.hosts.get(hosts.size() - 1);
  }
  public String getMatchingHost(Predicate<String> predicate) {
    for (String item: hosts) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingHost(Predicate<String> predicate) {
    for (String item: hosts) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withHosts(List<String> hosts) {
    if (hosts != null) {this.hosts = new ArrayList(); for (String item : hosts){this.addToHosts(item);}} else { this.hosts = null;} return (A) this;
  }
  public A withHosts(java.lang.String... hosts) {
    if (this.hosts != null) {this.hosts.clear();}
    if (hosts != null) {for (String item :hosts){ this.addToHosts(item);}} return (A) this;
  }
  public Boolean hasHosts() {
    return hosts != null && !hosts.isEmpty();
  }
  public String getSecretName() {
    return this.secretName;
  }
  public A withSecretName(String secretName) {
    this.secretName=secretName; return (A) this;
  }
  public Boolean hasSecretName() {
    return this.secretName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressTLSFluentImpl that = (V1IngressTLSFluentImpl) o;
    if (hosts != null ? !hosts.equals(that.hosts) :that.hosts != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) :that.secretName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hosts,  secretName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hosts != null && !hosts.isEmpty()) { sb.append("hosts:"); sb.append(hosts + ","); }
    if (secretName != null) { sb.append("secretName:"); sb.append(secretName); }
    sb.append("}");
    return sb.toString();
  }
  
}