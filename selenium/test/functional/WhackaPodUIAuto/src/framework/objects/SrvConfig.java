package framework.objects;

import org.apache.log4j.Logger;

/**
* Date : 2017-03-28
* Owner : lixia.yuan
* @author lixia.yuan
*/

public class SrvConfig{
	
	private String UIUrl;
				
	public static final Logger logger = Logger.getLogger(SrvConfig.class);
	
	public void setUIUrl(String UIUrl) {
		this.UIUrl = UIUrl;	
	}
	
	public String getUIUrl() {	
		return this.UIUrl;
	}
}
