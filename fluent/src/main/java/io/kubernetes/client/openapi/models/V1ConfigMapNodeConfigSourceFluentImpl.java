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
public class V1ConfigMapNodeConfigSourceFluentImpl<A extends V1ConfigMapNodeConfigSourceFluent<A>>
    extends BaseFluent<A> implements V1ConfigMapNodeConfigSourceFluent<A> {
  public V1ConfigMapNodeConfigSourceFluentImpl() {}

  public V1ConfigMapNodeConfigSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
    this.withKubeletConfigKey(instance.getKubeletConfigKey());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());
  }

  private String kubeletConfigKey;
  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.String resourceVersion;
  private java.lang.String uid;

  public java.lang.String getKubeletConfigKey() {
    return this.kubeletConfigKey;
  }

  public A withKubeletConfigKey(java.lang.String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return (A) this;
  }

  public Boolean hasKubeletConfigKey() {
    return this.kubeletConfigKey != null;
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

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }

  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }

  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }

  public java.lang.Boolean hasResourceVersion() {
    return this.resourceVersion != null;
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
    V1ConfigMapNodeConfigSourceFluentImpl that = (V1ConfigMapNodeConfigSourceFluentImpl) o;
    if (kubeletConfigKey != null
        ? !kubeletConfigKey.equals(that.kubeletConfigKey)
        : that.kubeletConfigKey != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    if (resourceVersion != null
        ? !resourceVersion.equals(that.resourceVersion)
        : that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        kubeletConfigKey, name, namespace, resourceVersion, uid, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (kubeletConfigKey != null) {
      sb.append("kubeletConfigKey:");
      sb.append(kubeletConfigKey + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (namespace != null) {
      sb.append("namespace:");
      sb.append(namespace + ",");
    }
    if (resourceVersion != null) {
      sb.append("resourceVersion:");
      sb.append(resourceVersion + ",");
    }
    if (uid != null) {
      sb.append("uid:");
      sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
}
