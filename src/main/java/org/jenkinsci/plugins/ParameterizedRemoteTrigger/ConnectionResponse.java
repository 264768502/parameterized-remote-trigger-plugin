package org.jenkinsci.plugins.ParameterizedRemoteTrigger;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class ConnectionResponse
{
  private Map<String,List<String>> header;
  private JSONObject response;

  public ConnectionResponse(Map<String,List<String>> header, JSONObject response){
    this.header = header;
    this.response = response;
  }

  public Map<String,List<String>> getHeader()
  {
    return header;
  }

  public JSONObject getResponse() {
    return response;
  }

  public String getLocation()
  {
    try {
      return header.get("Location").get(0);
    } catch (Exception ex) {
      return null;
    }
  }
}
