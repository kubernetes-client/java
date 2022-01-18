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
public class V1NonResourceRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NonResourceRuleFluent<A> {
  public V1NonResourceRuleFluentImpl() {}

  public V1NonResourceRuleFluentImpl(
      io.kubernetes.client.openapi.models.V1NonResourceRule instance) {
    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withVerbs(instance.getVerbs());
  }

  private java.util.List<java.lang.String> nonResourceURLs;
  private java.util.List<java.lang.String> verbs;

  public A addToNonResourceURLs(java.lang.Integer index, java.lang.String item) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();
    }
    this.nonResourceURLs.add(index, item);
    return (A) this;
  }

  public A setToNonResourceURLs(java.lang.Integer index, java.lang.String item) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();
    }
    this.nonResourceURLs.set(index, item);
    return (A) this;
  }

  public A addToNonResourceURLs(java.lang.String... items) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.nonResourceURLs.add(item);
    }
    return (A) this;
  }

  public A addAllToNonResourceURLs(java.util.Collection<java.lang.String> items) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.nonResourceURLs.add(item);
    }
    return (A) this;
  }

  public A removeFromNonResourceURLs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.nonResourceURLs != null) {
        this.nonResourceURLs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromNonResourceURLs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.nonResourceURLs != null) {
        this.nonResourceURLs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getNonResourceURLs() {
    return this.nonResourceURLs;
  }

  public java.lang.String getNonResourceURL(java.lang.Integer index) {
    return this.nonResourceURLs.get(index);
  }

  public java.lang.String getFirstNonResourceURL() {
    return this.nonResourceURLs.get(0);
  }

  public java.lang.String getLastNonResourceURL() {
    return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
  }

  public java.lang.String getMatchingNonResourceURL(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : nonResourceURLs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNonResourceURL(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : nonResourceURLs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNonResourceURLs(java.util.List<java.lang.String> nonResourceURLs) {
    if (nonResourceURLs != null) {
      this.nonResourceURLs = new java.util.ArrayList();
      for (java.lang.String item : nonResourceURLs) {
        this.addToNonResourceURLs(item);
      }
    } else {
      this.nonResourceURLs = null;
    }
    return (A) this;
  }

  public A withNonResourceURLs(java.lang.String... nonResourceURLs) {
    if (this.nonResourceURLs != null) {
      this.nonResourceURLs.clear();
    }
    if (nonResourceURLs != null) {
      for (java.lang.String item : nonResourceURLs) {
        this.addToNonResourceURLs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNonResourceURLs() {
    return nonResourceURLs != null && !nonResourceURLs.isEmpty();
  }

  public A addNewNonResourceURL(java.lang.String original) {
    return (A) addToNonResourceURLs(new String(original));
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
    V1NonResourceRuleFluentImpl that = (V1NonResourceRuleFluentImpl) o;
    if (nonResourceURLs != null
        ? !nonResourceURLs.equals(that.nonResourceURLs)
        : that.nonResourceURLs != null) return false;
    if (verbs != null ? !verbs.equals(that.verbs) : that.verbs != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nonResourceURLs, verbs, super.hashCode());
  }
}
