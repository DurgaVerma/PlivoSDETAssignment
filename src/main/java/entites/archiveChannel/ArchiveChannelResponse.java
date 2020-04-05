package entites.archiveChannel;

import entites.BaseResponse;

public class ArchiveChannelResponse extends BaseResponse {
	 private boolean ok;

	    private String error;

	    public boolean getOk ()
	    {
	        return ok;
	    }

	    public void setOk (boolean ok)
	    {
	        this.ok = ok;
	    }

	    public String getError ()
	    {
	        return error;
	    }

	    public void setError (String error)
	    {
	        this.error = error;
	    }

}
