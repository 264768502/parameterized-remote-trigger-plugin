package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

/**
 * Class with the data that we need of one Remote Build Queue's Response
 *
 * @author Alejandra Ferreiro Vidal
 */
public class RemoteJob
{
  final private int jobNumber;
  final private String jobURL;

  public RemoteJob(int jobNumber, String jobURL)
  {
    this.jobNumber = jobNumber;
    this.jobURL = jobURL;
  }

  public int getBuildNumber()
  {
    return jobNumber;
  }

  public String getURL()
  {
    return jobURL;
  }

}
