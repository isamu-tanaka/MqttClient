// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package test.proxies;

/**
 * 
 */
public class MqttMessages
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mqttMessagesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Test.MqttMessages";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Topic("Topic"),
		Timestamp("Timestamp"),
		Payload("Payload");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MqttMessages(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Test.MqttMessages"));
	}

	protected MqttMessages(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mqttMessagesMendixObject)
	{
		if (mqttMessagesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Test.MqttMessages", mqttMessagesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Test.MqttMessages");

		this.mqttMessagesMendixObject = mqttMessagesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MqttMessages.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static test.proxies.MqttMessages initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return test.proxies.MqttMessages.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static test.proxies.MqttMessages initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new test.proxies.MqttMessages(context, mendixObject);
	}

	public static test.proxies.MqttMessages load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return test.proxies.MqttMessages.initialize(context, mendixObject);
	}

	public static java.util.List<test.proxies.MqttMessages> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<test.proxies.MqttMessages> result = new java.util.ArrayList<test.proxies.MqttMessages>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Test.MqttMessages" + xpathConstraint))
			result.add(test.proxies.MqttMessages.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Topic
	 */
	public final String getTopic()
	{
		return getTopic(getContext());
	}

	/**
	 * @param context
	 * @return value of Topic
	 */
	public final String getTopic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Topic.toString());
	}

	/**
	 * Set value of Topic
	 * @param topic
	 */
	public final void setTopic(String topic)
	{
		setTopic(getContext(), topic);
	}

	/**
	 * Set value of Topic
	 * @param context
	 * @param topic
	 */
	public final void setTopic(com.mendix.systemwideinterfaces.core.IContext context, String topic)
	{
		getMendixObject().setValue(context, MemberNames.Topic.toString(), topic);
	}

	/**
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp()
	{
		return getTimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Timestamp.toString());
	}

	/**
	 * Set value of Timestamp
	 * @param timestamp
	 */
	public final void setTimestamp(java.util.Date timestamp)
	{
		setTimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of Timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.Timestamp.toString(), timestamp);
	}

	/**
	 * @return value of Payload
	 */
	public final String getPayload()
	{
		return getPayload(getContext());
	}

	/**
	 * @param context
	 * @return value of Payload
	 */
	public final String getPayload(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Payload.toString());
	}

	/**
	 * Set value of Payload
	 * @param payload
	 */
	public final void setPayload(String payload)
	{
		setPayload(getContext(), payload);
	}

	/**
	 * Set value of Payload
	 * @param context
	 * @param payload
	 */
	public final void setPayload(com.mendix.systemwideinterfaces.core.IContext context, String payload)
	{
		getMendixObject().setValue(context, MemberNames.Payload.toString(), payload);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mqttMessagesMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final test.proxies.MqttMessages that = (test.proxies.MqttMessages) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Test.MqttMessages";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}