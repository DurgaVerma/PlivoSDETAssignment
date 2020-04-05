package entites.joinChannel;

import entites.BaseResponse;
public class JoinChannelResponse extends BaseResponse{
	 private String already_in_channel;

	    private Channel channel;

	    private boolean ok;

	    public String getAlready_in_channel ()
	    {
	        return already_in_channel;
	    }

	    public void setAlready_in_channel (String already_in_channel)
	    {
	        this.already_in_channel = already_in_channel;
	    }

	    public Channel getChannel ()
	    {
	        return channel;
	    }

	    public void setChannel (Channel channel)
	    {
	        this.channel = channel;
	    }

	    public boolean getOk ()
	    {
	        return ok;
	    }

	    public void setOk (boolean ok)
	    {
	        this.ok = ok;
	    }


}
