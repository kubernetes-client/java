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
public class V1RuleWithOperationsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<A> {
  public V1RuleWithOperationsFluentImpl() {}

  public V1RuleWithOperationsFluentImpl(
      io.kubernetes.client.openapi.models.V1RuleWithOperations instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withApiVersions(instance.getApiVersions());

    this.withOperations(instance.getOperations());

    this.withResources(instance.getResources());

    this.withScope(instance.getScope());
  }

  private java.util.List<java.lang.String> apiGroups;
  private java.util.List<java.lang.String> apiVersions;
  private java.util.List<java.lang.String> operations;
  private java.util.List<java.lang.String> resources;
  private java.lang.String scope;

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

  public A addToApiVersions(java.lang.Integer index, java.lang.String item) {
    if (this.apiVersions == null) {
      this.apiVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.apiVersions.add(index, item);
    return (A) this;
  }

  public A setToApiVersions(java.lang.Integer index, java.lang.String item) {
    if (this.apiVersions == null) {
      this.apiVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.apiVersions.set(index, item);
    return (A) this;
  }

  public A addToApiVersions(java.lang.String... items) {
    if (this.apiVersions == null) {
      this.apiVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.apiVersions.add(item);
    }
    return (A) this;
  }

  public A addAllToApiVersions(java.util.Collection<java.lang.String> items) {
    if (this.apiVersions == null) {
      this.apiVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.apiVersions.add(item);
    }
    return (A) this;
  }

  public A removeFromApiVersions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.apiVersions != null) {
        this.apiVersions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromApiVersions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.apiVersions != null) {
        this.apiVersions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getApiVersions() {
    return this.apiVersions;
  }

  public java.lang.String getApiVersion(java.lang.Integer index) {
    return this.apiVersions.get(index);
  }

  public java.lang.String getFirstApiVersion() {
    return this.apiVersions.get(0);
  }

  public java.lang.String getLastApiVersion() {
    return this.apiVersions.get(apiVersions.size() - 1);
  }

  public java.lang.String getMatchingApiVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : apiVersions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingApiVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : apiVersions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withApiVersions(java.util.List<java.lang.String> apiVersions) {
    if (apiVersions != null) {
      this.apiVersions = new java.util.ArrayList();
      for (java.lang.String item : apiVersions) {
        this.addToApiVersions(item);
      }
    } else {
      this.apiVersions = null;
    }
    return (A) this;
  }

  public A withApiVersions(java.lang.String... apiVersions) {
    if (this.apiVersions != null) {
      this.apiVersions.clear();
    }
    if (apiVersions != null) {
      for (java.lang.String item : apiVersions) {
        this.addToApiVersions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasApiVersions() {
    return apiVersions != null && !apiVersions.isEmpty();
  }

  public A addNewApiVersion(java.lang.String original) {
    return (A) addToApiVersions(new String(original));
  }

  public A addToOperations(java.lang.Integer index, java.lang.String item) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<java.lang.String>();
    }
    this.operations.add(index, item);
    return (A) this;
  }

  public A setToOperations(java.lang.Integer index, java.lang.String item) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<java.lang.String>();
    }
    this.operations.set(index, item);
    return (A) this;
  }

  public A addToOperations(java.lang.String... items) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.operations.add(item);
    }
    return (A) this;
  }

  public A addAllToOperations(java.util.Collection<java.lang.String> items) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.operations.add(item);
    }
    return (A) this;
  }

  public A removeFromOperations(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.operations != null) {
        this.operations.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromOperations(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.operations != null) {
        this.operations.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getOperations() {
    return this.operations;
  }

  public java.lang.String getOperation(java.lang.Integer index) {
    return this.operations.get(index);
  }

  public java.lang.String getFirstOperation() {
    return this.operations.get(0);
  }

  public java.lang.String getLastOperation() {
    return this.operations.get(operations.size() - 1);
  }

  public java.lang.String getMatchingOperation(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : operations) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingOperation(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : operations) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withOperations(java.util.List<java.lang.String> operations) {
    if (operations != null) {
      this.operations = new java.util.ArrayList();
      for (java.lang.String item : operations) {
        this.addToOperations(item);
      }
    } else {
      this.operations = null;
    }
    return (A) this;
  }

  public A withOperations(java.lang.String... operations) {
    if (this.operations != null) {
      this.operations.clear();
    }
    if (operations != null) {
      for (java.lang.String item : operations) {
        this.addToOperations(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasOperations() {
    return operations != null && !operations.isEmpty();
  }

  public A addNewOperation(java.lang.String original) {
    return (A) addToOperations(new String(original));
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

  public java.lang.String getScope() {
    return this.scope;
  }

  public A withScope(java.lang.String scope) {
    this.scope = scope;
    return (A) this;
  }

  public java.lang.Boolean hasScope() {
    return this.scope != null;
  }

  /** Method is deprecated. use withScope instead. */
  @java.lang.Deprecated
  public A withNewScope(java.lang.String original) {
    return (A) withScope(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RuleWithOperationsFluentImpl that = (V1RuleWithOperationsFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) : that.apiGroups != null)
      return false;
    if (apiVersions != null ? !apiVersions.equals(that.apiVersions) : that.apiVersions != null)
      return false;
    if (operations != null ? !operations.equals(that.operations) : that.operations != null)
      return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiGroups, apiVersions, operations, resources, scope, super.hashCode());
  }
}
