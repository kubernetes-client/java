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
public class V1UserInfoFluentImpl<A extends io.kubernetes.client.openapi.models.V1UserInfoFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1UserInfoFluent<A> {
  public V1UserInfoFluentImpl() {}

  public V1UserInfoFluentImpl(io.kubernetes.client.openapi.models.V1UserInfo instance) {
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withUid(instance.getUid());

    this.withUsername(instance.getUsername());
  }

  private java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra;
  private java.util.List<java.lang.String> groups;
  private java.lang.String uid;
  private java.lang.String username;

  public A addToExtra(java.lang.String key, java.util.List<java.lang.String> value) {
    if (this.extra == null && key != null && value != null) {
      this.extra = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.extra.put(key, value);
    }
    return (A) this;
  }

  public A addToExtra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    if (this.extra == null && map != null) {
      this.extra = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.extra.putAll(map);
    }
    return (A) this;
  }

  public A removeFromExtra(java.lang.String key) {
    if (this.extra == null) {
      return (A) this;
    }
    if (key != null && this.extra != null) {
      this.extra.remove(key);
    }
    return (A) this;
  }

  public A removeFromExtra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
    if (this.extra == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.extra != null) {
          this.extra.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra() {
    return this.extra;
  }

  public <K, V> A withExtra(
      java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra) {
    if (extra == null) {
      this.extra = null;
    } else {
      this.extra = new java.util.LinkedHashMap(extra);
    }
    return (A) this;
  }

  public java.lang.Boolean hasExtra() {
    return this.extra != null;
  }

  public A addToGroups(java.lang.Integer index, java.lang.String item) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    this.groups.add(index, item);
    return (A) this;
  }

  public A setToGroups(java.lang.Integer index, java.lang.String item) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    this.groups.set(index, item);
    return (A) this;
  }

  public A addToGroups(java.lang.String... items) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }

  public A addAllToGroups(java.util.Collection<java.lang.String> items) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.groups.add(item);
    }
    return (A) this;
  }

  public A removeFromGroups(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.groups != null) {
        this.groups.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromGroups(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.groups != null) {
        this.groups.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getGroups() {
    return this.groups;
  }

  public java.lang.String getGroup(java.lang.Integer index) {
    return this.groups.get(index);
  }

  public java.lang.String getFirstGroup() {
    return this.groups.get(0);
  }

  public java.lang.String getLastGroup() {
    return this.groups.get(groups.size() - 1);
  }

  public java.lang.String getMatchingGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : groups) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : groups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withGroups(java.util.List<java.lang.String> groups) {
    if (groups != null) {
      this.groups = new java.util.ArrayList();
      for (java.lang.String item : groups) {
        this.addToGroups(item);
      }
    } else {
      this.groups = null;
    }
    return (A) this;
  }

  public A withGroups(java.lang.String... groups) {
    if (this.groups != null) {
      this.groups.clear();
    }
    if (groups != null) {
      for (java.lang.String item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasGroups() {
    return groups != null && !groups.isEmpty();
  }

  public A addNewGroup(java.lang.String original) {
    return (A) addToGroups(new String(original));
  }

  public java.lang.String getUid() {
    return this.uid;
  }

  public A withUid(java.lang.String uid) {
    this.uid = uid;
    return (A) this;
  }

  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original) {
    return (A) withUid(new String(original));
  }

  public java.lang.String getUsername() {
    return this.username;
  }

  public A withUsername(java.lang.String username) {
    this.username = username;
    return (A) this;
  }

  public java.lang.Boolean hasUsername() {
    return this.username != null;
  }

  /** Method is deprecated. use withUsername instead. */
  @java.lang.Deprecated
  public A withNewUsername(java.lang.String original) {
    return (A) withUsername(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1UserInfoFluentImpl that = (V1UserInfoFluentImpl) o;
    if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;
    if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    if (username != null ? !username.equals(that.username) : that.username != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(extra, groups, uid, username, super.hashCode());
  }
}
