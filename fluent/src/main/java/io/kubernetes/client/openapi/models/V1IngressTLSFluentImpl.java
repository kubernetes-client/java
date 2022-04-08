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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1IngressTLSFluentImpl<A extends V1IngressTLSFluent<A>> extends BaseFluent<A>
    implements V1IngressTLSFluent<A> {
  public V1IngressTLSFluentImpl() {}

  public V1IngressTLSFluentImpl(io.kubernetes.client.openapi.models.V1IngressTLS instance) {
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());
  }

  private List<String> hosts;
  private java.lang.String secretName;

  public A addToHosts(Integer index, java.lang.String item) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<java.lang.String>();
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

  public A addAllToHosts(Collection<java.lang.String> items) {
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

  public java.lang.String getMatchingHost(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : hosts) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingHost(java.util.function.Predicate<java.lang.String> predicate) {
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

  public boolean equals(Object o) {
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hosts != null && !hosts.isEmpty()) {
      sb.append("hosts:");
      sb.append(hosts + ",");
    }
    if (secretName != null) {
      sb.append("secretName:");
      sb.append(secretName);
    }
    sb.append("}");
    return sb.toString();
  }
}
