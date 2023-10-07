public class Activity {

    private String description;
    private Boolean status;

    public Activity(String desc){
        this.description = desc;
        this.status = false;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted() {
        this.status = true;
    }

}
