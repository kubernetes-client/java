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
public class V1IngressTLSFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1IngressTLSFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1IngressTLSFluent<A> {
  public V1IngressTLSFluentImpl() {}

  public V1IngressTLSFluentImpl(io.kubernetes.client.openapi.models.V1IngressTLS instance) {
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());
  }

  private java.util.List<java.lang.String> hosts;
  private java.lang.String secretName;

  public A addToHosts(java.lang.Integer index, java.lang.String item) {
    if (this.hosts == null) {
      this.hosts = new java.util.ArrayList<java.lang.String>();
    }
    this.hosts.add(index, item);
    return (A) this;
  }

  public A setToHosts(java.lang.Integer index, java.lang.String item) {
    if (this.hosts == null) {
      this.hosts = new java.util.ArrayList<java.lang.String>();
    }
    this.hosts.set(index, item);
    return (A) this;
  }

  public A addToHosts(java.lang.String... items) {
    if (this.hosts == null) {
      this.hosts = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.hosts.add(item);
    }
    return (A) this;
  }

  public A addAllToHosts(java.util.Collection<java.lang.String> items) {
    if (this.hosts == null) {
      this.hosts = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.hosts.add(item);
    }
    return (A) this;
  }

  public A removeFromHosts(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.hosts != null) {
        this.hosts.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromHosts(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.hosts != null) {
        this.hosts.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getHosts() {
    return this.hosts;
  }

  public java.lang.String getHost(java.lang.Integer index) {
    return this.hosts.get(index);
  }

  public java.lang.String getFirstHost() {
    return this.hosts.get(0);
  }

  public java.lang.String getLastHost() {
    return this.hosts.get(hosts.size() - 1);
  }

  public java.lang.String getMatchingHost(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : hosts) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingHost(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : hosts) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withHosts(java.util.List<java.lang.String> hosts) {
    if (hosts != null) {
      this.hosts = new java.util.ArrayList();
      for (java.lang.String item : hosts) {
        this.addToHosts(item);
      }
    } else {
      this.hosts = null;
    }
    return (A) this;
  }

  public A withHosts(java.lang.String... hosts) {
    if (this.hosts != null) {
      this.hosts.clear();
    }
    if (hosts != null) {
      for (java.lang.String item : hosts) {
        this.addToHosts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasHosts() {
    return hosts != null && !hosts.isEmpty();
  }

  public A addNewHost(java.lang.String original) {
    return (A) addToHosts(new String(original));
  }

  public java.lang.String getSecretName() {
    return this.secretName;
  }

  public A withSecretName(java.lang.String secretName) {
    this.secretName = secretName;
    return (A) this;
  }

  public java.lang.Boolean hasSecretName() {
    return this.secretName != null;
  }

  /** Method is deprecated. use withSecretName instead. */
  @java.lang.Deprecated
  public A withNewSecretName(java.lang.String original) {
    return (A) withSecretName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressTLSFluentImpl that = (V1IngressTLSFluentImpl) o;
    if (hosts != null ? !hosts.equals(that.hosts) : that.hosts != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) : that.secretName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(hosts, secretName, super.hashCode());
  }
}
