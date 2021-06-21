package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1CertificateSigningRequestStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<A> {

    private java.util.List<java.lang.Byte> certificate;
    private java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> conditions;

    public V1CertificateSigningRequestStatusFluentImpl() {
    }

    public V1CertificateSigningRequestStatusFluentImpl(io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus instance) {
        this.withCertificate(instance.getCertificate());
        
        this.withConditions(instance.getConditions());
    }

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

    public A addToCertificate(int index,java.lang.Byte item) {
        if (this.certificate == null) {this.certificate =  new java.util.ArrayList<java.lang.Byte>();}
        this.certificate.add(index, item);
        return (A)this;
    }

    public A setToCertificate(int index,java.lang.Byte item) {
        if (this.certificate == null) {this.certificate =  new java.util.ArrayList<java.lang.Byte>();}
        this.certificate.set(index, item); return (A)this;
    }

    public A addToCertificate(java.lang.Byte... items) {
        if (this.certificate == null) {this.certificate =  new java.util.ArrayList<java.lang.Byte>();}
        for (java.lang.Byte item : items) {this.certificate.add(item);} return (A)this;
    }

    public A addAllToCertificate(java.util.Collection<java.lang.Byte> items) {
        if (this.certificate == null) {this.certificate =  new java.util.ArrayList<java.lang.Byte>();}
        for (java.lang.Byte item : items) {this.certificate.add(item);} return (A)this;
    }

    public A removeFromCertificate(java.lang.Byte... items) {
        for (java.lang.Byte item : items) {if (this.certificate!= null){ this.certificate.remove(item);}} return (A)this;
    }

    public A removeAllFromCertificate(java.util.Collection<java.lang.Byte> items) {
        for (java.lang.Byte item : items) {if (this.certificate!= null){ this.certificate.remove(item);}} return (A)this;
    }

    public java.lang.Boolean hasCertificate() {
        return certificate != null && !certificate.isEmpty();
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item : items) {io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item : items) {io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items) {
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item : items) {io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> items) {
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item : items) {io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item) {
        return new io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item) {
        return new io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public boolean equals(java.lang.Object o) {
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

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluentImpl<io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1CertificateSigningRequestStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
