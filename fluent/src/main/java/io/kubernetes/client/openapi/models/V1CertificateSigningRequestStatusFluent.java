package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CertificateSigningRequestStatusFluent<A extends V1CertificateSigningRequestStatusFluent<A>> extends BaseFluent<A>{
  public V1CertificateSigningRequestStatusFluent() {
  }
  
  public V1CertificateSigningRequestStatusFluent(V1CertificateSigningRequestStatus instance) {
    this.copyInstance(instance);
  }
  private List<Byte> certificate;
  private ArrayList<V1CertificateSigningRequestConditionBuilder> conditions;
  
  protected void copyInstance(V1CertificateSigningRequestStatus instance) {
    instance = (instance != null ? instance : new V1CertificateSigningRequestStatus());
    if (instance != null) {
          this.withCertificate(instance.getCertificate());
          this.withConditions(instance.getConditions());
        }
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
  
  public byte[] getCertificate() {
    int size = certificate != null ? certificate.size() : 0;;
    byte[] result = new byte[size];;
    if (size == 0) {
      return result;
    }
    int index = 0;;
    for (byte item : certificate) {
      result[index++] = item;
    }
    return result;
  }
  
  public A addToCertificate(int index,Byte item) {
    if (this.certificate == null) {this.certificate =  new ArrayList<Byte>();}
    this.certificate.add(index, item);
    return (A)this;
  }
  
  public A setToCertificate(int index,Byte item) {
    if (this.certificate == null) {this.certificate =  new ArrayList<Byte>();}
    this.certificate.set(index, item); return (A)this;
  }
  
  public A addToCertificate(java.lang.Byte... items) {
    if (this.certificate == null) {this.certificate =  new ArrayList<Byte>();}
    for (Byte item : items) {this.certificate.add(item);} return (A)this;
  }
  
  public A addAllToCertificate(Collection<Byte> items) {
    if (this.certificate == null) {this.certificate =  new ArrayList<Byte>();}
    for (Byte item : items) {this.certificate.add(item);} return (A)this;
  }
  
  public A removeFromCertificate(java.lang.Byte... items) {
    if (this.certificate == null) return (A)this;
    for (Byte item : items) { this.certificate.remove(item);} return (A)this;
  }
  
  public A removeAllFromCertificate(Collection<Byte> items) {
    if (this.certificate == null) return (A)this;
    for (Byte item : items) { this.certificate.remove(item);} return (A)this;
  }
  
  public boolean hasCertificate() {
    return this.certificate != null && !this.certificate.isEmpty();
  }
  
  public A addToConditions(int index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1CertificateSigningRequestCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1CertificateSigningRequestCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1CertificateSigningRequestConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1CertificateSigningRequestConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1CertificateSigningRequestCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1CertificateSigningRequestCondition buildCondition(int index) {
    return this.conditions.get(index).build();
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
  
  public boolean hasMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
      for (V1CertificateSigningRequestConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... conditions) {
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
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1CertificateSigningRequestCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1CertificateSigningRequestCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CertificateSigningRequestStatusFluent that = (V1CertificateSigningRequestStatusFluent) o;
    if (!java.util.Objects.equals(certificate, that.certificate)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(certificate,  conditions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (certificate != null && !certificate.isEmpty()) { sb.append("certificate:"); sb.append(certificate + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1CertificateSigningRequestConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1CertificateSigningRequestCondition item) {
      this.index = index;
      this.builder = new V1CertificateSigningRequestConditionBuilder(this, item);
    }
    V1CertificateSigningRequestConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1CertificateSigningRequestStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}