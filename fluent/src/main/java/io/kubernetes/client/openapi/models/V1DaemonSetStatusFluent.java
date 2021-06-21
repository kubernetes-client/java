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

public interface V1DaemonSetStatusFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getCollisionCount();
    public A withCollisionCount(java.lang.Integer collisionCount);
    public java.lang.Boolean hasCollisionCount();
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1DaemonSetCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1DaemonSetCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1DaemonSetCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1DaemonSetCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1DaemonSetCondition item);
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1DaemonSetCondition item);
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder> predicate);
    public java.lang.Integer getCurrentNumberScheduled();
    public A withCurrentNumberScheduled(java.lang.Integer currentNumberScheduled);
    public java.lang.Boolean hasCurrentNumberScheduled();
    public java.lang.Integer getDesiredNumberScheduled();
    public A withDesiredNumberScheduled(java.lang.Integer desiredNumberScheduled);
    public java.lang.Boolean hasDesiredNumberScheduled();
    public java.lang.Integer getNumberAvailable();
    public A withNumberAvailable(java.lang.Integer numberAvailable);
    public java.lang.Boolean hasNumberAvailable();
    public java.lang.Integer getNumberMisscheduled();
    public A withNumberMisscheduled(java.lang.Integer numberMisscheduled);
    public java.lang.Boolean hasNumberMisscheduled();
    public java.lang.Integer getNumberReady();
    public A withNumberReady(java.lang.Integer numberReady);
    public java.lang.Boolean hasNumberReady();
    public java.lang.Integer getNumberUnavailable();
    public A withNumberUnavailable(java.lang.Integer numberUnavailable);
    public java.lang.Boolean hasNumberUnavailable();
    public java.lang.Long getObservedGeneration();
    public A withObservedGeneration(java.lang.Long observedGeneration);
    public java.lang.Boolean hasObservedGeneration();
    public java.lang.Integer getUpdatedNumberScheduled();
    public A withUpdatedNumberScheduled(java.lang.Integer updatedNumberScheduled);
    public java.lang.Boolean hasUpdatedNumberScheduled();
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DaemonSetConditionFluent<io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
