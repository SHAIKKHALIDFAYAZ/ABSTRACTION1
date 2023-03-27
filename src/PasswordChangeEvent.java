import java.sql.Timestamp;
public class PasswordChangeEvent implements Event{

    private final Long createdTimestamp;
    private final String id;

    public PasswordChangeEvent(String id){
        this.id=id;
        this.createdTimestamp=new Timestamp(System.currentTimeMillis()).getTime();
    }
    @Override
    public Long getTimeStamp() {
        return null;
    }

    @Override
    public void process() {

    }
}
