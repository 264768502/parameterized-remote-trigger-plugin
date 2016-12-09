package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

import org.jenkinsci.plugins.workflow.cps.CpsScript;
import org.jenkinsci.plugins.workflow.cps.GlobalVariable;

import hudson.EnvVars;
import hudson.Extension;

/**
 * This Global Variable provides all payload parameters of the event which triggered the Pipeline.
 *
 * (Copied from workflow-cps plugin)
 */
@Extension(optional = true)
public class PipelineEnvGlobalVariable extends GlobalVariable
{

  @Override
  public String getName()
  {
    return "parameterizedRemoteTriggerEnv";
  }

  @Override
  public Object getValue(CpsScript script) throws Exception
  {
    EnvVars env = new EnvVars();
    if (script == null || script.$build() == null) {
      return env;
    }
    BuildInfoExporterAction action = script.$build().getAction(BuildInfoExporterAction.class);
    if (action == null) {
      return env;
    }
    action.buildEnvVars(null, env);
    return env;
  }

}
