package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerImageFluentImpl<A extends V1ContainerImageFluent<A>> extends BaseFluent<A> implements V1ContainerImageFluent<A>{
  public V1ContainerImageFluentImpl() {
  }
  public V1ContainerImageFluentImpl(V1ContainerImage instance) {
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());

  }
  private List<String> names;
  private Long sizeBytes;
  public A addToNames(Integer index,String item) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    this.names.add(index, item);
    return (A)this;
  }
  public A setToNames(Integer index,String item) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    this.names.set(index, item); return (A)this;
  }
  public A addToNames(java.lang.String... items) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    for (String item : items) {this.names.add(item);} return (A)this;
  }
  public A addAllToNames(Collection<String> items) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    for (String item : items) {this.names.add(item);} return (A)this;
  }
  public A removeFromNames(java.lang.String... items) {
    for (String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
  }
  public A removeAllFromNames(Collection<String> items) {
    for (String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
  }
  public List<String> getNames() {
    return this.names;
  }
  public String getName(Integer index) {
    return this.names.get(index);
  }
  public String getFirstName() {
    return this.names.get(0);
  }
  public String getLastName() {
    return this.names.get(names.size() - 1);
  }
  public String getMatchingName(Predicate<String> predicate) {
    for (String item: names) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingName(Predicate<String> predicate) {
    for (String item: names) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNames(List<String> names) {
    if (names != null) {this.names = new ArrayList(); for (String item : names){this.addToNames(item);}} else { this.names = null;} return (A) this;
  }
  public A withNames(java.lang.String... names) {
    if (this.names != null) {this.names.clear();}
    if (names != null) {for (String item :names){ this.addToNames(item);}} return (A) this;
  }
  public Boolean hasNames() {
    return names != null && !names.isEmpty();
  }
  public Long getSizeBytes() {
    return this.sizeBytes;
  }
  public A withSizeBytes(Long sizeBytes) {
    this.sizeBytes=sizeBytes; return (A) this;
  }
  public Boolean hasSizeBytes() {
    return this.sizeBytes != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerImageFluentImpl that = (V1ContainerImageFluentImpl) o;
    if (names != null ? !names.equals(that.names) :that.names != null) return false;
    if (sizeBytes != null ? !sizeBytes.equals(that.sizeBytes) :that.sizeBytes != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(names,  sizeBytes,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (names != null && !names.isEmpty()) { sb.append("names:"); sb.append(names + ","); }
    if (sizeBytes != null) { sb.append("sizeBytes:"); sb.append(sizeBytes); }
    sb.append("}");
    return sb.toString();
  }
  
}