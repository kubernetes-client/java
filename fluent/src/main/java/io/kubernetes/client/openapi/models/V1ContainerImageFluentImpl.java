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

import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ContainerImageFluentImpl<A extends V1ContainerImageFluent<A>> extends BaseFluent<A>
    implements V1ContainerImageFluent<A> {
  public V1ContainerImageFluentImpl() {}

  public V1ContainerImageFluentImpl(V1ContainerImage instance) {
    this.withNames(instance.getNames());

    this.withSizeBytes(instance.getSizeBytes());
  }

  private List<String> names;
  private Long sizeBytes;

  public A addToNames(Integer index, String item) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(index, item);
    return (A) this;
  }

  public A setToNames(Integer index, String item) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.set(index, item);
    return (A) this;
  }

  public A addToNames(java.lang.String... items) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    for (String item : items) {
      this.names.add(item);
    }
    return (A) this;
  }

  public A addAllToNames(Collection<String> items) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    for (String item : items) {
      this.names.add(item);
    }
    return (A) this;
  }

  public A removeFromNames(java.lang.String... items) {
    for (String item : items) {
      if (this.names != null) {
        this.names.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromNames(Collection<String> items) {
    for (String item : items) {
      if (this.names != null) {
        this.names.remove(item);
      }
    }
    return (A) this;
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
    for (String item : names) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingName(Predicate<String> predicate) {
    for (String item : names) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNames(List<String> names) {
    if (names != null) {
      this.names = new ArrayList();
      for (String item : names) {
        this.addToNames(item);
      }
    } else {
      this.names = null;
    }
    return (A) this;
  }

  public A withNames(java.lang.String... names) {
    if (this.names != null) {
      this.names.clear();
    }
    if (names != null) {
      for (String item : names) {
        this.addToNames(item);
      }
    }
    return (A) this;
  }

  public Boolean hasNames() {
    return names != null && !names.isEmpty();
  }

  public Long getSizeBytes() {
    return this.sizeBytes;
  }

  public A withSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return (A) this;
  }

  public Boolean hasSizeBytes() {
    return this.sizeBytes != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerImageFluentImpl that = (V1ContainerImageFluentImpl) o;
    if (names != null ? !names.equals(that.names) : that.names != null) return false;
    if (sizeBytes != null ? !sizeBytes.equals(that.sizeBytes) : that.sizeBytes != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(names, sizeBytes, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (names != null && !names.isEmpty()) {
      sb.append("names:");
      sb.append(names + ",");
    }
    if (sizeBytes != null) {
      sb.append("sizeBytes:");
      sb.append(sizeBytes);
    }
    sb.append("}");
    return sb.toString();
  }
}
