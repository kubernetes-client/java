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
public class V1alpha1ServerStorageVersionFluent<A extends io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<A>> extends BaseFluent<A>{

  private String apiServerID;
  private List<String> decodableVersions;
  private String encodingVersion;
  private List<String> servedVersions;

  public V1alpha1ServerStorageVersionFluent() {
  }
  
  public V1alpha1ServerStorageVersionFluent(V1alpha1ServerStorageVersion instance) {
    this.copyInstance(instance);
  }

  public A addAllToDecodableVersions(Collection<String> items) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList();
    }
    for (String item : items) {
      this.decodableVersions.add(item);
    }
    return (A) this;
  }
  
  public A addAllToServedVersions(Collection<String> items) {
    if (this.servedVersions == null) {
      this.servedVersions = new ArrayList();
    }
    for (String item : items) {
      this.servedVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToDecodableVersions(String... items) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList();
    }
    for (String item : items) {
      this.decodableVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToDecodableVersions(int index,String item) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList();
    }
    this.decodableVersions.add(index, item);
    return (A) this;
  }
  
  public A addToServedVersions(String... items) {
    if (this.servedVersions == null) {
      this.servedVersions = new ArrayList();
    }
    for (String item : items) {
      this.servedVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToServedVersions(int index,String item) {
    if (this.servedVersions == null) {
      this.servedVersions = new ArrayList();
    }
    this.servedVersions.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1alpha1ServerStorageVersion instance) {
    instance = instance != null ? instance : new V1alpha1ServerStorageVersion();
    if (instance != null) {
        this.withApiServerID(instance.getApiServerID());
        this.withDecodableVersions(instance.getDecodableVersions());
        this.withEncodingVersion(instance.getEncodingVersion());
        this.withServedVersions(instance.getServedVersions());
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
    V1alpha1ServerStorageVersionFluent that = (V1alpha1ServerStorageVersionFluent) o;
    if (!(Objects.equals(apiServerID, that.apiServerID))) {
      return false;
    }
    if (!(Objects.equals(decodableVersions, that.decodableVersions))) {
      return false;
    }
    if (!(Objects.equals(encodingVersion, that.encodingVersion))) {
      return false;
    }
    if (!(Objects.equals(servedVersions, that.servedVersions))) {
      return false;
    }
    return true;
  }
  
  public String getApiServerID() {
    return this.apiServerID;
  }
  
  public String getDecodableVersion(int index) {
    return this.decodableVersions.get(index);
  }
  
  public List<String> getDecodableVersions() {
    return this.decodableVersions;
  }
  
  public String getEncodingVersion() {
    return this.encodingVersion;
  }
  
  public String getFirstDecodableVersion() {
    return this.decodableVersions.get(0);
  }
  
  public String getFirstServedVersion() {
    return this.servedVersions.get(0);
  }
  
  public String getLastDecodableVersion() {
    return this.decodableVersions.get(decodableVersions.size() - 1);
  }
  
  public String getLastServedVersion() {
    return this.servedVersions.get(servedVersions.size() - 1);
  }
  
  public String getMatchingDecodableVersion(Predicate<String> predicate) {
      for (String item : decodableVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingServedVersion(Predicate<String> predicate) {
      for (String item : servedVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getServedVersion(int index) {
    return this.servedVersions.get(index);
  }
  
  public List<String> getServedVersions() {
    return this.servedVersions;
  }
  
  public boolean hasApiServerID() {
    return this.apiServerID != null;
  }
  
  public boolean hasDecodableVersions() {
    return this.decodableVersions != null && !(this.decodableVersions.isEmpty());
  }
  
  public boolean hasEncodingVersion() {
    return this.encodingVersion != null;
  }
  
  public boolean hasMatchingDecodableVersion(Predicate<String> predicate) {
      for (String item : decodableVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingServedVersion(Predicate<String> predicate) {
      for (String item : servedVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasServedVersions() {
    return this.servedVersions != null && !(this.servedVersions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(apiServerID, decodableVersions, encodingVersion, servedVersions);
  }
  
  public A removeAllFromDecodableVersions(Collection<String> items) {
    if (this.decodableVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.decodableVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromServedVersions(Collection<String> items) {
    if (this.servedVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.servedVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromDecodableVersions(String... items) {
    if (this.decodableVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.decodableVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromServedVersions(String... items) {
    if (this.servedVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.servedVersions.remove(item);
    }
    return (A) this;
  }
  
  public A setToDecodableVersions(int index,String item) {
    if (this.decodableVersions == null) {
      this.decodableVersions = new ArrayList();
    }
    this.decodableVersions.set(index, item);
    return (A) this;
  }
  
  public A setToServedVersions(int index,String item) {
    if (this.servedVersions == null) {
      this.servedVersions = new ArrayList();
    }
    this.servedVersions.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiServerID == null)) {
        sb.append("apiServerID:");
        sb.append(apiServerID);
        sb.append(",");
    }
    if (!(decodableVersions == null) && !(decodableVersions.isEmpty())) {
        sb.append("decodableVersions:");
        sb.append(decodableVersions);
        sb.append(",");
    }
    if (!(encodingVersion == null)) {
        sb.append("encodingVersion:");
        sb.append(encodingVersion);
        sb.append(",");
    }
    if (!(servedVersions == null) && !(servedVersions.isEmpty())) {
        sb.append("servedVersions:");
        sb.append(servedVersions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiServerID(String apiServerID) {
    this.apiServerID = apiServerID;
    return (A) this;
  }
  
  public A withDecodableVersions(List<String> decodableVersions) {
    if (decodableVersions != null) {
        this.decodableVersions = new ArrayList();
        for (String item : decodableVersions) {
          this.addToDecodableVersions(item);
        }
    } else {
      this.decodableVersions = null;
    }
    return (A) this;
  }
  
  public A withDecodableVersions(String... decodableVersions) {
    if (this.decodableVersions != null) {
        this.decodableVersions.clear();
        _visitables.remove("decodableVersions");
    }
    if (decodableVersions != null) {
      for (String item : decodableVersions) {
        this.addToDecodableVersions(item);
      }
    }
    return (A) this;
  }
  
  public A withEncodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
    return (A) this;
  }
  
  public A withServedVersions(List<String> servedVersions) {
    if (servedVersions != null) {
        this.servedVersions = new ArrayList();
        for (String item : servedVersions) {
          this.addToServedVersions(item);
        }
    } else {
      this.servedVersions = null;
    }
    return (A) this;
  }
  
  public A withServedVersions(String... servedVersions) {
    if (this.servedVersions != null) {
        this.servedVersions.clear();
        _visitables.remove("servedVersions");
    }
    if (servedVersions != null) {
      for (String item : servedVersions) {
        this.addToServedVersions(item);
      }
    }
    return (A) this;
  }
  
}