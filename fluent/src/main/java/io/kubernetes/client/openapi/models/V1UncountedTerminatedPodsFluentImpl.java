/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1UncountedTerminatedPodsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<A> {
  public V1UncountedTerminatedPodsFluentImpl() {}

  public V1UncountedTerminatedPodsFluentImpl(
      io.kubernetes.client.openapi.models.V1UncountedTerminatedPods instance) {
    this.withFailed(instance.getFailed());

    this.withSucceeded(instance.getSucceeded());
  }

  private java.util.List<java.lang.String> failed;
  private java.util.List<java.lang.String> succeeded;

  public A addToFailed(java.lang.Integer index, java.lang.String item) {
    if (this.failed == null) {
      this.failed = new java.util.ArrayList<java.lang.String>();
    }
    this.failed.add(index, item);
    return (A) this;
  }

  public A setToFailed(java.lang.Integer index, java.lang.String item) {
    if (this.failed == null) {
      this.failed = new java.util.ArrayList<java.lang.String>();
    }
    this.failed.set(index, item);
    return (A) this;
  }

  public A addToFailed(java.lang.String... items) {
    if (this.failed == null) {
      this.failed = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.failed.add(item);
    }
    return (A) this;
  }

  public A addAllToFailed(java.util.Collection<java.lang.String> items) {
    if (this.failed == null) {
      this.failed = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.failed.add(item);
    }
    return (A) this;
  }

  public A removeFromFailed(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.failed != null) {
        this.failed.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromFailed(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.failed != null) {
        this.failed.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getFailed() {
    return this.failed;
  }

  public java.lang.String getFailed(java.lang.Integer index) {
    return this.failed.get(index);
  }

  public java.lang.String getFirstFailed() {
    return this.failed.get(0);
  }

  public java.lang.String getLastFailed() {
    return this.failed.get(failed.size() - 1);
  }

  public java.lang.String getMatchingFailed(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : failed) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingFailed(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : failed) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withFailed(java.util.List<java.lang.String> failed) {
    if (failed != null) {
      this.failed = new java.util.ArrayList();
      for (java.lang.String item : failed) {
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
    }
    if (failed != null) {
      for (java.lang.String item : failed) {
        this.addToFailed(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasFailed() {
    return failed != null && !failed.isEmpty();
  }

  public A addNewFailed(java.lang.String original) {
    return (A) addToFailed(new String(original));
  }

  public A addToSucceeded(java.lang.Integer index, java.lang.String item) {
    if (this.succeeded == null) {
      this.succeeded = new java.util.ArrayList<java.lang.String>();
    }
    this.succeeded.add(index, item);
    return (A) this;
  }

  public A setToSucceeded(java.lang.Integer index, java.lang.String item) {
    if (this.succeeded == null) {
      this.succeeded = new java.util.ArrayList<java.lang.String>();
    }
    this.succeeded.set(index, item);
    return (A) this;
  }

  public A addToSucceeded(java.lang.String... items) {
    if (this.succeeded == null) {
      this.succeeded = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.succeeded.add(item);
    }
    return (A) this;
  }

  public A addAllToSucceeded(java.util.Collection<java.lang.String> items) {
    if (this.succeeded == null) {
      this.succeeded = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.succeeded.add(item);
    }
    return (A) this;
  }

  public A removeFromSucceeded(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.succeeded != null) {
        this.succeeded.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromSucceeded(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.succeeded != null) {
        this.succeeded.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getSucceeded() {
    return this.succeeded;
  }

  public java.lang.String getSucceeded(java.lang.Integer index) {
    return this.succeeded.get(index);
  }

  public java.lang.String getFirstSucceeded() {
    return this.succeeded.get(0);
  }

  public java.lang.String getLastSucceeded() {
    return this.succeeded.get(succeeded.size() - 1);
  }

  public java.lang.String getMatchingSucceeded(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : succeeded) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSucceeded(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : succeeded) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSucceeded(java.util.List<java.lang.String> succeeded) {
    if (succeeded != null) {
      this.succeeded = new java.util.ArrayList();
      for (java.lang.String item : succeeded) {
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
    }
    if (succeeded != null) {
      for (java.lang.String item : succeeded) {
        this.addToSucceeded(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSucceeded() {
    return succeeded != null && !succeeded.isEmpty();
  }

  public A addNewSucceeded(java.lang.String original) {
    return (A) addToSucceeded(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1UncountedTerminatedPodsFluentImpl that = (V1UncountedTerminatedPodsFluentImpl) o;
    if (failed != null ? !failed.equals(that.failed) : that.failed != null) return false;
    if (succeeded != null ? !succeeded.equals(that.succeeded) : that.succeeded != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(failed, succeeded, super.hashCode());
  }
}
