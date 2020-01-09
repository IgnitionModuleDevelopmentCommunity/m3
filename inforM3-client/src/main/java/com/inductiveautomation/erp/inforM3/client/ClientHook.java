package com.inductiveautomation.erp.inforM3.client;

import com.inductiveautomation.erp.inforM3.M3ScriptingFunctions;
import com.inductiveautomation.vision.api.client.AbstractClientModuleHook;
import com.inductiveautomation.ignition.common.script.ScriptManager;

public class ClientHook extends AbstractClientModuleHook {

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        manager.addScriptModule("system.m3", M3ScriptingFunctions.class);
    }

}
