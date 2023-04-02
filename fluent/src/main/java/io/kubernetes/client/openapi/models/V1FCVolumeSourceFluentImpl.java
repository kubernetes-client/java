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
  public class V1FCVolumeSourceFluentImpl<A extends V1FCVolumeSourceFluent<A>> extends BaseFluent<A> implements V1FCVolumeSourceFluent<A>{
  public V1FCVolumeSourceFluentImpl() {
  }
  public V1FCVolumeSourceFluentImpl(V1FCVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withLun(instance.getLun());

    this.withReadOnly(instance.getReadOnly());

    this.withTargetWWNs(instance.getTargetWWNs());

    this.withWwids(instance.getWwids());

  }
  private String fsType;
  private Integer lun;
  private Boolean readOnly;
  private List<String> targetWWNs;
  private List<String> wwids;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public Integer getLun() {
    return this.lun;
  }
  public A withLun(Integer lun) {
    this.lun=lun; return (A) this;
  }
  public Boolean hasLun() {
    return this.lun != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public A addToTargetWWNs(Integer index,String item) {
    if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
    this.targetWWNs.add(index, item);
    return (A)this;
  }
  public A setToTargetWWNs(Integer index,String item) {
    if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
    this.targetWWNs.set(index, item); return (A)this;
  }
  public A addToTargetWWNs(java.lang.String... items) {
    if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
    for (String item : items) {this.targetWWNs.add(item);} return (A)this;
  }
  public A addAllToTargetWWNs(Collection<String> items) {
    if (this.targetWWNs == null) {this.targetWWNs = new ArrayList<String>();}
    for (String item : items) {this.targetWWNs.add(item);} return (A)this;
  }
  public A removeFromTargetWWNs(java.lang.String... items) {
    for (String item : items) {if (this.targetWWNs!= null){ this.targetWWNs.remove(item);}} return (A)this;
  }
  public A removeAllFromTargetWWNs(Collection<String> items) {
    for (String item : items) {if (this.targetWWNs!= null){ this.targetWWNs.remove(item);}} return (A)this;
  }
  public List<String> getTargetWWNs() {
    return this.targetWWNs;
  }
  public String getTargetWWN(Integer index) {
    return this.targetWWNs.get(index);
  }
  public String getFirstTargetWWN() {
    return this.targetWWNs.get(0);
  }
  public String getLastTargetWWN() {
    return this.targetWWNs.get(targetWWNs.size() - 1);
  }
  public String getMatchingTargetWWN(Predicate<String> predicate) {
    for (String item: targetWWNs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingTargetWWN(Predicate<String> predicate) {
    for (String item: targetWWNs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTargetWWNs(List<String> targetWWNs) {
    if (targetWWNs != null) {this.targetWWNs = new ArrayList(); for (String item : targetWWNs){this.addToTargetWWNs(item);}} else { this.targetWWNs = null;} return (A) this;
  }
  public A withTargetWWNs(java.lang.String... targetWWNs) {
    if (this.targetWWNs != null) {this.targetWWNs.clear();}
    if (targetWWNs != null) {for (String item :targetWWNs){ this.addToTargetWWNs(item);}} return (A) this;
  }
  public Boolean hasTargetWWNs() {
    return targetWWNs != null && !targetWWNs.isEmpty();
  }
  public A addToWwids(Integer index,String item) {
    if (this.wwids == null) {this.wwids = new ArrayList<String>();}
    this.wwids.add(index, item);
    return (A)this;
  }
  public A setToWwids(Integer index,String item) {
    if (this.wwids == null) {this.wwids = new ArrayList<String>();}
    this.wwids.set(index, item); return (A)this;
  }
  public A addToWwids(java.lang.String... items) {
    if (this.wwids == null) {this.wwids = new ArrayList<String>();}
    for (String item : items) {this.wwids.add(item);} return (A)this;
  }
  public A addAllToWwids(Collection<String> items) {
    if (this.wwids == null) {this.wwids = new ArrayList<String>();}
    for (String item : items) {this.wwids.add(item);} return (A)this;
  }
  public A removeFromWwids(java.lang.String... items) {
    for (String item : items) {if (this.wwids!= null){ this.wwids.remove(item);}} return (A)this;
  }
  public A removeAllFromWwids(Collection<String> items) {
    for (String item : items) {if (this.wwids!= null){ this.wwids.remove(item);}} return (A)this;
  }
  public List<String> getWwids() {
    return this.wwids;
  }
  public String getWwid(Integer index) {
    return this.wwids.get(index);
  }
  public String getFirstWwid() {
    return this.wwids.get(0);
  }
  public String getLastWwid() {
    return this.wwids.get(wwids.size() - 1);
  }
  public String getMatchingWwid(Predicate<String> predicate) {
    for (String item: wwids) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingWwid(Predicate<String> predicate) {
    for (String item: wwids) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withWwids(List<String> wwids) {
    if (wwids != null) {this.wwids = new ArrayList(); for (String item : wwids){this.addToWwids(item);}} else { this.wwids = null;} return (A) this;
  }
  public A withWwids(java.lang.String... wwids) {
    if (this.wwids != null) {this.wwids.clear();}
    if (wwids != null) {for (String item :wwids){ this.addToWwids(item);}} return (A) this;
  }
  public Boolean hasWwids() {
    return wwids != null && !wwids.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FCVolumeSourceFluentImpl that = (V1FCVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (lun != null ? !lun.equals(that.lun) :that.lun != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (targetWWNs != null ? !targetWWNs.equals(that.targetWWNs) :that.targetWWNs != null) return false;
    if (wwids != null ? !wwids.equals(that.wwids) :that.wwids != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  lun,  readOnly,  targetWWNs,  wwids,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (lun != null) { sb.append("lun:"); sb.append(lun + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (targetWWNs != null && !targetWWNs.isEmpty()) { sb.append("targetWWNs:"); sb.append(targetWWNs + ","); }
    if (wwids != null && !wwids.isEmpty()) { sb.append("wwids:"); sb.append(wwids); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
}