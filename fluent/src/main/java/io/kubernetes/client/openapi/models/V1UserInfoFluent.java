package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1UserInfoFluent<A extends V1UserInfoFluent<A>> extends BaseFluent<A>{
  public V1UserInfoFluent() {
  }
  
  public V1UserInfoFluent(V1UserInfo instance) {
    this.copyInstance(instance);
  }
  private Map<String,List<String>> extra;
  private List<String> groups;
  private String uid;
  private String username;
  
  protected void copyInstance(V1UserInfo instance) {
    instance = (instance != null ? instance : new V1UserInfo());
    if (instance != null) {
          this.withExtra(instance.getExtra());
          this.withGroups(instance.getGroups());
          this.withUid(instance.getUid());
          this.withUsername(instance.getUsername());
        }
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
    V1UserInfoFluent that = (V1UserInfoFluent) o;
    if (!java.util.Objects.equals(extra, that.extra)) return false;
    if (!java.util.Objects.equals(groups, that.groups)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
    if (!java.util.Objects.equals(username, that.username)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(extra,  groups,  uid,  username,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (extra != null && !extra.isEmpty()) { sb.append("extra:"); sb.append(extra + ","); }
    if (groups != null && !groups.isEmpty()) { sb.append("groups:"); sb.append(groups + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid + ","); }
    if (username != null) { sb.append("username:"); sb.append(username); }
    sb.append("}");
    return sb.toString();
  }
  

}