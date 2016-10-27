// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mqttclient.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import mqttclient.impl.MqttConnector;

public class MqttPublish extends CustomJavaAction<Boolean>
{
	private String BrokerHost;
	private Long BrokerPort;
	private String Username;
	private String Password;
	private String TopicName;
	private String Payload;
	private String CA;
	private String ClientCertificate;
	private String ClientKey;
	private String CertificatePassword;

	public MqttPublish(IContext context, String BrokerHost, Long BrokerPort, String Username, String Password, String TopicName, String Payload, String CA, String ClientCertificate, String ClientKey, String CertificatePassword)
	{
		super(context);
		this.BrokerHost = BrokerHost;
		this.BrokerPort = BrokerPort;
		this.Username = Username;
		this.Password = Password;
		this.TopicName = TopicName;
		this.Payload = Payload;
		this.CA = CA;
		this.ClientCertificate = ClientCertificate;
		this.ClientKey = ClientKey;
		this.CertificatePassword = CertificatePassword;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        MqttConnector handler = new MqttConnector(Core.getLogger("MqttConnector"));
        try {
            handler.publish(this.BrokerHost, this.BrokerPort, this.TopicName, this.Payload, this.CA, this.ClientCertificate, this.ClientKey, this.CertificatePassword, this.Username, this.Password);
            return true;
        } catch (Exception e) {
            return false;
        }
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "MqttPublish";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
