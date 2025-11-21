package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
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
public class V1UncountedTerminatedPodsFluent<A extends io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<A>> extends BaseFluent<A>{

  private List<String> failed;
  private List<String> succeeded;

  public V1UncountedTerminatedPodsFluent() {
  }
  
  public V1UncountedTerminatedPodsFluent(V1UncountedTerminatedPods instance) {
    this.copyInstance(instance);
  }

  public A addAllToFailed(Collection<String> items) {
    if (this.failed == null) {
      this.failed = new ArrayList();
    }
    for (String item : items) {
      this.failed.add(item);
    }
    return (A) this;
  }
  
  public A addAllToSucceeded(Collection<String> items) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList();
    }
    for (String item : items) {
      this.succeeded.add(item);
    }
    return (A) this;
  }
  
  public A addToFailed(String... items) {
    if (this.failed == null) {
      this.failed = new ArrayList();
    }
    for (String item : items) {
      this.failed.add(item);
    }
    return (A) this;
  }
  
  public A addToFailed(int index,String item) {
    if (this.failed == null) {
      this.failed = new ArrayList();
    }
    this.failed.add(index, item);
    return (A) this;
  }
  
  public A addToSucceeded(String... items) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList();
    }
    for (String item : items) {
      this.succeeded.add(item);
    }
    return (A) this;
  }
  
  public A addToSucceeded(int index,String item) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList();
    }
    this.succeeded.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1UncountedTerminatedPods instance) {
    instance = instance != null ? instance : new V1UncountedTerminatedPods();
    if (instance != null) {
        this.withFailed(instance.getFailed());
        this.withSucceeded(instance.getSucceeded());
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
    V1UncountedTerminatedPodsFluent that = (V1UncountedTerminatedPodsFluent) o;
    if (!(Objects.equals(failed, that.failed))) {
      return false;
    }
    if (!(Objects.equals(succeeded, that.succeeded))) {
      return false;
    }
    return true;
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
  
  public String getFirstSucceeded() {
    return this.succeeded.get(0);
  }
  
  public String getLastFailed() {
    return this.failed.get(failed.size() - 1);
  }
  
  public String getLastSucceeded() {
    return this.succeeded.get(succeeded.size() - 1);
  }
  
  public String getMatchingFailed(Predicate<String> predicate) {
      for (String item : failed) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingSucceeded(Predicate<String> predicate) {
      for (String item : succeeded) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public List<String> getSucceeded() {
    return this.succeeded;
  }
  
  public String getSucceeded(int index) {
    return this.succeeded.get(index);
  }
  
  public boolean hasFailed() {
    return this.failed != null && !(this.failed.isEmpty());
  }
  
  public boolean hasMatchingFailed(Predicate<String> predicate) {
      for (String item : failed) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingSucceeded(Predicate<String> predicate) {
      for (String item : succeeded) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasSucceeded() {
    return this.succeeded != null && !(this.succeeded.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(failed, succeeded);
  }
  
  public A removeAllFromFailed(Collection<String> items) {
    if (this.failed == null) {
      return (A) this;
    }
    for (String item : items) {
      this.failed.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromSucceeded(Collection<String> items) {
    if (this.succeeded == null) {
      return (A) this;
    }
    for (String item : items) {
      this.succeeded.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromFailed(String... items) {
    if (this.failed == null) {
      return (A) this;
    }
    for (String item : items) {
      this.failed.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromSucceeded(String... items) {
    if (this.succeeded == null) {
      return (A) this;
    }
    for (String item : items) {
      this.succeeded.remove(item);
    }
    return (A) this;
  }
  
  public A setToFailed(int index,String item) {
    if (this.failed == null) {
      this.failed = new ArrayList();
    }
    this.failed.set(index, item);
    return (A) this;
  }
  
  public A setToSucceeded(int index,String item) {
    if (this.succeeded == null) {
      this.succeeded = new ArrayList();
    }
    this.succeeded.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(failed == null) && !(failed.isEmpty())) {
        sb.append("failed:");
        sb.append(failed);
        sb.append(",");
    }
    if (!(succeeded == null) && !(succeeded.isEmpty())) {
        sb.append("succeeded:");
        sb.append(succeeded);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withFailed(String... failed) {
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
  
  public A withSucceeded(String... succeeded) {
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
  
}