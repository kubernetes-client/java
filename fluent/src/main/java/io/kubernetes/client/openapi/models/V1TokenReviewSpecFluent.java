package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<A>> extends BaseFluent<A>{

  private List<String> audiences;
  private String token;

  public V1TokenReviewSpecFluent() {
  }
  
  public V1TokenReviewSpecFluent(V1TokenReviewSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToAudiences(Collection<String> items) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    for (String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }
  
  public A addToAudiences(String... items) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    for (String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }
  
  public A addToAudiences(int index,String item) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    this.audiences.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1TokenReviewSpec instance) {
    instance = instance != null ? instance : new V1TokenReviewSpec();
    if (instance != null) {
        this.withAudiences(instance.getAudiences());
        this.withToken(instance.getToken());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1TokenReviewSpecFluent that = (V1TokenReviewSpecFluent) o;
    if (!(Objects.equals(audiences, that.audiences))) {
      return false;
    }
    if (!(Objects.equals(token, that.token))) {
      return false;
    }
    return true;
  }
  
  public String getAudience(int index) {
    return this.audiences.get(index);
  }
  
  public List<String> getAudiences() {
    return this.audiences;
  }
  
  public String getFirstAudience() {
    return this.audiences.get(0);
  }
  
  public String getLastAudience() {
    return this.audiences.get(audiences.size() - 1);
  }
  
  public String getMatchingAudience(Predicate<String> predicate) {
      for (String item : audiences) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getToken() {
    return this.token;
  }
  
  public boolean hasAudiences() {
    return this.audiences != null && !(this.audiences.isEmpty());
  }
  
  public boolean hasMatchingAudience(Predicate<String> predicate) {
      for (String item : audiences) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasToken() {
    return this.token != null;
  }
  
  public int hashCode() {
    return Objects.hash(audiences, token);
  }
  
  public A removeAllFromAudiences(Collection<String> items) {
    if (this.audiences == null) {
      return (A) this;
    }
    for (String item : items) {
      this.audiences.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromAudiences(String... items) {
    if (this.audiences == null) {
      return (A) this;
    }
    for (String item : items) {
      this.audiences.remove(item);
    }
    return (A) this;
  }
  
  public A setToAudiences(int index,String item) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    this.audiences.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(audiences == null) && !(audiences.isEmpty())) {
        sb.append("audiences:");
        sb.append(audiences);
        sb.append(",");
    }
    if (!(token == null)) {
        sb.append("token:");
        sb.append(token);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAudiences(List<String> audiences) {
    if (audiences != null) {
        this.audiences = new ArrayList();
        for (String item : audiences) {
          this.addToAudiences(item);
        }
    } else {
      this.audiences = null;
    }
    return (A) this;
  }
  
  public A withAudiences(String... audiences) {
    if (this.audiences != null) {
        this.audiences.clear();
        _visitables.remove("audiences");
    }
    if (audiences != null) {
      for (String item : audiences) {
        this.addToAudiences(item);
      }
    }
    return (A) this;
  }
  
  public A withToken(String token) {
    this.token = token;
    return (A) this;
  }
  
}