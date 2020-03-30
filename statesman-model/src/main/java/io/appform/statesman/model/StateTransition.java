package io.appform.statesman.model;

import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateTransition {

    @Setter
    String id;

    String fromState;

    boolean active;

    @Valid
    EvalRule rule;

    @Valid
    State toState;

    @NotEmpty
    String action;
}
