import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
public class myConfiguration extends Configuration{

    private String url;
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
