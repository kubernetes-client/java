package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V2alpha1CronJobStatusFluent<A extends io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToActive(int index,io.kubernetes.client.openapi.models.V1ObjectReference item);
    public A setToActive(int index,io.kubernetes.client.openapi.models.V1ObjectReference item);
    public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);
    public A addAllToActive(java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);
    public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items);
    public A removeAllFromActive(java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);
    public A removeMatchingFromActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildActive instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> getActive();
    public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildActive();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildActive(int index);
    public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstActive();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildLastActive();
    public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate);
    public java.lang.Boolean hasMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate);
    public A withActive(java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> active);
    public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active);
    public java.lang.Boolean hasActive();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> addNewActive();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(int index,io.kubernetes.client.openapi.models.V1ObjectReference item);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editActive(int index);
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editFirstActive();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editLastActive();
    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate);
    public java.time.OffsetDateTime getLastScheduleTime();
    public A withLastScheduleTime(java.time.OffsetDateTime lastScheduleTime);
    public java.lang.Boolean hasLastScheduleTime();
    public interface ActiveNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<N>> {

            public N and();
            public N endActive();    }


}
