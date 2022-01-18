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
public class V1CapabilitiesFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CapabilitiesFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CapabilitiesFluent<A> {
  public V1CapabilitiesFluentImpl() {}

  public V1CapabilitiesFluentImpl(io.kubernetes.client.openapi.models.V1Capabilities instance) {
    this.withAdd(instance.getAdd());

    this.withDrop(instance.getDrop());
  }

  private java.util.List<java.lang.String> add;
  private java.util.List<java.lang.String> drop;

  public A addToAdd(java.lang.Integer index, java.lang.String item) {
    if (this.add == null) {
      this.add = new java.util.ArrayList<java.lang.String>();
    }
    this.add.add(index, item);
    return (A) this;
  }

  public A setToAdd(java.lang.Integer index, java.lang.String item) {
    if (this.add == null) {
      this.add = new java.util.ArrayList<java.lang.String>();
    }
    this.add.set(index, item);
    return (A) this;
  }

  public A addToAdd(java.lang.String... items) {
    if (this.add == null) {
      this.add = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.add.add(item);
    }
    return (A) this;
  }

  public A addAllToAdd(java.util.Collection<java.lang.String> items) {
    if (this.add == null) {
      this.add = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.add.add(item);
    }
    return (A) this;
  }

  public A removeFromAdd(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.add != null) {
        this.add.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAdd(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.add != null) {
        this.add.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAdd() {
    return this.add;
  }

  public java.lang.String getAdd(java.lang.Integer index) {
    return this.add.get(index);
  }

  public java.lang.String getFirstAdd() {
    return this.add.get(0);
  }

  public java.lang.String getLastAdd() {
    return this.add.get(add.size() - 1);
  }

  public java.lang.String getMatchingAdd(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : add) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAdd(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : add) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAdd(java.util.List<java.lang.String> add) {
    if (add != null) {
      this.add = new java.util.ArrayList();
      for (java.lang.String item : add) {
        this.addToAdd(item);
      }
    } else {
      this.add = null;
    }
    return (A) this;
  }

  public A withAdd(java.lang.String... add) {
    if (this.add != null) {
      this.add.clear();
    }
    if (add != null) {
      for (java.lang.String item : add) {
        this.addToAdd(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAdd() {
    return add != null && !add.isEmpty();
  }

  public A addNewAdd(java.lang.String original) {
    return (A) addToAdd(new String(original));
  }

  public A addToDrop(java.lang.Integer index, java.lang.String item) {
    if (this.drop == null) {
      this.drop = new java.util.ArrayList<java.lang.String>();
    }
    this.drop.add(index, item);
    return (A) this;
  }

  public A setToDrop(java.lang.Integer index, java.lang.String item) {
    if (this.drop == null) {
      this.drop = new java.util.ArrayList<java.lang.String>();
    }
    this.drop.set(index, item);
    return (A) this;
  }

  public A addToDrop(java.lang.String... items) {
    if (this.drop == null) {
      this.drop = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.drop.add(item);
    }
    return (A) this;
  }

  public A addAllToDrop(java.util.Collection<java.lang.String> items) {
    if (this.drop == null) {
      this.drop = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.drop.add(item);
    }
    return (A) this;
  }

  public A removeFromDrop(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.drop != null) {
        this.drop.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromDrop(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.drop != null) {
        this.drop.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getDrop() {
    return this.drop;
  }

  public java.lang.String getDrop(java.lang.Integer index) {
    return this.drop.get(index);
  }

  public java.lang.String getFirstDrop() {
    return this.drop.get(0);
  }

  public java.lang.String getLastDrop() {
    return this.drop.get(drop.size() - 1);
  }

  public java.lang.String getMatchingDrop(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : drop) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingDrop(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : drop) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withDrop(java.util.List<java.lang.String> drop) {
    if (drop != null) {
      this.drop = new java.util.ArrayList();
      for (java.lang.String item : drop) {
        this.addToDrop(item);
      }
    } else {
      this.drop = null;
    }
    return (A) this;
  }

  public A withDrop(java.lang.String... drop) {
    if (this.drop != null) {
      this.drop.clear();
    }
    if (drop != null) {
      for (java.lang.String item : drop) {
        this.addToDrop(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasDrop() {
    return drop != null && !drop.isEmpty();
  }

  public A addNewDrop(java.lang.String original) {
    return (A) addToDrop(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CapabilitiesFluentImpl that = (V1CapabilitiesFluentImpl) o;
    if (add != null ? !add.equals(that.add) : that.add != null) return false;
    if (drop != null ? !drop.equals(that.drop) : that.drop != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(add, drop, super.hashCode());
  }
}
