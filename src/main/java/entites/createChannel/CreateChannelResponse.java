package entites.createChannel;

import entites.BaseResponse;

public class CreateChannelResponse extends BaseResponse {
	 private Channel channel;

	    private boolean ok;
	    private String error;

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

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}


}
