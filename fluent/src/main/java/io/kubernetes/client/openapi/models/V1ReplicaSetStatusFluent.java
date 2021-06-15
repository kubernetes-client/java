package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1ReplicaSetStatusFluent<A extends io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getAvailableReplicas();
    public A withAvailableReplicas(java.lang.Integer availableReplicas);
    public java.lang.Boolean hasAvailableReplicas();
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1ReplicaSetCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1ReplicaSetCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1ReplicaSetCondition item);
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1ReplicaSetCondition item);
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> predicate);
    public java.lang.Integer getFullyLabeledReplicas();
    public A withFullyLabeledReplicas(java.lang.Integer fullyLabeledReplicas);
    public java.lang.Boolean hasFullyLabeledReplicas();
    public java.lang.Long getObservedGeneration();
    public A withObservedGeneration(java.lang.Long observedGeneration);
    public java.lang.Boolean hasObservedGeneration();
    public java.lang.Integer getReadyReplicas();
    public A withReadyReplicas(java.lang.Integer readyReplicas);
    public java.lang.Boolean hasReadyReplicas();
    public java.lang.Integer getReplicas();
    public A withReplicas(java.lang.Integer replicas);
    public java.lang.Boolean hasReplicas();
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluent<io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
