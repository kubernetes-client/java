package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LinuxContainerUserFluent<A extends io.kubernetes.client.openapi.models.V1LinuxContainerUserFluent<A>> extends BaseFluent<A>{
  public V1LinuxContainerUserFluent() {
  }
  
  public V1LinuxContainerUserFluent(V1LinuxContainerUser instance) {
    this.copyInstance(instance);
  }
  private Long gid;
  private List<Long> supplementalGroups;
  private Long uid;
  
  protected void copyInstance(V1LinuxContainerUser instance) {
    instance = instance != null ? instance : new V1LinuxContainerUser();
    if (instance != null) {
        this.withGid(instance.getGid());
        this.withSupplementalGroups(instance.getSupplementalGroups());
        this.withUid(instance.getUid());
    }
  }
  
  public Long getGid() {
    return this.gid;
  }
  
  public A withGid(Long gid) {
    this.gid = gid;
    return (A) this;
  }
  
  public boolean hasGid() {
    return this.gid != null;
  }
  
  public A addToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList();
    }
    this.supplementalGroups.add(index, item);
    return (A) this;
  }
  
  public A setToSupplementalGroups(int index,Long item) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList();
    }
    this.supplementalGroups.set(index, item);
    return (A) this;
  }
  
  public A addToSupplementalGroups(Long... items) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList();
    }
    for (Long item : items) {
      this.supplementalGroups.add(item);
    }
    return (A) this;
  }
  
  public A addAllToSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList();
    }
    for (Long item : items) {
      this.supplementalGroups.add(item);
    }
    return (A) this;
  }
  
  public A removeFromSupplementalGroups(Long... items) {
    if (this.supplementalGroups == null) {
      return (A) this;
    }
    for (Long item : items) {
      this.supplementalGroups.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromSupplementalGroups(Collection<Long> items) {
    if (this.supplementalGroups == null) {
      return (A) this;
    }
    for (Long item : items) {
      this.supplementalGroups.remove(item);
    }
    return (A) this;
  }
  
  public List<Long> getSupplementalGroups() {
    return this.supplementalGroups;
  }
  
  public Long getSupplementalGroup(int index) {
    return this.supplementalGroups.get(index);
  }
  
  public Long getFirstSupplementalGroup() {
    return this.supplementalGroups.get(0);
  }
  
  public Long getLastSupplementalGroup() {
    return this.supplementalGroups.get(supplementalGroups.size() - 1);
  }
  
  public Long getMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingSupplementalGroup(Predicate<Long> predicate) {
      for (Long item : supplementalGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSupplementalGroups(List<Long> supplementalGroups) {
    if (supplementalGroups != null) {
        this.supplementalGroups = new ArrayList();
        for (Long item : supplementalGroups) {
          this.addToSupplementalGroups(item);
        }
    } else {
      this.supplementalGroups = null;
    }
    return (A) this;
  }
  
  public A withSupplementalGroups(Long... supplementalGroups) {
    if (this.supplementalGroups != null) {
        this.supplementalGroups.clear();
        _visitables.remove("supplementalGroups");
    }
    if (supplementalGroups != null) {
      for (Long item : supplementalGroups) {
        this.addToSupplementalGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSupplementalGroups() {
    return this.supplementalGroups != null && !(this.supplementalGroups.isEmpty());
  }
  
  public Long getUid() {
    return this.uid;
  }
  
  public A withUid(Long uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
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
    V1LinuxContainerUserFluent that = (V1LinuxContainerUserFluent) o;
    if (!(Objects.equals(gid, that.gid))) {
      return false;
    }
    if (!(Objects.equals(supplementalGroups, that.supplementalGroups))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(gid, supplementalGroups, uid);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(gid == null)) {
        sb.append("gid:");
        sb.append(gid);
        sb.append(",");
    }
    if (!(supplementalGroups == null) && !(supplementalGroups.isEmpty())) {
        sb.append("supplementalGroups:");
        sb.append(supplementalGroups);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  

}