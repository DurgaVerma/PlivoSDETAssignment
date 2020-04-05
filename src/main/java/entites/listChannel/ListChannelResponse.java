package entites.listChannel;

import entites.BaseResponse;

public class ListChannelResponse extends BaseResponse{
	
	private Channels[] channels;

    private boolean ok;
    private String error;

    public Channels[] getChannels ()
    {
        return channels;
    }

    public void setChannel (Channels[] channels)
    {
        this.channels = channels;
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
