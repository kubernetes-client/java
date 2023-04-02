package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1OwnerReferenceFluentImpl<A extends V1OwnerReferenceFluent<A>> extends BaseFluent<A> implements V1OwnerReferenceFluent<A>{
  public V1OwnerReferenceFluentImpl() {
  }
  public V1OwnerReferenceFluentImpl(V1OwnerReference instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    this.withController(instance.getController());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());

  }
  private String apiVersion;
  private Boolean blockOwnerDeletion;
  private Boolean controller;
  private String kind;
  private String name;
  private String uid;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Boolean getBlockOwnerDeletion() {
    return this.blockOwnerDeletion;
  }
  public A withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion=blockOwnerDeletion; return (A) this;
  }
  public Boolean hasBlockOwnerDeletion() {
    return this.blockOwnerDeletion != null;
  }
  public Boolean getController() {
    return this.controller;
  }
  public A withController(Boolean controller) {
    this.controller=controller; return (A) this;
  }
  public Boolean hasController() {
    return this.controller != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1OwnerReferenceFluentImpl that = (V1OwnerReferenceFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (blockOwnerDeletion != null ? !blockOwnerDeletion.equals(that.blockOwnerDeletion) :that.blockOwnerDeletion != null) return false;
    if (controller != null ? !controller.equals(that.controller) :that.controller != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
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