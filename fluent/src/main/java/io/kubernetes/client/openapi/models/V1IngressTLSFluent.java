package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressTLSFluent<A extends V1IngressTLSFluent<A>> extends BaseFluent<A>{
  public V1IngressTLSFluent() {
  }
  
  public V1IngressTLSFluent(V1IngressTLS instance) {
    this.copyInstance(instance);
  }
  private List<String> hosts;
  private String secretName;
  
  protected void copyInstance(V1IngressTLS instance) {
    instance = (instance != null ? instance : new V1IngressTLS());
    if (instance != null) {
          this.withHosts(instance.getHosts());
          this.withSecretName(instance.getSecretName());
        }
  }
  
  public A addToHosts(int index,String item) {
    if (this.hosts == null) {this.hosts = new ArrayList<String>();}
    this.hosts.add(index, item);
    return (A)this;
  }
  
  public A setToHosts(int index,String item) {
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
    if (this.hosts == null) return (A)this;
    for (String item : items) { this.hosts.remove(item);} return (A)this;
  }
  
  public A removeAllFromHosts(Collection<String> items) {
    if (this.hosts == null) return (A)this;
    for (String item : items) { this.hosts.remove(item);} return (A)this;
  }
  
  public List<String> getHosts() {
    return this.hosts;
  }
  
  public String getHost(int index) {
    return this.hosts.get(index);
  }
  
  public String getFirstHost() {
    return this.hosts.get(0);
  }
  
  public String getLastHost() {
    return this.hosts.get(hosts.size() - 1);
  }
  
  public String getMatchingHost(Predicate<String> predicate) {
      for (String item : hosts) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingHost(Predicate<String> predicate) {
      for (String item : hosts) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHosts(List<String> hosts) {
    if (hosts != null) {
        this.hosts = new ArrayList();
        for (String item : hosts) {
          this.addToHosts(item);
        }
    } else {
      this.hosts = null;
    }
    return (A) this;
  }
  
  public A withHosts(java.lang.String... hosts) {
    if (this.hosts != null) {
        this.hosts.clear();
        _visitables.remove("hosts");
    }
    if (hosts != null) {
      for (String item : hosts) {
        this.addToHosts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHosts() {
    return this.hosts != null && !this.hosts.isEmpty();
  }
  
  public String getSecretName() {
    return this.secretName;
  }
  
  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }
  
  public boolean hasSecretName() {
    return this.secretName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressTLSFluent that = (V1IngressTLSFluent) o;
    if (!java.util.Objects.equals(hosts, that.hosts)) return false;
    if (!java.util.Objects.equals(secretName, that.secretName)) return false;
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