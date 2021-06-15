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

public interface V1LimitRangeSpecFluent<A extends io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToLimits(int index,io.kubernetes.client.openapi.models.V1LimitRangeItem item);
    public A setToLimits(int index,io.kubernetes.client.openapi.models.V1LimitRangeItem item);
    public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
    public A addAllToLimits(java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);
    public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items);
    public A removeAllFromLimits(java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items);
    public A removeMatchingFromLimits(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLimits instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> getLimits();
    public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> buildLimits();
    public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLimit(int index);
    public io.kubernetes.client.openapi.models.V1LimitRangeItem buildFirstLimit();
    public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLastLimit();
    public io.kubernetes.client.openapi.models.V1LimitRangeItem buildMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
    public java.lang.Boolean hasMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
    public A withLimits(java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> limits);
    public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits);
    public java.lang.Boolean hasLimits();
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimit();
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(io.kubernetes.client.openapi.models.V1LimitRangeItem item);
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(int index,io.kubernetes.client.openapi.models.V1LimitRangeItem item);
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLimit(int index);
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editFirstLimit();
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLastLimit();
    public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editMatchingLimit(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> predicate);
    public interface LimitsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LimitRangeItemFluent<io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<N>> {

            public N and();
            public N endLimit();    }


}
