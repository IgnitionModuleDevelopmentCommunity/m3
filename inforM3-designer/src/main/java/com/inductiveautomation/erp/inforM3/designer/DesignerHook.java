package com.inductiveautomation.erp.inforM3.designer;

import com.inductiveautomation.erp.inforM3.M3ScriptingFunctions;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.designer.model.AbstractDesignerModuleHook;

public class DesignerHook extends AbstractDesignerModuleHook {

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        manager.addScriptModule("system.m3", M3ScriptingFunctions.class);
    }

}
