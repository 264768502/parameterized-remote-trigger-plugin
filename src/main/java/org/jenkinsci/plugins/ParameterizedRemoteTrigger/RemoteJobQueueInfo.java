package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

/**
 * Class with the data that we need of one Remote Job Response
 *
 * @author Alejandra Ferreiro Vidal
 */
public class RemoteJobQueueInfo
{
  private boolean inQueue;
  private int queueId;
  private String queueLog;

  public RemoteJobQueueInfo(boolean inQueue, int queueId, String queueLog)
  {
    this.inQueue = inQueue;
    this.queueId = queueId;
    this.queueLog = queueLog;
  }

  public boolean getInQueue()
  {
    return inQueue;
  }

  public int getQueueId()
  {
    return queueId;
  }

  public String getQueueLog()
  {
    return queueLog;
  }
}
