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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1OwnerReferenceFluentImpl<A extends V1OwnerReferenceFluent<A>> extends BaseFluent<A>
    implements V1OwnerReferenceFluent<A> {
  public V1OwnerReferenceFluentImpl() {}

  public V1OwnerReferenceFluentImpl(io.kubernetes.client.openapi.models.V1OwnerReference instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    this.withController(instance.getController());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());
  }

  private String apiVersion;
  private Boolean blockOwnerDeletion;
  private java.lang.Boolean controller;
  private java.lang.String kind;
  private java.lang.String name;
  private java.lang.String uid;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public java.lang.Boolean getBlockOwnerDeletion() {
    return this.blockOwnerDeletion;
  }

  public A withBlockOwnerDeletion(java.lang.Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return (A) this;
  }

  public java.lang.Boolean hasBlockOwnerDeletion() {
    return this.blockOwnerDeletion != null;
  }

  public java.lang.Boolean getController() {
    return this.controller;
  }

  public A withController(java.lang.Boolean controller) {
    this.controller = controller;
    return (A) this;
  }

  public java.lang.Boolean hasController() {
    return this.controller != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1OwnerReferenceFluentImpl that = (V1OwnerReferenceFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (blockOwnerDeletion != null
        ? !blockOwnerDeletion.equals(that.blockOwnerDeletion)
        : that.blockOwnerDeletion != null) return false;
    if (controller != null ? !controller.equals(that.controller) : that.controller != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, blockOwnerDeletion, controller, kind, name, uid, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (blockOwnerDeletion != null) {
      sb.append("blockOwnerDeletion:");
      sb.append(blockOwnerDeletion + ",");
    }
    if (controller != null) {
      sb.append("controller:");
      sb.append(controller + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (uid != null) {
      sb.append("uid:");
      sb.append(uid);
    }
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
