package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1ContainerStateFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRunning instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ContainerStateRunning getRunning();
    public io.kubernetes.client.openapi.models.V1ContainerStateRunning buildRunning();
    public A withRunning(io.kubernetes.client.openapi.models.V1ContainerStateRunning running);
    public java.lang.Boolean hasRunning();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> withNewRunning();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> withNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item);
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editRunning();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editOrNewRunning();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<A> editOrNewRunningLike(io.kubernetes.client.openapi.models.V1ContainerStateRunning item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTerminated instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ContainerStateTerminated getTerminated();
    public io.kubernetes.client.openapi.models.V1ContainerStateTerminated buildTerminated();
    public A withTerminated(io.kubernetes.client.openapi.models.V1ContainerStateTerminated terminated);
    public java.lang.Boolean hasTerminated();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> withNewTerminated();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item);
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editTerminated();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminated();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(io.kubernetes.client.openapi.models.V1ContainerStateTerminated item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildWaiting instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ContainerStateWaiting getWaiting();
    public io.kubernetes.client.openapi.models.V1ContainerStateWaiting buildWaiting();
    public A withWaiting(io.kubernetes.client.openapi.models.V1ContainerStateWaiting waiting);
    public java.lang.Boolean hasWaiting();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> withNewWaiting();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> withNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item);
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editWaiting();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editOrNewWaiting();
    public io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(io.kubernetes.client.openapi.models.V1ContainerStateWaiting item);
    public interface RunningNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<io.kubernetes.client.openapi.models.V1ContainerStateFluent.RunningNested<N>> {

            public N and();
            public N endRunning();    }


    public interface TerminatedNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluent<io.kubernetes.client.openapi.models.V1ContainerStateFluent.TerminatedNested<N>> {

            public N and();
            public N endTerminated();    }


    public interface WaitingNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ContainerStateWaitingFluent<io.kubernetes.client.openapi.models.V1ContainerStateFluent.WaitingNested<N>> {

            public N and();
            public N endWaiting();    }


}
