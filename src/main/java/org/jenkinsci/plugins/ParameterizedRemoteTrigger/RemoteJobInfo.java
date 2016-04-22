package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

/**
 * Class with the data that we need of one Remote Build Queue's Response
 *
 * @author Alejandra Ferreiro Vidal
 */
public class RemoteJobInfo
{
  private int jobNumber;
  private String jobURL;

  public RemoteJobInfo(int jobNumber, String jobURL)
  {
    this.jobNumber = jobNumber;
    this.jobURL = jobURL;
  }

  public int getNumber()
  {
    return jobNumber;
  }

  public String getURL()
  {
    return jobURL;
  }
}
