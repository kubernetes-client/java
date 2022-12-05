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
  public class V1alpha1ServerStorageVersionFluentImpl<A extends V1alpha1ServerStorageVersionFluent<A>> extends BaseFluent<A> implements V1alpha1ServerStorageVersionFluent<A>{
  public V1alpha1ServerStorageVersionFluentImpl() {
  }
  public V1alpha1ServerStorageVersionFluentImpl(V1alpha1ServerStorageVersion instance) {
    this.withApiServerID(instance.getApiServerID());

    this.withDecodableVersions(instance.getDecodableVersions());

    this.withEncodingVersion(instance.getEncodingVersion());

  }
  private String apiServerID;
  private List<String> decodableVersions;
  private String encodingVersion;
  public String getApiServerID() {
    return this.apiServerID;
  }
  public A withApiServerID(String apiServerID) {
    this.apiServerID=apiServerID; return (A) this;
  }
  public Boolean hasApiServerID() {
    return this.apiServerID != null;
  }
  public A addToDecodableVersions(Integer index,String item) {
    if (this.decodableVersions == null) {this.decodableVersions = new ArrayList<String>();}
    this.decodableVersions.add(index, item);
    return (A)this;
  }
  public A setToDecodableVersions(Integer index,String item) {
    if (this.decodableVersions == null) {this.decodableVersions = new ArrayList<String>();}
    this.decodableVersions.set(index, item); return (A)this;
  }
  public A addToDecodableVersions(java.lang.String... items) {
    if (this.decodableVersions == null) {this.decodableVersions = new ArrayList<String>();}
    for (String item : items) {this.decodableVersions.add(item);} return (A)this;
  }
  public A addAllToDecodableVersions(Collection<String> items) {
    if (this.decodableVersions == null) {this.decodableVersions = new ArrayList<String>();}
    for (String item : items) {this.decodableVersions.add(item);} return (A)this;
  }
  public A removeFromDecodableVersions(java.lang.String... items) {
    for (String item : items) {if (this.decodableVersions!= null){ this.decodableVersions.remove(item);}} return (A)this;
  }
  public A removeAllFromDecodableVersions(Collection<String> items) {
    for (String item : items) {if (this.decodableVersions!= null){ this.decodableVersions.remove(item);}} return (A)this;
  }
  public List<String> getDecodableVersions() {
    return this.decodableVersions;
  }
  public String getDecodableVersion(Integer index) {
    return this.decodableVersions.get(index);
  }
  public String getFirstDecodableVersion() {
    return this.decodableVersions.get(0);
  }
  public String getLastDecodableVersion() {
    return this.decodableVersions.get(decodableVersions.size() - 1);
  }
  public String getMatchingDecodableVersion(Predicate<String> predicate) {
    for (String item: decodableVersions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingDecodableVersion(Predicate<String> predicate) {
    for (String item: decodableVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDecodableVersions(List<String> decodableVersions) {
    if (decodableVersions != null) {this.decodableVersions = new ArrayList(); for (String item : decodableVersions){this.addToDecodableVersions(item);}} else { this.decodableVersions = null;} return (A) this;
  }
  public A withDecodableVersions(java.lang.String... decodableVersions) {
    if (this.decodableVersions != null) {this.decodableVersions.clear();}
    if (decodableVersions != null) {for (String item :decodableVersions){ this.addToDecodableVersions(item);}} return (A) this;
  }
  public Boolean hasDecodableVersions() {
    return decodableVersions != null && !decodableVersions.isEmpty();
  }
  public String getEncodingVersion() {
    return this.encodingVersion;
  }
  public A withEncodingVersion(String encodingVersion) {
    this.encodingVersion=encodingVersion; return (A) this;
  }
  public Boolean hasEncodingVersion() {
    return this.encodingVersion != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1ServerStorageVersionFluentImpl that = (V1alpha1ServerStorageVersionFluentImpl) o;
    if (apiServerID != null ? !apiServerID.equals(that.apiServerID) :that.apiServerID != null) return false;
    if (decodableVersions != null ? !decodableVersions.equals(that.decodableVersions) :that.decodableVersions != null) return false;
    if (encodingVersion != null ? !encodingVersion.equals(that.encodingVersion) :that.encodingVersion != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiServerID,  decodableVersions,  encodingVersion,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiServerID != null) { sb.append("apiServerID:"); sb.append(apiServerID + ","); }
    if (decodableVersions != null && !decodableVersions.isEmpty()) { sb.append("decodableVersions:"); sb.append(decodableVersions + ","); }
    if (encodingVersion != null) { sb.append("encodingVersion:"); sb.append(encodingVersion); }
    sb.append("}");
    return sb.toString();
  }
  
}