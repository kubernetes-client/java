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

public interface V1ComponentStatusFluent<A extends io.kubernetes.client.openapi.models.V1ComponentStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ComponentCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1ComponentCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1ComponentCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1ComponentCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1ComponentCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1ComponentCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1ComponentCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1ComponentCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1ComponentCondition item);
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1ComponentCondition item);
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ComponentConditionBuilder> predicate);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ComponentConditionFluent<io.kubernetes.client.openapi.models.V1ComponentStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1ComponentStatusFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


}
