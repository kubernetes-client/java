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
  public class V1UncountedTerminatedPodsFluentImpl<A extends V1UncountedTerminatedPodsFluent<A>> extends BaseFluent<A> implements V1UncountedTerminatedPodsFluent<A>{
  public V1UncountedTerminatedPodsFluentImpl() {
  }
  public V1UncountedTerminatedPodsFluentImpl(V1UncountedTerminatedPods instance) {
    this.withFailed(instance.getFailed());

    this.withSucceeded(instance.getSucceeded());

  }
  private List<String> failed;
  private List<String> succeeded;
  public A addToFailed(Integer index,String item) {
    if (this.failed == null) {this.failed = new ArrayList<String>();}
    this.failed.add(index, item);
    return (A)this;
  }
  public A setToFailed(Integer index,String item) {
    if (this.failed == null) {this.failed = new ArrayList<String>();}
    this.failed.set(index, item); return (A)this;
  }
  public A addToFailed(java.lang.String... items) {
    if (this.failed == null) {this.failed = new ArrayList<String>();}
    for (String item : items) {this.failed.add(item);} return (A)this;
  }
  public A addAllToFailed(Collection<String> items) {
    if (this.failed == null) {this.failed = new ArrayList<String>();}
    for (String item : items) {this.failed.add(item);} return (A)this;
  }
  public A removeFromFailed(java.lang.String... items) {
    for (String item : items) {if (this.failed!= null){ this.failed.remove(item);}} return (A)this;
  }
  public A removeAllFromFailed(Collection<String> items) {
    for (String item : items) {if (this.failed!= null){ this.failed.remove(item);}} return (A)this;
  }
  public List<String> getFailed() {
    return this.failed;
  }
  public String getFailed(Integer index) {
    return this.failed.get(index);
  }
  public String getFirstFailed() {
    return this.failed.get(0);
  }
  public String getLastFailed() {
    return this.failed.get(failed.size() - 1);
  }
  public String getMatchingFailed(Predicate<String> predicate) {
    for (String item: failed) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingFailed(Predicate<String> predicate) {
    for (String item: failed) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withFailed(List<String> failed) {
    if (failed != null) {this.failed = new ArrayList(); for (String item : failed){this.addToFailed(item);}} else { this.failed = null;} return (A) this;
  }
  public A withFailed(java.lang.String... failed) {
    if (this.failed != null) {this.failed.clear();}
    if (failed != null) {for (String item :failed){ this.addToFailed(item);}} return (A) this;
  }
  public Boolean hasFailed() {
    return failed != null && !failed.isEmpty();
  }
  public A addToSucceeded(Integer index,String item) {
    if (this.succeeded == null) {this.succeeded = new ArrayList<String>();}
    this.succeeded.add(index, item);
    return (A)this;
  }
  public A setToSucceeded(Integer index,String item) {
    if (this.succeeded == null) {this.succeeded = new ArrayList<String>();}
    this.succeeded.set(index, item); return (A)this;
  }
  public A addToSucceeded(java.lang.String... items) {
    if (this.succeeded == null) {this.succeeded = new ArrayList<String>();}
    for (String item : items) {this.succeeded.add(item);} return (A)this;
  }
  public A addAllToSucceeded(Collection<String> items) {
    if (this.succeeded == null) {this.succeeded = new ArrayList<String>();}
    for (String item : items) {this.succeeded.add(item);} return (A)this;
  }
  public A removeFromSucceeded(java.lang.String... items) {
    for (String item : items) {if (this.succeeded!= null){ this.succeeded.remove(item);}} return (A)this;
  }
  public A removeAllFromSucceeded(Collection<String> items) {
    for (String item : items) {if (this.succeeded!= null){ this.succeeded.remove(item);}} return (A)this;
  }
  public List<String> getSucceeded() {
    return this.succeeded;
  }
  public String getSucceeded(Integer index) {
    return this.succeeded.get(index);
  }
  public String getFirstSucceeded() {
    return this.succeeded.get(0);
  }
  public String getLastSucceeded() {
    return this.succeeded.get(succeeded.size() - 1);
  }
  public String getMatchingSucceeded(Predicate<String> predicate) {
    for (String item: succeeded) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingSucceeded(Predicate<String> predicate) {
    for (String item: succeeded) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSucceeded(List<String> succeeded) {
    if (succeeded != null) {this.succeeded = new ArrayList(); for (String item : succeeded){this.addToSucceeded(item);}} else { this.succeeded = null;} return (A) this;
  }
  public A withSucceeded(java.lang.String... succeeded) {
    if (this.succeeded != null) {this.succeeded.clear();}
    if (succeeded != null) {for (String item :succeeded){ this.addToSucceeded(item);}} return (A) this;
  }
  public Boolean hasSucceeded() {
    return succeeded != null && !succeeded.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1UncountedTerminatedPodsFluentImpl that = (V1UncountedTerminatedPodsFluentImpl) o;
    if (failed != null ? !failed.equals(that.failed) :that.failed != null) return false;
    if (succeeded != null ? !succeeded.equals(that.succeeded) :that.succeeded != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(failed,  succeeded,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (failed != null && !failed.isEmpty()) { sb.append("failed:"); sb.append(failed + ","); }
    if (succeeded != null && !succeeded.isEmpty()) { sb.append("succeeded:"); sb.append(succeeded); }
    sb.append("}");
    return sb.toString();
  }
  
}