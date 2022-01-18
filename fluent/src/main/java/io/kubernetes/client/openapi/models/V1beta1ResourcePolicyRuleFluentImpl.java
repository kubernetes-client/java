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
public class V1beta1ResourcePolicyRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleFluent<A> {
  public V1beta1ResourcePolicyRuleFluentImpl() {}

  public V1beta1ResourcePolicyRuleFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withClusterScope(instance.getClusterScope());

    this.withNamespaces(instance.getNamespaces());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());
  }

  private java.util.List<java.lang.String> apiGroups;
  private java.lang.Boolean clusterScope;
  private java.util.List<java.lang.String> namespaces;
  private java.util.List<java.lang.String> resources;
  private java.util.List<java.lang.String> verbs;

  public A addToApiGroups(java.lang.Integer index, java.lang.String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new java.util.ArrayList<java.lang.String>();
    }
    this.apiGroups.add(index, item);
    return (A) this;
  }

  public A setToApiGroups(java.lang.Integer index, java.lang.String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new java.util.ArrayList<java.lang.String>();
    }
    this.apiGroups.set(index, item);
    return (A) this;
  }

  public A addToApiGroups(java.lang.String... items) {
    if (this.apiGroups == null) {
      this.apiGroups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }

  public A addAllToApiGroups(java.util.Collection<java.lang.String> items) {
    if (this.apiGroups == null) {
      this.apiGroups = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }

  public A removeFromApiGroups(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.apiGroups != null) {
        this.apiGroups.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromApiGroups(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.apiGroups != null) {
        this.apiGroups.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getApiGroups() {
    return this.apiGroups;
  }

  public java.lang.String getApiGroup(java.lang.Integer index) {
    return this.apiGroups.get(index);
  }

  public java.lang.String getFirstApiGroup() {
    return this.apiGroups.get(0);
  }

  public java.lang.String getLastApiGroup() {
    return this.apiGroups.get(apiGroups.size() - 1);
  }

  public java.lang.String getMatchingApiGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : apiGroups) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingApiGroup(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : apiGroups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withApiGroups(java.util.List<java.lang.String> apiGroups) {
    if (apiGroups != null) {
      this.apiGroups = new java.util.ArrayList();
      for (java.lang.String item : apiGroups) {
        this.addToApiGroups(item);
      }
    } else {
      this.apiGroups = null;
    }
    return (A) this;
  }

  public A withApiGroups(java.lang.String... apiGroups) {
    if (this.apiGroups != null) {
      this.apiGroups.clear();
    }
    if (apiGroups != null) {
      for (java.lang.String item : apiGroups) {
        this.addToApiGroups(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasApiGroups() {
    return apiGroups != null && !apiGroups.isEmpty();
  }

  public A addNewApiGroup(java.lang.String original) {
    return (A) addToApiGroups(new String(original));
  }

  public java.lang.Boolean getClusterScope() {
    return this.clusterScope;
  }

  public A withClusterScope(java.lang.Boolean clusterScope) {
    this.clusterScope = clusterScope;
    return (A) this;
  }

  public java.lang.Boolean hasClusterScope() {
    return this.clusterScope != null;
  }

  public A addToNamespaces(java.lang.Integer index, java.lang.String item) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    this.namespaces.add(index, item);
    return (A) this;
  }

  public A setToNamespaces(java.lang.Integer index, java.lang.String item) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    this.namespaces.set(index, item);
    return (A) this;
  }

  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }

  public A addAllToNamespaces(java.util.Collection<java.lang.String> items) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }

  public A removeFromNamespaces(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.namespaces != null) {
        this.namespaces.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromNamespaces(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.namespaces != null) {
        this.namespaces.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getNamespaces() {
    return this.namespaces;
  }

  public java.lang.String getNamespace(java.lang.Integer index) {
    return this.namespaces.get(index);
  }

  public java.lang.String getFirstNamespace() {
    return this.namespaces.get(0);
  }

  public java.lang.String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }

  public java.lang.String getMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : namespaces) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : namespaces) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNamespaces(java.util.List<java.lang.String> namespaces) {
    if (namespaces != null) {
      this.namespaces = new java.util.ArrayList();
      for (java.lang.String item : namespaces) {
        this.addToNamespaces(item);
      }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }

  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {
      this.namespaces.clear();
    }
    if (namespaces != null) {
      for (java.lang.String item : namespaces) {
        this.addToNamespaces(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNamespaces() {
    return namespaces != null && !namespaces.isEmpty();
  }

  public A addNewNamespace(java.lang.String original) {
    return (A) addToNamespaces(new String(original));
  }

  public A addToResources(java.lang.Integer index, java.lang.String item) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<java.lang.String>();
    }
    this.resources.add(index, item);
    return (A) this;
  }

  public A setToResources(java.lang.Integer index, java.lang.String item) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<java.lang.String>();
    }
    this.resources.set(index, item);
    return (A) this;
  }

  public A addToResources(java.lang.String... items) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }

  public A addAllToResources(java.util.Collection<java.lang.String> items) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }

  public A removeFromResources(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.resources != null) {
        this.resources.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromResources(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.resources != null) {
        this.resources.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getResources() {
    return this.resources;
  }

  public java.lang.String getResource(java.lang.Integer index) {
    return this.resources.get(index);
  }

  public java.lang.String getFirstResource() {
    return this.resources.get(0);
  }

  public java.lang.String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }

  public java.lang.String getMatchingResource(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : resources) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingResource(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : resources) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResources(java.util.List<java.lang.String> resources) {
    if (resources != null) {
      this.resources = new java.util.ArrayList();
      for (java.lang.String item : resources) {
        this.addToResources(item);
      }
    } else {
      this.resources = null;
    }
    return (A) this;
  }

  public A withResources(java.lang.String... resources) {
    if (this.resources != null) {
      this.resources.clear();
    }
    if (resources != null) {
      for (java.lang.String item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }

  public A addNewResource(java.lang.String original) {
    return (A) addToResources(new String(original));
  }

  public A addToVerbs(java.lang.Integer index, java.lang.String item) {
    if (this.verbs == null) {
      this.verbs = new java.util.ArrayList<java.lang.String>();
    }
    this.verbs.add(index, item);
    return (A) this;
  }

  public A setToVerbs(java.lang.Integer index, java.lang.String item) {
    if (this.verbs == null) {
      this.verbs = new java.util.ArrayList<java.lang.String>();
    }
    this.verbs.set(index, item);
    return (A) this;
  }

  public A addToVerbs(java.lang.String... items) {
    if (this.verbs == null) {
      this.verbs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }

  public A addAllToVerbs(java.util.Collection<java.lang.String> items) {
    if (this.verbs == null) {
      this.verbs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }

  public A removeFromVerbs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.verbs != null) {
        this.verbs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVerbs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.verbs != null) {
        this.verbs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getVerbs() {
    return this.verbs;
  }

  public java.lang.String getVerb(java.lang.Integer index) {
    return this.verbs.get(index);
  }

  public java.lang.String getFirstVerb() {
    return this.verbs.get(0);
  }

  public java.lang.String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }

  public java.lang.String getMatchingVerb(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : verbs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVerb(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : verbs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVerbs(java.util.List<java.lang.String> verbs) {
    if (verbs != null) {
      this.verbs = new java.util.ArrayList();
      for (java.lang.String item : verbs) {
        this.addToVerbs(item);
      }
    } else {
      this.verbs = null;
    }
    return (A) this;
  }

  public A withVerbs(java.lang.String... verbs) {
    if (this.verbs != null) {
      this.verbs.clear();
    }
    if (verbs != null) {
      for (java.lang.String item : verbs) {
        this.addToVerbs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVerbs() {
    return verbs != null && !verbs.isEmpty();
  }

  public A addNewVerb(java.lang.String original) {
    return (A) addToVerbs(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1ResourcePolicyRuleFluentImpl that = (V1beta1ResourcePolicyRuleFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) : that.apiGroups != null)
      return false;
    if (clusterScope != null ? !clusterScope.equals(that.clusterScope) : that.clusterScope != null)
      return false;
    if (namespaces != null ? !namespaces.equals(that.namespaces) : that.namespaces != null)
      return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    if (verbs != null ? !verbs.equals(that.verbs) : that.verbs != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiGroups, clusterScope, namespaces, resources, verbs, super.hashCode());
  }
}
