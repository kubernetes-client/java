package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ContainerStateTerminatedFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getContainerID();
    public A withContainerID(java.lang.String containerID);
    public java.lang.Boolean hasContainerID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainerID instead.
     */
        public A withNewContainerID(java.lang.String original);
    public java.lang.Integer getExitCode();
    public A withExitCode(java.lang.Integer exitCode);
    public java.lang.Boolean hasExitCode();
    public java.time.OffsetDateTime getFinishedAt();
    public A withFinishedAt(java.time.OffsetDateTime finishedAt);
    public java.lang.Boolean hasFinishedAt();
    public java.lang.String getMessage();
    public A withMessage(java.lang.String message);
    public java.lang.Boolean hasMessage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMessage instead.
     */
        public A withNewMessage(java.lang.String original);
    public java.lang.String getReason();
    public A withReason(java.lang.String reason);
    public java.lang.Boolean hasReason();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReason instead.
     */
        public A withNewReason(java.lang.String original);
    public java.lang.Integer getSignal();
    public A withSignal(java.lang.Integer signal);
    public java.lang.Boolean hasSignal();
    public java.time.OffsetDateTime getStartedAt();
    public A withStartedAt(java.time.OffsetDateTime startedAt);
    public java.lang.Boolean hasStartedAt();
}
