package entites.createChannel;

import entites.BaseResponse;

public class CreateChannelResponse extends BaseResponse {
	 private Channel channel;

	    private String ok;

	    public Channel getChannel ()
	    {
	        return channel;
	    }

	    public void setChannel (Channel channel)
	    {
	        this.channel = channel;
	    }

	    public String getOk ()
	    {
	        return ok;
	    }

	    public void setOk (String ok)
	    {
	        this.ok = ok;
	    }


}
