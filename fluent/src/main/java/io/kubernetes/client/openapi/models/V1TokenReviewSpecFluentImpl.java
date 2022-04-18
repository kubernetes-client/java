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
public class V1TokenReviewSpecFluentImpl<A extends V1TokenReviewSpecFluent<A>> extends BaseFluent<A>
    implements V1TokenReviewSpecFluent<A> {
  public V1TokenReviewSpecFluentImpl() {}

  public V1TokenReviewSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1TokenReviewSpec instance) {
    this.withAudiences(instance.getAudiences());

    this.withToken(instance.getToken());
  }

  private List<String> audiences;
  private java.lang.String token;

  public A addToAudiences(Integer index, java.lang.String item) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<java.lang.String>();
    }
    this.audiences.add(index, item);
    return (A) this;
  }

  public A setToAudiences(java.lang.Integer index, java.lang.String item) {
    if (this.audiences == null) {
      this.audiences = new java.util.ArrayList<java.lang.String>();
    }
    this.audiences.set(index, item);
    return (A) this;
  }

  public A addToAudiences(java.lang.String... items) {
    if (this.audiences == null) {
      this.audiences = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }

  public A addAllToAudiences(Collection<java.lang.String> items) {
    if (this.audiences == null) {
      this.audiences = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }

  public A removeFromAudiences(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.audiences != null) {
        this.audiences.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAudiences(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.audiences != null) {
        this.audiences.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAudiences() {
    return this.audiences;
  }

  public java.lang.String getAudience(java.lang.Integer index) {
    return this.audiences.get(index);
  }

  public java.lang.String getFirstAudience() {
    return this.audiences.get(0);
  }

  public java.lang.String getLastAudience() {
    return this.audiences.get(audiences.size() - 1);
  }

  public java.lang.String getMatchingAudience(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : audiences) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : audiences) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAudiences(java.util.List<java.lang.String> audiences) {
    if (audiences != null) {
      this.audiences = new java.util.ArrayList();
      for (java.lang.String item : audiences) {
        this.addToAudiences(item);
      }
    } else {
      this.audiences = null;
    }
    return (A) this;
  }

  public A withAudiences(java.lang.String... audiences) {
    if (this.audiences != null) {
      this.audiences.clear();
    }
    if (audiences != null) {
      for (java.lang.String item : audiences) {
        this.addToAudiences(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAudiences() {
    return audiences != null && !audiences.isEmpty();
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public A withToken(java.lang.String token) {
    this.token = token;
    return (A) this;
  }

  public java.lang.Boolean hasToken() {
    return this.token != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenReviewSpecFluentImpl that = (V1TokenReviewSpecFluentImpl) o;
    if (audiences != null ? !audiences.equals(that.audiences) : that.audiences != null)
      return false;
    if (token != null ? !token.equals(that.token) : that.token != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(audiences, token, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audiences != null && !audiences.isEmpty()) {
      sb.append("audiences:");
      sb.append(audiences + ",");
    }
    if (token != null) {
      sb.append("token:");
      sb.append(token);
    }
    sb.append("}");
    return sb.toString();
  }
}
