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
public class V1NonResourcePolicyRuleFluent<A extends io.kubernetes.client.openapi.models.V1NonResourcePolicyRuleFluent<A>> extends BaseFluent<A>{

  private List<String> nonResourceURLs;
  private List<String> verbs;

  public V1NonResourcePolicyRuleFluent() {
  }
  
  public V1NonResourcePolicyRuleFluent(V1NonResourcePolicyRule instance) {
    this.copyInstance(instance);
  }

  public A addAllToNonResourceURLs(Collection<String> items) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList();
    }
    for (String item : items) {
      this.nonResourceURLs.add(item);
    }
    return (A) this;
  }
  
  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }
  
  public A addToNonResourceURLs(String... items) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList();
    }
    for (String item : items) {
      this.nonResourceURLs.add(item);
    }
    return (A) this;
  }
  
  public A addToNonResourceURLs(int index,String item) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList();
    }
    this.nonResourceURLs.add(index, item);
    return (A) this;
  }
  
  public A addToVerbs(String... items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }
  
  public A addToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1NonResourcePolicyRule instance) {
    instance = instance != null ? instance : new V1NonResourcePolicyRule();
    if (instance != null) {
        this.withNonResourceURLs(instance.getNonResourceURLs());
        this.withVerbs(instance.getVerbs());
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
    V1NonResourcePolicyRuleFluent that = (V1NonResourcePolicyRuleFluent) o;
    if (!(Objects.equals(nonResourceURLs, that.nonResourceURLs))) {
      return false;
    }
    if (!(Objects.equals(verbs, that.verbs))) {
      return false;
    }
    return true;
  }
  
  public String getFirstNonResourceURL() {
    return this.nonResourceURLs.get(0);
  }
  
  public String getFirstVerb() {
    return this.verbs.get(0);
  }
  
  public String getLastNonResourceURL() {
    return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
  }
  
  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }
  
  public String getMatchingNonResourceURL(Predicate<String> predicate) {
      for (String item : nonResourceURLs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getNonResourceURL(int index) {
    return this.nonResourceURLs.get(index);
  }
  
  public List<String> getNonResourceURLs() {
    return this.nonResourceURLs;
  }
  
  public String getVerb(int index) {
    return this.verbs.get(index);
  }
  
  public List<String> getVerbs() {
    return this.verbs;
  }
  
  public boolean hasMatchingNonResourceURL(Predicate<String> predicate) {
      for (String item : nonResourceURLs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingVerb(Predicate<String> predicate) {
      for (String item : verbs) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNonResourceURLs() {
    return this.nonResourceURLs != null && !(this.nonResourceURLs.isEmpty());
  }
  
  public boolean hasVerbs() {
    return this.verbs != null && !(this.verbs.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(nonResourceURLs, verbs);
  }
  
  public A removeAllFromNonResourceURLs(Collection<String> items) {
    if (this.nonResourceURLs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.nonResourceURLs.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromVerbs(Collection<String> items) {
    if (this.verbs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.verbs.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromNonResourceURLs(String... items) {
    if (this.nonResourceURLs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.nonResourceURLs.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromVerbs(String... items) {
    if (this.verbs == null) {
      return (A) this;
    }
    for (String item : items) {
      this.verbs.remove(item);
    }
    return (A) this;
  }
  
  public A setToNonResourceURLs(int index,String item) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList();
    }
    this.nonResourceURLs.set(index, item);
    return (A) this;
  }
  
  public A setToVerbs(int index,String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList();
    }
    this.verbs.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(nonResourceURLs == null) && !(nonResourceURLs.isEmpty())) {
        sb.append("nonResourceURLs:");
        sb.append(nonResourceURLs);
        sb.append(",");
    }
    if (!(verbs == null) && !(verbs.isEmpty())) {
        sb.append("verbs:");
        sb.append(verbs);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNonResourceURLs(List<String> nonResourceURLs) {
    if (nonResourceURLs != null) {
        this.nonResourceURLs = new ArrayList();
        for (String item : nonResourceURLs) {
          this.addToNonResourceURLs(item);
        }
    } else {
      this.nonResourceURLs = null;
    }
    return (A) this;
  }
  
  public A withNonResourceURLs(String... nonResourceURLs) {
    if (this.nonResourceURLs != null) {
        this.nonResourceURLs.clear();
        _visitables.remove("nonResourceURLs");
    }
    if (nonResourceURLs != null) {
      for (String item : nonResourceURLs) {
        this.addToNonResourceURLs(item);
      }
    }
    return (A) this;
  }
  
  public A withVerbs(List<String> verbs) {
    if (verbs != null) {
        this.verbs = new ArrayList();
        for (String item : verbs) {
          this.addToVerbs(item);
        }
    } else {
      this.verbs = null;
    }
    return (A) this;
  }
  
  public A withVerbs(String... verbs) {
    if (this.verbs != null) {
        this.verbs.clear();
        _visitables.remove("verbs");
    }
    if (verbs != null) {
      for (String item : verbs) {
        this.addToVerbs(item);
      }
    }
    return (A) this;
  }
  
}