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
  public class V1IPBlockFluentImpl<A extends V1IPBlockFluent<A>> extends BaseFluent<A> implements V1IPBlockFluent<A>{
  public V1IPBlockFluentImpl() {
  }
  public V1IPBlockFluentImpl(V1IPBlock instance) {
    this.withCidr(instance.getCidr());

    this.withExcept(instance.getExcept());

  }
  private String cidr;
  private List<String> except;
  public String getCidr() {
    return this.cidr;
  }
  public A withCidr(String cidr) {
    this.cidr=cidr; return (A) this;
  }
  public Boolean hasCidr() {
    return this.cidr != null;
  }
  public A addToExcept(Integer index,String item) {
    if (this.except == null) {this.except = new ArrayList<String>();}
    this.except.add(index, item);
    return (A)this;
  }
  public A setToExcept(Integer index,String item) {
    if (this.except == null) {this.except = new ArrayList<String>();}
    this.except.set(index, item); return (A)this;
  }
  public A addToExcept(java.lang.String... items) {
    if (this.except == null) {this.except = new ArrayList<String>();}
    for (String item : items) {this.except.add(item);} return (A)this;
  }
  public A addAllToExcept(Collection<String> items) {
    if (this.except == null) {this.except = new ArrayList<String>();}
    for (String item : items) {this.except.add(item);} return (A)this;
  }
  public A removeFromExcept(java.lang.String... items) {
    for (String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
  }
  public A removeAllFromExcept(Collection<String> items) {
    for (String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
  }
  public List<String> getExcept() {
    return this.except;
  }
  public String getExcept(Integer index) {
    return this.except.get(index);
  }
  public String getFirstExcept() {
    return this.except.get(0);
  }
  public String getLastExcept() {
    return this.except.get(except.size() - 1);
  }
  public String getMatchingExcept(Predicate<String> predicate) {
    for (String item: except) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingExcept(Predicate<String> predicate) {
    for (String item: except) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withExcept(List<String> except) {
    if (except != null) {this.except = new ArrayList(); for (String item : except){this.addToExcept(item);}} else { this.except = null;} return (A) this;
  }
  public A withExcept(java.lang.String... except) {
    if (this.except != null) {this.except.clear();}
    if (except != null) {for (String item :except){ this.addToExcept(item);}} return (A) this;
  }
  public Boolean hasExcept() {
    return except != null && !except.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IPBlockFluentImpl that = (V1IPBlockFluentImpl) o;
    if (cidr != null ? !cidr.equals(that.cidr) :that.cidr != null) return false;
    if (except != null ? !except.equals(that.except) :that.except != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(cidr,  except,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cidr != null) { sb.append("cidr:"); sb.append(cidr + ","); }
    if (except != null && !except.isEmpty()) { sb.append("except:"); sb.append(except); }
    sb.append("}");
    return sb.toString();
  }
  
}