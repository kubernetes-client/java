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
public class CoreV1EventSeriesFluentImpl<
        A extends io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<A> {
  public CoreV1EventSeriesFluentImpl() {}

  public CoreV1EventSeriesFluentImpl(
      io.kubernetes.client.openapi.models.CoreV1EventSeries instance) {
    this.withCount(instance.getCount());

    this.withLastObservedTime(instance.getLastObservedTime());
  }

  private java.lang.Integer count;
  private java.time.OffsetDateTime lastObservedTime;

  public java.lang.Integer getCount() {
    return this.count;
  }

  public A withCount(java.lang.Integer count) {
    this.count = count;
    return (A) this;
  }

  public java.lang.Boolean hasCount() {
    return this.count != null;
  }

  public java.time.OffsetDateTime getLastObservedTime() {
    return this.lastObservedTime;
  }

  public A withLastObservedTime(java.time.OffsetDateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastObservedTime() {
    return this.lastObservedTime != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CoreV1EventSeriesFluentImpl that = (CoreV1EventSeriesFluentImpl) o;
    if (count != null ? !count.equals(that.count) : that.count != null) return false;
    if (lastObservedTime != null
        ? !lastObservedTime.equals(that.lastObservedTime)
        : that.lastObservedTime != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(count, lastObservedTime, super.hashCode());
  }
}
