import com.fasterxml.jackson.annotation.JsonProperty;

public class FiboResult {
    public String fibonacci,sorted;

    public FiboResult(String fibonacci,String sorted){
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    @JsonProperty
    public String getFibonacci(){
        return this.fibonacci;
    }
    @JsonProperty
    public void setFibonacci(String fibonacci){
        this.fibonacci = fibonacci;
    }
    @JsonProperty
    public  String getSorted(){
        return sorted;
    }
    @JsonProperty
    public void  setSorted(String sorted){
        this.sorted = sorted;
    }

    @Override
    public String toString() {
        return "Response{" + "fibonacci :" + this.fibonacci + "," + "sorted :" + this.sorted + "}";
    }
}
