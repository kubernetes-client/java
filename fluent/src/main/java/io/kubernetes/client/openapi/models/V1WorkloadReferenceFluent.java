package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WorkloadReferenceFluent<A extends io.kubernetes.client.openapi.models.V1WorkloadReferenceFluent<A>> extends BaseFluent<A>{

  private String name;
  private String podGroup;
  private String podGroupReplicaKey;

  public V1WorkloadReferenceFluent() {
  }
  
  public V1WorkloadReferenceFluent(V1WorkloadReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1WorkloadReference instance) {
    instance = instance != null ? instance : new V1WorkloadReference();
    if (instance != null) {
        this.withName(instance.getName());
        this.withPodGroup(instance.getPodGroup());
        this.withPodGroupReplicaKey(instance.getPodGroupReplicaKey());
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
    V1WorkloadReferenceFluent that = (V1WorkloadReferenceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(podGroup, that.podGroup))) {
      return false;
    }
    if (!(Objects.equals(podGroupReplicaKey, that.podGroupReplicaKey))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPodGroup() {
    return this.podGroup;
  }
  
  public String getPodGroupReplicaKey() {
    return this.podGroupReplicaKey;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPodGroup() {
    return this.podGroup != null;
  }
  
  public boolean hasPodGroupReplicaKey() {
    return this.podGroupReplicaKey != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, podGroup, podGroupReplicaKey);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(podGroup == null)) {
        sb.append("podGroup:");
        sb.append(podGroup);
        sb.append(",");
    }
    if (!(podGroupReplicaKey == null)) {
        sb.append("podGroupReplicaKey:");
        sb.append(podGroupReplicaKey);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withPodGroup(String podGroup) {
    this.podGroup = podGroup;
    return (A) this;
  }
  
  public A withPodGroupReplicaKey(String podGroupReplicaKey) {
    this.podGroupReplicaKey = podGroupReplicaKey;
    return (A) this;
  }
  
}