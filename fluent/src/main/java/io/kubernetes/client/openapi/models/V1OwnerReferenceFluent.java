package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1OwnerReferenceFluent<A extends io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private Boolean blockOwnerDeletion;
  private Boolean controller;
  private String kind;
  private String name;
  private String uid;

  public V1OwnerReferenceFluent() {
  }
  
  public V1OwnerReferenceFluent(V1OwnerReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1OwnerReference instance) {
    instance = instance != null ? instance : new V1OwnerReference();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());
        this.withController(instance.getController());
        this.withKind(instance.getKind());
        this.withName(instance.getName());
        this.withUid(instance.getUid());
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
    V1OwnerReferenceFluent that = (V1OwnerReferenceFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(blockOwnerDeletion, that.blockOwnerDeletion))) {
      return false;
    }
    if (!(Objects.equals(controller, that.controller))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public Boolean getBlockOwnerDeletion() {
    return this.blockOwnerDeletion;
  }
  
  public Boolean getController() {
    return this.controller;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasBlockOwnerDeletion() {
    return this.blockOwnerDeletion != null;
  }
  
  public boolean hasController() {
    return this.controller != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(blockOwnerDeletion == null)) {
        sb.append("blockOwnerDeletion:");
        sb.append(blockOwnerDeletion);
        sb.append(",");
    }
    if (!(controller == null)) {
        sb.append("controller:");
        sb.append(controller);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withBlockOwnerDeletion() {
    return withBlockOwnerDeletion(true);
  }
  
  public A withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return (A) this;
  }
  
  public A withController() {
    return withController(true);
  }
  
  public A withController(Boolean controller) {
    this.controller = controller;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
}