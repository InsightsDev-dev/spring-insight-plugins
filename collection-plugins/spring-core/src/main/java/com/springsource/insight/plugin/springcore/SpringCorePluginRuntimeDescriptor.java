package com.springsource.insight.plugin.springcore;

import com.springsource.insight.intercept.endpoint.EndPointAnalyzer;
import com.springsource.insight.intercept.plugin.PluginRuntimeDescriptor;

public class SpringCorePluginRuntimeDescriptor extends PluginRuntimeDescriptor {
    public static final String PLUGIN_NAME = "spring-core";
    
    @Override
    public EndPointAnalyzer[] getEndPointAnalyzers() {
        return null;
    }

    @Override
    public String getPluginName() {
        return PLUGIN_NAME;
    }

}
