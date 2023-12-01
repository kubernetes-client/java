package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1UncountedTerminatedPodsFluent<A extends V1UncountedTerminatedPodsFluent<A>> extends BaseFluent<A>{
  public V1UncountedTerminatedPodsFluent() {
  }
  
  public V1UncountedTerminatedPodsFluent(V1UncountedTerminatedPods instance) {
    this.copyInstance(instance);
  }
  private List<String> failed;
  private List<String> succeeded;
  
  protected void copyInstance(V1UncountedTerminatedPods instance) {
    instance = (instance != null ? instance : new V1UncountedTerminatedPods());
    if (instance != null) {
          this.withFailed(instance.getFailed());
          this.withSucceeded(instance.getSucceeded());
        }
  }
  
  public A addToFailed(int index,String item) {
    if (this.failed == null) {this.failed = new ArrayList<String>();}
    this.failed.add(index, item);
    return (A)this;
  }
  
  public A setToFailed(int index,String item) {
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
    if (this.failed == null) return (A)this;
    for (String item : items) { this.failed.remove(item);} return (A)this;
  }
  
  public A removeAllFromFailed(Collection<String> items) {
    if (this.failed == null) return (A)this;
    for (String item : items) { this.failed.remove(item);} return (A)this;
  }
  
  public List<String> getFailed() {
    return this.failed;
  }
  
  public String getFailed(int index) {
    return this.failed.get(index);
  }
  
  public String getFirstFailed() {
    return this.failed.get(0);
  }
  
  public String getLastFailed() {
    return this.failed.get(failed.size() - 1);
  }
  
  public String getMatchingFailed(Predicate<String> predicate) {
      for (String item : failed) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingFailed(Predicate<String> predicate) {
      for (String item : failed) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFailed(List<String> failed) {
    if (failed != null) {
        this.failed = new ArrayList();
        for (String item : failed) {
          this.addToFailed(item);
        }
    } else {
      this.failed = null;
    }
    return (A) this;
  }
  
  public A withFailed(java.lang.String... failed) {
    if (this.failed != null) {
        this.failed.clear();
        _visitables.remove("failed");
    }
    if (failed != null) {
      for (String item : failed) {
        this.addToFailed(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFailed() {
    return this.failed != null && !this.failed.isEmpty();
  }
  
  public A addToSucceeded(int index,String item) {
    if (this.succeeded == null) {this.succeeded = new ArrayList<String>();}
    this.succeeded.add(index, item);
    return (A)this;
  }
  
  public A setToSucceeded(int index,String item) {
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
    if (this.succeeded == null) return (A)this;
    for (String item : items) { this.succeeded.remove(item);} return (A)this;
  }
  
  public A removeAllFromSucceeded(Collection<String> items) {
    if (this.succeeded == null) return (A)this;
    for (String item : items) { this.succeeded.remove(item);} return (A)this;
  }
  
  public List<String> getSucceeded() {
    return this.succeeded;
  }
  
  public String getSucceeded(int index) {
    return this.succeeded.get(index);
  }
  
  public String getFirstSucceeded() {
    return this.succeeded.get(0);
  }
  
  public String getLastSucceeded() {
    return this.succeeded.get(succeeded.size() - 1);
  }
  
  public String getMatchingSucceeded(Predicate<String> predicate) {
      for (String item : succeeded) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingSucceeded(Predicate<String> predicate) {
      for (String item : succeeded) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withSucceeded(List<String> succeeded) {
    if (succeeded != null) {
        this.succeeded = new ArrayList();
        for (String item : succeeded) {
          this.addToSucceeded(item);
        }
    } else {
      this.succeeded = null;
    }
    return (A) this;
  }
  
  public A withSucceeded(java.lang.String... succeeded) {
    if (this.succeeded != null) {
        this.succeeded.clear();
        _visitables.remove("succeeded");
    }
    if (succeeded != null) {
      for (String item : succeeded) {
        this.addToSucceeded(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasSucceeded() {
    return this.succeeded != null && !this.succeeded.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1UncountedTerminatedPodsFluent that = (V1UncountedTerminatedPodsFluent) o;
    if (!java.util.Objects.equals(failed, that.failed)) return false;
    if (!java.util.Objects.equals(succeeded, that.succeeded)) return false;
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