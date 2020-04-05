package properties;

import utils.PropertiesReader;

public class SlackAPIs {
	private static final PropertiesReader propertiesReader = new PropertiesReader();

    private static final String slackAPIhost = propertiesReader.getSlackApiHost();
   
	public static final String createChannelURL=String.format("%s/channels.create",slackAPIhost);
	public static final String joinChannelURL=String.format("%s/channels.join",slackAPIhost);
	public static final String channelListURL=String.format("%s/channels.list",slackAPIhost);
	public static final String renameChannelURL=String.format("%s/channels.rename",slackAPIhost);
	public static final String archiveChannelURL=String.format("%s/channels.archive",slackAPIhost);
}


