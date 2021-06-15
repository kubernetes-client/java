package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1beta1CustomResourceDefinitionStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAcceptedNames instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames getAcceptedNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames buildAcceptedNames();
    public A withAcceptedNames(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames acceptedNames);
    public java.lang.Boolean hasAcceptedNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNames item);
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionCondition item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionConditionBuilder> predicate);
    public A addToStoredVersions(int index,java.lang.String item);
    public A setToStoredVersions(int index,java.lang.String item);
    public A addToStoredVersions(java.lang.String... items);
    public A addAllToStoredVersions(java.util.Collection<java.lang.String> items);
    public A removeFromStoredVersions(java.lang.String... items);
    public A removeAllFromStoredVersions(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getStoredVersions();
    public java.lang.String getStoredVersion(int index);
    public java.lang.String getFirstStoredVersion();
    public java.lang.String getLastStoredVersion();
    public java.lang.String getMatchingStoredVersion(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingStoredVersion(java.util.function.Predicate<java.lang.String> predicate);
    public A withStoredVersions(java.util.List<java.lang.String> storedVersions);
    public A withStoredVersions(java.lang.String... storedVersions);
    public java.lang.Boolean hasStoredVersions();
    public A addNewStoredVersion(java.lang.String original);
    public interface AcceptedNamesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionNamesFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>> {

            public N and();
            public N endAcceptedNames();    }


    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionConditionFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
