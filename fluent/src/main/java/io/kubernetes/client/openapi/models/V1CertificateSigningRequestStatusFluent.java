package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Byte;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CertificateSigningRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<A>> extends BaseFluent<A>{

  private List<Byte> certificate;
  private ArrayList<V1CertificateSigningRequestConditionBuilder> conditions;

  public V1CertificateSigningRequestStatusFluent() {
  }
  
  public V1CertificateSigningRequestStatusFluent(V1CertificateSigningRequestStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToCertificate(Collection<Byte> items) {
    if (this.certificate == null) {
      this.certificate = new ArrayList();
    }
    for (Byte item : items) {
      this.certificate.add(item);
    }
    return (A) this;
  }
  
  public A addAllToConditions(Collection<V1CertificateSigningRequestCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1CertificateSigningRequestCondition item : items) {
        V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1CertificateSigningRequestCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToCertificate(Byte... items) {
    if (this.certificate == null) {
      this.certificate = new ArrayList();
    }
    for (Byte item : items) {
      this.certificate.add(item);
    }
    return (A) this;
  }
  
  public A addToCertificate(int index,Byte item) {
    if (this.certificate == null) {
      this.certificate = new ArrayList();
    }
    this.certificate.add(index, item);
    return (A) this;
  }
  
  public A addToConditions(V1CertificateSigningRequestCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1CertificateSigningRequestCondition item : items) {
        V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1CertificateSigningRequestCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1CertificateSigningRequestCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1CertificateSigningRequestCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1CertificateSigningRequestCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1CertificateSigningRequestCondition buildMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
      for (V1CertificateSigningRequestConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1CertificateSigningRequestStatus instance) {
    instance = instance != null ? instance : new V1CertificateSigningRequestStatus();
    if (instance != null) {
        this.withCertificate(instance.getCertificate());
        this.withConditions(instance.getConditions());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
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
    V1CertificateSigningRequestStatusFluent that = (V1CertificateSigningRequestStatusFluent) o;
    if (!(Objects.equals(certificate, that.certificate))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    return true;
  }
  
  public byte[] getCertificate() {
    int size = certificate != null ? certificate.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : certificate) {
      result[index++] = item;
    }
    return result;
  }
  
  public boolean hasCertificate() {
    return this.certificate != null && !(this.certificate.isEmpty());
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
      for (V1CertificateSigningRequestConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(certificate, conditions);
  }
  
  public A removeAllFromCertificate(Collection<Byte> items) {
    if (this.certificate == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.certificate.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromConditions(Collection<V1CertificateSigningRequestCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1CertificateSigningRequestCondition item : items) {
        V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromCertificate(Byte... items) {
    if (this.certificate == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.certificate.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1CertificateSigningRequestCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1CertificateSigningRequestCondition item : items) {
        V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1CertificateSigningRequestConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1CertificateSigningRequestConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1CertificateSigningRequestCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToCertificate(int index,Byte item) {
    if (this.certificate == null) {
      this.certificate = new ArrayList();
    }
    this.certificate.set(index, item);
    return (A) this;
  }
  
  public A setToConditions(int index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(certificate == null) && !(certificate.isEmpty())) {
        sb.append("certificate:");
        sb.append(certificate);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCertificate(byte... certificate) {
    if (this.certificate != null) {
        this.certificate.clear();
        _visitables.remove("certificate");
    }
    if (certificate != null) {
      for (byte item : certificate) {
        this.addToCertificate(item);
      }
    }
    return (A) this;
  }
  
  public A withConditions(List<V1CertificateSigningRequestCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1CertificateSigningRequestCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1CertificateSigningRequestCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1CertificateSigningRequestCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  public class ConditionsNested<N> extends V1CertificateSigningRequestConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1CertificateSigningRequestConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1CertificateSigningRequestCondition item) {
      this.index = index;
      this.builder = new V1CertificateSigningRequestConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CertificateSigningRequestStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}