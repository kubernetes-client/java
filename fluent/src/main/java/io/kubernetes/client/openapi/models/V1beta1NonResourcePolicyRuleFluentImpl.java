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
  public class V1beta1NonResourcePolicyRuleFluentImpl<A extends V1beta1NonResourcePolicyRuleFluent<A>> extends BaseFluent<A> implements V1beta1NonResourcePolicyRuleFluent<A>{
  public V1beta1NonResourcePolicyRuleFluentImpl() {
  }
  public V1beta1NonResourcePolicyRuleFluentImpl(V1beta1NonResourcePolicyRule instance) {
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());

  }
  private List<String> nonResourceURLs;
  private List<String> verbs;
  public A addToNonResourceURLs(Integer index,String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    this.nonResourceURLs.add(index, item);
    return (A)this;
  }
  public A setToNonResourceURLs(Integer index,String item) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    this.nonResourceURLs.set(index, item); return (A)this;
  }
  public A addToNonResourceURLs(java.lang.String... items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  public A addAllToNonResourceURLs(Collection<String> items) {
    if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
    for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
  }
  public A removeFromNonResourceURLs(java.lang.String... items) {
    for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
  }
  public A removeAllFromNonResourceURLs(Collection<String> items) {
    for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
  }
  public List<String> getNonResourceURLs() {
    return this.nonResourceURLs;
  }
  public String getNonResourceURL(Integer index) {
    return this.nonResourceURLs.get(index);
  }
  public String getFirstNonResourceURL() {
    return this.nonResourceURLs.get(0);
  }
  public String getLastNonResourceURL() {
    return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
  }
  public String getMatchingNonResourceURL(Predicate<String> predicate) {
    for (String item: nonResourceURLs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingNonResourceURL(Predicate<String> predicate) {
    for (String item: nonResourceURLs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNonResourceURLs(List<String> nonResourceURLs) {
    if (nonResourceURLs != null) {this.nonResourceURLs = new ArrayList(); for (String item : nonResourceURLs){this.addToNonResourceURLs(item);}} else { this.nonResourceURLs = null;} return (A) this;
  }
  public A withNonResourceURLs(java.lang.String... nonResourceURLs) {
    if (this.nonResourceURLs != null) {this.nonResourceURLs.clear();}
    if (nonResourceURLs != null) {for (String item :nonResourceURLs){ this.addToNonResourceURLs(item);}} return (A) this;
  }
  public Boolean hasNonResourceURLs() {
    return nonResourceURLs != null && !nonResourceURLs.isEmpty();
  }
  public A addToVerbs(Integer index,String item) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    this.verbs.add(index, item);
    return (A)this;
  }
  public A setToVerbs(Integer index,String item) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    this.verbs.set(index, item); return (A)this;
  }
  public A addToVerbs(java.lang.String... items) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    for (String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {this.verbs = new ArrayList<String>();}
    for (String item : items) {this.verbs.add(item);} return (A)this;
  }
  public A removeFromVerbs(java.lang.String... items) {
    for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public A removeAllFromVerbs(Collection<String> items) {
    for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
  }
  public List<String> getVerbs() {
    return this.verbs;
  }
  public String getVerb(Integer index) {
    return this.verbs.get(index);
  }
  public String getFirstVerb() {
    return this.verbs.get(0);
  }
  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  public String getMatchingVerb(Predicate<String> predicate) {
    for (String item: verbs) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingVerb(Predicate<String> predicate) {
    for (String item: verbs) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withVerbs(List<String> verbs) {
    if (verbs != null) {this.verbs = new ArrayList(); for (String item : verbs){this.addToVerbs(item);}} else { this.verbs = null;} return (A) this;
  }
  public A withVerbs(java.lang.String... verbs) {
    if (this.verbs != null) {this.verbs.clear();}
    if (verbs != null) {for (String item :verbs){ this.addToVerbs(item);}} return (A) this;
  }
  public Boolean hasVerbs() {
    return verbs != null && !verbs.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1NonResourcePolicyRuleFluentImpl that = (V1beta1NonResourcePolicyRuleFluentImpl) o;
    if (nonResourceURLs != null ? !nonResourceURLs.equals(that.nonResourceURLs) :that.nonResourceURLs != null) return false;
    if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(nonResourceURLs,  verbs,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nonResourceURLs != null && !nonResourceURLs.isEmpty()) { sb.append("nonResourceURLs:"); sb.append(nonResourceURLs + ","); }
    if (verbs != null && !verbs.isEmpty()) { sb.append("verbs:"); sb.append(verbs); }
    sb.append("}");
    return sb.toString();
  }
  
}