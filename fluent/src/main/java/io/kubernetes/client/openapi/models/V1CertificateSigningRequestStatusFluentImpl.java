package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CertificateSigningRequestStatusFluentImpl<A extends V1CertificateSigningRequestStatusFluent<A>> extends BaseFluent<A> implements V1CertificateSigningRequestStatusFluent<A>{
  public V1CertificateSigningRequestStatusFluentImpl() {
  }
  public V1CertificateSigningRequestStatusFluentImpl(V1CertificateSigningRequestStatus instance) {
    this.withCertificate(instance.getCertificate());

    this.withConditions(instance.getConditions());

  }
  private List<Byte> certificate;
  private ArrayList<V1CertificateSigningRequestConditionBuilder> conditions;
  public A withCertificate(byte... certificate) {
    if (this.certificate != null) {this.certificate.clear();}
    if (certificate != null) {for (byte item :certificate){ this.addToCertificate(item);}} return (A) this;
  }
  public byte[] getCertificate() {
    //This needs to work with primitives, so we use arrays.
int size = certificate != null ? certificate.size() : 0;
byte[] result = new byte[size];
if (size == 0) {
   return result;
}
int index = 0;
for (byte item : certificate) {
    result[index++]=item;
}
return result;

  }
  public A addToCertificate(Integer index,Byte item) {
    if (this.certificate == null) {this.certificate =  new ArrayList<Byte>();}
    this.certificate.add(index, item);
    return (A)this;
  }
  public A setToCertificate(Integer index,Byte item) {
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
    for (Byte item : items) {if (this.certificate!= null){ this.certificate.remove(item);}} return (A)this;
  }
  public A removeAllFromCertificate(Collection<Byte> items) {
    for (Byte item : items) {if (this.certificate!= null){ this.certificate.remove(item);}} return (A)this;
  }
  public Boolean hasCertificate() {
    return certificate != null && !certificate.isEmpty();
  }
  public A addToConditions(Integer index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1CertificateSigningRequestCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CertificateSigningRequestConditionBuilder>();}
    V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
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
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1CertificateSigningRequestCondition> items) {
    for (V1CertificateSigningRequestCondition item : items) {V1CertificateSigningRequestConditionBuilder builder = new V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1CertificateSigningRequestCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1CertificateSigningRequestCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1CertificateSigningRequestCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1CertificateSigningRequestCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1CertificateSigningRequestCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1CertificateSigningRequestCondition buildMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    for (V1CertificateSigningRequestConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
    for (V1CertificateSigningRequestConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1CertificateSigningRequestCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1CertificateSigningRequestCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1CertificateSigningRequestCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewConditionLike(V1CertificateSigningRequestCondition item) {
    return new V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1CertificateSigningRequestCondition item) {
    return new V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1CertificateSigningRequestConditionBuilder> predicate) {
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
    V1CertificateSigningRequestStatusFluentImpl that = (V1CertificateSigningRequestStatusFluentImpl) o;
    if (certificate != null ? !certificate.equals(that.certificate) :that.certificate != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
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
  class ConditionsNestedImpl<N> extends V1CertificateSigningRequestConditionFluentImpl<V1CertificateSigningRequestStatusFluent.ConditionsNested<N>> implements V1CertificateSigningRequestStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1CertificateSigningRequestCondition item) {
      this.index = index;
      this.builder = new V1CertificateSigningRequestConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1CertificateSigningRequestConditionBuilder(this);
    }
    V1CertificateSigningRequestConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CertificateSigningRequestStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}