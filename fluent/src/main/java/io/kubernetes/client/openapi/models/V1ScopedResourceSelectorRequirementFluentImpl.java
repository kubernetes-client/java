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
public class V1ScopedResourceSelectorRequirementFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<A> {
  public V1ScopedResourceSelectorRequirementFluentImpl() {}

  public V1ScopedResourceSelectorRequirementFluentImpl(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance) {
    this.withOperator(instance.getOperator());

    this.withScopeName(instance.getScopeName());

    this.withValues(instance.getValues());
  }

  private io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.OperatorEnum
      operator;
  private io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.ScopeNameEnum
      scopeName;
  private java.util.List<java.lang.String> values;

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.OperatorEnum
      getOperator() {
    return this.operator;
  }

  public A withOperator(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.OperatorEnum
          operator) {
    this.operator = operator;
    return (A) this;
  }

  public java.lang.Boolean hasOperator() {
    return this.operator != null;
  }

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.ScopeNameEnum
      getScopeName() {
    return this.scopeName;
  }

  public A withScopeName(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.ScopeNameEnum
          scopeName) {
    this.scopeName = scopeName;
    return (A) this;
  }

  public java.lang.Boolean hasScopeName() {
    return this.scopeName != null;
  }

  public A addToValues(java.lang.Integer index, java.lang.String item) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    this.values.add(index, item);
    return (A) this;
  }

  public A setToValues(java.lang.Integer index, java.lang.String item) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    this.values.set(index, item);
    return (A) this;
  }

  public A addToValues(java.lang.String... items) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.values.add(item);
    }
    return (A) this;
  }

  public A addAllToValues(java.util.Collection<java.lang.String> items) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.values.add(item);
    }
    return (A) this;
  }

  public A removeFromValues(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.values != null) {
        this.values.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromValues(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.values != null) {
        this.values.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getValues() {
    return this.values;
  }

  public java.lang.String getValue(java.lang.Integer index) {
    return this.values.get(index);
  }

  public java.lang.String getFirstValue() {
    return this.values.get(0);
  }

  public java.lang.String getLastValue() {
    return this.values.get(values.size() - 1);
  }

  public java.lang.String getMatchingValue(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : values) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingValue(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : values) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withValues(java.util.List<java.lang.String> values) {
    if (values != null) {
      this.values = new java.util.ArrayList();
      for (java.lang.String item : values) {
        this.addToValues(item);
      }
    } else {
      this.values = null;
    }
    return (A) this;
  }

  public A withValues(java.lang.String... values) {
    if (this.values != null) {
      this.values.clear();
    }
    if (values != null) {
      for (java.lang.String item : values) {
        this.addToValues(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasValues() {
    return values != null && !values.isEmpty();
  }

  public A addNewValue(java.lang.String original) {
    return (A) addToValues(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScopedResourceSelectorRequirementFluentImpl that =
        (V1ScopedResourceSelectorRequirementFluentImpl) o;
    if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
    if (scopeName != null ? !scopeName.equals(that.scopeName) : that.scopeName != null)
      return false;
    if (values != null ? !values.equals(that.values) : that.values != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(operator, scopeName, values, super.hashCode());
  }
}
