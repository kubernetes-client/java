package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FCVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String fsType;
  private Integer lun;
  private Boolean readOnly;
  private List<String> targetWWNs;
  private List<String> wwids;

  public V1FCVolumeSourceFluent() {
  }
  
  public V1FCVolumeSourceFluent(V1FCVolumeSource instance) {
    this.copyInstance(instance);
  }

  public A addAllToTargetWWNs(Collection<String> items) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList();
    }
    for (String item : items) {
      this.targetWWNs.add(item);
    }
    return (A) this;
  }
  
  public A addAllToWwids(Collection<String> items) {
    if (this.wwids == null) {
      this.wwids = new ArrayList();
    }
    for (String item : items) {
      this.wwids.add(item);
    }
    return (A) this;
  }
  
  public A addToTargetWWNs(String... items) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList();
    }
    for (String item : items) {
      this.targetWWNs.add(item);
    }
    return (A) this;
  }
  
  public A addToTargetWWNs(int index,String item) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList();
    }
    this.targetWWNs.add(index, item);
    return (A) this;
  }
  
  public A addToWwids(String... items) {
    if (this.wwids == null) {
      this.wwids = new ArrayList();
    }
    for (String item : items) {
      this.wwids.add(item);
    }
    return (A) this;
  }
  
  public A addToWwids(int index,String item) {
    if (this.wwids == null) {
      this.wwids = new ArrayList();
    }
    this.wwids.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1FCVolumeSource instance) {
    instance = instance != null ? instance : new V1FCVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withLun(instance.getLun());
        this.withReadOnly(instance.getReadOnly());
        this.withTargetWWNs(instance.getTargetWWNs());
        this.withWwids(instance.getWwids());
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
    V1FCVolumeSourceFluent that = (V1FCVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(lun, that.lun))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(targetWWNs, that.targetWWNs))) {
      return false;
    }
    if (!(Objects.equals(wwids, that.wwids))) {
      return false;
    }
    return true;
  }
  
  public String getFirstTargetWWN() {
    return this.targetWWNs.get(0);
  }
  
  public String getFirstWwid() {
    return this.wwids.get(0);
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public String getLastTargetWWN() {
    return this.targetWWNs.get(targetWWNs.size() - 1);
  }
  
  public String getLastWwid() {
    return this.wwids.get(wwids.size() - 1);
  }
  
  public Integer getLun() {
    return this.lun;
  }
  
  public String getMatchingTargetWWN(Predicate<String> predicate) {
      for (String item : targetWWNs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingWwid(Predicate<String> predicate) {
      for (String item : wwids) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getTargetWWN(int index) {
    return this.targetWWNs.get(index);
  }
  
  public List<String> getTargetWWNs() {
    return this.targetWWNs;
  }
  
  public String getWwid(int index) {
    return this.wwids.get(index);
  }
  
  public List<String> getWwids() {
    return this.wwids;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasLun() {
    return this.lun != null;
  }
  
  public boolean hasMatchingTargetWWN(Predicate<String> predicate) {
      for (String item : targetWWNs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingWwid(Predicate<String> predicate) {
      for (String item : wwids) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasTargetWWNs() {
    return this.targetWWNs != null && !(this.targetWWNs.isEmpty());
  }
  
  public boolean hasWwids() {
    return this.wwids != null && !(this.wwids.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs, wwids);
  }
  
  public A removeAllFromTargetWWNs(Collection<String> items) {
    if (this.targetWWNs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.targetWWNs.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromWwids(Collection<String> items) {
    if (this.wwids == null) {
      return (A) this;
    }
    for (String item : items) {
      this.wwids.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromTargetWWNs(String... items) {
    if (this.targetWWNs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.targetWWNs.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromWwids(String... items) {
    if (this.wwids == null) {
      return (A) this;
    }
    for (String item : items) {
      this.wwids.remove(item);
    }
    return (A) this;
  }
  
  public A setToTargetWWNs(int index,String item) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList();
    }
    this.targetWWNs.set(index, item);
    return (A) this;
  }
  
  public A setToWwids(int index,String item) {
    if (this.wwids == null) {
      this.wwids = new ArrayList();
    }
    this.wwids.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(lun == null)) {
        sb.append("lun:");
        sb.append(lun);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(targetWWNs == null) && !(targetWWNs.isEmpty())) {
        sb.append("targetWWNs:");
        sb.append(targetWWNs);
        sb.append(",");
    }
    if (!(wwids == null) && !(wwids.isEmpty())) {
        sb.append("wwids:");
        sb.append(wwids);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public A withLun(Integer lun) {
    this.lun = lun;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withTargetWWNs(List<String> targetWWNs) {
    if (targetWWNs != null) {
        this.targetWWNs = new ArrayList();
        for (String item : targetWWNs) {
          this.addToTargetWWNs(item);
        }
    } else {
      this.targetWWNs = null;
    }
    return (A) this;
  }
  
  public A withTargetWWNs(String... targetWWNs) {
    if (this.targetWWNs != null) {
        this.targetWWNs.clear();
        _visitables.remove("targetWWNs");
    }
    if (targetWWNs != null) {
      for (String item : targetWWNs) {
        this.addToTargetWWNs(item);
      }
    }
    return (A) this;
  }
  
  public A withWwids(List<String> wwids) {
    if (wwids != null) {
        this.wwids = new ArrayList();
        for (String item : wwids) {
          this.addToWwids(item);
        }
    } else {
      this.wwids = null;
    }
    return (A) this;
  }
  
  public A withWwids(String... wwids) {
    if (this.wwids != null) {
        this.wwids.clear();
        _visitables.remove("wwids");
    }
    if (wwids != null) {
      for (String item : wwids) {
        this.addToWwids(item);
      }
    }
    return (A) this;
  }
  
}