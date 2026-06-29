/*
Copyright 2026 The Kubernetes Authors.
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
import java.lang.Boolean;
import java.lang.Long;
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
public class V1beta1DeviceAttributeFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceAttributeFluent<A>> extends BaseFluent<A>{

  private Long _int;
  private Boolean bool;
  private List<Boolean> bools;
  private List<Long> ints;
  private String string;
  private List<String> strings;
  private String version;
  private List<String> versions;

  public V1beta1DeviceAttributeFluent() {
  }
  
  public V1beta1DeviceAttributeFluent(V1beta1DeviceAttribute instance) {
    this.copyInstance(instance);
  }

  public A addAllToBools(Collection<Boolean> items) {
    if (this.bools == null) {
      this.bools = new ArrayList();
    }
    for (Boolean item : items) {
      this.bools.add(item);
    }
    return (A) this;
  }
  
  public A addAllToInts(Collection<Long> items) {
    if (this.ints == null) {
      this.ints = new ArrayList();
    }
    for (Long item : items) {
      this.ints.add(item);
    }
    return (A) this;
  }
  
  public A addAllToStrings(Collection<String> items) {
    if (this.strings == null) {
      this.strings = new ArrayList();
    }
    for (String item : items) {
      this.strings.add(item);
    }
    return (A) this;
  }
  
  public A addAllToVersions(Collection<String> items) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    for (String item : items) {
      this.versions.add(item);
    }
    return (A) this;
  }
  
  public A addToBools(Boolean... items) {
    if (this.bools == null) {
      this.bools = new ArrayList();
    }
    for (Boolean item : items) {
      this.bools.add(item);
    }
    return (A) this;
  }
  
  public A addToBools(int index,Boolean item) {
    if (this.bools == null) {
      this.bools = new ArrayList();
    }
    this.bools.add(index, item);
    return (A) this;
  }
  
  public A addToInts(Long... items) {
    if (this.ints == null) {
      this.ints = new ArrayList();
    }
    for (Long item : items) {
      this.ints.add(item);
    }
    return (A) this;
  }
  
  public A addToInts(int index,Long item) {
    if (this.ints == null) {
      this.ints = new ArrayList();
    }
    this.ints.add(index, item);
    return (A) this;
  }
  
  public A addToStrings(String... items) {
    if (this.strings == null) {
      this.strings = new ArrayList();
    }
    for (String item : items) {
      this.strings.add(item);
    }
    return (A) this;
  }
  
  public A addToStrings(int index,String item) {
    if (this.strings == null) {
      this.strings = new ArrayList();
    }
    this.strings.add(index, item);
    return (A) this;
  }
  
  public A addToVersions(String... items) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    for (String item : items) {
      this.versions.add(item);
    }
    return (A) this;
  }
  
  public A addToVersions(int index,String item) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    this.versions.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1beta1DeviceAttribute instance) {
    instance = instance != null ? instance : new V1beta1DeviceAttribute();
    if (instance != null) {
        this.withBool(instance.getBool());
        this.withBools(instance.getBools());
        this.withInts(instance.getInts());
        this.withString(instance.getString());
        this.withStrings(instance.getStrings());
        this.withVersion(instance.getVersion());
        this.withVersions(instance.getVersions());
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
    V1beta1DeviceAttributeFluent that = (V1beta1DeviceAttributeFluent) o;
    if (!(Objects.equals(bool, that.bool))) {
      return false;
    }
    if (!(Objects.equals(bools, that.bools))) {
      return false;
    }
    if (!(Objects.equals(_int, that._int))) {
      return false;
    }
    if (!(Objects.equals(ints, that.ints))) {
      return false;
    }
    if (!(Objects.equals(string, that.string))) {
      return false;
    }
    if (!(Objects.equals(strings, that.strings))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    if (!(Objects.equals(versions, that.versions))) {
      return false;
    }
    return true;
  }
  
  public Boolean getBool() {
    return this.bool;
  }
  
  public Boolean getBool(int index) {
    return this.bools.get(index);
  }
  
  public List<Boolean> getBools() {
    return this.bools;
  }
  
  public Boolean getFirstBool() {
    return this.bools.get(0);
  }
  
  public Long getFirstInt() {
    return this.ints.get(0);
  }
  
  public String getFirstString() {
    return this.strings.get(0);
  }
  
  public String getFirstVersion() {
    return this.versions.get(0);
  }
  
  public Long getInt() {
    return this._int;
  }
  
  public Long getInt(int index) {
    return this.ints.get(index);
  }
  
  public List<Long> getInts() {
    return this.ints;
  }
  
  public Boolean getLastBool() {
    return this.bools.get(bools.size() - 1);
  }
  
  public Long getLastInt() {
    return this.ints.get(ints.size() - 1);
  }
  
  public String getLastString() {
    return this.strings.get(strings.size() - 1);
  }
  
  public String getLastVersion() {
    return this.versions.get(versions.size() - 1);
  }
  
  public Boolean getMatchingBool(Predicate<Boolean> predicate) {
      for (Boolean item : bools) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public Long getMatchingInt(Predicate<Long> predicate) {
      for (Long item : ints) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingString(Predicate<String> predicate) {
      for (String item : strings) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingVersion(Predicate<String> predicate) {
      for (String item : versions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getString() {
    return this.string;
  }
  
  public String getString(int index) {
    return this.strings.get(index);
  }
  
  public List<String> getStrings() {
    return this.strings;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public String getVersion(int index) {
    return this.versions.get(index);
  }
  
  public List<String> getVersions() {
    return this.versions;
  }
  
  public boolean hasBool() {
    return this.bool != null;
  }
  
  public boolean hasBools() {
    return this.bools != null && !(this.bools.isEmpty());
  }
  
  public boolean hasInt() {
    return this._int != null;
  }
  
  public boolean hasInts() {
    return this.ints != null && !(this.ints.isEmpty());
  }
  
  public boolean hasMatchingBool(Predicate<Boolean> predicate) {
      for (Boolean item : bools) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingInt(Predicate<Long> predicate) {
      for (Long item : ints) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingString(Predicate<String> predicate) {
      for (String item : strings) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVersion(Predicate<String> predicate) {
      for (String item : versions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasString() {
    return this.string != null;
  }
  
  public boolean hasStrings() {
    return this.strings != null && !(this.strings.isEmpty());
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean hasVersions() {
    return this.versions != null && !(this.versions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(bool, bools, _int, ints, string, strings, version, versions);
  }
  
  public A removeAllFromBools(Collection<Boolean> items) {
    if (this.bools == null) {
      return (A) this;
    }
    for (Boolean item : items) {
      this.bools.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromInts(Collection<Long> items) {
    if (this.ints == null) {
      return (A) this;
    }
    for (Long item : items) {
      this.ints.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromStrings(Collection<String> items) {
    if (this.strings == null) {
      return (A) this;
    }
    for (String item : items) {
      this.strings.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromVersions(Collection<String> items) {
    if (this.versions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.versions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromBools(Boolean... items) {
    if (this.bools == null) {
      return (A) this;
    }
    for (Boolean item : items) {
      this.bools.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromInts(Long... items) {
    if (this.ints == null) {
      return (A) this;
    }
    for (Long item : items) {
      this.ints.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromStrings(String... items) {
    if (this.strings == null) {
      return (A) this;
    }
    for (String item : items) {
      this.strings.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromVersions(String... items) {
    if (this.versions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.versions.remove(item);
    }
    return (A) this;
  }
  
  public A setToBools(int index,Boolean item) {
    if (this.bools == null) {
      this.bools = new ArrayList();
    }
    this.bools.set(index, item);
    return (A) this;
  }
  
  public A setToInts(int index,Long item) {
    if (this.ints == null) {
      this.ints = new ArrayList();
    }
    this.ints.set(index, item);
    return (A) this;
  }
  
  public A setToStrings(int index,String item) {
    if (this.strings == null) {
      this.strings = new ArrayList();
    }
    this.strings.set(index, item);
    return (A) this;
  }
  
  public A setToVersions(int index,String item) {
    if (this.versions == null) {
      this.versions = new ArrayList();
    }
    this.versions.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(bool == null)) {
        sb.append("bool:");
        sb.append(bool);
        sb.append(",");
    }
    if (!(bools == null) && !(bools.isEmpty())) {
        sb.append("bools:");
        sb.append(bools);
        sb.append(",");
    }
    if (!(_int == null)) {
        sb.append("_int:");
        sb.append(_int);
        sb.append(",");
    }
    if (!(ints == null) && !(ints.isEmpty())) {
        sb.append("ints:");
        sb.append(ints);
        sb.append(",");
    }
    if (!(string == null)) {
        sb.append("string:");
        sb.append(string);
        sb.append(",");
    }
    if (!(strings == null) && !(strings.isEmpty())) {
        sb.append("strings:");
        sb.append(strings);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
        sb.append(",");
    }
    if (!(versions == null) && !(versions.isEmpty())) {
        sb.append("versions:");
        sb.append(versions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBool() {
    return withBool(true);
  }
  
  public A withBool(Boolean bool) {
    this.bool = bool;
    return (A) this;
  }
  
  public A withBools(List<Boolean> bools) {
    if (bools != null) {
        this.bools = new ArrayList();
        for (Boolean item : bools) {
          this.addToBools(item);
        }
    } else {
      this.bools = null;
    }
    return (A) this;
  }
  
  public A withBools(Boolean... bools) {
    if (this.bools != null) {
        this.bools.clear();
        _visitables.remove("bools");
    }
    if (bools != null) {
      for (Boolean item : bools) {
        this.addToBools(item);
      }
    }
    return (A) this;
  }
  
  public A withInt(Long _int) {
    this._int = _int;
    return (A) this;
  }
  
  public A withInts(List<Long> ints) {
    if (ints != null) {
        this.ints = new ArrayList();
        for (Long item : ints) {
          this.addToInts(item);
        }
    } else {
      this.ints = null;
    }
    return (A) this;
  }
  
  public A withInts(Long... ints) {
    if (this.ints != null) {
        this.ints.clear();
        _visitables.remove("ints");
    }
    if (ints != null) {
      for (Long item : ints) {
        this.addToInts(item);
      }
    }
    return (A) this;
  }
  
  public A withString(String string) {
    this.string = string;
    return (A) this;
  }
  
  public A withStrings(List<String> strings) {
    if (strings != null) {
        this.strings = new ArrayList();
        for (String item : strings) {
          this.addToStrings(item);
        }
    } else {
      this.strings = null;
    }
    return (A) this;
  }
  
  public A withStrings(String... strings) {
    if (this.strings != null) {
        this.strings.clear();
        _visitables.remove("strings");
    }
    if (strings != null) {
      for (String item : strings) {
        this.addToStrings(item);
      }
    }
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public A withVersions(List<String> versions) {
    if (versions != null) {
        this.versions = new ArrayList();
        for (String item : versions) {
          this.addToVersions(item);
        }
    } else {
      this.versions = null;
    }
    return (A) this;
  }
  
  public A withVersions(String... versions) {
    if (this.versions != null) {
        this.versions.clear();
        _visitables.remove("versions");
    }
    if (versions != null) {
      for (String item : versions) {
        this.addToVersions(item);
      }
    }
    return (A) this;
  }
  
}