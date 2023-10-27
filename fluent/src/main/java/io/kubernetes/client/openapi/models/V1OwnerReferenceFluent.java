package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1OwnerReferenceFluent<A extends V1OwnerReferenceFluent<A>> extends BaseFluent<A>{
  public V1OwnerReferenceFluent() {
  }
  
  public V1OwnerReferenceFluent(V1OwnerReference instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private Boolean blockOwnerDeletion;
  private Boolean controller;
  private String kind;
  private String name;
  private String uid;
  
  protected void copyInstance(V1OwnerReference instance) {
    instance = (instance != null ? instance : new V1OwnerReference());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());
          this.withController(instance.getController());
          this.withKind(instance.getKind());
          this.withName(instance.getName());
          this.withUid(instance.getUid());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public Boolean getBlockOwnerDeletion() {
    return this.blockOwnerDeletion;
  }
  
  public A withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return (A) this;
  }
  
  public boolean hasBlockOwnerDeletion() {
    return this.blockOwnerDeletion != null;
  }
  
  public Boolean getController() {
    return this.controller;
  }
  
  public A withController(Boolean controller) {
    this.controller = controller;
    return (A) this;
  }
  
  public boolean hasController() {
    return this.controller != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1OwnerReferenceFluent that = (V1OwnerReferenceFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(blockOwnerDeletion, that.blockOwnerDeletion)) return false;
    if (!java.util.Objects.equals(controller, that.controller)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(uid, that.uid)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  blockOwnerDeletion,  controller,  kind,  name,  uid,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (blockOwnerDeletion != null) { sb.append("blockOwnerDeletion:"); sb.append(blockOwnerDeletion + ","); }
    if (controller != null) { sb.append("controller:"); sb.append(controller + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBlockOwnerDeletion() {
    return withBlockOwnerDeletion(true);
  }
  
  public A withController() {
    return withController(true);
  }
  

}