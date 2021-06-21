package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.lang.Byte;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1CertificateSigningRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A withCertificate(byte... certificate);
    public byte[] getCertificate();
    public A addToCertificate(int index,java.lang.Byte item);
    public A setToCertificate(int index,java.lang.Byte item);
    public A addToCertificate(java.lang.Byte... items);
    public A addAllToCertificate(java.util.Collection<java.lang.Byte> items);
    public A removeFromCertificate(java.lang.Byte... items);
    public A removeAllFromCertificate(java.util.Collection<java.lang.Byte> items);
    public java.lang.Boolean hasCertificate();
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition item);
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> predicate);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
