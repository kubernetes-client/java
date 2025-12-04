package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CertificateSigningRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpecFluent<A>> extends BaseFluent<A>{

  private Integer expirationSeconds;
  private Map<String,List<String>> extra;
  private List<String> groups;
  private List<Byte> request;
  private String signerName;
  private String uid;
  private List<String> usages;
  private String username;

  public V1CertificateSigningRequestSpecFluent() {
  }
  
  public V1CertificateSigningRequestSpecFluent(V1CertificateSigningRequestSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToGroups(Collection<String> items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }
  
  public A addAllToRequest(Collection<Byte> items) {
    if (this.request == null) {
      this.request = new ArrayList();
    }
    for (Byte item : items) {
      this.request.add(item);
    }
    return (A) this;
  }
  
  public A addAllToUsages(Collection<String> items) {
    if (this.usages == null) {
      this.usages = new ArrayList();
    }
    for (String item : items) {
      this.usages.add(item);
    }
    return (A) this;
  }
  
  public A addToExtra(Map<String,List<String>> map) {
    if (this.extra == null && map != null) {
      this.extra = new LinkedHashMap();
    }
    if (map != null) {
      this.extra.putAll(map);
    }
    return (A) this;
  }
  
  public A addToExtra(String key,List<String> value) {
    if (this.extra == null && key != null && value != null) {
      this.extra = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.extra.put(key, value);
    }
    return (A) this;
  }
  
  public A addToGroups(String... items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }
  
  public A addToGroups(int index,String item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    this.groups.add(index, item);
    return (A) this;
  }
  
  public A addToRequest(Byte... items) {
    if (this.request == null) {
      this.request = new ArrayList();
    }
    for (Byte item : items) {
      this.request.add(item);
    }
    return (A) this;
  }
  
  public A addToRequest(int index,Byte item) {
    if (this.request == null) {
      this.request = new ArrayList();
    }
    this.request.add(index, item);
    return (A) this;
  }
  
  public A addToUsages(String... items) {
    if (this.usages == null) {
      this.usages = new ArrayList();
    }
    for (String item : items) {
      this.usages.add(item);
    }
    return (A) this;
  }
  
  public A addToUsages(int index,String item) {
    if (this.usages == null) {
      this.usages = new ArrayList();
    }
    this.usages.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1CertificateSigningRequestSpec instance) {
    instance = instance != null ? instance : new V1CertificateSigningRequestSpec();
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
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1CertificateSigningRequestSpecFluent that = (V1CertificateSigningRequestSpecFluent) o;
    if (!(Objects.equals(expirationSeconds, that.expirationSeconds))) {
      return false;
    }
    if (!(Objects.equals(extra, that.extra))) {
      return false;
    }
    if (!(Objects.equals(groups, that.groups))) {
      return false;
    }
    if (!(Objects.equals(request, that.request))) {
      return false;
    }
    if (!(Objects.equals(signerName, that.signerName))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    if (!(Objects.equals(usages, that.usages))) {
      return false;
    }
    if (!(Objects.equals(username, that.username))) {
      return false;
    }
    return true;
  }
  
  public Integer getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public Map<String,List<String>> getExtra() {
    return this.extra;
  }
  
  public String getFirstGroup() {
    return this.groups.get(0);
  }
  
  public String getFirstUsage() {
    return this.usages.get(0);
  }
  
  public String getGroup(int index) {
    return this.groups.get(index);
  }
  
  public List<String> getGroups() {
    return this.groups;
  }
  
  public String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }
  
  public String getLastUsage() {
    return this.usages.get(usages.size() - 1);
  }
  
  public String getMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingUsage(Predicate<String> predicate) {
      for (String item : usages) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public byte[] getRequest() {
    int size = request != null ? request.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : request) {
      result[index++] = item;
    }
    return result;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public String getUsage(int index) {
    return this.usages.get(index);
  }
  
  public List<String> getUsages() {
    return this.usages;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public boolean hasExtra() {
    return this.extra != null;
  }
  
  public boolean hasGroups() {
    return this.groups != null && !(this.groups.isEmpty());
  }
  
  public boolean hasMatchingGroup(Predicate<String> predicate) {
      for (String item : groups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingUsage(Predicate<String> predicate) {
      for (String item : usages) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasRequest() {
    return this.request != null && !(this.request.isEmpty());
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public boolean hasUsages() {
    return this.usages != null && !(this.usages.isEmpty());
  }
  
  public boolean hasUsername() {
    return this.username != null;
  }
  
  public int hashCode() {
    return Objects.hash(expirationSeconds, extra, groups, request, signerName, uid, usages, username);
  }
  
  public A removeAllFromGroups(Collection<String> items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.groups.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromRequest(Collection<Byte> items) {
    if (this.request == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.request.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromUsages(Collection<String> items) {
    if (this.usages == null) {
      return (A) this;
    }
    for (String item : items) {
      this.usages.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromExtra(String key) {
    if (this.extra == null) {
      return (A) this;
    }
    if (key != null && this.extra != null) {
      this.extra.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromExtra(Map<String,List<String>> map) {
    if (this.extra == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.extra != null) {
          this.extra.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public A removeFromGroups(String... items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (String item : items) {
      this.groups.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromRequest(Byte... items) {
    if (this.request == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.request.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromUsages(String... items) {
    if (this.usages == null) {
      return (A) this;
    }
    for (String item : items) {
      this.usages.remove(item);
    }
    return (A) this;
  }
  
  public A setToGroups(int index,String item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    this.groups.set(index, item);
    return (A) this;
  }
  
  public A setToRequest(int index,Byte item) {
    if (this.request == null) {
      this.request = new ArrayList();
    }
    this.request.set(index, item);
    return (A) this;
  }
  
  public A setToUsages(int index,String item) {
    if (this.usages == null) {
      this.usages = new ArrayList();
    }
    this.usages.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expirationSeconds == null)) {
        sb.append("expirationSeconds:");
        sb.append(expirationSeconds);
        sb.append(",");
    }
    if (!(extra == null) && !(extra.isEmpty())) {
        sb.append("extra:");
        sb.append(extra);
        sb.append(",");
    }
    if (!(groups == null) && !(groups.isEmpty())) {
        sb.append("groups:");
        sb.append(groups);
        sb.append(",");
    }
    if (!(request == null) && !(request.isEmpty())) {
        sb.append("request:");
        sb.append(request);
        sb.append(",");
    }
    if (!(signerName == null)) {
        sb.append("signerName:");
        sb.append(signerName);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
        sb.append(",");
    }
    if (!(usages == null) && !(usages.isEmpty())) {
        sb.append("usages:");
        sb.append(usages);
        sb.append(",");
    }
    if (!(username == null)) {
        sb.append("username:");
        sb.append(username);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public <K,V>A withExtra(Map<String,List<String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new LinkedHashMap(extra);
    }
    return (A) this;
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
  
  public A withGroups(String... groups) {
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
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
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
  
  public A withUsages(String... usages) {
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
  
  public A withUsername(String username) {
    this.username = username;
    return (A) this;
  }
  
}