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
public class V1FCVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<A> {
  public V1FCVolumeSourceFluentImpl() {}

  public V1FCVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1FCVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withLun(instance.getLun());

    this.withReadOnly(instance.getReadOnly());

    this.withTargetWWNs(instance.getTargetWWNs());

    this.withWwids(instance.getWwids());
  }

  private java.lang.String fsType;
  private java.lang.Integer lun;
  private java.lang.Boolean readOnly;
  private java.util.List<java.lang.String> targetWWNs;
  private java.util.List<java.lang.String> wwids;

  public java.lang.String getFsType() {
    return this.fsType;
  }

  public A withFsType(java.lang.String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public java.lang.Boolean hasFsType() {
    return this.fsType != null;
  }

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original) {
    return (A) withFsType(new String(original));
  }

  public java.lang.Integer getLun() {
    return this.lun;
  }

  public A withLun(java.lang.Integer lun) {
    this.lun = lun;
    return (A) this;
  }

  public java.lang.Boolean hasLun() {
    return this.lun != null;
  }

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public A addToTargetWWNs(java.lang.Integer index, java.lang.String item) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new java.util.ArrayList<java.lang.String>();
    }
    this.targetWWNs.add(index, item);
    return (A) this;
  }

  public A setToTargetWWNs(java.lang.Integer index, java.lang.String item) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new java.util.ArrayList<java.lang.String>();
    }
    this.targetWWNs.set(index, item);
    return (A) this;
  }

  public A addToTargetWWNs(java.lang.String... items) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.targetWWNs.add(item);
    }
    return (A) this;
  }

  public A addAllToTargetWWNs(java.util.Collection<java.lang.String> items) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.targetWWNs.add(item);
    }
    return (A) this;
  }

  public A removeFromTargetWWNs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.targetWWNs != null) {
        this.targetWWNs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromTargetWWNs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.targetWWNs != null) {
        this.targetWWNs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getTargetWWNs() {
    return this.targetWWNs;
  }

  public java.lang.String getTargetWWN(java.lang.Integer index) {
    return this.targetWWNs.get(index);
  }

  public java.lang.String getFirstTargetWWN() {
    return this.targetWWNs.get(0);
  }

  public java.lang.String getLastTargetWWN() {
    return this.targetWWNs.get(targetWWNs.size() - 1);
  }

  public java.lang.String getMatchingTargetWWN(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : targetWWNs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTargetWWN(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : targetWWNs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTargetWWNs(java.util.List<java.lang.String> targetWWNs) {
    if (targetWWNs != null) {
      this.targetWWNs = new java.util.ArrayList();
      for (java.lang.String item : targetWWNs) {
        this.addToTargetWWNs(item);
      }
    } else {
      this.targetWWNs = null;
    }
    return (A) this;
  }

  public A withTargetWWNs(java.lang.String... targetWWNs) {
    if (this.targetWWNs != null) {
      this.targetWWNs.clear();
    }
    if (targetWWNs != null) {
      for (java.lang.String item : targetWWNs) {
        this.addToTargetWWNs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTargetWWNs() {
    return targetWWNs != null && !targetWWNs.isEmpty();
  }

  public A addNewTargetWWN(java.lang.String original) {
    return (A) addToTargetWWNs(new String(original));
  }

  public A addToWwids(java.lang.Integer index, java.lang.String item) {
    if (this.wwids == null) {
      this.wwids = new java.util.ArrayList<java.lang.String>();
    }
    this.wwids.add(index, item);
    return (A) this;
  }

  public A setToWwids(java.lang.Integer index, java.lang.String item) {
    if (this.wwids == null) {
      this.wwids = new java.util.ArrayList<java.lang.String>();
    }
    this.wwids.set(index, item);
    return (A) this;
  }

  public A addToWwids(java.lang.String... items) {
    if (this.wwids == null) {
      this.wwids = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.wwids.add(item);
    }
    return (A) this;
  }

  public A addAllToWwids(java.util.Collection<java.lang.String> items) {
    if (this.wwids == null) {
      this.wwids = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.wwids.add(item);
    }
    return (A) this;
  }

  public A removeFromWwids(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.wwids != null) {
        this.wwids.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromWwids(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.wwids != null) {
        this.wwids.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getWwids() {
    return this.wwids;
  }

  public java.lang.String getWwid(java.lang.Integer index) {
    return this.wwids.get(index);
  }

  public java.lang.String getFirstWwid() {
    return this.wwids.get(0);
  }

  public java.lang.String getLastWwid() {
    return this.wwids.get(wwids.size() - 1);
  }

  public java.lang.String getMatchingWwid(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : wwids) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingWwid(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : wwids) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withWwids(java.util.List<java.lang.String> wwids) {
    if (wwids != null) {
      this.wwids = new java.util.ArrayList();
      for (java.lang.String item : wwids) {
        this.addToWwids(item);
      }
    } else {
      this.wwids = null;
    }
    return (A) this;
  }

  public A withWwids(java.lang.String... wwids) {
    if (this.wwids != null) {
      this.wwids.clear();
    }
    if (wwids != null) {
      for (java.lang.String item : wwids) {
        this.addToWwids(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasWwids() {
    return wwids != null && !wwids.isEmpty();
  }

  public A addNewWwid(java.lang.String original) {
    return (A) addToWwids(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FCVolumeSourceFluentImpl that = (V1FCVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (lun != null ? !lun.equals(that.lun) : that.lun != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (targetWWNs != null ? !targetWWNs.equals(that.targetWWNs) : that.targetWWNs != null)
      return false;
    if (wwids != null ? !wwids.equals(that.wwids) : that.wwids != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, lun, readOnly, targetWWNs, wwids, super.hashCode());
  }
}
