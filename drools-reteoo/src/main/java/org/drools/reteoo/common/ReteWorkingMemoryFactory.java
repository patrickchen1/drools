package org.drools.reteoo.common;

import org.drools.core.SessionConfiguration;
import org.drools.core.common.InternalAgenda;
import org.drools.core.common.InternalFactHandle;
import org.drools.core.common.InternalRuleBase;
import org.drools.core.common.InternalWorkingMemory;
import org.drools.core.common.WorkingMemoryFactory;
import org.drools.core.event.AgendaEventSupport;
import org.drools.core.event.RuleEventListenerSupport;
import org.drools.core.event.WorkingMemoryEventSupport;
import org.drools.core.spi.FactHandleFactory;
import org.kie.api.runtime.Environment;

import java.io.Serializable;

public class ReteWorkingMemoryFactory implements WorkingMemoryFactory, Serializable {

    public InternalWorkingMemory createWorkingMemory(int id, InternalRuleBase ruleBase, SessionConfiguration config, Environment environment) {
        return new ReteWorkingMemory(id, ruleBase, false, config, environment);
    }

    public InternalWorkingMemory createWorkingMemory(int id, InternalRuleBase ruleBase, FactHandleFactory handleFactory, InternalFactHandle initialFactHandle, long propagationContext, SessionConfiguration config, InternalAgenda agenda, Environment environment) {
        return new ReteWorkingMemory(id, ruleBase, handleFactory, initialFactHandle, propagationContext, config, agenda, environment);
    }

    public InternalWorkingMemory createWorkingMemory(int id, InternalRuleBase ruleBase, FactHandleFactory handleFactory, InternalFactHandle initialFactHandle, long propagationContext, SessionConfiguration config, Environment environment, WorkingMemoryEventSupport workingMemoryEventSupport, AgendaEventSupport agendaEventSupport, RuleEventListenerSupport ruleEventListenerSupport, InternalAgenda agenda) {
        return new ReteWorkingMemory(id, ruleBase, handleFactory, initialFactHandle, propagationContext, config, environment, workingMemoryEventSupport, agendaEventSupport, ruleEventListenerSupport, agenda);
    }
}
