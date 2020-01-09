package com.inductiveautomation.erp.inforM3;


import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.gateway.model.AbstractGatewayModuleHook;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;

public class GatewayHook extends AbstractGatewayModuleHook {

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        manager.addScriptModule("system.m3", M3ScriptingFunctions.class);
    }

    @Override
    public void setup(GatewayContext arg0) {
        // Do nothing
    }

    @Override
    public void startup(LicenseState arg0) {
        // Do nothing
    }

    @Override
    public void shutdown() {
        // Do nothing
    }

}
