import java.net.URL; 
import java.util.List; 

public class Record {

	URL site_url; 
	int type; 
	List<Pair> additional_info;
	
	public URL getSite_url() {
		return site_url;
	}
	public void setSite_url(URL siteUrl) {
		site_url = siteUrl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Pair> getAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(List<Pair> additionalInfo) {
		additional_info = additionalInfo;
	} 
	
}
