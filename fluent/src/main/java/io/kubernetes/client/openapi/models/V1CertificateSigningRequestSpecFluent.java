package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CertificateSigningRequestSpecFluent<A extends V1CertificateSigningRequestSpecFluent<A>> extends BaseFluent<A>{
  public V1CertificateSigningRequestSpecFluent() {
  }
  
  public V1CertificateSigningRequestSpecFluent(V1CertificateSigningRequestSpec instance) {
    this.copyInstance(instance);
  }
  private Integer expirationSeconds;
  private Map<String,List<String>> extra;
  private List<String> groups;
  private List<Byte> request;
  private String signerName;
  private String uid;
  private List<String> usages;
  private String username;
  
  protected void copyInstance(V1CertificateSigningRequestSpec instance) {
    instance = (instance != null ? instance : new V1CertificateSigningRequestSpec());
    if (instance != null) {
          this.withExpirationSeconds(instance.getExpirationSeconds());
          this.withExtra(instance.getExtra());
          this.withGroups(instance.getGroups());
          this.withRequest(instance.getRequest());
          this.withSignerName(instance.getSignerName());
          this.withUid(instance.getUid());
          this.withUsages(instance.getUsages());
          this.withUsername(instance.getUsername());
        }
  }
  
  public Integer getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public A withExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public A addToExtra(String key,List<String> value) {
    if(this.extra == null && key != null && value != null) { this.extra = new LinkedHashMap(); }
    if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
  }
  
  public A addToExtra(Map<String,List<String>> map) {
    if(this.extra == null && map != null) { this.extra = new LinkedHashMap(); }
    if(map != null) { this.extra.putAll(map);} return (A)this;
  }
  
  public A removeFromExtra(String key) {
    if(this.extra == null) { return (A) this; }
    if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
  }
  
  public A removeFromExtra(Map<String,List<String>> map) {
    if(this.extra == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
  }
  
  public Map<String,List<String>> getExtra() {
    return this.extra;
  }
  
  public <K,V>A withExtra(Map<String,List<String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new LinkedHashMap(extra);
    }
    return (A) this;
  }
  
  public boolean hasExtra() {
    return this.extra != null;
  }
  
  public A addToGroups(int index,String item) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    this.groups.add(index, item);
    return (A)this;
  }
  
  public A setToGroups(int index,String item) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    this.groups.set(index, item); return (A)this;
  }
  
  public A addToGroups(java.lang.String... items) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    for (String item : items) {this.groups.add(item);} return (A)this;
  }
  
  public A addAllToGroups(Collection<String> items) {
    if (this.groups == null) {this.groups = new ArrayList<String>();}
    for (String item : items) {this.groups.add(item);} return (A)this;
  }
  
  public A removeFromGroups(java.lang.String... items) {
    if (this.groups == null) return (A)this;
    for (String item : items) { this.groups.remove(item);} return (A)this;
  }
  
  public A removeAllFromGroups(Collection<String> items) {
    if (this.groups == null) return (A)this;
    for (String item : items) { this.groups.remove(item);} return (A)this;
  }
  
  public List<String> getGroups() {
    return this.groups;
  }
  
  public String getGroup(int index) {
    return this.groups.get(index);
  }
  
  public String getFirstGroup() {
    return this.groups.get(0);
  }
  
  public String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }
  
  public String getMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withGroups(List<String> groups) {
    if (groups != null) {
        this.groups = new ArrayList();
        for (String item : groups) {
          this.addToGroups(item);
        }
    } else {
      this.groups = null;
    }
    return (A) this;
  }
  
  public A withGroups(java.lang.String... groups) {
    if (this.groups != null) {
        this.groups.clear();
        _visitables.remove("groups");
    }
    if (groups != null) {
      for (String item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasGroups() {
    return this.groups != null && !this.groups.isEmpty();
  }
  
  public A withRequest(byte... request) {
    if (this.request != null) {
        this.request.clear();
        _visitables.remove("request");
    }
    if (request != null) {
      for (byte item : request) {
        this.addToRequest(item);
      }
    }
    return (A) this;
  }
  
  public byte[] getRequest() {
    int size = request != null ? request.size() : 0;;
    byte[] result = new byte[size];;
    if (size == 0) {
      return result;
    }
    int index = 0;;
    for (byte item : request) {
      result[index++] = item;
    }
    return result;
  }
  
  public A addToRequest(int index,Byte item) {
    if (this.request == null) {this.request =  new ArrayList<Byte>();}
    this.request.add(index, item);
    return (A)this;
  }
  
  public A setToRequest(int index,Byte item) {
    if (this.request == null) {this.request =  new ArrayList<Byte>();}
    this.request.set(index, item); return (A)this;
  }
  
  public A addToRequest(java.lang.Byte... items) {
    if (this.request == null) {this.request =  new ArrayList<Byte>();}
    for (Byte item : items) {this.request.add(item);} return (A)this;
  }
  
  public A addAllToRequest(Collection<Byte> items) {
    if (this.request == null) {this.request =  new ArrayList<Byte>();}
    for (Byte item : items) {this.request.add(item);} return (A)this;
  }
  
  public A removeFromRequest(java.lang.Byte... items) {
    if (this.request == null) return (A)this;
    for (Byte item : items) { this.request.remove(item);} return (A)this;
  }
  
  public A removeAllFromRequest(Collection<Byte> items) {
    if (this.request == null) return (A)this;
    for (Byte item : items) { this.request.remove(item);} return (A)this;
  }
  
  public boolean hasRequest() {
    return this.request != null && !this.request.isEmpty();
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public A addToUsages(int index,String item) {
    if (this.usages == null) {this.usages = new ArrayList<String>();}
    this.usages.add(index, item);
    return (A)this;
  }
  
  public A setToUsages(int index,String item) {
    if (this.usages == null) {this.usages = new ArrayList<String>();}
    this.usages.set(index, item); return (A)this;
  }
  
  public A addToUsages(java.lang.String... items) {
    if (this.usages == null) {this.usages = new ArrayList<String>();}
    for (String item : items) {this.usages.add(item);} return (A)this;
  }
  
  public A addAllToUsages(Collection<String> items) {
    if (this.usages == null) {this.usages = new ArrayList<String>();}
    for (String item : items) {this.usages.add(item);} return (A)this;
  }
  
  public A removeFromUsages(java.lang.String... items) {
    if (this.usages == null) return (A)this;
    for (String item : items) { this.usages.remove(item);} return (A)this;
  }
  
  public A removeAllFromUsages(Collection<String> items) {
    if (this.usages == null) return (A)this;
    for (String item : items) { this.usages.remove(item);} return (A)this;
  }
  
  public List<String> getUsages() {
    return this.usages;
  }
  
  public String getUsage(int index) {
    return this.usages.get(index);
  }
  
  public String getFirstUsage() {
    return this.usages.get(0);
  }
  
  public String getLastUsage() {
    return this.usages.get(usages.size() - 1);
  }
  
  public String getMatchingUsage(Predicate<String> predicate) {
      for (String item : usages) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingUsage(Predicate<String> predicate) {
      for (String item : usages) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withUsages(List<String> usages) {
    if (usages != null) {
        this.usages = new ArrayList();
        for (String item : usages) {
          this.addToUsages(item);
        }
    } else {
      this.usages = null;
    }
    return (A) this;
  }
  
  public A withUsages(java.lang.String... usages) {
    if (this.usages != null) {
        this.usages.clear();
        _visitables.remove("usages");
    }
    if (usages != null) {
      for (String item : usages) {
        this.addToUsages(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasUsages() {
    return this.usages != null && !this.usages.isEmpty();
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public A withUsername(String username) {
    this.username = username;
    return (A) this;
  }
  
  public boolean hasUsername() {
    return this.username != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CertificateSigningRequestSpecFluent that = (V1CertificateSigningRequestSpecFluent) o;
    if (!java.util.Objects.equals(expirationSeconds, that.expirationSeconds)) return false;
    if (!java.util.Objects.equals(extra, that.extra)) return false;
    if (!java.util.Objects.equals(groups, that.groups)) return false;
    if (!java.util.Objects.equals(request, that.request)) return false;
    if (!java.util.Objects.equals(signerName, that.signerName)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
    if (!java.util.Objects.equals(usages, that.usages)) return false;
    if (!java.util.Objects.equals(username, that.username)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(expirationSeconds,  extra,  groups,  request,  signerName,  uid,  usages,  username,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expirationSeconds != null) { sb.append("expirationSeconds:"); sb.append(expirationSeconds + ","); }
    if (extra != null && !extra.isEmpty()) { sb.append("extra:"); sb.append(extra + ","); }
    if (groups != null && !groups.isEmpty()) { sb.append("groups:"); sb.append(groups + ","); }
    if (request != null && !request.isEmpty()) { sb.append("request:"); sb.append(request + ","); }
    if (signerName != null) { sb.append("signerName:"); sb.append(signerName + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid + ","); }
    if (usages != null && !usages.isEmpty()) { sb.append("usages:"); sb.append(usages + ","); }
    if (username != null) { sb.append("username:"); sb.append(username); }
    sb.append("}");
    return sb.toString();
  }
  

}