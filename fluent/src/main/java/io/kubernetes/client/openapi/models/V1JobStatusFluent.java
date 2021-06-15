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
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1JobStatusFluent<A extends io.kubernetes.client.openapi.models.V1JobStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getActive();
    public A withActive(java.lang.Integer active);
    public java.lang.Boolean hasActive();
    public java.time.OffsetDateTime getCompletionTime();
    public A withCompletionTime(java.time.OffsetDateTime completionTime);
    public java.lang.Boolean hasCompletionTime();
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1JobCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1JobCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1JobCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1JobCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1JobCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1JobCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1JobCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1JobCondition item);
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1JobCondition item);
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate);
    public java.lang.Integer getFailed();
    public A withFailed(java.lang.Integer failed);
    public java.lang.Boolean hasFailed();
    public java.time.OffsetDateTime getStartTime();
    public A withStartTime(java.time.OffsetDateTime startTime);
    public java.lang.Boolean hasStartTime();
    public java.lang.Integer getSucceeded();
    public A withSucceeded(java.lang.Integer succeeded);
    public java.lang.Boolean hasSucceeded();
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JobConditionFluent<io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}
